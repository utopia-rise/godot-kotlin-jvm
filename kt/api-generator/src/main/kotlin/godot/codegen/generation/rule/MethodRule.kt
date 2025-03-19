package godot.codegen.generation.rule

import com.squareup.kotlinpoet.ANY
import com.squareup.kotlinpoet.AnnotationSpec
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.LONG
import com.squareup.kotlinpoet.MemberName
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.STRING
import com.squareup.kotlinpoet.UNIT
import com.squareup.kotlinpoet.asClassName
import godot.codegen.extensions.getClassName
import godot.codegen.extensions.getDefaultValueKotlinString
import godot.codegen.extensions.getTypeName
import godot.codegen.extensions.isBitField
import godot.codegen.extensions.isEnum
import godot.codegen.extensions.variantParser
import godot.codegen.generation.Context
import godot.codegen.generation.task.EnrichedClassTask
import godot.codegen.generation.task.EnrichedMethodTask
import godot.codegen.models.custom.AdditionalImport
import godot.codegen.models.enriched.EnrichedArgument
import godot.codegen.models.enriched.EnrichedClass
import godot.codegen.models.enriched.EnrichedMethod
import godot.codegen.services.impl.methodBindingsInnerClassName
import godot.codegen.traits.addKdoc
import godot.tools.common.constants.GodotTypes
import godot.tools.common.constants.TRANSFER_CONTEXT
import godot.tools.common.constants.VARIANT_CASTER_ANY
import godot.tools.common.constants.VARIANT_PARSER_LONG
import godot.tools.common.constants.VARIANT_PARSER_NIL
import godot.tools.common.constants.godotApiPackage
import godot.tools.common.constants.godotCorePackage

interface BaseMethodeRule {
    fun FunSpec.Builder.configureMethod(method: EnrichedMethod, clazz: EnrichedClass, context: Context) {

        addKdoc(method)
        // This method already exist in the Kotlin class Any. We have to override it because Godot uses the same name in Object.
        if (method.name == "toString") {
            addModifiers(KModifier.OVERRIDE)
        }

        // Godot doesn't override its methods, they are either final or meant to be implemented by script or extension.
        if (method.isVirtual) {
            addModifiers(KModifier.OPEN)
        } else {
            addModifiers(KModifier.FINAL)
        }

        val methodTypeName = method.getCastedType()
        val shouldReturn = method.getTypeName() != UNIT
        if (shouldReturn) {
            returns(methodTypeName.typeName)
        }

        generateParameters(method, context)

        if (!method.isVirtual) {
            writeCode(method, clazz)
        } else {
            addStatement(
                "%L·%T(%S)",
                "throw",
                NotImplementedError::class,
                "${method.name} is not implemented for ${clazz.type}"
            )
        }
    }

    fun FunSpec.Builder.generateParameters(method: EnrichedMethod, context: Context)
    fun FunSpec.Builder.writeCode(method: EnrichedMethod, clazz: EnrichedClass)

    fun ParameterSpec.Builder.applyDefault(argument: EnrichedArgument, context: Context): ParameterSpec.Builder {
        val defaultValueKotlinCode = argument.getDefaultValueKotlinString()
        val appliedDefault = if ((argument.isEnum() || argument.isBitField()) && defaultValueKotlinCode != null) {
            context.generateEnumDefaultValue(
                argument,
                defaultValueKotlinCode.first.toLong()
            )
        } else {
            defaultValueKotlinCode?.first
        }
        if (appliedDefault != null) {
            defaultValue(appliedDefault, *defaultValueKotlinCode!!.second)
        }
        return this
    }
}

class MethodRule : GodotApiRule<EnrichedMethodTask>(), BaseMethodeRule {
    override fun apply(task: EnrichedMethodTask, context: Context) = with(task.builder) {
        configureMethod(task.method, task.owner, context)
    }

    override fun FunSpec.Builder.generateParameters(method: EnrichedMethod, context: Context) {
        method.arguments.withIndex().forEach {
            val index = it.index
            val argument = it.value

            val parameterBuilder = ParameterSpec.builder(
                method.arguments[index].name,
                argument.getCastedType().typeName
            )

            addParameter(
                parameterBuilder
                    .applyDefault(argument, context)
                    .build()
            )
        }

        if (method.isVararg) {
            addParameter(
                "args",
                ANY.copy(nullable = true),
                KModifier.VARARG
            )
        }
    }

    override fun FunSpec.Builder.writeCode(method: EnrichedMethod, clazz: EnrichedClass) {
        generateWriteArgument(method)
        generateMethodCall(method, clazz)
        if (method.variantParser != VARIANT_PARSER_NIL) {
            generateReturn(method)
        }
    }

    private fun FunSpec.Builder.generateWriteArgument(method: EnrichedMethod) {
        val arguments = buildString {
            method.arguments.withIndex().forEach {
                val index = it.index
                val argument = it.value

                val shouldAddComa = index != 0
                if (shouldAddComa) append(",·")

                append("%T·to·${method.arguments[index].name}${argument.getToBufferCastingMethod()}")

                if (argument.isEnum()) append(".id")
                if (argument.isBitField()) append(".flag")

            }
            if (method.isVararg && isNotEmpty()) append(",·")
        }

        val ktVariantClassNames = method.arguments.map { it.variantParser }.toTypedArray()

        if (method.isVararg) {
            addStatement(
                "%T.writeArguments($arguments·*args.map·{·%T·to·it·}.toTypedArray())",
                TRANSFER_CONTEXT,
                *ktVariantClassNames,
                VARIANT_CASTER_ANY
            )
        } else {
            addStatement(
                "%T.writeArguments($arguments)",
                TRANSFER_CONTEXT,
                *ktVariantClassNames
            )
        }
    }

