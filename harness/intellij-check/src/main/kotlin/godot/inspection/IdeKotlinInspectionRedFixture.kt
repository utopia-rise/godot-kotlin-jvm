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
import godot.annotation.ArgumentName
import godot.annotation.Rpc
import godot.annotation.RpcMode
import godot.annotation.Tool
import godot.annotation.TransferMode
import godot.api.Node
import godot.core.Signal0
import godot.core.Signal1
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
// NOT ALLOWED: `@Tool` requires the class itself to be `@GodotScript`.
@Tool
class NotRegisteredButToolFixture : Node()

// NOT ALLOWED on the class: it is not `@GodotScript`, but it contains
// members that would be registered.
class NotRegisteredButMembersFixture : Node() {
    // NOT ALLOWED via the containing class: `@Export` implies a registered
    // property, so the class itself must be `@GodotScript`.
    @Export
    var propertyShouldStayRed = 1

    // NOT ALLOWED via the containing class: direct signal declarations are
    // auto-registered, so the class itself must be `@GodotScript`.
    val signalShouldStayRed by signal0()

    // NOT ALLOWED via the containing class: explicitly registered function
    // inside a non-registered class.
    @Register
    fun functionShouldStayRed() = propertyShouldStayRed
}

// NOT ALLOWED: `@GodotScript` is present, but the class does not inherit a
// Godot object type.
@GodotScript
class RegisterClassWithoutGodotBaseFixture

// NOT ALLOWED: registered classes must expose exactly one parameterless
// constructor, and this one only has a parameterized constructor.
@GodotScript
class RegisterClassWithoutDefaultConstructorFixture(val number: Int) : Node()

// NOT ALLOWED on both declarations: they register the same custom
// Godot class name.
@GodotScript(className = "DuplicateIdeRegistrationName")
class DuplicateRegisteredNameFixtureOne : Node()

@GodotScript(className = "DuplicateIdeRegistrationName")
class DuplicateRegisteredNameFixtureTwo : Node()

// NOT ALLOWED: generic classes cannot be registered.
@GodotScript
class GenericRegisteredClassFixture<T> : Node()

// Method registration checks.
@GodotScript
class NotificationFunctionWithoutRegisterFunctionFixture : Node() {
    // ALLOWED: overrides coming from Godot base types are registered
    // automatically.
    override fun _ready() {
    }

    // ALLOWED: `_notification` is also a Godot base override and should not
    // need `@Register`.
    override fun _notification(what: Int) {
    }
}

@GodotScript
abstract class RegisteredAbstractBaseFixture : Node() {
    @Register
    abstract fun mustStayRegistered()
}

@GodotScript
class OverriddenRegisteredFunctionMissingAnnotationFixture : RegisteredAbstractBaseFixture() {
    // NOT ALLOWED: this overrides a user-defined abstract registered function,
    // not a Godot base method, so the override itself still needs `@Register`.
    override fun mustStayRegistered() {
    }
}

@GodotScript
class RegisterFunctionProblemFixture : Node() {
    // NOT ALLOWED: generic functions cannot be registered.
    @Register
    fun <T> genericRegisteredFunction(value: T) {
    }

    // NOT ALLOWED: registered functions may not exceed the max supported
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
    // NOT ALLOWED: registered properties must be mutable `var`, not `val`.
    @Visible
    val immutableRegisteredProperty = 1

    // NOT ALLOWED: core types are not allowed as `lateinit` registered
    // properties.
    @Visible
    lateinit var lateinitCoreTypeProperty: Vector2

    // NOT ALLOWED: core types are not allowed as nullable registered
    // properties.
    @Visible
    var nullableCoreTypeProperty: Vector2? = null

    // NOT ALLOWED: this type is neither a supported JVM type nor a Godot/core
    // type, so it cannot be exported/registered.
    @Visible
    var unsupportedExportedType = UnsupportedExportedType()

    // NOT ALLOWED: Kotlin collections of enums need `@EnumFlag` to describe
    // how they should be exported.
    @Visible
    var enumSetWithoutEnumFlag = setOf(SmallEnum.A)

    // NOT ALLOWED: `VariantArray<Enum>` is explicitly rejected by the
    // inspection.
    @Visible
    var enumVariantArray = VariantArray<SmallEnum>()

    // ALLOWED: `@Export` now implies visible/registered property status.
    @Export
    var exportWithoutRegisterProperty = 1

    // ALLOWED: a property hint now implies `@Export`, which itself implies
    // visible/registered property status.
    @FloatRange(min = 0f, max = 1f)
    var hintedPropertyWithoutExplicitExportOrVisible = 0.5f
}

// Property hint checks.
@GodotScript
class PropertyHintProblemFixture : Node() {
    // NOT ALLOWED: `@IntRange` only makes sense on `Int` properties.
    @IntRange(min = 0, max = 1)
    var intRangeWrongType = ""

    // NOT ALLOWED: `@LongRange` only makes sense on `Long` properties.
    @LongRange(min = 0, max = 1)
    var longRangeWrongType = 1

    // NOT ALLOWED: `@FloatRange` only makes sense on `Float` properties.
    @FloatRange(min = 0f, max = 1f)
    var floatRangeWrongType = 1

    // NOT ALLOWED: `@DoubleRange` only makes sense on `Double` properties.
    @DoubleRange(min = 0.0, max = 1.0)
    var doubleRangeWrongType = 1

    // NOT ALLOWED: `@ExpEasing` only makes sense on `Float` or `Double`
    // properties.
    @ExpEasing
    var expEasingWrongType = 1

