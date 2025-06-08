
package publish

import com.vanniktech.maven.publish.MavenPublishBaseExtension
import com.vanniktech.maven.publish.MavenPublishPlugin
import com.vanniktech.maven.publish.SonatypeHost
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.plugins.JavaPluginExtension
import org.gradle.api.publish.PublishingExtension
import org.gradle.api.publish.maven.MavenPublication
import org.gradle.plugins.signing.Sign

@Suppress("unused") // false positive
class PublishToMavenCentralPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        target.plugins.apply(org.gradle.api.publish.maven.plugins.MavenPublishPlugin::class.java)

        target.afterEvaluate { evaluatedProject ->
            val mavenCentralUser = target.propOrEnv("GODOT_KOTLIN_MAVEN_CENTRAL_PORTAL_TOKEN_USERNAME")
            val mavenCentralPassword = target.propOrEnv("GODOT_KOTLIN_MAVEN_CENTRAL_PORTAL_TOKEN_PASSWORD")
            val gpgInMemoryKey = target.propOrEnv("GODOT_KOTLIN_GPG_PRIVATE_KEY_ASCII")
            val gpgPassword = target.propOrEnv("GODOT_KOTLIN_GPG_KEY_PASSPHRASE")

            val canSign = mavenCentralUser != null && mavenCentralPassword != null && gpgInMemoryKey != null && gpgPassword != null

            target.extensions.getByType(JavaPluginExtension::class.java).apply {
                withSourcesJar()
                withJavadocJar()
            }

            if (canSign) {
                evaluatedProject.logger.info("Will sign artifact for project \"${evaluatedProject.name}\" and setup publishing")

                evaluatedProject.pluginManager.apply(MavenPublishPlugin::class.java)
                evaluatedProject.extensions.getByType(MavenPublishBaseExtension::class.java).apply {
                    publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL)
                    signAllPublications()
                }
            } else {
                evaluatedProject.logger.warn("Cannot sign project \"${evaluatedProject.name}\" as credentials are missing. Will not setup signing and remote publishing credentials. Publishing will only work to maven local!")
            }

            target.extensions.getByType(PublishingExtension::class.java).apply {
                publications { publicationContainer ->
                    publicationContainer.all { publication ->
                        if (publication is MavenPublication) {
                            publication.groupId = "com.utopia-rise"
                            val artifactId = publication.artifactId
                            publication.artifactId = if (artifactId.isNullOrEmpty()) target.name else artifactId
                            publication.version = target.version as String

                            publication.pom { mavenPom ->
                                mavenPom.url.set("https://github.com/utopia-rise/godot-kotlin-jvm.git")

                                if (mavenPom.name.getOrElse("").isNullOrEmpty()) {
                                    mavenPom.name.set(target.name)
                                }
                                if (mavenPom.description.getOrElse("").isNullOrEmpty()) {
                                    mavenPom.description.set(target.description ?: "Godot kotlin jvm module")
                                }

                                mavenPom.scm { mavenPomScm ->
                                    mavenPomScm.connection.set("scm:git:https://github.com/utopia-rise/godot-kotlin-jvm")
                                    mavenPomScm.developerConnection.set("scm:git:github.com:utopia-rise/godot-kotlin-jvm.git")
                                    mavenPomScm.tag.set("master") //FIXME
                                    mavenPomScm.url.set("https://github.com/utopia-rise/godot-kotlin-jvm")
                                }

                                mavenPom.licenses { mavenPomLicenseSpec ->
                                    mavenPomLicenseSpec.license { mavenPomLicense ->
                                        mavenPomLicense.name.set("MIT License")
                                        mavenPomLicense.url.set("https://github.com/utopia-rise/godot-kotlin-jvm/blob/master/LICENSE")
                                        mavenPomLicense.distribution.set("repo")
                                    }
                                }

                                mavenPom.developers { mavenPomDevelopersSpec ->
                                    mavenPomDevelopersSpec.developer { mavenPomDeveloper ->
                                        mavenPomDeveloper.id.set("core")
                                        mavenPomDeveloper.name.set("Ranie Jade Ramiso")
                                        mavenPomDeveloper.url.set("https://github.com/raniejade")
                                        mavenPomDeveloper.email.set("raniejaderamiso@gmail.com")
                                    }
                                    mavenPomDevelopersSpec.developer { mavenPomDeveloper ->
                                        mavenPomDeveloper.id.set("core")
                                        mavenPomDeveloper.name.set("Pierre-Thomas Meisels")
                                        mavenPomDeveloper.url.set("https://github.com/piiertho")
                                        mavenPomDeveloper.email.set("meisels27@yahoo.fr")
                                    }
                                    mavenPomDevelopersSpec.developer { mavenPomDeveloper ->
                                        mavenPomDeveloper.id.set("core")
                                        mavenPomDeveloper.name.set("Cedric Hippmann")
                                        mavenPomDeveloper.url.set("https://github.com/chippmann")
                                        mavenPomDeveloper.email.set("cedric.hippmann@hotmail.com")
                                    }
                                    mavenPomDevelopersSpec.developer { mavenPomDeveloper ->
                                        mavenPomDeveloper.id.set("core")
                                        mavenPomDeveloper.name.set("Tristan Grespinet")
                                        mavenPomDeveloper.url.set("https://github.com/CedNaru")
                                        mavenPomDeveloper.email.set("ced.naru@gmail.com")
                                    }
                                }
                            }
                        }
                    }
                }
            }

            if (canSign) {
                target
                    .tasks
                    .filter { task -> task.name.startsWith("publish") }
                    .forEach { task ->
                        task.dependsOn(target.tasks.withType(Sign::class.java))
                    }
            }
        }
    }
}

fun Project.propOrEnv(name: String): String? {
    var property: String? = findProperty(name) as String?
    if (property == null) {
        property = System.getenv(name)
    }
    return property
}
