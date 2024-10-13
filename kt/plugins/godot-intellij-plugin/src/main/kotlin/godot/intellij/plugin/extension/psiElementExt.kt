package godot.intellij.plugin.extension

import com.intellij.psi.PsiAnnotation
import com.intellij.psi.PsiClass
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiField
import com.intellij.psi.PsiMethod
import com.intellij.psi.PsiModifierListOwner
import godot.intellij.plugin.data.model.GODOT_API_MEMBER_ANNOTATION
import godot.intellij.plugin.data.model.GODOT_MEMBER_ANNOTATION
import godot.tools.common.constants.GodotKotlinJvmTypes
import godot.tools.common.constants.godotAnnotationPackage
import org.jetbrains.kotlin.descriptors.ClassDescriptor
import org.jetbrains.kotlin.descriptors.FunctionDescriptor
import org.jetbrains.kotlin.descriptors.PropertyDescriptor
import org.jetbrains.kotlin.idea.caches.resolve.analyze
import org.jetbrains.kotlin.idea.search.usagesSearch.descriptor
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.psi.KtAnnotated
import org.jetbrains.kotlin.psi.KtAnnotationEntry
import org.jetbrains.kotlin.psi.KtClass
import org.jetbrains.kotlin.psi.KtElement
import org.jetbrains.kotlin.psi.KtFunction
import org.jetbrains.kotlin.psi.KtProperty
import org.jetbrains.kotlin.resolve.BindingContext
import org.jetbrains.kotlin.resolve.DescriptorToSourceUtils.descriptorToDeclaration
import org.jetbrains.kotlin.resolve.lazy.BodyResolveMode


fun PsiElement.isRegistered(): Boolean {
    return when (this) {
        is KtAnnotated -> when (this) {
            is KtClass -> hasRegistrationAnnotation() && !this.isAnnotation()
            is KtProperty -> hasRegistrationAnnotation() || isSignal() || overridesRegistered()
            is KtFunction -> hasRegistrationAnnotation() || overridesGodotApiFunction() || overridesRegistered()
            else -> false
        }

        is PsiModifierListOwner -> when(this) {
            is PsiClass -> hasRegistrationAnnotation() && !this.isAnnotationType
            is PsiField -> hasRegistrationAnnotation() || isSignal() || overridesRegistered()
            is PsiMethod -> hasRegistrationAnnotation() || overridesGodotApiFunction() || overridesRegistered()
            else -> false
        }

        else -> return false
    }
}

private fun KtProperty.overridesRegistered(): Boolean {
    return (this.descriptor as? PropertyDescriptor)?.overriddenDescriptors?.any { overriddenDescriptor ->
        overriddenDescriptor.annotations.hasAnnotation(FqName(GODOT_API_MEMBER_ANNOTATION))
    } ?: false
}

private fun KtFunction.overridesRegistered(): Boolean {
    return (this.descriptor as? FunctionDescriptor)?.overriddenDescriptors?.any { overriddenDescriptor ->
        overriddenDescriptor.annotations.hasAnnotation(FqName(GODOT_MEMBER_ANNOTATION))
    } ?: false
}

private fun KtAnnotated.hasRegistrationAnnotation(): Boolean {
    return this.resolveAllAnnotationsRecursively().any {
        it.fqName?.asString() == "$godotAnnotationPackage.${GodotKotlinJvmTypes.Annotations.godotMember}"
            || it.fqName?.asString() == "$godotAnnotationPackage.${GodotKotlinJvmTypes.Annotations.godotScript}"
    }
}

private fun KtFunction.overridesGodotApiFunction(): Boolean {
    return (this.descriptor as? FunctionDescriptor)?.overriddenDescriptors?.any { overriddenDescriptor ->
        overriddenDescriptor.annotations.hasAnnotation(FqName(GODOT_API_MEMBER_ANNOTATION))
    } ?: false
}

private fun KtAnnotated.resolveAllAnnotationsRecursively(): List<KtClass> {
    return annotationEntries.mapNotNull { it.toAnnotationClass()?.first }.flatMap { listOf(it) + it.resolveAllAnnotationsRecursively() }
}

private fun KtAnnotationEntry.toAnnotationClass(): Pair<KtClass, ClassDescriptor>? {
    val context = (this as KtElement).analyze(BodyResolveMode.PARTIAL)
    val annotationDescriptor = context.get(BindingContext.ANNOTATION, this) ?: return null

    val classDescriptor = annotationDescriptor.type.constructor.declarationDescriptor as? ClassDescriptor ?: return null
    val ktClass = descriptorToDeclaration(classDescriptor) as? KtClass ?: return null

    return if (ktClass.isAnnotation() && ktClass.isWritable) {
        ktClass to classDescriptor
    } else {
        null
    }
}

private fun PsiModifierListOwner.hasRegistrationAnnotation(): Boolean {
    return this.annotations.any { it.isRegistrationAnnotation() }
}

private fun PsiAnnotation.isRegistrationAnnotation(alreadyResolvedAnnotations: MutableList<PsiAnnotation> = mutableListOf()): Boolean {
    return this.qualifiedName == "$godotAnnotationPackage.${GodotKotlinJvmTypes.Annotations.godotScript}" ||
        this.qualifiedName == "$godotAnnotationPackage.${GodotKotlinJvmTypes.Annotations.godotMember}" ||
        run {
            val annotationsOnAnnotation = this.resolveAnnotationType()?.annotations ?: return false
            annotationsOnAnnotation
                .filter { it !in alreadyResolvedAnnotations }
                .any { it.isRegistrationAnnotation(alreadyResolvedAnnotations.apply { addAll(annotationsOnAnnotation) }) }
        }
}

private fun PsiField.getOverriddenFields(): List<PsiField> {
    val overriddenFields = mutableListOf<PsiField>()
    val containingClass = this.containingClass ?: return overriddenFields

    var superClass: PsiClass? = containingClass.superClass

    while (superClass != null) {
        for (superField in superClass.fields) {
            if (this.name == superField.name && this.type.isAssignableFrom(superField.type)) {
                overriddenFields.add(superField)
            }
        }
        superClass = superClass.superClass
    }

    return overriddenFields
}

private fun PsiField.overridesRegistered(): Boolean {
    return getOverriddenFields().any { it.isRegistered() }
}

private fun PsiMethod.overridesRegistered(): Boolean {
    val superMethods = this.findSuperMethods()

    return superMethods.any { it.isRegistered() }
}

private fun PsiMethod.overridesGodotApiFunction(): Boolean {
    val superMethods = this.findSuperMethods()

    return superMethods.any { superMethod ->
        superMethod.annotations.any { superMethodAnnotation -> superMethodAnnotation.qualifiedName == GODOT_API_MEMBER_ANNOTATION }
    }
}
