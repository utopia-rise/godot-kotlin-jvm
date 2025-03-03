package godot.codegen.exceptions

import godot.codegen.models.enriched.EnrichedClass

class ClassGenerationException(clazz: EnrichedClass) : Exception("Problem while generating ${clazz.type}")
