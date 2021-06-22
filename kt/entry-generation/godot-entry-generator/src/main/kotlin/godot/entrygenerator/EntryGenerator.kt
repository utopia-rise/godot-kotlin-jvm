package godot.entrygenerator

import godot.entrygenerator.filebuilder.ClassRegistrarFileBuilder
import godot.entrygenerator.filebuilder.MainEntryFileBuilder
import godot.entrygenerator.model.RegisteredClass
import godot.entrygenerator.model.SourceFile
import godot.entrygenerator.utils.Logger
import java.io.BufferedWriter

object EntryGenerator {

    fun generateEntryFiles(
        logger: Logger,
        sourceFiles: List<SourceFile>,
        appendableProvider: (RegisteredClass) -> BufferedWriter,
        mainBufferedWriterProvider: () -> BufferedWriter
    ) {
        executeSanityChecks(sourceFiles)

        with(MainEntryFileBuilder) {
            sourceFiles.forEach { sourceFile ->
                sourceFile.registeredClasses.forEach { registeredClass ->
                    registerClassRegistrar(
                        ClassRegistrarFileBuilder(
                            registeredClass,
                            appendableProvider
                        )
                    )
                }
            }
            build(mainBufferedWriterProvider)
        }
    }

    private fun executeSanityChecks(sourceFiles: List<SourceFile>) {
        //TODO
        //default constructor
        //constructor arg count
        //constructor overloading
        //one class per file
        //class package name same as file path

        //signal name prefix
        //signal type check

        //export sanity check
    }
}
