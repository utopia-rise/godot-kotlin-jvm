package godot.gradle

open class GodotEntryGeneratorExtension {
    internal val entryGeneratorExtensions: MutableList<String> = mutableListOf()
    internal val entryGeneratorExtensionsWithAnnotations: MutableList<String> = mutableListOf()

    class EntryGeneratorExtensionsScope(
        private val entryGeneratorExtensions: MutableList<String>,
        private val entryGeneratorExtensionsWithAnnotations: MutableList<String>
    ) {
        fun extension(extension: String) {
            entryGeneratorExtensions.add(extension)
        }

        fun extensionWithAnnotations(extension: String) {
            entryGeneratorExtensionsWithAnnotations.add(extension)
        }
    }

    fun extensions(configurationBlock: EntryGeneratorExtensionsScope.() -> Unit) {
        configurationBlock(EntryGeneratorExtensionsScope(entryGeneratorExtensions, entryGeneratorExtensionsWithAnnotations))
    }
}
