package godot.intellij.plugin.module

import com.intellij.ide.BrowserUtil
import com.intellij.ide.util.projectWizard.ModuleBuilder
import com.intellij.ide.util.projectWizard.ModuleBuilderListener
import com.intellij.ide.util.projectWizard.ModuleWizardStep
import com.intellij.ide.util.projectWizard.WizardContext
import com.intellij.openapi.Disposable
import com.intellij.openapi.externalSystem.model.project.dependencies.ProjectDependencies
import com.intellij.openapi.fileChooser.FileChooserDescriptor
import com.intellij.openapi.fileChooser.FileChooserDescriptorFactory
import com.intellij.openapi.module.Module
import com.intellij.openapi.module.ModuleType
import com.intellij.openapi.util.IconLoader
import com.intellij.openapi.util.Key
import com.intellij.ui.dsl.builder.COLUMNS_MEDIUM
import com.intellij.ui.dsl.builder.Cell
import com.intellij.ui.dsl.builder.bindSelected
import com.intellij.ui.dsl.builder.bindText
import com.intellij.ui.dsl.builder.columns
import com.intellij.ui.dsl.builder.panel
import com.intellij.ui.dsl.builder.selected
import godot.intellij.plugin.GodotPluginBundle
import godot.utils.GodotBuildProperties
import org.jetbrains.plugins.gradle.util.GradleUtil
import java.io.File
import javax.swing.JCheckBox
import javax.swing.JComponent

class GodotModuleBuilder : ModuleBuilder(), ModuleBuilderListener {
    private val groupIdKey = Key<String>("GROUP_ID")
    private val artifactIdKey = Key<String>("ARTIFACT_ID")
    private val versionKey = Key<String>("VERSION")
    private val isAndroidEnabledKey = Key<Boolean>("ANDROID_ENABLED")
    private val d8ToolPathKey = Key<String>("D8_TOOL_PATH")
    private val androidCompileSdkDirKey = Key<String>("ANDROID_COMPILE_SDK_DIR")
    private val isGraalNativeImageEnabledDirKey = Key<Boolean>("IS_GRAAL_VM_ENABLED")
    private val graalVmDirectoryKey = Key<String>("GRAAL_VM_DIR")
    private val windowsDeveloperVCVarsPathKey = Key<String>("WINDOWS_DEVELOPER_VS_VARS_PATH")
    private val isIOSEnabledKey = Key<Boolean>("IS_IOS_ENABLED")

    private lateinit var wizardContext: WizardContext

    private val builderName = GodotPluginBundle.message("module.builderName")
    private val groupName = GodotPluginBundle.message("module.groupName")

    init {
        addListener(this)
    }

    override fun getBuilderId() = "godot.module.builder"
    override fun getName() = builderName

    override fun getModuleType(): ModuleType<*> {
        return GodotModuleType()
    }

    override fun getPresentableName() = GodotPluginBundle.message("module.presentableName")
    override fun getDescription() = GodotPluginBundle.message("module.description")
    override fun getNodeIcon() = IconLoader.getIcon("/pluginIcon_small.svg", this::class.java)
    override fun getGroupName() = groupName

