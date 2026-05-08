package godot.inspection

import godot.annotation.ColorNoAlpha
import godot.annotation.Dir
import godot.annotation.DoubleRange
import godot.annotation.EnumFlag
import godot.annotation.EnumTypeHint
import godot.annotation.ExpEasing
import godot.annotation.Export
import godot.annotation.File
import godot.annotation.FloatRange
import godot.annotation.IntFlag
import godot.annotation.IntRange
import godot.annotation.LongRange
import godot.annotation.MultilineText
import godot.annotation.PlaceHolderText
import godot.annotation.GodotScript
import godot.annotation.Register
import godot.annotation.Visible
import godot.annotation.RegisterSignal
import godot.annotation.Rpc
import godot.annotation.RpcMode
import godot.annotation.Tool
import godot.annotation.TransferMode
import godot.api.Node
import godot.core.Signal0
import godot.core.VariantArray
import godot.core.Vector2
import godot.core.callable0
import godot.core.signal0
import godot.extension.connectMethod

class UnsupportedExportedType

enum class SmallEnum {
    A,
    B,
}

enum class LargeEnum {
    E01, E02, E03, E04, E05, E06, E07, E08, E09, E10, E11,
    E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22,
    E23, E24, E25, E26, E27, E28, E29, E30, E31, E32, E33,
}

// Class-level registration checks.
// Expected red: `@Tool` requires the class itself to be registered.
@Tool
class NotRegisteredButToolFixture : Node()

// Expected red on the class: it is not `@GodotScript`, but it contains
// registered properties, signals, and functions.
class NotRegisteredButMembersFixture : Node() {
    // Expected red via the containing class: registered property inside a
    // non-registered class.
    @Export
    var propertyShouldStayRed = 1

    // Expected red via the containing class: registered signal inside a
    // non-registered class.
    @RegisterSignal
    val signalShouldStayRed by signal0()

    // Expected red via the containing class: registered function inside a
    // non-registered class.
    @Register
    fun functionShouldStayRed() = propertyShouldStayRed
}

// Expected red: `@GodotScript` is present, but the class does not inherit a
// Godot object type.
@GodotScript
class RegisterClassWithoutGodotBaseFixture

// Expected red: registered classes must expose exactly one parameterless
// constructor, and this one only has a parameterized constructor.
@GodotScript
class RegisterClassWithoutDefaultConstructorFixture(val number: Int) : Node()

// Expected red on both duplicate declarations: they register the same custom
// Godot class name.
@GodotScript(className = "DuplicateIdeRegistrationName")
class DuplicateRegisteredNameFixtureOne : Node()

@GodotScript(className = "DuplicateIdeRegistrationName")
class DuplicateRegisteredNameFixtureTwo : Node()

// Expected red: generic classes cannot be registered.
@GodotScript
class GenericRegisteredClassFixture<T> : Node()

// Method registration checks.
@GodotScript
class NotificationFunctionWithoutRegisterFunctionFixture : Node() {
    // Expected red: notification callbacks like `_ready` must also carry
    // `@Register` inside a registered class.
    override fun _ready() {
    }
}

@GodotScript
abstract class RegisteredAbstractBaseFixture : Node() {
    @Register
    abstract fun mustStayRegistered()
}

@GodotScript
class OverriddenRegisteredFunctionMissingAnnotationFixture : RegisteredAbstractBaseFixture() {
    // Expected weak warning: this overrides an abstract registered function,
    // but the override itself is missing `@Register`.
    override fun mustStayRegistered() {
    }
}

@GodotScript
class RegisterFunctionProblemFixture : Node() {
    // Expected red: generic functions cannot be registered.
    @Register
    fun <T> genericRegisteredFunction(value: T) {
    }

    // Expected red: registered functions may not exceed the max supported
    // parameter count.
    @Register
    fun tooManyParameters(
        p01: Int, p02: Int, p03: Int, p04: Int, p05: Int, p06: Int,
        p07: Int, p08: Int, p09: Int, p10: Int, p11: Int, p12: Int,
        p13: Int, p14: Int, p15: Int, p16: Int, p17: Int,
    ) {
    }
}

// Property registration checks.
@GodotScript
class RegisterPropertyProblemFixture : Node() {
    // Expected red: registered properties must be mutable `var`, not `val`.
    @Visible
    val immutableRegisteredProperty = 1

    // Expected red: core types are not allowed as `lateinit` registered
    // properties.
    @Visible
    lateinit var lateinitCoreTypeProperty: Vector2

    // Expected red: core types are not allowed as nullable registered
    // properties.
    @Visible
    var nullableCoreTypeProperty: Vector2? = null

    // Expected red: this type is neither a supported JVM type nor a Godot/core
    // type, so it cannot be exported/registered.
    @Visible
    var unsupportedExportedType = UnsupportedExportedType()

    // Expected red: Kotlin collections of enums need `@EnumFlag` to describe
    // how they should be exported.
    @Visible
    var enumSetWithoutEnumFlag = setOf(SmallEnum.A)

    // Expected red: `VariantArray<Enum>` is explicitly rejected by the
    // inspection.
    @Visible
    var enumVariantArray = VariantArray<SmallEnum>()

    // Expected red: `@Export` without `@Visible` is incomplete.
    @Export
    var exportWithoutRegisterProperty = 1
}

