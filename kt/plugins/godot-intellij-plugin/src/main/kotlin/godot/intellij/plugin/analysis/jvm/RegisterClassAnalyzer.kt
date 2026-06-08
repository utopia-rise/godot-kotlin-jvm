package godot.intellij.plugin.analysis.jvm

import com.intellij.psi.PsiClass
import godot.annotation.Script
import godot.annotation.Register
import godot.annotation.Visible
import godot.annotation.Emit
import godot.annotation.Tool
import godot.core.KtObject
import godot.intellij.plugin.GodotPluginBundle
import godot.intellij.plugin.analysis.GodotProblem
import godot.intellij.plugin.project.anyFunctionHasAnnotation
import godot.intellij.plugin.project.anyPropertyHasAnnotation
import godot.intellij.plugin.project.getRegisteredClassName
import godot.intellij.plugin.project.isAbstract
import godot.intellij.plugin.project.isOrInheritsType
import godot.intellij.plugin.project.registeredClassNameCache
import godot.intellij.plugin.quickfix.ClassAlreadyRegisteredQuickFix
import godot.intellij.plugin.quickfix.ClassNotRegisteredQuickFix
import org.jetbrains.kotlin.idea.base.util.module
import org.jetbrains.kotlin.idea.util.findAnnotation
import org.jetbrains.kotlin.name.ClassId
import org.jetbrains.kotlin.psi.KtClass
import org.jetbrains.kotlin.psi.KtNamedFunction
import org.jetbrains.kotlin.psi.psiUtil.isAbstract
import org.jetbrains.kotlin.scripting.resolve.classId

object GodotScriptAnalyzer {
    private val classNotRegisteredQuickFix = ClassNotRegisteredQuickFix()

    fun analyze(ktClass: KtClass): List<GodotProblem> {
        return buildList {
            if (!ktClass.isRegistered()) {
                val errorLocation = ktClass.nameIdentifier ?: ktClass.navigationElement
                if (ktClass.findAnnotation(Tool::class.classId) != null) {
                    add(
                        GodotProblem(
                            GodotPluginBundle.message("problem.class.notRegistered.butHasToolAnnotation"),
                            errorLocation,
                            arrayOf(classNotRegisteredQuickFix)
                        )
                    )
                }
                if (!ktClass.isAbstract() && ktClass.anyPropertyHasAnnotation(Visible::class.simpleName!!)) {
                    add(
                        GodotProblem(
                            GodotPluginBundle.message("problem.class.notRegistered.properties"),
                            errorLocation,
                            arrayOf(classNotRegisteredQuickFix)
                        )
                    )
                }
                if (!ktClass.isAbstract() && ktClass.anyPropertyHasAnnotation(Emit::class.simpleName!!)) {
                    add(
                        GodotProblem(
                            GodotPluginBundle.message("problem.class.notRegistered.signals"),
                            errorLocation,
                            arrayOf(classNotRegisteredQuickFix)
                        )
                    )
                }
                if (!ktClass.isAbstract() && ktClass.anyFunctionHasAnnotation(Register::class.simpleName!!)) {
                    add(
                        GodotProblem(
                            GodotPluginBundle.message("problem.class.notRegistered.functions"),
                            errorLocation,
                            arrayOf(classNotRegisteredQuickFix)
                        )
                    )
                }
            }

            buildRegisteredClassNameProblem(ktClass)?.let(::add)

            if (ktClass.typeParameters.isNotEmpty()) {
                add(
                    GodotProblem(
                        GodotPluginBundle.message("problem.general.cannotRegisterGenerics"),
                        ktClass.typeParameterList ?: ktClass.nameIdentifier ?: ktClass.navigationElement
                    )
                )
            }

            if (ktClass.isRegistered() && !ktClass.isOrInheritsType(KtObject::class.classId)) {
                add(
                    GodotProblem(
                        GodotPluginBundle.message("problem.class.inheritance.notInheritingGodotObject"),
                        ktClass.nameIdentifier ?: ktClass.navigationElement
                    )
                )
            }

            if (ktClass.isRegistered() && !ktClass.hasExactlyOneParameterlessConstructor()) {
                add(
                    GodotProblem(
                        GodotPluginBundle.message("problem.class.constructor.defaultConstructorMissing"),
                        ktClass.nameIdentifier ?: ktClass.navigationElement
                    )
                )
            }
        }
    }

