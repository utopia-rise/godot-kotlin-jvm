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
    }

    object Float {
        const val float = "float"
        const val double = "double"
    }

    object CastLiterals {
        const val none = ""
        const val toLong = ".toLong()"
        const val toInt = ".toInt()"
        const val toFloat = ".toFloat()"
        const val toDouble = ".toDouble()"
    }

    private val metaInformations = mapOf(
        Int.int8 to MetaInformation(INT, LONG, CastLiterals.toLong, CastLiterals.toInt),
        Int.int16 to MetaInformation(INT, LONG, CastLiterals.toLong, CastLiterals.toInt),
        Int.int32 to MetaInformation(INT, LONG, CastLiterals.toLong, CastLiterals.toInt),
        Int.int64 to MetaInformation(LONG, LONG, CastLiterals.none, CastLiterals.none),

        Int.uint8 to MetaInformation(INT, LONG, CastLiterals.toLong, CastLiterals.toInt),
        Int.uint16 to MetaInformation(INT, LONG, CastLiterals.toLong, CastLiterals.toInt),
        Int.uint32 to MetaInformation(LONG, LONG, CastLiterals.none, CastLiterals.none),
        Int.uint64 to MetaInformation(LONG, LONG, CastLiterals.none, CastLiterals.none),

        Float.float to MetaInformation(FLOAT, DOUBLE, CastLiterals.toDouble, CastLiterals.toFloat),
        Float.double to MetaInformation(DOUBLE, DOUBLE, CastLiterals.none, CastLiterals.none)
    )

    data class MetaInformation(
        val castedType: ClassName,
        val bufferType: ClassName,
        val toBufferCastMethodLiteral: String,
        val fromBufferCastMethodLiteral: String
    )

    operator fun get(meta: String) = metaInformations[meta] ?: throw MetaNotFoundException(meta)
}
