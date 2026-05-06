@file:Suppress("unused")

package godot.tools.common.names

import com.squareup.kotlinpoet.ClassName

object Annotation {
    @Suppress("NOTHING_TO_INLINE")
    private inline fun annotationName(simpleName: String) = ClassName(godotAnnotationPackage, simpleName)

    val registerClass = annotationName("RegisterClass")
    val tool = annotationName("Tool")
    val registerFunction = annotationName("RegisterFunction")
    val registerProperty = annotationName("RegisterProperty")
    val export = annotationName("Export")
    val registerSignal = annotationName("RegisterSignal")
    val godotBaseType = annotationName("GodotBaseType")
    val coreTypeHelper = annotationName("CoreTypeHelper")
    val coreTypeLocalCopy = annotationName("CoreTypeLocalCopy")
    val rpc = annotationName("Rpc")
    val range = annotationName("Range")
    val intRange = annotationName("IntRange")
    val longRange = annotationName("LongRange")
    val floatRange = annotationName("FloatRange")
    val doubleRange = annotationName("DoubleRange")
    val expRange = annotationName("ExpRange")
    val expEasing = annotationName("ExpEasing")
    val enumTypeHint = annotationName("EnumTypeHint")
    val enumFlag = annotationName("EnumFlag")
    val intFlag = annotationName("IntFlag")
    val file = annotationName("File")
    val dir = annotationName("Dir")
    val multilineText = annotationName("MultilineText")
    val placeHolderText = annotationName("PlaceHolderText")
    val colorNoAlpha = annotationName("ColorNoAlpha")
}