    override fun getCustomOptionsStep(context: WizardContext, parentDisposable: Disposable): ModuleWizardStep {
        wizardContext = context
        return object : ModuleWizardStep() {
            private var group = "com.example"
            private var artifact = "game"
            private var version = "0.0.1-SNAPSHOT"
            private var isAndroidEnabled = false
            private var d8Path = "\${System.getenv(\"ANDROID_SDK_ROOT\")}/build-tools/36.0.0/d8"
            private var androidCompileSdkDir = "\${System.getenv(\"ANDROID_SDK_ROOT\")}/platforms/android-36"

            private var isGraalNativeImageEnabled = false
            private var graalVmDirectory = "\${System.getenv(\"GRAALVM_HOME\")}"
            private var windowsDeveloperVCVarsPath = "\${System.getenv(\"VC_VARS_PATH\")}"
            private var isIOSEnabled = false

            override fun getComponent(): JComponent {
                return panel {
                    group(GodotPluginBundle.message("wizard.projectSettings.general.title")) {
                        row(GodotPluginBundle.message("wizard.projectSettings.general.groupId")) {
                            textField()
                                .bindText(::group)
                                .columns(COLUMNS_MEDIUM)
                        }
                        row(GodotPluginBundle.message("wizard.projectSettings.general.artifactId")) {
                            textField()
                                .bindText(::artifact)
                                .columns(COLUMNS_MEDIUM)
                        }
                        row(GodotPluginBundle.message("wizard.projectSettings.general.version")) {
                            textField()
                                .bindText(::version)
                                .columns(COLUMNS_MEDIUM)
                        }
                    }

                    lateinit var isAndroidEnabledCheckBox: Cell<JCheckBox>
                    lateinit var isGraalVmEnabledCheckBox: Cell<JCheckBox>
                    group(GodotPluginBundle.message("wizard.projectSettings.buildSettings.title")) {
                        group(GodotPluginBundle.message("wizard.projectSettings.buildSettings.android.title")) {
                            row(GodotPluginBundle.message("wizard.projectSettings.buildSettings.android.isAndroidEnabled")) {
                                isAndroidEnabledCheckBox = checkBox("")
                                    .bindSelected(::isAndroidEnabled)
                            }
                            row(GodotPluginBundle.message("wizard.projectSettings.buildSettings.android.d8ToolPath")) {
                                textFieldWithBrowseButton(
                                    FileChooserDescriptorFactory
                                        .createSingleFileNoJarsDescriptor()
                                        .withTitle(
                                            @Suppress("DialogTitleCapitalization")
                                            GodotPluginBundle.message("wizard.projectSettings.buildSettings.android.d8ToolPath.browseDialogTitle")
                                        ),
                                    context.project
                                )
                                    .bindText(::d8Path)
                                    .columns(COLUMNS_MEDIUM)
                                    .enabledIf(isAndroidEnabledCheckBox.selected)
                                    .comment(GodotPluginBundle.message("wizard.projectSettings.buildSettings.android.d8ToolPath.comment"))
                            }
                            row(GodotPluginBundle.message("wizard.projectSettings.buildSettings.android.androidCompileSdkDir")) {
                                textFieldWithBrowseButton(
                                    FileChooserDescriptorFactory
                                        .createSingleFileNoJarsDescriptor()
                                        .withTitle(
                                            @Suppress("DialogTitleCapitalization")
                                            GodotPluginBundle.message("wizard.projectSettings.buildSettings.android.androidCompileSdkDir.browseDialogTitle")
                                        ),
                                    context.project
                                )
                                    .bindText(::androidCompileSdkDir)
                                    .columns(COLUMNS_MEDIUM)
                                    .enabledIf(isAndroidEnabledCheckBox.selected)
                                    .comment(GodotPluginBundle.message("wizard.projectSettings.buildSettings.android.androidCompileSdkDir.comment"))
                            }
                        }

                        group(GodotPluginBundle.message("wizard.projectSettings.buildSettings.graalvm.title")) {
                            row {
                                icon(IconLoader.getIcon("/icon_warning.svg", this@GodotModuleBuilder::class.java))
                                label(GodotPluginBundle.message("wizard.projectSettings.buildSettings.graalvm.message"))
                                @Suppress("DialogTitleCapitalization")
                                link(GodotPluginBundle.message("wizard.projectSettings.buildSettings.graalvm.linkText")) {
                                    BrowserUtil.browse(GodotPluginBundle.message("wizard.projectSettings.buildSettings.graalvm.link"))
                                }
                            }
                            row(GodotPluginBundle.message("wizard.projectSettings.buildSettings.graalvm.isGraalVmEnabled")) {
                                isGraalVmEnabledCheckBox = checkBox("")
                                    .bindSelected(::isGraalNativeImageEnabled)
                            }
                            row(GodotPluginBundle.message("wizard.projectSettings.buildSettings.graalvm.graalVmDirectory")) {
                                textFieldWithBrowseButton(
                                    FileChooserDescriptorFactory
                                        .createSingleFileNoJarsDescriptor()
                                        .withTitle(
                                            @Suppress("DialogTitleCapitalization")
                                            GodotPluginBundle.message("wizard.projectSettings.buildSettings.graalvm.graalVmDirectory.browseDialogTitle")
                                        ),
                                    context.project
                                )
                                    .bindText(::graalVmDirectory)
                                    .columns(COLUMNS_MEDIUM)
                                    .enabledIf(isGraalVmEnabledCheckBox.selected)
                                    .comment(GodotPluginBundle.message("wizard.projectSettings.buildSettings.graalvm.graalVmDirectory.comment"))
                            }
                            row(GodotPluginBundle.message("wizard.projectSettings.buildSettings.graalvm.windowsDeveloperVCVarsPath")) {
                                textFieldWithBrowseButton(
                                    FileChooserDescriptorFactory
                                        .createSingleFileNoJarsDescriptor()
                                        .withTitle(
                                            @Suppress("DialogTitleCapitalization")
                                            GodotPluginBundle.message("wizard.projectSettings.buildSettings.graalvm.windowsDeveloperVCVarsPath.browseDialogTitle")
                                        ),
                                    context.project
                                )
                                    .bindText(::windowsDeveloperVCVarsPath)
                                    .columns(COLUMNS_MEDIUM)
                                    .enabledIf(isGraalVmEnabledCheckBox.selected)
                                    .comment(GodotPluginBundle.message("wizard.projectSettings.buildSettings.graalvm.windowsDeveloperVCVarsPath.comment"))
                            }
                            row(GodotPluginBundle.message("wizard.projectSettings.buildSettings.graalvm.isIOSEnabled")) {
                                checkBox("")
                                    .bindSelected(::isIOSEnabled)
                                    .enabledIf(isGraalVmEnabledCheckBox.selected)
                            }
                        }
                    }
                }
            }

            override fun updateDataModel() {
                context.projectName = artifact
                context.putUserData(groupIdKey, group)
                context.putUserData(artifactIdKey, artifact)
                context.putUserData(versionKey, version)
                context.putUserData(isAndroidEnabledKey, isAndroidEnabled)
                context.putUserData(d8ToolPathKey, d8Path)
                context.putUserData(androidCompileSdkDirKey, androidCompileSdkDir)
                context.putUserData(isGraalNativeImageEnabledDirKey, isGraalNativeImageEnabled)
                context.putUserData(graalVmDirectoryKey, graalVmDirectory)
                context.putUserData(windowsDeveloperVCVarsPathKey, windowsDeveloperVCVarsPath)
                context.putUserData(isIOSEnabledKey, isIOSEnabled && isGraalNativeImageEnabled)
            }
        }
    }