    fun analyze(psiClass: PsiClass): List<GodotProblem> {
        return buildList {
            if (psiClass.getAnnotation(Script::class.qualifiedName!!) == null) {
                val errorLocation = psiClass.nameIdentifier ?: psiClass.navigationElement
                if (psiClass.getAnnotation(Tool::class.qualifiedName!!) != null) {
                    add(
                        GodotProblem(
                            GodotPluginBundle.message("problem.class.notRegistered.butHasToolAnnotation"),
                            errorLocation,
                            arrayOf(classNotRegisteredQuickFix)
                        )
                    )
                }
                if (!psiClass.isAbstract && psiClass.anyPropertyHasAnnotation(Visible::class)) {
                    add(
                        GodotProblem(
                            GodotPluginBundle.message("problem.class.notRegistered.properties"),
                            errorLocation,
                            arrayOf(classNotRegisteredQuickFix)
                        )
                    )
                }
                if (!psiClass.isAbstract && psiClass.anyPropertyHasAnnotation(Emit::class)) {
                    add(
                        GodotProblem(
                            GodotPluginBundle.message("problem.class.notRegistered.signals"),
                            errorLocation,
                            arrayOf(classNotRegisteredQuickFix)
                        )
                    )
                }
                if (!psiClass.isAbstract && psiClass.anyFunctionHasAnnotation(Register::class)) {
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
                if (!psiClass.isOrInheritsType(KtObject::class.classId)) {
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

        val registerClassAnnotation = ktClass.findAnnotation(Script::class.classId)
        val psiElement = registerClassAnnotation?.valueArgumentList?.arguments?.firstOrNull { argument ->
            argument.getArgumentName()?.asName?.asString() == "className" || !argument.isNamed()
        } ?: registerClassAnnotation ?: ktClass.nameIdentifier ?: ktClass.navigationElement

        return psiElement.takeIf { it.isValid }?.let {
            GodotProblem(
                GodotPluginBundle.message("problem.class.nameAlreadyRegistered"),
                it,
                arrayOf(ClassAlreadyRegisteredQuickFix(registeredName))
            )
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

        val registerClassAnnotation = psiClass.getAnnotation(Script::class.qualifiedName!!)
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

    private fun KtClass.isRegistered(): Boolean = findAnnotation(Script::class.classId) != null

    private fun KtClass.anyFunctionHasAnnotation(annotation: String): Boolean {
        return declarations
            .filterIsInstance<KtNamedFunction>()
            .any { declaration -> declaration.annotationEntries.any { it.shortName?.asString() == annotation } }
    }

    private fun KtClass.anyPropertyHasAnnotation(annotation: String): Boolean {
        return getProperties()
            .any { property -> property.annotationEntries.any { it.shortName?.asString() == annotation } }
    }

    private fun KtClass.hasExactlyOneParameterlessConstructor(): Boolean {
        val constructors = buildList {
            primaryConstructor?.let(::add)
            addAll(secondaryConstructors)
        }

        if (constructors.isEmpty()) {
            return true
        }

        return constructors.count { constructor -> constructor.valueParameters.isEmpty() } == 1
    }

    private fun KtClass.isOrInheritsType(classId: ClassId): Boolean {
        if (fqName?.asString() == classId.asFqNameString()) {
            return true
        }

        return superTypeListEntries.any { superTypeEntry ->
            val resolvedSuperType = superTypeEntry.typeReference
                ?.typeElement
                ?.firstChild
                ?.references
                ?.firstOrNull()
                ?.resolve()

            when (resolvedSuperType) {
                is KtClass -> resolvedSuperType.isOrInheritsType(classId)
                is PsiClass -> resolvedSuperType.isOrInheritsType(classId)
                else -> false
            }
        }
    }
}


