package godot.intellij.plugin.extension

import org.jetbrains.kotlin.idea.references.mainReference
import org.jetbrains.kotlin.psi.KtReferenceExpression

// this extension was originally present in org.jetbrains.kotlin.nj2k.postProcessing but got marked as internal and deprecated
// the suggested replacement though is literally the body of this extension
// hence, as we use this extension quite often, we just use it with our own extension function here...
fun KtReferenceExpression.resolve() = mainReference.resolve()
