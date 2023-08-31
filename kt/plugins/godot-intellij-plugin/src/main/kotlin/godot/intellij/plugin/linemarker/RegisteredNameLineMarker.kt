package godot.intellij.plugin.linemarker

import com.intellij.codeInsight.daemon.LineMarkerInfo
import com.intellij.codeInsight.daemon.LineMarkerProvider
import com.intellij.openapi.editor.markup.GutterIconRenderer
import com.intellij.openapi.ide.CopyPasteManager
import com.intellij.openapi.project.DumbService
import com.intellij.openapi.util.IconLoader
import com.intellij.psi.JavaTokenType
import com.intellij.psi.PsiClass
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiField
import com.intellij.psi.PsiMethod
import com.intellij.psi.impl.source.tree.LeafPsiElement
import godot.intellij.plugin.GodotPluginBundle
import godot.intellij.plugin.data.model.REGISTER_CLASS_ANNOTATION
import godot.intellij.plugin.data.model.REGISTER_FUNCTION_ANNOTATION
import godot.intellij.plugin.data.model.REGISTER_PROPERTY_ANNOTATION
import godot.intellij.plugin.data.model.REGISTER_SIGNAL_ANNOTATION
import godot.intellij.plugin.extension.getRegisteredClassName
import godot.intellij.plugin.extension.isAbstract
import godot.intellij.plugin.extension.isInGodotRoot
import godot.tools.common.extensions.convertToSnakeCase
import org.jetbrains.kotlin.idea.refactoring.isAbstract
import org.jetbrains.kotlin.idea.util.findAnnotation
import org.jetbrains.kotlin.lexer.KtTokens
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.psi.KtClass
import org.jetbrains.kotlin.psi.KtProperty
import java.awt.datatransfer.StringSelection
import javax.swing.Icon

private data class LineMarkerData(
    val identifier: PsiElement,
    val convertedName: String,
    val gutterIcon: Icon
)

class RegisteredNameLineMarker : LineMarkerProvider {
    override fun getLineMarkerInfo(element: PsiElement): LineMarkerInfo<*>? {
        if (DumbService.getInstance(element.project).isDumb) return null
        if (!element.isInGodotRoot()) return null

        if (element !is LeafPsiElement || (element.elementType != KtTokens.IDENTIFIER && element.elementType != JavaTokenType.IDENTIFIER)) {
            return null
        }

        val lineMarkerData = when(val parent = element.parent) {
            is KtClass -> if (parent.findAnnotation(FqName(REGISTER_CLASS_ANNOTATION)) != null) {
                val name = if (parent.isAbstract()) {
                    GodotPluginBundle.message(
                        "linemarker.registeredName.notRegisteredBecauseIsAbstract.text"
                    )
                } else {
                    parent.getRegisteredClassName()?.second ?: "<unknown>"
                }
                LineMarkerData(
                    identifier = parent.nameIdentifier ?: parent.navigationElement,
                    convertedName = name,
                    gutterIcon = IconLoader.getIcon("/linemarkerIcons/icon_script.svg", this::class.java)
                )
            } else null
            is PsiClass -> if (parent.getAnnotation(REGISTER_CLASS_ANNOTATION) != null) {
                val name = if (parent.isAbstract) {
                    GodotPluginBundle.message(
                        "linemarker.registeredName.notRegisteredBecauseIsAbstract.text"
                    )
                } else {
                    parent.getRegisteredClassName()?.second ?: "<unknown>"
                }

                LineMarkerData(
                    identifier = parent.nameIdentifier ?: parent.navigationElement,
                    convertedName = name,
                    gutterIcon = IconLoader.getIcon("/linemarkerIcons/icon_script.svg", this::class.java)
                )
            } else null
            is PsiMethod -> if (parent.getAnnotation(REGISTER_FUNCTION_ANNOTATION) != null) {
                LineMarkerData(
                    identifier = parent.nameIdentifier ?: parent.navigationElement,
                    convertedName = parent.name.convertToSnakeCase(),
                    gutterIcon = IconLoader.getIcon("/linemarkerIcons/icon_member_method.svg", this::class.java)
                )
            } else null
            is PsiField -> when {
                parent.getAnnotation(REGISTER_PROPERTY_ANNOTATION) != null -> LineMarkerData(
                    identifier = parent.nameIdentifier,
                    convertedName = parent.name.convertToSnakeCase(),
                    gutterIcon = IconLoader.getIcon("/linemarkerIcons/icon_member_property.svg", this::class.java)
                )
                parent.getAnnotation(REGISTER_SIGNAL_ANNOTATION) != null -> LineMarkerData(
                    identifier = parent.nameIdentifier,
                    convertedName = parent.name.convertToSnakeCase(),
                    gutterIcon = IconLoader.getIcon("/linemarkerIcons/icon_member_signal.svg", this::class.java)
                )
                else -> null
            }
            is KtProperty -> when {
                parent.findAnnotation(FqName(REGISTER_PROPERTY_ANNOTATION)) != null -> parent.name?.let { name ->
                    LineMarkerData(
                        identifier = parent.nameIdentifier ?: parent.navigationElement,
                        convertedName = name,
                        gutterIcon = IconLoader.getIcon("/linemarkerIcons/icon_member_property.svg", this::class.java)
                    )
                }
                parent.findAnnotation(FqName(REGISTER_SIGNAL_ANNOTATION)) != null -> parent.name?.let { name ->
                    LineMarkerData(
                        identifier = parent.nameIdentifier ?: parent.navigationElement,
                        convertedName = name,
                        gutterIcon = IconLoader.getIcon("/linemarkerIcons/icon_member_signal.svg", this::class.java)
                    )
                }
                else -> null
            }
            else -> null
        }

        return if (lineMarkerData != null) {
            val tooltipText = GodotPluginBundle.message("linemarker.registeredName.tooltip", lineMarkerData.convertedName)

            LineMarkerInfo(
                lineMarkerData.identifier,
                lineMarkerData.identifier.textRange,
                lineMarkerData.gutterIcon,
                { tooltipText },
                { _, _ ->
                    CopyPasteManager.getInstance().setContents(StringSelection(lineMarkerData.convertedName))
                },
                GutterIconRenderer.Alignment.LEFT,
                { "registered name line marker" }
            )
        } else null
    }
}
