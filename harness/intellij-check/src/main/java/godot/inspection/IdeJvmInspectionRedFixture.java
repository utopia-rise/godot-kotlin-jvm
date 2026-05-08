package godot.inspection;

import godot.annotation.Export;
import godot.annotation.GodotScript;
import godot.annotation.Register;
import godot.annotation.Visible;
import godot.annotation.RegisterSignal;
import godot.annotation.Tool;
import godot.api.Node;
import godot.core.Signal0;
import godot.core.StringNames;

// Class-level registration checks.

// Expected red: `@Tool` requires the class itself to be registered.
@Tool
class JvmNotRegisteredButToolFixture extends Node {
}

// Expected red on the class: it is not `@GodotScript`, but it contains
// registered properties, signals, and functions.
class JvmNotRegisteredButMembersFixture extends Node {
    // Expected red via the containing class: registered property inside a
    // non-registered class.
    @Export
    public int propertyShouldStayRed = 1;

    // Expected red via the containing class: registered signal inside a
    // non-registered class.
    @RegisterSignal
    public Signal0 signalShouldStayRed = new Signal0(this, StringNames.asStringName("signalShouldStayRed"));

    // Expected red via the containing class: registered function inside a
    // non-registered class.
    @Register
    public int functionShouldStayRed() {
        return propertyShouldStayRed;
    }
}

// Expected red: `@GodotScript` is present, but the class does not inherit a
// Godot object type.
@GodotScript
class JvmRegisterClassWithoutGodotBaseFixture {
}

// Expected red: registered classes must expose exactly one parameterless
// constructor, and this one only has a parameterized constructor.
@GodotScript
class JvmRegisterClassWithoutDefaultConstructorFixture extends Node {
    public JvmRegisterClassWithoutDefaultConstructorFixture(int number) {
    }
}

// Expected red on both duplicate declarations: they register the same custom
// Godot class name.
@GodotScript(className = "DuplicateJvmInspectionName")
class JvmDuplicateRegisteredNameFixtureOne extends Node {
}

@GodotScript(className = "DuplicateJvmInspectionName")
class JvmDuplicateRegisteredNameFixtureTwo extends Node {
}

// Expected red: generic classes cannot be registered.
@GodotScript
class JvmGenericRegisteredClassFixture<T> extends Node {
}

// Method registration checks.
@GodotScript
public class IdeJvmInspectionRedFixture extends Node {
    // Expected red: notification callbacks like `_ready` must also carry
    // `@Register` inside a registered class.
    @Override
    public void _ready() {
    }

    // Expected red: generic functions cannot be registered.
    @Register
    public <T> void genericRegisteredFunction(T value) {
    }

    // Expected red: registered functions may not exceed the max supported
    // parameter count.
    @Register
    public void tooManyParameters(
            int p01,
            int p02,
            int p03,
            int p04,
            int p05,
            int p06,
            int p07,
            int p08,
            int p09,
            int p10,
            int p11,
            int p12,
            int p13,
            int p14,
            int p15,
            int p16,
            int p17
    ) {
    }
}
