package godot.intellij.plugin.annotator.clazz

import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.psi.PsiElement
import godot.intellij.plugin.GodotPluginBundle
import godot.intellij.plugin.annotator.general.checkNotGeneric
import godot.intellij.plugin.data.cache.classname.RegisteredClassNameCacheProvider
import godot.intellij.plugin.data.model.REGISTER_CLASS_ANNOTATION
import godot.intellij.plugin.data.model.REGISTER_CONSTRUCTOR_ANNOTATION
import godot.intellij.plugin.data.model.REGISTER_FUNCTION_ANNOTATION
import godot.intellij.plugin.data.model.REGISTER_PROPERTY_ANNOTATION
import godot.intellij.plugin.data.model.REGISTER_SIGNAL_ANNOTATION
import godot.intellij.plugin.data.model.TOOL_ANNOTATION
import godot.intellij.plugin.extension.anyFunctionHasAnnotation
import godot.intellij.plugin.extension.anyPropertyHasAnnotation
import godot.intellij.plugin.extension.getGodotRoot
import godot.intellij.plugin.extension.getRegisteredClassName
import godot.intellij.plugin.extension.isInGodotRoot
import godot.intellij.plugin.extension.registerProblem
import godot.intellij.plugin.quickfix.ClassAlreadyRegisteredQuickFix
import godot.intellij.plugin.quickfix.ClassNotRegisteredQuickFix
import godot.tools.common.constants.GodotKotlinJvmTypes
import godot.tools.common.constants.godotCorePackage
import org.jetbrains.kotlin.idea.caches.resolve.resolveToDescriptorIfAny
import org.jetbrains.kotlin.idea.util.findAnnotation
import org.jetbrains.kotlin.idea.util.projectStructure.module
import org.jetbrains.kotlin.idea.util.sourceRoots
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.psi.KtClass
import org.jetbrains.kotlin.psi.KtPackageDirective
import org.jetbrains.kotlin.psi.allConstructors
import org.jetbrains.kotlin.psi.psiUtil.isAbstract
import org.jetbrains.kotlin.resolve.descriptorUtil.fqNameSafe
import org.jetbrains.kotlin.resolve.descriptorUtil.getAllSuperclassesWithoutAny

private const val MAX_CONSTRUCTOR_ARGS = 5

class RegisterClassAnnotator : Annotator {
    private val classNotRegisteredQuickFix by lazy { ClassNotRegisteredQuickFix() }

