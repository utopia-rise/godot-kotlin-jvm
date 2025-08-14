// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier", "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST", "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT", "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.core.RID
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.Suppress

/**
 * This class is used when loading a project that uses a [Material] subclass in 2 conditions:
 *
 * - When running the project exported in dedicated server mode, only the texture's dimensions are kept (as they may be relied upon for gameplay purposes or positioning of other elements). This allows reducing the exported PCK's size significantly.
 *
 * - When this subclass is missing due to using a different engine version or build (e.g. modules disabled).
 */
@GodotBaseType
public open class PlaceholderMaterial : Material() {
  override fun new(scriptIndex: Int) {
    createNativeObject(489, scriptIndex)
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  override fun _getShaderRid(): RID {
    throw NotImplementedError("PlaceholderMaterial::_getShaderRid can't be called from the JVM.")
  }

  /**
   * Virtual method inherited from base class implemented in non-JVM code. Don't call it.
   */
  override fun _getShaderMode(): Shader.Mode {
    throw NotImplementedError("PlaceholderMaterial::_getShaderMode can't be called from the JVM.")
  }

  public companion object

  public object MethodBindings
}