    private fun FunSpec.Builder.generateMethodCall(method: EnrichedMethod, clazz: EnrichedClass) {
        val ptr = if (method.isStatic) {
            "0" //nullpointer
        } else {
            "ptr"
        }
        addStatement(
            "%T.callMethod($ptr, %T.%M, %T)",
            TRANSFER_CONTEXT,
            clazz.getClassName().nestedClass(methodBindingsInnerClassName),
            MemberName(godotApiPackage, method.voidPtrVariableName),
            method.variantParser
        )
    }

    private fun FunSpec.Builder.generateReturn(method: EnrichedMethod) {
        val methodReturnType = method.getBufferType()
        if (method.isEnum()) {
            addStatement(
                "return·${methodReturnType.className.simpleNames.joinToString(".")}.from(%T.readReturnValue(%T)·as·%T)",
                TRANSFER_CONTEXT,
                VARIANT_PARSER_LONG,
                LONG
            )
        } else if (method.isBitField()) {
            val simpleNames = methodReturnType.className.simpleNames
            addStatement(
                "return·%T(%T.readReturnValue(%T)·as·%T)",
                ClassName(
                    "${methodReturnType.className.packageName}.${simpleNames.subList(0, simpleNames.size - 1).joinToString(".")}",
                    method.getClassName().simpleName
                ),
                TRANSFER_CONTEXT,
                VARIANT_PARSER_LONG,
                LONG
            )
        } else {
            addStatement(
                "return·(%T.readReturnValue(%T)·as·%T)${method.getFromBufferCastingMethod()}",
                TRANSFER_CONTEXT,
                method.variantParser,
                methodReturnType.typeName
            )
        }
    }
}

class StringOnlyRule : GodotApiRule<EnrichedClassTask>(), BaseMethodeRule {

    override fun apply(task: EnrichedClassTask, context: Context) {
        for (method in task.enrichedMethods.toList()) {
            val methodTask = createStringOnlyMethod(method.method, task.clazz, context) ?: continue
            task.enrichedMethods.add(methodTask)
        }
        for (method in task.enrichedStaticMethods.toList()) {
            val methodTask = createStringOnlyMethod(method.method, task.clazz, context) ?: continue
            task.enrichedStaticMethods.add(methodTask)
        }
    }

    private fun createStringOnlyMethod(method: EnrichedMethod, clazz: EnrichedClass, context: Context): EnrichedMethodTask? {
        if (method.isVirtual) {
            return null
        }
        if (method.arguments.none { it.type == GodotTypes.stringName || it.type == GodotTypes.nodePath }) {
            return null
        }

        val methodTask = EnrichedMethodTask(method, clazz)
        methodTask.builder.configureMethod(method, clazz, context)
        return methodTask
    }

    override fun FunSpec.Builder.generateParameters(
        method: EnrichedMethod,
        context: Context
    ) {
        method.arguments.withIndex().forEach {
            val index = it.index
            val parameterBuilder = if (it.value.type == GodotTypes.stringName || it.value.type == GodotTypes.nodePath) {
                ParameterSpec.builder(
                    method.arguments[index].name,
                    STRING
                )
            } else {
                val argument = it.value
                ParameterSpec.builder(
                    method.arguments[index].name,
                    argument.getCastedType().typeName
                ).applyDefault(argument, context)
            }
            addParameter(parameterBuilder.build())
        }

        if (method.isVararg) {
            addParameter(
                "args",
                ANY.copy(nullable = true),
                KModifier.VARARG
            )
        }
    }

    override fun FunSpec.Builder.writeCode(
        method: EnrichedMethod,
        clazz: EnrichedClass
    ) {
        val arguments = buildString {
            method.arguments.withIndex().forEach {
                val index = it.index
                val argument = it.value

                val shouldAddComa = index != 0
                if (shouldAddComa) append(",·")

                append(method.arguments[index].name)

                if (argument.type == GodotTypes.stringName) {
                    clazz.additionalImports.add(AdditionalImport(godotCorePackage, "asCachedStringName"))
                    append(".asCachedStringName()")
                } else if (argument.type == GodotTypes.nodePath) {
                    clazz.additionalImports.add(AdditionalImport(godotCorePackage, "asCachedNodePath"))
                    append(".asCachedNodePath()")
                }
            }
            if (method.isVararg && isNotEmpty()) append(",·")
        }

        addStatement("return·${method.name}($arguments)")
    }
}


class OverLoadRule : GodotApiRule<EnrichedMethodTask>() {
    override fun apply(task: EnrichedMethodTask, context: Context) = with(task.builder) {
        if (task.method.arguments.none { it.defaultValue != null && it.type != GodotTypes.stringName && it.type != GodotTypes.nodePath }) {
            return
        }
        // add @JvmOverloads annotation for java support if not already present
        val jvmOverloadAnnotationSpec = AnnotationSpec.builder(JvmOverloads::class.asClassName()).build()
        if (!annotations.contains(jvmOverloadAnnotationSpec)) {
            addAnnotation(jvmOverloadAnnotationSpec)
        }
    }
}
