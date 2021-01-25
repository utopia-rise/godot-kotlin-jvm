package godot.intellij.plugin.data.model

import com.intellij.openapi.vfs.VirtualFile

/**
 * Data container for needed information's about a registered class
 *
 * @property fqName FullyQualified name of the registered class as string
 * @property registeredName Registered name of the class. Fully qualified names are **not** underscored (this is only relevant for the entry generation)
 * @property vFile VirtualFile in which the class resides. Needed for goToSource and similar functionality
 */
data class RegisteredClassDataContainer(
    val fqName: String,
    val registeredName: String,
    val vFile: VirtualFile
)
