package godot

import godot.benchmark.Simple
import godot.core.KtConstructor0
import godot.core.KtVariant

class Entry : godot.runtime.Entry() {
    override fun Context.init() {
        with (registry) {
            registerClass<Simple>(Simple::class.qualifiedName!!, "Object") {
                constructor(KtConstructor0(::Simple))
                function(Simple::benchmarkSimpleAdd, ::KtVariant,
                    returns = {
                        type = KtVariant.Type.LONG
                        className = "Int"
                    }
                )

                function(Simple::benchmarkAvg, ::KtVariant,
                    returns = {
                        type = KtVariant.Type.LONG
                        className = "Int"
                    }
                )

                function(Simple::benchmarkVectors, ::KtVariant,
                    returns = {
                        type = KtVariant.Type.VECTOR3
                        className = "Vector3"
                    }
                )

                function(Simple::benchmarkVectors2Only, ::KtVariant,
                    returns = {
                        type = KtVariant.Type.VECTOR2
                        className = "Vector2"
                    }
                )

                function(Simple::benchmarkICall, ::KtVariant,
                        returns = {
                            type = KtVariant.Type.OBJECT
                            className = "Node"
                        }
                )

                function(Simple::benchmarkICallWithLoop, ::KtVariant,
                        returns = {
                            type = KtVariant.Type.OBJECT
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