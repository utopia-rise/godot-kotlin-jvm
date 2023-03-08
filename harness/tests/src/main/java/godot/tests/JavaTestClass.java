package godot.tests;

import godot.Button;
import godot.Node;
import godot.annotation.*;
import godot.signals.Signal;
import godot.signals.Signal2;
import godot.signals.SignalProvider;

@RegisterClass
public class JavaTestClass extends Node {
    @RegisterSignal
    public Signal testSignal = SignalProvider.signal(this, "test_signal");

    @RegisterSignal
    public Signal2<String, String> testSignal2 = SignalProvider.signal(this, "test_signal_2", "param1", "param2");

    @Export
    @RegisterProperty
    @EnumTypeHint
    public JavaEnum javaEnum = JavaEnum.JAVA_ENUM_1;

    @Export
    @RegisterProperty
    public int exportedInt = 1;

    @Export
    @RegisterProperty
    public long exportedLong = 1L;

    @Export
    @RegisterProperty
    public float exportedFloat = 1f;

    @Export
    @RegisterProperty
    public double exportedDouble = 1.0;

    @Export
    @RegisterProperty
    public boolean exportedBoolean = true;

    @Export
    @RegisterProperty
    public String exportedString = "blubb";

    @Export
    @RegisterProperty
    public byte exportedByte = 1;

    @Export
    @RegisterProperty
    public Button exportedButton;

    @RegisterFunction
    public String greeting() {
        return "Hello from java";
    }
}
