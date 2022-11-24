package godot.intellij.plugin.codevision

import com.intellij.codeInsight.hints.ChangeListener
import com.intellij.codeInsight.hints.FactoryInlayHintsCollector
import com.intellij.codeInsight.hints.ImmediateConfigurable
import com.intellij.codeInsight.hints.InlayHintsCollector
import com.intellij.codeInsight.hints.InlayHintsProvider
import com.intellij.codeInsight.hints.InlayHintsSink
import com.intellij.codeInsight.hints.InlayPresentationFactory
import com.intellij.codeInsight.hints.NoSettings
import com.intellij.codeInsight.hints.SettingsKey
import com.intellij.openapi.editor.Editor
import com.intellij.openapi.editor.ex.util.EditorUtil
import com.intellij.openapi.ide.CopyPasteManager
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.refactoring.suggested.startOffset
import com.intellij.ui.layout.panel
import godot.intellij.plugin.GodotPluginBundle
import godot.intellij.plugin.data.model.REGISTER_CLASS_ANNOTATION
import godot.intellij.plugin.data.model.REGISTER_FUNCTION_ANNOTATION
import godot.intellij.plugin.data.model.REGISTER_PROPERTY_ANNOTATION
import godot.intellij.plugin.data.model.REGISTER_SIGNAL_ANNOTATION
import godot.intellij.plugin.extension.camelToSnakeCase
import godot.intellij.plugin.extension.getRegisteredClassName
import org.jetbrains.kotlin.idea.util.findAnnotation
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.psi.KtClass
import org.jetbrains.kotlin.psi.KtFile
import org.jetbrains.kotlin.psi.KtNamedFunction
import org.jetbrains.kotlin.psi.KtProperty
import org.jetbrains.kotlin.psi.psiUtil.isAbstract
import java.awt.Point
import java.awt.datatransfer.StringSelection
import java.awt.event.MouseEvent
import javax.swing.JPanel

@Suppress("UnstableApiUsage")
class RegisteredNameInlayHint : InlayHintsProvider<Any> {

    override val key: SettingsKey<Any> = SettingsKey("kotlin.references.types.hints")
    override val name: String = GodotPluginBundle.message("codeVision.name")
    override val previewText: String? = null

    override fun createConfigurable(settings: Any): ImmediateConfigurable = object : ImmediateConfigurable {
        override fun reset() {
            // no op
        }

        override fun createComponent(listener: ChangeListener): JPanel = panel {}
        override val cases: List<ImmediateConfigurable.Case> = emptyList()
        override val mainCheckboxText: String = GodotPluginBundle.message("codeVision.settings.enableCheckbox")
    }

    override fun createSettings(): NoSettings = NoSettings()

    override fun getCollectorFor(
        file: PsiFile,
        editor: Editor,
        settings: Any,
        sink: InlayHintsSink
    ): InlayHintsCollector {
        return object : InlayHintsCollector, FactoryInlayHintsCollector(editor) {
            override fun collect(element: PsiElement, editor: Editor, sink: InlayHintsSink): Boolean {
                return if (element is KtFile) {
                    val classes = element
                        .children
                        .filterIsInstance<KtClass>()

                    val registeredClasses = classes
                        .filter { it.findAnnotation(FqName(REGISTER_CLASS_ANNOTATION)) != null }

                    val functions = classes
                        .flatMap { it.declarations.filterIsInstance<KtNamedFunction>() }
                        .filter { it.findAnnotation(FqName(REGISTER_FUNCTION_ANNOTATION)) != null }
                        .filter { it.name != null }

                    val properties = classes
                        .flatMap { it.declarations.filterIsInstance<KtProperty>() }
                        .filter { it.findAnnotation(FqName(REGISTER_PROPERTY_ANNOTATION)) != null }
                        .filter { it.name != null }

                    val signals = classes
                        .flatMap { it.declarations.filterIsInstance<KtProperty>() }
                        .filter { it.findAnnotation(FqName(REGISTER_SIGNAL_ANNOTATION)) != null }
                        .filter { it.name != null }

                    registeredClasses.forEach { ktClass ->
                        showCodeVision(
                            textOffset = ktClass.textOffset,
                            startOffset = ktClass.startOffset,
                            convertedName = if (ktClass.isAbstract()) {
                                GodotPluginBundle.message(
                                    "codeVision.registeredName.notRegisteredBecauseIsAbstract.text"
                                )
                            } else {
                                ktClass.getRegisteredClassName()?.second ?: "<unknown>"
                            },
                            editor = editor,
                            sink = sink,
                            shouldCopyOnClick = !ktClass.isAbstract()
                        )
                    }

                    functions.forEach { ktFunction ->
                        showCodeVision(
                            textOffset = ktFunction.textOffset,
                            startOffset = ktFunction.startOffset,
                            convertedName = ktFunction.name?.camelToSnakeCase() ?: "<unknown>",
                            editor = editor,
                            sink = sink
                        )
                    }

                    properties.forEach { ktProperty ->
                        showCodeVision(
                            textOffset = ktProperty.textOffset,
                            startOffset = ktProperty.startOffset,
                            convertedName = ktProperty.name?.camelToSnakeCase() ?: "<unknown>",
                            editor = editor,
                            sink = sink
                        )
                    }

                    signals.forEach { ktProperty ->
                        showCodeVision(
                            textOffset = ktProperty.textOffset,
                            startOffset = ktProperty.startOffset,
                            convertedName = ktProperty
                                .name
                                ?.camelToSnakeCase()
                                ?: "<unknown>",
                            editor = editor,
                            sink = sink
                        )
                    }

                    registeredClasses.isNotEmpty() || functions.isNotEmpty() || properties.isNotEmpty() || signals.isNotEmpty()
                } else false
            }
        }
    }

    private fun FactoryInlayHintsCollector.showCodeVision(
        textOffset: Int,
        startOffset: Int,
        convertedName: String,
        editor: Editor,
        sink: InlayHintsSink,
        shouldCopyOnClick: Boolean = true
    ) {
        val line = editor.document.getLineNumber(startOffset)
        val lineStart = editor.document.getLineStartOffset(line)
        val indent = EditorUtil.getPlainSpaceWidth(editor) * (startOffset - lineStart)
        sink.addBlockElement(
            offset = textOffset,
            relatesToPrecedingText = false,
            showAbove = true,
            priority = 0,
            presentation = if (shouldCopyOnClick) {
                factory.inset(
                    factory.withTooltip(
                        GodotPluginBundle.message("codeVision.registeredName.tooltip"),
                        factory.referenceOnHover(
                            factory.text(
                                GodotPluginBundle.message(
                                    "codeVision.registeredName.text",
                                    convertedName
                                )
                            ),
                            // has to be explicit for backwards compatibility with IJ203
                            @Suppress("ObjectLiteralToLambda")
                            object : InlayPresentationFactory.ClickListener {
                                override fun onClick(event: MouseEvent, translated: Point) {
                                    CopyPasteManager.getInstance().setContents(StringSelection(convertedName))
                                }
                            }
                        )
                    ),
                    indent
                )
            } else {
                factory.text(convertedName)
            }
        )
    }
}
