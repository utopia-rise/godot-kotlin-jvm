package godot.codegen

import godot.codegen.models.*

var classes = getFakeClasses()
var singletons = getFakeSingletons()

fun getFakeClasses() = mutableListOf(
    Class(
        name ="WorldDomination",
        isRefCounted = false,
        isInstantiable = true,
        inherits = "Object",
        apiType = "core",
        enums = null,
        methods = null,
        properties = null,
        constants = null,
        signals = null
    ),
    Class(
        name ="_Dummy",
        isRefCounted = false,
        isInstantiable = true,
        inherits = "Object",
        apiType = "core",
        enums = null,
        methods = null,
        properties = null,
        constants = null,
        signals = null
    ),
    Class(
        name ="Trololo",
        isRefCounted = false,
        isInstantiable = true,
        inherits = "Object",
        apiType = "core",
        enums = null,
        methods = listOf(
            Method(
                name = "set_trolling",
                isConst = false,
                isVararg = false,
                isVirtual = false,
                isStatic = false,
                hash = Math.random().toLong(),
                returnValue = null,
                returnType = null,
                arguments = listOf(
                    Argument(name = "trolling", type = "string", meta = null, defaultValue = null)
                )
            )
        ),
        properties = null,
        constants = null,
        signals = null
    ),
    Class(
        name ="RickRoll",
        isRefCounted = false,
        isInstantiable = true,
        inherits = "Trololo",
        apiType = "core",
        enums = null,
        methods = null,
        properties = listOf(
            Property(
                type = "string",
                name = "trolling",
                setter = "set_trolling",
                getter = "get_trolling",
                index = 0
            )
        ),
        constants = null,
        signals = null
    )
)

fun getFakeSingletons() = mutableListOf(
    Singleton("WorldDomination", "WorldDomination"),
    Singleton("_Dummy", "_Dummy"),
    Singleton("Terminator", "WorldDomination")
)