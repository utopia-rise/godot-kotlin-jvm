package godot.intellij.plugin.wizard

import com.intellij.ide.BrowserUtil
import com.intellij.ide.wizard.AbstractNewProjectWizardStep
import com.intellij.ide.wizard.NewProjectWizardBaseStep
import com.intellij.openapi.fileChooser.FileChooserDescriptorFactory
import com.intellij.openapi.project.Project
import com.intellij.ui.components.JBScrollPane
import com.intellij.ui.dsl.builder.Align
import com.intellij.ui.dsl.builder.Cell
import com.intellij.ui.dsl.builder.Panel
import com.intellij.ui.dsl.builder.bindSelected
import com.intellij.ui.dsl.builder.bindText
import com.intellij.ui.dsl.builder.columns
import com.intellij.ui.dsl.builder.panel
import com.intellij.ui.dsl.builder.selected
import godot.intellij.plugin.GodotPluginBundle
import godot.utils.GodotBuildProperties
import java.io.File
import javax.swing.ScrollPaneConstants
import javax.swing.JCheckBox

class GodotNewProjectWizardStep(parent: NewProjectWizardBaseStep) : AbstractNewProjectWizardStep(parent) {
    private val baseStep = parent

    private var group = "com.godot.game"
    private var language = ProjectLanguage.KOTLIN
    private var isAndroidEnabled = false
    private var d8ToolPath = ""
    private var androidCompileSdkDirectory = ""
    private var isGraalNativeImageEnabled = false
    private var graalVmHomeDirectory = ""
    private var windowsDeveloperVcVarsPath = ""
    private var isIOSEnabled = false

    init {
        baseStep.defaultName = DEFAULT_PROJECT_NAME
    }

    override fun setupUI(builder: Panel) {
        val contentPanel = panel {
            buildContent(this)
        }
        val scrollPane = JBScrollPane(
            contentPanel,
            ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
            ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER
        )

        builder.row {
            scrollCell(scrollPane)
                .align(Align.FILL)
        }.resizableRow()
    }

