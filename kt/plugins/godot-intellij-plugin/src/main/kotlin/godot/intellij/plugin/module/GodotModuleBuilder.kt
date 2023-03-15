package godot.intellij.plugin.module

import com.intellij.ide.util.projectWizard.ModuleBuilder
import com.intellij.ide.util.projectWizard.ModuleBuilderListener
import com.intellij.ide.util.projectWizard.ModuleWizardStep
import com.intellij.ide.util.projectWizard.WizardContext
import com.intellij.openapi.Disposable
import com.intellij.openapi.externalSystem.model.project.dependencies.ProjectDependencies
import com.intellij.openapi.fileChooser.FileChooserDescriptor
import com.intellij.openapi.module.Module
import com.intellij.openapi.module.ModuleType
import com.intellij.openapi.ui.TextFieldWithBrowseButton
import com.intellij.openapi.util.IconLoader
import com.intellij.openapi.util.Key
import com.intellij.ui.dsl.builder.COLUMNS_MEDIUM
import com.intellij.ui.dsl.builder.COLUMNS_SHORT
import com.intellij.ui.dsl.builder.columns
import com.intellij.ui.dsl.builder.panel
import com.intellij.ui.layout.selected
import godot.intellij.plugin.GodotPluginBundle
import godot.utils.GodotBuildProperties
import org.jetbrains.plugins.gradle.util.GradleUtil
import java.io.File
import javax.swing.JCheckBox
import javax.swing.JComponent
import javax.swing.JTextField

class GodotModuleBuilder : ModuleBuilder(), ModuleBuilderListener {
    private val groupIdKey = Key<String>("GROUP_ID")
    private val artifactIdKey = Key<String>("ARTIFACT_ID")
    private val versionKey = Key<String>("VERSION")
    private val androidEnabledKey = Key<Boolean>("ANDROID_ENABLED")
    private val d8ToolPathKey = Key<String>("D8_TOOL_PATH")
    private val androidCompileSdkDirKey = Key<String>("ANDROID_COMPILE_SDK_DIR")

    private lateinit var wizardContext: WizardContext

    private val builderName = GodotPluginBundle.message("module.builderName")
    private val groupName = GodotPluginBundle.message("module.groupName")

    init {
        addListener(this)
    }

    override fun getBuilderId() = "godot.module.builder"
    override fun getName() = builderName

    override fun getModuleType(): ModuleType<*> {
        return GodotModuleType
    }

    override fun getPresentableName() = GodotPluginBundle.message("module.presentableName")
    override fun getDescription() = GodotPluginBundle.message("module.description")
    override fun getNodeIcon() = IconLoader.getIcon("/pluginIcon_small.svg", this::class.java)
    override fun getGroupName() = groupName

