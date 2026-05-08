package godot.intellij.plugin.project

import com.intellij.psi.PsiClass
import com.intellij.psi.PsiMethod
import com.intellij.psi.PsiModifier
import com.squareup.kotlinpoet.ClassName
import godot.tools.common.names.Annotation
import godot.tools.common.names.qualifiedName
import org.jetbrains.kotlin.analysis.utils.classId
import org.jetbrains.kotlin.asJava.classes.KtUltraLightClass
import org.jetbrains.kotlin.idea.util.findAnnotation
import org.jetbrains.kotlin.name.ClassId
import org.jetbrains.kotlin.psi.KtClass
import org.jetbrains.kotlin.psi.psiUtil.isAbstract

val PsiClass.isAbstract: Boolean
    get() = when (this) {
        is KtClass -> isAbstract()
        else -> isInterface || modifierList?.hasModifierProperty(PsiModifier.ABSTRACT) ?: false
    }

fun PsiClass.anyFunctionHasAnnotation(annotation: ClassName) = this
    .methods
    .filterIsInstance<PsiMethod>()
    .any { declaration ->
        declaration.getAnnotation(annotation.qualifiedName) != null
    }

fun PsiClass.anyPropertyHasAnnotation(annotation: ClassName) = when (this) {
    is KtUltraLightClass -> (this.kotlinOrigin as? KtClass)?.getProperties()
        ?.any { property -> property.findAnnotation(annotation.asClassId()) != null } == true

    else -> this
        .fields
        .any { declaration ->
            declaration.getAnnotation(annotation.qualifiedName) != null
        }
}

val PsiClass.isRegistered: Boolean
    get() = getAnnotation(Annotation.registerClass.qualifiedName) != null


fun PsiClass.isOrInheritsType(classId: ClassId): Boolean {
    return this.classId == classId || superTypes.any { superType -> superType.resolve()?.isOrInheritsType(classId) == true }
}

fun PsiClass.isOrInheritsType(className: ClassName): Boolean = isOrInheritsType(className.asClassId())
