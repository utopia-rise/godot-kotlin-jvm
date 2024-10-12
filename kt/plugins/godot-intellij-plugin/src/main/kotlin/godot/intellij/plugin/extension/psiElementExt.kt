package godot.intellij.plugin.extension

import com.intellij.psi.PsiAnnotation
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiModifierListOwner
import godot.tools.common.constants.GodotKotlinJvmTypes
import godot.tools.common.constants.godotAnnotationPackage


fun PsiElement.isRegistered(): Boolean {
    if (this !is PsiModifierListOwner) return false
    return this.annotations.any { it.isRegistrationAnnotation() }
}

private fun PsiAnnotation.isRegistrationAnnotation(): Boolean {
    return this.qualifiedName == "$godotAnnotationPackage.${GodotKotlinJvmTypes.Annotations.godotScript}" ||
        this.qualifiedName == "$godotAnnotationPackage.${GodotKotlinJvmTypes.Annotations.godotMember}" ||
        this.resolveAnnotationType()?.annotations?.any { it.isRegistrationAnnotation() } == true
}
