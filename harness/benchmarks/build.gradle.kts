import org.jetbrains.kotlin.konan.target.HostManager
import java.net.HttpURLConnection
import java.net.URL

plugins {
    id("com.utopia-rise.godot-kotlin-jvm")
}

repositories {
    mavenCentral()
}

tasks {
    val importResources = register<Exec>("importResources") {
        dependsOn(compileKotlin)

        isIgnoreExitValue = true

        val editorExecutable: String = projectDir
            .resolve("../../../../bin")
            .listFiles()
            ?.also {
                println("[${it.joinToString()}]")
            }
            ?.firstOrNull { it.name.startsWith("godot.") && it.name.contains("editor") }
            ?.absolutePath
            ?: throw Exception("Could not find editor executable")

        if (HostManager.hostIsMingw) {
            commandLine(
                "cmd",
                "/c",
                "$editorExecutable --headless --import",
            )
        } else {
            commandLine(
                "bash",
                "-c",
                "$editorExecutable --headless --import",
            )
        }
    }
    val runBenchmarks = register<Exec>("runBenchmarks") {
        group = "validation"
        dependsOn(importResources, compileKotlin)

        isIgnoreExitValue = true

        val editorExecutable: String = projectDir
            .resolve("../../../../bin")
            .listFiles()
            ?.also {
                println("[${it.joinToString()}]")
            }
            ?.firstOrNull { it.name.startsWith("godot.") && it.name.contains("editor") }
            ?.absolutePath
            ?: throw Exception("Could not find editor executable")

        if (HostManager.hostIsMingw) {
            commandLine(
                "cmd",
                "/c",
                "$editorExecutable --headless -s scripts/Main.gd",
            )
        } else {
            commandLine(
                "bash",
                "-c",
                "$editorExecutable --headless -s scripts/Main.gd",
            )
        }
    }
    register("executeAndUploadBenchmarkResults") {
        dependsOn(runBenchmarks)

        doLast {
            val benchmarkResultsFile = project.file("benchmark-results.json")

            if (!benchmarkResultsFile.exists()) {
                throw IllegalStateException("Cannot upload $benchmarkResultsFile as it does not exist. Make sure you ran ${runBenchmarks.name} first")
            }

            val uploadUrl = System.getenv("BENCHMARK_UPLOAD_URL")

            val connection = URL(uploadUrl).openConnection() as HttpURLConnection
            connection.requestMethod = "POST"
            connection.doOutput = true
            connection.setRequestProperty("Content-Type", "application/json")
            connection.setRequestProperty("charset", "utf-8")
            connection.setRequestProperty("Content-Length", benchmarkResultsFile.length().toString())
            connection.useCaches = false

            connection.outputStream.use { outputStream ->
                benchmarkResultsFile.inputStream().use { inputStream ->
                    inputStream.copyTo(outputStream)
                }
            }

            val responseCode = connection.responseCode
            if (responseCode == HttpURLConnection.HTTP_OK) {
                println("POST was successful.")
            } else {
                println("POST not successful: $responseCode")
            }
        }
    }
}
