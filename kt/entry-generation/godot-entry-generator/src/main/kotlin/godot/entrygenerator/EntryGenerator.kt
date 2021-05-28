package godot.entrygenerator

import godot.entrygenerator.filebuilder.ClassRegistrarFileBuilder
import godot.entrygenerator.filebuilder.MainEntryFileBuilder
import godot.entrygenerator.model.SourceFile

object EntryGenerator {

    fun generateEntryFiles(
        outputBasePath: String,
        sourceFiles: List<SourceFile>
    ) {
        executeSanityChecks(sourceFiles)

        with(MainEntryFileBuilder) {
            sourceFiles.forEach { sourceFile ->
                sourceFile.registeredClasses.forEach { registeredClass ->
                    registerClassRegistrar(
                        ClassRegistrarFileBuilder(
                            registeredClass,
                            outputBasePath
                        )
                    )
                }
            }
            build(outputBasePath)
        }
    }

    private fun executeSanityChecks(sourceFiles: List<SourceFile>) {
        //TODO
        //default constructor
        //constructor arg count
        //constructor overloading
        //one class per file
        //class package name same as file path
    }
}
