package godot.intellij.plugin.extension

import godot.tools.common.constants.GodotKotlinJvmTypes
import godot.tools.common.constants.GodotTypes
import godot.tools.common.constants.godotCorePackage
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



fun KotlinType.isCoreType(): Boolean = getKotlinTypeFqName(false)
    .removeSuffix("?") == "$godotCorePackage.${GodotTypes.coreType}"
    || supertypes().any { supertype -> supertype.isCoreType() }
