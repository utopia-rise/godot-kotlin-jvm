package godot.intellij.plugin.extension

import com.intellij.psi.PsiClass
import com.intellij.psi.PsiMethod
import com.intellij.psi.PsiModifier
import godot.intellij.plugin.data.model.REGISTER_CLASS_ANNOTATION
import org.jetbrains.kotlin.analysis.utils.classId
import org.jetbrains.kotlin.asJava.classes.KtUltraLightClass
import org.jetbrains.kotlin.idea.util.findAnnotation
import org.jetbrains.kotlin.name.ClassId
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
    is KtUltraLightClass -> (this.kotlinOrigin as? KtClass)?.getProperties()?.any { property -> property.findAnnotation(asClassId(annotationFqName)) != null } == true
    else -> this
        .fields
        .any { declaration ->
            declaration.getAnnotation(annotationFqName) != null
        }
}

val PsiClass.isRegistered: Boolean
    get() = getAnnotation(REGISTER_CLASS_ANNOTATION) != null


fun PsiClass.isOrInheritsType(classId: ClassId): Boolean {
    return this.classId == classId || superTypes.any { superType -> superType.resolve()?.isOrInheritsType(classId) == true }
}
