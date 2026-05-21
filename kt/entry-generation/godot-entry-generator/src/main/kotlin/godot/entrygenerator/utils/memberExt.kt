package godot.entrygenerator.utils

import com.squareup.kotlinpoet.MemberName
import com.squareup.kotlinpoet.asClassName

fun <T : Enum<T>> T.asEnumName() = MemberName(this::class.asClassName(), this.name)

