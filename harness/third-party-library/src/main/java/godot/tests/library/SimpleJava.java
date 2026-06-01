package godot.tests.library;

import godot.annotation.Export;
import godot.annotation.RegisterClass;
import godot.annotation.RegisterFunction;
import godot.annotation.RegisterProperty;
import godot.api.Node;

@RegisterClass
public class SimpleJava extends Node {

    @Export
    @RegisterProperty
    public String testProperty = "Hello from third-party-library!";

    @RegisterFunction
    public String provideGreeting() {
        return testProperty;
    }
}
