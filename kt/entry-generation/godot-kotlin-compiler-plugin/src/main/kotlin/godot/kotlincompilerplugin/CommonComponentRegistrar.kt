package godot.kotlincompilerplugin

import de.jensklingenberg.mpapt.common.MpAptProject
import godot.annotation.processor.GodotAnnotationProcessor
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
import org.jetbrains.kotlin.compiler.plugin.*
import org.jetbrains.kotlin.config.CompilerConfiguration
import org.jetbrains.kotlin.config.JVMConfigurationKeys
import org.jetbrains.kotlin.container.ComponentProvider
import org.jetbrains.kotlin.context.ProjectContext
import org.jetbrains.kotlin.descriptors.ModuleDescriptor
import org.jetbrains.kotlin.diagnostics.DiagnosticSink
import org.jetbrains.kotlin.extensions.PreprocessedFileCreator
import org.jetbrains.kotlin.extensions.StorageComponentContainerContributor
import org.jetbrains.kotlin.idea.KotlinFileType
import org.jetbrains.kotlin.psi.KtClass
import org.jetbrains.kotlin.psi.KtFile
import org.jetbrains.kotlin.resolve.BindingContext
import org.jetbrains.kotlin.resolve.BindingTrace
import org.jetbrains.kotlin.resolve.jvm.extensions.AnalysisHandlerExtension
import java.io.File

class CommonComponentRegistrar : ComponentRegistrar {
    override fun registerProjectComponents(
        project: MockProject,
        configuration: CompilerConfiguration
    ) {
        val enabled = checkNotNull(configuration.get(CompilerPluginConst.CommandlineArguments.ENABLED)) {
            "enabled parameter missing"
        }
        if (enabled) {
            val processor = GodotAnnotationProcessor(
                project,
                checkNotNull(configuration.get(CompilerPluginConst.CommandlineArguments.ENTRY_DIR_PATH)) { "No path for generated entry file specified" },
                checkNotNull(configuration.get(CompilerPluginConst.CommandlineArguments.SERVICE_FILE_DIR_PATH)) { "No path for generated entry file specified" },
                checkNotNull(configuration.get(CompilerPluginConst.CommandlineArguments.SOURCES_DIR_PATH)) { "No sources dirs defined" }
            )
            val mpapt = MpAptProject(processor, configuration)
            StorageComponentContainerContributor.registerExtension(project, mpapt)
            ClassBuilderInterceptorExtension.registerExtension(project, object : ClassBuilderInterceptorExtension {
                override fun interceptClassBuilderFactory(interceptedFactory: ClassBuilderFactory, bindingContext: BindingContext, diagnostics: DiagnosticSink): ClassBuilderFactory {
                    processor.bindingContext = bindingContext
                    return mpapt.interceptClassBuilderFactory(interceptedFactory, bindingContext, diagnostics)
                }
            })
//            AnalysisHandlerExtension.registerExtension(project, object : AnalysisHandlerExtension {
//                override fun analysisCompleted(project: Project, module: ModuleDescriptor, bindingTrace: BindingTrace, files: Collection<KtFile>): AnalysisResult? {
//                    val srcDirs = requireNotNull(configuration.get(CompilerPluginConst.CommandlineArguments.SOURCES_DIR_PATH)) { "No sources dirs defined" }.map { it.absolutePath }
//
//                    //taken from CoreEnvironmentUtils createSourceFilesFromSourceRoots inside org.jetbrains.kotlin:kotlin-compiler:1.4.10
//                    val localFileSystem = VirtualFileManager.getInstance()
//                        .getFileSystem(StandardFileSystems.FILE_PROTOCOL)
//                    val psiManager = PsiManager.getInstance(project)
//                    val virtualFileCreator = PreprocessedFileCreator(project)
//
//                    val processedFiles = hashSetOf<VirtualFile>()
//                    val sourceFilesTest: MutableList<KtFile> = mutableListOf()
//                    File("${configuration[JVMConfigurationKeys.OUTPUT_DIRECTORY]}/kotlinSourceRoots.txt").writeText(srcDirs.joinToString("\n"))
//
//                    srcDirs.forEach { sourceRootPath ->
//                        val vFile = localFileSystem.findFileByPath(sourceRootPath) ?: return@forEach
//                        if (!vFile.isDirectory && vFile.fileType != KotlinFileType.INSTANCE) {
//                            return@forEach
//                        }
//                        for (file in File(sourceRootPath).walkTopDown()) {
//                            if (!file.isFile) continue
//
//                            val virtualFile = localFileSystem.findFileByPath(file.absolutePath)?.let(virtualFileCreator::create)
//                            if (virtualFile != null && processedFiles.add(virtualFile)) {
//                                val psiFile = psiManager.findFile(virtualFile)
//                                if (psiFile is KtFile) {
//                                    sourceFilesTest.add(psiFile)
//                                }
//                            }
//                        }
//                    }
//
////                    val tmpConfig = configuration.copy()
////                    val tmpPath = File("${tmpConfig[JVMConfigurationKeys.OUTPUT_DIRECTORY]?.absolutePath}/../tmp")
////                    tmpConfig.put(JVMConfigurationKeys.OUTPUT_DIRECTORY, tmpPath)
////
////                    val environment = KotlinCoreEnvironment.createForProduction(Disposer.newDisposable(), tmpConfig, EnvironmentConfigFiles.JVM_CONFIG_FILES)
////                    val sourceFiles = environment.getSourceFiles()
////
////                    tmpPath.delete() //just to be sure
//
//                    processor.userClasses = sourceFilesTest
//                        .flatMap { ktFile ->
//                            ktFile
//                                .children
//                                .filterIsInstance<KtClass>()
//                                .mapNotNull { ktClass ->
//
//                                    val blubb = ktClass.getProperties().map { it.initializer }
//
//                                    ktClass.fqName?.asString()
//                                }
//                        }
//
//                    return super.analysisCompleted(project, module, bindingTrace, files)
//                }
//
//                override fun doAnalysis(project: Project, module: ModuleDescriptor, projectContext: ProjectContext, files: Collection<KtFile>, bindingTrace: BindingTrace, componentProvider: ComponentProvider): AnalysisResult? {
////                    processor.userClasses = files
////                        .flatMap { ktFile ->
////                            ktFile
////                                .children
////                                .filterIsInstance<KtClass>()
////                                .mapNotNull { ktClass ->
////                                    ktClass.fqName?.asString()
////                                }
////                        }
//                    return super.doAnalysis(project, module, projectContext, files, bindingTrace, componentProvider)
//                }
//            })
        }
    }
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
                    CompilerPluginConst.CommandlineArguments.SOURCES_DIR_PATH, value.split(":").map { File(it) }
                )
            }
            ENABLED -> configuration.put(
                CompilerPluginConst.CommandlineArguments.ENABLED, value.toBoolean()
            )
            else -> throw CliOptionProcessingException("Unknown option: ${option.optionName}")
        }
    }
}
