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
import godot.intellij.plugin.data.model.GODOT_API_MEMBER_ANNOTATION
import godot.intellij.plugin.data.model.GODOT_MEMBER_ANNOTATION
import godot.intellij.plugin.data.model.GODOT_SCRIPT_ANNOTATION
import godot.intellij.plugin.extension.getRegisteredClassName
import godot.intellij.plugin.extension.isAbstract
import godot.intellij.plugin.extension.isInGodotRoot
import godot.intellij.plugin.extension.isRegistered
import godot.intellij.plugin.extension.isSignal
import godot.common.extensions.convertToSnakeCase
import org.jetbrains.kotlin.backend.jvm.ir.psiElement
import org.jetbrains.kotlin.descriptors.PropertyDescriptor
import org.jetbrains.kotlin.idea.base.psi.kotlinFqName
import org.jetbrains.kotlin.idea.caches.resolve.resolveToDescriptorIfAny
import org.jetbrains.kotlin.idea.refactoring.isAbstract
import org.jetbrains.kotlin.idea.searching.inheritors.findAllOverridings
import org.jetbrains.kotlin.idea.util.findAnnotation
import org.jetbrains.kotlin.lexer.KtTokens
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.psi.KtClass
import org.jetbrains.kotlin.psi.KtFunction
import org.jetbrains.kotlin.psi.KtProperty
import org.jetbrains.kotlin.resolve.DescriptorUtils
import org.jetbrains.kotlin.resolve.lazy.BodyResolveMode
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

        val lineMarkerData = when (val parent = element.parent) {
            is KtClass -> if (parent.findAnnotation(FqName(GODOT_SCRIPT_ANNOTATION)) != null) {
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

            is PsiClass -> if (parent.getAnnotation(GODOT_SCRIPT_ANNOTATION) != null) {
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

            is PsiMethod -> when {
                parent.getAnnotation(GODOT_MEMBER_ANNOTATION) != null -> LineMarkerData(
                    identifier = parent.nameIdentifier ?: parent.navigationElement,
                    convertedName = parent.name.convertToSnakeCase(),
                    gutterIcon = IconLoader.getIcon("/linemarkerIcons/icon_member_method.svg", this::class.java)
                )

                else -> {
                    val superMethods = parent.findSuperMethods()

                    val isAnySuperMethodAApiMethod = superMethods.any { superMethod ->
                        superMethod.annotations.any { superMethodAnnotation -> superMethodAnnotation.qualifiedName == GODOT_API_MEMBER_ANNOTATION }
                    }
                    val isAnySuperMethodRegistered = superMethods.any { it.isRegistered() }

                    if (isAnySuperMethodAApiMethod || isAnySuperMethodRegistered) {
                        LineMarkerData(
                            identifier = parent.nameIdentifier ?: parent.navigationElement,
                            convertedName = parent.name.convertToSnakeCase(),
                            gutterIcon = IconLoader.getIcon("/linemarkerIcons/icon_member_method.svg", this::class.java)
                        )
                    } else null
                }
            }

            is PsiField -> when {
                parent.getAnnotation(GODOT_MEMBER_ANNOTATION) != null -> LineMarkerData(
                    identifier = parent.nameIdentifier,
                    convertedName = parent.name.convertToSnakeCase(),
                    gutterIcon = IconLoader.getIcon("/linemarkerIcons/icon_member_property.svg", this::class.java)
                )

                parent.isSignal() -> LineMarkerData(
                    identifier = parent.nameIdentifier,
                    convertedName = parent.name.convertToSnakeCase(),
                    gutterIcon = IconLoader.getIcon("/linemarkerIcons/icon_member_signal.svg", this::class.java)
                )

                parent.getOverriddenFields().any { it.isRegistered() } -> LineMarkerData(
                    identifier = parent.nameIdentifier,
                    convertedName = parent.name.convertToSnakeCase(),
                    gutterIcon = IconLoader.getIcon("/linemarkerIcons/icon_member_property.svg", this::class.java)
                )

                else -> null
            }

            is KtProperty -> when {
                parent.findAnnotation(FqName(GODOT_MEMBER_ANNOTATION)) != null ||
                    parent.findAllOverridings().any { it.isRegistered() } -> parent.name?.let { name ->
                    LineMarkerData(
                        identifier = parent.nameIdentifier ?: parent.navigationElement,
                        convertedName = name.convertToSnakeCase(),
                        gutterIcon = IconLoader.getIcon("/linemarkerIcons/icon_member_property.svg", this::class.java)
                    )
                }

                parent.isSignal() -> parent.name?.let { name ->
                    LineMarkerData(
                        identifier = parent.nameIdentifier ?: parent.navigationElement,
                        convertedName = name.convertToSnakeCase(),
                        gutterIcon = IconLoader.getIcon("/linemarkerIcons/icon_member_signal.svg", this::class.java)
                    )
                }

                parent.getOverriddenProperties().any { it.isRegistered() } -> parent.name?.let { name ->
                    LineMarkerData(
                        identifier = parent.nameIdentifier ?: parent.navigationElement,
                        convertedName = name.convertToSnakeCase(),
                        gutterIcon = IconLoader.getIcon("/linemarkerIcons/icon_member_property.svg", this::class.java)
                    )
                }

                else -> null
            }

            is KtFunction -> when {
                parent.findAnnotation(FqName(GODOT_MEMBER_ANNOTATION)) != null -> parent.name?.let { name ->
                    LineMarkerData(
                        identifier = parent.nameIdentifier ?: parent.navigationElement,
                        convertedName = name.convertToSnakeCase(),
                        gutterIcon = IconLoader.getIcon("/linemarkerIcons/icon_member_method.svg", this::class.java)
                    )
                }

                else -> {
                    val superMethods = parent.findAllOverridings().filterIsInstance<KtFunction>()

                    val isAnySuperMethodAApiMethod = superMethods.any { superMethod ->
                        superMethod.annotations.any { superMethodAnnotation -> superMethodAnnotation.kotlinFqName?.asString() == GODOT_API_MEMBER_ANNOTATION }
                    }
                    val isAnySuperMethodRegistered = superMethods.any { it.isRegistered() }

                    if (isAnySuperMethodAApiMethod || isAnySuperMethodRegistered) {
                        parent.name?.let { name ->
                            LineMarkerData(
                                identifier = parent.nameIdentifier ?: parent.navigationElement,
                                convertedName = name.convertToSnakeCase(),
                                gutterIcon = IconLoader.getIcon("/linemarkerIcons/icon_member_method.svg", this::class.java)
                            )
                        }
                    } else null
                }
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


fun PsiField.getOverriddenFields(): List<PsiField> {
    val overriddenFields = mutableListOf<PsiField>()
    val containingClass = this.containingClass ?: return overriddenFields

    var superClass: PsiClass? = containingClass.superClass

    while (superClass != null) {
        for (superField in superClass.fields) {
            if (this.name == superField.name && this.type.isAssignableFrom(superField.type)) {
                overriddenFields.add(superField)
            }
        }
        superClass = superClass.superClass
    }

    return overriddenFields
}

fun KtProperty.getOverriddenProperties(): List<KtProperty> {
    // Resolve the property to a PropertyDescriptor
    val propertyDescriptor = this.resolveToDescriptorIfAny(BodyResolveMode.FULL) as? PropertyDescriptor
        ?: return emptyList()

    // Get overridden properties
    return DescriptorUtils
        .getAllOverriddenDescriptors(propertyDescriptor)
        .filterIsInstance<PropertyDescriptor>()
        .mapNotNull { it.psiElement }
        .filterIsInstance<KtProperty>()
}
