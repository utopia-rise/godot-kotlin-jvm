package godot.tests;

import godot.core.GodotEnum;

public enum JavaGodotEnum implements GodotEnum {
    A(2),
    B(8);

    private final long value;

    JavaGodotEnum(long value) {
        this.value = value;
    }

    @Override
    public long getValue() {
        return value;
    }
}
