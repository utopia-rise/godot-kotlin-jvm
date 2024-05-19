package godot

import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import org.gradle.api.DefaultTask
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.TaskAction
import java.io.File
import kotlin.math.abs

@Serializable
private data class BenchmarkResult(val data: Map<String, Map<String, BenchmarkData>>)
@Serializable
private data class BenchmarkData(val avg: Double)

data class BenchmarkDataContainer(val beforeValue: Double, val afterValue: Double, val deviationPercentage: Double)

class CompareBenchmarkData: Plugin<Project> {
    override fun apply(target: Project) {
        target.tasks.register("compareBenchmarkData", BenchmarkComparisonTask::class.java)
    }
}

open class BenchmarkComparisonTask : DefaultTask() {

    @get:InputFile
    lateinit var benchmarkResults: File

    @get:InputFile
    lateinit var latestBenchmarkResults: File

    // Annotate the property with @get:Input
    @get:Input
    var tauPercentageDifference = 5.0

    @TaskAction
    fun run() {
        val results = parseResults(benchmarkResults)
        val latestResults = parseResults(latestBenchmarkResults)

        val deviationsMap = mutableMapOf<String, MutableMap<String, BenchmarkDataContainer>>()

        processDeviations(results, latestResults, deviationsMap)

        val significantDeviations = checkSignificantDeviations(deviationsMap)

        handleSignificantDeviations(significantDeviations)
    }

    private fun processDeviations(
        results: BenchmarkResult,
        latestResults: BenchmarkResult,
        deviationsMap: MutableMap<String, MutableMap<String, BenchmarkDataContainer>>
    ) {
        results.data.forEach { (benchmarkName, benchmarkLanguageResults) ->
            benchmarkLanguageResults.forEach { (languageName, benchmarkValues) ->
                val latestBenchmarkValues = latestResults.data[benchmarkName]?.get(languageName)
                requireNotNull(latestBenchmarkValues)

                val avg = benchmarkValues.avg
                val latestAvg = latestBenchmarkValues.avg
                val difference = ((avg - latestAvg) / ((avg + latestAvg) / 2)) * 100

                if (avg > latestAvg && abs(difference) > tauPercentageDifference) {
                    deviationsMap.getOrPut(benchmarkName, { mutableMapOf() })[languageName] = BenchmarkDataContainer(avg, latestAvg, difference)
                }
            }
        }
    }

    private fun checkSignificantDeviations(deviationsMap: MutableMap<String, MutableMap<String, BenchmarkDataContainer>>): MutableList<String> {
        val significantDeviations = mutableListOf<String>()
        deviationsMap.forEach { (benchmarkName, languageMap) ->
            languageMap["Kotlin"]?.let { dataContainer ->
                languageMap.remove("Kotlin")
                if (languageMap.isEmpty()) {
                    significantDeviations.add("Benchmark $benchmarkName has worsened by ${dataContainer.deviationPercentage}%! Before: ${dataContainer.beforeValue}, After: ${dataContainer.afterValue}. This degradation is NOT present in other languages!")
                } else {
                    val otherDeviations = languageMap.entries.joinToString(", ") { "${it.key}: Before: ${it.value.beforeValue}, After: ${it.value.afterValue}, Deviation: ${it.value.deviationPercentage}%" }
                    logger.warn("Benchmark $benchmarkName has worsened by ${dataContainer.deviationPercentage}%! Before: ${dataContainer.beforeValue}, After: ${dataContainer.afterValue}. A degradation is also present in other languages though: $otherDeviations")
                }
            }
        }
        return significantDeviations
    }

    private fun handleSignificantDeviations(significantDeviations: MutableList<String>) {
        significantDeviations.forEach { logger.error(it) }
        if (significantDeviations.isNotEmpty()) {
            throw Exception("Benchmarks with significant degradation detected in Kotlin.")
        }
    }

    private fun parseResults(file: File): BenchmarkResult {
        val json = Json { ignoreUnknownKeys = true }
        val fileContents = file.readText()
        return json.decodeFromString(fileContents)
    }
}