    override fun moduleCreated(module: Module) {
        val basePath = (wizardContext.projectBuilder as? GodotModuleBuilder)?.contentEntryPath ?: return
        val group = wizardContext.getUserData(groupIdKey) ?: "com.example"
        val artifact = wizardContext.getUserData(artifactIdKey) ?: "game"
        val packagePathAsFolderStructure = "$group.$artifact".replace(".", "/")

        File(basePath, "src/main/kotlin/$packagePathAsFolderStructure").mkdirs()

        if (wizardContext.isCreatingNewProject) {
            copyTemplateFile(basePath, "gradle/wrapper/gradle-wrapper.jar.template")
            copyTemplateFile(basePath, "gradle/wrapper/gradle-wrapper.properties.template")
            copyTemplateFile(basePath, "gradlew.template")
            copyTemplateFile(basePath, "gradlew.bat.template")
            copyTemplateFile(basePath, "build.gradle.kts.template") { outFile ->
                outFile.writeText(
                    outFile
                        .readText()
                        .replace(
                            "GODOT_KOTLIN_JVM_VERSION",
                            GodotBuildProperties.assembledGodotKotlinJvmVersion
                        )
                        .replace(
                            "ANDROID_ENABLED",
                            wizardContext.getUserData(isAndroidEnabledKey)?.toString() ?: "false"
                        )
                        .replace(
                            "D8_TOOL_PATH",
                            wizardContext.getUserData(d8ToolPathKey)
                                ?: "\${System.getenv(\"ANDROID_SDK_ROOT\")}/build-tools/36.0.0/d8"
                        )
                        .replace(
                            "ANDROID_COMPILE_SDK_DIR",
                            wizardContext.getUserData(androidCompileSdkDirKey)
                                ?: "\${System.getenv(\"ANDROID_SDK_ROOT\")}/platforms/android-36"
                        )
                        .replace(
                            "IS_GRAAL_VM_ENABLED",
                            wizardContext.getUserData(isGraalNativeImageEnabledDirKey)?.toString() ?: "false"
                        )
                        .replace(
                            "GRAAL_VM_DIR",
                            wizardContext.getUserData(graalVmDirectoryKey) ?: "\${System.getenv(\"GRAALVM_HOME\")}"
                        )
                        .replace(
                            "WINDOWS_DEVELOPER_VS_VARS_PATH",
                            wizardContext.getUserData(windowsDeveloperVCVarsPathKey)
                                ?: "\${System.getenv(\"VC_VARS_PATH\")}"
                        )
                        .replace("IS_IOS_ENABLED", wizardContext.getUserData(isIOSEnabledKey)?.toString() ?: "false")
                )
            }
            copyTemplateFile(basePath, "settings.gradle.kts.template") { outFile ->
                outFile.writeText(
                    outFile
                        .readText()
                        .replace("PROJECT_NAME", module.project.name)
                )
            }
        } else {
            val projectBasePath = module.project.basePath ?: return
            File(projectBasePath, "settings.gradle.kts").also { settingsFile ->
                if (settingsFile.exists()) {
                    val moduleRelativePath = basePath.removePrefix(projectBasePath)
                    val modulePath = moduleRelativePath
                        .replace("/", ":")
                        .replace(File.separator, ":")
                    settingsFile.appendText("\ninclude(\"$modulePath\")")
                }
            }

            copyTemplateFile(
                basePath,
                "build.gradle.kts.submodule.intellij_template",
                "build.gradle.kts"
            ) { outFile ->
                outFile.writeText(
                    outFile
                        .readText()
                        .replace(
                            "ANDROID_ENABLED",
                            wizardContext.getUserData(isAndroidEnabledKey)?.toString() ?: "false"
                        )
                        .replace(
                            "D8_TOOL_PATH",
                            wizardContext.getUserData(d8ToolPathKey)
                                ?: "\${System.getenv(\"ANDROID_SDK_ROOT\")}/build-tools/36.0.0/d8"
                        )
                        .replace(
                            "ANDROID_COMPILE_SDK_DIR",
                            wizardContext.getUserData(androidCompileSdkDirKey)
                                ?: "\${System.getenv(\"ANDROID_SDK_ROOT\")}/platforms/android-36"
                        )
                        .replace(
                            "IS_GRAAL_VM_ENABLED",
                            wizardContext.getUserData(isGraalNativeImageEnabledDirKey)?.toString() ?: "false"
                        )
                        .replace(
                            "GRAAL_VM_DIR",
                            wizardContext.getUserData(graalVmDirectoryKey) ?: "\${System.getenv(\"GRAALVM_HOME\")}"
                        )
                        .replace(
                            "WINDOWS_DEVELOPER_VS_VARS_PATH",
                            wizardContext.getUserData(windowsDeveloperVCVarsPathKey)
                                ?: "\${System.getenv(\"VC_VARS_PATH\")}"
                        )
                        .replace("IS_IOS_ENABLED", wizardContext.getUserData(isIOSEnabledKey)?.toString() ?: "false")
                        .let { content ->
                            if (module.parentProjectAlreadyContainsDependency(wizardContext, "godot-core-library")) {
                                content.replace(
                                    "GODOT_KOTLIN_DEPENDENCY",
                                    "id(\"com.utopia-rise.godot-kotlin-jvm\")"
                                )
                            } else {
                                content.replace(
                                    "GODOT_KOTLIN_DEPENDENCY",
                                    "id(\"com.utopia-rise.godot-kotlin-jvm\") version \"${GodotBuildProperties.assembledGodotKotlinJvmVersion}\""
                                )
                            }
                        }
                )
            }
        }
        copyTemplateFile(
            basePath,
            "Simple.kt.intellij_template",
            "src/main/kotlin/$packagePathAsFolderStructure/Simple.kt"
        ) { outFile ->
            outFile.writeText(
                outFile
                    .readText()
                    .replace("GROUP_ID", group)
                    .replace("ARTEFACT_ID", artifact)
            )
        }
        copyTemplateFile(basePath, "icon.svg.intellij_template")
        copyTemplateFile(basePath, "project.godot.intellij_template") { outFile ->
            outFile.writeText(
                outFile
                    .readText()
                    .replace("PROJECT_NAME", module.project.name)
            )
        }
        copyTemplateFile(basePath, ".gitattributes.template")
        copyTemplateFile(basePath, ".gitignore.template")
    }

