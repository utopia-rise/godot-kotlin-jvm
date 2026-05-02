package godot.intellij.plugin.wizard

import com.intellij.ide.util.projectWizard.WizardContext
import com.intellij.ide.wizard.GeneratorNewProjectWizard
import com.intellij.ide.wizard.NewProjectWizardBaseStep
import com.intellij.ide.wizard.NewProjectWizardChainStep.Companion.nextStep
import com.intellij.ide.wizard.NewProjectWizardStep
import com.intellij.ide.wizard.RootNewProjectWizardStep
import com.intellij.openapi.util.IconLoader
import godot.intellij.plugin.GodotPluginBundle

class GodotNewProjectWizard : GeneratorNewProjectWizard {
    override val id: String = "godot.kotlin.jvm"

    override val name: String = GodotPluginBundle.message("module.presentableName")

    override val icon = IconLoader.getIcon("/pluginIcon_small.svg", this::class.java)

    override val ordinal: Int = 500

    override val description: String = GodotPluginBundle.message("module.description")

    override val groupName: String = GodotPluginBundle.message("module.groupName")

    override fun createStep(context: WizardContext): NewProjectWizardStep {
        return RootNewProjectWizardStep(context)
            .nextStep(::NewProjectWizardBaseStep)
            .nextStep(::GodotNewProjectWizardStep)
    }
}
