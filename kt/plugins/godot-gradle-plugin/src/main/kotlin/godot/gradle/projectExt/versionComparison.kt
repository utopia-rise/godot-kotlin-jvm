package godot.gradle.projectExt

fun isVersionLowerThan(actualVersion: String, minimumVersion: String): Boolean {
    val actualParts = actualVersion.versionComponents()
    val minimumParts = minimumVersion.versionComponents()
    val maxSize = maxOf(actualParts.size, minimumParts.size)

    for (index in 0 until maxSize) {
        val actualPart = actualParts.getOrElse(index) { 0 }
        val minimumPart = minimumParts.getOrElse(index) { 0 }
        when {
            actualPart < minimumPart -> return true
            actualPart > minimumPart -> return false
        }
    }

    return false
}

private fun String.versionComponents(): List<Int> = split('.', '-', '_')
    .mapNotNull { part -> part.takeWhile(Char::isDigit).takeIf(String::isNotEmpty)?.toIntOrNull() }
