package godot.intellij.plugin.linemarker

import com.intellij.codeInsight.daemon.LineMarkerInfo
import com.intellij.codeInsight.daemon.LineMarkerProvider
import com.intellij.openapi.editor.markup.GutterIconRenderer
import com.intellij.openapi.util.IconLoader
import com.intellij.psi.PsiElement
import com.intellij.psi.impl.source.tree.LeafPsiElement
import godot.intellij.plugin.data.cache.godotroot.getGodotRoot
import godot.intellij.plugin.data.cache.signalconnection.SignalConnectionCacheProvider
import godot.intellij.plugin.extension.isSignal
import godot.intellij.plugin.ui.dialog.IncomingSignalConnectionsDialog
import godot.intellij.plugin.ui.dialog.OutgoingSignalConnectionsDialog
import org.jetbrains.kotlin.lexer.KtTokens
import org.jetbrains.kotlin.nj2k.postProcessing.type
import org.jetbrains.kotlin.psi.KtFunction
import org.jetbrains.kotlin.psi.KtProperty
import org.jetbrains.kotlin.psi.psiUtil.containingClass
import kotlin.text.Typography.nbsp

class SignalConnectionLineMarker : LineMarkerProvider {
    override fun getLineMarkerInfo(element: PsiElement): LineMarkerInfo<*>? {
        val godotRoot = element.getGodotRoot() ?: return null

        if (element !is LeafPsiElement || element.elementType != KtTokens.IDENTIFIER) {
            return null
        }

        val parent = element.parent
        if (parent is KtProperty && parent.type().isSignal()) {
            val containingClassFqName = parent.containingClass()?.fqName?.asString() ?: return null
            val propertyName = parent.name ?: return null
            val signalConnectionHandler = SignalConnectionCacheProvider.provide(parent.project, godotRoot)

            val signalConnections = signalConnectionHandler
                .getOutgoingKtSignalConnection(
                    containingClassFqName,
                    propertyName
                )

            val tooltip = buildString {
                signalConnections.forEachIndexed { index, pluginOutgoingKtScriptSignalConnection ->
                    if (index != 0) {
                        appendLine()
                    }
                    // normal space gets trimmed
                    appendLine("Scene: ${pluginOutgoingKtScriptSignalConnection.scenePath}")
                    appendLine("$nbsp${nbsp}Target Node: ${pluginOutgoingKtScriptSignalConnection.targetNodeName}")
                    appendLine("$nbsp${nbsp}Target Function: ::${pluginOutgoingKtScriptSignalConnection.targetFunctionName}")
                    appendLine("$nbsp${nbsp}Script: ${pluginOutgoingKtScriptSignalConnection.targetScriptPath}")
                }
            }

            if (signalConnections.isEmpty()) return null
            val signalIdentifyingElement = parent.identifyingElement ?: return null

            val imageIcon = IconLoader.getIcon("/icon_signals.svg", this::class.java)
            return LineMarkerInfo(
                signalIdentifyingElement,
                signalIdentifyingElement.textRange,
                imageIcon,
                { tooltip },
                { _, _ ->
                    OutgoingSignalConnectionsDialog(signalConnections).show()
                },
                GutterIconRenderer.Alignment.LEFT,
                { "outgoing kt script signal connection" }
            )
        }

        if (parent is KtFunction) {
            val containingClassFqName = parent.containingClass()?.fqName?.asString() ?: return null
            val functionName = parent.name ?: return null
            val signalConnectionHandler = SignalConnectionCacheProvider.provide(parent.project, godotRoot)

            val signalConnections = signalConnectionHandler
                .getIncomingKtSignalConnection(
                    containingClassFqName,
                    functionName
                )

            val tooltip = buildString {
                signalConnections.forEachIndexed { index, pluginIncomingKtScriptSignalConnection ->
                    if (index != 0) {
                        appendLine()
                    }
                    // normal space gets trimmed
                    appendLine("Scene: ${pluginIncomingKtScriptSignalConnection.scenePath}")
                    appendLine("$nbsp$nbsp${pluginIncomingKtScriptSignalConnection.signalName}:")
                    appendLine("$nbsp$nbsp$nbsp${nbsp}Source Node: ${pluginIncomingKtScriptSignalConnection.fromNodeName}")
                    appendLine("$nbsp$nbsp$nbsp${nbsp}Script: ${pluginIncomingKtScriptSignalConnection.fromScriptPath}")
                }
            }

            if (signalConnections.isEmpty()) return null
            val signalIdentifyingElement = parent.identifyingElement ?: return null

            val imageIcon = IconLoader.getIcon("/icon_slot.svg", this::class.java)
            return LineMarkerInfo(
                signalIdentifyingElement,
                signalIdentifyingElement.textRange,
                imageIcon,
                { tooltip },
                { _, _ ->
                    IncomingSignalConnectionsDialog(signalConnections).show()
                },
                GutterIconRenderer.Alignment.LEFT,
                { "incoming kt script signal connection" }
            )
        }

        return null
    }
}
