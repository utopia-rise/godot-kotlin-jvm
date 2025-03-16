package godot.codegen.generation.rule

import com.squareup.kotlinpoet.AnnotationSpec
import com.squareup.kotlinpoet.ClassName
import godot.codegen.generation.Context
import godot.codegen.generation.task.ClassTask
import godot.codegen.generation.task.EnumTask
import godot.codegen.generation.task.FileTask
import godot.codegen.models.enriched.EnrichedClass
import godot.codegen.models.enriched.EnrichedEnum
import godot.tools.common.constants.GENERATED_COMMENT

class FileRule : GodotApiRule<FileTask>() {
    override fun apply(task: FileTask, context: Context) {
        val type = task.type
        if (type is EnrichedClass) {
            task.classes += ClassTask(type)
        } else if (type is EnrichedEnum) {
            task.enums += EnumTask(type)
        }
    }
}

class HeaderCommentRule() : GodotApiRule<FileTask>() {
    override fun apply(task: FileTask, context: Context) {
        task.generator.addFileComment(GENERATED_COMMENT)
    }
}

class ImportRule() : GodotApiRule<FileTask>() {
    override fun apply(task: FileTask, context: Context) = task.configure {
        for (clazz in task.classes) {
            for (import in clazz.clazz.additionalImports) {
                addImport(import.pckge, import.name)
            }
        }
    }
}

class WarningRule() : GodotApiRule<FileTask>() {
    override fun apply(task: FileTask, context: Context) = task.configure {
        addAnnotation(
            AnnotationSpec.builder(ClassName("kotlin", "Suppress"))
                .addMember(
                    "\"PackageDirectoryMismatch\", \"unused\", \"FunctionName\", \"RedundantModalityModifier\", " +
                        "\"UNCHECKED_CAST\", \"JoinDeclarationAndAssignment\", \"USELESS_CAST\", \"RemoveRedundantQualifierName\", " +
                        "\"NOTHING_TO_INLINE\", \"NON_FINAL_MEMBER_IN_OBJECT\", \"RedundantVisibilityModifier\", " +
                        "\"RedundantUnitReturnType\", \"MemberVisibilityCanBePrivate\""
                )
                .build()
        )
    }
}


class StaticRule : GodotApiRule<FileTask>() {
    override fun apply(fileTask: FileTask, context: Context) = fileTask.configure {
        for (classTask in fileTask.classes) {
            for (method in classTask.staticMethods) {
                method.generator.addAnnotation(JvmStatic::class)
            }

            val clazz = classTask.clazz
            if (clazz.isSingleton) {
                for (method in classTask.methods) {
                    method.generator.addAnnotation(JvmStatic::class)
                }
                for (property in classTask.properties) {
                    property.generator.addAnnotation(JvmStatic::class)
                }
                for (signal in classTask.signals) {
                    signal.generator.addAnnotation(JvmStatic::class)
                }
            }
        }
    }
}
