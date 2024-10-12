package godot.intellij.plugin.extension

import com.intellij.psi.PsiElement
import com.intellij.psi.PsiField
import godot.tools.common.constants.GodotKotlinJvmTypes
import godot.tools.common.constants.godotCorePackage
import org.jetbrains.kotlin.descriptors.CallableDescriptor
import org.jetbrains.kotlin.idea.caches.resolve.resolveToDescriptorIfAny
import org.jetbrains.kotlin.js.descriptorUtils.getKotlinTypeFqName
import org.jetbrains.kotlin.psi.KtClass
import org.jetbrains.kotlin.psi.KtProperty
import org.jetbrains.kotlin.types.KotlinType

fun KtClass.type(): KotlinType? = (this.resolveToDescriptorIfAny() as? CallableDescriptor)?.returnType
fun KtProperty.type(): KotlinType? = (this.resolveToDescriptorIfAny() as? CallableDescriptor)?.returnType

fun PsiElement.isSignal(): Boolean {
    return when(this) {
        is KtProperty -> this.type()?.getKotlinTypeFqName(false) == "$godotCorePackage.${GodotKotlinJvmTypes.signal}"
        is PsiField -> this.type.canonicalText == "$godotCorePackage.${GodotKotlinJvmTypes.signal}"
        else -> false
    }
}
