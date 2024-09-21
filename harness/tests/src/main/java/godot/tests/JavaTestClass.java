package godot.tests;

import godot.Button;
import godot.Node;
import godot.annotation.*;
import godot.core.*;
import org.jetbrains.annotations.NotNull;

@RegisterClass
public class JavaTestClass extends Node {
    @RegisterSignal
    public Signal testSignal = SignalProvider.signal(this, "test_signal");

    @RegisterSignal
    public Signal2<String, String> testSignal2 = SignalProvider.signal(this, "test_signal_2", "param1", "param2");

    // The following should NOT work as we cannot extract parameter names. The compiler checks should catch that and throw a build error
//    @RegisterSignal
//    public Signal testSignal3 = new Signal2<>(this, "name");

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

    @RegisterProperty
    public boolean signalEmitted = false;

    @RegisterProperty
    public VariantArray<Integer> variantArray = new VariantArray<>(Integer.class);

    @RegisterProperty
    public Dictionary<Float, String> dictionary = new Dictionary<>(Float.class, String.class);

    @RegisterFunction
    public void connectAndTriggerSignal() {
        connect(
                StringNameUtils.asStringName("test_signal"),
                new NativeCallable(this, StringNameUtils.asStringName("signal_callback")),
                (int) ConnectFlags.CONNECT_ONE_SHOT.getId()
        );
        emitSignal(StringNameUtils.asStringName("test_signal"));
    }

    @NotNull
    @Override
    public GodotNotification _notification() {
        return godotNotification(
                this, (myself, notification) -> {
                    System.out.println(notification);
                    return null;
                }
        );
    }

    @RegisterFunction
    public void signalCallback() {
        signalEmitted = true;
    }
}
