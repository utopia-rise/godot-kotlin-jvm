package godot.intellij.plugin.extension

import org.jetbrains.kotlin.descriptors.CallableDescriptor
import org.jetbrains.kotlin.idea.caches.resolve.resolveToDescriptorIfAny
import org.jetbrains.kotlin.psi.KtClass
import org.jetbrains.kotlin.psi.KtProperty
import org.jetbrains.kotlin.types.KotlinType

fun KtClass.type(): KotlinType? = (this.resolveToDescriptorIfAny() as? CallableDescriptor)?.returnType
fun KtProperty.type(): KotlinType? = (this.resolveToDescriptorIfAny() as? CallableDescriptor)?.returnType