// Property hint checks.
@GodotScript
class PropertyHintProblemFixture : Node() {
    // Expected red: `@IntRange` only makes sense on `Int` properties.
    @IntRange(min = 0, max = 1)
    var intRangeWrongType = ""

    // Expected red: `@LongRange` only makes sense on `Long` properties.
    @LongRange(min = 0, max = 1)
    var longRangeWrongType = 1

    // Expected red: `@FloatRange` only makes sense on `Float` properties.
    @FloatRange(min = 0f, max = 1f)
    var floatRangeWrongType = 1

    // Expected red: `@DoubleRange` only makes sense on `Double` properties.
    @DoubleRange(min = 0.0, max = 1.0)
    var doubleRangeWrongType = 1

    // Expected red: `@ExpEasing` only makes sense on `Float` or `Double`
    // properties.
    @ExpEasing
    var expEasingWrongType = 1

    // Expected red: `@EnumTypeHint` only makes sense on enum properties.
    @EnumTypeHint
    var enumTypeHintWrongType = 1

    // Expected red: `@EnumFlag` only makes sense on `Set<Enum>` or
    // `MutableSet<Enum>`.
    @EnumFlag
    var enumFlagWrongType = 1

    // Expected red: enum flags are capped at 32 enum entries, and this enum is
    // intentionally larger.
    @EnumFlag
    var enumFlagTooManyEntries = setOf(
        LargeEnum.E01, LargeEnum.E02, LargeEnum.E03, LargeEnum.E04, LargeEnum.E05, LargeEnum.E06,
        LargeEnum.E07, LargeEnum.E08, LargeEnum.E09, LargeEnum.E10, LargeEnum.E11, LargeEnum.E12,
        LargeEnum.E13, LargeEnum.E14, LargeEnum.E15, LargeEnum.E16, LargeEnum.E17, LargeEnum.E18,
        LargeEnum.E19, LargeEnum.E20, LargeEnum.E21, LargeEnum.E22, LargeEnum.E23, LargeEnum.E24,
        LargeEnum.E25, LargeEnum.E26, LargeEnum.E27, LargeEnum.E28, LargeEnum.E29, LargeEnum.E30,
        LargeEnum.E31, LargeEnum.E32, LargeEnum.E33,
    )

    // Expected red: `@IntFlag` only makes sense on `Int` properties.
    @IntFlag("a")
    var intFlagWrongType = ""

    // Expected red: `@File` only makes sense on `String` properties.
    @File
    var fileWrongType = 1

    // Expected red: `@Dir` only makes sense on `String` properties.
    @Dir
    var dirWrongType = 1

    // Expected red: `@MultilineText` only makes sense on `String` properties.
    @MultilineText
    var multilineTextWrongType = 1

    // Expected red: `@PlaceHolderText` only makes sense on `String`
    // properties.
    @PlaceHolderText
    var placeholderTextWrongType = 1

    // Expected red: `@ColorNoAlpha` only makes sense on `Color` properties.
    @ColorNoAlpha
    var colorNoAlphaWrongType = 1
}

// Signal registration checks.
@GodotScript
class RegisterSignalProblemFixture : Node() {
    // Expected warning: registered signals should be immutable `val`.
    @RegisterSignal
    var mutableSignal = Signal0("mutableSignal")

    // Expected red: a registered signal must actually have signal type.
    @RegisterSignal
    val signalWrongType = 1
}

// RPC annotation checks.
@GodotScript
class RpcAnnotationProblemFixture : Node() {
    // Expected weak warning: non-zero transfer channels are ignored unless the
    // transfer mode is `UNRELIABLE_ORDERED`.
    @Rpc(transferMode = TransferMode.RELIABLE, transferChannel = 1)
    fun rpcChannelIgnored() {
    }
}

// Callable-reference registration checks.
@GodotScript
class CallableReferenceProblemFixture : Node() {
    @RegisterSignal
    val localSignal by signal0()

    @Register
    override fun _ready() {
        // Expected red on the callable reference: connected signal targets must
        // be registered functions.
        localSignal.connectMethod(this, CallableReferenceProblemFixture::signalTargetNotRegistered)
        // Expected red on the callable reference: Godot callable targets must
        // be registered functions.
        callable0(this::callTargetNotRegistered).call()
        // Expected red on the callable reference: RPC targets must be
        // registered functions.
        rpc(::rpcTargetNotRegistered)
        // Expected red on the callable reference: RPC targets also need the
        // `@Rpc` annotation.
        rpc(::rpcTargetMissingRpc)
        // Expected red on the callable reference: the target has `@Rpc`, but it
        // is explicitly disabled via `RpcMode.DISABLED`.
        rpc(::rpcTargetDisabled)
    }

    // Expected red when referenced from `connectMethod`: missing
    // `@Register`.
    fun signalTargetNotRegistered() {
    }

    // Expected red when referenced from `call()`: missing `@Register`.
    fun callTargetNotRegistered() {
    }

    // Expected red when referenced from `rpc()`: missing `@Register`.
    fun rpcTargetNotRegistered() {
    }

    // Expected red when referenced from `rpc()`: registered, but missing
    // `@Rpc`.
    fun rpcTargetMissingRpc() {
    }

    // Expected red when referenced from `rpc()`: RPC-enabled, but explicitly
    // disabled for network access.
    @Rpc(rpcMode = RpcMode.DISABLED)
    fun rpcTargetDisabled() {
    }
}
