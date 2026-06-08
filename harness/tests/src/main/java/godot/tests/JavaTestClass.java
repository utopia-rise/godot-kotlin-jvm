package godot.tests;

import godot.api.Button;
import godot.api.Control;
import godot.api.Node;
import godot.api.RenderingServer;
import godot.annotation.*;
import godot.core.*;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

@Script
public class JavaTestClass extends Node {
    @Emit
    public Signal0 testSignal = Signal0.create(this, "testSignal");

    @Emit(parameters = {"param1"})
    public Signal1<String> testSignal1 = Signal1.create(this, "testSignal1");

    @Emit
    public Signal0 lambdaSignalNoParam = Signal0.create(this, "lambdaSignalNoParam");

    @Emit(parameters = {"str", "long", "node"})
    public Signal3<String, Long, Node> lambdaSignalWithParams = Signal3.create(this, "lambdaSignalWithParams");

    // The following should NOT work as we cannot extract parameter names. The compiler checks should catch that and throw a build error
    //@Emit
    //public Signal testSignal3 = new Signal2<>(this, "name");

    @Export
    @Visible
    @EnumTypeHint
    public JavaEnum javaEnum = JavaEnum.JAVA_ENUM_1;

    @Export
    @Visible
    public BitField<JavaEnum> javaFlag = BitField.of(JavaEnum.JAVA_ENUM_1, JavaEnum.JAVA_ENUM_2);

    @Export
    @Visible
    public java.util.List<JavaEnum> javaEnumList = new java.util.ArrayList<>(java.util.List.of(JavaEnum.JAVA_ENUM_1));

    @Export
    @Visible
    public BitField<JavaGodotEnum> javaGodotFlag = BitField.of(JavaGodotEnum.A, JavaGodotEnum.B);

    @Export
    @Visible
    public int exportedInt = 1;

    @Export
    @Visible
    public long exportedLong = 1L;

    @Export
    @Visible
    public float exportedFloat = 1f;

    @Export
    @Visible
    public double exportedDouble = 1.0;

    @Export
    @Visible
    public boolean exportedBoolean = true;

    @Export
    @Visible
    public String exportedString = "blubb";

    @Export
    @Visible
    public byte exportedByte = 1;

    @Export
    @Visible
    public Button exportedButton;

    @Register
    public String greeting() {
        return "Hello from java";
    }

    @Visible
    public boolean signalEmitted = false;

    @Visible
    public boolean hasSignalNoParamBeenTriggered = false;

    @Visible
    public String signalString = "";

    @Visible
    public long signalLong = Long.MIN_VALUE;

    @Visible
    public Node signalNode;

    @Visible
    public Callable javaCallable = LambdaCallable1.create(
            String.class,
            str -> javaCallableString = str
    );

    @Visible
    public String javaCallableString = "";

    @Visible
    public VariantArray<Integer> variantArray = new VariantArray<>(Integer.class);

    @Visible
    public Dictionary<Float, String> dictionary = new Dictionary<>(Float.class, String.class);

    @Visible
    public boolean notificationTriggered = false;
    

    @Register
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

    @Register
    public void connectAndTriggerSignal() {
        Callable1<Void, String> callable = LambdaCallable1.create(
                String.class,
                value -> signalEmitted = true
        );
        testSignal1.connect(callable, ConnectFlags.ONE_SHOT);
        testSignal1.emit("test");
    }

    @Register
    @NotNull
    @Override
    public GodotNotification _notification() {
        return godotNotification(
                (JavaTestClass myself, int notification) -> myself.notificationTriggered = true
        );
    }

    @Register
    public void signalCallback() {
        signalEmitted = true;
    }

    @Register
    public void emitLambdaSignalNoParam() {
        lambdaSignalNoParam.emit();
    }

    @Register
    public void emitLambdaSignalWithParam(String str, long longValue, Node node) {
        lambdaSignalWithParams.emit(str, longValue, node);
    }
}


