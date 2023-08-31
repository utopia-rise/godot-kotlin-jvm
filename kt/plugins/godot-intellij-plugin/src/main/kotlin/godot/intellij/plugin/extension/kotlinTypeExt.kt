package godot.intellij.plugin.extension

import godot.tools.common.constants.GodotKotlinJvmTypes
import godot.tools.common.constants.signalPackage
import org.jetbrains.kotlin.js.descriptorUtils.getKotlinTypeFqName

import org.jetbrains.kotlin.types.KotlinType
import org.jetbrains.kotlin.types.typeUtil.supertypes

fun KotlinType?.isSignal(): Boolean {
    if (this == null) return false
    return if (getKotlinTypeFqName(false) == "$signalPackage.${GodotKotlinJvmTypes.signal}") {
        true
    } else {
        supertypes()
            .any { supertype ->
                supertype.getKotlinTypeFqName(false) == "$signalPackage.${GodotKotlinJvmTypes.signal}"
            }
    }
}
