package godot.kotlincompilerplugin

import de.jensklingenberg.mpapt.common.MpAptProject
import godot.annotation.processor.GodotAnnotationProcessor
import godot.kotlincompilerplugin.common.CompilerPluginConst
import org.jetbrains.kotlin.codegen.ClassBuilderFactory
import org.jetbrains.kotlin.codegen.extensions.ClassBuilderInterceptorExtension
import org.jetbrains.kotlin.com.intellij.mock.MockProject
import org.jetbrains.kotlin.compiler.plugin.*
import org.jetbrains.kotlin.config.CompilerConfiguration
import org.jetbrains.kotlin.diagnostics.DiagnosticSink
import org.jetbrains.kotlin.extensions.StorageComponentContainerContributor
import org.jetbrains.kotlin.resolve.BindingContext

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
                checkNotNull(configuration.get(CompilerPluginConst.CommandlineArguments.ENTRY_DIR_PATH)) { "No path for generated entry file specified" },
                checkNotNull(configuration.get(CompilerPluginConst.CommandlineArguments.SERVICE_FILE_DIR_PATH)) { "No path for generated entry file specified" }
            )
            val mpapt = MpAptProject(processor, configuration)
            StorageComponentContainerContributor.registerExtension(project, mpapt)
            ClassBuilderInterceptorExtension.registerExtension(project, object: ClassBuilderInterceptorExtension {
                override fun interceptClassBuilderFactory(interceptedFactory: ClassBuilderFactory, bindingContext: BindingContext, diagnostics: DiagnosticSink): ClassBuilderFactory {
                    processor.bindingContext = bindingContext
                    return mpapt.interceptClassBuilderFactory(interceptedFactory, bindingContext, diagnostics)
                }
            })
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
            ENABLED -> configuration.put(
                CompilerPluginConst.CommandlineArguments.ENABLED, value.toBoolean()
            )
            else -> throw CliOptionProcessingException("Unknown option: ${option.optionName}")
        }
    }
}
