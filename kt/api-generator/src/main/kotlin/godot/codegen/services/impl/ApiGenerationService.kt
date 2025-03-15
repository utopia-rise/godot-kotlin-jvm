package godot.codegen.services.impl

import godot.codegen.generation.Context
import godot.codegen.generation.rule.ApiRule
import godot.codegen.generation.rule.BindingRule
import godot.codegen.generation.rule.BitfieldExtensionRule
import godot.codegen.generation.rule.ConstantRule
import godot.codegen.generation.rule.CoreRule
import godot.codegen.generation.rule.CoreTypeHelperRule
import godot.codegen.generation.rule.EnumRule
import godot.codegen.generation.rule.FileRule
import godot.codegen.generation.rule.HeaderCommentRule
import godot.codegen.generation.rule.ImportRule
import godot.codegen.generation.rule.MemberRule
import godot.codegen.generation.rule.MethodRule
import godot.codegen.generation.rule.ObjectRule
import godot.codegen.generation.rule.OverLoadRule
import godot.codegen.generation.rule.PropertyRule
import godot.codegen.generation.rule.RegistrationRule
import godot.codegen.generation.rule.RuleSet
import godot.codegen.generation.rule.SignalRule
import godot.codegen.generation.rule.StaticRule
import godot.codegen.generation.rule.StringOnlyRule
import godot.codegen.generation.rule.WarningRule
import godot.codegen.generation.rule.compile
import godot.codegen.generation.task.ApiTask
import godot.codegen.generation.task.EnrichedClassTask
import godot.codegen.generation.task.FileTask
import godot.codegen.generation.task.RegistrationTask
import godot.codegen.repositories.IClassRepository
import godot.codegen.repositories.IEnumRepository
import godot.codegen.repositories.INativeStructureRepository
import godot.codegen.services.IApiGenerationService
import java.io.File

const val methodBindingsInnerClassName = "MethodBindings"

class ApiGenerationService(
    classRepository: IClassRepository,
    enumRepository: IEnumRepository,
    nativeStructureRepository: INativeStructureRepository
) : IApiGenerationService {

    val context = Context(classRepository, enumRepository, nativeStructureRepository)

    private fun RuleSet<Context, ApiTask>.apiRuleSet() {
        subRules(ApiTask::files) {
            rule(::FileRule)
            subRules(FileTask::classes) {
                rule(::ObjectRule)
                rule(::MemberRule)
                subRule(EnrichedClassTask::enums, ::EnumRule)
                subRule(EnrichedClassTask::enrichedMethods, ::MethodRule)
                subRule(EnrichedClassTask::enrichedProperties, ::PropertyRule)
                subRule(EnrichedClassTask::signals, ::SignalRule)
                subRule(EnrichedClassTask::constants, ::ConstantRule)
                subRule(EnrichedClassTask::enrichedStaticMethods, ::MethodRule)
                rule(::StringOnlyRule)
                subRule(EnrichedClassTask::enrichedMethods, ::OverLoadRule)
                subRule(EnrichedClassTask::enrichedStaticMethods, ::OverLoadRule)
                rule(::BindingRule)
                rule(::CoreTypeHelperRule)
            }
            subRule(FileTask::enums, ::EnumRule)
            rule(::StaticRule)
            rule(::BitfieldExtensionRule)
            rule(::HeaderCommentRule)
            rule(::WarningRule)
            rule(::ImportRule)
        }
    }

    override fun generateCore(outputDir: File) = ApiTask(outputDir).compile(context) {
        rule(::CoreRule)
        apiRuleSet()
    }

    override fun generateApi(outputDir: File) = ApiTask(outputDir).compile(context) {
        rule(::ApiRule)
        apiRuleSet()
    }

    override fun generateEngineRegistration(outputDir: File) = RegistrationTask(outputDir).compile(context) {
        rule(::RegistrationRule)
    }
}
