package godot.annotation.processor.classgraph.mapper

import godot.annotation.ColorNoAlpha
import godot.annotation.Dir
import godot.annotation.DoubleRange
import godot.annotation.ExpEasing
import godot.annotation.File
import godot.annotation.FloatRange
import godot.annotation.IntFlag
import godot.annotation.MultilineText
import godot.annotation.PlaceHolderText
import godot.registration.model.hint.property.ColorNoAlphaHint
import godot.registration.model.hint.property.DirHint
import godot.registration.model.hint.property.ExpEasingHint
import godot.registration.model.hint.property.FileHint
import godot.registration.model.hint.property.IntFlagHint
import godot.registration.model.hint.property.MultilineTextHint
import godot.registration.model.hint.property.PlaceHolderTextHint
import godot.registration.model.hint.property.PropertyHint
import godot.registration.model.hint.property.Range
import godot.registration.model.hint.property.RangeHint
import io.github.classgraph.AnnotationEnumValue
import io.github.classgraph.AnnotationInfo

object AnnotationMapper {
    @Suppress("UNCHECKED_CAST")
    fun toPropertyHint(annotationInfo: AnnotationInfo): PropertyHint? =
        when (annotationInfo.name) {
            IntFlag::class.java.name -> IntFlagHint(
                annotationInfo.parameterValues.getValue("values") as? List<String> ?: emptyList()
            )

            MultilineText::class.java.name -> MultilineTextHint()
            PlaceHolderText::class.java.name -> PlaceHolderTextHint()
            ColorNoAlpha::class.java.name -> ColorNoAlphaHint()
            IntRange::class.java.name -> annotationInfo.provideRangeHint(-1)
            LongRange::class.java.name -> annotationInfo.provideRangeHint(-1L)
            FloatRange::class.java.name -> annotationInfo.provideRangeHint(-1f)
            DoubleRange::class.java.name -> annotationInfo.provideRangeHint(-1.0)
            ExpEasing::class.java.name -> ExpEasingHint(
                attenuation = annotationInfo.parameterValues.getValue("attenuation") as? Boolean ?: false,
                isPositiveOnly = annotationInfo.parameterValues.getValue("isPositiveOnly") as? Boolean ?: false,
            )

            File::class.java.name -> FileHint(
                extensions = annotationInfo.parameterValues.getValue("extensions") as? List<String> ?: emptyList(),
                global = annotationInfo.parameterValues.getValue("global") as? Boolean ?: false,
            )

            Dir::class.java.name -> DirHint(
                global = annotationInfo.parameterValues.getValue("global") as? Boolean ?: false,
            )

            else -> null
        }

    @Suppress("UNCHECKED_CAST")
    private fun <T : Number> AnnotationInfo.provideRangeHint(stepDefault: T): RangeHint<T> {
        val start = parameterValues.getValue("min") as T
        val end = parameterValues.getValue("max") as T
        val step = parameterValues.getValue("step") as? T ?: stepDefault
        val or = Range.valueOf((parameterValues.getValue("or") as AnnotationEnumValue).valueName)
        val hideSlider = parameterValues.getValue("hideSlider") as? Boolean ?: false
        val isRadians = parameterValues.getValue("isRadians") as? Boolean ?: false
        val isDegrees = parameterValues.getValue("isDegrees") as? Boolean ?: false
        val isExp = parameterValues.getValue("isExp") as? Boolean ?: false
        val suffix = parameterValues.getValue("suffix")?.toString()?.takeIf { it != "<none>" }

        return RangeHint(
            start = start,
            end = end,
            step = step,
            or = or,
            hideSlider = hideSlider,
            isRadians = isRadians,
            isDegrees = isDegrees,
            isExp = isExp,
            suffix = suffix,
        )
    }
}
