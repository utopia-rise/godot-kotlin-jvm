package godot.intellij.plugin.analysis.jvm

import com.intellij.psi.PsiClass
import godot.intellij.plugin.GodotPluginBundle
import godot.intellij.plugin.analysis.GodotProblem
import godot.intellij.plugin.analysis.REGISTER_CLASS_ANNOTATION
import godot.intellij.plugin.analysis.REGISTER_FUNCTION_ANNOTATION
import godot.intellij.plugin.analysis.REGISTER_PROPERTY_ANNOTATION
import godot.intellij.plugin.analysis.REGISTER_SIGNAL_ANNOTATION
import godot.intellij.plugin.analysis.TOOL_ANNOTATION
import godot.intellij.plugin.project.anyFunctionHasAnnotation
import godot.intellij.plugin.project.anyPropertyHasAnnotation
import godot.intellij.plugin.project.asClassId
import godot.intellij.plugin.project.getRegisteredClassName
import godot.intellij.plugin.project.isAbstract
import godot.intellij.plugin.project.isOrInheritsType
import godot.intellij.plugin.project.registeredClassNameCache
import godot.intellij.plugin.quickfix.ClassAlreadyRegisteredQuickFix
import godot.intellij.plugin.quickfix.ClassNotRegisteredQuickFix
import godot.tools.common.constants.GodotKotlinJvmTypes
import godot.tools.common.constants.godotCorePackage
import org.jetbrains.kotlin.idea.base.util.module

object RegisterClassAnalyzer {
    private val classNotRegisteredQuickFix = ClassNotRegisteredQuickFix()

    fun analyze(psiClass: PsiClass): List<GodotProblem> {
        return buildList {
            if (psiClass.getAnnotation(REGISTER_CLASS_ANNOTATION) == null) {
                val errorLocation = psiClass.nameIdentifier ?: psiClass.navigationElement
                if (psiClass.getAnnotation(TOOL_ANNOTATION) != null) {
                    add(
                        GodotProblem(
                            GodotPluginBundle.message("problem.class.notRegistered.butHasToolAnnotation"),
                            errorLocation,
                            arrayOf(classNotRegisteredQuickFix)
                        )
                    )
                }
                if (!psiClass.isAbstract && psiClass.anyPropertyHasAnnotation(REGISTER_PROPERTY_ANNOTATION)) {
                    add(
                        GodotProblem(
                            GodotPluginBundle.message("problem.class.notRegistered.properties"),
                            errorLocation,
                            arrayOf(classNotRegisteredQuickFix)
                        )
                    )
                }
                if (!psiClass.isAbstract && psiClass.anyPropertyHasAnnotation(REGISTER_SIGNAL_ANNOTATION)) {
                    add(
                        GodotProblem(
                            GodotPluginBundle.message("problem.class.notRegistered.signals"),
                            errorLocation,
                            arrayOf(classNotRegisteredQuickFix)
                        )
                    )
                }
                if (!psiClass.isAbstract && psiClass.anyFunctionHasAnnotation(REGISTER_FUNCTION_ANNOTATION)) {
                    add(
                        GodotProblem(
                            GodotPluginBundle.message("problem.class.notRegistered.functions"),
                            errorLocation,
                            arrayOf(classNotRegisteredQuickFix)
                        )
                    )
                }
            } else {
                addAll(GenericRegistrationAnalyzer.analyze(psiClass))
                if (!psiClass.isOrInheritsType(asClassId("$godotCorePackage.${GodotKotlinJvmTypes.ktObject}"))) {
                    add(
                        GodotProblem(
                            GodotPluginBundle.message("problem.class.inheritance.notInheritingGodotObject"),
                            psiClass.nameIdentifier ?: psiClass.navigationElement
                        )
                    )
                }
                if (psiClass.constructors.isNotEmpty() && psiClass.constructors.count { constructor -> !constructor.hasParameters() } != 1) {
                    add(
                        GodotProblem(
                            GodotPluginBundle.message("problem.class.constructor.defaultConstructorMissing"),
                            psiClass.nameIdentifier ?: psiClass.navigationElement
                        )
                    )
                }
                buildRegisteredClassNameProblem(psiClass)?.let(::add)
            }
        }
    }

    private fun buildRegisteredClassNameProblem(psiClass: PsiClass): GodotProblem? {
        val (fqName, registeredName) = psiClass.getRegisteredClassName() ?: return null
        val fqNames = psiClass
            .module
            ?.registeredClassNameCache
            ?.getContainersByName(registeredName)
            ?.map { container -> container.fqName }
            ?: return null

        if (fqNames.size <= 1 && (fqNames.isEmpty() || fqNames.contains(fqName))) {
            return null
        }

        val registerClassAnnotation = psiClass.getAnnotation(REGISTER_CLASS_ANNOTATION)
        val psiElement = if (registerClassAnnotation == null) {
            psiClass.nameIdentifier ?: psiClass.navigationElement
        } else {
            val customClassName = registerClassAnnotation.findAttributeValue("className")
            if (customClassName != null) {
                registerClassAnnotation.parameterList.attributes.firstOrNull { it.name == "className" }
                    ?: registerClassAnnotation.parameterList
            } else {
                registerClassAnnotation
            }
        }

        return psiElement.takeIf { it.isValid }?.let {
            GodotProblem(
                GodotPluginBundle.message("problem.class.nameAlreadyRegistered"),
                it,
                arrayOf(ClassAlreadyRegisteredQuickFix(registeredName))
            )
        }
    }
}
