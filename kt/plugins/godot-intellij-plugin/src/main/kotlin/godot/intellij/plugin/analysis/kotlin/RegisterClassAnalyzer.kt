package godot.intellij.plugin.analysis.kotlin

import com.intellij.psi.PsiElement
import godot.intellij.plugin.GodotPluginBundle
import godot.intellij.plugin.analysis.GodotProblem
import godot.intellij.plugin.project.asClassId
import godot.intellij.plugin.project.getRegisteredClassName
import godot.intellij.plugin.project.hasDirectGodotSignals
import godot.intellij.plugin.project.isGodotRegisteredFunction
import godot.intellij.plugin.project.isOrInheritsType
import godot.intellij.plugin.project.registeredClassNameCache
import godot.intellij.plugin.quickfix.ClassAlreadyRegisteredQuickFix
import godot.intellij.plugin.quickfix.ClassNotRegisteredQuickFix
import godot.tools.common.names.Registration
import godot.tools.common.names.CoreType
import org.jetbrains.kotlin.idea.base.util.module
import org.jetbrains.kotlin.idea.util.findAnnotation
import org.jetbrains.kotlin.psi.KtClass
import org.jetbrains.kotlin.psi.KtNamedFunction
import org.jetbrains.kotlin.psi.psiUtil.isAbstract

object RegisterClassAnalyzer {
    private val classNotRegisteredQuickFix = ClassNotRegisteredQuickFix()

    fun analyze(ktClass: KtClass): List<GodotProblem> {
        return buildList {
            if (!ktClass.isRegistered()) {
                val errorLocation = ktClass.nameIdentifier ?: ktClass.navigationElement
                if (ktClass.findAnnotation(Registration.tool.asClassId()) != null) {
                    add(
                        GodotProblem(
                            GodotPluginBundle.message("problem.class.notRegistered.butHasToolAnnotation"),
                            errorLocation,
                            arrayOf(classNotRegisteredQuickFix)
                        )
                    )
                }
                if (!ktClass.isAbstract() && ktClass.anyPropertyHasAnnotation(Registration.visible.simpleName)) {
                    add(
                        GodotProblem(
                            GodotPluginBundle.message("problem.class.notRegistered.properties"),
                            errorLocation,
                            arrayOf(classNotRegisteredQuickFix)
                        )
                    )
                }
                if (!ktClass.isAbstract() && ktClass.hasDirectGodotSignals()) {
                    add(
                        GodotProblem(
                            GodotPluginBundle.message("problem.class.notRegistered.signals"),
                            errorLocation,
                            arrayOf(classNotRegisteredQuickFix)
                        )
                    )
                }
                if (!ktClass.isAbstract() && ktClass.anyFunctionHasAnnotation(Registration.register.simpleName)) {
                    add(
                        GodotProblem(
                            GodotPluginBundle.message("problem.class.notRegistered.functions"),
                            errorLocation,
                            arrayOf(classNotRegisteredQuickFix)
                        )
                    )
                }
            } else {
                if (ktClass.typeParameters.isNotEmpty()) {
                    add(
                        GodotProblem(
                            GodotPluginBundle.message("problem.general.cannotRegisterGenerics"),
                            ktClass.typeParameterList ?: ktClass.navigationElement
                        )
                    )
                }
                if (!ktClass.isOrInheritsType(CoreType.ktObject)) {
                    add(
                        GodotProblem(
                            GodotPluginBundle.message("problem.class.inheritance.notInheritingGodotObject"),
                            ktClass.nameIdentifier ?: ktClass.navigationElement
                        )
                    )
                }
                if (ktClass.secondaryConstructors.isNotEmpty() || ktClass.primaryConstructor != null) {
                    val constructors = buildList {
                        ktClass.primaryConstructor?.let(::add)
                        addAll(ktClass.secondaryConstructors)
                    }
                    if (constructors.count { constructor -> constructor.valueParameters.isEmpty() } != 1) {
                        add(
                            GodotProblem(
                                GodotPluginBundle.message("problem.class.constructor.defaultConstructorMissing"),
                                ktClass.nameIdentifier ?: ktClass.navigationElement
                            )
                        )
                    }
                }
                buildRegisteredClassNameProblem(ktClass)?.let(::add)
            }
        }
    }

    private fun buildRegisteredClassNameProblem(ktClass: KtClass): GodotProblem? {
        val (fqName, registeredName) = ktClass.getRegisteredClassName() ?: return null
        val fqNames = ktClass
            .module
            ?.registeredClassNameCache
            ?.getContainersByName(registeredName)
            ?.map { container -> container.fqName }
            ?: return null

        if (fqNames.size <= 1 && (fqNames.isEmpty() || fqNames.contains(fqName))) {
            return null
        }

        val registerClassAnnotation = ktClass.findAnnotation(Registration.registerClass.asClassId())
        val psiElement: PsiElement = when {
            registerClassAnnotation == null -> ktClass.nameIdentifier ?: ktClass.navigationElement
            registerClassAnnotation.valueArgumentList?.arguments?.any { argument ->
                argument.getArgumentName()?.asName?.asString() == "className" || !argument.isNamed()
            } == true ->
                registerClassAnnotation.valueArgumentList?.arguments?.firstOrNull { argument ->
                    argument.getArgumentName()?.asName?.asString() == "className" || !argument.isNamed()
                } ?: registerClassAnnotation.valueArgumentList ?: registerClassAnnotation

            else -> registerClassAnnotation
        }

        return psiElement.takeIf(PsiElement::isValid)?.let {
            GodotProblem(
                GodotPluginBundle.message("problem.class.nameAlreadyRegistered"),
                it,
                arrayOf(ClassAlreadyRegisteredQuickFix(registeredName))
            )
        }
    }

    private fun KtClass.anyFunctionHasAnnotation(annotation: String): Boolean {
        return declarations
            .filterIsInstance<KtNamedFunction>()
            .any { declaration ->
                if (annotation == Registration.register.simpleName) {
                    declaration.isGodotRegisteredFunction()
                } else {
                    declaration.annotationEntries.any { it.shortName?.asString() == annotation }
                }
            }
    }

    private fun KtClass.anyPropertyHasAnnotation(annotation: String): Boolean {
        return getProperties()
            .any { property -> property.annotationEntries.any { it.shortName?.asString() == annotation } }
    }

    private fun KtClass.isRegistered(): Boolean = findAnnotation(Registration.registerClass.asClassId()) != null
}