    // NOT ALLOWED: `@EnumTypeHint` only makes sense on enum properties.
    @EnumTypeHint
    var enumTypeHintWrongType = 1

    // NOT ALLOWED: `@EnumFlag` only makes sense on `Set<Enum>` or
    // `MutableSet<Enum>`.
    @EnumFlag
    var enumFlagWrongType = 1

    // NOT ALLOWED: enum flags are capped at 32 enum entries, and this enum is
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

    // NOT ALLOWED: `@IntFlag` only makes sense on `Int` properties.
    @IntFlag("a")
    var intFlagWrongType = ""

    // NOT ALLOWED: `@File` only makes sense on `String` properties.
    @File
    var fileWrongType = 1

    // NOT ALLOWED: `@Dir` only makes sense on `String` properties.
    @Dir
    var dirWrongType = 1

    // NOT ALLOWED: `@MultilineText` only makes sense on `String` properties.
    @MultilineText
    var multilineTextWrongType = 1

    // NOT ALLOWED: `@PlaceHolderText` only makes sense on `String`
    // properties.
    @PlaceHolderText
    var placeholderTextWrongType = 1

    // NOT ALLOWED: `@ColorNoAlpha` only makes sense on `Color` properties.
    @ColorNoAlpha
    var colorNoAlphaWrongType = 1
}

// Signal registration checks.
@GodotScript
class ArgumentNameProblemFixture : Node() {
    // ALLOWED: direct signal declarations are auto-registered.
    val directSignal by signal0()

    // ALLOWED: `@ArgumentName` is optional and only names signal arguments.
    @ArgumentName("value")
    val namedSignal = Signal1<Int>("namedSignal")

    // NOT ALLOWED: registered signals should be immutable `val`.
    var mutableSignal = Signal0("mutableSignal")

    // NOT ALLOWED: `@ArgumentName` can only be used on signal-typed
    // properties.
    @ArgumentName("value")
    val signalWrongType = 1
}

// Signal open/override checks.
@GodotScript
open class OpenSignalFixture : Node() {
    // NOT ALLOWED: signals cannot be open.
    open val openSignal by signal0()
}

abstract class AbstractSignalFixture : Node() {
    // NOT ALLOWED: signals cannot be abstract.
    abstract val abstractSignal: Signal0
}

// NOT ALLOWED on the override: signals cannot be overridden.
// (The parent's `open val openSignal` above is itself already an error.)
@GodotScript
class OverrideSignalFixture : OpenSignalFixture() {
    override val openSignal by signal0()
}

// RPC annotation checks.
@GodotScript
class RpcAnnotationProblemFixture : Node() {
    // ALLOWED: `@Rpc` now implies `@Register`.
    @Rpc
    fun rpcImplicitlyRegistered() {
    }

    // NOT ALLOWED: non-zero transfer channels are ignored unless the
    // transfer mode is `UNRELIABLE_ORDERED`.
    @Rpc(transferMode = TransferMode.RELIABLE, transferChannel = 1)
    fun rpcChannelIgnored() {
    }
}

// Callable-reference registration checks.
@GodotScript
class CallableReferenceProblemFixture : Node() {
    // ALLOWED: direct signal declarations are auto-registered.
    val localSignal by signal0()

    override fun _ready() {
        // NOT ALLOWED on the callable reference: connected signal targets must
        // be registered functions.
        localSignal.connectMethod(this, CallableReferenceProblemFixture::signalTargetNotRegistered)
        // ALLOWED on the callable reference: explicit registration is enough
        // for regular callable targets.
        callable0(this::callTargetRegistered).call()
        // NOT ALLOWED on the callable reference: Godot callable targets must
        // be registered functions.
        callable0(this::callTargetNotRegistered).call()
        // NOT ALLOWED on the callable reference: RPC targets must be
        // registered functions.
        rpc(::rpcTargetNotRegistered)
        // ALLOWED on the callable reference: `@Rpc` implies `@Register`.
        rpc(::rpcTargetRegisteredThroughRpc)
        // NOT ALLOWED on the callable reference: RPC targets also need the
        // `@Rpc` annotation.
        rpc(::rpcTargetMissingRpc)
        // NOT ALLOWED on the callable reference: the target has `@Rpc`, but it
        // is explicitly disabled via `RpcMode.DISABLED`.
        rpc(::rpcTargetDisabled)
    }

    // NOT ALLOWED when referenced from `connectMethod`: missing
    // `@Register`.
    fun signalTargetNotRegistered() {
    }

    // ALLOWED when referenced from `call()`: explicit `@Register`.
    @Register
    fun callTargetRegistered() {
    }

    // NOT ALLOWED when referenced from `call()`: missing `@Register`.
    fun callTargetNotRegistered() {
    }

    // NOT ALLOWED when referenced from `rpc()`: missing `@Register`.
    fun rpcTargetNotRegistered() {
    }

    // ALLOWED when referenced from `rpc()`: `@Rpc` implies `@Register`.
    @Rpc
    fun rpcTargetRegisteredThroughRpc() {
    }

    // NOT ALLOWED when referenced from `rpc()`: registered, but missing
    // `@Rpc`.
    @Register
    fun rpcTargetMissingRpc() {
    }

    // NOT ALLOWED when referenced from `rpc()`: RPC-enabled, but explicitly
    // disabled for network access.
    @Rpc(rpcMode = RpcMode.DISABLED)
    fun rpcTargetDisabled() {
    }
}