    private fun buildContent(builder: Panel) {
        builder.group(GodotPluginBundle.message("wizard.projectSettings.general.title")) {
            row(GodotPluginBundle.message("wizard.projectSettings.general.groupId")) {
                textField()
                    .bindText(::group)
                    .columns(GENERAL_FIELD_COLUMNS)
            }
            row(GodotPluginBundle.message("wizard.projectSettings.general.language")) {
                comboBox(ProjectLanguage.entries.toList())
                    .applyToComponent {
                        selectedItem = language
                        addActionListener {
                            language = selectedItem as? ProjectLanguage ?: ProjectLanguage.KOTLIN
                        }
                    }
            }
        }

        builder.group(GodotPluginBundle.message("wizard.projectSettings.optional.title")) {
            lateinit var isAndroidEnabledCheckBox: Cell<JCheckBox>
            group(GodotPluginBundle.message("wizard.projectSettings.buildSettings.android.title")) {
                row {
                    isAndroidEnabledCheckBox = checkBox(GodotPluginBundle.message("wizard.projectSettings.buildSettings.android.isAndroidEnabled"))
                        .bindSelected(::isAndroidEnabled)
                        .comment(GodotPluginBundle.message("wizard.projectSettings.buildSettings.android.enabled.comment"))
                }
                rowsRange {
                    row(GodotPluginBundle.message("wizard.projectSettings.buildSettings.android.d8ToolPath")) {
                        textFieldWithBrowseButton(
                            FileChooserDescriptorFactory
                                .createSingleFileNoJarsDescriptor()
                                .withTitle(GodotPluginBundle.message("wizard.projectSettings.buildSettings.android.d8ToolPath.browseDialogTitle")),
                            context.project
                        )
                            .bindText(::d8ToolPath)
                            .columns(PATH_FIELD_COLUMNS)
                            .comment(GodotPluginBundle.message("wizard.projectSettings.buildSettings.android.d8ToolPath.comment"))
                    }
                    row(GodotPluginBundle.message("wizard.projectSettings.buildSettings.android.androidCompileSdkDirectory")) {
                        textFieldWithBrowseButton(
                            FileChooserDescriptorFactory
                                .createSingleFolderDescriptor()
                                .withTitle(GodotPluginBundle.message("wizard.projectSettings.buildSettings.android.androidCompileSdkDirectory.browseDialogTitle")),
                            context.project
                        )
                            .bindText(::androidCompileSdkDirectory)
                            .columns(PATH_FIELD_COLUMNS)
                            .comment(GodotPluginBundle.message("wizard.projectSettings.buildSettings.android.androidCompileSdkDirectory.comment"))
                    }
                }.visibleIf(isAndroidEnabledCheckBox.selected)
            }

            lateinit var isGraalVmEnabledCheckBox: Cell<JCheckBox>

            lateinit var isIOSEnabledCheckBox: Cell<JCheckBox>

            group(GodotPluginBundle.message("wizard.projectSettings.buildSettings.ios.title")) {
                row {
                    isIOSEnabledCheckBox = checkBox(GodotPluginBundle.message("wizard.projectSettings.buildSettings.ios.isIOSEnabled"))
                        .bindSelected(::isIOSEnabled)
                        .applyToComponent {
                            addActionListener {
                                if (isSelected) {
                                    isGraalNativeImageEnabled = true
                                    isGraalVmEnabledCheckBox.component.isSelected = true
                                }
                            }
                        }
                        .comment(GodotPluginBundle.message("wizard.projectSettings.buildSettings.ios.enabled.comment"))
                }
            }

            group(GodotPluginBundle.message("wizard.projectSettings.buildSettings.graalvm.title")) {
                row {
                    isGraalVmEnabledCheckBox = checkBox(GodotPluginBundle.message("wizard.projectSettings.buildSettings.graalvm.isGraalVmEnabled"))
                        .bindSelected(::isGraalNativeImageEnabled)
                        .applyToComponent {
                            addActionListener {
                                if (!isSelected) {
                                    isIOSEnabled = false
                                    isIOSEnabledCheckBox.component.isSelected = false
                                }
                            }
                        }
                        .comment(GodotPluginBundle.message("wizard.projectSettings.buildSettings.graalvm.enabled.comment"))
                }
                rowsRange {
                    row {
                        link(GodotPluginBundle.message("wizard.projectSettings.buildSettings.graalvm.linkText")) {
                            BrowserUtil.browse(GodotPluginBundle.message("wizard.projectSettings.buildSettings.graalvm.link"))
                        }
                    }
                    row(GodotPluginBundle.message("wizard.projectSettings.buildSettings.graalvm.graalVmHomeDirectory")) {
                        textFieldWithBrowseButton(
                            FileChooserDescriptorFactory
                                .createSingleFolderDescriptor()
                                .withTitle(GodotPluginBundle.message("wizard.projectSettings.buildSettings.graalvm.graalVmHomeDirectory.browseDialogTitle")),
                            context.project
                        )
                            .bindText(::graalVmHomeDirectory)
                            .columns(PATH_FIELD_COLUMNS)
                            .comment(GodotPluginBundle.message("wizard.projectSettings.buildSettings.graalvm.graalVmHomeDirectory.comment"))
                    }
                    row(GodotPluginBundle.message("wizard.projectSettings.buildSettings.graalvm.windowsDeveloperVcVarsPath")) {
                        textFieldWithBrowseButton(
                            FileChooserDescriptorFactory
                                .createSingleFileNoJarsDescriptor()
                                .withTitle(GodotPluginBundle.message("wizard.projectSettings.buildSettings.graalvm.windowsDeveloperVcVarsPath.browseDialogTitle")),
                            context.project
                        )
                            .bindText(::windowsDeveloperVcVarsPath)
                            .columns(PATH_FIELD_COLUMNS)
                            .comment(GodotPluginBundle.message("wizard.projectSettings.buildSettings.graalvm.windowsDeveloperVcVarsPath.comment"))
                    }
                }.visibleIf(isGraalVmEnabledCheckBox.selected)
            }
        }
    }

    override fun setupProject(project: Project) {
        val baseDir = File(baseStep.path)
        val packagePath = group.replace(".", "/")

        File(baseDir, "${language.sourceRoot}/$packagePath").mkdirs()

        if (context.isCreatingNewProject) {
            copyTemplateFile(baseDir, "gradle/wrapper/gradle-wrapper.jar.template")
            copyTemplateFile(baseDir, "gradle/wrapper/gradle-wrapper.properties.template")
            copyTemplateFile(baseDir, "gradlew.template")
            copyTemplateFile(baseDir, "gradlew.bat.template")
            copyBuildTemplate(baseDir, "build.gradle.kts.template")
            copyTemplateFile(baseDir, "settings.gradle.kts.template") { outFile ->
                outFile.writeText(outFile.readText().replace("PROJECT_NAME", baseStep.name))
            }
        } else {
            val projectBasePath = project.basePath ?: return
            File(projectBasePath, "settings.gradle.kts").also { settingsFile ->
                if (settingsFile.exists()) {
                    val moduleRelativePath = baseDir.absolutePath.removePrefix(projectBasePath)
                    val modulePath = moduleRelativePath
                        .replace("/", ":")
                        .replace(File.separator, ":")
                    settingsFile.appendText("\ninclude(\"$modulePath\")")
                }
            }

            copyBuildTemplate(
                baseDir,
                "build.gradle.kts.submodule.intellij_template",
                "build.gradle.kts",
            )
        }

        copyTemplateFile(
            baseDir,
            language.templateName,
            "${language.sourceRoot}/$packagePath/${language.sampleFileName}",
        ) { outFile ->
            outFile.writeText(
                outFile
                    .readText()
                    .replace("GROUP_ID", group)
            )
        }
        copyTemplateFile(baseDir, "icon.svg.intellij_template")
        copyTemplateFile(baseDir, "project.godot.intellij_template") { outFile ->
            outFile.writeText(
                outFile
                    .readText()
                    .replace("GODOT_VERSION", GodotBuildProperties.godotVersion.majorMinor())
                    .replace("PROJECT_NAME", project.name)
            )
        }
        copyTemplateFile(baseDir, ".gitattributes.template")
        copyTemplateFile(baseDir, ".gitignore.template")
    }

