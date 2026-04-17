package godot.codegen.constants

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.DOUBLE
import com.squareup.kotlinpoet.FLOAT
import com.squareup.kotlinpoet.INT
import com.squareup.kotlinpoet.LONG
import godot.codegen.exceptions.MetaNotFoundException

object GodotMeta {
    object Int {
        const val int8 = "int8"
        const val int16 = "int16"
        const val int32 = "int32"
        const val int64 = "int64"

        const val uint8 = "uint8"
        const val uint16 = "uint16"
        const val uint32 = "uint32"
        const val uint64 = "uint64"

        const val char32 = "char32"
    }

    object Float {
        const val float = "float"
        const val double = "double"
    }

    object Object {
        const val required = "required"
    }

    object CastLiterals {
        const val none = ""
        const val toLong = ".toLong()"
        const val toInt = ".toInt()"
        const val toFloat = ".toFloat()"
        const val toDouble = ".toDouble()"
    }

    private val metaInformations = mapOf(
        Int.int8 to MetaInformation(INT, LONG, CastLiterals.toLong, CastLiterals.toInt, false),
        Int.int16 to MetaInformation(INT, LONG, CastLiterals.toLong, CastLiterals.toInt, false),
        Int.int32 to MetaInformation(INT, LONG, CastLiterals.toLong, CastLiterals.toInt, false),
        Int.int64 to MetaInformation(LONG, LONG, CastLiterals.none, CastLiterals.none, false),

        Int.uint8 to MetaInformation(INT, LONG, CastLiterals.toLong, CastLiterals.toInt, false),
        Int.uint16 to MetaInformation(INT, LONG, CastLiterals.toLong, CastLiterals.toInt, false),
        Int.uint32 to MetaInformation(LONG, LONG, CastLiterals.none, CastLiterals.none, false),
        Int.uint64 to MetaInformation(LONG, LONG, CastLiterals.none, CastLiterals.none, false),

        Int.char32 to MetaInformation(LONG, LONG, CastLiterals.none, CastLiterals.none, false),

        Float.float to MetaInformation(FLOAT, DOUBLE, CastLiterals.toDouble, CastLiterals.toFloat, false),
        Float.double to MetaInformation(DOUBLE, DOUBLE, CastLiterals.none, CastLiterals.none, false),

        Object.required to MetaInformation(null, null, null, null, false)
    )

    data class MetaInformation(
        val castedType: ClassName?,
        val bufferType: ClassName?,
        val toBufferCastMethodLiteral: String?,
        val fromBufferCastMethodLiteral: String?,
        val isNullable: Boolean,
    )

    operator fun get(meta: String) = metaInformations[meta] ?: throw MetaNotFoundException(meta)
}
