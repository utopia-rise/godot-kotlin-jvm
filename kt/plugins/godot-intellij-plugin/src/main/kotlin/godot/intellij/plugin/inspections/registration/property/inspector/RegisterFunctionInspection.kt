package godot.intellij.plugin.inspections.registration.property.inspector

import com.intellij.codeInspection.ProblemHighlightType
import com.intellij.codeInspection.ProblemsHolder
import com.intellij.psi.PsiElementVisitor
import godot.intellij.plugin.inspections.registration.property.quickfix.ClassNotRegisteredQuickFix
import godot.intellij.plugin.inspections.registration.property.quickfix.EngineFunctionNotRegisteredQuickFix
import godot.intellij.plugin.inspections.registration.property.quickfix.RegisterPropertyMutabilityQuickFix
import org.jetbrains.kotlin.backend.common.serialization.findPackage
import org.jetbrains.kotlin.builtins.KotlinBuiltIns
import org.jetbrains.kotlin.descriptors.impl.ClassConstructorDescriptorImpl
import org.jetbrains.kotlin.descriptors.impl.SimpleFunctionDescriptorImpl
import org.jetbrains.kotlin.idea.caches.resolve.analyze
import org.jetbrains.kotlin.idea.inspections.AbstractKotlinInspection
import org.jetbrains.kotlin.idea.intentions.loopToCallChain.isConstant
import org.jetbrains.kotlin.idea.refactoring.fqName.getKotlinFqName
import org.jetbrains.kotlin.idea.util.findAnnotation
import org.jetbrains.kotlin.js.descriptorUtils.getJetTypeFqName
import org.jetbrains.kotlin.js.resolve.diagnostics.findPsi
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.nj2k.postProcessing.type
import org.jetbrains.kotlin.psi.*
import org.jetbrains.kotlin.psi.psiUtil.containingClass
import org.jetbrains.kotlin.psi.psiUtil.referenceExpression
import org.jetbrains.kotlin.resolve.bindingContextUtil.getReferenceTargets
import org.jetbrains.kotlin.resolve.calls.callUtil.getType
import org.jetbrains.kotlin.resolve.descriptorUtil.fqNameSafe
import org.jetbrains.kotlin.resolve.lazy.BodyResolveMode
import org.jetbrains.kotlin.types.typeUtil.isEnum

class RegisterFunctionInspection : AbstractKotlinInspection() {
    private val engineFunctionNotRegisteredQuickFix by lazy { EngineFunctionNotRegisteredQuickFix() }

    override fun buildVisitor(holder: ProblemsHolder, isOnTheFly: Boolean): PsiElementVisitor {
        return namedFunctionVisitor { ktNamedFunction ->
            if (
                ktNamedFunction.containingClass()?.findAnnotation(FqName("godot.annotation.RegisterClass")) != null
                && engineFunctions.contains(ktNamedFunction.name)
                && ktNamedFunction.findAnnotation(FqName("godot.annotation.RegisterFunction")) == null
            ) {
                holder.registerProblem(
                    ktNamedFunction.navigationElement,
                    "Overridden engine function which is not registered will not be called by Godot. Using engine functions for other purposes than to be called from Godot is considered a bad practise. Either register it or move your logic to a custom function you defined",
                    ProblemHighlightType.WARNING,
                    engineFunctionNotRegisteredQuickFix
                )
            }
        }
    }

    private val engineFunctions = listOf(
        //TODO: add all engine functions or find a better way of checking all -> maybe add godot-library as a dependency and query engine functions through reflection or generate during compilation of the plugin
        "_ready",
        "_process"
    )
}
