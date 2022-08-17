package godot.intellij.plugin.extension

import com.intellij.psi.PsiElement
import org.jetbrains.kotlin.idea.refactoring.fqName.getKotlinFqName
import org.jetbrains.kotlin.name.FqName

@Suppress("DEPRECATION") // new variant does not exist yet in this sdk version. False positive
fun PsiElement.getKotlinFqName(): FqName? = this.getKotlinFqName()
