package godot.publish.gradle.mavencentral

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.plugins.JavaPluginExtension
import org.gradle.api.publish.PublishingExtension
import org.gradle.api.publish.maven.MavenPublication
import org.gradle.plugins.signing.Sign
import org.gradle.plugins.signing.SigningExtension

class PublishToMavenCentralPlugin: Plugin<Project> {
    override fun apply(target: Project) {
        target.plugins.apply("maven-publish")

        val isReleaseMode = !(target.version as String).endsWith("-SNAPSHOT")

        setupSigning(target)

        target.afterEvaluate {
            target.extensions.getByType(JavaPluginExtension::class.java).apply {
                withJavadocJar()
                withSourcesJar()
            }

            target.extensions.getByType(PublishingExtension::class.java).apply {
                repositories.apply {
                    maven { mavenArtifactRepository ->
                        val targetRepo = if (isReleaseMode) {
                            "https://s01.oss.sonatype.org/service/local/staging/deploy/maven2/"
                        } else {
                            "https://s01.oss.sonatype.org/content/repositories/snapshots/"
                        }
                        mavenArtifactRepository.setUrl(targetRepo)
                    }
                }
                publications { publicationContainer ->
                    publicationContainer.all {
                        if (this is MavenPublication) {
                            groupId = "com.utopia-rise"
                            artifactId = target.name
                            version = target.version as String

                            pom { mavenPom ->
                                mavenPom.url.set("https://github.com/utopia-rise/godot-kotlin-jvm.git")

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
        }
    }

    private fun setupSigning(target: Project) {
        val ossrhUser = target.propOrEnv("GODOT_KOTLIN_MAVEN_CENTRAL_TOKEN_USERNAME")
        val ossrhPassword = target.propOrEnv("GODOT_KOTLIN_MAVEN_CENTRAL_TOKEN_PASSWORD")
        val signingKey = target.propOrEnv("GODOT_KOTLIN_GPG_PRIVATE_KEY_ASCII")
        val signingPassword = target.propOrEnv("GODOT_KOTLIN_GPG_KEY_PASSPHRASE")

        if (signingKey != null && signingPassword != null) { // for local development, If missing in CI it will fail later on deploy so we would notice the issue then
            target.plugins.apply("signing")

            target.extensions.configure(SigningExtension::class.java) { signingExtension ->
                signingExtension.useInMemoryPgpKeys(signingKey, signingPassword)
                target.extensions.findByType(PublishingExtension::class.java)?.publications?.all { publication ->
                    signingExtension.sign(publication)

                    target
                        .tasks
                        .filter { task -> task.group == "publishing" && task.name.startsWith("publish") }
                        .forEach { task ->
                            task.dependsOn(target.tasks.withType(Sign::class.java))
                        }
                }
            }

            target.extensions.configure(PublishingExtension::class.java) { publishingExtension ->
                publishingExtension.repositories { repositoryHandler ->
                    repositoryHandler.maven { mavenArtifactRepository ->
                        mavenArtifactRepository.credentials { passwordCredentials ->
                            passwordCredentials.username = ossrhUser
                            passwordCredentials.password = ossrhPassword
                        }
                    }
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