    override fun annotate(element: PsiElement, holder: AnnotationHolder) {
        if (!element.isInGodotRoot()) return

        when (element) {
            is KtClass -> {
                if (element.findAnnotation(FqName(REGISTER_CLASS_ANNOTATION)) == null) {
                    val errorLocation = element.nameIdentifier ?: element.navigationElement
                    if (element.findAnnotation(FqName(TOOL_ANNOTATION)) != null) {
                        holder.registerProblem(
                            GodotPluginBundle.message("problem.class.notRegistered.butHasToolAnnotation"),
                            errorLocation,
                            classNotRegisteredQuickFix
                        )
                    }
                    if (!element.isAbstract() && element.anyPropertyHasAnnotation(REGISTER_PROPERTY_ANNOTATION)) {
                        holder.registerProblem(
                            GodotPluginBundle.message("problem.class.notRegistered.properties"),
                            errorLocation,
                            classNotRegisteredQuickFix
                        )
                    }
                    if (!element.isAbstract() && element.anyPropertyHasAnnotation(REGISTER_SIGNAL_ANNOTATION)) {
                        holder.registerProblem(
                            GodotPluginBundle.message("problem.class.notRegistered.signals"),
                            errorLocation,
                            classNotRegisteredQuickFix
                        )
                    }
                    if (!element.isAbstract() && element.anyFunctionHasAnnotation(REGISTER_FUNCTION_ANNOTATION)) {
                        holder.registerProblem(
                            GodotPluginBundle.message("problem.class.notRegistered.functions"),
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
                    checkOneRegisteredClassPerFile(element, holder)
                    checkFileName(element, holder)
                }
            }
            is KtPackageDirective -> {
                val isAnyContainingClassRegistered = element
                    .containingKtFile
                    .classes
                    .any { ktClass ->
                        ktClass
                            .annotations
                            .mapNotNull { it.qualifiedName }
                            .any { annotationFqName -> annotationFqName == REGISTER_CLASS_ANNOTATION }
                    }

                if (isAnyContainingClassRegistered) {
                    checkPackagePath(element, holder)
                }
            }
        }
    }

    private fun checkExtendsGodotType(ktClass: KtClass, holder: AnnotationHolder) {
        if (ktClass.resolveToDescriptorIfAny()?.getAllSuperclassesWithoutAny()?.any { it.fqNameSafe.asString() == "$godotCorePackage.${GodotKotlinJvmTypes.ktObject}" } != true) {
            holder.registerProblem(
                GodotPluginBundle.message("problem.class.inheritance.notInheritingGodotObject"),
                ktClass.nameIdentifier
                    ?: ktClass.navigationElement
            )
        }
    }

    private fun checkDefaultConstructorExistence(ktClass: KtClass, holder: AnnotationHolder) {
        if (ktClass.allConstructors.isNotEmpty() && ktClass.allConstructors.filter { it.valueParameters.isEmpty() }.size != 1) {
            // TODO: create quick fix (not trivial to create a secondary constructor from a primary one, i failed miserably)
            holder.registerProblem(
                GodotPluginBundle.message("problem.class.constructor.defaultConstructorMissing"),
                ktClass.nameIdentifier
                    ?: ktClass.navigationElement
            )
        }
    }

    private fun checkConstructorParameterCount(ktClass: KtClass, holder: AnnotationHolder) {
        ktClass
            .allConstructors
            .filter { it.findAnnotation(FqName(REGISTER_CONSTRUCTOR_ANNOTATION)) != null }
            .forEach { ktConstructor ->
                if (ktConstructor.valueParameters.size > MAX_CONSTRUCTOR_ARGS) {
                    holder.registerProblem(
                        GodotPluginBundle.message("problem.class.constructor.toManyParams"),
                        ktConstructor
                            .valueParameterList
                            ?.psiOrParent
                            ?: ktConstructor.nameIdentifier
                            ?: ktConstructor.navigationElement
                    )
                }
            }
    }

    private fun checkConstructorOverloading(ktClass: KtClass, holder: AnnotationHolder) {
        val constructors = ktClass
            .allConstructors
            .filter { it.findAnnotation(FqName(REGISTER_CONSTRUCTOR_ANNOTATION)) != null }

        val constructorsByArgCount = constructors
            .filter { it.findAnnotation(FqName(REGISTER_CONSTRUCTOR_ANNOTATION)) != null }
            .groupBy { it.valueParameters.size }

        if (constructorsByArgCount.size != constructors.size) {
            constructorsByArgCount
                .filter { it.value.size > 1 }
                .flatMap { it.value }
                .forEach { ktConstructor ->
                    holder.registerProblem(
                        GodotPluginBundle.message("problem.class.constructor.overloading"),
                        ktConstructor
                            .valueParameterList
                            ?.psiOrParent
                            ?: ktConstructor.nameIdentifier
                            ?: ktConstructor.navigationElement
                    )
                }
        }
    }

    private fun checkRegisteredClassName(ktClass: KtClass, holder: AnnotationHolder) {
        val (fqName, registeredName) = ktClass.getRegisteredClassName() ?: return
        val godotRoot = ktClass.getGodotRoot() ?: return
        val fqNames = RegisteredClassNameCacheProvider.provide(godotRoot)
            .getContainersByName(registeredName)
            .map { container -> container.fqName }

        if (fqNames.size > 1 || (fqNames.size == 1 && !fqNames.contains(fqName))) {
            val registerClassAnnotation = ktClass.findAnnotation(FqName(REGISTER_CLASS_ANNOTATION))
            val psiElement = if (registerClassAnnotation == null) {
                ktClass.nameIdentifier ?: ktClass.navigationElement
            } else {
                val valueArgumentList = registerClassAnnotation.valueArgumentList
                if (valueArgumentList != null) {
                    valueArgumentList.arguments.firstOrNull { argument ->
                        argument.getArgumentName()?.asName?.asString() == "className"
                    } ?: valueArgumentList.arguments.first()
                } else {
                    registerClassAnnotation
                }
            }
            holder.registerProblem(
                GodotPluginBundle.message("problem.class.nameAlreadyRegistered"),
                psiElement,
                ClassAlreadyRegisteredQuickFix(registeredName)
            )
        }
    }

    private fun checkOneRegisteredClassPerFile(ktClass: KtClass, holder: AnnotationHolder) {
        val containingFileContainsMoreRegisteredClasses = ktClass
            .containingKtFile
            .classes
            .filter { ktClassInSameFile ->
                ktClassInSameFile
                    .annotations
                    .firstOrNull { annotation -> annotation.qualifiedName == REGISTER_CLASS_ANNOTATION } != null
            }
            .size > 1

        if (containingFileContainsMoreRegisteredClasses) {
            holder.registerProblem(
                GodotPluginBundle.message("problem.class.moreThanOneRegisteredClass"),
                ktClass.identifyingElement ?: ktClass
            )
        }
    }

    private fun checkFileName(ktClass: KtClass, holder: AnnotationHolder) {
        if (ktClass.containingKtFile.virtualFile.name.removeSuffix(".kt") != ktClass.name) {
            holder.registerProblem(
                GodotPluginBundle.message("problem.class.wrongFileName"),
                ktClass.identifyingElement ?: ktClass
                // no quick fix needed -> already one present from the kotlin plugin
            )
        }
    }

    private fun checkPackagePath(ktPackageDirective: KtPackageDirective, holder: AnnotationHolder) {
        var containingFilePath = ktPackageDirective.containingKtFile.virtualFile.path
        val srcDirs = ktPackageDirective.module?.sourceRoots?.map { it.path } ?: return
        srcDirs.forEach { srcDir ->
            containingFilePath = containingFilePath.removePrefix(srcDir)
        }
        containingFilePath =
            containingFilePath.substringBeforeLast("/").removePrefix("/").removeSuffix(".kt") // not File.separator as the virtual file path is platform independent with "/"
        val packagePath = ktPackageDirective.fqName.asString().replace(".", "/") // not File.separator as the virtual file path is platform independent with "/"

        if (packagePath != containingFilePath) {
            holder.registerProblem(
                GodotPluginBundle.message("problem.class.wrongPackagePath"),
                ktPackageDirective
                // no quick fix needed -> already one present from the kotlin plugin
            )
        }
    }
}
