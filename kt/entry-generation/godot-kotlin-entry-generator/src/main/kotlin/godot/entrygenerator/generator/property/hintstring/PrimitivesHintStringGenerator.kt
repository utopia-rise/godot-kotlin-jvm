package godot.entrygenerator.generator.property.hintstring

import com.squareup.kotlinpoet.ClassName
import godot.entrygenerator.exceptions.WrongAnnotationUsageException
import godot.entrygenerator.extension.getAnnotationValue
import godot.entrygenerator.model.*
import org.jetbrains.kotlin.descriptors.PropertyDescriptor
import org.jetbrains.kotlin.name.ClassId
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.name.Name
import org.jetbrains.kotlin.resolve.BindingContext
import org.jetbrains.kotlin.resolve.constants.StringValue
import org.jetbrains.kotlin.utils.join
import kotlin.reflect.KClass

class PrimitivesHintStringGenerator(
    propertyDescriptor: PropertyDescriptor,
    bindingContext: BindingContext
) : PropertyHintStringGenerator(propertyDescriptor, bindingContext) {
    override fun getHintString(): String {
        return when (propertyHintAnnotation?.fqName?.asString()) {
            "godot.annotation.IntRange" ->
                getRangeHintString(arrayOf(Int::class))
            "godot.annotation.FloatRange" ->
                getRangeHintString(arrayOf(Float::class))
            "godot.annotation.DoubleRange" ->
                getRangeHintString(arrayOf(Double::class))
            "godot.annotation.ExpRange" ->
                getRangeHintString(arrayOf(Float::class, Double::class))
            "godot.annotation.ExpEasing" -> getExpEasingHintString()
            "godot.annotation.Lenght" -> throw NotImplementedError("@Lenght annotation is not yet implemented")
            "godot.annotation.Layers2DRender" -> throw NotImplementedError("@Layers2DRender annotation is not yet implemented")
            "godot.annotation.Layers2DPhysics" -> throw NotImplementedError("@Layers2DPhysics annotation is not yet implemented")
            "godot.annotation.Layers3DRender" -> throw NotImplementedError("@Layers3DRender annotation is not yet implemented")
            "godot.annotation.Layers3DPhysics" -> throw NotImplementedError("@Layers3DPhysics annotation is not yet implemented")
            "godot.annotation.File", "godot.annotation.Dir" -> getFileOrDirHintString()
            "godot.annotation.MultilineText" -> throw NotImplementedError("@MultilineText annotation is not yet implemented")
            "godot.annotation.PlaceHolderText" -> throw NotImplementedError("@PlaceHolderText annotation is not yet implemented")
            "godot.annotation.TypeString" -> throw NotImplementedError("@TypeString annotation is not yet implemented")
            "godot.annotation.MethodOfVariantType" -> throw NotImplementedError("@MethodOfVariantType annotation is not yet implemented")
            "godot.annotation.MethodOfBaseType" -> throw NotImplementedError("@MethodOfBaseType annotation is not yet implemented")
            "godot.annotation.MethodOfInstance" -> throw NotImplementedError("@MethodOfInstance annotation is not yet implemented")
            "godot.annotation.MethodOfScript" -> throw NotImplementedError("@MethodOfScript annotation is not yet implemented")
            "godot.annotation.PropertyOfVariantType" -> throw NotImplementedError("@PropertyOfVariantType annotation is not yet implemented")
            "godot.annotation.PropertyOfBaseType" -> throw NotImplementedError("@PropertyOfBaseType annotation is not yet implemented")
            "godot.annotation.PropertyOfInstance" -> throw NotImplementedError("@PropertyOfInstance annotation is not yet implemented")
            "godot.annotation.PropertyOfScript" -> throw NotImplementedError("@PropertyOfScript annotation is not yet implemented")
            "godot.annotation.SaveFile" -> throw NotImplementedError("@SaveFile annotation is not yet implemented")
            "godot.annotation.IntIsObjectId" -> throw NotImplementedError("@IntIsObjectId annotation is not yet implemented")
            "godot.annotation.Max" -> throw NotImplementedError("@Max annotation is not yet implemented")
            null -> ""
            else -> throw IllegalStateException("Unknown annotation ${propertyHintAnnotation.fqName}")
        }
    }

    private fun getRangeHintString(expectedTypes: Array<KClass<*>>): String {
        if (expectedTypes.map { it.toString() }.contains(propertyDescriptor.type.toString())) {
            throw WrongAnnotationUsageException(propertyDescriptor, propertyHintAnnotation, expectedTypes.toString())
        }

        val start = propertyHintAnnotation!!.getAnnotationValue(RANGE_ANNOTATION_START_ARGUMENT, -1)
        val end = propertyHintAnnotation.getAnnotationValue(RANGE_ANNOTATION_END_ARGUMENT, -1)
        val step = propertyHintAnnotation.getAnnotationValue(RANGE_ANNOTATION_STEP_ARGUMENT, -1)
        val or = propertyHintAnnotation.getAnnotationValue(
            RANGE_ANNOTATION_OR_ARGUMENT,
            Pair(ClassId(FqName("godot.registration"), Name.identifier("Range")), Name.identifier("NONE"))
        )
        val orAsClassName = mapCompilerEnumRepresentationToClassName(or)

        val argumentsForStringTemplate = mutableListOf<Any>()

        argumentsForStringTemplate.add(start)
        argumentsForStringTemplate.add(end)
        if (step != -1) {
            argumentsForStringTemplate.add(step)
        }
        if (orAsClassName.toString() != "godot.registration.Range.NONE") {
            argumentsForStringTemplate.add(orAsClassName.toString().split(".").last().toLowerCase())
        }

        return join(argumentsForStringTemplate, ",")
    }

    private fun mapCompilerEnumRepresentationToClassName(enumRepresentation: Pair<ClassId, Name>): ClassName {
        return ClassName(
            enumRepresentation.first.asString().replace("/", ".").replace(".${enumRepresentation.second}", ""),
            enumRepresentation.second.asString()
        )
    }

    private fun getExpEasingHintString(): String {
        if (listOf(Float::class, Double::class).map { it.toString() }.contains(propertyDescriptor.type.toString())) {
            throw WrongAnnotationUsageException(propertyDescriptor, propertyHintAnnotation, "Floats and Doubles")
        }

        val attenuation = propertyHintAnnotation!!.getAnnotationValue(EXP_EASING_ANNOTATION_ATTENUATION_ARGUMENT, false)
        val inout = propertyHintAnnotation.getAnnotationValue(EXP_EASING_ANNOTATION_INOUT_ARGUMENT, true)

        val stringTemplateValues = when {
            attenuation && inout -> "attenuation,inout"
            attenuation -> "attenuation"
            inout -> "inout"
            else -> ""
        }

        return stringTemplateValues
    }

    private fun getFileOrDirHintString(): String {
        if (propertyDescriptor.type.toString() != "String") {
            throw WrongAnnotationUsageException(propertyDescriptor, propertyHintAnnotation, "String")
        }

        val extensions = propertyHintAnnotation!!
            .getAnnotationValue(FILE_AND_DIR_ANNOTATION_EXTENSIONS_ARGUMENT, ArrayList<StringValue>())
            .map { it.value.replace("\"", "") }

        return join(extensions, ",")
    }
}