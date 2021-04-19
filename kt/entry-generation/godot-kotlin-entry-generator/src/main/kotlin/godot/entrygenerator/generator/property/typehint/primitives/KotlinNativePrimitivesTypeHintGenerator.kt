package godot.entrygenerator.generator.property.typehint.primitives

import com.squareup.kotlinpoet.ClassName
import godot.entrygenerator.exceptions.WrongAnnotationUsageException
import godot.entrygenerator.extension.getAnnotationValue
import godot.entrygenerator.generator.property.typehint.PropertyTypeHintGenerator
import godot.entrygenerator.model.FILE_AND_DIR_ANNOTATION_GLOBAL_ARGUMENT
import org.jetbrains.kotlin.descriptors.PropertyDescriptor

class KotlinNativePrimitivesTypeHintGenerator(
    private val propertyDescriptor: PropertyDescriptor
) : PropertyTypeHintGenerator(propertyDescriptor) {
    override fun getPropertyTypeHint(): ClassName {
        return when (propertyHintAnnotation?.fqName?.asString()) {
            "godot.annotation.IntRange", "godot.annotation.FloatRange", "godot.annotation.DoubleRange" ->
                ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_RANGE")
            "godot.annotation.ExpRange" ->
                ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_EXP_RANGE")
            "godot.annotation.ExpEasing" ->
                ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_EXP_EASING")
            "godot.annotation.Lenght" ->
                ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_LENGHT")
            "godot.annotation.Layers2DRender" ->
                ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_LAYERS_2D_RENDER")
            "godot.annotation.Layers2DPhysics" ->
                ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_LAYERS_2D_PHYSICS")
            "godot.annotation.Layers3DRender" ->
                ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_LAYERS_3D_RENDER")
            "godot.annotation.Layers3DPhysics" ->
                ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_LAYERS_3D_PHYSICS")
            "godot.annotation.File" ->
                if (propertyHintAnnotation.getAnnotationValue(FILE_AND_DIR_ANNOTATION_GLOBAL_ARGUMENT, false)) {
                    ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_GLOBAL_FILE")
                } else {
                    ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_FILE")
                }
            "godot.annotation.Dir" ->
                if (propertyHintAnnotation.getAnnotationValue(FILE_AND_DIR_ANNOTATION_GLOBAL_ARGUMENT, false)) {
                    ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_GLOBAL_DIR")
                } else {
                    ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_DIR")
                }
            "godot.annotation.MultilineText" ->
                ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_MULTILINE_TEXT")
            "godot.annotation.PlaceHolderText" ->
                ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_PLACE_HOLDER_TEXT")
            "godot.annotation.ObjectId" ->
                ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_OBJECT_ID")
            "godot.annotation.TypeString" ->
                ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_TYPE_STRING")
            "godot.annotation.MethodOfVariantType" ->
                ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_METHOD_OF_VARIANT_TYPE")
            "godot.annotation.MethodOfBaseType" ->
                ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_METHOD_OF_BASE_TYPE")
            "godot.annotation.MethodOfInstance" ->
                ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_METHOD_OF_INSTANCE")
            "godot.annotation.MethodOfScript" ->
                ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_METHOD_OF_SCRIPT")
            "godot.annotation.PropertyOfVariantType" ->
                ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_PROPERTY_OF_VARIANT_TYPE")
            "godot.annotation.PropertyOfBaseType" ->
                ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_PROPERTY_OF_BASE_TYPE")
            "godot.annotation.PropertyOfInstance" ->
                ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_PROPERTY_OF_INSTANCE")
            "godot.annotation.PropertyOfScript" ->
                ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_PROPERTY_OF_SCRIPT")
            "godot.annotation.SaveFile" ->
                ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_SAVE_FILE")
            "godot.annotation.IntIsObjectId" ->
                ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_INT_IS_OBJECT_ID")
            "godot.annotation.Max" -> ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_MAX")
            null -> ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_NONE")
            else -> throw WrongAnnotationUsageException(propertyDescriptor, propertyHintAnnotation)
        }
    }
}
