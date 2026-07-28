package godot.registration.examples;

import godot.annotation.*;
import godot.api.Node;
import godot.core.Signal1;
import godot.global.GD;

// Set the IDE registration mode to Explicit. The class and its five Godot-facing
// declarations should be highlighted in green.
@Script
public class JavaRegistrationExplicitExample extends Node {
    @Export
    @Visible
    @IntRange(min = 0, max = 100)
    public int health = 100;

    @Emit
    public final Signal1<Integer> damaged =
            Signal1.create(this, "damaged");

    @Register
    public void heal(int amount) {
        health = Math.min(health + amount, 100);
    }

    @Register
    @Override
    public void _ready() {
        GD.print("Player is ready");
    }

    @Rpc(rpcMode = RpcMode.ANY)
    @Register
    public void synchronizeHealth(int value) {
        health = value;
    }
}
