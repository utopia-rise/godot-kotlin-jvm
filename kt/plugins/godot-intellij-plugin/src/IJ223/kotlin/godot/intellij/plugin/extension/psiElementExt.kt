package godot.intellij.plugin.extension

import com.intellij.psi.PsiElement
import org.jetbrains.kotlin.idea.base.utils.fqname.getKotlinFqName
import org.jetbrains.kotlin.name.FqName

fun PsiElement.getKotlinFqName(): FqName? = this.getKotlinFqName()
