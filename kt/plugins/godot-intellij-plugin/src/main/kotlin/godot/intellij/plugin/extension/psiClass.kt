package godot.intellij.plugin.extension

import com.intellij.psi.PsiClass
import com.intellij.psi.PsiModifier
import godot.tools.common.constants.GodotKotlinJvmTypes
import godot.tools.common.constants.godotCorePackage
import org.jetbrains.kotlin.descriptors.ClassDescriptor
import org.jetbrains.kotlin.idea.caches.resolve.resolveToDescriptorIfAny
import org.jetbrains.kotlin.idea.caches.resolve.util.getJavaClassDescriptor
import org.jetbrains.kotlin.psi.KtClass
import org.jetbrains.kotlin.psi.psiUtil.isAbstract
import org.jetbrains.kotlin.resolve.descriptorUtil.fqNameSafe
import org.jetbrains.kotlin.resolve.descriptorUtil.getAllSuperclassesWithoutAny

val PsiClass.isAbstract: Boolean
    get() = when(this) {
        is KtClass -> isAbstract()
        else -> isInterface || modifierList?.hasModifierProperty(PsiModifier.ABSTRACT) ?: false
    }

fun PsiClass.isAnyMemberRegistered(): Boolean {
    return this.methods.any { it.isRegistered() } || this.methods.any { it.isRegistered() }
}

fun PsiClass.extendsGodotType(): Boolean {
    return this
        .resolveToDescriptor()
        ?.getAllSuperclassesWithoutAny()
        ?.any { it.fqNameSafe.asString() == "$godotCorePackage.${GodotKotlinJvmTypes.ktObject}" } == true
}

fun PsiClass.hasDefaultConstructor(): Boolean {
    return when(this) {
        is KtClass -> this.constructors.any { it.parameters.isEmpty() }
        else -> this.constructors.isEmpty() || this.constructors.any { it.parameters.isEmpty() }
    }
}

private fun PsiClass.resolveToDescriptor(): ClassDescriptor? {
    return when(this) {
        is KtClass -> resolveToDescriptorIfAny()
        else -> getJavaClassDescriptor()
    }
}
