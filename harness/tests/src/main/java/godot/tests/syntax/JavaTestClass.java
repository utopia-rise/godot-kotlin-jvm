package godot.tests.syntax;

import godot.api.Node;
import godot.annotation.Export;
import godot.annotation.RegisterClass;
import godot.annotation.RegisterFunction;
import godot.annotation.RegisterProperty;
import godot.core.GodotNotification;
import org.jetbrains.annotations.NotNull;

@RegisterClass
public class JavaTestClass extends Node {
    @Export
    @RegisterProperty
    public int exportedInt = 1;

    @RegisterProperty
    public boolean enteredTree = false;

    @RegisterProperty
    public boolean notificationTriggered = false;

    @RegisterFunction
    public String greeting() {
        return "Hello from java";
    }

    @RegisterFunction
    @Override
    public void _enterTree() {
        enteredTree = true;
    }

    @RegisterFunction
    @NotNull
    @Override
    public GodotNotification _notification() {
        return godotNotification(
            (JavaTestClass myself, int notification) -> myself.notificationTriggered = true
        );
    }
}
