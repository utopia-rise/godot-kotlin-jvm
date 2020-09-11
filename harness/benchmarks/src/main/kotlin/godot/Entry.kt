package godot

import godot.benchmark.Simple
import godot.core.KtConstructor0
import godot.core.KtVariant

class Entry : godot.runtime.Entry() {
    override fun Context.init() {
        with (registry) {
            registerClass<Simple>(Simple::class.qualifiedName!!, "Object") {
                constructor(KtConstructor0(::Simple))
                function("benchmark_SimpleAdd", Simple::benchmarkSimpleAdd, ::KtVariant,
                    returns = {
                        type = KtVariant.Type.LONG
                        className = "Int"
                    }
                )

                function("benchmark_Avg", Simple::benchmarkAvg, ::KtVariant,
                    returns = {
                        type = KtVariant.Type.LONG
                        className = "Int"
                    }
                )

                function("benchmark_Vectors", Simple::benchmarkVectors, ::KtVariant,
                    returns = {
                        type = KtVariant.Type.VECTOR3
                        className = "Vector3"
                    }
                )

                function("benchmark_Vectors2Only", Simple::benchmarkVectors2Only, ::KtVariant,
                    returns = {
                        type = KtVariant.Type.VECTOR2
                        className = "Vector2"
                    }
                )
            }
        }
    }
}