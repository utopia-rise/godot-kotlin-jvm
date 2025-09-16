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
import godot.codegen.generation.GenerationContext
import godot.codegen.generation.task.EnrichedClassTask
import godot.codegen.generation.task.EnrichedMethodTask
import godot.codegen.models.traits.addKdoc
import godot.codegen.models.enriched.EnrichedArgument
import godot.codegen.models.enriched.EnrichedClass
import godot.codegen.models.enriched.EnrichedMethod
import godot.codegen.services.impl.methodBindingsInnerClassName
import godot.tools.common.constants.GodotTypes
import godot.tools.common.constants.TRANSFER_CONTEXT
import godot.tools.common.constants.VARIANT_CASTER_ANY
import godot.tools.common.constants.VARIANT_PARSER_LONG
import godot.tools.common.constants.VARIANT_PARSER_NIL
import godot.tools.common.constants.godotApiPackage
import godot.tools.common.constants.godotCorePackage

interface BaseMethodeRule {
    fun FunSpec.Builder.configureMethod(method: EnrichedMethod, clazz: EnrichedClass, context: GenerationContext) {
        // This method already exist in the Kotlin class Any. We have to override it because Godot uses the same name in Object.
        if (method.name == "toString") {
            addModifiers(KModifier.OVERRIDE)
        }

        val methodTypeName = method.getCastedType()
        val shouldReturn = method.getTypeName() != UNIT
        if (shouldReturn) {
            returns(methodTypeName)
        } else {
            returns(UNIT)
        }

        generateParameters(method, context)

        // Godot can override virtual methods in child classes, we have to create a dummy final implementation for theM
        if (method.isOverride) {
            addModifiers(KModifier.OVERRIDE)
            addStatement(
                "%L·%T(%S)",
                "throw",
                NotImplementedError::class,
                "${clazz.identifier}::${method.name} can't be called from the JVM."
            )
            addKdoc("Virtual method inherited from base class implemented in non-JVM code. Don't call it.")
        } else if (method.isAbstract) {
            addModifiers(KModifier.ABSTRACT)
            addKdoc(method)
        } else if (method.isVirtual) {
            addModifiers(KModifier.OPEN)
            addStatement(
                "%L·%T(%S)",
                "throw",
                NotImplementedError::class,
                "${clazz.identifier}::${method.name} is not implemented."
            )
            addKdoc(method)
        } else {
            addModifiers(KModifier.FINAL)
            writeCode(method, clazz)
            addKdoc(method)
        }
    }

    fun FunSpec.Builder.generateParameters(method: EnrichedMethod, context: GenerationContext)
    fun FunSpec.Builder.writeCode(method: EnrichedMethod, clazz: EnrichedClass)

