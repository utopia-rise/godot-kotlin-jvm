package godot.intellij.plugin.extension

import org.jetbrains.kotlin.js.descriptorUtils.getJetTypeFqName
import org.jetbrains.kotlin.types.KotlinType
import org.jetbrains.kotlin.types.typeUtil.supertypes

fun KotlinType?.isSignal(): Boolean {
    if (this == null) return false
    return if (getJetTypeFqName(false) == "godot.signals.Signal") {
        true
    } else {
        supertypes()
            .any { supertype ->
                supertype.getJetTypeFqName(false) == "godot.signals.Signal"
            }
    }
}
