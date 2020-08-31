package godot.core

import godot.util.camelToSnakeCase

enum class PropertyHint {
	PROPERTY_HINT_NONE, ///< no hint provided.
	PROPERTY_HINT_RANGE, ///< hint_text = "min,max,step,slider; //slider is optional"
	PROPERTY_HINT_EXP_RANGE, ///< hint_text = "min,max,step", exponential edit
	PROPERTY_HINT_ENUM, ///< hint_text= "val1,val2,val3,etc"
	PROPERTY_HINT_EXP_EASING, /// exponential easing function (Math::ease) use "attenuation" hint string to revert (flip h), "full" to also include in/out. (ie: "attenuation,inout")
	PROPERTY_HINT_LENGTH, ///< hint_text= "length" (as integer)
	PROPERTY_HINT_SPRITE_FRAME, // FIXME: Obsolete: drop whenever we can break compat. Keeping now for GDNative compat.
	PROPERTY_HINT_KEY_ACCEL, ///< hint_text= "length" (as integer)
	PROPERTY_HINT_FLAGS, ///< hint_text= "flag1,flag2,etc" (as bit flags)
	PROPERTY_HINT_LAYERS_2D_RENDER,
	PROPERTY_HINT_LAYERS_2D_PHYSICS,
	PROPERTY_HINT_LAYERS_3D_RENDER,
	PROPERTY_HINT_LAYERS_3D_PHYSICS,
	PROPERTY_HINT_FILE, ///< a file path must be passed, hint_text (optionally) is a filter "*.png,*.wav,*.doc,"
	PROPERTY_HINT_DIR, ///< a directory path must be passed
	PROPERTY_HINT_GLOBAL_FILE, ///< a file path must be passed, hint_text (optionally) is a filter "*.png,*.wav,*.doc,"
	PROPERTY_HINT_GLOBAL_DIR, ///< a directory path must be passed
	PROPERTY_HINT_RESOURCE_TYPE, ///< a resource object type
	PROPERTY_HINT_MULTILINE_TEXT, ///< used for string properties that can contain multiple lines
	PROPERTY_HINT_PLACEHOLDER_TEXT, ///< used to set a placeholder text for string properties
	PROPERTY_HINT_COLOR_NO_ALPHA, ///< used for ignoring alpha component when editing a color
	PROPERTY_HINT_IMAGE_COMPRESS_LOSSY,
	PROPERTY_HINT_IMAGE_COMPRESS_LOSSLESS,
	PROPERTY_HINT_OBJECT_ID,
	PROPERTY_HINT_TYPE_STRING, ///< a type string, the hint is the base type to choose
	PROPERTY_HINT_NODE_PATH_TO_EDITED_NODE, ///< so something else can provide this (used in scripts)
	PROPERTY_HINT_METHOD_OF_VARIANT_TYPE, ///< a method of a type
	PROPERTY_HINT_METHOD_OF_BASE_TYPE, ///< a method of a base type
	PROPERTY_HINT_METHOD_OF_INSTANCE, ///< a method of an instance
	PROPERTY_HINT_METHOD_OF_SCRIPT, ///< a method of a script & base
	PROPERTY_HINT_PROPERTY_OF_VARIANT_TYPE, ///< a property of a type
	PROPERTY_HINT_PROPERTY_OF_BASE_TYPE, ///< a property of a base type
	PROPERTY_HINT_PROPERTY_OF_INSTANCE, ///< a property of an instance
	PROPERTY_HINT_PROPERTY_OF_SCRIPT, ///< a property of a script & base
	PROPERTY_HINT_OBJECT_TOO_BIG, ///< object is too big to send
	PROPERTY_HINT_NODE_PATH_VALID_TYPES,
	PROPERTY_HINT_SAVE_FILE, ///< a file path must be passed, hint_text (optionally) is a filter "*.png,*.wav,*.doc,". This opens a save dialog
	PROPERTY_HINT_MAX,
	// When updating PropertyHint, also sync the hardcoded list in VisualScriptEditorVariableEdit
};

data class KtPropertyInfo (
		val _type: KtVariant.Type,
		val name: String,
		val className: String,
		val _hint: PropertyHint,
		val hintString: String
) {
	val type: Int
		get() = (KtVariant.TYPE_TO_WIRE_VALUE_TYPE[_type] ?: error("Unknown mapping to Wire type for ${_type.name}"))
				.number

	val hint: Int
		get() = _hint.ordinal
}

data class KtFunctionInfo (
		val name: String,
		val _propertyInfos: List<KtPropertyInfo>
) {
	val propertyInfos: Array<KtPropertyInfo>
		get() = _propertyInfos.toTypedArray()
}

