package godot.codegen.generation.rule

import com.squareup.kotlinpoet.AnnotationSpec
import com.squareup.kotlinpoet.ClassName
import godot.codegen.generation.Context
import godot.codegen.generation.task.ApiTask
import godot.codegen.generation.task.EnrichedClassTask
import godot.codegen.generation.task.EnrichedEnumTask
import godot.codegen.generation.task.FileTask
import godot.codegen.models.enriched.EnrichedClass
import godot.codegen.models.enriched.EnrichedEnum
import godot.common.extensions.convertToCamelCase
import godot.tools.common.constants.GENERATED_COMMENT

class FileRule : GodotApiRule<FileTask>() {
    override fun apply(task: FileTask, context: Context) {
        val type = task.type
        if (type is EnrichedClass) {
            task.classes += EnrichedClassTask(type)
        } else if (type is EnrichedEnum) {
            task.enums += EnrichedEnumTask(type)
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
            for (method in classTask.enrichedStaticMethods) {
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
            }
        }
    }
}

private const val constantTitle = "constant"

class DocumentationRule : GodotApiRule<ApiTask>() {
    private val titlesToSanitize = arrayOf(
        "member",
        "method",
        "enum",
        constantTitle,
        "param"
    )

    private val tagsToSanitize = arrayOf(
        "code" to "`",
        "i" to "*",
        "b" to "**"
    )

    private val languages = arrayOf(
        "gdscript",
        "csharp"
    )

    override fun apply(fileTask: ApiTask, context: Context) {
        val enumValues = context
            .enumRepository
            .getGlobalEnums()
            .flatMap { it.values }

        val classes = context.classRepository.listTypes()
        val members = classes.flatMap { it.methods + it.properties + it.constants + it.signals }
        val innerEnumValue = classes.flatMap { it.enums }.flatMap { it.values }

        val allDocumented = enumValues + classes + members + innerEnumValue

        allDocumented.forEach {
            it.description = sanitize(it.description)
        }
    }

    private fun sanitize(documentation: String?): String {
        if (documentation.isNullOrEmpty()) {
            return ""
        }

        var unicodeString = documentation
            .replace("/*", "&#47;*")
            .replace("%", "&#37;")
            .replace("*/", "*&#92;")
            .replace(System.lineSeparator(), "\n")

        for (title in titlesToSanitize) {
            val regex = Regex("\\[($title\\s)(\\S+)(\\])")

            var matchResult = unicodeString.let { regex.find(it) }
            while (matchResult != null) {
                val titleRange = matchResult.groups[1]!!.range
                val contentRange = matchResult.groups[2]!!.range
                val content = with(unicodeString.substring(contentRange)) {
                    if (unicodeString.substring(titleRange).startsWith(constantTitle)) {
                        return@with this
                    }
                    convertToCamelCase()
                }
                unicodeString = unicodeString
                    .replaceRange(contentRange, content)
                    .removeRange(titleRange)
                matchResult = unicodeString.let { regex.find(it) }
            }
        }

        for (tag in tagsToSanitize) {
            val regex = Regex("(\\[${tag.first}\\])((?:(?!\\[\\/${tag.first}\\]|\\[${tag.first}\\]).)*)(\\[\\/${tag.first}\\])")

            var matchResult = unicodeString.let { regex.find(it) }
            while (matchResult != null) {
                val endTagRange = matchResult.groups[3]!!.range
                val beginTagRange = matchResult.groups[1]!!.range
                unicodeString = unicodeString
                    .replaceRange(endTagRange, tag.second)
                    .replaceRange(beginTagRange, tag.second)
                matchResult = unicodeString.let { regex.find(it) }
            }
        }

        unicodeString = unicodeString
            .replace("[codeblocks]", "")
            .replace("[/codeblocks]", "")

        for (language in languages) {
            unicodeString = unicodeString
                .replace("[$language]", "$language:\n```$language")
                .replace("[/$language]", "```")
        }

        return unicodeString
    }
}
