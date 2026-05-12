package godot.tests;

import godot.api.Button;
import godot.api.Control;
import godot.api.Node;
import godot.api.RenderingServer;
import godot.annotation.*;
import godot.core.*;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

@RegisterClass
public class JavaTestClass extends Node {
    @RegisterSignal
    public Signal0 testSignal = Signal0.create(this, "testSignal");

    @RegisterSignal(parameters = {"param1"})
    public Signal1<String> testSignal1 = Signal1.create(this, "testSignal1");

    @RegisterSignal
    public Signal0 lambdaSignalNoParam = Signal0.create(this, "lambdaSignalNoParam");

    @RegisterSignal(parameters = {"str", "long", "node"})
    public Signal3<String, Long, Node> lambdaSignalWithParams = Signal3.create(this, "lambdaSignalWithParams");

    // The following should NOT work as we cannot extract parameter names. The compiler checks should catch that and throw a build error
    //@RegisterSignal
    //public Signal testSignal3 = new Signal2<>(this, "name");

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
    public boolean hasSignalNoParamBeenTriggered = false;

    @RegisterProperty
    public String signalString = "";

    @RegisterProperty
    public long signalLong = Long.MIN_VALUE;

    @RegisterProperty
    public Node signalNode;

    @RegisterProperty
    public Callable javaCallable = LambdaCallable1.create(
            String.class,
            str -> javaCallableString = str
    );

    @RegisterProperty
    public String javaCallableString = "";

    @RegisterProperty
    public VariantArray<Integer> variantArray = new VariantArray<>(Integer.class);

    @RegisterProperty
    public Dictionary<Float, String> dictionary = new Dictionary<>(Float.class, String.class);

    @RegisterProperty
    public boolean notificationTriggered = false;
    

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

        lambdaSignalNoParam.connect(
                LambdaCallable0.create(() -> hasSignalNoParamBeenTriggered = true)
        );

        lambdaSignalWithParams.connect(
                LambdaCallable3.create(
                        String.class,
                        Long.class,
                        Node.class,
                        (str, longValue, node) -> {
                            signalString = str;
                            signalLong = longValue;
                            signalNode = node;
                        }
                )
        );
    }

    @RegisterFunction
    public void connectAndTriggerSignal() {
        Callable1<Void, String> callable = LambdaCallable1.create(
                String.class,
                value -> signalEmitted = true
        );
        testSignal1.connect(callable, ConnectFlags.ONE_SHOT);
        testSignal1.emit("test");
    }

    @RegisterFunction
    @NotNull
    @Override
    public GodotNotification _notification() {
        return godotNotification(
                (JavaTestClass myself, int notification) -> myself.notificationTriggered = true
        );
    }

    @RegisterFunction
    public void signalCallback() {
        signalEmitted = true;
    }

    @RegisterFunction
    public void emitLambdaSignalNoParam() {
        lambdaSignalNoParam.emit();
    }

    @RegisterFunction
    public void emitLambdaSignalWithParam(String str, long longValue, Node node) {
        lambdaSignalWithParams.emit(str, longValue, node);
    }
}
