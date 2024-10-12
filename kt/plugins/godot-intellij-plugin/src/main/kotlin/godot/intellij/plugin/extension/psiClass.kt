package godot.intellij.plugin.extension

import com.intellij.psi.PsiClass
import com.intellij.psi.PsiMethod
import com.intellij.psi.PsiModifier
import godot.intellij.plugin.data.model.GODOT_SCRIPT_ANNOTATION
import org.jetbrains.kotlin.asJava.classes.KtUltraLightClass
import org.jetbrains.kotlin.descriptors.ClassDescriptor
import org.jetbrains.kotlin.idea.caches.resolve.resolveToDescriptorIfAny
import org.jetbrains.kotlin.idea.caches.resolve.util.getJavaClassDescriptor
import org.jetbrains.kotlin.idea.util.findAnnotation
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.psi.KtClass
import org.jetbrains.kotlin.psi.psiUtil.isAbstract

val PsiClass.isAbstract: Boolean
    get() = when(this) {
        is KtClass -> isAbstract()
        else -> isInterface || modifierList?.hasModifierProperty(PsiModifier.ABSTRACT) ?: false
    }

fun PsiClass.anyFunctionHasAnnotation(annotationFqName: String) = this
    .methods
    .filterIsInstance<PsiMethod>()
    .any { declaration ->
        declaration.getAnnotation(annotationFqName) != null
    }

fun PsiClass.anyPropertyHasAnnotation(annotationFqName: String) = when(this) {
    is KtUltraLightClass -> (this.kotlinOrigin as? KtClass)?.getProperties()?.any { property -> property.findAnnotation(FqName(annotationFqName)) != null } == true
    else -> this
        .fields
        .any { declaration ->
            declaration.getAnnotation(annotationFqName) != null
        }
}

val PsiClass.isRegistered: Boolean
    get() = getAnnotation(GODOT_SCRIPT_ANNOTATION) != null


fun PsiClass.resolveToDescriptor(): ClassDescriptor? {
    return when(this) {
        is KtClass -> resolveToDescriptorIfAny()
        else -> getJavaClassDescriptor()
    }
}
