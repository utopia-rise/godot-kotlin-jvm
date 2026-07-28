package godot.registration.examples;

import godot.annotation.IntRange;
import godot.annotation.Rpc;
import godot.annotation.RpcMode;
import godot.api.Node;
import godot.core.Signal1;
import godot.global.GD;

// Set the IDE registration mode to Automatic. The class and its six Godot-facing
// declarations should be highlighted in green.
public class JavaRegistrationAutomaticExample extends Node {
    public String displayName = "Player";

    @IntRange(min = 0, max = 100)
    public int health = 100;

    public final Signal1<Integer> damaged =
            Signal1.create(this, "damaged");

    public void heal(int amount) {
        health = Math.min(health + amount, 100);
    }

    @Override
    public void _ready() {
        GD.print("Player is ready");
    }

    @Rpc(rpcMode = RpcMode.ANY)
    public void synchronizeHealth(int value) {
        health = value;
    }
}
