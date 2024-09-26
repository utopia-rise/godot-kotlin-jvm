package godot.annotation.processor.compiler

import com.google.devtools.ksp.symbol.KSPropertyDeclaration
import godot.annotation.processor.GodotKotlinSymbolProcessor
import godot.entrygenerator.exceptions.EntryGeneratorException
import org.jetbrains.kotlin.com.intellij.openapi.vfs.StandardFileSystems
import org.jetbrains.kotlin.com.intellij.openapi.vfs.VirtualFile
import org.jetbrains.kotlin.com.intellij.openapi.vfs.VirtualFileManager
import org.jetbrains.kotlin.com.intellij.psi.PsiClass
import org.jetbrains.kotlin.com.intellij.psi.PsiClassOwner
import org.jetbrains.kotlin.com.intellij.psi.PsiExpression
import org.jetbrains.kotlin.com.intellij.psi.PsiJavaFile
import org.jetbrains.kotlin.com.intellij.psi.PsiManager
import org.jetbrains.kotlin.extensions.PreprocessedFileCreator
import org.jetbrains.kotlin.idea.KotlinFileType
import org.jetbrains.kotlin.psi.KtClass
import org.jetbrains.kotlin.psi.KtExpression
import org.jetbrains.kotlin.psi.KtFile
import java.io.File

/**
 * Provides default value template string and arguments ready to go for kotlin poet
 *
 * Abstracted here rather than in the entry gen to keep it independent of compiler and psi classes
 */
internal object PsiProvider {
    private val psiFiles by lazy { providePsiFiles() }
    private val ktClasses by lazy {
        psiFiles
            .flatMap { psiFile ->
                psiFile
                    .children
                    .filterIsInstance<KtClass>()
            }
    }
    private val javaClasses by lazy {
        psiFiles
            .flatMap { psiFile ->
                psiFile
                    .children
                    .filterIsInstance<PsiClass>()
            }
    }

    /**
     * use with %L rather than with %S as these strings already are surrounded with ""
     */
    fun provideSignalArgumentNames(signal: KSPropertyDeclaration, signalFqName: String): List<String> {
        return findSignalNameInKotlinFiles(signal, signalFqName)
            ?: findSignalNameInJavaFiles(signal, signalFqName)
            ?: run {
                val message = "No initializer expression found for signal $signalFqName! Signals always have to be initialized! For kotlin use the signal delegate. For java use the the SignalProvider::signal function."
                GodotKotlinSymbolProcessor.logger.error(message, signal)
                throw EntryGeneratorException(message)
            }
    }

    private fun findSignalNameInJavaFiles(signal: KSPropertyDeclaration, propertyFqName: String): List<String>? {
        val classFqName = propertyFqName.substringBeforeLast(".")

        val fieldInitializer = javaClasses
            .firstOrNull { javaClass -> javaClass.qualifiedName == classFqName }
            ?.allFields
            ?.firstOrNull { javaField -> javaField.name == propertyFqName.substringAfterLast(".") }
            ?.initializer

        if (fieldInitializer != null && !fieldInitializer.text.contains("Signal\\d+\\.create".toRegex())) {
            val message = "Initialisation expression does not use SignalProvider! Only use the SignalProvider::signal function to initialize a Signal"
            GodotKotlinSymbolProcessor.logger.error(message, signal)
            throw EntryGeneratorException(message)
        }

        return fieldInitializer
            ?.children
            ?.last()
            ?.children
            ?.filterIsInstance<PsiExpression>()
            ?.drop(2) // thisRef and signalName
            ?.map { it.text }
    }

    private fun findSignalNameInKotlinFiles(signal: KSPropertyDeclaration, propertyFqName: String): List<String>? = getPropertyInitializerExpression(propertyFqName)
        ?.children
        ?.last() // value argument list
        ?.children
        ?.map { it.text }
        ?.let { argumentList ->
            // drop the first n arguments
            // n is the number of additional arguments needed to construct the signal
            // this is the case if one does not use the signal delegate but signal instantiation
            // ex.: val twoParamSignalField = Signal2<String, SignalTest>("noParamSignalField","str", "inv")
            // here the first argument is the signal name. But we're only interested in the signal param names
            // the signal param names are always the last arguments in that list
            // hence we can drop all additional args at the start of the list if the arg list is larger than the signal type's generic type parameter list
            argumentList.drop(argumentList.size - signal.type.resolve().arguments.size)
        }

    private fun getPropertyInitializerExpression(propertyFqName: String): KtExpression? {
        val containingClassFqName = propertyFqName.substringBeforeLast(".")

        return ktClasses
            .firstOrNull { ktClass -> ktClass.fqName?.asString() == containingClassFqName }
            ?.getProperties()
            ?.firstOrNull { ktProperty -> ktProperty.fqName?.asString() == propertyFqName }
            ?.let { ktProperty ->
                ktProperty.initializer ?: ktProperty.delegateExpression
            }
    }

    private fun providePsiFiles(): List<PsiClassOwner> {
        //Start: taken from CoreEnvironmentUtils createSourceFilesFromSourceRoots inside org.jetbrains.kotlin:kotlin-compiler:1.4.10
        val localFileSystem = VirtualFileManager
            .getInstance()
            .getFileSystem(StandardFileSystems.FILE_PROTOCOL)
        val psiManager = PsiManager.getInstance(CompilerDataProvider.project)
        val virtualFileCreator = PreprocessedFileCreator(CompilerDataProvider.project)

        val processedFiles = hashSetOf<VirtualFile>()
        //End: taken from CoreEnvironmentUtils createSourceFilesFromSourceRoots inside org.jetbrains.kotlin:kotlin-compiler:1.4.10

        return CompilerDataProvider
            .srcDirs
            .flatMap { srcDirAbsolutePath ->
                //Start: taken from CoreEnvironmentUtils createSourceFilesFromSourceRoots inside org.jetbrains.kotlin:kotlin-compiler:1.4.10
                val vFile = localFileSystem.findFileByPath(srcDirAbsolutePath) ?: return@flatMap emptySequence()
                if (!vFile.isDirectory && vFile.fileType != KotlinFileType.INSTANCE) {
                    return@flatMap emptySequence()
                }

                File(srcDirAbsolutePath)
                    .walkTopDown()
                    .map { file ->
                        if (!file.isFile) return@map null

                        val virtualFile = localFileSystem
                            .findFileByPath(file.absolutePath)
                            ?.let(virtualFileCreator::create)

                        if (virtualFile != null && processedFiles.add(virtualFile)) {
                            when (val psiFile = psiManager.findFile(virtualFile)) {
                                is KtFile -> psiFile
                                is PsiJavaFile -> psiFile
                                else -> null
                            }
                        } else null
                    }
                    //End: taken from CoreEnvironmentUtils createSourceFilesFromSourceRoots inside org.jetbrains.kotlin:kotlin-compiler:1.4.10
                    .filterNotNull()
            }
    }
}
