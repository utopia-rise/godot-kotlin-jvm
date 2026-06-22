package godot.tests.events;

import godot.annotation.Script;
import godot.annotation.Register;
import godot.annotation.Visible;
import godot.api.Node;
import godot.core.Callable0;
import godot.core.Callable1;
import godot.core.Callable2;
import godot.core.MethodCallable3;
import godot.core.MethodStringName3;
import godot.core.VariantArray;

@Script
public class CallableMethodBindJavaTest extends Node {
    @Visible
    public VariantArray<Integer> methodBinds = new VariantArray<>(Integer.class);

    public CallableMethodBindJavaTest() {
        methodBinds.add(-1);
        methodBinds.add(-1);
        methodBinds.add(-1);
    }

    @Register
    public void callWithMethodWithAllBinds() {
        MethodCallable3<Void, Integer, Integer, Integer> unboundCallable = MethodCallable3.create(
            this,
            new MethodStringName3<CallableMethodBindJavaTest, Void, Integer, Integer, Integer>("record_method_bind")
        );
        Callable0<Void> boundCallable = unboundCallable.bind(1, 2, 3);
        boundCallable.call();
    }

    @Register
    public void callWithMethodWithTwoBinds() {
        MethodCallable3<Void, Integer, Integer, Integer> unboundCallable = MethodCallable3.create(
            this,
            new MethodStringName3<CallableMethodBindJavaTest, Void, Integer, Integer, Integer>("record_method_bind")
        );
        Callable1<Void, Integer> boundCallable = unboundCallable.bind(5, 6);
        boundCallable.call(4);
    }

    @Register
    public void callWithMethodWithOneBind() {
        MethodCallable3<Void, Integer, Integer, Integer> unboundCallable = MethodCallable3.create(
            this,
            new MethodStringName3<CallableMethodBindJavaTest, Void, Integer, Integer, Integer>("record_method_bind")
        );
        Callable2<Void, Integer, Integer> boundCallable = unboundCallable.bind(9);
        boundCallable.call(7, 8);
    }

    @Register
    public void callWithMethodWithNoBind() {
        MethodCallable3<Void, Integer, Integer, Integer> unboundCallable = MethodCallable3.create(
            this,
            new MethodStringName3<CallableMethodBindJavaTest, Void, Integer, Integer, Integer>("record_method_bind")
        );
        unboundCallable.call(10, 11, 12);
    }

    @Register
    public void recordMethodBind(Integer first, Integer second, Integer third) {
        methodBinds.set(0, first - 10);
        methodBinds.set(1, second - 10);
        methodBinds.set(2, third - 10);
    }
}