    fun ParameterSpec.Builder.applyDefault(argument: EnrichedArgument, context: GenerationContext): ParameterSpec.Builder {
        val defaultValueKotlinCode = argument.getDefaultValue()
        val appliedDefault = if ((argument.type.isEnum() || argument.type.isBitField()) && defaultValueKotlinCode != null) {
            context.generateEnumDefaultValue(
                argument.type,
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
    override fun apply(task: EnrichedMethodTask, context: GenerationContext) = with(task.builder) {
        configureMethod(task.method, task.owner, context)
    }

    override fun FunSpec.Builder.generateParameters(method: EnrichedMethod, context: GenerationContext) {
        method.arguments.withIndex().forEach {
            val index = it.index
            val argument = it.value

            val parameterBuilder = ParameterSpec.builder(
                method.arguments[index].name,
                argument.getCastedType()
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
        if (method.type.getVariantConverter() != VARIANT_PARSER_NIL) {
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

                if (argument.type.isEnum()) append(".id")
                if (argument.type.isBitField()) append(".flag")

            }
            if (method.isVararg && isNotEmpty()) append(",·")
        }

        val ktVariantClassNames = method.arguments.map { it.type.getVariantConverter() }.toTypedArray()

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
            clazz.className.nestedClass(methodBindingsInnerClassName),
            MemberName(godotApiPackage, method.voidPtrVariableName),
            method.type.getVariantConverter()
        )
    }

    private fun FunSpec.Builder.generateReturn(method: EnrichedMethod) {
        if (method.type.isEnum()) {
            addStatement(
                "return·%T.from(%T.readReturnValue(%T)·as·%T)",
                method.getBufferClass(),
                TRANSFER_CONTEXT,
                VARIANT_PARSER_LONG,
                LONG
            )
        } else if (method.type.isBitField()) {
            addStatement(
                "return·%T(%T.readReturnValue(%T)·as·%T)",
                method.getBufferClass(),
                TRANSFER_CONTEXT,
                VARIANT_PARSER_LONG,
                LONG
            )
        } else {
            addStatement(
                "return·(%T.readReturnValue(%T)·as·%T)${method.getFromBufferCastingMethod()}",
                TRANSFER_CONTEXT,
                method.type.getVariantConverter(),
                method.getTypeName()
            )
        }
    }
}

class StringOnlyRule : GodotApiRule<EnrichedClassTask>(), BaseMethodeRule {

    override fun apply(task: EnrichedClassTask, context: GenerationContext) {
        for (method in task.enrichedMethods.toList()) {
            val methodTask = createStringOnlyMethod(method.method, task.clazz, context) ?: continue
            task.enrichedMethods.add(methodTask)
        }
        for (method in task.enrichedStaticMethods.toList()) {
            val methodTask = createStringOnlyMethod(method.method, task.clazz, context) ?: continue
            task.enrichedStaticMethods.add(methodTask)
        }
    }

    private fun createStringOnlyMethod(method: EnrichedMethod, clazz: EnrichedClass, context: GenerationContext): EnrichedMethodTask? {
        if (method.isVirtual || method.isOverride) {
            return null
        }
        if (method.arguments.none { it.type.identifier == GodotTypes.stringName || it.type.identifier == GodotTypes.nodePath }) {
            return null
        }

        val methodTask = EnrichedMethodTask(method, clazz)
        methodTask.builder.configureMethod(method, clazz, context)
        return methodTask
    }

    override fun FunSpec.Builder.generateParameters(
        method: EnrichedMethod,
        context: GenerationContext
    ) {
        method.arguments.withIndex().forEach {
            val index = it.index
            val parameterBuilder = if (it.value.type.identifier == GodotTypes.stringName || it.value.type.identifier == GodotTypes.nodePath) {
                ParameterSpec.builder(
                    method.arguments[index].name,
                    STRING
                )
            } else {
                val argument = it.value
                ParameterSpec.builder(
                    method.arguments[index].name,
                    argument.getCastedType()
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

                if (argument.type.identifier == GodotTypes.stringName) {
                    clazz.additionalImports.add(ClassName(godotCorePackage, "asCachedStringName"))
                    append(".asCachedStringName()")
                } else if (argument.type.identifier == GodotTypes.nodePath) {
                    clazz.additionalImports.add(ClassName(godotCorePackage, "asCachedNodePath"))
                    append(".asCachedNodePath()")
                }
            }
            if (method.isVararg && isNotEmpty()) append(",·")
        }

        addStatement("return·${method.name}($arguments)")
    }
}


class OverLoadRule : GodotApiRule<EnrichedMethodTask>() {
    override fun apply(task: EnrichedMethodTask, context: GenerationContext) = with(task.builder) {
        if (task.method.arguments.none { it.defaultValue != null && it.type.identifier != GodotTypes.stringName && it.type.identifier != GodotTypes.nodePath }) {
            return
        }
        // add @JvmOverloads annotation for java support if not already present
        val jvmOverloadAnnotationSpec = AnnotationSpec.builder(JvmOverloads::class.asClassName()).build()
        if (!annotations.contains(jvmOverloadAnnotationSpec)) {
            addAnnotation(jvmOverloadAnnotationSpec)
        }
    }
}
