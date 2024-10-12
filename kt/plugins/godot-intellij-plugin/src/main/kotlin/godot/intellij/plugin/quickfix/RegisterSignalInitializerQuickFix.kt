package godot.intellij.plugin.quickfix

import com.intellij.codeInspection.LocalQuickFix
import com.intellij.codeInspection.ProblemDescriptor
import com.intellij.openapi.project.Project
import godot.intellij.plugin.GodotPluginBundle
import godot.tools.common.constants.godotCorePackage
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.psi.KtModifierListOwner
import org.jetbrains.kotlin.psi.KtProperty
import org.jetbrains.kotlin.psi.KtPsiFactory
import org.jetbrains.kotlin.resolve.ImportPath

class RegisterSignalInitializerQuickFix : LocalQuickFix {
    override fun getFamilyName(): String = GodotPluginBundle.message("quickFix.signal.initializer.familyName")

    override fun applyFix(project: Project, descriptor: ProblemDescriptor) {
        val factory = KtPsiFactory(project)
        val propertyPsi = descriptor.psiElement.parent

        val newProperty = factory.createProperty((propertyPsi as KtProperty).name!!, null, false)
        val delegate = factory.createPropertyDelegate(factory.createExpression("signal()"))
        val property = propertyPsi.replace(newProperty)
        property.add(delegate)

        require(property is KtModifierListOwner)

        val importDirective = factory.createImportDirective(ImportPath(FqName("$godotCorePackage.signal"), false))
        val imports = property.containingKtFile.importList

        val fileAlreadyContainsImport = imports
            ?.imports
            ?.firstOrNull {
                it.importPath?.fqName?.asString() == godotCorePackage && it.isAllUnder ||
                    it.importPath?.fqName?.asString() == importDirective.importedFqName?.asString()
            } != null

        if (!fileAlreadyContainsImport) {
            imports?.psiOrParent?.add(importDirective)
        }
    }
}
