package publish

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.plugins.JavaPluginExtension
import org.gradle.api.publish.PublishingExtension
import org.gradle.api.publish.maven.MavenPublication
import org.gradle.api.tasks.SourceSetContainer
import org.gradle.jvm.tasks.Jar
import org.gradle.plugins.signing.Sign
import org.gradle.plugins.signing.SigningExtension

class PublishToMavenCentralPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        target.plugins.apply("maven-publish")

        val ossrhUser = target.propOrEnv("GODOT_KOTLIN_MAVEN_CENTRAL_TOKEN_USERNAME")
        val ossrhPassword = target.propOrEnv("GODOT_KOTLIN_MAVEN_CENTRAL_TOKEN_PASSWORD")
        val signingKey = target.propOrEnv("GODOT_KOTLIN_GPG_PRIVATE_KEY_ASCII")
        val signingPassword = target.propOrEnv("GODOT_KOTLIN_GPG_KEY_PASSPHRASE")
        val canSign = ossrhUser != null && ossrhPassword != null && signingKey != null && signingPassword != null

        if (canSign) {
            target.plugins.apply("signing")
            target.logger.info("Will sign artifact for project \"${target.name}\" and setup publishing")
        } else {
            target.logger.warn("Cannot sign project \"${target.name}\" as credentials are missing. Will not setup signing and remote publishing credentials. Publishing will only work to maven local!")
        }

        target.afterEvaluate { project ->
            val isReleaseMode = !(project.version as String).endsWith("-SNAPSHOT")

            if (canSign) { // for local development, If missing in CI it will fail later on deploy so we would notice the issue then
                project.extensions.configure(SigningExtension::class.java) { signingExtension ->
                    signingExtension.useInMemoryPgpKeys(signingKey, signingPassword)
                    project.extensions.findByType(PublishingExtension::class.java)?.publications?.all { publication ->
                        signingExtension.sign(publication)
                    }
                }
            }

            project.extensions.getByType(JavaPluginExtension::class.java).apply {
                withSourcesJar()
                withJavadocJar()
            }

            project.extensions.getByType(PublishingExtension::class.java).apply {
                repositories.apply {
                    maven { mavenArtifactRepository ->
                        val targetRepo = if (isReleaseMode) {
                            "https://s01.oss.sonatype.org/service/local/staging/deploy/maven2/"
                        } else {
                            "https://s01.oss.sonatype.org/content/repositories/snapshots/"
                        }
                        mavenArtifactRepository.setUrl(targetRepo)

                        if (canSign) {
                            mavenArtifactRepository.credentials { passwordCredentials ->
                                passwordCredentials.username = ossrhUser
                                passwordCredentials.password = ossrhPassword
                            }
                        }
                    }
                }
                publications { publicationContainer ->
                    publicationContainer.all { publication ->
                        if (publication is MavenPublication) {
                            publication.groupId = "com.utopia-rise"
                            publication.artifactId = project.name
                            publication.version = project.version as String

                            publication.pom { mavenPom ->
                                mavenPom.url.set("https://github.com/utopia-rise/godot-kotlin-jvm.git")

                                if (mavenPom.name.getOrElse("").isNullOrEmpty()) {
                                    mavenPom.name.set(project.name)
                                }
                                if (mavenPom.description.getOrElse("").isNullOrEmpty()) {
                                    mavenPom.description.set(project.description ?: "Godot kotlin jvm module")
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
                project
                    .tasks
                    .filter { task -> task.name.startsWith("publish") }
                    .forEach { task ->
                        task.dependsOn(project.tasks.withType(Sign::class.java))
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
