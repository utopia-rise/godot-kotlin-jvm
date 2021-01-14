package plugins.intellij

data class BuildConfig(
    val sdk: String,
    val prefix: String,
    val extraSource: String,
    val version: VersionRange,
    val ideVersionsForVerifierTask: List<String>,
    val deps: List<String> = emptyList()
)
