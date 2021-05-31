package godot.gradle

import org.gradle.api.model.ObjectFactory

open class GodotExtension(objects: ObjectFactory) {
    val isAndroidExportEnabled = objects.property(Boolean::class.java)
    val dxToolPath = objects.property(String::class.java)
}
