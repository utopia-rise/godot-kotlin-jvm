package godot.intellij.plugin.extension

fun String.snakeToLowerCamelCase(): String {
    return "_[a-zA-Z]"
        .toRegex()
        .replace(this) {
            it
                .value
                .replace("_", "")
                .toUpperCase()
        }
}
