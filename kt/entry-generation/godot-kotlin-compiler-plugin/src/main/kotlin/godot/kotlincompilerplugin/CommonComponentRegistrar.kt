package godot.kotlincompilerplugin

import godot.entrygenerator.generator.property.defaultvalue.extractor.KtBinaryExpressionExtractor
import godot.entrygenerator.generator.property.defaultvalue.extractor.KtCallExpressionExtractor
import godot.entrygenerator.generator.property.defaultvalue.extractor.KtConstantExpressionExtractor
import godot.entrygenerator.generator.property.defaultvalue.extractor.KtDotQualifiedExpressionExtractor
import godot.entrygenerator.generator.property.defaultvalue.extractor.KtLambdaExpressionExtractor
import godot.entrygenerator.generator.property.defaultvalue.extractor.KtNameReferenceExpressionExtractor
import godot.entrygenerator.generator.property.defaultvalue.extractor.KtOperationReferenceExpressionExtractor
import godot.entrygenerator.generator.property.defaultvalue.extractor.KtPrefixExpressionExtractor
import godot.entrygenerator.generator.property.defaultvalue.extractor.KtStringTemplateExpressionExtractor
import godot.kotlincompilerplugin.common.CompilerPluginConst
import org.jetbrains.kotlin.analyzer.AnalysisResult
import org.jetbrains.kotlin.codegen.ClassBuilderFactory
import org.jetbrains.kotlin.codegen.extensions.ClassBuilderInterceptorExtension
import org.jetbrains.kotlin.com.intellij.mock.MockProject
import org.jetbrains.kotlin.com.intellij.openapi.project.Project
import org.jetbrains.kotlin.com.intellij.openapi.vfs.StandardFileSystems
import org.jetbrains.kotlin.com.intellij.openapi.vfs.VirtualFile
import org.jetbrains.kotlin.com.intellij.openapi.vfs.VirtualFileManager
import org.jetbrains.kotlin.com.intellij.psi.PsiManager
import org.jetbrains.kotlin.compiler.plugin.AbstractCliOption
import org.jetbrains.kotlin.compiler.plugin.CliOption
import org.jetbrains.kotlin.compiler.plugin.CliOptionProcessingException
import org.jetbrains.kotlin.compiler.plugin.CommandLineProcessor
import org.jetbrains.kotlin.compiler.plugin.ComponentRegistrar
import org.jetbrains.kotlin.config.CompilerConfiguration
import org.jetbrains.kotlin.container.ComponentProvider
import org.jetbrains.kotlin.context.ProjectContext
import org.jetbrains.kotlin.descriptors.ModuleDescriptor
import org.jetbrains.kotlin.diagnostics.DiagnosticSink
import org.jetbrains.kotlin.extensions.PreprocessedFileCreator
import org.jetbrains.kotlin.extensions.StorageComponentContainerContributor
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
import org.jetbrains.kotlin.psi.KtProperty
import org.jetbrains.kotlin.psi.KtStringTemplateExpression
import org.jetbrains.kotlin.psi.psiUtil.parents
import org.jetbrains.kotlin.resolve.AnalyzerExtensions
import org.jetbrains.kotlin.resolve.BindingContext
import org.jetbrains.kotlin.resolve.BindingTrace
import org.jetbrains.kotlin.resolve.jvm.extensions.AnalysisHandlerExtension
import java.io.File

class CommonComponentRegistrar : ComponentRegistrar {
    override fun registerProjectComponents(
        project: MockProject,
        configuration: CompilerConfiguration
    ) {
        CompilerProjectProvider.provider = { project }
        CompilerProjectProvider.configuration = { configuration }
        AnalysisHandlerExtension.registerExtension(project, object : AnalysisHandlerExtension {
            override fun doAnalysis(
                project: Project,
                module: ModuleDescriptor,
                projectContext: ProjectContext,
                files: Collection<KtFile>,
                bindingTrace: BindingTrace,
                componentProvider: ComponentProvider
            ): AnalysisResult? {
                CompilerProjectProvider.bindingContext = { bindingTrace.bindingContext }
                return super.doAnalysis(project, module, projectContext, files, bindingTrace, componentProvider)
            }
        })
//        val enabled = checkNotNull(configuration.get(CompilerPluginConst.CommandlineArguments.ENABLED)) {
//            "enabled parameter missing"
//        }
//        if (enabled) {
//            val processor = GodotAnnotationProcessor(
//                project,
//                checkNotNull(configuration.get(CompilerPluginConst.CommandlineArguments.ENTRY_DIR_PATH)) { "No path for generated entry file specified" },
//                checkNotNull(configuration.get(CompilerPluginConst.CommandlineArguments.SERVICE_FILE_DIR_PATH)) { "No path for generated entry file specified" },
//                checkNotNull(configuration.get(CompilerPluginConst.CommandlineArguments.SOURCES_DIR_PATH)) { "No sources dirs defined" },
//                checkNotNull(configuration.get(CompilerPluginConst.CommandlineArguments.PROJECT_DIR_PATH)) { "No project dir defined" }
//            )
//            val mpapt = MpAptProject(processor, configuration)
//            StorageComponentContainerContributor.registerExtension(project, mpapt)
//            ClassBuilderInterceptorExtension.registerExtension(project, object : ClassBuilderInterceptorExtension {
//                override fun interceptClassBuilderFactory(interceptedFactory: ClassBuilderFactory, bindingContext: BindingContext, diagnostics: DiagnosticSink): ClassBuilderFactory {
//                    processor.bindingContext = bindingContext
//                    return mpapt.interceptClassBuilderFactory(interceptedFactory, bindingContext, diagnostics)
//                }
//            })
//        }
    }
}

