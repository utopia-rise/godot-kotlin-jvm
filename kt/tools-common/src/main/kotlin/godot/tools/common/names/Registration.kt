@file:Suppress("unused")

package godot.tools.common.names

import com.squareup.kotlinpoet.ClassName

object Registration {
    @Suppress("NOTHING_TO_INLINE")
    private inline fun annotationName(simpleName: String) = ClassName(godotAnnotationPackage, simpleName)

    @Suppress("NOTHING_TO_INLINE")
    private inline fun registrationName(simpleName: String) = ClassName(godotRegistrationPackage, simpleName)

    val registerClass = annotationName("RegisterClass")
    val registerProperty = annotationName("RegisterProperty")
    val registerFunction = annotationName("RegisterFunction")
    val registerSignal = annotationName("RegisterSignal")
    val tool = annotationName("Tool")
    val export = annotationName("Export")
    val rpc = annotationName("Rpc")

    val ktFunctionArgument = registrationName("KtFunctionArgument")
    val classRegistry = registrationName("ClassRegistry")
    val classRegistrar = registrationName("ClassRegistrar")
    val entry = registrationName("Entry")

    fun generatedPackage(simpleName: String) = "$godotEntryBasePackage.$simpleName"

    fun generatedEntry(packageName: String) = ClassName(packageName, entry.simpleName)

    fun generatedRegistrar(simpleName: String) = ClassName(godotEntryBasePackage, "${simpleName}Registrar")
}
