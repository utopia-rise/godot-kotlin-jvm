package godot.tests.events;

import godot.annotation.RegisterClass;
import godot.annotation.RegisterFunction;
import godot.annotation.RegisterProperty;
import godot.annotation.RegisterSignal;
import godot.api.Node;
import godot.core.MethodCallable1;
import godot.core.MethodCallable2;
import godot.core.MethodStringName1;
import godot.core.MethodStringName2;
import godot.core.Signal1;
import godot.core.Signal2;

@RegisterClass
public class SignalJavaTest extends Node {
    @RegisterSignal
    public final Signal1<Boolean> readySignal = Signal1.create(this, "readySignal");

    @RegisterSignal
    public final Signal2<String, Integer> payloadSignal = Signal2.create(this, "payloadSignal");

    @RegisterProperty
    public boolean methodSignalTriggered = false;

    @RegisterProperty
    public boolean lambdaSignalTriggered = false;

    @RegisterProperty
    public String payloadString = "";

    @RegisterProperty
    public int payloadInt = Integer.MIN_VALUE;

    @RegisterFunction
    @Override
    public void _ready() {
        readySignal.connect(MethodCallable1.create(
            this,
            new MethodStringName1<SignalJavaTest, Void, Boolean>("onReadySignal")
        ));
        payloadSignal.connect(MethodCallable2.create(
            this,
            new MethodStringName2<SignalJavaTest, Void, String, Integer>("onPayloadSignal")
        ));

        readySignal.emit(true);
        payloadSignal.emit("java-events", 17);
    }

    @RegisterFunction
    public void onReadySignal(Boolean value) {
        methodSignalTriggered = value;
    }

    @RegisterFunction
    public void onPayloadSignal(String text, Integer value) {
        lambdaSignalTriggered = true;
        payloadString = text;
        payloadInt = value;
    }
}
