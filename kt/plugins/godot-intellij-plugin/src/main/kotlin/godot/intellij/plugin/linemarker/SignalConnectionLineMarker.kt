package godot.intellij.plugin.linemarker

import com.intellij.codeInsight.daemon.LineMarkerInfo
import com.intellij.codeInsight.daemon.LineMarkerProvider
import com.intellij.openapi.editor.markup.GutterIconRenderer
import com.intellij.openapi.util.IconLoader
import com.intellij.psi.PsiElement
import godot.intellij.plugin.signal.SignalConnectionHandlerProvider
import org.jetbrains.kotlin.js.descriptorUtils.getJetTypeFqName
import org.jetbrains.kotlin.nj2k.postProcessing.type
import org.jetbrains.kotlin.psi.KtFunction
import org.jetbrains.kotlin.psi.KtProperty
import org.jetbrains.kotlin.psi.psiUtil.containingClass
import org.jetbrains.kotlin.types.KotlinType
import org.jetbrains.kotlin.types.typeUtil.supertypes
import kotlin.text.Typography.nbsp

class SignalConnectionLineMarker : LineMarkerProvider {
    override fun getLineMarkerInfo(element: PsiElement): LineMarkerInfo<*>? {

        if (element is KtProperty && element.type().isSignal()) {
            val project = element.project
            val containingClassFqName = element.containingClass()?.fqName?.asString() ?: return null
            val propertyName = element.name ?: return null
            val signalConnectionHandler = SignalConnectionHandlerProvider.getInstanceForProject(project)

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
                    //normal space gets trimmed
                    appendLine("Scene: ${pluginOutgoingKtScriptSignalConnection.scenePath}")
                    appendLine("$nbsp${nbsp}Target: ${pluginOutgoingKtScriptSignalConnection.targetNodeName}::${pluginOutgoingKtScriptSignalConnection.targetMethodName}")
                    appendLine("$nbsp$nbsp$nbsp${nbsp}Script: ${pluginOutgoingKtScriptSignalConnection.targetScriptPath}")
                }
            }

            if (signalConnections.isEmpty()) return null
            val signalIdentifyingElement = element.identifyingElement ?: return null

            val imageIcon = IconLoader.getIcon("/icon_signals.svg", this::class.java)
            return LineMarkerInfo(
                signalIdentifyingElement,
                signalIdentifyingElement.textRange,
                imageIcon,
                { tooltip },
                null,
                GutterIconRenderer.Alignment.LEFT,
                { "outgoing kt script signal connection" }
            )
        }

        if (element is KtFunction) {
            val project = element.project
            val containingClassFqName = element.containingClass()?.fqName?.asString() ?: return null
            val functionName = element.name ?: return null
            val signalConnectionHandler = SignalConnectionHandlerProvider.getInstanceForProject(project)

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
                    //normal space gets trimmed
                    appendLine("Scene: ${pluginIncomingKtScriptSignalConnection.scenePath}")
                    appendLine("$nbsp$nbsp${pluginIncomingKtScriptSignalConnection.signalName}:")
                    appendLine("$nbsp$nbsp$nbsp${nbsp}Source: ${pluginIncomingKtScriptSignalConnection.fromNodeName}")
                    appendLine("$nbsp$nbsp$nbsp${nbsp}Script: ${pluginIncomingKtScriptSignalConnection.fromScriptPath}")
                }
            }

            if (signalConnections.isEmpty()) return null
            val signalIdentifyingElement = element.identifyingElement ?: return null

            val imageIcon = IconLoader.getIcon("/icon_slot.svg", this::class.java)
            return LineMarkerInfo(
                signalIdentifyingElement,
                signalIdentifyingElement.textRange,
                imageIcon,
                { tooltip },
                null,
                GutterIconRenderer.Alignment.LEFT,
                { "incoming kt script signal connection" }
            )
        }

        return null
    }
}

private fun KotlinType?.isSignal(): Boolean {
    if (this == null) return false
    return if (getJetTypeFqName(false) == "godot.signals.Signal") {
        true
    } else {
        supertypes()
            .any { supertype ->
                supertype.getJetTypeFqName(false) == "godot.signals.Signal"
            }
    }
}
