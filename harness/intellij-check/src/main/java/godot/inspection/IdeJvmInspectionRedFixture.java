package godot.inspection;

import godot.annotation.Export;
import godot.annotation.Script;
import godot.annotation.Register;
import godot.annotation.Visible;
import godot.annotation.Emit;
import godot.annotation.Tool;
import godot.api.Node;
import godot.core.Signal0;
import godot.core.StringNames;

// Class-level registration checks.

// Expected red: `@Tool` requires the class itself to be registered.
@Tool
class JvmNotRegisteredButToolFixture extends Node {
}

// Expected red on the class: it is not `@Script`, but it contains
// registered properties, signals, and functions.
class JvmNotRegisteredButMembersFixture extends Node {
    // Expected red via the containing class: registered property inside a
    // non-registered class.
    @Export
    @Visible
    public int propertyShouldStayRed = 1;

    // Expected red via the containing class: registered signal inside a
    // non-registered class.
    @Emit
    public Signal0 signalShouldStayRed = new Signal0(this, StringNames.asStringName("signalShouldStayRed"));

    // Expected red via the containing class: registered function inside a
    // non-registered class.
    @Register
    public int functionShouldStayRed() {
        return propertyShouldStayRed;
    }
}

// Expected red: `@Script` is present, but the class does not inherit a
// Godot object type.
@Script
class JvmGodotScriptWithoutGodotBaseFixture {
}

// Expected red: registered classes must expose exactly one parameterless
// constructor, and this one only has a parameterized constructor.
@Script
class JvmGodotScriptWithoutDefaultConstructorFixture extends Node {
    public JvmGodotScriptWithoutDefaultConstructorFixture(int number) {
    }
}

// Expected red on both duplicate declarations: they register the same custom
// Godot class name.
@Script(className = "DuplicateJvmInspectionName")
class JvmDuplicateRegisteredNameFixtureOne extends Node {
}

@Script(className = "DuplicateJvmInspectionName")
class JvmDuplicateRegisteredNameFixtureTwo extends Node {
}

// Expected red: generic classes cannot be registered.
@Script
class JvmGenericRegisteredClassFixture<T> extends Node {
}

// Method registration checks.
@Script
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


