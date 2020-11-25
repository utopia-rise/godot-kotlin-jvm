package godot

import godot.benchmark.Simple
import godot.core.KtConstructor0
import godot.core.VariantType
import godot.core.getVariantType

class Entry : godot.runtime.Entry() {
    override fun Context.init() {
        with (registry) {
            registerClass<Simple>(Simple::class.qualifiedName!!, "Object") {
                constructor(KtConstructor0(::Simple))
                function(Simple::benchmarkSimpleAdd, ::getVariantType,
                    returns = {
                        type = VariantType.LONG
                        className = "Int"
                    }
                )

                function(Simple::benchmarkAvg, ::getVariantType,
                    returns = {
                        type = VariantType.LONG
                        className = "Int"
                    }
                )

                function(Simple::benchmarkVectors, ::getVariantType,
                    returns = {
                        type = VariantType.VECTOR3
                        className = "Vector3"
                    }
                )

                function(Simple::benchmarkVectors2Only, ::getVariantType,
                    returns = {
                        type = VariantType.VECTOR2
                        className = "Vector2"
                    }
                )

                function(Simple::benchmarkICall, ::getVariantType,
                        returns = {
                            type = VariantType.OBJECT
                            className = "Node"
                        }
                )

                function(Simple::benchmarkICallWithLoop, ::getVariantType,
                        returns = {
                            type = VariantType.OBJECT
                            className = "Node"
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