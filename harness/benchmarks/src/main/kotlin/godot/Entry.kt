package godot

import godot.benchmark.Simple
import godot.core.KtConstructor0
import godot.core.VariantType

class Entry : godot.runtime.Entry() {
    override fun Context.init() {
        with (registry) {
            registerClass<Simple>(Simple::class.qualifiedName!!, "Object") {
                constructor(KtConstructor0(::Simple))
                function(Simple::benchmarkSimpleAdd, VariantType.JVM_INT,
                    returns = {
                        type = VariantType.LONG
                        className = "Int"
                    }
                )

                function(Simple::benchmarkAvg, VariantType.JVM_INT,
                    returns = {
                        type = VariantType.LONG
                        className = "Int"
                    }
                )

                function(Simple::benchmarkVectors, VariantType.VECTOR3,
                    returns = {
                        type = VariantType.VECTOR3
                        className = "Vector3"
                    }
                )

                function(Simple::benchmarkVectors2Only, VariantType.VECTOR2,
                    returns = {
                        type = VariantType.VECTOR2
                        className = "Vector2"
                    }
                )

                function(Simple::benchmarkIcall, VariantType.JVM_INT,
                        returns = {
                            type = VariantType.LONG
                            className = "Int"
                        }
                )

                function(Simple::benchmarkIcallWithLoop, VariantType.JVM_INT,
                        returns = {
                            type = VariantType.LONG
                            className = "Int"
                        }
                )

                function(Simple::benchmarkMethodCall, VariantType.NIL,
                    returns = {
                        type = VariantType.NIL
                        className = "kotlin.Unit"
                    }
                )
            }
        }
    }

    override fun Context.initEngineTypes() {
        registerEngineTypes()
        registerEngineTypeMethods()
    }
}
