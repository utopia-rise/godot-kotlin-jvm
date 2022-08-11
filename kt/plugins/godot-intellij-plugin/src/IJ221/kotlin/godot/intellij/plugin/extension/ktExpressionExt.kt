package godot.intellij.plugin.extension

import org.jetbrains.kotlin.psi.KtExpression
import org.jetbrains.kotlin.resolve.BindingContext
import org.jetbrains.kotlin.resolve.calls.util.getType
import org.jetbrains.kotlin.types.KotlinType

fun KtExpression.getType(context: BindingContext): KotlinType? = this.getType(context)
