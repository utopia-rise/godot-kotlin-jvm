package godot.annotation.processor.classgraph

import io.github.classgraph.ScanResult

//TODO: remove when contextual arguments are availables
object Context {
    lateinit var scanResult: ScanResult
}