    private fun copyBuildTemplate(
        baseDir: File,
        sourcePath: String,
        targetPath: String = sourcePath.removeSuffix(".template").removeSuffix(".intellij_template"),
    ) {
        copyTemplateFile(baseDir, sourcePath, targetPath) { outFile ->
            outFile.writeText(applyBuildTemplateVariables(outFile.readText()))
        }
    }

    private fun applyBuildTemplateVariables(content: String): String {
        return content
            .replace("GODOT_KOTLIN_JVM_VERSION", GodotBuildProperties.assembledGodotKotlinJvmVersion)
            .replace("ANDROID_ENABLED", isAndroidEnabled.toString())
            .replace("D8_TOOL_PATH", d8ToolPath.trim().takeUnless(String::isEmpty) ?: DEFAULT_D8_TOOL_PATH)
            .replace("ANDROID_COMPILE_SDK_DIR", androidCompileSdkDirectory.trim().takeUnless(String::isEmpty) ?: DEFAULT_ANDROID_COMPILE_SDK_DIR)
            .replace("IS_GRAAL_VM_ENABLED", (isGraalNativeImageEnabled || isIOSEnabled).toString())
            .replace("GRAAL_VM_DIR", graalVmHomeDirectory.trim().takeUnless(String::isEmpty) ?: DEFAULT_GRAAL_VM_DIRECTORY)
            .replace(
                "WINDOWS_DEVELOPER_VS_VARS_PATH",
                windowsDeveloperVcVarsPath.trim().takeUnless(String::isEmpty) ?: DEFAULT_WINDOWS_DEVELOPER_VC_VARS_PATH
            )
            .replace("IS_IOS_ENABLED", isIOSEnabled.toString())
    }

    private fun copyTemplateFile(
        baseDir: File,
        sourcePath: String,
        targetPath: String = sourcePath.removeSuffix(".template").removeSuffix(".intellij_template"),
        modifyOutFile: (File) -> Unit = {}
    ) {
        val parentDir = targetPath.substringBeforeLast("/")
        val targetDir = if (parentDir.isNotEmpty() && parentDir != targetPath) {
            File(baseDir, parentDir).apply { mkdirs() }
        } else {
            baseDir
        }

        val outFile = File(targetDir, targetPath.substringAfterLast("/"))

        this::class.java.getResourceAsStream("/template/$sourcePath").use { inputStream ->
            inputStream?.copyTo(outFile.outputStream())
        }

        modifyOutFile(outFile)
    }

    private fun String.majorMinor(): String {
        val firstDotIndex = indexOf('.')
        require(firstDotIndex != -1) { "Version must be in x.y or x.y.z format" }

        val secondDotIndex = indexOf('.', firstDotIndex + 1)
        return if (secondDotIndex == -1) this else substring(0, secondDotIndex)
    }

    private enum class ProjectLanguage(
        private val displayName: String,
        val sourceRoot: String,
        val templateName: String,
        val sampleFileName: String,
    ) {
        KOTLIN("Kotlin", "src/main/kotlin", "Simple.kt.intellij_template", "Simple.kt"),
        JAVA("Java", "src/main/java", "Simple.java.intellij_template", "Simple.java"),
        SCALA("Scala", "src/main/scala", "Simple.scala.intellij_template", "Simple.scala");

        override fun toString(): String = displayName
    }

    companion object {
        private const val DEFAULT_PROJECT_NAME = "MyGameProject"
        private const val GENERAL_FIELD_COLUMNS = 28
        private const val PATH_FIELD_COLUMNS = 26
        private const val DEFAULT_D8_TOOL_PATH = "\${System.getenv(\"ANDROID_SDK_ROOT\")}/build-tools/36.0.0/d8"
        private const val DEFAULT_ANDROID_COMPILE_SDK_DIR = "\${System.getenv(\"ANDROID_SDK_ROOT\")}/platforms/android-36"
        private const val DEFAULT_GRAAL_VM_DIRECTORY = "\${System.getenv(\"GRAALVM_HOME\")}"
        private const val DEFAULT_WINDOWS_DEVELOPER_VC_VARS_PATH = "\${System.getenv(\"VC_VARS_PATH\")}"
    }
}
