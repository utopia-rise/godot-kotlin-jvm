package godot.tests.events;

import godot.annotation.RegisterClass;
import godot.annotation.RegisterFunction;
import godot.annotation.RegisterProperty;
import godot.api.Node;
import godot.core.Callable;
import godot.core.LambdaCallable0;
import godot.core.LambdaCallable1;

@RegisterClass
public class LambdaCallableJavaTest extends Node {
    @RegisterProperty
    public boolean callableNoParamTriggered = false;

    @RegisterProperty
    public boolean callableWithParamTriggered = false;

    @RegisterProperty
    public String callableString = "";

    @RegisterProperty
    public Callable callableProperty = LambdaCallable1.create(String.class, value -> callableString = value);

    @RegisterFunction
    public void markCallableNoParamTriggered() {
        callableNoParamTriggered = true;
    }

    @RegisterFunction
    public void callCallableNoParam() {
        LambdaCallable0.create(this::markCallableNoParamTriggered).call();
    }

    @RegisterFunction
    public void callCallableNoParamDeferred() {
        LambdaCallable0.create(this::markCallableNoParamTriggered).callDeferred();
    }

    @RegisterFunction
    public void markCallableWithParamTriggered(Boolean flag) {
        callableWithParamTriggered = flag;
    }

    @RegisterFunction
    public void callCallableWithParam() {
        LambdaCallable1.create(Boolean.class, this::markCallableWithParamTriggered).call(true);
    }

    @RegisterFunction
    public void callCallableWithParamDeferred() {
        LambdaCallable1.create(Boolean.class, this::markCallableWithParamTriggered).callDeferred(true);
    }
}
