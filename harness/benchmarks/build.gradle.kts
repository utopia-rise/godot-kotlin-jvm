import godot.BenchmarkComparisonTask
import org.jetbrains.kotlin.konan.target.HostManager
import java.net.HttpURLConnection
import java.net.URL

plugins {
    id("com.utopia-rise.godot-kotlin-jvm")
    id("com.utopia-rise.compare-benchmark-data")
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

        outputs.upToDateWhen { false }

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
            val benchmarkResultsFile = projectDir.resolve("benchmark-results.json")

            if (!benchmarkResultsFile.exists()) {
                println(projectDir.listFiles().toList())
                throw IllegalStateException("Cannot upload $benchmarkResultsFile as it does not exist. Make sure you ran ${runBenchmarks.name} first")
            }

            val benchmarkDataUrl = System.getenv("BENCHMARK_DATA_URL")

            val connection = URL(benchmarkDataUrl).openConnection() as HttpURLConnection
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
    val pullLatestBenchmarkData = register("pullLatestBenchmarkData") {
        doLast {
            val latestBenchmarkResults = project.file("benchmark-results-latest.json")

            val benchmarkDataUrl = System.getenv("BENCHMARK_DATA_URL")

            URL(benchmarkDataUrl).openConnection().getInputStream().use { inputStream ->
                latestBenchmarkResults.outputStream().use { outputStream ->
                    inputStream.copyTo(outputStream)
                }
            }
        }
    }
    withType<BenchmarkComparisonTask> {
        dependsOn(
            pullLatestBenchmarkData,
            runBenchmarks,
        )

        benchmarkResults = file("benchmark-results.json")
        latestBenchmarkResults = file("benchmark-results-latest.json")
    }

    register("profileAndUpload") {
        group = "profiling"

        doLast {
            val serverAddress = System.getenv("PYROSCOPE_SERVER_ADDRESS")
            if (serverAddress == null || serverAddress.isBlank()) {
                throw IllegalArgumentException("No PYROSCOPE_SERVER_ADDRESS env variable found! Make sure you've set ALL PYROSCOPE env variables")
            }

            val godotKotlinConfiguration = projectDir.resolve("godot_kotlin_configuration.json")
            projectDir
                .resolve("profiling/godot_kotlin_configuration.json")
                .copyTo(
                    godotKotlinConfiguration,
                    overwrite = true
                )
        }

        finalizedBy(runBenchmarks)
    }
}