object PsiProvider {
    fun providePropertyInitializer(propertyFqName: String): Pair<String, Array<out Any>>? {
        val propertyInitializerExpression = getPropertyInitializerExpression(propertyFqName) ?: return "%L" to arrayOf("null")
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
                CompilerProjectProvider.bindingContext?.invoke()!!,
                expression
            )
            //call expressions like constructor calls or function calls
            expression is KtCallExpression -> KtCallExpressionExtractor.extract(
                CompilerProjectProvider.bindingContext?.invoke()!!,
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
                CompilerProjectProvider.bindingContext?.invoke()!!,
                expression,
                "propertyDescriptor"
            )
            //operators like the `or` operator
            expression is KtOperationReferenceExpression -> KtOperationReferenceExpressionExtractor.extract(expression)
            //EnumArray -> int to enum mapping function
            expression is KtLambdaExpression && expression.parents.firstOrNull { it is KtNameReferenceExpression || it is KtCallExpression } != null -> KtLambdaExpressionExtractor.extract(
                CompilerProjectProvider.bindingContext?.invoke()!!,
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
        val project = CompilerProjectProvider.provider?.invoke() ?: throw IllegalStateException("Got no compiler project")
        //Start: taken from CoreEnvironmentUtils createSourceFilesFromSourceRoots inside org.jetbrains.kotlin:kotlin-compiler:1.4.10
        val localFileSystem = VirtualFileManager
            .getInstance()
            .getFileSystem(StandardFileSystems.FILE_PROTOCOL)
        val psiManager = PsiManager.getInstance(project)
        val virtualFileCreator = PreprocessedFileCreator(project)

        val processedFiles = hashSetOf<VirtualFile>()
        //End: taken from CoreEnvironmentUtils createSourceFilesFromSourceRoots inside org.jetbrains.kotlin:kotlin-compiler:1.4.10

        return requireNotNull(CompilerProjectProvider.configuration?.invoke()?.get(CompilerPluginConst.CommandlineArguments.SOURCES_DIR_PATH)) { "No sources dirs defined" }
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

internal object CompilerProjectProvider {
    var provider: (() -> MockProject)? = null
    var configuration: (() -> CompilerConfiguration)? = null
    var bindingContext: (() -> BindingContext)? = null
}

class CommonGodotKotlinCompilerPluginCommandLineProcessor : CommandLineProcessor {
    companion object {
        val ENTRY_DIR_PATH_OPTION = CliOption(
            CompilerPluginConst.CommandLineOptionNames.entryDirPathOption,
            "Path to where the generated entry file should be written to",
            CompilerPluginConst.CommandlineArguments.ENTRY_DIR_PATH.toString(),
            required = true,
            allowMultipleOccurrences = false
        )

        val SERVICE_FILE_DIR_PATH_OPTION = CliOption(
            CompilerPluginConst.CommandLineOptionNames.serviceFileDirPathOption,
            "Path to where the generated service file should be written to",
            CompilerPluginConst.CommandlineArguments.SERVICE_FILE_DIR_PATH.toString(),
            required = true,
            allowMultipleOccurrences = false
        )

        val SOURCES_DIR_PATH_OPTION = CliOption(
            CompilerPluginConst.CommandLineOptionNames.sourcesDirPathOption,
            "Dir files where the source files reside",
            CompilerPluginConst.CommandlineArguments.SOURCES_DIR_PATH.toString(),
            required = true,
            allowMultipleOccurrences = false
        )

        val PROJECT_DIR_PATH_OPTION = CliOption(
            CompilerPluginConst.CommandLineOptionNames.projectDirPathOption,
            "project dir path",
            CompilerPluginConst.CommandlineArguments.PROJECT_DIR_PATH.toString(),
            required = true,
            allowMultipleOccurrences = false
        )

        val ENABLED = CliOption(
            CompilerPluginConst.CommandLineOptionNames.enabledOption,
            "Flag to enable entry generation",
            CompilerPluginConst.CommandlineArguments.ENABLED.toString(),
            required = true,
            allowMultipleOccurrences = false
        )
        const val PLUGIN_ID = CompilerPluginConst.compilerPluginId
    }

    override val pluginId = PLUGIN_ID
    override val pluginOptions = listOf(
        ENTRY_DIR_PATH_OPTION,
        SERVICE_FILE_DIR_PATH_OPTION,
        SOURCES_DIR_PATH_OPTION,
        PROJECT_DIR_PATH_OPTION,
        ENABLED
    )

    override fun processOption(option: AbstractCliOption, value: String, configuration: CompilerConfiguration) {
        return when (option) {
            ENTRY_DIR_PATH_OPTION -> configuration.put(
                CompilerPluginConst.CommandlineArguments.ENTRY_DIR_PATH, value
            )
            SERVICE_FILE_DIR_PATH_OPTION -> configuration.put(
                CompilerPluginConst.CommandlineArguments.SERVICE_FILE_DIR_PATH, value
            )
            SOURCES_DIR_PATH_OPTION -> {
                configuration.put(
                    CompilerPluginConst.CommandlineArguments.SOURCES_DIR_PATH, value.split(File.pathSeparator)
                )
            }
            PROJECT_DIR_PATH_OPTION -> {
                configuration.put(
                    CompilerPluginConst.CommandlineArguments.PROJECT_DIR_PATH, value
                )
            }
            ENABLED -> configuration.put(
                CompilerPluginConst.CommandlineArguments.ENABLED, value.toBoolean()
            )
            else -> throw CliOptionProcessingException("Unknown option: ${option.optionName}")
        }
    }
}
