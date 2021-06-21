package godot.entrygenerator.generator.typehint.primitives

import com.squareup.kotlinpoet.ClassName
import godot.entrygenerator.exceptions.WrongAnnotationUsageException
import godot.entrygenerator.generator.typehint.PropertyTypeHintGenerator
import godot.entrygenerator.model.MultilineTextHintAnnotation
import godot.entrygenerator.model.PlaceHolderTextHintAnnotation
import godot.entrygenerator.model.RegisteredProperty

class JvmPrimitivesTypeHintGenerator(
    private val registeredProperty: RegisteredProperty
) : PropertyTypeHintGenerator(registeredProperty) {
    override fun getPropertyTypeHint(): ClassName {
        return when (propertyHintAnnotation) {
            MultilineTextHintAnnotation -> ClassName("godot.core.PropertyHint", "MULTILINE_TEXT")
            PlaceHolderTextHintAnnotation -> ClassName("godot.core.PropertyHint", "PLACE_HOLDER_TEXT")
//            "godot.annotation.IntRange", "godot.annotation.FloatRange", "godot.annotation.DoubleRange" ->
//                ClassName("godot.core.PropertyHint", "RANGE")
//            "godot.annotation.ExpRange" ->
//                ClassName("godot.core.PropertyHint", "EXP_RANGE")
//            "godot.annotation.ExpEasing" ->
//                ClassName("godot.core.PropertyHint", "EXP_EASING")
//            "godot.annotation.Lenght" ->
//                ClassName("godot.core.PropertyHint", "LENGHT")
//            "godot.annotation.Layers2DRender" ->
//                ClassName("godot.core.PropertyHint", "LAYERS_2D_RENDER")
//            "godot.annotation.Layers2DPhysics" ->
//                ClassName("godot.core.PropertyHint", "LAYERS_2D_PHYSICS")
//            "godot.annotation.Layers3DRender" ->
//                ClassName("godot.core.PropertyHint", "LAYERS_3D_RENDER")
//            "godot.annotation.Layers3DPhysics" ->
//                ClassName("godot.core.PropertyHint", "LAYERS_3D_PHYSICS")
//            "godot.annotation.File" ->
//                if (propertyHintAnnotation.getAnnotationValue(FILE_AND_DIR_ANNOTATION_GLOBAL_ARGUMENT, false)) {
//                    ClassName("godot.core.PropertyHint", "GLOBAL_FILE")
//                } else {
//                    ClassName("godot.core.PropertyHint", "FILE")
//                }
//            "godot.annotation.Dir" ->
//                if (propertyHintAnnotation.getAnnotationValue(FILE_AND_DIR_ANNOTATION_GLOBAL_ARGUMENT, false)) {
//                    ClassName("godot.core.PropertyHint", "GLOBAL_DIR")
//                } else {
//                    ClassName("godot.core.PropertyHint", "DIR")
//                }
//            "godot.annotation.MultilineText" ->
//                ClassName("godot.core.PropertyHint", "MULTILINE_TEXT")
//            "godot.annotation.PlaceHolderText" ->
//                ClassName("godot.core.PropertyHint", "PLACE_HOLDER_TEXT")
//            "godot.annotation.ObjectId" ->
//                ClassName("godot.core.PropertyHint", "OBJECT_ID")
//            "godot.annotation.TypeString" ->
//                ClassName("godot.core.PropertyHint", "TYPE_STRING")
//            "godot.annotation.MethodOfVariantType" ->
//                ClassName("godot.core.PropertyHint", "METHOD_OF_VARIANT_TYPE")
//            "godot.annotation.MethodOfBaseType" ->
//                ClassName("godot.core.PropertyHint", "METHOD_OF_BASE_TYPE")
//            "godot.annotation.MethodOfInstance" ->
//                ClassName("godot.core.PropertyHint", "METHOD_OF_INSTANCE")
//            "godot.annotation.MethodOfScript" ->
//                ClassName("godot.core.PropertyHint", "METHOD_OF_SCRIPT")
//            "godot.annotation.PropertyOfVariantType" ->
//                ClassName("godot.core.PropertyHint", "PROPERTY_OF_VARIANT_TYPE")
//            "godot.annotation.PropertyOfBaseType" ->
//                ClassName("godot.core.PropertyHint", "PROPERTY_OF_BASE_TYPE")
//            "godot.annotation.PropertyOfInstance" ->
//                ClassName("godot.core.PropertyHint", "PROPERTY_OF_INSTANCE")
//            "godot.annotation.PropertyOfScript" ->
//                ClassName("godot.core.PropertyHint", "PROPERTY_OF_SCRIPT")
//            "godot.annotation.SaveFile" ->
//                ClassName("godot.core.PropertyHint", "SAVE_FILE")
//            "godot.annotation.IntIsObjectId" ->
//                ClassName("godot.core.PropertyHint", "INT_IS_OBJECT_ID")
//            null -> ClassName("godot.core.PropertyHint", "NONE")

            else -> throw WrongAnnotationUsageException(registeredProperty, propertyHintAnnotation)
        }
    }
}
