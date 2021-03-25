package publish.mavencentral

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.publish.PublishingExtension
import org.gradle.api.publish.maven.MavenPublication
import org.gradle.jvm.tasks.Jar
import org.gradle.kotlin.dsl.extra
import org.gradle.kotlin.dsl.get
import org.gradle.plugins.signing.SigningExtension

class PublishToMavenCentralPlugin: Plugin<Project> {
    override fun apply(target: Project) {
        target.plugins.apply("maven-publish")
        target.plugins.apply("signing")

        val publishToMavenCentralPluginExtension = target.extensions.create("godotKotlinJvmPublication", PublishToMavenCentralPluginExtension::class.java)

        val ossrhUser = target.propOrEnv("GODOT_KOTLIN_MAVEN_CENTRAL_TOKEN_USERNAME")
        val ossrhPassword = target.propOrEnv("GODOT_KOTLIN_MAVEN_CENTRAL_TOKEN_PASSWORD")
        val signingKey = target.propOrEnv("GODOT_KOTLIN_SIGNING_KEY")
        val signingPassword = target.propOrEnv("GODOT_KOTLIN_SIGNING_PASSWORD")

        val releaseMode = target.extra["releaseMode"] == true

        @Suppress("UNCHECKED_CAST")
        val artifacts = target.extra["artifacts"] as Array<String>

        target.extensions.configure(SigningExtension::class.java) {
            @Suppress("UnstableApiUsage")
            useInMemoryPgpKeys(signingKey, signingPassword)
            target.extensions.findByType(PublishingExtension::class.java)?.publications?.all {
                if (artifacts.contains(name)) {
                    sign(this)
                }
            }
        }

        @Suppress("UnstableApiUsage")
        val stubJavaDocJar = target.tasks.register("stubJavaDocJar", Jar::class.java) {
            archiveClassifier.value("javadoc")
        }

        target.extensions.configure(PublishingExtension::class.java) {
            repositories {
                maven {
                    val targetRepo = if (releaseMode) {
                        "https://oss.sonatype.org/service/local/staging/deploy/maven2/"
                    } else {
                        "https://oss.sonatype.org/content/repositories/snapshots/"
                    }
                    setUrl(targetRepo)

                    credentials {
                        username = ossrhUser
                        password = ossrhPassword
                    }
                }
            }
            publications {
                all {
                    if (this is MavenPublication) {
                        groupId = "com.utopia-rise"
                        artifactId = publishToMavenCentralPluginExtension.id.get()
                        version = target.version as String

                        from(target.components["java"])
                        artifact(stubJavaDocJar.get())

                        pom {
                            url.set("https://github.com/utopia-rise/godot-kotlin-jvm.git")
                            description.set(publishToMavenCentralPluginExtension.description.get())

                            scm {
                                connection.set("scm:git:https://github.com/utopia-rise/godot-kotlin-jvm")
                                developerConnection.set("scm:git:github.com:utopia-rise/godot-kotlin-jvm.git")
                                tag.set("master") //FIXME
                                url.set("https://github.com/utopia-rise/godot-kotlin-jvm")
                            }

                            licenses {
                                license {
                                    name.set("MIT License")
                                    url.set("https://github.com/utopia-rise/godot-kotlin-jvm/blob/master/LICENSE")
                                    distribution.set("repo")
                                }
                            }

                            developers {
                                developer {
                                    id.set("core")
                                    name.set("Ranie Jade Ramiso")
                                    url.set("https://github.com/raniejade")
                                    email.set("raniejaderamiso@gmail.com")
                                }
                                developer {
                                    id.set("core")
                                    name.set("Pierre-Thomas Meisels")
                                    url.set("https://github.com/piiertho")
                                    email.set("meisels27@yahoo.fr")
                                }
                                developer {
                                    id.set("core")
                                    name.set("Cedric Hippmann")
                                    url.set("https://github.com/chippmann")
                                    email.set("cedric.hippmann@hotmail.com")
                                }
                                developer {
                                    id.set("core")
                                    name.set("Tristan Grespinet")
                                    url.set("https://github.com/CedNaru")
                                    email.set("ced.naru@gmail.com")
                                }
                            }
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