    override fun getCustomOptionsStep(context: WizardContext, parentDisposable: Disposable): ModuleWizardStep {
        wizardContext = context
        return object : ModuleWizardStep() {
            lateinit var groupIdTextField: JTextField
            lateinit var artifactIdTextField: JTextField
            lateinit var versionTextField: JTextField
            lateinit var androidEnabledCheckBox: JCheckBox
            lateinit var d8ToolPathTextField: TextFieldWithBrowseButton
            lateinit var androidCompileSdkDirTextField: TextFieldWithBrowseButton

            override fun getComponent(): JComponent {
                // ui dsl documentation: https://plugins.jetbrains.com/docs/intellij/kotlin-ui-dsl-version-2.html
                return panel {
                    indent {
                        group(GodotPluginBundle.message("wizard.projectSettings.general.title")) {
                            row(GodotPluginBundle.message("wizard.projectSettings.general.groupId")) {
                                textField()
                                    .columns(COLUMNS_MEDIUM)
                                    .applyToComponent {
                                        text = "com.example"
                                        groupIdTextField = this
                                    }
                            }
                            row(GodotPluginBundle.message("wizard.projectSettings.general.artifactId")) {
                                textField()
                                    .columns(COLUMNS_MEDIUM)
                                    .applyToComponent {
                                        text = "game"
                                        artifactIdTextField = this
                                    }
                            }
                            row(GodotPluginBundle.message("wizard.projectSettings.general.version")) {
                                textField()
                                    .columns(COLUMNS_MEDIUM)
                                    .applyToComponent {
                                        text = "0.0.1-SNAPSHOT"
                                        artifactIdTextField = this
                                    }
                            }
                        }
                        group(GodotPluginBundle.message("wizard.projectSettings.buildSettings.title")) {
                            row(GodotPluginBundle.message("wizard.projectSettings.buildSettings.androidEnabled")) {
                                checkBox("").applyToComponent {
                                    androidEnabledCheckBox = this
                                }
                            }
                            row(GodotPluginBundle.message("wizard.projectSettings.buildSettings.d8ToolPath")) {
                                textFieldWithBrowseButton(
                                    browseDialogTitle = @Suppress("DialogTitleCapitalization") GodotPluginBundle.message("wizard.projectSettings.buildSettings.d8ToolPath.browseDialogTitle"),
                                    project = context.project,
                                    fileChooserDescriptor = FileChooserDescriptor(true, false, false, false, false, false),
                                    fileChosen = { chosenFile -> chosenFile.path }
                                )
                                    .applyToComponent {
                                        text = "\${System.getenv(\"ANDROID_SDK_ROOT\")}/build-tools/31.0.0/d8"
                                        enabledIf(androidEnabledCheckBox.selected)
                                        @Suppress("DialogTitleCapitalization")
                                        comment(GodotPluginBundle.message("wizard.projectSettings.buildSettings.d8ToolPath.comment"))
                                        d8ToolPathTextField = this
                                    }
                                    .columns(COLUMNS_SHORT)
                            }
                            row(GodotPluginBundle.message("wizard.projectSettings.buildSettings.androidCompileSdkDir")) {
                                textFieldWithBrowseButton(
                                    browseDialogTitle = GodotPluginBundle.message("wizard.projectSettings.buildSettings.androidCompileSdkDir.browseDialogTitle"),
                                    project = context.project,
                                    fileChooserDescriptor = FileChooserDescriptor(true, false, false, false, false, false),
                                    fileChosen = { chosenFile -> chosenFile.path }
                                )
                                    .applyToComponent {
                                        text = "\${System.getenv(\"ANDROID_SDK_ROOT\")}/platforms/android-30"
                                        enabledIf(androidEnabledCheckBox.selected)
                                        comment(GodotPluginBundle.message("wizard.projectSettings.buildSettings.androidCompileSdkDir.comment"))
                                        androidCompileSdkDirTextField = this
                                    }
                                    .columns(COLUMNS_SHORT)
                            }
                        }
                    }
                }
            }

            override fun updateDataModel() {
                context.projectName = artifactIdTextField.text
                context.putUserData(groupIdKey, groupIdTextField.text)
                context.putUserData(artifactIdKey, artifactIdTextField.text)
                context.putUserData(versionKey, versionTextField.text)
                context.putUserData(androidEnabledKey, androidEnabledCheckBox.isSelected)
                context.putUserData(d8ToolPathKey, d8ToolPathTextField.text)
                context.putUserData(androidCompileSdkDirKey, androidCompileSdkDirTextField.text)
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
            copyTemplateFile(basePath, "gradle/wrapper/gradle-wrapper.jar")
            copyTemplateFile(basePath, "gradle/wrapper/gradle-wrapper.properties")
            copyTemplateFile(basePath, "gradlew")
            copyTemplateFile(basePath, "gradlew.bat")
            copyTemplateFile(basePath, "build.gradle.kts") { outFile ->
                outFile.writeText(
                    outFile
                        .readText()
                        .replace(
                            "GODOT_KOTLIN_JVM_VERSION",
                            GodotBuildProperties.godotKotlinVersion
                        )
                        .replace("ANDROID_ENABLED", wizardContext.getUserData(androidEnabledKey)?.toString() ?: "false")
                        .replace(
                            "D8_TOOL_PATH",
                            wizardContext.getUserData(d8ToolPathKey) ?: "\${System.getenv(\"ANDROID_SDK_ROOT\")}/build-tools/31.0.0/d8"
                        )
                        .replace(
                            "ANDROID_COMPILE_SDK_DIR",
                            wizardContext.getUserData(androidCompileSdkDirKey)
                                ?: "\${System.getenv(\"ANDROID_SDK_ROOT\")}/platforms/android-30"
                        )
                )
            }
            copyTemplateFile(basePath, "settings.gradle.kts") { outFile ->
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
                "build.gradle.kts.submodule",
                "build.gradle.kts"
            ) { outFile ->
                outFile.writeText(
                    outFile
                        .readText()
                        .replace("ANDROID_ENABLED", wizardContext.getUserData(androidEnabledKey)?.toString() ?: "false")
                        .replace(
                            "D8_TOOL_PATH",
                            wizardContext.getUserData(d8ToolPathKey) ?: "\${System.getenv(\"ANDROID_SDK_ROOT\")}/build-tools/31.0.0/d8"
                        )
                        .replace(
                            "ANDROID_COMPILE_SDK_DIR",
                            wizardContext.getUserData(androidCompileSdkDirKey)
                                ?: "\${System.getenv(\"ANDROID_SDK_ROOT\")}/platforms/android-30"
                        )
                        .let { content ->
                            if (module.parentProjectAlreadyContainsDependency(wizardContext, "godot-library")) {
                                content.replace(
                                    "GODOT_KOTLIN_DEPENDENCY",
                                    "id(\"com.utopia-rise.godot-kotlin-jvm\")"
                                )
                            } else {
                                content.replace(
                                    "GODOT_KOTLIN_DEPENDENCY",
                                    "id(\"com.utopia-rise.godot-kotlin-jvm\") version \"${GodotBuildProperties.godotKotlinVersion}\""
                                )
                            }
                        }
                )
            }
        }
        copyTemplateFile(basePath, "src/main/kotlin/$packagePathAsFolderStructure/Simple.kt") { outFile ->
            outFile.writeText(
                outFile
                    .readText()
                    .replace("GROUP_ID", group)
                    .replace("ARTEFACT_ID", artifact)
            )
        }
        copyTemplateFile(basePath, "default_env.tres")
        copyTemplateFile(basePath, "icon.png")
        copyTemplateFile(basePath, "project.godot") { outFile ->
            outFile.writeText(
                outFile
                    .readText()
                    .replace("PROJECT_NAME", module.project.name)
            )
        }
        copyTemplateFile(basePath, ".gitattributes")
        copyTemplateFile(basePath, ".gitignore")
    }

    private fun copyTemplateFile(
        baseDir: String,
        sourceFileName: String,
        targetFileName: String = sourceFileName.substringAfterLast("/"),
        modifyOutFile: (File) -> Unit = {}
    ) {
        val templateFile = "${sourceFileName.substringAfterLast("/")}.template"
        val parentDir = sourceFileName.substringBeforeLast("/")

        val parentFile = if (parentDir.isNotEmpty() && parentDir != sourceFileName) {
            File(baseDir, parentDir).apply {
                mkdirs()
            }
        } else File(baseDir)

        val outFile = File(parentFile, targetFileName)

        this::class.java.getResourceAsStream("/template/$templateFile").use { inputStream ->
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
