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
import com.intellij.ui.layout.GrowPolicy
import com.intellij.ui.layout.panel
import com.intellij.ui.layout.selected
import godot.intellij.plugin.GodotPluginBundle
import org.jetbrains.plugins.gradle.util.GradleUtil
import java.io.File
import javax.swing.JCheckBox
import javax.swing.JComponent
import javax.swing.JTextField

class GodotModuleBuilder : ModuleBuilder(), ModuleBuilderListener {
    private val groupIdKey = Key<String>("GROUP_ID")
    private val artifactIdKey = Key<String>("ARTIFACT_ID")
    private val versionKey = Key<String>("VERSION")
    private val kotlinVersionKey = Key<String>("KOTLIN_VERSION")
    private val androidEnabledKey = Key<Boolean>("ANDROID_ENABLED")
    private val dxToolPathKey = Key<String>("DX_TOOL_PATH")

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
            val groupIdTextField = JTextField("com.example")
            val artifactIdTextField = JTextField("game")
            val versionTextField = JTextField("0.0.1-SNAPSHOT")
            val kotlinVersionTextField = JTextField("1.4.32")
            lateinit var androidEnabledCheckBox: JCheckBox
            lateinit var dxToolPathTextField: TextFieldWithBrowseButton

            override fun getComponent(): JComponent {
                return panel {
                    titledRow(GodotPluginBundle.message("wizard.projectSettings.general.title")) {
                        row(GodotPluginBundle.message("wizard.projectSettings.general.groupId")) {
                            groupIdTextField().growPolicy(GrowPolicy.MEDIUM_TEXT)
                        }
                        row(GodotPluginBundle.message("wizard.projectSettings.general.artifactId")) {
                            artifactIdTextField().growPolicy(GrowPolicy.MEDIUM_TEXT)
                        }
                        row(GodotPluginBundle.message("wizard.projectSettings.general.version")) {
                            versionTextField().growPolicy(GrowPolicy.MEDIUM_TEXT)
                        }
                    }
                    if (wizardContext.isCreatingNewProject) {
                        titledRow(GodotPluginBundle.message("wizard.projectSettings.dependencySettings.title")) {
                            row(GodotPluginBundle.message("wizard.projectSettings.dependencySettings.kotlinVersion")) {
                                kotlinVersionTextField().growPolicy(GrowPolicy.MEDIUM_TEXT)
                            }
                        }
                    }
                    titledRow(GodotPluginBundle.message("wizard.projectSettings.buildSettings.title")) {
                        row(GodotPluginBundle.message("wizard.projectSettings.buildSettings.androidEnabled")) {
                            checkBox("", false).apply { androidEnabledCheckBox = this.component }
                        }
                        row(GodotPluginBundle.message("wizard.projectSettings.buildSettings.dxToolPath")) {
                            textFieldWithBrowseButton(
                                GodotPluginBundle.message("wizard.projectSettings.buildSettings.dxToolPath.browseDialogTitle"),
                                "dx",
                                context.project,
                                FileChooserDescriptor(true, false, false, false, false, false)
                            ) {
                                it.path
                            }
                                .growPolicy(GrowPolicy.SHORT_TEXT)
                                .enableIf(androidEnabledCheckBox.selected)
                                .comment(GodotPluginBundle.message("wizard.projectSettings.buildSettings.dxToolPath.comment"))
                                .apply {
                                    dxToolPathTextField = component
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
                context.putUserData(kotlinVersionKey, kotlinVersionTextField.text)
                context.putUserData(androidEnabledKey, androidEnabledCheckBox.isSelected)
                context.putUserData(dxToolPathKey, dxToolPathTextField.text)
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
                        .replace("KOTLIN_VERSION", wizardContext.getUserData(kotlinVersionKey) ?: "1.4.32")
                        .replace(
                            "GODOT_KOTLIN_JVM_VERSION",
                            "0.1.4-3.3.0"
                        )
                        .replace("ANDROID_ENABLED", wizardContext.getUserData(androidEnabledKey)?.toString() ?: "false")
                        .replace("DX_TOOL_PATH", wizardContext.getUserData(dxToolPathKey) ?: "dx")
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
                        .replace("DX_TOOL_PATH", wizardContext.getUserData(dxToolPathKey) ?: "dx")
                        .let { content ->
                            if (module.parentProjectAlreadyContainsDependency(wizardContext, "godot-library")) {
                                content.replace(
                                    "GODOT_KOTLIN_DEPENDENCY",
                                    "id(\"com.utopia-rise.godot-kotlin-jvm\")"
                                )
                            } else {
                                content.replace(
                                    "GODOT_KOTLIN_DEPENDENCY",
                                    "id(\"com.utopia-rise.godot-kotlin-jvm\") version \"0.1.4-3.2.3\""
                                )
                            }
                            if (module.parentProjectAlreadyContainsDependency(wizardContext, "kotlin-stdlib")) {
                                content.replace(
                                    "KOTLIN_DEPENDENCY",
                                    "kotlin(\"jvm\")"
                                )
                            } else {
                                content.replace(
                                    "KOTLIN_DEPENDENCY",
                                    "kotlin(\"jvm\") version \"${wizardContext.getUserData(kotlinVersionKey) ?: "1.4.32"}\""
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
