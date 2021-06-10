package godot.codegen

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.squareup.kotlinpoet.*
import godot.codegen.utils.*


@JsonIgnoreProperties(ignoreUnknown = true)
class Property @JsonCreator constructor(
        @JsonProperty("name")
        var oldName: String,
        @JsonProperty("type")
        var type: String,
        @JsonProperty("getter")
        var getter: String,
        @JsonProperty("setter")
        var setter: String,
        @JsonProperty("index")
        val index: Int
) {
    var newName = oldName.convertToCamelCase()

    var hasValidGetter: Boolean = false
    lateinit var validGetter: Method

    var hasValidSetter: Boolean = false
    lateinit var validSetter: Method

    lateinit var engineSetterIndexName: String
    lateinit var engineGetterIndexName: String

    var shouldRenameJvmProperty = false

    init {
        type = type.convertTypeToKotlin()

        getter = getter.convertToCamelCase()
        setter = setter.convertToCamelCase()

        oldName = oldName.replace('/', '_')
        newName = newName.replace('/', '_')

        // There are property with multiple types, and it's all Materials, so
        // Godot's developer should make more strict API
        if (type.indexOf(",") != -1) {
            type = "Material"
        }
    }

    fun initEngineIndexNames(engineClassIndexName: String) {
        engineSetterIndexName = "ENGINEMETHOD_${engineClassIndexName}_SET_${oldName.toUpperCase()}"
        engineGetterIndexName = "ENGINEMETHOD_${engineClassIndexName}_GET_${oldName.toUpperCase()}"

        if (engineGetterIndexName == "ENGINEMETHOD_ENGINECLASS_ANIMATIONNODETRANSITION_GET_INPUT_COUNT") {
            newName = "inputPortsCount"
        }
    }

    fun generate(clazz: Class): PropertySpec? {
        if (!hasValidGetter && !hasValidSetter) return null

        if (hasValidGetter && !validGetter.returnType.isEnum() && type != validGetter.returnType) {
            type = validGetter.returnType
        }

        // Sorry for this, CPUParticles has "scale" property overrides ancestor's "scale", but mismatches type
        if (clazz.newName == "CPUParticles" && newName == "scale") newName = "_scale"

        val modifiers = mutableListOf<KModifier>()
        if (!clazz.isSingleton) {
            modifiers.add(if (tree.doAncestorsHaveProperty(clazz, this)) KModifier.OVERRIDE else KModifier.OPEN)
        }

        val nullable = type.convertTypeForICalls() == "Object" || type.convertTypeForICalls() == "Any"
        val propertyTypeName = ClassName(type.getPackage(), type).copy(nullable = nullable) as ClassName
        val propertyType = propertyTypeName.convertIfTypeParameter()
        val propertySpecBuilder = PropertySpec
            .builder(
                newName,
                propertyType,
                modifiers
            )

        if (hasValidSetter) {
            propertySpecBuilder.mutable()
            propertySpecBuilder.setter(
                FunSpec.setterBuilder()
                    .addParameter("value", propertyType)
                    .generateJvmMethodCall(
                        engineSetterIndexName,
                        "Unit",
                        "%T to value",
                        listOf(type),
                        false
                    )
                    .build()
            )
        }

        if (hasValidGetter) {
            propertySpecBuilder.getter(
                FunSpec.getterBuilder()
                    .generateJvmMethodCall(
                        engineGetterIndexName,
                        type,
                        "",
                        listOf(),
                        false
                    )
                    .build()
            )
        } else {
            if (shouldRenameJvmProperty) {
                propertySpecBuilder.getter(
                    FunSpec.getterBuilder()
                        .addStatement(
                            "return super.$getter()"
                        )
                        .addAnnotation(
                            AnnotationSpec.builder(JvmName::class)
                                .addMember("\"${getter}_prop\"")
                                .build()
                        )
                        .addAnnotation(
                            AnnotationSpec.builder(Suppress::class)
                                .addMember("\"INAPPLICABLE_JVM_NAME\"")
                                .build()
                        )
                        .build()
                )
            } else {
                propertySpecBuilder.getter(
                    FunSpec.getterBuilder()
                        .addStatement(
                            "%L %T(%S)",
                            "throw",
                            UninitializedPropertyAccessException::class,
                            "Cannot access property $newName: has no getter"
                        )
                        .build()
                )
            }
        }

        val kDoc = classDocs[clazz.newName]?.properties?.get(oldName)?.description
        if (kDoc != null) {
            propertySpecBuilder.addKdoc("%L", kDoc)
        }

        return propertySpecBuilder.build()
    }

    infix fun applyGetterOrSetter(method: Method) {
        if (newName == "") return

        when (method.newName) {
            getter -> {
                if (method.returnType == "Unit" || method.arguments.size > 1 || method.isVirtual) return

                if (index == -1 && method.arguments.size == 1) return

                if (method.arguments.size == 1 && method.arguments[0].type != "Long") return

                validGetter = method
                hasValidGetter = true
                method.isGetterOrSetter = true
            }
            setter -> {
                if (method.returnType != "Unit" || method.arguments.size > 2 || method.isVirtual) return

                if (index == -1 && method.arguments.size == 2) return

                if (method.arguments.size == 2 && method.arguments[0].type != "Long") return

                validSetter = method
                hasValidSetter = true
                method.isGetterOrSetter = true
            }
        }
    }
}
