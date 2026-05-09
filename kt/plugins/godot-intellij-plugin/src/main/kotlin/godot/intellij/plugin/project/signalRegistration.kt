package godot.intellij.plugin.project

import com.intellij.psi.PsiClass
import com.intellij.psi.PsiClassType
import com.intellij.psi.PsiField
import godot.tools.common.names.Registration
import godot.tools.common.names.CoreType
import org.jetbrains.kotlin.idea.util.findAnnotation
import org.jetbrains.kotlin.psi.KtClass
import org.jetbrains.kotlin.psi.KtProperty

fun KtProperty.isGodotRegisteredSignal(): Boolean = isOrInheritsType(CoreType.signal)

fun KtProperty.hasArgumentNameAnnotation(): Boolean = findAnnotation(Registration.argumentName.asClassId()) != null

fun KtClass.hasDirectGodotSignals(): Boolean = getProperties().any { property -> property.isGodotRegisteredSignal() }

fun PsiClass.hasDirectGodotSignals(): Boolean = fields.any { field -> field.isGodotRegisteredSignal() }

fun PsiField.isGodotRegisteredSignal(): Boolean {
    val typeClass = (type as? PsiClassType)?.resolve() ?: return false
    return typeClass.isOrInheritsType(CoreType.signal)
}