abstract class KtFunction<T: KtObject, R>(
		val functionInfo: KtFunctionInfo,
		val parameterCount: Int
) {
    val registrationName = functionInfo.name.camelToSnakeCase()
    fun invoke(instance: T): Boolean {
        val args = TransferContext.readArguments()
        require(args.size == parameterCount) { "Expecting $parameterCount parameter(s) for function ${functionInfo.name}, but got ${args.size} instead." }
        val ret = invoke(instance, args)
        return TransferContext.writeReturnValue(ret)
    }

    internal abstract operator fun invoke(instance: T, args: List<KtVariant>): KtVariant
}

class KtFunction0<T: KtObject, R>(
		functionInfo: KtFunctionInfo,
		private val function: (T) -> R,
		private val returnValueConverter: (R) -> KtVariant
) : KtFunction<T, R>(functionInfo, 0) {
    override operator fun invoke(instance: T, args: List<KtVariant>): KtVariant {
        return returnValueConverter(
            function(instance)
        )
    }
}

class KtFunction1<T: KtObject, P0, R>(
		functionInfo: KtFunctionInfo,
		private val function: (T, P0) -> R,
		private val returnValueConverter: (R) -> KtVariant,
		private val p0Converter: (KtVariant) -> P0
) : KtFunction<T, R>(functionInfo, 1) {
    override operator fun invoke(instance: T, args: List<KtVariant>): KtVariant {
        require(args.size == parameterCount) { "Expecting $parameterCount parameter(s), but got ${args.size} instead." }
        return returnValueConverter(
			function(
                instance,
                p0Converter(args[0])
            )
        )
    }
}

class KtFunction2<T: KtObject, P0, P1, R>(
    functionInfo: KtFunctionInfo,
    private val function: (T, P0, P1) -> R,
    private val returnValueConverter: (R) -> KtVariant,
    private val p0Converter: (KtVariant) -> P0,
    private val p1Converter: (KtVariant) -> P1,
) : KtFunction<T, R>(functionInfo, 1) {
    override fun invoke(instance: T, args: List<KtVariant>): KtVariant {
        return returnValueConverter(
            function(
                instance,
                p0Converter(args[0]),
                p1Converter(args[1]),
            )
        )
    }
}

class KtFunction3<T: KtObject, P0, P1, P2, R>(
    functionInfo: KtFunctionInfo,
    private val function: (T, P0, P1, P2) -> R,
    private val returnValueConverter: (R) -> KtVariant,
    private val p0Converter: (KtVariant) -> P0,
    private val p1Converter: (KtVariant) -> P1,
    private val p2Converter: (KtVariant) -> P2,
) : KtFunction<T, R>(functionInfo, 1) {
    override fun invoke(instance: T, args: List<KtVariant>): KtVariant {
        return returnValueConverter(
            function(
                instance,
                p0Converter(args[0]),
                p1Converter(args[1]),
                p2Converter(args[2]),
            )
        )
    }
}

class KtFunction4<T: KtObject, P0, P1, P2, P3, R>(
    functionInfo: KtFunctionInfo,
    private val function: (T, P0, P1, P2, P3) -> R,
    private val returnValueConverter: (R) -> KtVariant,
    private val p0Converter: (KtVariant) -> P0,
    private val p1Converter: (KtVariant) -> P1,
    private val p2Converter: (KtVariant) -> P2,
    private val p3Converter: (KtVariant) -> P3,
) : KtFunction<T, R>(functionInfo, 1) {
    override fun invoke(instance: T, args: List<KtVariant>): KtVariant {
        return returnValueConverter(
            function(
                instance,
                p0Converter(args[0]),
                p1Converter(args[1]),
                p2Converter(args[2]),
                p3Converter(args[3]),
            )
        )
    }
}

class KtFunction5<T: KtObject, P0, P1, P2, P3, P4, R>(
    functionInfo: KtFunctionInfo,
    private val function: (T, P0, P1, P2, P3, P4) -> R,
    private val returnValueConverter: (R) -> KtVariant,
    private val p0Converter: (KtVariant) -> P0,
    private val p1Converter: (KtVariant) -> P1,
    private val p2Converter: (KtVariant) -> P2,
    private val p3Converter: (KtVariant) -> P3,
    private val p4Converter: (KtVariant) -> P4,
) : KtFunction<T, R>(functionInfo, 1) {
    override fun invoke(instance: T, args: List<KtVariant>): KtVariant {
        return returnValueConverter(
            function(
                instance,
                p0Converter(args[0]),
                p1Converter(args[1]),
                p2Converter(args[2]),
                p3Converter(args[3]),
                p4Converter(args[4]),
            )
        )
    }
}