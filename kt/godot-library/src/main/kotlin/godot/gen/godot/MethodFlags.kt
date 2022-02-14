// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
package godot

import kotlin.Long

public enum class MethodFlags(
  id: Long
) {
  METHOD_FLAG_NORMAL(1),
  METHOD_FLAG_EDITOR(2),
  METHOD_FLAG_NOSCRIPT(4),
  METHOD_FLAG_CONST(8),
  METHOD_FLAG_REVERSE(16),
  METHOD_FLAG_VIRTUAL(32),
  METHOD_FLAG_FROM_SCRIPT(64),
  METHOD_FLAG_STATIC(256),
  METHOD_FLAG_OBJECT_CORE(512),
  METHOD_FLAGS_DEFAULT(1),
  ;

  public val id: Long
  init {
    this.id = id
  }

  public companion object {
    public fun from(`value`: Long) = values().single { it.id == `value` }
  }
}
