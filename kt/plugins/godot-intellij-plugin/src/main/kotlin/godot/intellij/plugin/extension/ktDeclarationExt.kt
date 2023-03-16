package godot.intellij.plugin.extension

import org.jetbrains.kotlin.descriptors.CallableDescriptor
import org.jetbrains.kotlin.idea.caches.resolve.resolveToDescriptorIfAny
import org.jetbrains.kotlin.psi.KtDeclaration

// this extension was originally present in org.jetbrains.kotlin.nj2k.postProcessing but got marked as internal and deprecated
// the suggested replacement though is literally the body of this extension
// hence, as we use this extension quite often, we just use it with our own extension function here...
fun KtDeclaration.type() = (resolveToDescriptorIfAny() as? CallableDescriptor)?.returnType
