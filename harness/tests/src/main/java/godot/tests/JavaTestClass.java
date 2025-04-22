package godot.tests;

import godot.api.Button;
import godot.api.Control;
import godot.api.Node;
import godot.api.RenderingServer;
import godot.annotation.*;
import godot.core.*;
import org.jetbrains.annotations.NotNull;

@RegisterClass
public class JavaTestClass extends Node {
    @RegisterSignal
    public Signal0 testSignal = Signal0.create(this, "test_signal");

    @RegisterSignal(parameters = {"param1", "param2"})
    public Signal2<String, String> testSignal2 = Signal2.create(this, "test_signal_2");

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

    public LambdaCallable<Void> lambdaCallable = LambdaCallable0.create(
            Void.class,
            () -> {
                System.out.println("Hello from Callable");
                return null;
            }
    );

    public NativeCallable methodCallable = Callable.create(this, StringNames.asStringName("DummyName"));

    @RegisterFunction
    @Override
    public void _ready() {
        // Check if Singletons have the correct syntax, without Single.INSTANCE
        long constant = RenderingServer.NO_INDEX_ARRAY;
        Signal signal = RenderingServer.getFramePreDraw();
        RenderingServer.getDefaultClearColor();
        // Check what Enum/Bitfields look like
        Control control = new Control();
        control.setHSizeFlags(Control.SizeFlags.FILL);
        control.free();
    }

    @RegisterFunction
    public void connectAndTriggerSignal() {
        connect(
                StringNames.asStringName("test_signal"),
                new NativeCallable(this, StringNames.asStringName("signal_callback")),
                (int) ConnectFlags.ONE_SHOT.getId()
        );
        emitSignal(StringNames.asStringName("test_signal"));
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
