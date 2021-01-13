package godot.kotlincompilerplugin.common

import org.jetbrains.kotlin.config.CompilerConfigurationKey
import java.io.File

object CompilerPluginConst {
    const val compilerPluginGroupId = "com.utopia-rise"

    const val compilerPluginArtifactId = "godot-kotlin-compiler-plugin"
    const val compilerPluginId = "GodotKotlinCompilerPlugin"

    object CommandLineOptionNames {
        const val entryDirPathOption = "entry-dir-path"
        const val serviceFileDirPathOption = "service-dir-path"
        const val sourcesDirPathOption = "sources-dir-path"
        const val enabledOption = "enabled"
    }

    object CommandlineArguments {
        val ENTRY_DIR_PATH: CompilerConfigurationKey<String> =
            CompilerConfigurationKey.create("path to the folder in which the generated entry file should be written")
        val SERVICE_FILE_DIR_PATH: CompilerConfigurationKey<String> =
            CompilerConfigurationKey.create("path to the folder in which the generated entry file should be written")
        val SOURCES_DIR_PATH: CompilerConfigurationKey<List<File>> =
            CompilerConfigurationKey.create("paths to the folders in which the kotlin sources reside")
        val ENABLED: CompilerConfigurationKey<Boolean> =
            CompilerConfigurationKey.create("flag to enable entry generation")
    }
}