    private fun copyTemplateFile(
        baseDir: String,
        sourcePath: String,
        targetPath: String = sourcePath.removeSuffix(".template").removeSuffix(".intellij_template"),
        modifyOutFile: (File) -> Unit = {}
    ) {

        val parentDir = targetPath.substringBeforeLast("/")
        val targetDir = if (parentDir.isNotEmpty() && parentDir != targetPath) {
            File(baseDir, parentDir).apply {
                mkdirs()
            }
        } else File(baseDir)

        val targetFile = targetPath.substringAfterLast("/")
        val outFile = File(targetDir, targetFile)

        this::class.java.getResourceAsStream("/template/$sourcePath").use { inputStream ->
            inputStream?.copyTo(outFile.outputStream())
        }

        modifyOutFile(outFile)
    }

    private fun Module.parentProjectAlreadyContainsDependency(
        wizardContext: WizardContext,
        dependency: String
    ): Boolean {
        return if (!wizardContext.isCreatingNewProject) {
            project.basePath?.let { projectBasePath ->
                @Suppress("UnstableApiUsage")
                GradleUtil
                    .findGradleModuleData(project, projectBasePath)
                    ?.children
                    ?.filter { it.data is ProjectDependencies }
                    ?.flatMap { (it.data as ProjectDependencies).componentsDependencies }
                    ?.flatMap { it.compileDependenciesGraph.dependencies }
                    ?.any { it.displayName.contains(dependency) }
            } == true
        } else {
            false
        }
    }
}
