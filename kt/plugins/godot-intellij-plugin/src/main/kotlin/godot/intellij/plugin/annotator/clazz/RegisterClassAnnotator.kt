package godot.intellij.plugin.annotator.clazz

import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.psi.PsiClass
import com.intellij.psi.PsiElement
import godot.intellij.plugin.GodotPluginBundle
import godot.intellij.plugin.annotator.base.BaseAnnotator
import godot.intellij.plugin.annotator.general.checkNotGeneric
import godot.intellij.plugin.data.model.GODOT_SCRIPT_ANNOTATION
import godot.intellij.plugin.extension.extendsGodotType
import godot.intellij.plugin.extension.getRegisteredClassName
import godot.intellij.plugin.extension.hasDefaultConstructor
import godot.intellij.plugin.extension.isAbstract
import godot.intellij.plugin.extension.isAnyMemberRegistered
import godot.intellij.plugin.extension.isRegistered
import godot.intellij.plugin.extension.registerProblem
import godot.intellij.plugin.extension.registeredClassNameCache
import godot.intellij.plugin.quickfix.ClassAlreadyRegisteredQuickFix
import godot.intellij.plugin.quickfix.ClassNotRegisteredQuickFix
import godot.common.constants.Constraints
import org.jetbrains.kotlin.idea.base.util.module

class RegisterClassAnnotator : BaseAnnotator {
    private val classNotRegisteredQuickFix by lazy { ClassNotRegisteredQuickFix() }

    override fun checkElement(element: PsiElement, holder: AnnotationHolder) {
        when(element) {
            is PsiClass -> {
                if (!element.isRegistered()) {
                    val errorLocation = element.nameIdentifier ?: element.navigationElement

                    if (!element.isAbstract && element.isAnyMemberRegistered()) {
                        holder.registerProblem(
                            GodotPluginBundle.message("problem.class.notRegistered.members"),
                            errorLocation,
                            classNotRegisteredQuickFix
                        )
                    }
                } else {
                    checkNotGeneric(element, holder)
                    checkExtendsGodotType(element, holder)
                    checkDefaultConstructorExistence(element, holder)
                    checkConstructorParameterCount(element, holder)
                    checkConstructorOverloading(element, holder)
                    checkRegisteredClassName(element, holder)
                }
            }
        }
    }

    private fun checkExtendsGodotType(psiClass: PsiClass, holder: AnnotationHolder) {
        if (!psiClass.extendsGodotType()) {
            holder.registerProblem(
                message = GodotPluginBundle.message("problem.class.inheritance.notInheritingGodotObject"),
                errorLocation = psiClass.nameIdentifier ?: psiClass.navigationElement
            )
        }
    }

    private fun checkDefaultConstructorExistence(psiClass: PsiClass, holder: AnnotationHolder) {
        if (!psiClass.hasDefaultConstructor()) {
            // TODO: create quick fix (not trivial to create a secondary constructor from a primary one, i failed miserably)
            holder.registerProblem(
                GodotPluginBundle.message("problem.class.constructor.defaultConstructorMissing"),
                psiClass.nameIdentifier
                    ?: psiClass.navigationElement
            )
        }
    }

    private fun checkConstructorParameterCount(psiClass: PsiClass, holder: AnnotationHolder) {
        psiClass
            .constructors
            .filter { it.isRegistered() }
            .forEach { ktConstructor ->
                if (ktConstructor.parameterList.parametersCount > Constraints.MAX_CONSTRUCTOR_ARG_COUNT) {
                    holder.registerProblem(
                        GodotPluginBundle.message("problem.class.constructor.toManyParams", Constraints.MAX_CONSTRUCTOR_ARG_COUNT),
                        ktConstructor.parameterList
                    )
                }
            }
    }

    private fun checkConstructorOverloading(psiClass: PsiClass, holder: AnnotationHolder) {
        val constructors = psiClass
            .constructors
            .filter { it.isRegistered() }

        val constructorsByArgCount = constructors
            .filter { it.isRegistered() }
            .groupBy { it.parameterList.parametersCount }

        if (constructorsByArgCount.size != constructors.size) {
            constructorsByArgCount
                .filter { it.value.size > 1 }
                .flatMap { it.value }
                .forEach { ktConstructor ->
                    holder.registerProblem(
                        GodotPluginBundle.message("problem.class.constructor.overloading"),
                        ktConstructor.parameterList
                    )
                }
        }
    }

    private fun checkRegisteredClassName(psiClass: PsiClass, holder: AnnotationHolder) {
        val (fqName, registeredName) = psiClass.getRegisteredClassName() ?: return
        val fqNames = psiClass
            .module
            ?.registeredClassNameCache
            ?.getContainersByName(registeredName)
            ?.map { container -> container.fqName }
            ?: return

        if (fqNames.size > 1 || (fqNames.size == 1 && !fqNames.contains(fqName))) {
            val registerClassAnnotation = psiClass.getAnnotation(GODOT_SCRIPT_ANNOTATION)
            val psiElement = if (registerClassAnnotation == null) {
                psiClass.nameIdentifier ?: psiClass.navigationElement
            } else {
                val customClassName = registerClassAnnotation.findAttributeValue("className")
                if (customClassName != null) {
                    registerClassAnnotation
                        .parameterList
                        .attributes
                        .firstOrNull { it.name == "className" }
                        ?: registerClassAnnotation.parameterList
                } else {
                    registerClassAnnotation
                }
            }
            if (psiElement.isValid) {
                holder.registerProblem(
                    GodotPluginBundle.message("problem.class.nameAlreadyRegistered"),
                    psiElement,
                    ClassAlreadyRegisteredQuickFix(registeredName)
                )
            }
        }
    }
}
