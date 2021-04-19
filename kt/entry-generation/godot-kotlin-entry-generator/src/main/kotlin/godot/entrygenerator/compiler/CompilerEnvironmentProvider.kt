package godot.entrygenerator.compiler

import org.jetbrains.kotlin.cli.common.CLIConfigurationKeys
import org.jetbrains.kotlin.cli.common.config.addKotlinSourceRoots
import org.jetbrains.kotlin.cli.common.messages.GroupingMessageCollector
import org.jetbrains.kotlin.cli.jvm.compiler.EnvironmentConfigFiles
import org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment
import org.jetbrains.kotlin.cli.jvm.config.addJvmClasspathRoots
import org.jetbrains.kotlin.com.intellij.openapi.util.Disposer
import org.jetbrains.kotlin.config.CompilerConfiguration
import org.jetbrains.kotlin.utils.PathUtil

object CompilerEnvironmentProvider {
    fun provide(sourceDirs: List<String>): KotlinCoreEnvironment {
        val configuration = CompilerConfiguration().apply {
            val groupingCollector = GroupingMessageCollector(EntryGeneratorMessageCollector(), false)
            val severityCollector = GroupingMessageCollector(groupingCollector, false)
            put(CLIConfigurationKeys.MESSAGE_COLLECTOR_KEY, severityCollector)
            addJvmClasspathRoots(PathUtil.getJdkClassesRootsFromCurrentJre())
            addKotlinSourceRoots(sourceDirs)
        }
        return KotlinCoreEnvironment.createForProduction(
            Disposer.newDisposable(),
            configuration,
            EnvironmentConfigFiles.JVM_CONFIG_FILES
        )
    }
}
