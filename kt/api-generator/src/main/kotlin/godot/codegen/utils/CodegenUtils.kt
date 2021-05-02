package godot.codegen.utils

import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import godot.codegen.isNative

fun ClassName.convertIfTypeParameter(): TypeName {
    val arrayClassName = if (isNative) "GodotArray" else "VariantArray"
    return when(this.simpleName) {
        arrayClassName -> this.parameterizedBy(ANY.copy(nullable = true))
        "Dictionary" -> this.parameterizedBy(ANY.copy(nullable = true), ANY.copy(nullable = true))
        else -> this
    }
}

fun FunSpec.Builder.generateJvmMethodCall(
    engineIndexName: String,
    returnType: String,
    argumentsString: String,
    argumentsTypes: List<String>,
    hasVarargs: Boolean
): FunSpec.Builder {
    val ktVariantClassNames = argumentsTypes.map {
        ClassName("godot.core.VariantType", it.jvmVariantTypeValue)
    }.toTypedArray()

    val transferContextClassName = ClassName("godot.core", "TransferContext")

    val shouldReturn = returnType != "Unit"
    if (hasVarargs) {
        addStatement(
            "%T.writeArguments($argumentsString *__var_args.map { %T to it }.toTypedArray())",
            transferContextClassName,
            *ktVariantClassNames,
            ClassName("godot.core.VariantType", "ANY")
        )
    } else {
        addStatement(
            "%T.writeArguments($argumentsString)",
            transferContextClassName,
            *ktVariantClassNames
        )
    }

    val returnTypeVariantTypeClass = if (returnType.isEnum()) {
        ClassName("godot.core.VariantType", "LONG")
    } else {
        ClassName("godot.core.VariantType", returnType.jvmVariantTypeValue)
    }

    addStatement(
        "%T.callMethod(rawPtr, %M, %T)",
        transferContextClassName,
        MemberName("godot", engineIndexName),
        returnTypeVariantTypeClass
    )

    if (shouldReturn) {
        if (returnType.isEnum()) {
            addStatement(
                "return·${returnType.removeEnumPrefix()}.values()[%T.readReturnValue(%T)·as·%T]",
                transferContextClassName,
                ClassName("godot.core.VariantType", "JVM_INT"),
                INT
            )
        } else {
            val isNullableReturn = returnType.convertTypeForICalls() == "Object" || returnType.convertTypeForICalls() == "Any"
            var castClassName: TypeName = ClassName(returnType.getPackage(), returnType.convertTypeToKotlin())
                .copy(nullable = isNullableReturn)
            if (returnType.convertTypeToKotlin() == "VariantArray") {
                castClassName = (castClassName as ClassName).parameterizedBy(ANY.copy(true))
            } else if (returnType.convertTypeToKotlin() == "Dictionary") {
                castClassName = (castClassName as ClassName).parameterizedBy(ANY.copy(true), ANY.copy(true))
            }
            addStatement(
                "return·%T.readReturnValue(%T, %L)·as·%T",
                transferContextClassName,
                returnTypeVariantTypeClass,
                isNullableReturn,
                castClassName
            )
        }
    }
    return this
}
