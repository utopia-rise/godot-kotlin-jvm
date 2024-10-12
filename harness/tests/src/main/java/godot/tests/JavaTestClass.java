package godot.tests;

import godot.Button;
import godot.Node;
import godot.RenderingServer;
import godot.annotation.EnumTypeHint;
import godot.annotation.Export;
import godot.annotation.GodotMember;
import godot.annotation.GodotScript;
import godot.core.*;
import org.jetbrains.annotations.NotNull;

@GodotScript
public class JavaTestClass extends Node {
    public Signal0 testSignal = Signal0.create(this, "test_signal");

    public Signal2<String, String> testSignal2 = Signal2.create(this, "test_signal_2", "param1", "param2");

    // The following should NOT work as we cannot extract parameter names. The compiler checks should catch that and throw a build error
//    @RegisterSignal
//    public Signal testSignal3 = new Signal2<>(this, "name");

    @Export
    @EnumTypeHint
    public JavaEnum javaEnum = JavaEnum.JAVA_ENUM_1;

    @Export
    public int exportedInt = 1;

    @Export
    public long exportedLong = 1L;

    @Export
    public float exportedFloat = 1f;

    @Export
    public double exportedDouble = 1.0;

    @Export
    public boolean exportedBoolean = true;

    @Export
    public String exportedString = "blubb";

    @Export
    public byte exportedByte = 1;

    @Export
    public Button exportedButton;

    @GodotMember
    public String greeting() {
        return "Hello from java";
    }

    @GodotMember
    public boolean signalEmitted = false;

    @GodotMember
    public VariantArray<Integer> variantArray = new VariantArray<>(Integer.class);

    @GodotMember
    public Dictionary<Float, String> dictionary = new Dictionary<>(Float.class, String.class);

    public LambdaCallable<Void> lambdaCallable = LambdaCallable0.create(
            Void.class,
            () -> {
                System.out.println("Hello from Callable");
                return null;
            }
    );

    public NativeCallable methodCallable = Callable.create(this, StringNames.asStringName("DummyName"));

    @GodotMember
    @Override
    public void _ready() {
        // Check if Singletons have the correct syntax, without Single.INSTANCE
        long constant = RenderingServer.NO_INDEX_ARRAY;
        Signal signal = RenderingServer.getFramePreDraw();
        RenderingServer.getDefaultClearColor();
    }

    @GodotMember
    public void connectAndTriggerSignal() {
        connect(
                StringNames.asStringName("test_signal"),
                new NativeCallable(this, StringNames.asStringName("signal_callback")),
                (int) ConnectFlags.CONNECT_ONE_SHOT.getId()
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

    @GodotMember
    public void signalCallback() {
        signalEmitted = true;
    }
}
