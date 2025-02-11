package godot.annotation.processor.classgraph.constants

const val BOOLEAN = "boolean"
const val INT = "int"
const val LONG = "long"
const val FLOAT = "float"
const val DOUBLE = "double"
const val BYTE = "byte"
const val SHORT = "short"

const val BOXED_BYTE = "java.lang.Byte"
const val BOXED_SHORT = "java.lang.Short"
const val BOXED_INT = "java.lang.Integer"
const val BOXED_LONG = "java.lang.Long"
const val BOXED_FLOAT = "java.lang.Float"
const val BOXED_DOUBLE = "java.lang.Double"
const val BOXED_BOOLEAN = "java.lang.Boolean"

val jvmPrimitives = listOf(
    BOOLEAN,
    INT,
    LONG,
    FLOAT,
    DOUBLE,
    BYTE,
    SHORT
)

const val VOID = "void"

const val STRING = "java.lang.String"

const val JVM_OBJECT = "java.lang.Object"

const val SET = "java.util.Set"

val godotPrimitives = jvmPrimitives
    .union(
        listOf(
            BOXED_BYTE,
            BOXED_SHORT,
            BOXED_INT,
            BOXED_LONG,
            BOXED_FLOAT,
            BOXED_DOUBLE,
            BOXED_BOOLEAN,

            STRING
        )
    )

val String.isGodotPrimitive: Boolean
    get() = godotPrimitives.contains(this)

val jvmPrimitivesToKotlinPrimitives = mapOf(
    BOOLEAN to Boolean::class.qualifiedName,
    INT to Int::class.qualifiedName,
    LONG to Long::class.qualifiedName,
    FLOAT to Float::class.qualifiedName,
    DOUBLE to Double::class.qualifiedName,
    BYTE to Byte::class.qualifiedName,
    SHORT to Short::class.qualifiedName,

    STRING to String::class.qualifiedName,

    BOXED_BOOLEAN to Boolean::class.qualifiedName,
    BOXED_INT to Int::class.qualifiedName,
    BOXED_LONG to Long::class.qualifiedName,
    BOXED_FLOAT to Float::class.qualifiedName,
    BOXED_DOUBLE to Double::class.qualifiedName,
    BOXED_BYTE to Byte::class.qualifiedName,
    BOXED_SHORT to Short::class.qualifiedName,
)
