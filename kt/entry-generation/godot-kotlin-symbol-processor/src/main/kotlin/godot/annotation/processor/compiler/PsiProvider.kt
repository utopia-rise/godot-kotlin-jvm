package godot.annotation.processor.compiler

import org.jetbrains.kotlin.com.intellij.openapi.vfs.StandardFileSystems
import org.jetbrains.kotlin.com.intellij.openapi.vfs.VirtualFile
import org.jetbrains.kotlin.com.intellij.openapi.vfs.VirtualFileManager
import org.jetbrains.kotlin.com.intellij.psi.PsiManager
import org.jetbrains.kotlin.extensions.PreprocessedFileCreator
import org.jetbrains.kotlin.idea.KotlinFileType
import org.jetbrains.kotlin.psi.KtBinaryExpression
import org.jetbrains.kotlin.psi.KtCallExpression
import org.jetbrains.kotlin.psi.KtClass
import org.jetbrains.kotlin.psi.KtConstantExpression
import org.jetbrains.kotlin.psi.KtDotQualifiedExpression
import org.jetbrains.kotlin.psi.KtExpression
import org.jetbrains.kotlin.psi.KtFile
import org.jetbrains.kotlin.psi.KtLambdaExpression
import org.jetbrains.kotlin.psi.KtNameReferenceExpression
import org.jetbrains.kotlin.psi.KtOperationReferenceExpression
import org.jetbrains.kotlin.psi.KtPrefixExpression
import org.jetbrains.kotlin.psi.KtStringTemplateExpression
import org.jetbrains.kotlin.psi.psiUtil.parents
import java.io.File

/**
 * Provides default value template string and arguments ready to go for kotlin poet
 *
 * Abstracted here rather than in the entry gen to keep it independent of compiler and psi classes
 */
object PsiProvider {
    fun providePropertyInitializer(propertyFqName: String): Pair<String, Array<out Any>>? {
        val propertyInitializerExpression =
            getPropertyInitializerExpression(propertyFqName) ?: return "%L" to arrayOf("null")
        return getDefaultValueTemplateStringWithTemplateArguments(propertyInitializerExpression)
    }

    private fun getDefaultValueTemplateStringWithTemplateArguments(
        expression: KtExpression
    ): Pair<String, Array<out Any>>? {
        return when {
            //normal constant expression like: val foo = 1
            expression is KtConstantExpression -> KtConstantExpressionExtractor.extract(expression)
            //an example would be a negative number like: val foo = -1
            expression is KtPrefixExpression && expression.baseExpression?.let {
                getDefaultValueTemplateStringWithTemplateArguments(
                    it
                )
            } != null -> KtPrefixExpressionExtractor.extract(expression)
            //string assignments but no string templations like ("${someVarToPutInString}"): val foo = "this is awesome"
            expression is KtStringTemplateExpression -> KtStringTemplateExpressionExtractor.extract(expression)
            expression is KtDotQualifiedExpression -> KtDotQualifiedExpressionExtractor.extract(
                CompilerDataProvider.bindingContext,
                expression
            )
            //call expressions like constructor calls or function calls
            expression is KtCallExpression -> KtCallExpressionExtractor.extract(
                CompilerDataProvider.bindingContext,
                expression,
                ::getDefaultValueTemplateStringWithTemplateArguments
            )
            //used for flags: val foo = 1 or 3 and 5
            expression is KtBinaryExpression -> KtBinaryExpressionExtractor.extract(
                expression,
                ::getDefaultValueTemplateStringWithTemplateArguments
            )
            //static named reference to a global const for example
            expression is KtNameReferenceExpression -> KtNameReferenceExpressionExtractor.extract(
                CompilerDataProvider.bindingContext,
                expression,
                "propertyDescriptor"
            )
            //operators like the `or` operator
            expression is KtOperationReferenceExpression -> KtOperationReferenceExpressionExtractor.extract(expression)
            //EnumArray -> int to enum mapping function
            expression is KtLambdaExpression && expression.parents.firstOrNull { it is KtNameReferenceExpression || it is KtCallExpression } != null -> KtLambdaExpressionExtractor.extract(
                CompilerDataProvider.bindingContext,
                expression
            )
            else -> null
        }
    }

    fun provideSignalArgumentNames(signalFqName: String): List<String> {
        return requireNotNull(getPropertyInitializerExpression(signalFqName)) {
            "signal $signalFqName does not have an initializer expression"
        }
            .children
            .last() //value argument list
            .children
            .map { it.text } //use with %L rather than with %S as these strings already are surrounded with ""
    }

    private fun getPropertyInitializerExpression(propertyFqName: String): KtExpression? {
        val containingClassFqName = propertyFqName.substringBeforeLast(".")
        return provideKtClasses()
            .firstOrNull { ktClass -> ktClass.fqName?.asString() == containingClassFqName }
            ?.getProperties()
            ?.firstOrNull { ktProperty -> ktProperty.fqName?.asString() == propertyFqName }
            ?.let { ktProperty ->
                ktProperty.initializer ?: ktProperty.delegateExpression
            }
    }

    private fun provideKtClasses(): List<KtClass> {
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
                            val psiFile = psiManager.findFile(virtualFile)
                            if (psiFile is KtFile) {
                                psiFile
                            } else null
                        } else null
                    }
                    //End: taken from CoreEnvironmentUtils createSourceFilesFromSourceRoots inside org.jetbrains.kotlin:kotlin-compiler:1.4.10
                    .filterNotNull()
                    .flatMap { ktFile ->
                        ktFile
                            .children
                            .filterIsInstance<KtClass>()
                    }
            }
    }
}
