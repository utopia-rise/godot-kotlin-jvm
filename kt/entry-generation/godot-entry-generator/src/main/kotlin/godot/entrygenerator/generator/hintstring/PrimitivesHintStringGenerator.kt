package godot.entrygenerator.generator.hintstring

import godot.entrygenerator.exceptions.WrongAnnotationUsageException
import godot.entrygenerator.model.DirHintAnnotation
import godot.entrygenerator.model.DoubleRangeHintAnnotation
import godot.entrygenerator.model.ExpEasingHintAnnotation
import godot.entrygenerator.model.ExpRangeHintAnnotation
import godot.entrygenerator.model.FileHintAnnotation
import godot.entrygenerator.model.FloatRangeHintAnnotation
import godot.entrygenerator.model.IntRangeHintAnnotation
import godot.entrygenerator.model.LongRangeHintAnnotation
import godot.entrygenerator.model.MultilineTextHintAnnotation
import godot.entrygenerator.model.PlaceHolderTextHintAnnotation
import godot.entrygenerator.model.Range
import godot.entrygenerator.model.RangeHintAnnotation
import godot.entrygenerator.model.RegisteredProperty
import java.util.*
import kotlin.reflect.KClass

class PrimitivesHintStringGenerator(
    registeredProperty: RegisteredProperty
) : PropertyHintStringGenerator(registeredProperty) {
    override fun getHintString(): String {
        return when (propertyHintAnnotation) {
            is IntRangeHintAnnotation -> getRangeHintString(arrayOf(Int::class))
            is LongRangeHintAnnotation -> getRangeHintString(arrayOf(Long::class))
            is FloatRangeHintAnnotation -> getRangeHintString(arrayOf(Float::class))
            is DoubleRangeHintAnnotation -> getRangeHintString(arrayOf(Double::class))
            is ExpRangeHintAnnotation -> getRangeHintString(arrayOf(Float::class, Double::class))
            is ExpEasingHintAnnotation -> getExpEasingHintString()
//            "godot.annotation.Lenght" -> throw NotImplementedError("@Lenght annotation is not yet implemented")
//            "godot.annotation.Layers2DRender" -> throw NotImplementedError("@Layers2DRender annotation is not yet implemented")
//            "godot.annotation.Layers2DPhysics" -> throw NotImplementedError("@Layers2DPhysics annotation is not yet implemented")
//            "godot.annotation.Layers3DRender" -> throw NotImplementedError("@Layers3DRender annotation is not yet implemented")
//            "godot.annotation.Layers3DPhysics" -> throw NotImplementedError("@Layers3DPhysics annotation is not yet implemented")
            is FileHintAnnotation -> getFileHintString()
//            "godot.annotation.TypeString" -> throw NotImplementedError("@TypeString annotation is not yet implemented")
//            "godot.annotation.MethodOfVariantType" -> throw NotImplementedError("@MethodOfVariantType annotation is not yet implemented")
//            "godot.annotation.MethodOfBaseType" -> throw NotImplementedError("@MethodOfBaseType annotation is not yet implemented")
//            "godot.annotation.MethodOfInstance" -> throw NotImplementedError("@MethodOfInstance annotation is not yet implemented")
//            "godot.annotation.MethodOfScript" -> throw NotImplementedError("@MethodOfScript annotation is not yet implemented")
//            "godot.annotation.PropertyOfVariantType" -> throw NotImplementedError("@PropertyOfVariantType annotation is not yet implemented")
//            "godot.annotation.PropertyOfBaseType" -> throw NotImplementedError("@PropertyOfBaseType annotation is not yet implemented")
//            "godot.annotation.PropertyOfInstance" -> throw NotImplementedError("@PropertyOfInstance annotation is not yet implemented")
//            "godot.annotation.PropertyOfScript" -> throw NotImplementedError("@PropertyOfScript annotation is not yet implemented")
//            "godot.annotation.SaveFile" -> throw NotImplementedError("@SaveFile annotation is not yet implemented")
//            "godot.annotation.IntIsObjectId" -> throw NotImplementedError("@IntIsObjectId annotation is not yet implemented")
//            "godot.annotation.Max" -> throw NotImplementedError("@Max annotation is not yet implemented")
            is DirHintAnnotation,
            is MultilineTextHintAnnotation,
            is PlaceHolderTextHintAnnotation,
            null -> ""
            else -> throw IllegalStateException("Unknown annotation $propertyHintAnnotation")
        }
    }

    private fun getRangeHintString(expectedTypes: Array<KClass<*>>): String {
        if (expectedTypes.map { it::class.qualifiedName }.contains(registeredProperty.type.fqName)) {
            throw WrongAnnotationUsageException(registeredProperty, propertyHintAnnotation, expectedTypes.toString())
        }
        require(propertyHintAnnotation is RangeHintAnnotation<*>)

        val argumentsForStringTemplate = mutableListOf<Any>()

        argumentsForStringTemplate.add(propertyHintAnnotation.start)
        argumentsForStringTemplate.add(propertyHintAnnotation.end)
        when(val step = propertyHintAnnotation.step) {
            Int, Long, Float, Double -> if (step != -1) argumentsForStringTemplate.add(propertyHintAnnotation.step)
        }
        when(propertyHintAnnotation) {
            is DoubleRangeHintAnnotation -> if (propertyHintAnnotation.or != Range.NONE) {
                argumentsForStringTemplate.add(propertyHintAnnotation.or.name.lowercase(Locale.ENGLISH))
            }
            is FloatRangeHintAnnotation -> if (propertyHintAnnotation.or != Range.NONE) {
                argumentsForStringTemplate.add(propertyHintAnnotation.or.name.lowercase(Locale.ENGLISH))
            }
            is IntRangeHintAnnotation -> if (propertyHintAnnotation.or != Range.NONE) {
                argumentsForStringTemplate.add(propertyHintAnnotation.or.name.lowercase(Locale.ENGLISH))
            }
            else -> {
                //no op
            }
        }

        return argumentsForStringTemplate.joinToString(",")
    }

    private fun getExpEasingHintString(): String {
        if (listOf(Float::class, Double::class).map { it.toString() }.contains(registeredProperty.type.toString())) {
            throw WrongAnnotationUsageException(registeredProperty, propertyHintAnnotation, "Floats and Doubles")
        }
        require(propertyHintAnnotation is ExpEasingHintAnnotation)

        return when {
            propertyHintAnnotation.attenuation && propertyHintAnnotation.inOut -> "attenuation,inout"
            propertyHintAnnotation.attenuation -> "attenuation"
            propertyHintAnnotation.inOut -> "inout"
            else -> ""
        }
    }

    private fun getFileHintString(): String {
        if (registeredProperty.type.fqName != "kotlin.String") {
            throw WrongAnnotationUsageException(registeredProperty, propertyHintAnnotation, "String")
        }

        val extensions = when(propertyHintAnnotation) {
            is FileHintAnnotation -> propertyHintAnnotation.extensions
            else -> throw IllegalStateException("Only DirHintAnnotation or FileHintAnnotation expected")
        }.map { it.replace("\"", "") }

        return extensions.joinToString(",")
    }
}
