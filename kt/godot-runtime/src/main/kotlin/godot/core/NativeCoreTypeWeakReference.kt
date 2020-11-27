package godot.core

import java.lang.ref.WeakReference

internal class NativeCoreTypeWeakReference(referent: NativeCoreType)
    : WeakReference<NativeCoreType>(referent) {
    val coreVariantType = referent.coreVariantType
}