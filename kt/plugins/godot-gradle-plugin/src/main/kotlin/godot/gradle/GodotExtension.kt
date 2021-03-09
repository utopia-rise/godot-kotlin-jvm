package godot.gradle

import org.gradle.api.model.ObjectFactory
import org.gradle.kotlin.dsl.property

open class GodotExtension(objects: ObjectFactory) {
    val isAndroidExportEnabled = objects.property<Boolean>()
    val dxToolPath = objects.property<String>()
}
