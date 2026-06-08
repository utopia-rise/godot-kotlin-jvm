package godot.tests.library;

import godot.annotation.Export;
import godot.annotation.Script;
import godot.annotation.Register;
import godot.annotation.Visible;
import godot.api.Node;

@Script
public class SimpleJava extends Node {

    @Export
    @Visible
    public String testProperty = "Hello from third-party-library!";

    @Register
    public String provideGreeting() {
        return testProperty;
    }
}


