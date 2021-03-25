package publish.mavencentral

import org.gradle.api.model.ObjectFactory
import org.gradle.kotlin.dsl.property

open class PublishToMavenCentralPluginExtension(objects: ObjectFactory) {
    val id = objects.property<String>()
    val description = objects.property<String>()
}
