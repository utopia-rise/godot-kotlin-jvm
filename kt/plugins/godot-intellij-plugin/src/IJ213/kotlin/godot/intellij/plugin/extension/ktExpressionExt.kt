package godot.intellij.plugin.extension

import org.jetbrains.kotlin.psi.KtExpression
import org.jetbrains.kotlin.resolve.BindingContext
import org.jetbrains.kotlin.resolve.calls.callUtil.getType
import org.jetbrains.kotlin.types.KotlinType
import org.jetbrains.kotlin.utils.IDEAPluginsCompatibilityAPI

@OptIn(IDEAPluginsCompatibilityAPI::class) // needed as the kotlin version used together with this plugin version does not yet include the replacement for this method. False positive
fun KtExpression.getType(context: BindingContext): KotlinType? = this.getType(context)
