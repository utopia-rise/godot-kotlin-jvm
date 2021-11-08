// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.Image
import godot.VisualServer
import godot.`annotation`.GodotBaseType
import godot.core.AABB
import godot.core.Basis
import godot.core.Color
import godot.core.Plane
import godot.core.PoolByteArray
import godot.core.PoolColorArray
import godot.core.PoolIntArray
import godot.core.PoolRealArray
import godot.core.PoolVector2Array
import godot.core.RID
import godot.core.Rect2
import godot.core.TransferContext
import godot.core.Transform
import godot.core.Transform2D
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BASIS
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PLANE
import godot.core.VariantType.POOL_BYTE_ARRAY
import godot.core.VariantType.POOL_COLOR_ARRAY
import godot.core.VariantType.POOL_INT_ARRAY
import godot.core.VariantType.POOL_REAL_ARRAY
import godot.core.VariantType.POOL_VECTOR2_ARRAY
import godot.core.VariantType.RECT2
import godot.core.VariantType.STRING
import godot.core.VariantType.TRANSFORM
import godot.core.VariantType.TRANSFORM2D
import godot.core.VariantType.VECTOR2
import godot.core.VariantType.VECTOR3
import godot.core.VariantType._RID
import godot.core.Vector2
import godot.core.Vector3
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Server for anything visible.
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/3.4/tutorials/optimization/using_servers.html](https://docs.godotengine.org/en/3.4/tutorials/optimization/using_servers.html)
 *
 * Server for anything visible. The visual server is the API backend for everything visible. The whole scene system mounts on it to display.
 *
 * The visual server is completely opaque, the internals are entirely implementation specific and cannot be accessed.
 *
 * The visual server can be used to bypass the scene system entirely.
 *
 * Resources are created using the `*_create` functions.
 *
 * All objects are drawn to a viewport. You can use the [godot.Viewport] attached to the [godot.SceneTree] or you can create one yourself with [viewportCreate]. When using a custom scenario or canvas, the scenario or canvas needs to be attached to the viewport using [viewportSetScenario] or [viewportAttachCanvas].
 *
 * In 3D, all visual objects must be associated with a scenario. The scenario is a visual representation of the world. If accessing the visual server from a running game, the scenario can be accessed from the scene tree from any [godot.Spatial] node with [godot.Spatial.getWorld]. Otherwise, a scenario can be created with [scenarioCreate].
 *
 * Similarly, in 2D, a canvas is needed to draw all canvas items.
 *
 * In 3D, all visible objects are comprised of a resource and an instance. A resource can be a mesh, a particle system, a light, or any other 3D object. In order to be visible resources must be attached to an instance using [instanceSetBase]. The instance must also be attached to the scenario using [instanceSetScenario] in order to be visible.
 *
 * In 2D, all visible objects are some form of canvas item. In order to be visible, a canvas item needs to be the child of a canvas attached to a viewport, or it needs to be the child of another canvas item that is eventually attached to the canvas.
 */
@GodotBaseType
public object VisualServer : Object() {
  /**
   * Array contains bone information.
   */
  public final const val ARRAY_BONES: Long = 6

  /**
   * Array is a color array.
   */
  public final const val ARRAY_COLOR: Long = 3

  /**
   * Flag used to mark a compressed bone array.
   */
  public final const val ARRAY_COMPRESS_BONES: Long = 32768

  /**
   * Flag used to mark a compressed (half float) color array.
   */
  public final const val ARRAY_COMPRESS_COLOR: Long = 4096

  /**
   * Used to set flags [ARRAY_COMPRESS_NORMAL], [ARRAY_COMPRESS_TANGENT], [ARRAY_COMPRESS_COLOR], [ARRAY_COMPRESS_TEX_UV], [godot.ARRAY_COMPRESS_TEX_UV2], [ARRAY_COMPRESS_WEIGHTS], and [ARRAY_FLAG_USE_OCTAHEDRAL_COMPRESSION] quickly.
   */
  public final const val ARRAY_COMPRESS_DEFAULT: Long = 2194432

  /**
   * Flag used to mark a compressed index array.
   */
  public final const val ARRAY_COMPRESS_INDEX: Long = 131072

  /**
   * Flag used to mark a compressed (half float) normal array.
   */
  public final const val ARRAY_COMPRESS_NORMAL: Long = 1024

  /**
   * Flag used to mark a compressed (half float) tangent array.
   */
  public final const val ARRAY_COMPRESS_TANGENT: Long = 2048

  /**
   * Flag used to mark a compressed (half float) UV coordinates array.
   */
  public final const val ARRAY_COMPRESS_TEX_UV: Long = 8192

  /**
   * Flag used to mark a compressed (half float) UV coordinates array for the second UV coordinates.
   */
  public final const val ARRAY_COMPRESS_TEX_UV2: Long = 16384

  /**
   * Flag used to mark a compressed (half float) vertex array.
   */
  public final const val ARRAY_COMPRESS_VERTEX: Long = 512

  /**
   * Flag used to mark a compressed (half float) weight array.
   */
  public final const val ARRAY_COMPRESS_WEIGHTS: Long = 65536

  /**
   * Flag used to mark that the array uses 16-bit bones instead of 8-bit.
   */
  public final const val ARRAY_FLAG_USE_16_BIT_BONES: Long = 524288

  /**
   * Flag used to mark that the array contains 2D vertices.
   */
  public final const val ARRAY_FLAG_USE_2D_VERTICES: Long = 262144

  /**
   * Flag used to mark that the array uses an octahedral representation of normal and tangent vectors rather than cartesian.
   */
  public final const val ARRAY_FLAG_USE_OCTAHEDRAL_COMPRESSION: Long = 2097152

  /**
   * Flag used to mark a bone information array.
   */
  public final const val ARRAY_FORMAT_BONES: Long = 64

  /**
   * Flag used to mark a color array.
   */
  public final const val ARRAY_FORMAT_COLOR: Long = 8

  /**
   * Flag used to mark an index array.
   */
  public final const val ARRAY_FORMAT_INDEX: Long = 256

  /**
   * Flag used to mark a normal array.
   */
  public final const val ARRAY_FORMAT_NORMAL: Long = 2

  /**
   * Flag used to mark a tangent array.
   */
  public final const val ARRAY_FORMAT_TANGENT: Long = 4

  /**
   * Flag used to mark an UV coordinates array.
   */
  public final const val ARRAY_FORMAT_TEX_UV: Long = 16

  /**
   * Flag used to mark an UV coordinates array for the second UV coordinates.
   */
  public final const val ARRAY_FORMAT_TEX_UV2: Long = 32

  /**
   * Flag used to mark a vertex array.
   */
  public final const val ARRAY_FORMAT_VERTEX: Long = 1

  /**
   * Flag used to mark a weights array.
   */
  public final const val ARRAY_FORMAT_WEIGHTS: Long = 128

  /**
   * Array is index array.
   */
  public final const val ARRAY_INDEX: Long = 8

  /**
   * Represents the size of the [enum ArrayType] enum.
   */
  public final const val ARRAY_MAX: Long = 9

  /**
   * Array is a normal array.
   */
  public final const val ARRAY_NORMAL: Long = 1

  /**
   * Array is a tangent array.
   */
  public final const val ARRAY_TANGENT: Long = 2

  /**
   * Array is an UV coordinates array.
   */
  public final const val ARRAY_TEX_UV: Long = 4

  /**
   * Array is an UV coordinates array for the second UV coordinates.
   */
  public final const val ARRAY_TEX_UV2: Long = 5

  /**
   * Array is a vertex array.
   */
  public final const val ARRAY_VERTEX: Long = 0

  /**
   * Array is weight information.
   */
  public final const val ARRAY_WEIGHTS: Long = 7

  /**
   * Number of weights/bones per vertex.
   */
  public final const val ARRAY_WEIGHTS_SIZE: Long = 4

  /**
   * Blend shapes are normalized.
   */
  public final const val BLEND_SHAPE_MODE_NORMALIZED: Long = 0

  /**
   * Blend shapes are relative to base weight.
   */
  public final const val BLEND_SHAPE_MODE_RELATIVE: Long = 1

  /**
   * The maximum Z-layer for canvas items.
   */
  public final const val CANVAS_ITEM_Z_MAX: Long = 4096

  /**
   * The minimum Z-layer for canvas items.
   */
  public final const val CANVAS_ITEM_Z_MIN: Long = -4096

  /**
   * Do not apply a filter to canvas light shadows.
   */
  public final const val CANVAS_LIGHT_FILTER_NONE: Long = 0

  /**
   * Use PCF13 filtering to filter canvas light shadows.
   */
  public final const val CANVAS_LIGHT_FILTER_PCF13: Long = 5

  /**
   * Use PCF3 filtering to filter canvas light shadows.
   */
  public final const val CANVAS_LIGHT_FILTER_PCF3: Long = 1

  /**
   * Use PCF5 filtering to filter canvas light shadows.
   */
  public final const val CANVAS_LIGHT_FILTER_PCF5: Long = 2

  /**
   * Use PCF7 filtering to filter canvas light shadows.
   */
  public final const val CANVAS_LIGHT_FILTER_PCF7: Long = 3

  /**
   * Use PCF9 filtering to filter canvas light shadows.
   */
  public final const val CANVAS_LIGHT_FILTER_PCF9: Long = 4

  /**
   * Adds light color additive to the canvas.
   */
  public final const val CANVAS_LIGHT_MODE_ADD: Long = 0

  /**
   * The light adds color depending on mask.
   */
  public final const val CANVAS_LIGHT_MODE_MASK: Long = 3

  /**
   * The light adds color depending on transparency.
   */
  public final const val CANVAS_LIGHT_MODE_MIX: Long = 2

  /**
   * Adds light color subtractive to the canvas.
   */
  public final const val CANVAS_LIGHT_MODE_SUB: Long = 1

  /**
   * Culling of the canvas occluder is clockwise.
   */
  public final const val CANVAS_OCCLUDER_POLYGON_CULL_CLOCKWISE: Long = 1

  /**
   * Culling of the canvas occluder is counterclockwise.
   */
  public final const val CANVAS_OCCLUDER_POLYGON_CULL_COUNTER_CLOCKWISE: Long = 2

  /**
   * Culling of the canvas occluder is disabled.
   */
  public final const val CANVAS_OCCLUDER_POLYGON_CULL_DISABLED: Long = 0

  /**
   * Marks the back side of a cubemap.
   */
  public final const val CUBEMAP_BACK: Long = 5

  /**
   * Marks the bottom side of a cubemap.
   */
  public final const val CUBEMAP_BOTTOM: Long = 2

  /**
   * Marks the front side of a cubemap.
   */
  public final const val CUBEMAP_FRONT: Long = 4

  /**
   * Marks the left side of a cubemap.
   */
  public final const val CUBEMAP_LEFT: Long = 0

  /**
   * Marks the right side of a cubemap.
   */
  public final const val CUBEMAP_RIGHT: Long = 1

  /**
   * Marks the top side of a cubemap.
   */
  public final const val CUBEMAP_TOP: Long = 3

  /**
   * Use a specified canvas layer as the background. This can be useful for instantiating a 2D scene in a 3D world.
   */
  public final const val ENV_BG_CANVAS: Long = 4

  /**
   * Use the clear color as background.
   */
  public final const val ENV_BG_CLEAR_COLOR: Long = 0

  /**
   * Use a specified color as the background.
   */
  public final const val ENV_BG_COLOR: Long = 1

  /**
   * Use a custom color for background, but use a sky for shading and reflections.
   */
  public final const val ENV_BG_COLOR_SKY: Long = 3

  /**
   * Do not clear the background, use whatever was rendered last frame as the background.
   */
  public final const val ENV_BG_KEEP: Long = 5

  /**
   * Represents the size of the [enum EnvironmentBG] enum.
   */
  public final const val ENV_BG_MAX: Long = 7

  /**
   * Use a sky resource for the background.
   */
  public final const val ENV_BG_SKY: Long = 2

  /**
   * Used highest blur quality. Looks the best, but is the slowest.
   */
  public final const val ENV_DOF_BLUR_QUALITY_HIGH: Long = 2

  /**
   * Use lowest blur quality. Fastest, but may look bad.
   */
  public final const val ENV_DOF_BLUR_QUALITY_LOW: Long = 0

  /**
   * Use medium blur quality.
   */
  public final const val ENV_DOF_BLUR_QUALITY_MEDIUM: Long = 1

  /**
   * Perform a 1x1 blur on the SSAO output.
   */
  public final const val ENV_SSAO_BLUR_1x1: Long = 1

  /**
   * Performs a 2x2 blur on the SSAO output.
   */
  public final const val ENV_SSAO_BLUR_2x2: Long = 2

  /**
   * Performs a 3x3 blur on the SSAO output. Use this for smoothest SSAO.
   */
  public final const val ENV_SSAO_BLUR_3x3: Long = 3

  /**
   * Disables the blur set for SSAO. Will make SSAO look noisier.
   */
  public final const val ENV_SSAO_BLUR_DISABLED: Long = 0

  /**
   * Highest quality screen space ambient occlusion.
   */
  public final const val ENV_SSAO_QUALITY_HIGH: Long = 2

  /**
   * Lowest quality of screen space ambient occlusion.
   */
  public final const val ENV_SSAO_QUALITY_LOW: Long = 0

  /**
   * Medium quality screen space ambient occlusion.
   */
  public final const val ENV_SSAO_QUALITY_MEDIUM: Long = 1

  /**
   * Use the ACES tonemapper.
   */
  public final const val ENV_TONE_MAPPER_ACES: Long = 3

  /**
   * Use the ACES Fitted tonemapper.
   */
  public final const val ENV_TONE_MAPPER_ACES_FITTED: Long = 4

  /**
   * Use the filmic tonemapper.
   */
  public final const val ENV_TONE_MAPPER_FILMIC: Long = 2

  /**
   * Output color as they came in.
   */
  public final const val ENV_TONE_MAPPER_LINEAR: Long = 0

  /**
   * Use the Reinhard tonemapper.
   */
  public final const val ENV_TONE_MAPPER_REINHARD: Long = 1

  /**
   * Hardware supports multithreading. This enum is currently unused in Godot 3.x.
   */
  public final const val FEATURE_MULTITHREADED: Long = 1

  /**
   * Hardware supports shaders. This enum is currently unused in Godot 3.x.
   */
  public final const val FEATURE_SHADERS: Long = 0

  /**
   * Add the effect of the glow on top of the scene.
   */
  public final const val GLOW_BLEND_MODE_ADDITIVE: Long = 0

  /**
   * Shows the glow effect by itself without the underlying scene.
   */
  public final const val GLOW_BLEND_MODE_REPLACE: Long = 3

  /**
   * Blends the glow effect with the screen. Does not get as bright as additive.
   */
  public final const val GLOW_BLEND_MODE_SCREEN: Long = 1

  /**
   * Produces a subtle color disturbance around objects.
   */
  public final const val GLOW_BLEND_MODE_SOFTLIGHT: Long = 2

  /**
   * The amount of 2d draw calls in frame.
   */
  public final const val INFO_2D_DRAW_CALLS_IN_FRAME: Long = 7

  /**
   * The amount of 2d items in the frame.
   */
  public final const val INFO_2D_ITEMS_IN_FRAME: Long = 6

  /**
   * The amount of draw calls in frame.
   */
  public final const val INFO_DRAW_CALLS_IN_FRAME: Long = 5

  /**
   * The amount of modified materials in the frame.
   */
  public final const val INFO_MATERIAL_CHANGES_IN_FRAME: Long = 2

  /**
   * The amount of objects in the frame.
   */
  public final const val INFO_OBJECTS_IN_FRAME: Long = 0

  /**
   * The amount of shader rebinds in the frame.
   */
  public final const val INFO_SHADER_CHANGES_IN_FRAME: Long = 3

  /**
   * The amount of surface changes in the frame.
   */
  public final const val INFO_SURFACE_CHANGES_IN_FRAME: Long = 4

  /**
   * The amount of texture memory used.
   */
  public final const val INFO_TEXTURE_MEM_USED: Long = 10

  /**
   * Unimplemented in the GLES2 and GLES3 rendering backends, always returns 0.
   */
  public final const val INFO_USAGE_VIDEO_MEM_TOTAL: Long = 8

  /**
   * The amount of vertex memory used.
   */
  public final const val INFO_VERTEX_MEM_USED: Long = 11

  /**
   * The amount of vertices in the frame.
   */
  public final const val INFO_VERTICES_IN_FRAME: Long = 1

  /**
   * The amount of video memory used, i.e. texture and vertex memory combined.
   */
  public final const val INFO_VIDEO_MEM_USED: Long = 9

  /**
   * When set, manually requests to draw geometry on next frame.
   */
  public final const val INSTANCE_FLAG_DRAW_NEXT_FRAME_IF_VISIBLE: Long = 1

  /**
   * Represents the size of the [enum InstanceFlags] enum.
   */
  public final const val INSTANCE_FLAG_MAX: Long = 2

  /**
   * Allows the instance to be used in baked lighting.
   */
  public final const val INSTANCE_FLAG_USE_BAKED_LIGHT: Long = 0

  /**
   * A combination of the flags of geometry instances (mesh, multimesh, immediate and particles).
   */
  public final const val INSTANCE_GEOMETRY_MASK: Long = 30

  /**
   * The instance is a GI probe.
   */
  public final const val INSTANCE_GI_PROBE: Long = 7

  /**
   * The instance is an immediate geometry.
   */
  public final const val INSTANCE_IMMEDIATE: Long = 3

  /**
   * The instance is a light.
   */
  public final const val INSTANCE_LIGHT: Long = 5

  /**
   * The instance is a lightmap capture.
   */
  public final const val INSTANCE_LIGHTMAP_CAPTURE: Long = 8

  /**
   * Represents the size of the [enum InstanceType] enum.
   */
  public final const val INSTANCE_MAX: Long = 9

  /**
   * The instance is a mesh.
   */
  public final const val INSTANCE_MESH: Long = 1

  /**
   * The instance is a multimesh.
   */
  public final const val INSTANCE_MULTIMESH: Long = 2

  /**
   * The instance does not have a type.
   */
  public final const val INSTANCE_NONE: Long = 0

  /**
   * The instance is a particle emitter.
   */
  public final const val INSTANCE_PARTICLES: Long = 4

  /**
   * The instance is a reflection probe.
   */
  public final const val INSTANCE_REFLECTION_PROBE: Long = 6

  /**
   *
   */
  public final const val LIGHT_BAKE_ALL: Long = 2

  /**
   *
   */
  public final const val LIGHT_BAKE_DISABLED: Long = 0

  /**
   *
   */
  public final const val LIGHT_BAKE_INDIRECT: Long = 1

  /**
   * Is a directional (sun) light.
   */
  public final const val LIGHT_DIRECTIONAL: Long = 0

  /**
   * Optimize use of shadow maps, increasing the effective resolution. But may result in shadows moving or flickering slightly.
   */
  public final const val LIGHT_DIRECTIONAL_SHADOW_DEPTH_RANGE_OPTIMIZED: Long = 1

  /**
   * Keeps shadows stable as camera moves but has lower effective resolution.
   */
  public final const val LIGHT_DIRECTIONAL_SHADOW_DEPTH_RANGE_STABLE: Long = 0

  /**
   * Use orthogonal shadow projection for directional light.
   */
  public final const val LIGHT_DIRECTIONAL_SHADOW_ORTHOGONAL: Long = 0

  /**
   * Use 2 splits for shadow projection when using directional light.
   */
  public final const val LIGHT_DIRECTIONAL_SHADOW_PARALLEL_2_SPLITS: Long = 1

  /**
   * Use 4 splits for shadow projection when using directional light.
   */
  public final const val LIGHT_DIRECTIONAL_SHADOW_PARALLEL_4_SPLITS: Long = 2

  /**
   * Is an omni light.
   */
  public final const val LIGHT_OMNI: Long = 1

  /**
   * Use a cubemap shadow map for omni lights. Slower but better quality than dual paraboloid.
   */
  public final const val LIGHT_OMNI_SHADOW_CUBE: Long = 1

  /**
   * Use more detail horizontally when computing shadow map.
   */
  public final const val LIGHT_OMNI_SHADOW_DETAIL_HORIZONTAL: Long = 1

  /**
   * Use more detail vertically when computing shadow map.
   */
  public final const val LIGHT_OMNI_SHADOW_DETAIL_VERTICAL: Long = 0

  /**
   * Use a dual paraboloid shadow map for omni lights.
   */
  public final const val LIGHT_OMNI_SHADOW_DUAL_PARABOLOID: Long = 0

  /**
   * The light's attenuation.
   */
  public final const val LIGHT_PARAM_ATTENUATION: Long = 5

  /**
   * Scales the shadow color.
   */
  public final const val LIGHT_PARAM_CONTACT_SHADOW_SIZE: Long = 8

  /**
   * The light's energy.
   */
  public final const val LIGHT_PARAM_ENERGY: Long = 0

  /**
   * Secondary multiplier used with indirect light (light bounces).
   */
  public final const val LIGHT_PARAM_INDIRECT_ENERGY: Long = 1

  /**
   * Represents the size of the [enum LightParam] enum.
   */
  public final const val LIGHT_PARAM_MAX: Long = 16

  /**
   * The light's range.
   */
  public final const val LIGHT_PARAM_RANGE: Long = 4

  /**
   * Bias the shadow lookup to fix self-shadowing artifacts.
   */
  public final const val LIGHT_PARAM_SHADOW_BIAS: Long = 14

  /**
   * Increases bias on further splits to fix self-shadowing that only occurs far away from the camera.
   */
  public final const val LIGHT_PARAM_SHADOW_BIAS_SPLIT_SCALE: Long = 15

  /**
   * Max distance that shadows will be rendered.
   */
  public final const val LIGHT_PARAM_SHADOW_MAX_DISTANCE: Long = 9

  /**
   * Normal bias used to offset shadow lookup by object normal. Can be used to fix self-shadowing artifacts.
   */
  public final const val LIGHT_PARAM_SHADOW_NORMAL_BIAS: Long = 13

  /**
   * Proportion of shadow atlas occupied by the first split.
   */
  public final const val LIGHT_PARAM_SHADOW_SPLIT_1_OFFSET: Long = 10

  /**
   * Proportion of shadow atlas occupied by the second split.
   */
  public final const val LIGHT_PARAM_SHADOW_SPLIT_2_OFFSET: Long = 11

  /**
   * Proportion of shadow atlas occupied by the third split. The fourth split occupies the rest.
   */
  public final const val LIGHT_PARAM_SHADOW_SPLIT_3_OFFSET: Long = 12

  /**
   * The light's size, currently only used for soft shadows in baked lightmaps.
   */
  public final const val LIGHT_PARAM_SIZE: Long = 2

  /**
   * The light's influence on specularity.
   */
  public final const val LIGHT_PARAM_SPECULAR: Long = 3

  /**
   * The spotlight's angle.
   */
  public final const val LIGHT_PARAM_SPOT_ANGLE: Long = 6

  /**
   * The spotlight's attenuation.
   */
  public final const val LIGHT_PARAM_SPOT_ATTENUATION: Long = 7

  /**
   * Is a spot light.
   */
  public final const val LIGHT_SPOT: Long = 2

  /**
   * The maximum renderpriority of all materials.
   */
  public final const val MATERIAL_RENDER_PRIORITY_MAX: Long = 127

  /**
   * The minimum renderpriority of all materials.
   */
  public final const val MATERIAL_RENDER_PRIORITY_MIN: Long = -128

  /**
   * Unused enum in Godot 3.x.
   */
  public final const val MAX_CURSORS: Long = 8

  /**
   * Max number of glow levels that can be used with glow post-process effect.
   */
  public final const val MAX_GLOW_LEVELS: Long = 7

  /**
   * MultiMesh color uses 8 bits per component. This packs the color into a single float.
   */
  public final const val MULTIMESH_COLOR_8BIT: Long = 1

  /**
   * MultiMesh color uses a float per channel.
   */
  public final const val MULTIMESH_COLOR_FLOAT: Long = 2

  /**
   * MultiMesh does not use per-instance color.
   */
  public final const val MULTIMESH_COLOR_NONE: Long = 0

  /**
   * MultiMesh custom data uses 8 bits per component. This packs the 4-component custom data into a single float.
   */
  public final const val MULTIMESH_CUSTOM_DATA_8BIT: Long = 1

  /**
   * MultiMesh custom data uses a float per component.
   */
  public final const val MULTIMESH_CUSTOM_DATA_FLOAT: Long = 2

  /**
   * MultiMesh does not use custom data.
   */
  public final const val MULTIMESH_CUSTOM_DATA_NONE: Long = 0

  /**
   * Use [godot.core.Transform2D] to store MultiMesh transform.
   */
  public final const val MULTIMESH_TRANSFORM_2D: Long = 0

  /**
   * Use [godot.core.Transform] to store MultiMesh transform.
   */
  public final const val MULTIMESH_TRANSFORM_3D: Long = 1

  /**
   * The nine patch gets stretched where needed.
   */
  public final const val NINE_PATCH_STRETCH: Long = 0

  /**
   * The nine patch gets filled with tiles where needed.
   */
  public final const val NINE_PATCH_TILE: Long = 1

  /**
   * The nine patch gets filled with tiles where needed and stretches them a bit if needed.
   */
  public final const val NINE_PATCH_TILE_FIT: Long = 2

  /**
   * Marks an error that shows that the index array is empty.
   */
  public final const val NO_INDEX_ARRAY: Long = -1

  /**
   * Draw particles in the order that they appear in the particles array.
   */
  public final const val PARTICLES_DRAW_ORDER_INDEX: Long = 0

  /**
   * Sort particles based on their lifetime.
   */
  public final const val PARTICLES_DRAW_ORDER_LIFETIME: Long = 1

  /**
   * Sort particles based on their distance to the camera.
   */
  public final const val PARTICLES_DRAW_ORDER_VIEW_DEPTH: Long = 2

  /**
   * Primitive to draw consists of lines.
   */
  public final const val PRIMITIVE_LINES: Long = 1

  /**
   * Primitive to draw consists of a line loop (a line strip with a line between the last and the first vertex).
   */
  public final const val PRIMITIVE_LINE_LOOP: Long = 3

  /**
   * Primitive to draw consists of a line strip from start to end.
   */
  public final const val PRIMITIVE_LINE_STRIP: Long = 2

  /**
   * Represents the size of the [enum PrimitiveType] enum.
   */
  public final const val PRIMITIVE_MAX: Long = 7

  /**
   * Primitive to draw consists of points.
   */
  public final const val PRIMITIVE_POINTS: Long = 0

  /**
   * Primitive to draw consists of triangles.
   */
  public final const val PRIMITIVE_TRIANGLES: Long = 4

  /**
   * Primitive to draw consists of a triangle strip (the last 2 vertices are always combined with the first to make a triangle).
   */
  public final const val PRIMITIVE_TRIANGLE_FAN: Long = 6

  /**
   * Primitive to draw consists of a triangle strip (the last 3 vertices are always combined to make a triangle).
   */
  public final const val PRIMITIVE_TRIANGLE_STRIP: Long = 5

  /**
   * Reflection probe will update each frame. This mode is necessary to capture moving objects.
   */
  public final const val REFLECTION_PROBE_UPDATE_ALWAYS: Long = 1

  /**
   * Reflection probe will update reflections once and then stop.
   */
  public final const val REFLECTION_PROBE_UPDATE_ONCE: Long = 0

  /**
   * Do not use a debug mode.
   */
  public final const val SCENARIO_DEBUG_DISABLED: Long = 0

  /**
   * Draw all objects in a way that displays how much overdraw is occurring. Overdraw occurs when a section of pixels is drawn and shaded and then another object covers it up. To optimize a scene, you should reduce overdraw.
   */
  public final const val SCENARIO_DEBUG_OVERDRAW: Long = 2

  /**
   * Draw all objects without shading. Equivalent to setting all objects shaders to `unshaded`.
   */
  public final const val SCENARIO_DEBUG_SHADELESS: Long = 3

  /**
   * Draw all objects as wireframe models.
   */
  public final const val SCENARIO_DEBUG_WIREFRAME: Long = 1

  /**
   * Shader is a 2D shader.
   */
  public final const val SHADER_CANVAS_ITEM: Long = 1

  /**
   * Represents the size of the [enum ShaderMode] enum.
   */
  public final const val SHADER_MAX: Long = 3

  /**
   * Shader is a particle shader.
   */
  public final const val SHADER_PARTICLES: Long = 2

  /**
   * Shader is a 3D shader.
   */
  public final const val SHADER_SPATIAL: Long = 0

  /**
   * Disable backface culling when rendering the shadow of the object. This is slightly slower but may result in more correct shadows.
   */
  public final const val SHADOW_CASTING_SETTING_DOUBLE_SIDED: Long = 2

  /**
   * Disable shadows from this instance.
   */
  public final const val SHADOW_CASTING_SETTING_OFF: Long = 0

  /**
   * Cast shadows from this instance.
   */
  public final const val SHADOW_CASTING_SETTING_ON: Long = 1

  /**
   * Only render the shadows from the object. The object itself will not be drawn.
   */
  public final const val SHADOW_CASTING_SETTING_SHADOWS_ONLY: Long = 3

  /**
   * Default flags. [TEXTURE_FLAG_MIPMAPS], [TEXTURE_FLAG_REPEAT] and [TEXTURE_FLAG_FILTER] are enabled.
   */
  public final const val TEXTURE_FLAGS_DEFAULT: Long = 7

  /**
   * Uses anisotropic mipmap filtering. Generates smaller versions of the same texture with different aspect ratios.
   *
   * This results in better-looking textures when viewed from oblique angles.
   */
  public final const val TEXTURE_FLAG_ANISOTROPIC_FILTER: Long = 8

  /**
   * Converts the texture to the sRGB color space.
   */
  public final const val TEXTURE_FLAG_CONVERT_TO_LINEAR: Long = 16

  /**
   * Uses a magnifying filter, to enable smooth zooming in of the texture.
   */
  public final const val TEXTURE_FLAG_FILTER: Long = 4

  /**
   * Generates mipmaps, which are smaller versions of the same texture to use when zoomed out, keeping the aspect ratio.
   */
  public final const val TEXTURE_FLAG_MIPMAPS: Long = 1

  /**
   * Repeats the texture with alternate sections mirrored.
   */
  public final const val TEXTURE_FLAG_MIRRORED_REPEAT: Long = 32

  /**
   * Repeats the texture (instead of clamp to edge).
   */
  public final const val TEXTURE_FLAG_REPEAT: Long = 2

  /**
   * Texture is a video surface.
   */
  public final const val TEXTURE_FLAG_USED_FOR_STREAMING: Long = 2048

  /**
   * Normal texture with 2 dimensions, width and height.
   */
  public final const val TEXTURE_TYPE_2D: Long = 0

  /**
   * An array of 2-dimensional textures.
   */
  public final const val TEXTURE_TYPE_2D_ARRAY: Long = 3

  /**
   * A 3-dimensional texture with width, height, and depth.
   */
  public final const val TEXTURE_TYPE_3D: Long = 4

  /**
   * Texture made up of six faces, can be looked up with a `vec3` in shader.
   */
  public final const val TEXTURE_TYPE_CUBEMAP: Long = 2

  /**
   * The viewport is always cleared before drawing.
   */
  public final const val VIEWPORT_CLEAR_ALWAYS: Long = 0

  /**
   * The viewport is never cleared before drawing.
   */
  public final const val VIEWPORT_CLEAR_NEVER: Long = 1

  /**
   * The viewport is cleared once, then the clear mode is set to [VIEWPORT_CLEAR_NEVER].
   */
  public final const val VIEWPORT_CLEAR_ONLY_NEXT_FRAME: Long = 2

  /**
   * Debug draw is disabled. Default setting.
   */
  public final const val VIEWPORT_DEBUG_DRAW_DISABLED: Long = 0

  /**
   * Overwrites clear color to `(0,0,0,0)`.
   */
  public final const val VIEWPORT_DEBUG_DRAW_OVERDRAW: Long = 2

  /**
   * Debug draw sets objects to unshaded.
   */
  public final const val VIEWPORT_DEBUG_DRAW_UNSHADED: Long = 1

  /**
   * Debug draw draws objects in wireframe.
   */
  public final const val VIEWPORT_DEBUG_DRAW_WIREFRAME: Long = 3

  /**
   * Multisample antialiasing is set to 16×.
   */
  public final const val VIEWPORT_MSAA_16X: Long = 4

  /**
   * Multisample antialiasing is set to 2×.
   */
  public final const val VIEWPORT_MSAA_2X: Long = 1

  /**
   * Multisample antialiasing is set to 4×.
   */
  public final const val VIEWPORT_MSAA_4X: Long = 2

  /**
   * Multisample antialiasing is set to 8×.
   */
  public final const val VIEWPORT_MSAA_8X: Long = 3

  /**
   * Multisample antialiasing is disabled.
   */
  public final const val VIEWPORT_MSAA_DISABLED: Long = 0

  /**
   * Multisample antialiasing is set to 2× on external texture. Special mode for GLES2 Android VR (Oculus Quest and Go).
   */
  public final const val VIEWPORT_MSAA_EXT_2X: Long = 5

  /**
   * Multisample antialiasing is set to 4× on external texture. Special mode for GLES2 Android VR (Oculus Quest and Go).
   */
  public final const val VIEWPORT_MSAA_EXT_4X: Long = 6

  /**
   * Number of 2d draw calls during this frame.
   */
  public final const val VIEWPORT_RENDER_INFO_2D_DRAW_CALLS_IN_FRAME: Long = 7

  /**
   * Number of 2d items drawn this frame.
   */
  public final const val VIEWPORT_RENDER_INFO_2D_ITEMS_IN_FRAME: Long = 6

  /**
   * Number of draw calls during this frame.
   */
  public final const val VIEWPORT_RENDER_INFO_DRAW_CALLS_IN_FRAME: Long = 5

  /**
   * Number of material changes during this frame.
   */
  public final const val VIEWPORT_RENDER_INFO_MATERIAL_CHANGES_IN_FRAME: Long = 2

  /**
   * Represents the size of the [enum ViewportRenderInfo] enum.
   */
  public final const val VIEWPORT_RENDER_INFO_MAX: Long = 8

  /**
   * Number of objects drawn in a single frame.
   */
  public final const val VIEWPORT_RENDER_INFO_OBJECTS_IN_FRAME: Long = 0

  /**
   * Number of shader changes during this frame.
   */
  public final const val VIEWPORT_RENDER_INFO_SHADER_CHANGES_IN_FRAME: Long = 3

  /**
   * Number of surface changes during this frame.
   */
  public final const val VIEWPORT_RENDER_INFO_SURFACE_CHANGES_IN_FRAME: Long = 4

  /**
   * Number of vertices drawn in a single frame.
   */
  public final const val VIEWPORT_RENDER_INFO_VERTICES_IN_FRAME: Long = 1

  /**
   * Always update the viewport.
   */
  public final const val VIEWPORT_UPDATE_ALWAYS: Long = 3

  /**
   * Do not update the viewport.
   */
  public final const val VIEWPORT_UPDATE_DISABLED: Long = 0

  /**
   * Update the viewport once then set to disabled.
   */
  public final const val VIEWPORT_UPDATE_ONCE: Long = 1

  /**
   * Update the viewport whenever it is visible.
   */
  public final const val VIEWPORT_UPDATE_WHEN_VISIBLE: Long = 2

  /**
   * The Viewport does not render 3D but samples.
   */
  public final const val VIEWPORT_USAGE_2D: Long = 0

  /**
   * The Viewport does not render 3D and does not sample.
   */
  public final const val VIEWPORT_USAGE_2D_NO_SAMPLING: Long = 1

  /**
   * The Viewport renders 3D with effects.
   */
  public final const val VIEWPORT_USAGE_3D: Long = 2

  /**
   * The Viewport renders 3D but without effects.
   */
  public final const val VIEWPORT_USAGE_3D_NO_EFFECTS: Long = 3

  /**
   * Emitted at the end of the frame, after the VisualServer has finished updating all the Viewports.
   */
  public val framePostDraw: Signal0 by signal()

  /**
   * Emitted at the beginning of the frame, before the VisualServer updates all the Viewports.
   */
  public val framePreDraw: Signal0 by signal()

  /**
   * If `false`, disables rendering completely, but the engine logic is still being processed. You can call [forceDraw] to draw a frame even with rendering disabled.
   */
  public var renderLoopEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSERVER_GET_RENDER_LOOP_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSERVER_SET_RENDER_LOOP_ENABLED, NIL)
    }

  public override fun __new(): Unit {
    rawPtr = TransferContext.getSingleton(ENGINESINGLETON_VISUALSERVER)
  }

  public override fun ____DO_NOT_TOUCH_THIS_isSingleton____() = true

  /**
   * Sets images to be rendered in the window margin.
   */
  public fun blackBarsSetImages(
    left: RID,
    top: RID,
    right: RID,
    bottom: RID
  ): Unit {
    TransferContext.writeArguments(_RID to left, _RID to top, _RID to right, _RID to bottom)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_BLACK_BARS_SET_IMAGES,
        NIL)
  }

  /**
   * Sets margin size, where black bars (or images, if [blackBarsSetImages] was used) are rendered.
   */
  public fun blackBarsSetMargins(
    left: Long,
    top: Long,
    right: Long,
    bottom: Long
  ): Unit {
    TransferContext.writeArguments(LONG to left, LONG to top, LONG to right, LONG to bottom)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_BLACK_BARS_SET_MARGINS,
        NIL)
  }

  /**
   * Creates a camera and adds it to the VisualServer. It can be accessed with the RID that is returned. This RID will be used in all `camera_*` VisualServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the VisualServer's [freeRid] static method.
   */
  public fun cameraCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CAMERA_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Sets the cull mask associated with this camera. The cull mask describes which 3D layers are rendered by this camera. Equivalent to [godot.Camera.cullMask].
   */
  public fun cameraSetCullMask(camera: RID, layers: Long): Unit {
    TransferContext.writeArguments(_RID to camera, LONG to layers)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CAMERA_SET_CULL_MASK,
        NIL)
  }

  /**
   * Sets the environment used by this camera. Equivalent to [godot.Camera.environment].
   */
  public fun cameraSetEnvironment(camera: RID, env: RID): Unit {
    TransferContext.writeArguments(_RID to camera, _RID to env)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CAMERA_SET_ENVIRONMENT,
        NIL)
  }

  /**
   * Sets camera to use frustum projection. This mode allows adjusting the `offset` argument to create "tilted frustum" effects.
   */
  public fun cameraSetFrustum(
    camera: RID,
    size: Double,
    offset: Vector2,
    zNear: Double,
    zFar: Double
  ): Unit {
    TransferContext.writeArguments(_RID to camera, DOUBLE to size, VECTOR2 to offset, DOUBLE to
        zNear, DOUBLE to zFar)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CAMERA_SET_FRUSTUM,
        NIL)
  }

  /**
   * Sets camera to use orthogonal projection, also known as orthographic projection. Objects remain the same size on the screen no matter how far away they are.
   */
  public fun cameraSetOrthogonal(
    camera: RID,
    size: Double,
    zNear: Double,
    zFar: Double
  ): Unit {
    TransferContext.writeArguments(_RID to camera, DOUBLE to size, DOUBLE to zNear, DOUBLE to zFar)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CAMERA_SET_ORTHOGONAL,
        NIL)
  }

  /**
   * Sets camera to use perspective projection. Objects on the screen becomes smaller when they are far away.
   */
  public fun cameraSetPerspective(
    camera: RID,
    fovyDegrees: Double,
    zNear: Double,
    zFar: Double
  ): Unit {
    TransferContext.writeArguments(_RID to camera, DOUBLE to fovyDegrees, DOUBLE to zNear, DOUBLE to
        zFar)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CAMERA_SET_PERSPECTIVE,
        NIL)
  }

  /**
   * Sets [godot.core.Transform] of camera.
   */
  public fun cameraSetTransform(camera: RID, transform: Transform): Unit {
    TransferContext.writeArguments(_RID to camera, TRANSFORM to transform)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CAMERA_SET_TRANSFORM,
        NIL)
  }

  /**
   * If `true`, preserves the horizontal aspect ratio which is equivalent to [godot.Camera.KEEP_WIDTH]. If `false`, preserves the vertical aspect ratio which is equivalent to [godot.Camera.KEEP_HEIGHT].
   */
  public fun cameraSetUseVerticalAspect(camera: RID, enable: Boolean): Unit {
    TransferContext.writeArguments(_RID to camera, BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CAMERA_SET_USE_VERTICAL_ASPECT, NIL)
  }

  /**
   * Creates a canvas and returns the assigned [RID]. It can be accessed with the RID that is returned. This RID will be used in all `canvas_*` VisualServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the VisualServer's [freeRid] static method.
   */
  public fun canvasCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Adds a circle command to the [godot.CanvasItem]'s draw commands.
   */
  public fun canvasItemAddCircle(
    item: RID,
    pos: Vector2,
    radius: Double,
    color: Color
  ): Unit {
    TransferContext.writeArguments(_RID to item, VECTOR2 to pos, DOUBLE to radius, COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_ITEM_ADD_CIRCLE,
        NIL)
  }

  /**
   * If ignore is `true`, the VisualServer does not perform clipping.
   */
  public fun canvasItemAddClipIgnore(item: RID, ignore: Boolean): Unit {
    TransferContext.writeArguments(_RID to item, BOOL to ignore)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_ITEM_ADD_CLIP_IGNORE, NIL)
  }

  /**
   * Adds a line command to the [godot.CanvasItem]'s draw commands.
   */
  public fun canvasItemAddLine(
    item: RID,
    from: Vector2,
    to: Vector2,
    color: Color,
    width: Double = 1.0,
    antialiased: Boolean = false
  ): Unit {
    TransferContext.writeArguments(_RID to item, VECTOR2 to from, VECTOR2 to to, COLOR to color,
        DOUBLE to width, BOOL to antialiased)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_ITEM_ADD_LINE,
        NIL)
  }

  /**
   * Adds a mesh command to the [godot.CanvasItem]'s draw commands.
   */
  public fun canvasItemAddMesh(
    item: RID,
    mesh: RID,
    transform: Transform2D = Transform2D(),
    modulate: Color = Color(1,1,1,1),
    texture: RID = RID(),
    normalMap: RID = RID()
  ): Unit {
    TransferContext.writeArguments(_RID to item, _RID to mesh, TRANSFORM2D to transform, COLOR to
        modulate, _RID to texture, _RID to normalMap)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_ITEM_ADD_MESH,
        NIL)
  }

  /**
   * Adds a [godot.MultiMesh] to the [godot.CanvasItem]'s draw commands. Only affects its aabb at the moment.
   */
  public fun canvasItemAddMultimesh(
    item: RID,
    mesh: RID,
    texture: RID,
    normalMap: RID = RID()
  ): Unit {
    TransferContext.writeArguments(_RID to item, _RID to mesh, _RID to texture, _RID to normalMap)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_ITEM_ADD_MULTIMESH, NIL)
  }

  /**
   * Adds a nine patch image to the [godot.CanvasItem]'s draw commands.
   *
   * See [godot.NinePatchRect] for more explanation.
   */
  public fun canvasItemAddNinePatch(
    item: RID,
    rect: Rect2,
    source: Rect2,
    texture: RID,
    topleft: Vector2,
    bottomright: Vector2,
    xAxisMode: Long = 0,
    yAxisMode: Long = 0,
    drawCenter: Boolean = true,
    modulate: Color = Color(1,1,1,1),
    normalMap: RID = RID()
  ): Unit {
    TransferContext.writeArguments(_RID to item, RECT2 to rect, RECT2 to source, _RID to texture,
        VECTOR2 to topleft, VECTOR2 to bottomright, LONG to xAxisMode, LONG to yAxisMode, BOOL to
        drawCenter, COLOR to modulate, _RID to normalMap)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_ITEM_ADD_NINE_PATCH, NIL)
  }

  /**
   * Adds a particle system to the [godot.CanvasItem]'s draw commands.
   */
  public fun canvasItemAddParticles(
    item: RID,
    particles: RID,
    texture: RID,
    normalMap: RID
  ): Unit {
    TransferContext.writeArguments(_RID to item, _RID to particles, _RID to texture, _RID to
        normalMap)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_ITEM_ADD_PARTICLES, NIL)
  }

  /**
   * Adds a polygon to the [godot.CanvasItem]'s draw commands.
   */
  public fun canvasItemAddPolygon(
    item: RID,
    points: PoolVector2Array,
    colors: PoolColorArray,
    uvs: PoolVector2Array = PoolVector2Array(),
    texture: RID = RID(),
    normalMap: RID = RID(),
    antialiased: Boolean = false
  ): Unit {
    TransferContext.writeArguments(_RID to item, POOL_VECTOR2_ARRAY to points, POOL_COLOR_ARRAY to
        colors, POOL_VECTOR2_ARRAY to uvs, _RID to texture, _RID to normalMap, BOOL to antialiased)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_ITEM_ADD_POLYGON, NIL)
  }

  /**
   * Adds a polyline, which is a line from multiple points with a width, to the [godot.CanvasItem]'s draw commands.
   */
  public fun canvasItemAddPolyline(
    item: RID,
    points: PoolVector2Array,
    colors: PoolColorArray,
    width: Double = 1.0,
    antialiased: Boolean = false
  ): Unit {
    TransferContext.writeArguments(_RID to item, POOL_VECTOR2_ARRAY to points, POOL_COLOR_ARRAY to
        colors, DOUBLE to width, BOOL to antialiased)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_ITEM_ADD_POLYLINE, NIL)
  }

  /**
   * Adds a primitive to the [godot.CanvasItem]'s draw commands.
   */
  public fun canvasItemAddPrimitive(
    item: RID,
    points: PoolVector2Array,
    colors: PoolColorArray,
    uvs: PoolVector2Array,
    texture: RID,
    width: Double = 1.0,
    normalMap: RID = RID()
  ): Unit {
    TransferContext.writeArguments(_RID to item, POOL_VECTOR2_ARRAY to points, POOL_COLOR_ARRAY to
        colors, POOL_VECTOR2_ARRAY to uvs, _RID to texture, DOUBLE to width, _RID to normalMap)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_ITEM_ADD_PRIMITIVE, NIL)
  }

  /**
   * Adds a rectangle to the [godot.CanvasItem]'s draw commands.
   */
  public fun canvasItemAddRect(
    item: RID,
    rect: Rect2,
    color: Color
  ): Unit {
    TransferContext.writeArguments(_RID to item, RECT2 to rect, COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_ITEM_ADD_RECT,
        NIL)
  }

  /**
   * Adds a [godot.core.Transform2D] command to the [godot.CanvasItem]'s draw commands.
   *
   * This sets the extra_matrix uniform when executed. This affects the later commands of the canvas item.
   */
  public fun canvasItemAddSetTransform(item: RID, transform: Transform2D): Unit {
    TransferContext.writeArguments(_RID to item, TRANSFORM2D to transform)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_ITEM_ADD_SET_TRANSFORM, NIL)
  }

  /**
   * Adds a textured rect to the [godot.CanvasItem]'s draw commands.
   */
  public fun canvasItemAddTextureRect(
    item: RID,
    rect: Rect2,
    texture: RID,
    tile: Boolean = false,
    modulate: Color = Color(1,1,1,1),
    transpose: Boolean = false,
    normalMap: RID = RID()
  ): Unit {
    TransferContext.writeArguments(_RID to item, RECT2 to rect, _RID to texture, BOOL to tile, COLOR
        to modulate, BOOL to transpose, _RID to normalMap)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_ITEM_ADD_TEXTURE_RECT, NIL)
  }

  /**
   * Adds a texture rect with region setting to the [godot.CanvasItem]'s draw commands.
   */
  public fun canvasItemAddTextureRectRegion(
    item: RID,
    rect: Rect2,
    texture: RID,
    srcRect: Rect2,
    modulate: Color = Color(1,1,1,1),
    transpose: Boolean = false,
    normalMap: RID = RID(),
    clipUv: Boolean = true
  ): Unit {
    TransferContext.writeArguments(_RID to item, RECT2 to rect, _RID to texture, RECT2 to srcRect,
        COLOR to modulate, BOOL to transpose, _RID to normalMap, BOOL to clipUv)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_ITEM_ADD_TEXTURE_RECT_REGION, NIL)
  }

  /**
   * Adds a triangle array to the [godot.CanvasItem]'s draw commands.
   */
  public fun canvasItemAddTriangleArray(
    item: RID,
    indices: PoolIntArray,
    points: PoolVector2Array,
    colors: PoolColorArray,
    uvs: PoolVector2Array = PoolVector2Array(),
    bones: PoolIntArray = PoolIntArray(),
    weights: PoolRealArray = PoolRealArray(),
    texture: RID = RID(),
    count: Long = -1,
    normalMap: RID = RID(),
    antialiased: Boolean = false,
    antialiasingUseIndices: Boolean = false
  ): Unit {
    TransferContext.writeArguments(_RID to item, POOL_INT_ARRAY to indices, POOL_VECTOR2_ARRAY to
        points, POOL_COLOR_ARRAY to colors, POOL_VECTOR2_ARRAY to uvs, POOL_INT_ARRAY to bones,
        POOL_REAL_ARRAY to weights, _RID to texture, LONG to count, _RID to normalMap, BOOL to
        antialiased, BOOL to antialiasingUseIndices)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_ITEM_ADD_TRIANGLE_ARRAY, NIL)
  }

  /**
   * Clears the [godot.CanvasItem] and removes all commands in it.
   */
  public fun canvasItemClear(item: RID): Unit {
    TransferContext.writeArguments(_RID to item)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_ITEM_CLEAR, NIL)
  }

  /**
   * Creates a new [godot.CanvasItem] and returns its [RID]. It can be accessed with the RID that is returned. This RID will be used in all `canvas_item_*` VisualServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the VisualServer's [freeRid] static method.
   */
  public fun canvasItemCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_ITEM_CREATE,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Sets clipping for the [godot.CanvasItem].
   */
  public fun canvasItemSetClip(item: RID, clip: Boolean): Unit {
    TransferContext.writeArguments(_RID to item, BOOL to clip)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_ITEM_SET_CLIP,
        NIL)
  }

  /**
   * Sets the [godot.CanvasItem] to copy a rect to the backbuffer.
   */
  public fun canvasItemSetCopyToBackbuffer(
    item: RID,
    enabled: Boolean,
    rect: Rect2
  ): Unit {
    TransferContext.writeArguments(_RID to item, BOOL to enabled, RECT2 to rect)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_ITEM_SET_COPY_TO_BACKBUFFER, NIL)
  }

  /**
   * Defines a custom drawing rectangle for the [godot.CanvasItem].
   */
  public fun canvasItemSetCustomRect(
    item: RID,
    useCustomRect: Boolean,
    rect: Rect2 = Rect2(0.0, 0.0, 0.0, 0.0)
  ): Unit {
    TransferContext.writeArguments(_RID to item, BOOL to useCustomRect, RECT2 to rect)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_ITEM_SET_CUSTOM_RECT, NIL)
  }

  /**
   * Enables the use of distance fields for GUI elements that are rendering distance field based fonts.
   */
  public fun canvasItemSetDistanceFieldMode(item: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to item, BOOL to enabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_ITEM_SET_DISTANCE_FIELD_MODE, NIL)
  }

  /**
   * Sets [godot.CanvasItem] to be drawn behind its parent.
   */
  public fun canvasItemSetDrawBehindParent(item: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to item, BOOL to enabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_ITEM_SET_DRAW_BEHIND_PARENT, NIL)
  }

  /**
   * Sets the index for the [godot.CanvasItem].
   */
  public fun canvasItemSetDrawIndex(item: RID, index: Long): Unit {
    TransferContext.writeArguments(_RID to item, LONG to index)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_ITEM_SET_DRAW_INDEX, NIL)
  }

  /**
   * The light mask. See [godot.LightOccluder2D] for more information on light masks.
   */
  public fun canvasItemSetLightMask(item: RID, mask: Long): Unit {
    TransferContext.writeArguments(_RID to item, LONG to mask)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_ITEM_SET_LIGHT_MASK, NIL)
  }

  /**
   * Sets a new material to the [godot.CanvasItem].
   */
  public fun canvasItemSetMaterial(item: RID, material: RID): Unit {
    TransferContext.writeArguments(_RID to item, _RID to material)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_ITEM_SET_MATERIAL, NIL)
  }

  /**
   * Sets the color that modulates the [godot.CanvasItem] and its children.
   */
  public fun canvasItemSetModulate(item: RID, color: Color): Unit {
    TransferContext.writeArguments(_RID to item, COLOR to color)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_ITEM_SET_MODULATE, NIL)
  }

  /**
   * Sets the parent for the [godot.CanvasItem]. The parent can be another canvas item, or it can be the root canvas that is attached to the viewport.
   */
  public fun canvasItemSetParent(item: RID, parent: RID): Unit {
    TransferContext.writeArguments(_RID to item, _RID to parent)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_ITEM_SET_PARENT,
        NIL)
  }

  /**
   * Sets the color that modulates the [godot.CanvasItem] without children.
   */
  public fun canvasItemSetSelfModulate(item: RID, color: Color): Unit {
    TransferContext.writeArguments(_RID to item, COLOR to color)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_ITEM_SET_SELF_MODULATE, NIL)
  }

  /**
   * Sets if [godot.CanvasItem]'s children should be sorted by y-position.
   */
  public fun canvasItemSetSortChildrenByY(item: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to item, BOOL to enabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_ITEM_SET_SORT_CHILDREN_BY_Y, NIL)
  }

  /**
   * Sets the [godot.CanvasItem]'s [godot.core.Transform2D].
   */
  public fun canvasItemSetTransform(item: RID, transform: Transform2D): Unit {
    TransferContext.writeArguments(_RID to item, TRANSFORM2D to transform)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_ITEM_SET_TRANSFORM, NIL)
  }

  /**
   * Sets if the [godot.CanvasItem] uses its parent's material.
   */
  public fun canvasItemSetUseParentMaterial(item: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to item, BOOL to enabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_ITEM_SET_USE_PARENT_MATERIAL, NIL)
  }

  /**
   * Sets if the canvas item (including its children) is visible.
   */
  public fun canvasItemSetVisible(item: RID, visible: Boolean): Unit {
    TransferContext.writeArguments(_RID to item, BOOL to visible)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_ITEM_SET_VISIBLE, NIL)
  }

  /**
   * If this is enabled, the Z index of the parent will be added to the children's Z index.
   */
  public fun canvasItemSetZAsRelativeToParent(item: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to item, BOOL to enabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_ITEM_SET_Z_AS_RELATIVE_TO_PARENT, NIL)
  }

  /**
   * Sets the [godot.CanvasItem]'s Z index, i.e. its draw order (lower indexes are drawn first).
   */
  public fun canvasItemSetZIndex(item: RID, zIndex: Long): Unit {
    TransferContext.writeArguments(_RID to item, LONG to zIndex)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_ITEM_SET_Z_INDEX, NIL)
  }

  /**
   * Attaches the canvas light to the canvas. Removes it from its previous canvas.
   */
  public fun canvasLightAttachToCanvas(light: RID, canvas: RID): Unit {
    TransferContext.writeArguments(_RID to light, _RID to canvas)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_LIGHT_ATTACH_TO_CANVAS, NIL)
  }

  /**
   * Creates a canvas light and adds it to the VisualServer. It can be accessed with the RID that is returned. This RID will be used in all `canvas_light_*` VisualServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the VisualServer's [freeRid] static method.
   */
  public fun canvasLightCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_LIGHT_CREATE,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Attaches a light occluder to the canvas. Removes it from its previous canvas.
   */
  public fun canvasLightOccluderAttachToCanvas(occluder: RID, canvas: RID): Unit {
    TransferContext.writeArguments(_RID to occluder, _RID to canvas)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_LIGHT_OCCLUDER_ATTACH_TO_CANVAS, NIL)
  }

  /**
   * Creates a light occluder and adds it to the VisualServer. It can be accessed with the RID that is returned. This RID will be used in all `canvas_light_ocluder_*` VisualServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the VisualServer's [freeRid] static method.
   */
  public fun canvasLightOccluderCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_LIGHT_OCCLUDER_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Enables or disables light occluder.
   */
  public fun canvasLightOccluderSetEnabled(occluder: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to occluder, BOOL to enabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_LIGHT_OCCLUDER_SET_ENABLED, NIL)
  }

  /**
   * The light mask. See [godot.LightOccluder2D] for more information on light masks.
   */
  public fun canvasLightOccluderSetLightMask(occluder: RID, mask: Long): Unit {
    TransferContext.writeArguments(_RID to occluder, LONG to mask)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_LIGHT_OCCLUDER_SET_LIGHT_MASK, NIL)
  }

  /**
   * Sets a light occluder's polygon.
   */
  public fun canvasLightOccluderSetPolygon(occluder: RID, polygon: RID): Unit {
    TransferContext.writeArguments(_RID to occluder, _RID to polygon)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_LIGHT_OCCLUDER_SET_POLYGON, NIL)
  }

  /**
   * Sets a light occluder's [godot.core.Transform2D].
   */
  public fun canvasLightOccluderSetTransform(occluder: RID, transform: Transform2D): Unit {
    TransferContext.writeArguments(_RID to occluder, TRANSFORM2D to transform)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_LIGHT_OCCLUDER_SET_TRANSFORM, NIL)
  }

  /**
   * Sets the color for a light.
   */
  public fun canvasLightSetColor(light: RID, color: Color): Unit {
    TransferContext.writeArguments(_RID to light, COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_LIGHT_SET_COLOR,
        NIL)
  }

  /**
   * Enables or disables a canvas light.
   */
  public fun canvasLightSetEnabled(light: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to light, BOOL to enabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_LIGHT_SET_ENABLED, NIL)
  }

  /**
   * Sets a canvas light's energy.
   */
  public fun canvasLightSetEnergy(light: RID, energy: Double): Unit {
    TransferContext.writeArguments(_RID to light, DOUBLE to energy)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_LIGHT_SET_ENERGY, NIL)
  }

  /**
   * Sets a canvas light's height.
   */
  public fun canvasLightSetHeight(light: RID, height: Double): Unit {
    TransferContext.writeArguments(_RID to light, DOUBLE to height)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_LIGHT_SET_HEIGHT, NIL)
  }

  /**
   * The light mask. See [godot.LightOccluder2D] for more information on light masks.
   */
  public fun canvasLightSetItemCullMask(light: RID, mask: Long): Unit {
    TransferContext.writeArguments(_RID to light, LONG to mask)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_LIGHT_SET_ITEM_CULL_MASK, NIL)
  }

  /**
   * The binary mask used to determine which layers this canvas light's shadows affects. See [godot.LightOccluder2D] for more information on light masks.
   */
  public fun canvasLightSetItemShadowCullMask(light: RID, mask: Long): Unit {
    TransferContext.writeArguments(_RID to light, LONG to mask)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_LIGHT_SET_ITEM_SHADOW_CULL_MASK, NIL)
  }

  /**
   * The layer range that gets rendered with this light.
   */
  public fun canvasLightSetLayerRange(
    light: RID,
    minLayer: Long,
    maxLayer: Long
  ): Unit {
    TransferContext.writeArguments(_RID to light, LONG to minLayer, LONG to maxLayer)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_LIGHT_SET_LAYER_RANGE, NIL)
  }

  /**
   * The mode of the light, see [enum CanvasLightMode] constants.
   */
  public fun canvasLightSetMode(light: RID, mode: Long): Unit {
    TransferContext.writeArguments(_RID to light, LONG to mode)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_LIGHT_SET_MODE,
        NIL)
  }

  /**
   * Sets the texture's scale factor of the light. Equivalent to [godot.Light2D.textureScale].
   */
  public fun canvasLightSetScale(light: RID, scale: Double): Unit {
    TransferContext.writeArguments(_RID to light, DOUBLE to scale)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_LIGHT_SET_SCALE,
        NIL)
  }

  /**
   * Sets the width of the shadow buffer, size gets scaled to the next power of two for this.
   */
  public fun canvasLightSetShadowBufferSize(light: RID, size: Long): Unit {
    TransferContext.writeArguments(_RID to light, LONG to size)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_LIGHT_SET_SHADOW_BUFFER_SIZE, NIL)
  }

  /**
   * Sets the color of the canvas light's shadow.
   */
  public fun canvasLightSetShadowColor(light: RID, color: Color): Unit {
    TransferContext.writeArguments(_RID to light, COLOR to color)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_LIGHT_SET_SHADOW_COLOR, NIL)
  }

  /**
   * Enables or disables the canvas light's shadow.
   */
  public fun canvasLightSetShadowEnabled(light: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to light, BOOL to enabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_LIGHT_SET_SHADOW_ENABLED, NIL)
  }

  /**
   * Sets the canvas light's shadow's filter, see [enum CanvasLightShadowFilter] constants.
   */
  public fun canvasLightSetShadowFilter(light: RID, filter: Long): Unit {
    TransferContext.writeArguments(_RID to light, LONG to filter)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_LIGHT_SET_SHADOW_FILTER, NIL)
  }

  /**
   * Sets the length of the shadow's gradient.
   */
  public fun canvasLightSetShadowGradientLength(light: RID, length: Double): Unit {
    TransferContext.writeArguments(_RID to light, DOUBLE to length)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_LIGHT_SET_SHADOW_GRADIENT_LENGTH, NIL)
  }

  /**
   * Smoothens the shadow. The lower, the smoother.
   */
  public fun canvasLightSetShadowSmooth(light: RID, smooth: Double): Unit {
    TransferContext.writeArguments(_RID to light, DOUBLE to smooth)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_LIGHT_SET_SHADOW_SMOOTH, NIL)
  }

  /**
   * Sets texture to be used by light. Equivalent to [godot.Light2D.texture].
   */
  public fun canvasLightSetTexture(light: RID, texture: RID): Unit {
    TransferContext.writeArguments(_RID to light, _RID to texture)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_LIGHT_SET_TEXTURE, NIL)
  }

  /**
   * Sets the offset of the light's texture. Equivalent to [godot.Light2D.offset].
   */
  public fun canvasLightSetTextureOffset(light: RID, offset: Vector2): Unit {
    TransferContext.writeArguments(_RID to light, VECTOR2 to offset)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_LIGHT_SET_TEXTURE_OFFSET, NIL)
  }

  /**
   * Sets the canvas light's [godot.core.Transform2D].
   */
  public fun canvasLightSetTransform(light: RID, transform: Transform2D): Unit {
    TransferContext.writeArguments(_RID to light, TRANSFORM2D to transform)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_LIGHT_SET_TRANSFORM, NIL)
  }

  /**
   * Sets the Z range of objects that will be affected by this light. Equivalent to [godot.Light2D.rangeZMin] and [godot.Light2D.rangeZMax].
   */
  public fun canvasLightSetZRange(
    light: RID,
    minZ: Long,
    maxZ: Long
  ): Unit {
    TransferContext.writeArguments(_RID to light, LONG to minZ, LONG to maxZ)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_LIGHT_SET_Z_RANGE, NIL)
  }

  /**
   * Creates a new light occluder polygon and adds it to the VisualServer. It can be accessed with the RID that is returned. This RID will be used in all `canvas_occluder_polygon_*` VisualServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the VisualServer's [freeRid] static method.
   */
  public fun canvasOccluderPolygonCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_OCCLUDER_POLYGON_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Sets an occluder polygons cull mode. See [enum CanvasOccluderPolygonCullMode] constants.
   */
  public fun canvasOccluderPolygonSetCullMode(occluderPolygon: RID, mode: Long): Unit {
    TransferContext.writeArguments(_RID to occluderPolygon, LONG to mode)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_OCCLUDER_POLYGON_SET_CULL_MODE, NIL)
  }

  /**
   * Sets the shape of the occluder polygon.
   */
  public fun canvasOccluderPolygonSetShape(
    occluderPolygon: RID,
    shape: PoolVector2Array,
    closed: Boolean
  ): Unit {
    TransferContext.writeArguments(_RID to occluderPolygon, POOL_VECTOR2_ARRAY to shape, BOOL to
        closed)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_OCCLUDER_POLYGON_SET_SHAPE, NIL)
  }

  /**
   * Sets the shape of the occluder polygon as lines.
   */
  public fun canvasOccluderPolygonSetShapeAsLines(occluderPolygon: RID, shape: PoolVector2Array):
      Unit {
    TransferContext.writeArguments(_RID to occluderPolygon, POOL_VECTOR2_ARRAY to shape)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_OCCLUDER_POLYGON_SET_SHAPE_AS_LINES, NIL)
  }

  /**
   * A copy of the canvas item will be drawn with a local offset of the mirroring [godot.core.Vector2].
   */
  public fun canvasSetItemMirroring(
    canvas: RID,
    item: RID,
    mirroring: Vector2
  ): Unit {
    TransferContext.writeArguments(_RID to canvas, _RID to item, VECTOR2 to mirroring)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_SET_ITEM_MIRRORING, NIL)
  }

  /**
   * Modulates all colors in the given canvas.
   */
  public fun canvasSetModulate(canvas: RID, color: Color): Unit {
    TransferContext.writeArguments(_RID to canvas, COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_CANVAS_SET_MODULATE,
        NIL)
  }

  /**
   * Creates a directional light and adds it to the VisualServer. It can be accessed with the RID that is returned. This RID can be used in most `light_*` VisualServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the VisualServer's [freeRid] static method.
   *
   * To place in a scene, attach this directional light to an instance using [instanceSetBase] using the returned RID.
   */
  public fun directionalLightCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_DIRECTIONAL_LIGHT_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Draws a frame. *This method is deprecated*, please use [forceDraw] instead.
   */
  public fun draw(swapBuffers: Boolean = true, frameStep: Double = 0.0): Unit {
    TransferContext.writeArguments(BOOL to swapBuffers, DOUBLE to frameStep)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_DRAW, NIL)
  }

  /**
   * Creates an environment and adds it to the VisualServer. It can be accessed with the RID that is returned. This RID will be used in all `environment_*` VisualServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the VisualServer's [freeRid] static method.
   */
  public fun environmentCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_ENVIRONMENT_CREATE,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Sets the values to be used with the "Adjustment" post-process effect. See [godot.Environment] for more details.
   */
  public fun environmentSetAdjustment(
    env: RID,
    enable: Boolean,
    brightness: Double,
    contrast: Double,
    saturation: Double,
    ramp: RID
  ): Unit {
    TransferContext.writeArguments(_RID to env, BOOL to enable, DOUBLE to brightness, DOUBLE to
        contrast, DOUBLE to saturation, _RID to ramp)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_ENVIRONMENT_SET_ADJUSTMENT, NIL)
  }

  /**
   * Sets the ambient light parameters. See [godot.Environment] for more details.
   */
  public fun environmentSetAmbientLight(
    env: RID,
    color: Color,
    energy: Double = 1.0,
    skyContibution: Double = 0.0
  ): Unit {
    TransferContext.writeArguments(_RID to env, COLOR to color, DOUBLE to energy, DOUBLE to
        skyContibution)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_ENVIRONMENT_SET_AMBIENT_LIGHT, NIL)
  }

  /**
   * Sets the *BGMode* of the environment. Equivalent to [godot.Environment.backgroundMode].
   */
  public fun environmentSetBackground(env: RID, bg: Long): Unit {
    TransferContext.writeArguments(_RID to env, LONG to bg)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_ENVIRONMENT_SET_BACKGROUND, NIL)
  }

  /**
   * Color displayed for clear areas of the scene (if using Custom color or Color+Sky background modes).
   */
  public fun environmentSetBgColor(env: RID, color: Color): Unit {
    TransferContext.writeArguments(_RID to env, COLOR to color)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_ENVIRONMENT_SET_BG_COLOR, NIL)
  }

  /**
   * Sets the intensity of the background color.
   */
  public fun environmentSetBgEnergy(env: RID, energy: Double): Unit {
    TransferContext.writeArguments(_RID to env, DOUBLE to energy)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_ENVIRONMENT_SET_BG_ENERGY, NIL)
  }

  /**
   * Sets the maximum layer to use if using Canvas background mode.
   */
  public fun environmentSetCanvasMaxLayer(env: RID, maxLayer: Long): Unit {
    TransferContext.writeArguments(_RID to env, LONG to maxLayer)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_ENVIRONMENT_SET_CANVAS_MAX_LAYER, NIL)
  }

  /**
   * Sets the values to be used with the "DoF Far Blur" post-process effect. See [godot.Environment] for more details.
   */
  public fun environmentSetDofBlurFar(
    env: RID,
    enable: Boolean,
    distance: Double,
    transition: Double,
    farAmount: Double,
    quality: Long
  ): Unit {
    TransferContext.writeArguments(_RID to env, BOOL to enable, DOUBLE to distance, DOUBLE to
        transition, DOUBLE to farAmount, LONG to quality)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_ENVIRONMENT_SET_DOF_BLUR_FAR, NIL)
  }

  /**
   * Sets the values to be used with the "DoF Near Blur" post-process effect. See [godot.Environment] for more details.
   */
  public fun environmentSetDofBlurNear(
    env: RID,
    enable: Boolean,
    distance: Double,
    transition: Double,
    farAmount: Double,
    quality: Long
  ): Unit {
    TransferContext.writeArguments(_RID to env, BOOL to enable, DOUBLE to distance, DOUBLE to
        transition, DOUBLE to farAmount, LONG to quality)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_ENVIRONMENT_SET_DOF_BLUR_NEAR, NIL)
  }

  /**
   * Sets the variables to be used with the scene fog. See [godot.Environment] for more details.
   */
  public fun environmentSetFog(
    env: RID,
    enable: Boolean,
    color: Color,
    sunColor: Color,
    sunAmount: Double
  ): Unit {
    TransferContext.writeArguments(_RID to env, BOOL to enable, COLOR to color, COLOR to sunColor,
        DOUBLE to sunAmount)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_ENVIRONMENT_SET_FOG,
        NIL)
  }

  /**
   * Sets the variables to be used with the fog depth effect. See [godot.Environment] for more details.
   */
  public fun environmentSetFogDepth(
    env: RID,
    enable: Boolean,
    depthBegin: Double,
    depthEnd: Double,
    depthCurve: Double,
    transmit: Boolean,
    transmitCurve: Double
  ): Unit {
    TransferContext.writeArguments(_RID to env, BOOL to enable, DOUBLE to depthBegin, DOUBLE to
        depthEnd, DOUBLE to depthCurve, BOOL to transmit, DOUBLE to transmitCurve)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_ENVIRONMENT_SET_FOG_DEPTH, NIL)
  }

  /**
   * Sets the variables to be used with the fog height effect. See [godot.Environment] for more details.
   */
  public fun environmentSetFogHeight(
    env: RID,
    enable: Boolean,
    minHeight: Double,
    maxHeight: Double,
    heightCurve: Double
  ): Unit {
    TransferContext.writeArguments(_RID to env, BOOL to enable, DOUBLE to minHeight, DOUBLE to
        maxHeight, DOUBLE to heightCurve)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_ENVIRONMENT_SET_FOG_HEIGHT, NIL)
  }

  /**
   * Sets the variables to be used with the "glow" post-process effect. See [godot.Environment] for more details.
   */
  public fun environmentSetGlow(
    env: RID,
    enable: Boolean,
    levelFlags: Long,
    intensity: Double,
    strength: Double,
    bloomThreshold: Double,
    blendMode: Long,
    hdrBleedThreshold: Double,
    hdrBleedScale: Double,
    hdrLuminanceCap: Double,
    bicubicUpscale: Boolean,
    highQuality: Boolean
  ): Unit {
    TransferContext.writeArguments(_RID to env, BOOL to enable, LONG to levelFlags, DOUBLE to
        intensity, DOUBLE to strength, DOUBLE to bloomThreshold, LONG to blendMode, DOUBLE to
        hdrBleedThreshold, DOUBLE to hdrBleedScale, DOUBLE to hdrLuminanceCap, BOOL to
        bicubicUpscale, BOOL to highQuality)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_ENVIRONMENT_SET_GLOW,
        NIL)
  }

  /**
   * Sets the [godot.Sky] to be used as the environment's background when using *BGMode* sky. Equivalent to [godot.Environment.backgroundSky].
   */
  public fun environmentSetSky(env: RID, sky: RID): Unit {
    TransferContext.writeArguments(_RID to env, _RID to sky)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_ENVIRONMENT_SET_SKY,
        NIL)
  }

  /**
   * Sets a custom field of view for the background [godot.Sky]. Equivalent to [godot.Environment.backgroundSkyCustomFov].
   */
  public fun environmentSetSkyCustomFov(env: RID, scale: Double): Unit {
    TransferContext.writeArguments(_RID to env, DOUBLE to scale)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_ENVIRONMENT_SET_SKY_CUSTOM_FOV, NIL)
  }

  /**
   * Sets the rotation of the background [godot.Sky] expressed as a [godot.core.Basis]. Equivalent to [godot.Environment.backgroundSkyOrientation].
   */
  public fun environmentSetSkyOrientation(env: RID, orientation: Basis): Unit {
    TransferContext.writeArguments(_RID to env, BASIS to orientation)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_ENVIRONMENT_SET_SKY_ORIENTATION, NIL)
  }

  /**
   * Sets the variables to be used with the "Screen Space Ambient Occlusion (SSAO)" post-process effect. See [godot.Environment] for more details.
   */
  public fun environmentSetSsao(
    env: RID,
    enable: Boolean,
    radius: Double,
    intensity: Double,
    radius2: Double,
    intensity2: Double,
    bias: Double,
    lightAffect: Double,
    aoChannelAffect: Double,
    color: Color,
    quality: Long,
    blur: Long,
    bilateralSharpness: Double
  ): Unit {
    TransferContext.writeArguments(_RID to env, BOOL to enable, DOUBLE to radius, DOUBLE to
        intensity, DOUBLE to radius2, DOUBLE to intensity2, DOUBLE to bias, DOUBLE to lightAffect,
        DOUBLE to aoChannelAffect, COLOR to color, LONG to quality, LONG to blur, DOUBLE to
        bilateralSharpness)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_ENVIRONMENT_SET_SSAO,
        NIL)
  }

  /**
   * Sets the variables to be used with the "screen space reflections" post-process effect. See [godot.Environment] for more details.
   */
  public fun environmentSetSsr(
    env: RID,
    enable: Boolean,
    maxSteps: Long,
    fadeIn: Double,
    fadeOut: Double,
    depthTolerance: Double,
    roughness: Boolean
  ): Unit {
    TransferContext.writeArguments(_RID to env, BOOL to enable, LONG to maxSteps, DOUBLE to fadeIn,
        DOUBLE to fadeOut, DOUBLE to depthTolerance, BOOL to roughness)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_ENVIRONMENT_SET_SSR,
        NIL)
  }

  /**
   * Sets the variables to be used with the "tonemap" post-process effect. See [godot.Environment] for more details.
   */
  public fun environmentSetTonemap(
    env: RID,
    toneMapper: Long,
    exposure: Double,
    white: Double,
    autoExposure: Boolean,
    minLuminance: Double,
    maxLuminance: Double,
    autoExpSpeed: Double,
    autoExpGrey: Double
  ): Unit {
    TransferContext.writeArguments(_RID to env, LONG to toneMapper, DOUBLE to exposure, DOUBLE to
        white, BOOL to autoExposure, DOUBLE to minLuminance, DOUBLE to maxLuminance, DOUBLE to
        autoExpSpeed, DOUBLE to autoExpGrey)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_ENVIRONMENT_SET_TONEMAP, NIL)
  }

  /**
   * Removes buffers and clears testcubes.
   */
  public fun finish(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_FINISH, NIL)
  }

  /**
   * Forces a frame to be drawn when the function is called. Drawing a frame updates all [godot.Viewport]s that are set to update. Use with extreme caution.
   */
  public fun forceDraw(swapBuffers: Boolean = true, frameStep: Double = 0.0): Unit {
    TransferContext.writeArguments(BOOL to swapBuffers, DOUBLE to frameStep)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_FORCE_DRAW, NIL)
  }

  /**
   * Synchronizes threads.
   */
  public fun forceSync(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_FORCE_SYNC, NIL)
  }

  /**
   * Tries to free an object in the VisualServer.
   */
  public fun freeRid(rid: RID): Unit {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_FREE_RID, NIL)
  }

  /**
   * Returns a certain information, see [enum RenderInfo] for options.
   */
  public fun getRenderInfo(info: Long): Long {
    TransferContext.writeArguments(LONG to info)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_GET_RENDER_INFO, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the id of the test cube. Creates one if none exists.
   */
  public fun getTestCube(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_GET_TEST_CUBE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Returns the id of the test texture. Creates one if none exists.
   */
  public fun getTestTexture(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_GET_TEST_TEXTURE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Returns the name of the video adapter (e.g. "GeForce GTX 1080/PCIe/SSE2").
   *
   * **Note:** When running a headless or server binary, this function returns an empty string.
   */
  public fun getVideoAdapterName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_GET_VIDEO_ADAPTER_NAME,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the vendor of the video adapter (e.g. "NVIDIA Corporation").
   *
   * **Note:** When running a headless or server binary, this function returns an empty string.
   */
  public fun getVideoAdapterVendor(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_GET_VIDEO_ADAPTER_VENDOR, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the id of a white texture. Creates one if none exists.
   */
  public fun getWhiteTexture(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_GET_WHITE_TEXTURE,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Creates a GI probe and adds it to the VisualServer. It can be accessed with the RID that is returned. This RID will be used in all `gi_probe_*` VisualServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the VisualServer's [freeRid] static method.
   *
   * To place in a scene, attach this GI probe to an instance using [instanceSetBase] using the returned RID.
   */
  public fun giProbeCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_GI_PROBE_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Returns the bias value for the GI probe. Bias is used to avoid self occlusion. Equivalent to [godot.GIProbeData.bias].
   */
  public fun giProbeGetBias(probe: RID): Double {
    TransferContext.writeArguments(_RID to probe)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_GI_PROBE_GET_BIAS,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the axis-aligned bounding box that covers the full extent of the GI probe.
   */
  public fun giProbeGetBounds(probe: RID): AABB {
    TransferContext.writeArguments(_RID to probe)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_GI_PROBE_GET_BOUNDS,
        godot.core.VariantType.AABB)
    return TransferContext.readReturnValue(godot.core.VariantType.AABB, false) as AABB
  }

  /**
   * Returns the cell size set by [giProbeSetCellSize].
   */
  public fun giProbeGetCellSize(probe: RID): Double {
    TransferContext.writeArguments(_RID to probe)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_GI_PROBE_GET_CELL_SIZE,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the data used by the GI probe.
   */
  public fun giProbeGetDynamicData(probe: RID): PoolIntArray {
    TransferContext.writeArguments(_RID to probe)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_GI_PROBE_GET_DYNAMIC_DATA, POOL_INT_ARRAY)
    return TransferContext.readReturnValue(POOL_INT_ARRAY, false) as PoolIntArray
  }

  /**
   * Returns the dynamic range set for this GI probe. Equivalent to [godot.GIProbe.dynamicRange].
   */
  public fun giProbeGetDynamicRange(probe: RID): Long {
    TransferContext.writeArguments(_RID to probe)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_GI_PROBE_GET_DYNAMIC_RANGE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the energy multiplier for this GI probe. Equivalent to [godot.GIProbe.energy].
   */
  public fun giProbeGetEnergy(probe: RID): Double {
    TransferContext.writeArguments(_RID to probe)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_GI_PROBE_GET_ENERGY,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the normal bias for this GI probe. Equivalent to [godot.GIProbe.normalBias].
   */
  public fun giProbeGetNormalBias(probe: RID): Double {
    TransferContext.writeArguments(_RID to probe)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_GI_PROBE_GET_NORMAL_BIAS, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the propagation value for this GI probe. Equivalent to [godot.GIProbe.propagation].
   */
  public fun giProbeGetPropagation(probe: RID): Double {
    TransferContext.writeArguments(_RID to probe)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_GI_PROBE_GET_PROPAGATION, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the Transform set by [giProbeSetToCellXform].
   */
  public fun giProbeGetToCellXform(probe: RID): Transform {
    TransferContext.writeArguments(_RID to probe)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_GI_PROBE_GET_TO_CELL_XFORM, TRANSFORM)
    return TransferContext.readReturnValue(TRANSFORM, false) as Transform
  }

  /**
   * Returns `true` if the GI probe data associated with this GI probe is compressed. Equivalent to [godot.GIProbe.compress].
   */
  public fun giProbeIsCompressed(probe: RID): Boolean {
    TransferContext.writeArguments(_RID to probe)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_GI_PROBE_IS_COMPRESSED,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the GI probe is set to interior, meaning it does not account for sky light. Equivalent to [godot.GIProbe.interior].
   */
  public fun giProbeIsInterior(probe: RID): Boolean {
    TransferContext.writeArguments(_RID to probe)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_GI_PROBE_IS_INTERIOR,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sets the bias value to avoid self-occlusion. Equivalent to [godot.GIProbe.bias].
   */
  public fun giProbeSetBias(probe: RID, bias: Double): Unit {
    TransferContext.writeArguments(_RID to probe, DOUBLE to bias)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_GI_PROBE_SET_BIAS, NIL)
  }

  /**
   * Sets the axis-aligned bounding box that covers the extent of the GI probe.
   */
  public fun giProbeSetBounds(probe: RID, bounds: AABB): Unit {
    TransferContext.writeArguments(_RID to probe, godot.core.VariantType.AABB to bounds)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_GI_PROBE_SET_BOUNDS,
        NIL)
  }

  /**
   * Sets the size of individual cells within the GI probe.
   */
  public fun giProbeSetCellSize(probe: RID, range: Double): Unit {
    TransferContext.writeArguments(_RID to probe, DOUBLE to range)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_GI_PROBE_SET_CELL_SIZE,
        NIL)
  }

  /**
   * Sets the compression setting for the GI probe data. Compressed data will take up less space but may look worse. Equivalent to [godot.GIProbe.compress].
   */
  public fun giProbeSetCompress(probe: RID, enable: Boolean): Unit {
    TransferContext.writeArguments(_RID to probe, BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_GI_PROBE_SET_COMPRESS,
        NIL)
  }

  /**
   * Sets the data to be used in the GI probe for lighting calculations. Normally this is created and called internally within the [godot.GIProbe] node. You should not try to set this yourself.
   */
  public fun giProbeSetDynamicData(probe: RID, `data`: PoolIntArray): Unit {
    TransferContext.writeArguments(_RID to probe, POOL_INT_ARRAY to data)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_GI_PROBE_SET_DYNAMIC_DATA, NIL)
  }

  /**
   * Sets the dynamic range of the GI probe. Dynamic range sets the limit for how bright lights can be. A smaller range captures greater detail but limits how bright lights can be. Equivalent to [godot.GIProbe.dynamicRange].
   */
  public fun giProbeSetDynamicRange(probe: RID, range: Long): Unit {
    TransferContext.writeArguments(_RID to probe, LONG to range)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_GI_PROBE_SET_DYNAMIC_RANGE, NIL)
  }

  /**
   * Sets the energy multiplier for this GI probe. A higher energy makes the indirect light from the GI probe brighter. Equivalent to [godot.GIProbe.energy].
   */
  public fun giProbeSetEnergy(probe: RID, energy: Double): Unit {
    TransferContext.writeArguments(_RID to probe, DOUBLE to energy)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_GI_PROBE_SET_ENERGY,
        NIL)
  }

  /**
   * Sets the interior value of this GI probe. A GI probe set to interior does not include the sky when calculating lighting. Equivalent to [godot.GIProbe.interior].
   */
  public fun giProbeSetInterior(probe: RID, enable: Boolean): Unit {
    TransferContext.writeArguments(_RID to probe, BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_GI_PROBE_SET_INTERIOR,
        NIL)
  }

  /**
   * Sets the normal bias for this GI probe. Normal bias behaves similar to the other form of bias and may help reduce self-occlusion. Equivalent to [godot.GIProbe.normalBias].
   */
  public fun giProbeSetNormalBias(probe: RID, bias: Double): Unit {
    TransferContext.writeArguments(_RID to probe, DOUBLE to bias)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_GI_PROBE_SET_NORMAL_BIAS, NIL)
  }

  /**
   * Sets the propagation of light within this GI probe. Equivalent to [godot.GIProbe.propagation].
   */
  public fun giProbeSetPropagation(probe: RID, propagation: Double): Unit {
    TransferContext.writeArguments(_RID to probe, DOUBLE to propagation)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_GI_PROBE_SET_PROPAGATION, NIL)
  }

  /**
   * Sets the to cell [godot.core.Transform] for this GI probe.
   */
  public fun giProbeSetToCellXform(probe: RID, xform: Transform): Unit {
    TransferContext.writeArguments(_RID to probe, TRANSFORM to xform)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_GI_PROBE_SET_TO_CELL_XFORM, NIL)
  }

  /**
   * Returns `true` if changes have been made to the VisualServer's data. [draw] is usually called if this happens.
   */
  public fun hasChanged(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_HAS_CHANGED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Not yet implemented. Always returns `false`.
   */
  public fun hasFeature(feature: Long): Boolean {
    TransferContext.writeArguments(LONG to feature)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_HAS_FEATURE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the OS supports a certain feature. Features might be `s3tc`, `etc`, `etc2`, `pvrtc` and `skinning_fallback`.
   *
   * When rendering with GLES2, returns `true` with `skinning_fallback` in case the hardware doesn't support the default GPU skinning process.
   */
  public fun hasOsFeature(feature: String): Boolean {
    TransferContext.writeArguments(STRING to feature)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_HAS_OS_FEATURE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sets up [godot.ImmediateGeometry] internals to prepare for drawing. Equivalent to [godot.ImmediateGeometry.begin].
   */
  public fun immediateBegin(
    immediate: RID,
    primitive: Long,
    texture: RID = RID()
  ): Unit {
    TransferContext.writeArguments(_RID to immediate, LONG to primitive, _RID to texture)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_IMMEDIATE_BEGIN, NIL)
  }

  /**
   * Clears everything that was set up between [immediateBegin] and [immediateEnd]. Equivalent to [godot.ImmediateGeometry.clear].
   */
  public fun immediateClear(immediate: RID): Unit {
    TransferContext.writeArguments(_RID to immediate)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_IMMEDIATE_CLEAR, NIL)
  }

  /**
   * Sets the color to be used with next vertex. Equivalent to [godot.ImmediateGeometry.setColor].
   */
  public fun immediateColor(immediate: RID, color: Color): Unit {
    TransferContext.writeArguments(_RID to immediate, COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_IMMEDIATE_COLOR, NIL)
  }

  /**
   * Creates an immediate geometry and adds it to the VisualServer. It can be accessed with the RID that is returned. This RID will be used in all `immediate_*` VisualServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the VisualServer's [freeRid] static method.
   *
   * To place in a scene, attach this immediate geometry to an instance using [instanceSetBase] using the returned RID.
   */
  public fun immediateCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_IMMEDIATE_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Ends drawing the [godot.ImmediateGeometry] and displays it. Equivalent to [godot.ImmediateGeometry.end].
   */
  public fun immediateEnd(immediate: RID): Unit {
    TransferContext.writeArguments(_RID to immediate)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_IMMEDIATE_END, NIL)
  }

  /**
   * Returns the material assigned to the [godot.ImmediateGeometry].
   */
  public fun immediateGetMaterial(immediate: RID): RID {
    TransferContext.writeArguments(_RID to immediate)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_IMMEDIATE_GET_MATERIAL,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Sets the normal to be used with next vertex. Equivalent to [godot.ImmediateGeometry.setNormal].
   */
  public fun immediateNormal(immediate: RID, normal: Vector3): Unit {
    TransferContext.writeArguments(_RID to immediate, VECTOR3 to normal)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_IMMEDIATE_NORMAL, NIL)
  }

  /**
   * Sets the material to be used to draw the [godot.ImmediateGeometry].
   */
  public fun immediateSetMaterial(immediate: RID, material: RID): Unit {
    TransferContext.writeArguments(_RID to immediate, _RID to material)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_IMMEDIATE_SET_MATERIAL,
        NIL)
  }

  /**
   * Sets the tangent to be used with next vertex. Equivalent to [godot.ImmediateGeometry.setTangent].
   */
  public fun immediateTangent(immediate: RID, tangent: Plane): Unit {
    TransferContext.writeArguments(_RID to immediate, PLANE to tangent)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_IMMEDIATE_TANGENT, NIL)
  }

  /**
   * Sets the UV to be used with next vertex. Equivalent to [godot.ImmediateGeometry.setUv].
   */
  public fun immediateUv(immediate: RID, texUv: Vector2): Unit {
    TransferContext.writeArguments(_RID to immediate, VECTOR2 to texUv)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_IMMEDIATE_UV, NIL)
  }

  /**
   * Sets the UV2 to be used with next vertex. Equivalent to [godot.ImmediateGeometry.setUv2].
   */
  public fun immediateUv2(immediate: RID, texUv: Vector2): Unit {
    TransferContext.writeArguments(_RID to immediate, VECTOR2 to texUv)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_IMMEDIATE_UV2, NIL)
  }

  /**
   * Adds the next vertex using the information provided in advance. Equivalent to [godot.ImmediateGeometry.addVertex].
   */
  public fun immediateVertex(immediate: RID, vertex: Vector3): Unit {
    TransferContext.writeArguments(_RID to immediate, VECTOR3 to vertex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_IMMEDIATE_VERTEX, NIL)
  }

  /**
   * Adds the next vertex using the information provided in advance. This is a helper class that calls [immediateVertex] under the hood. Equivalent to [godot.ImmediateGeometry.addVertex].
   */
  public fun immediateVertex2d(immediate: RID, vertex: Vector2): Unit {
    TransferContext.writeArguments(_RID to immediate, VECTOR2 to vertex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_IMMEDIATE_VERTEX_2D,
        NIL)
  }

  /**
   * Initializes the visual server. This function is called internally by platform-dependent code during engine initialization. If called from a running game, it will not do anything.
   */
  public fun `init`(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_INIT, NIL)
  }

  /**
   * Attaches a unique Object ID to instance. Object ID must be attached to instance for proper culling with [instancesCullAabb], [instancesCullConvex], and [instancesCullRay].
   */
  public fun instanceAttachObjectInstanceId(instance: RID, id: Long): Unit {
    TransferContext.writeArguments(_RID to instance, LONG to id)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_INSTANCE_ATTACH_OBJECT_INSTANCE_ID, NIL)
  }

  /**
   * Attaches a skeleton to an instance. Removes the previous skeleton from the instance.
   */
  public fun instanceAttachSkeleton(instance: RID, skeleton: RID): Unit {
    TransferContext.writeArguments(_RID to instance, _RID to skeleton)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_INSTANCE_ATTACH_SKELETON, NIL)
  }

  /**
   * Creates a visual instance and adds it to the VisualServer. It can be accessed with the RID that is returned. This RID will be used in all `instance_*` VisualServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the VisualServer's [freeRid] static method.
   *
   * An instance is a way of placing a 3D object in the scenario. Objects like particles, meshes, and reflection probes need to be associated with an instance to be visible in the scenario using [instanceSetBase].
   */
  public fun instanceCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_INSTANCE_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Creates a visual instance, adds it to the VisualServer, and sets both base and scenario. It can be accessed with the RID that is returned. This RID will be used in all `instance_*` VisualServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the VisualServer's [freeRid] static method.
   */
  public fun instanceCreate2(base: RID, scenario: RID): RID {
    TransferContext.writeArguments(_RID to base, _RID to scenario)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_INSTANCE_CREATE2, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Not implemented in Godot 3.x.
   */
  public fun instanceGeometrySetAsInstanceLod(instance: RID, asLodOfInstance: RID): Unit {
    TransferContext.writeArguments(_RID to instance, _RID to asLodOfInstance)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_INSTANCE_GEOMETRY_SET_AS_INSTANCE_LOD, NIL)
  }

  /**
   * Sets the shadow casting setting to one of [enum ShadowCastingSetting]. Equivalent to [godot.GeometryInstance.castShadow].
   */
  public fun instanceGeometrySetCastShadowsSetting(instance: RID, shadowCastingSetting: Long):
      Unit {
    TransferContext.writeArguments(_RID to instance, LONG to shadowCastingSetting)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_INSTANCE_GEOMETRY_SET_CAST_SHADOWS_SETTING, NIL)
  }

  /**
   * Not implemented in Godot 3.x.
   */
  public fun instanceGeometrySetDrawRange(
    instance: RID,
    min: Double,
    max: Double,
    minMargin: Double,
    maxMargin: Double
  ): Unit {
    TransferContext.writeArguments(_RID to instance, DOUBLE to min, DOUBLE to max, DOUBLE to
        minMargin, DOUBLE to maxMargin)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_INSTANCE_GEOMETRY_SET_DRAW_RANGE, NIL)
  }

  /**
   * Sets the flag for a given [enum InstanceFlags]. See [enum InstanceFlags] for more details.
   */
  public fun instanceGeometrySetFlag(
    instance: RID,
    flag: Long,
    enabled: Boolean
  ): Unit {
    TransferContext.writeArguments(_RID to instance, LONG to flag, BOOL to enabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_INSTANCE_GEOMETRY_SET_FLAG, NIL)
  }

  /**
   * Sets a material that will override the material for all surfaces on the mesh associated with this instance. Equivalent to [godot.GeometryInstance.materialOverride].
   */
  public fun instanceGeometrySetMaterialOverride(instance: RID, material: RID): Unit {
    TransferContext.writeArguments(_RID to instance, _RID to material)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_INSTANCE_GEOMETRY_SET_MATERIAL_OVERRIDE, NIL)
  }

  /**
   * Sets the base of the instance. A base can be any of the 3D objects that are created in the VisualServer that can be displayed. For example, any of the light types, mesh, multimesh, immediate geometry, particle system, reflection probe, lightmap capture, and the GI probe are all types that can be set as the base of an instance in order to be displayed in the scenario.
   */
  public fun instanceSetBase(instance: RID, base: RID): Unit {
    TransferContext.writeArguments(_RID to instance, _RID to base)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_INSTANCE_SET_BASE, NIL)
  }

  /**
   * Sets the weight for a given blend shape associated with this instance.
   */
  public fun instanceSetBlendShapeWeight(
    instance: RID,
    shape: Long,
    weight: Double
  ): Unit {
    TransferContext.writeArguments(_RID to instance, LONG to shape, DOUBLE to weight)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_INSTANCE_SET_BLEND_SHAPE_WEIGHT, NIL)
  }

  /**
   * Sets a custom AABB to use when culling objects from the view frustum. Equivalent to [godot.GeometryInstance.setCustomAabb].
   */
  public fun instanceSetCustomAabb(instance: RID, aabb: AABB): Unit {
    TransferContext.writeArguments(_RID to instance, godot.core.VariantType.AABB to aabb)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_INSTANCE_SET_CUSTOM_AABB, NIL)
  }

  /**
   * Function not implemented in Godot 3.x.
   */
  public fun instanceSetExterior(instance: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to instance, BOOL to enabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_INSTANCE_SET_EXTERIOR,
        NIL)
  }

  /**
   * Sets a margin to increase the size of the AABB when culling objects from the view frustum. This allows you to avoid culling objects that fall outside the view frustum. Equivalent to [godot.GeometryInstance.extraCullMargin].
   */
  public fun instanceSetExtraVisibilityMargin(instance: RID, margin: Double): Unit {
    TransferContext.writeArguments(_RID to instance, DOUBLE to margin)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_INSTANCE_SET_EXTRA_VISIBILITY_MARGIN, NIL)
  }

  /**
   * Sets the render layers that this instance will be drawn to. Equivalent to [godot.VisualInstance.layers].
   */
  public fun instanceSetLayerMask(instance: RID, mask: Long): Unit {
    TransferContext.writeArguments(_RID to instance, LONG to mask)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_INSTANCE_SET_LAYER_MASK, NIL)
  }

  /**
   * Sets the scenario that the instance is in. The scenario is the 3D world that the objects will be displayed in.
   */
  public fun instanceSetScenario(instance: RID, scenario: RID): Unit {
    TransferContext.writeArguments(_RID to instance, _RID to scenario)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_INSTANCE_SET_SCENARIO,
        NIL)
  }

  /**
   * Sets the material of a specific surface. Equivalent to [godot.MeshInstance.setSurfaceMaterial].
   */
  public fun instanceSetSurfaceMaterial(
    instance: RID,
    surface: Long,
    material: RID
  ): Unit {
    TransferContext.writeArguments(_RID to instance, LONG to surface, _RID to material)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_INSTANCE_SET_SURFACE_MATERIAL, NIL)
  }

  /**
   * Sets the world space transform of the instance. Equivalent to [godot.Spatial.transform].
   */
  public fun instanceSetTransform(instance: RID, transform: Transform): Unit {
    TransferContext.writeArguments(_RID to instance, TRANSFORM to transform)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_INSTANCE_SET_TRANSFORM,
        NIL)
  }

  /**
   * Sets the lightmap to use with this instance.
   */
  public fun instanceSetUseLightmap(
    instance: RID,
    lightmapInstance: RID,
    lightmap: RID,
    lightmapSlice: Long = -1,
    lightmapUvRect: Rect2 = Rect2(0.0, 0.0, 1.0, 1.0)
  ): Unit {
    TransferContext.writeArguments(_RID to instance, _RID to lightmapInstance, _RID to lightmap,
        LONG to lightmapSlice, RECT2 to lightmapUvRect)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_INSTANCE_SET_USE_LIGHTMAP, NIL)
  }

  /**
   * Sets whether an instance is drawn or not. Equivalent to [godot.Spatial.visible].
   */
  public fun instanceSetVisible(instance: RID, visible: Boolean): Unit {
    TransferContext.writeArguments(_RID to instance, BOOL to visible)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_INSTANCE_SET_VISIBLE,
        NIL)
  }

  /**
   * Returns an array of object IDs intersecting with the provided AABB. Only visual 3D nodes are considered, such as [godot.MeshInstance] or [godot.DirectionalLight]. Use [@GDScript.instanceFromId] to obtain the actual nodes. A scenario RID must be provided, which is available in the [godot.World] you want to query. This forces an update for all resources queued to update.
   *
   * **Warning:** This function is primarily intended for editor usage. For in-game use cases, prefer physics collision.
   */
  public fun instancesCullAabb(aabb: AABB, scenario: RID = RID()): VariantArray<Any?> {
    TransferContext.writeArguments(godot.core.VariantType.AABB to aabb, _RID to scenario)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_INSTANCES_CULL_AABB,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns an array of object IDs intersecting with the provided convex shape. Only visual 3D nodes are considered, such as [godot.MeshInstance] or [godot.DirectionalLight]. Use [@GDScript.instanceFromId] to obtain the actual nodes. A scenario RID must be provided, which is available in the [godot.World] you want to query. This forces an update for all resources queued to update.
   *
   * **Warning:** This function is primarily intended for editor usage. For in-game use cases, prefer physics collision.
   */
  public fun instancesCullConvex(convex: VariantArray<Any?>, scenario: RID = RID()):
      VariantArray<Any?> {
    TransferContext.writeArguments(ARRAY to convex, _RID to scenario)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_INSTANCES_CULL_CONVEX,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns an array of object IDs intersecting with the provided 3D ray. Only visual 3D nodes are considered, such as [godot.MeshInstance] or [godot.DirectionalLight]. Use [@GDScript.instanceFromId] to obtain the actual nodes. A scenario RID must be provided, which is available in the [godot.World] you want to query. This forces an update for all resources queued to update.
   *
   * **Warning:** This function is primarily intended for editor usage. For in-game use cases, prefer physics collision.
   */
  public fun instancesCullRay(
    from: Vector3,
    to: Vector3,
    scenario: RID = RID()
  ): VariantArray<Any?> {
    TransferContext.writeArguments(VECTOR3 to from, VECTOR3 to to, _RID to scenario)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_INSTANCES_CULL_RAY,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * If `true`, this directional light will blend between shadow map splits resulting in a smoother transition between them. Equivalent to [godot.DirectionalLight.directionalShadowBlendSplits].
   */
  public fun lightDirectionalSetBlendSplits(light: RID, enable: Boolean): Unit {
    TransferContext.writeArguments(_RID to light, BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_LIGHT_DIRECTIONAL_SET_BLEND_SPLITS, NIL)
  }

  /**
   * Sets the shadow depth range mode for this directional light. Equivalent to [godot.DirectionalLight.directionalShadowDepthRange]. See [enum LightDirectionalShadowDepthRangeMode] for options.
   */
  public fun lightDirectionalSetShadowDepthRangeMode(light: RID, rangeMode: Long): Unit {
    TransferContext.writeArguments(_RID to light, LONG to rangeMode)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_LIGHT_DIRECTIONAL_SET_SHADOW_DEPTH_RANGE_MODE, NIL)
  }

  /**
   * Sets the shadow mode for this directional light. Equivalent to [godot.DirectionalLight.directionalShadowMode]. See [enum LightDirectionalShadowMode] for options.
   */
  public fun lightDirectionalSetShadowMode(light: RID, mode: Long): Unit {
    TransferContext.writeArguments(_RID to light, LONG to mode)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_LIGHT_DIRECTIONAL_SET_SHADOW_MODE, NIL)
  }

  /**
   * Sets whether to use vertical or horizontal detail for this omni light. This can be used to alleviate artifacts in the shadow map. Equivalent to [godot.OmniLight.omniShadowDetail].
   */
  public fun lightOmniSetShadowDetail(light: RID, detail: Long): Unit {
    TransferContext.writeArguments(_RID to light, LONG to detail)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_LIGHT_OMNI_SET_SHADOW_DETAIL, NIL)
  }

  /**
   * Sets whether to use a dual paraboloid or a cubemap for the shadow map. Dual paraboloid is faster but may suffer from artifacts. Equivalent to [godot.OmniLight.omniShadowMode].
   */
  public fun lightOmniSetShadowMode(light: RID, mode: Long): Unit {
    TransferContext.writeArguments(_RID to light, LONG to mode)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_LIGHT_OMNI_SET_SHADOW_MODE, NIL)
  }

  /**
   * Sets the bake mode for this light, see [enum LightBakeMode] for options. The bake mode affects how the light will be baked in [godot.BakedLightmap]s and [godot.GIProbe]s.
   */
  public fun lightSetBakeMode(light: RID, bakeMode: Long): Unit {
    TransferContext.writeArguments(_RID to light, LONG to bakeMode)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_LIGHT_SET_BAKE_MODE,
        NIL)
  }

  /**
   * Sets the color of the light. Equivalent to [godot.Light.lightColor].
   */
  public fun lightSetColor(light: RID, color: Color): Unit {
    TransferContext.writeArguments(_RID to light, COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_LIGHT_SET_COLOR, NIL)
  }

  /**
   * Sets the cull mask for this Light. Lights only affect objects in the selected layers. Equivalent to [godot.Light.lightCullMask].
   */
  public fun lightSetCullMask(light: RID, mask: Long): Unit {
    TransferContext.writeArguments(_RID to light, LONG to mask)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_LIGHT_SET_CULL_MASK,
        NIL)
  }

  /**
   * If `true`, light will subtract light instead of adding light. Equivalent to [godot.Light.lightNegative].
   */
  public fun lightSetNegative(light: RID, enable: Boolean): Unit {
    TransferContext.writeArguments(_RID to light, BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_LIGHT_SET_NEGATIVE,
        NIL)
  }

  /**
   * Sets the specified light parameter. See [enum LightParam] for options. Equivalent to [godot.Light.setParam].
   */
  public fun lightSetParam(
    light: RID,
    `param`: Long,
    `value`: Double
  ): Unit {
    TransferContext.writeArguments(_RID to light, LONG to param, DOUBLE to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_LIGHT_SET_PARAM, NIL)
  }

  /**
   * Not implemented in Godot 3.x.
   */
  public fun lightSetProjector(light: RID, texture: RID): Unit {
    TransferContext.writeArguments(_RID to light, _RID to texture)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_LIGHT_SET_PROJECTOR,
        NIL)
  }

  /**
   * If `true`, reverses the backface culling of the mesh. This can be useful when you have a flat mesh that has a light behind it. If you need to cast a shadow on both sides of the mesh, set the mesh to use double sided shadows with [instanceGeometrySetCastShadowsSetting]. Equivalent to [godot.Light.shadowReverseCullFace].
   */
  public fun lightSetReverseCullFaceMode(light: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to light, BOOL to enabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_LIGHT_SET_REVERSE_CULL_FACE_MODE, NIL)
  }

  /**
   * If `true`, light will cast shadows. Equivalent to [godot.Light.shadowEnabled].
   */
  public fun lightSetShadow(light: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to light, BOOL to enabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_LIGHT_SET_SHADOW, NIL)
  }

  /**
   * Sets the color of the shadow cast by the light. Equivalent to [godot.Light.shadowColor].
   */
  public fun lightSetShadowColor(light: RID, color: Color): Unit {
    TransferContext.writeArguments(_RID to light, COLOR to color)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_LIGHT_SET_SHADOW_COLOR,
        NIL)
  }

  /**
   * Sets whether GI probes capture light information from this light. *Deprecated method.* Use [lightSetBakeMode] instead. This method is only kept for compatibility reasons and calls [lightSetBakeMode] internally, setting the bake mode to [LIGHT_BAKE_DISABLED] or [LIGHT_BAKE_INDIRECT] depending on the given parameter.
   */
  public fun lightSetUseGi(light: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to light, BOOL to enabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_LIGHT_SET_USE_GI, NIL)
  }

  /**
   * Creates a lightmap capture and adds it to the VisualServer. It can be accessed with the RID that is returned. This RID will be used in all `lightmap_capture_*` VisualServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the VisualServer's [freeRid] static method.
   *
   * To place in a scene, attach this lightmap capture to an instance using [instanceSetBase] using the returned RID.
   */
  public fun lightmapCaptureCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_LIGHTMAP_CAPTURE_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Returns the size of the lightmap capture area.
   */
  public fun lightmapCaptureGetBounds(capture: RID): AABB {
    TransferContext.writeArguments(_RID to capture)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_LIGHTMAP_CAPTURE_GET_BOUNDS,
        godot.core.VariantType.AABB)
    return TransferContext.readReturnValue(godot.core.VariantType.AABB, false) as AABB
  }

  /**
   * Returns the energy multiplier used by the lightmap capture.
   */
  public fun lightmapCaptureGetEnergy(capture: RID): Double {
    TransferContext.writeArguments(_RID to capture)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_LIGHTMAP_CAPTURE_GET_ENERGY, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the octree used by the lightmap capture.
   */
  public fun lightmapCaptureGetOctree(capture: RID): PoolByteArray {
    TransferContext.writeArguments(_RID to capture)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_LIGHTMAP_CAPTURE_GET_OCTREE, POOL_BYTE_ARRAY)
    return TransferContext.readReturnValue(POOL_BYTE_ARRAY, false) as PoolByteArray
  }

  /**
   * Returns the cell subdivision amount used by this lightmap capture's octree.
   */
  public fun lightmapCaptureGetOctreeCellSubdiv(capture: RID): Long {
    TransferContext.writeArguments(_RID to capture)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_LIGHTMAP_CAPTURE_GET_OCTREE_CELL_SUBDIV, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the cell transform for this lightmap capture's octree.
   */
  public fun lightmapCaptureGetOctreeCellTransform(capture: RID): Transform {
    TransferContext.writeArguments(_RID to capture)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_LIGHTMAP_CAPTURE_GET_OCTREE_CELL_TRANSFORM, TRANSFORM)
    return TransferContext.readReturnValue(TRANSFORM, false) as Transform
  }

  /**
   * Returns `true` if capture is in "interior" mode.
   */
  public fun lightmapCaptureIsInterior(capture: RID): Boolean {
    TransferContext.writeArguments(_RID to capture)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_LIGHTMAP_CAPTURE_IS_INTERIOR, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sets the size of the area covered by the lightmap capture. Equivalent to [godot.BakedLightmapData.bounds].
   */
  public fun lightmapCaptureSetBounds(capture: RID, bounds: AABB): Unit {
    TransferContext.writeArguments(_RID to capture, godot.core.VariantType.AABB to bounds)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_LIGHTMAP_CAPTURE_SET_BOUNDS, NIL)
  }

  /**
   * Sets the energy multiplier for this lightmap capture. Equivalent to [godot.BakedLightmapData.energy].
   */
  public fun lightmapCaptureSetEnergy(capture: RID, energy: Double): Unit {
    TransferContext.writeArguments(_RID to capture, DOUBLE to energy)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_LIGHTMAP_CAPTURE_SET_ENERGY, NIL)
  }

  /**
   * Sets the "interior" mode for this lightmap capture. Equivalent to [godot.BakedLightmapData.interior].
   */
  public fun lightmapCaptureSetInterior(capture: RID, interior: Boolean): Unit {
    TransferContext.writeArguments(_RID to capture, BOOL to interior)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_LIGHTMAP_CAPTURE_SET_INTERIOR, NIL)
  }

  /**
   * Sets the octree to be used by this lightmap capture. This function is normally used by the [godot.BakedLightmap] node. Equivalent to [godot.BakedLightmapData.octree].
   */
  public fun lightmapCaptureSetOctree(capture: RID, octree: PoolByteArray): Unit {
    TransferContext.writeArguments(_RID to capture, POOL_BYTE_ARRAY to octree)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_LIGHTMAP_CAPTURE_SET_OCTREE, NIL)
  }

  /**
   * Sets the subdivision level of this lightmap capture's octree. Equivalent to [godot.BakedLightmapData.cellSubdiv].
   */
  public fun lightmapCaptureSetOctreeCellSubdiv(capture: RID, subdiv: Long): Unit {
    TransferContext.writeArguments(_RID to capture, LONG to subdiv)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_LIGHTMAP_CAPTURE_SET_OCTREE_CELL_SUBDIV, NIL)
  }

  /**
   * Sets the octree cell transform for this lightmap capture's octree. Equivalent to [godot.BakedLightmapData.cellSpaceTransform].
   */
  public fun lightmapCaptureSetOctreeCellTransform(capture: RID, xform: Transform): Unit {
    TransferContext.writeArguments(_RID to capture, TRANSFORM to xform)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_LIGHTMAP_CAPTURE_SET_OCTREE_CELL_TRANSFORM, NIL)
  }

  /**
   * Returns a mesh of a sphere with the given amount of horizontal and vertical subdivisions.
   */
  public fun makeSphereMesh(
    latitudes: Long,
    longitudes: Long,
    radius: Double
  ): RID {
    TransferContext.writeArguments(LONG to latitudes, LONG to longitudes, DOUBLE to radius)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MAKE_SPHERE_MESH, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Creates an empty material and adds it to the VisualServer. It can be accessed with the RID that is returned. This RID will be used in all `material_*` VisualServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the VisualServer's [freeRid] static method.
   */
  public fun materialCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MATERIAL_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Returns the value of a certain material's parameter.
   */
  public fun materialGetParam(material: RID, parameter: String): Any? {
    TransferContext.writeArguments(_RID to material, STRING to parameter)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MATERIAL_GET_PARAM,
        ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Returns the default value for the param if available. Otherwise returns an empty [Variant].
   */
  public fun materialGetParamDefault(material: RID, parameter: String): Any? {
    TransferContext.writeArguments(_RID to material, STRING to parameter)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MATERIAL_GET_PARAM_DEFAULT, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Returns the shader of a certain material's shader. Returns an empty RID if the material doesn't have a shader.
   */
  public fun materialGetShader(shaderMaterial: RID): RID {
    TransferContext.writeArguments(_RID to shaderMaterial)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MATERIAL_GET_SHADER,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Sets a material's line width.
   */
  public fun materialSetLineWidth(material: RID, width: Double): Unit {
    TransferContext.writeArguments(_RID to material, DOUBLE to width)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MATERIAL_SET_LINE_WIDTH, NIL)
  }

  /**
   * Sets an object's next material.
   */
  public fun materialSetNextPass(material: RID, nextMaterial: RID): Unit {
    TransferContext.writeArguments(_RID to material, _RID to nextMaterial)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MATERIAL_SET_NEXT_PASS,
        NIL)
  }

  /**
   * Sets a material's parameter.
   */
  public fun materialSetParam(
    material: RID,
    parameter: String,
    `value`: Any?
  ): Unit {
    TransferContext.writeArguments(_RID to material, STRING to parameter, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MATERIAL_SET_PARAM,
        NIL)
  }

  /**
   * Sets a material's render priority.
   */
  public fun materialSetRenderPriority(material: RID, priority: Long): Unit {
    TransferContext.writeArguments(_RID to material, LONG to priority)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MATERIAL_SET_RENDER_PRIORITY, NIL)
  }

  /**
   * Sets a shader material's shader.
   */
  public fun materialSetShader(shaderMaterial: RID, shader: RID): Unit {
    TransferContext.writeArguments(_RID to shaderMaterial, _RID to shader)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MATERIAL_SET_SHADER,
        NIL)
  }

  /**
   * Adds a surface generated from the Arrays to a mesh. See [enum PrimitiveType] constants for types.
   */
  public fun meshAddSurfaceFromArrays(
    mesh: RID,
    primitive: Long,
    arrays: VariantArray<Any?>,
    blendShapes: VariantArray<Any?> = VariantArray(),
    compressFormat: Long = 2194432
  ): Unit {
    TransferContext.writeArguments(_RID to mesh, LONG to primitive, ARRAY to arrays, ARRAY to
        blendShapes, LONG to compressFormat)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MESH_ADD_SURFACE_FROM_ARRAYS, NIL)
  }

  /**
   * Removes all surfaces from a mesh.
   */
  public fun meshClear(mesh: RID): Unit {
    TransferContext.writeArguments(_RID to mesh)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MESH_CLEAR, NIL)
  }

  /**
   * Creates a new mesh and adds it to the VisualServer. It can be accessed with the RID that is returned. This RID will be used in all `mesh_*` VisualServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the VisualServer's [freeRid] static method.
   *
   * To place in a scene, attach this mesh to an instance using [instanceSetBase] using the returned RID.
   */
  public fun meshCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MESH_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Returns a mesh's blend shape count.
   */
  public fun meshGetBlendShapeCount(mesh: RID): Long {
    TransferContext.writeArguments(_RID to mesh)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MESH_GET_BLEND_SHAPE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns a mesh's blend shape mode.
   */
  public fun meshGetBlendShapeMode(mesh: RID): VisualServer.BlendShapeMode {
    TransferContext.writeArguments(_RID to mesh)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MESH_GET_BLEND_SHAPE_MODE, LONG)
    return VisualServer.BlendShapeMode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns a mesh's custom aabb.
   */
  public fun meshGetCustomAabb(mesh: RID): AABB {
    TransferContext.writeArguments(_RID to mesh)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MESH_GET_CUSTOM_AABB,
        godot.core.VariantType.AABB)
    return TransferContext.readReturnValue(godot.core.VariantType.AABB, false) as AABB
  }

  /**
   * Returns a mesh's number of surfaces.
   */
  public fun meshGetSurfaceCount(mesh: RID): Long {
    TransferContext.writeArguments(_RID to mesh)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MESH_GET_SURFACE_COUNT,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Removes a mesh's surface.
   */
  public fun meshRemoveSurface(mesh: RID, index: Long): Unit {
    TransferContext.writeArguments(_RID to mesh, LONG to index)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MESH_REMOVE_SURFACE,
        NIL)
  }

  /**
   * Sets a mesh's blend shape count.
   */
  public fun meshSetBlendShapeCount(mesh: RID, amount: Long): Unit {
    TransferContext.writeArguments(_RID to mesh, LONG to amount)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MESH_SET_BLEND_SHAPE_COUNT, NIL)
  }

  /**
   * Sets a mesh's blend shape mode.
   */
  public fun meshSetBlendShapeMode(mesh: RID, mode: Long): Unit {
    TransferContext.writeArguments(_RID to mesh, LONG to mode)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MESH_SET_BLEND_SHAPE_MODE, NIL)
  }

  /**
   * Sets a mesh's custom aabb.
   */
  public fun meshSetCustomAabb(mesh: RID, aabb: AABB): Unit {
    TransferContext.writeArguments(_RID to mesh, godot.core.VariantType.AABB to aabb)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MESH_SET_CUSTOM_AABB,
        NIL)
  }

  /**
   * Returns a mesh's surface's aabb.
   */
  public fun meshSurfaceGetAabb(mesh: RID, surface: Long): AABB {
    TransferContext.writeArguments(_RID to mesh, LONG to surface)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MESH_SURFACE_GET_AABB,
        godot.core.VariantType.AABB)
    return TransferContext.readReturnValue(godot.core.VariantType.AABB, false) as AABB
  }

  /**
   * Returns a mesh's surface's vertex buffer.
   */
  public fun meshSurfaceGetArray(mesh: RID, surface: Long): PoolByteArray {
    TransferContext.writeArguments(_RID to mesh, LONG to surface)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MESH_SURFACE_GET_ARRAY,
        POOL_BYTE_ARRAY)
    return TransferContext.readReturnValue(POOL_BYTE_ARRAY, false) as PoolByteArray
  }

  /**
   * Returns a mesh's surface's amount of indices.
   */
  public fun meshSurfaceGetArrayIndexLen(mesh: RID, surface: Long): Long {
    TransferContext.writeArguments(_RID to mesh, LONG to surface)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MESH_SURFACE_GET_ARRAY_INDEX_LEN, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns a mesh's surface's amount of vertices.
   */
  public fun meshSurfaceGetArrayLen(mesh: RID, surface: Long): Long {
    TransferContext.writeArguments(_RID to mesh, LONG to surface)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MESH_SURFACE_GET_ARRAY_LEN, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns a mesh's surface's buffer arrays.
   */
  public fun meshSurfaceGetArrays(mesh: RID, surface: Long): VariantArray<Any?> {
    TransferContext.writeArguments(_RID to mesh, LONG to surface)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MESH_SURFACE_GET_ARRAYS, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns a mesh's surface's arrays for blend shapes.
   */
  public fun meshSurfaceGetBlendShapeArrays(mesh: RID, surface: Long): VariantArray<Any?> {
    TransferContext.writeArguments(_RID to mesh, LONG to surface)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MESH_SURFACE_GET_BLEND_SHAPE_ARRAYS, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns the format of a mesh's surface.
   */
  public fun meshSurfaceGetFormat(mesh: RID, surface: Long): Long {
    TransferContext.writeArguments(_RID to mesh, LONG to surface)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MESH_SURFACE_GET_FORMAT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Function is unused in Godot 3.x.
   */
  public fun meshSurfaceGetFormatOffset(
    format: Long,
    vertexLen: Long,
    indexLen: Long,
    arrayIndex: Long
  ): Long {
    TransferContext.writeArguments(LONG to format, LONG to vertexLen, LONG to indexLen, LONG to
        arrayIndex)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MESH_SURFACE_GET_FORMAT_OFFSET, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   *
   */
  public fun meshSurfaceGetFormatStride(
    format: Long,
    vertexLen: Long,
    indexLen: Long,
    arrayIndex: Long
  ): Long {
    TransferContext.writeArguments(LONG to format, LONG to vertexLen, LONG to indexLen, LONG to
        arrayIndex)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MESH_SURFACE_GET_FORMAT_STRIDE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns a mesh's surface's index buffer.
   */
  public fun meshSurfaceGetIndexArray(mesh: RID, surface: Long): PoolByteArray {
    TransferContext.writeArguments(_RID to mesh, LONG to surface)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MESH_SURFACE_GET_INDEX_ARRAY, POOL_BYTE_ARRAY)
    return TransferContext.readReturnValue(POOL_BYTE_ARRAY, false) as PoolByteArray
  }

  /**
   * Returns a mesh's surface's material.
   */
  public fun meshSurfaceGetMaterial(mesh: RID, surface: Long): RID {
    TransferContext.writeArguments(_RID to mesh, LONG to surface)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MESH_SURFACE_GET_MATERIAL, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Returns the primitive type of a mesh's surface.
   */
  public fun meshSurfaceGetPrimitiveType(mesh: RID, surface: Long): VisualServer.PrimitiveType {
    TransferContext.writeArguments(_RID to mesh, LONG to surface)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MESH_SURFACE_GET_PRIMITIVE_TYPE, LONG)
    return VisualServer.PrimitiveType.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns the aabb of a mesh's surface's skeleton.
   */
  public fun meshSurfaceGetSkeletonAabb(mesh: RID, surface: Long): VariantArray<Any?> {
    TransferContext.writeArguments(_RID to mesh, LONG to surface)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MESH_SURFACE_GET_SKELETON_AABB, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Sets a mesh's surface's material.
   */
  public fun meshSurfaceSetMaterial(
    mesh: RID,
    surface: Long,
    material: RID
  ): Unit {
    TransferContext.writeArguments(_RID to mesh, LONG to surface, _RID to material)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MESH_SURFACE_SET_MATERIAL, NIL)
  }

  /**
   * Updates a specific region of a vertex buffer for the specified surface. Warning: this function alters the vertex buffer directly with no safety mechanisms, you can easily corrupt your mesh.
   */
  public fun meshSurfaceUpdateRegion(
    mesh: RID,
    surface: Long,
    offset: Long,
    `data`: PoolByteArray
  ): Unit {
    TransferContext.writeArguments(_RID to mesh, LONG to surface, LONG to offset, POOL_BYTE_ARRAY to
        data)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MESH_SURFACE_UPDATE_REGION, NIL)
  }

  /**
   * Allocates space for the multimesh data. Format parameters determine how the data will be stored by OpenGL. See [enum MultimeshTransformFormat], [enum MultimeshColorFormat], and [enum MultimeshCustomDataFormat] for usage. Equivalent to [godot.MultiMesh.instanceCount].
   */
  public fun multimeshAllocate(
    multimesh: RID,
    instances: Long,
    transformFormat: Long,
    colorFormat: Long,
    customDataFormat: Long = 0
  ): Unit {
    TransferContext.writeArguments(_RID to multimesh, LONG to instances, LONG to transformFormat,
        LONG to colorFormat, LONG to customDataFormat)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MULTIMESH_ALLOCATE,
        NIL)
  }

  /**
   * Creates a new multimesh on the VisualServer and returns an [RID] handle. This RID will be used in all `multimesh_*` VisualServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the VisualServer's [freeRid] static method.
   *
   * To place in a scene, attach this multimesh to an instance using [instanceSetBase] using the returned RID.
   */
  public fun multimeshCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MULTIMESH_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Calculates and returns the axis-aligned bounding box that encloses all instances within the multimesh.
   */
  public fun multimeshGetAabb(multimesh: RID): AABB {
    TransferContext.writeArguments(_RID to multimesh)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MULTIMESH_GET_AABB,
        godot.core.VariantType.AABB)
    return TransferContext.readReturnValue(godot.core.VariantType.AABB, false) as AABB
  }

  /**
   * Returns the number of instances allocated for this multimesh.
   */
  public fun multimeshGetInstanceCount(multimesh: RID): Long {
    TransferContext.writeArguments(_RID to multimesh)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MULTIMESH_GET_INSTANCE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the RID of the mesh that will be used in drawing this multimesh.
   */
  public fun multimeshGetMesh(multimesh: RID): RID {
    TransferContext.writeArguments(_RID to multimesh)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MULTIMESH_GET_MESH,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Returns the number of visible instances for this multimesh.
   */
  public fun multimeshGetVisibleInstances(multimesh: RID): Long {
    TransferContext.writeArguments(_RID to multimesh)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MULTIMESH_GET_VISIBLE_INSTANCES, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the color by which the specified instance will be modulated.
   */
  public fun multimeshInstanceGetColor(multimesh: RID, index: Long): Color {
    TransferContext.writeArguments(_RID to multimesh, LONG to index)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MULTIMESH_INSTANCE_GET_COLOR, COLOR)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  /**
   * Returns the custom data associated with the specified instance.
   */
  public fun multimeshInstanceGetCustomData(multimesh: RID, index: Long): Color {
    TransferContext.writeArguments(_RID to multimesh, LONG to index)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MULTIMESH_INSTANCE_GET_CUSTOM_DATA, COLOR)
    return TransferContext.readReturnValue(COLOR, false) as Color
  }

  /**
   * Returns the [godot.core.Transform] of the specified instance.
   */
  public fun multimeshInstanceGetTransform(multimesh: RID, index: Long): Transform {
    TransferContext.writeArguments(_RID to multimesh, LONG to index)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MULTIMESH_INSTANCE_GET_TRANSFORM, TRANSFORM)
    return TransferContext.readReturnValue(TRANSFORM, false) as Transform
  }

  /**
   * Returns the [godot.core.Transform2D] of the specified instance. For use when the multimesh is set to use 2D transforms.
   */
  public fun multimeshInstanceGetTransform2d(multimesh: RID, index: Long): Transform2D {
    TransferContext.writeArguments(_RID to multimesh, LONG to index)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MULTIMESH_INSTANCE_GET_TRANSFORM_2D, TRANSFORM2D)
    return TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D
  }

  /**
   * Sets the color by which this instance will be modulated. Equivalent to [godot.MultiMesh.setInstanceColor].
   */
  public fun multimeshInstanceSetColor(
    multimesh: RID,
    index: Long,
    color: Color
  ): Unit {
    TransferContext.writeArguments(_RID to multimesh, LONG to index, COLOR to color)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MULTIMESH_INSTANCE_SET_COLOR, NIL)
  }

  /**
   * Sets the custom data for this instance. Custom data is passed as a [godot.core.Color], but is interpreted as a `vec4` in the shader. Equivalent to [godot.MultiMesh.setInstanceCustomData].
   */
  public fun multimeshInstanceSetCustomData(
    multimesh: RID,
    index: Long,
    customData: Color
  ): Unit {
    TransferContext.writeArguments(_RID to multimesh, LONG to index, COLOR to customData)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MULTIMESH_INSTANCE_SET_CUSTOM_DATA, NIL)
  }

  /**
   * Sets the [godot.core.Transform] for this instance. Equivalent to [godot.MultiMesh.setInstanceTransform].
   */
  public fun multimeshInstanceSetTransform(
    multimesh: RID,
    index: Long,
    transform: Transform
  ): Unit {
    TransferContext.writeArguments(_RID to multimesh, LONG to index, TRANSFORM to transform)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MULTIMESH_INSTANCE_SET_TRANSFORM, NIL)
  }

  /**
   * Sets the [godot.core.Transform2D] for this instance. For use when multimesh is used in 2D. Equivalent to [godot.MultiMesh.setInstanceTransform2d].
   */
  public fun multimeshInstanceSetTransform2d(
    multimesh: RID,
    index: Long,
    transform: Transform2D
  ): Unit {
    TransferContext.writeArguments(_RID to multimesh, LONG to index, TRANSFORM2D to transform)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MULTIMESH_INSTANCE_SET_TRANSFORM_2D, NIL)
  }

  /**
   * Sets all data related to the instances in one go. This is especially useful when loading the data from disk or preparing the data from GDNative.
   *
   *
   *
   * All data is packed in one large float array. An array may look like this: Transform for instance 1, color data for instance 1, custom data for instance 1, transform for instance 2, color data for instance 2, etc.
   *
   *
   *
   * [godot.core.Transform] is stored as 12 floats, [godot.core.Transform2D] is stored as 8 floats, `COLOR_8BIT` / `CUSTOM_DATA_8BIT` is stored as 1 float (4 bytes as is) and `COLOR_FLOAT` / `CUSTOM_DATA_FLOAT` is stored as 4 floats.
   */
  public fun multimeshSetAsBulkArray(multimesh: RID, array: PoolRealArray): Unit {
    TransferContext.writeArguments(_RID to multimesh, POOL_REAL_ARRAY to array)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MULTIMESH_SET_AS_BULK_ARRAY, NIL)
  }

  /**
   * Sets the mesh to be drawn by the multimesh. Equivalent to [godot.MultiMesh.mesh].
   */
  public fun multimeshSetMesh(multimesh: RID, mesh: RID): Unit {
    TransferContext.writeArguments(_RID to multimesh, _RID to mesh)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MULTIMESH_SET_MESH,
        NIL)
  }

  /**
   * Sets the number of instances visible at a given time. If -1, all instances that have been allocated are drawn. Equivalent to [godot.MultiMesh.visibleInstanceCount].
   */
  public fun multimeshSetVisibleInstances(multimesh: RID, visible: Long): Unit {
    TransferContext.writeArguments(_RID to multimesh, LONG to visible)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_MULTIMESH_SET_VISIBLE_INSTANCES, NIL)
  }

  /**
   * Creates a new omni light and adds it to the VisualServer. It can be accessed with the RID that is returned. This RID can be used in most `light_*` VisualServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the VisualServer's [freeRid] static method.
   *
   * To place in a scene, attach this omni light to an instance using [instanceSetBase] using the returned RID.
   */
  public fun omniLightCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_OMNI_LIGHT_CREATE,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Creates a particle system and adds it to the VisualServer. It can be accessed with the RID that is returned. This RID will be used in all `particles_*` VisualServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the VisualServer's [freeRid] static method.
   *
   * To place in a scene, attach these particles to an instance using [instanceSetBase] using the returned RID.
   */
  public fun particlesCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_PARTICLES_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Calculates and returns the axis-aligned bounding box that contains all the particles. Equivalent to [godot.Particles.captureAabb].
   */
  public fun particlesGetCurrentAabb(particles: RID): AABB {
    TransferContext.writeArguments(_RID to particles)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_PARTICLES_GET_CURRENT_AABB,
        godot.core.VariantType.AABB)
    return TransferContext.readReturnValue(godot.core.VariantType.AABB, false) as AABB
  }

  /**
   * Returns `true` if particles are currently set to emitting.
   */
  public fun particlesGetEmitting(particles: RID): Boolean {
    TransferContext.writeArguments(_RID to particles)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_PARTICLES_GET_EMITTING,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if particles are not emitting and particles are set to inactive.
   */
  public fun particlesIsInactive(particles: RID): Boolean {
    TransferContext.writeArguments(_RID to particles)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_PARTICLES_IS_INACTIVE,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Add particle system to list of particle systems that need to be updated. Update will take place on the next frame, or on the next call to [instancesCullAabb], [instancesCullConvex], or [instancesCullRay].
   */
  public fun particlesRequestProcess(particles: RID): Unit {
    TransferContext.writeArguments(_RID to particles)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_PARTICLES_REQUEST_PROCESS, NIL)
  }

  /**
   * Reset the particles on the next update. Equivalent to [godot.Particles.restart].
   */
  public fun particlesRestart(particles: RID): Unit {
    TransferContext.writeArguments(_RID to particles)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_PARTICLES_RESTART, NIL)
  }

  /**
   * Sets the number of particles to be drawn and allocates the memory for them. Equivalent to [godot.Particles.amount].
   */
  public fun particlesSetAmount(particles: RID, amount: Long): Unit {
    TransferContext.writeArguments(_RID to particles, LONG to amount)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_PARTICLES_SET_AMOUNT,
        NIL)
  }

  /**
   * Sets a custom axis-aligned bounding box for the particle system. Equivalent to [godot.Particles.visibilityAabb].
   */
  public fun particlesSetCustomAabb(particles: RID, aabb: AABB): Unit {
    TransferContext.writeArguments(_RID to particles, godot.core.VariantType.AABB to aabb)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_PARTICLES_SET_CUSTOM_AABB, NIL)
  }

  /**
   * Sets the draw order of the particles to one of the named enums from [enum ParticlesDrawOrder]. See [enum ParticlesDrawOrder] for options. Equivalent to [godot.Particles.drawOrder].
   */
  public fun particlesSetDrawOrder(particles: RID, order: Long): Unit {
    TransferContext.writeArguments(_RID to particles, LONG to order)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_PARTICLES_SET_DRAW_ORDER, NIL)
  }

  /**
   * Sets the mesh to be used for the specified draw pass. Equivalent to [godot.Particles.drawPass1], [godot.Particles.drawPass2], [godot.Particles.drawPass3], and [godot.Particles.drawPass4].
   */
  public fun particlesSetDrawPassMesh(
    particles: RID,
    pass: Long,
    mesh: RID
  ): Unit {
    TransferContext.writeArguments(_RID to particles, LONG to pass, _RID to mesh)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_PARTICLES_SET_DRAW_PASS_MESH, NIL)
  }

  /**
   * Sets the number of draw passes to use. Equivalent to [godot.Particles.drawPasses].
   */
  public fun particlesSetDrawPasses(particles: RID, count: Long): Unit {
    TransferContext.writeArguments(_RID to particles, LONG to count)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_PARTICLES_SET_DRAW_PASSES, NIL)
  }

  /**
   * Sets the [godot.core.Transform] that will be used by the particles when they first emit.
   */
  public fun particlesSetEmissionTransform(particles: RID, transform: Transform): Unit {
    TransferContext.writeArguments(_RID to particles, TRANSFORM to transform)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_PARTICLES_SET_EMISSION_TRANSFORM, NIL)
  }

  /**
   * If `true`, particles will emit over time. Setting to false does not reset the particles, but only stops their emission. Equivalent to [godot.Particles.emitting].
   */
  public fun particlesSetEmitting(particles: RID, emitting: Boolean): Unit {
    TransferContext.writeArguments(_RID to particles, BOOL to emitting)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_PARTICLES_SET_EMITTING,
        NIL)
  }

  /**
   * Sets the explosiveness ratio. Equivalent to [godot.Particles.explosiveness].
   */
  public fun particlesSetExplosivenessRatio(particles: RID, ratio: Double): Unit {
    TransferContext.writeArguments(_RID to particles, DOUBLE to ratio)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_PARTICLES_SET_EXPLOSIVENESS_RATIO, NIL)
  }

  /**
   * Sets the frame rate that the particle system rendering will be fixed to. Equivalent to [godot.Particles.fixedFps].
   */
  public fun particlesSetFixedFps(particles: RID, fps: Long): Unit {
    TransferContext.writeArguments(_RID to particles, LONG to fps)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_PARTICLES_SET_FIXED_FPS, NIL)
  }

  /**
   * If `true`, uses fractional delta which smooths the movement of the particles. Equivalent to [godot.Particles.fractDelta].
   */
  public fun particlesSetFractionalDelta(particles: RID, enable: Boolean): Unit {
    TransferContext.writeArguments(_RID to particles, BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_PARTICLES_SET_FRACTIONAL_DELTA, NIL)
  }

  /**
   * Sets the lifetime of each particle in the system. Equivalent to [godot.Particles.lifetime].
   */
  public fun particlesSetLifetime(particles: RID, lifetime: Double): Unit {
    TransferContext.writeArguments(_RID to particles, DOUBLE to lifetime)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_PARTICLES_SET_LIFETIME,
        NIL)
  }

  /**
   * If `true`, particles will emit once and then stop. Equivalent to [godot.Particles.oneShot].
   */
  public fun particlesSetOneShot(particles: RID, oneShot: Boolean): Unit {
    TransferContext.writeArguments(_RID to particles, BOOL to oneShot)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_PARTICLES_SET_ONE_SHOT,
        NIL)
  }

  /**
   * Sets the preprocess time for the particles' animation. This lets you delay starting an animation until after the particles have begun emitting. Equivalent to [godot.Particles.preprocess].
   */
  public fun particlesSetPreProcessTime(particles: RID, time: Double): Unit {
    TransferContext.writeArguments(_RID to particles, DOUBLE to time)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_PARTICLES_SET_PRE_PROCESS_TIME, NIL)
  }

  /**
   * Sets the material for processing the particles.
   *
   * **Note:** This is not the material used to draw the materials. Equivalent to [godot.Particles.processMaterial].
   */
  public fun particlesSetProcessMaterial(particles: RID, material: RID): Unit {
    TransferContext.writeArguments(_RID to particles, _RID to material)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_PARTICLES_SET_PROCESS_MATERIAL, NIL)
  }

  /**
   * Sets the emission randomness ratio. This randomizes the emission of particles within their phase. Equivalent to [godot.Particles.randomness].
   */
  public fun particlesSetRandomnessRatio(particles: RID, ratio: Double): Unit {
    TransferContext.writeArguments(_RID to particles, DOUBLE to ratio)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_PARTICLES_SET_RANDOMNESS_RATIO, NIL)
  }

  /**
   * Sets the speed scale of the particle system. Equivalent to [godot.Particles.speedScale].
   */
  public fun particlesSetSpeedScale(particles: RID, scale: Double): Unit {
    TransferContext.writeArguments(_RID to particles, DOUBLE to scale)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_PARTICLES_SET_SPEED_SCALE, NIL)
  }

  /**
   * If `true`, particles use local coordinates. If `false` they use global coordinates. Equivalent to [godot.Particles.localCoords].
   */
  public fun particlesSetUseLocalCoordinates(particles: RID, enable: Boolean): Unit {
    TransferContext.writeArguments(_RID to particles, BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_PARTICLES_SET_USE_LOCAL_COORDINATES, NIL)
  }

  /**
   * Creates a reflection probe and adds it to the VisualServer. It can be accessed with the RID that is returned. This RID will be used in all `reflection_probe_*` VisualServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the VisualServer's [freeRid] static method.
   *
   * To place in a scene, attach this reflection probe to an instance using [instanceSetBase] using the returned RID.
   */
  public fun reflectionProbeCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_REFLECTION_PROBE_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * If `true`, reflections will ignore sky contribution. Equivalent to [godot.ReflectionProbe.interiorEnable].
   */
  public fun reflectionProbeSetAsInterior(probe: RID, enable: Boolean): Unit {
    TransferContext.writeArguments(_RID to probe, BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_REFLECTION_PROBE_SET_AS_INTERIOR, NIL)
  }

  /**
   * Sets the render cull mask for this reflection probe. Only instances with a matching cull mask will be rendered by this probe. Equivalent to [godot.ReflectionProbe.cullMask].
   */
  public fun reflectionProbeSetCullMask(probe: RID, layers: Long): Unit {
    TransferContext.writeArguments(_RID to probe, LONG to layers)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_REFLECTION_PROBE_SET_CULL_MASK, NIL)
  }

  /**
   * If `true`, uses box projection. This can make reflections look more correct in certain situations. Equivalent to [godot.ReflectionProbe.boxProjection].
   */
  public fun reflectionProbeSetEnableBoxProjection(probe: RID, enable: Boolean): Unit {
    TransferContext.writeArguments(_RID to probe, BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_REFLECTION_PROBE_SET_ENABLE_BOX_PROJECTION, NIL)
  }

  /**
   * If `true`, computes shadows in the reflection probe. This makes the reflection much slower to compute. Equivalent to [godot.ReflectionProbe.enableShadows].
   */
  public fun reflectionProbeSetEnableShadows(probe: RID, enable: Boolean): Unit {
    TransferContext.writeArguments(_RID to probe, BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_REFLECTION_PROBE_SET_ENABLE_SHADOWS, NIL)
  }

  /**
   * Sets the size of the area that the reflection probe will capture. Equivalent to [godot.ReflectionProbe.extents].
   */
  public fun reflectionProbeSetExtents(probe: RID, extents: Vector3): Unit {
    TransferContext.writeArguments(_RID to probe, VECTOR3 to extents)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_REFLECTION_PROBE_SET_EXTENTS, NIL)
  }

  /**
   * Sets the intensity of the reflection probe. Intensity modulates the strength of the reflection. Equivalent to [godot.ReflectionProbe.intensity].
   */
  public fun reflectionProbeSetIntensity(probe: RID, intensity: Double): Unit {
    TransferContext.writeArguments(_RID to probe, DOUBLE to intensity)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_REFLECTION_PROBE_SET_INTENSITY, NIL)
  }

  /**
   * Sets the ambient light color for this reflection probe when set to interior mode. Equivalent to [godot.ReflectionProbe.interiorAmbientColor].
   */
  public fun reflectionProbeSetInteriorAmbient(probe: RID, color: Color): Unit {
    TransferContext.writeArguments(_RID to probe, COLOR to color)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_REFLECTION_PROBE_SET_INTERIOR_AMBIENT, NIL)
  }

  /**
   * Sets the energy multiplier for this reflection probes ambient light contribution when set to interior mode. Equivalent to [godot.ReflectionProbe.interiorAmbientEnergy].
   */
  public fun reflectionProbeSetInteriorAmbientEnergy(probe: RID, energy: Double): Unit {
    TransferContext.writeArguments(_RID to probe, DOUBLE to energy)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_REFLECTION_PROBE_SET_INTERIOR_AMBIENT_ENERGY, NIL)
  }

  /**
   * Sets the contribution value for how much the reflection affects the ambient light for this reflection probe when set to interior mode. Useful so that ambient light matches the color of the room. Equivalent to [godot.ReflectionProbe.interiorAmbientContrib].
   */
  public fun reflectionProbeSetInteriorAmbientProbeContribution(probe: RID, contrib: Double): Unit {
    TransferContext.writeArguments(_RID to probe, DOUBLE to contrib)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_REFLECTION_PROBE_SET_INTERIOR_AMBIENT_PROBE_CONTRIBUTION,
        NIL)
  }

  /**
   * Sets the max distance away from the probe an object can be before it is culled. Equivalent to [godot.ReflectionProbe.maxDistance].
   */
  public fun reflectionProbeSetMaxDistance(probe: RID, distance: Double): Unit {
    TransferContext.writeArguments(_RID to probe, DOUBLE to distance)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_REFLECTION_PROBE_SET_MAX_DISTANCE, NIL)
  }

  /**
   * Sets the origin offset to be used when this reflection probe is in box project mode. Equivalent to [godot.ReflectionProbe.originOffset].
   */
  public fun reflectionProbeSetOriginOffset(probe: RID, offset: Vector3): Unit {
    TransferContext.writeArguments(_RID to probe, VECTOR3 to offset)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_REFLECTION_PROBE_SET_ORIGIN_OFFSET, NIL)
  }

  /**
   * Sets how often the reflection probe updates. Can either be once or every frame. See [enum ReflectionProbeUpdateMode] for options.
   */
  public fun reflectionProbeSetUpdateMode(probe: RID, mode: Long): Unit {
    TransferContext.writeArguments(_RID to probe, LONG to mode)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_REFLECTION_PROBE_SET_UPDATE_MODE, NIL)
  }

  /**
   * Schedules a callback to the corresponding named `method` on `where` after a frame has been drawn.
   *
   * The callback method must use only 1 argument which will be called with `userdata`.
   */
  public fun requestFrameDrawnCallback(
    `where`: Object,
    method: String,
    userdata: Any?
  ): Unit {
    TransferContext.writeArguments(OBJECT to where, STRING to method, ANY to userdata)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_REQUEST_FRAME_DRAWN_CALLBACK, NIL)
  }

  /**
   * Creates a scenario and adds it to the VisualServer. It can be accessed with the RID that is returned. This RID will be used in all `scenario_*` VisualServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the VisualServer's [freeRid] static method.
   *
   * The scenario is the 3D world that all the visual instances exist in.
   */
  public fun scenarioCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_SCENARIO_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Sets the [enum ScenarioDebugMode] for this scenario. See [enum ScenarioDebugMode] for options.
   */
  public fun scenarioSetDebug(scenario: RID, debugMode: Long): Unit {
    TransferContext.writeArguments(_RID to scenario, LONG to debugMode)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_SCENARIO_SET_DEBUG,
        NIL)
  }

  /**
   * Sets the environment that will be used with this scenario.
   */
  public fun scenarioSetEnvironment(scenario: RID, environment: RID): Unit {
    TransferContext.writeArguments(_RID to scenario, _RID to environment)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_SCENARIO_SET_ENVIRONMENT, NIL)
  }

  /**
   * Sets the fallback environment to be used by this scenario. The fallback environment is used if no environment is set. Internally, this is used by the editor to provide a default environment.
   */
  public fun scenarioSetFallbackEnvironment(scenario: RID, environment: RID): Unit {
    TransferContext.writeArguments(_RID to scenario, _RID to environment)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_SCENARIO_SET_FALLBACK_ENVIRONMENT, NIL)
  }

  /**
   * Sets the size of the reflection atlas shared by all reflection probes in this scenario.
   */
  public fun scenarioSetReflectionAtlasSize(
    scenario: RID,
    size: Long,
    subdiv: Long
  ): Unit {
    TransferContext.writeArguments(_RID to scenario, LONG to size, LONG to subdiv)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_SCENARIO_SET_REFLECTION_ATLAS_SIZE, NIL)
  }

  /**
   * Sets a boot image. The color defines the background color. If `scale` is `true`, the image will be scaled to fit the screen size. If `use_filter` is `true`, the image will be scaled with linear interpolation. If `use_filter` is `false`, the image will be scaled with nearest-neighbor interpolation.
   */
  public fun setBootImage(
    image: Image,
    color: Color,
    scale: Boolean,
    useFilter: Boolean = true
  ): Unit {
    TransferContext.writeArguments(OBJECT to image, COLOR to color, BOOL to scale, BOOL to
        useFilter)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_SET_BOOT_IMAGE, NIL)
  }

  /**
   * If `true`, the engine will generate wireframes for use with the wireframe debug mode.
   */
  public fun setDebugGenerateWireframes(generate: Boolean): Unit {
    TransferContext.writeArguments(BOOL to generate)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_SET_DEBUG_GENERATE_WIREFRAMES, NIL)
  }

  /**
   * Sets the default clear color which is used when a specific clear color has not been selected.
   */
  public fun setDefaultClearColor(color: Color): Unit {
    TransferContext.writeArguments(COLOR to color)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_SET_DEFAULT_CLEAR_COLOR, NIL)
  }

  /**
   * Sets the scale to apply to the passage of time for the shaders' `TIME` builtin.
   *
   * The default value is `1.0`, which means `TIME` will count the real time as it goes by, without narrowing or stretching it.
   */
  public fun setShaderTimeScale(scale: Double): Unit {
    TransferContext.writeArguments(DOUBLE to scale)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_SET_SHADER_TIME_SCALE,
        NIL)
  }

  /**
   * Enables or disables occlusion culling.
   */
  public fun setUseOcclusionCulling(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_SET_USE_OCCLUSION_CULLING, NIL)
  }

  /**
   * Creates an empty shader and adds it to the VisualServer. It can be accessed with the RID that is returned. This RID will be used in all `shader_*` VisualServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the VisualServer's [freeRid] static method.
   */
  public fun shaderCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_SHADER_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Returns a shader's code.
   */
  public fun shaderGetCode(shader: RID): String {
    TransferContext.writeArguments(_RID to shader)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_SHADER_GET_CODE,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns a default texture from a shader searched by name.
   */
  public fun shaderGetDefaultTextureParam(shader: RID, name: String): RID {
    TransferContext.writeArguments(_RID to shader, STRING to name)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_SHADER_GET_DEFAULT_TEXTURE_PARAM, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Returns the parameters of a shader.
   */
  public fun shaderGetParamList(shader: RID): VariantArray<Any?> {
    TransferContext.writeArguments(_RID to shader)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_SHADER_GET_PARAM_LIST,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Sets a shader's code.
   */
  public fun shaderSetCode(shader: RID, code: String): Unit {
    TransferContext.writeArguments(_RID to shader, STRING to code)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_SHADER_SET_CODE, NIL)
  }

  /**
   * Sets a shader's default texture. Overwrites the texture given by name.
   */
  public fun shaderSetDefaultTextureParam(
    shader: RID,
    name: String,
    texture: RID
  ): Unit {
    TransferContext.writeArguments(_RID to shader, STRING to name, _RID to texture)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_SHADER_SET_DEFAULT_TEXTURE_PARAM, NIL)
  }

  /**
   * Allocates the GPU buffers for this skeleton.
   */
  public fun skeletonAllocate(
    skeleton: RID,
    bones: Long,
    is2dSkeleton: Boolean = false
  ): Unit {
    TransferContext.writeArguments(_RID to skeleton, LONG to bones, BOOL to is2dSkeleton)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_SKELETON_ALLOCATE, NIL)
  }

  /**
   * Returns the [godot.core.Transform] set for a specific bone of this skeleton.
   */
  public fun skeletonBoneGetTransform(skeleton: RID, bone: Long): Transform {
    TransferContext.writeArguments(_RID to skeleton, LONG to bone)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_SKELETON_BONE_GET_TRANSFORM, TRANSFORM)
    return TransferContext.readReturnValue(TRANSFORM, false) as Transform
  }

  /**
   * Returns the [godot.core.Transform2D] set for a specific bone of this skeleton.
   */
  public fun skeletonBoneGetTransform2d(skeleton: RID, bone: Long): Transform2D {
    TransferContext.writeArguments(_RID to skeleton, LONG to bone)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_SKELETON_BONE_GET_TRANSFORM_2D, TRANSFORM2D)
    return TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D
  }

  /**
   * Sets the [godot.core.Transform] for a specific bone of this skeleton.
   */
  public fun skeletonBoneSetTransform(
    skeleton: RID,
    bone: Long,
    transform: Transform
  ): Unit {
    TransferContext.writeArguments(_RID to skeleton, LONG to bone, TRANSFORM to transform)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_SKELETON_BONE_SET_TRANSFORM, NIL)
  }

  /**
   * Sets the [godot.core.Transform2D] for a specific bone of this skeleton.
   */
  public fun skeletonBoneSetTransform2d(
    skeleton: RID,
    bone: Long,
    transform: Transform2D
  ): Unit {
    TransferContext.writeArguments(_RID to skeleton, LONG to bone, TRANSFORM2D to transform)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_SKELETON_BONE_SET_TRANSFORM_2D, NIL)
  }

  /**
   * Creates a skeleton and adds it to the VisualServer. It can be accessed with the RID that is returned. This RID will be used in all `skeleton_*` VisualServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the VisualServer's [freeRid] static method.
   */
  public fun skeletonCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_SKELETON_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Returns the number of bones allocated for this skeleton.
   */
  public fun skeletonGetBoneCount(skeleton: RID): Long {
    TransferContext.writeArguments(_RID to skeleton)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_SKELETON_GET_BONE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Creates an empty sky and adds it to the VisualServer. It can be accessed with the RID that is returned. This RID will be used in all `sky_*` VisualServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the VisualServer's [freeRid] static method.
   */
  public fun skyCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_SKY_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Sets a sky's texture.
   */
  public fun skySetTexture(
    sky: RID,
    cubeMap: RID,
    radianceSize: Long
  ): Unit {
    TransferContext.writeArguments(_RID to sky, _RID to cubeMap, LONG to radianceSize)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_SKY_SET_TEXTURE, NIL)
  }

  /**
   * Creates a spot light and adds it to the VisualServer. It can be accessed with the RID that is returned. This RID can be used in most `light_*` VisualServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the VisualServer's [freeRid] static method.
   *
   * To place in a scene, attach this spot light to an instance using [instanceSetBase] using the returned RID.
   */
  public fun spotLightCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_SPOT_LIGHT_CREATE,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Not implemented in Godot 3.x.
   */
  public fun sync(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_SYNC, NIL)
  }

  /**
   * Allocates the GPU memory for the texture.
   */
  public fun textureAllocate(
    texture: RID,
    width: Long,
    height: Long,
    depth3d: Long,
    format: Long,
    type: Long,
    flags: Long = 7
  ): Unit {
    TransferContext.writeArguments(_RID to texture, LONG to width, LONG to height, LONG to depth3d,
        LONG to format, LONG to type, LONG to flags)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_TEXTURE_ALLOCATE, NIL)
  }

  /**
   * Binds the texture to a texture slot.
   */
  public fun textureBind(texture: RID, number: Long): Unit {
    TransferContext.writeArguments(_RID to texture, LONG to number)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_TEXTURE_BIND, NIL)
  }

  /**
   * Creates an empty texture and adds it to the VisualServer. It can be accessed with the RID that is returned. This RID will be used in all `texture_*` VisualServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the VisualServer's [freeRid] static method.
   */
  public fun textureCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_TEXTURE_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Creates a texture, allocates the space for an image, and fills in the image.
   */
  public fun textureCreateFromImage(image: Image, flags: Long = 7): RID {
    TransferContext.writeArguments(OBJECT to image, LONG to flags)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_TEXTURE_CREATE_FROM_IMAGE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Returns a list of all the textures and their information.
   */
  public fun textureDebugUsage(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_TEXTURE_DEBUG_USAGE,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Returns a copy of a texture's image unless it's a CubeMap, in which case it returns the [RID] of the image at one of the cubes sides.
   */
  public fun textureGetData(texture: RID, cubeSide: Long = 0): Image? {
    TransferContext.writeArguments(_RID to texture, LONG to cubeSide)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_TEXTURE_GET_DATA,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Image?
  }

  /**
   * Returns the depth of the texture.
   */
  public fun textureGetDepth(texture: RID): Long {
    TransferContext.writeArguments(_RID to texture)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_TEXTURE_GET_DEPTH,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the flags of a texture.
   */
  public fun textureGetFlags(texture: RID): Long {
    TransferContext.writeArguments(_RID to texture)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_TEXTURE_GET_FLAGS,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the format of the texture's image.
   */
  public fun textureGetFormat(texture: RID): Image.Format {
    TransferContext.writeArguments(_RID to texture)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_TEXTURE_GET_FORMAT,
        LONG)
    return Image.Format.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns the texture's height.
   */
  public fun textureGetHeight(texture: RID): Long {
    TransferContext.writeArguments(_RID to texture)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_TEXTURE_GET_HEIGHT,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the texture's path.
   */
  public fun textureGetPath(texture: RID): String {
    TransferContext.writeArguments(_RID to texture)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_TEXTURE_GET_PATH,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the opengl id of the texture's image.
   */
  public fun textureGetTexid(texture: RID): Long {
    TransferContext.writeArguments(_RID to texture)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_TEXTURE_GET_TEXID,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the type of the texture, can be any of the [enum TextureType].
   */
  public fun textureGetType(texture: RID): VisualServer.TextureType {
    TransferContext.writeArguments(_RID to texture)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_TEXTURE_GET_TYPE, LONG)
    return VisualServer.TextureType.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns the texture's width.
   */
  public fun textureGetWidth(texture: RID): Long {
    TransferContext.writeArguments(_RID to texture)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_TEXTURE_GET_WIDTH,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sets the texture's image data. If it's a CubeMap, it sets the image data at a cube side.
   */
  public fun textureSetData(
    texture: RID,
    image: Image,
    layer: Long = 0
  ): Unit {
    TransferContext.writeArguments(_RID to texture, OBJECT to image, LONG to layer)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_TEXTURE_SET_DATA, NIL)
  }

  /**
   * Sets a part of the data for a texture. Warning: this function calls the underlying graphics API directly and may corrupt your texture if used improperly.
   */
  public fun textureSetDataPartial(
    texture: RID,
    image: Image,
    srcX: Long,
    srcY: Long,
    srcW: Long,
    srcH: Long,
    dstX: Long,
    dstY: Long,
    dstMip: Long,
    layer: Long = 0
  ): Unit {
    TransferContext.writeArguments(_RID to texture, OBJECT to image, LONG to srcX, LONG to srcY,
        LONG to srcW, LONG to srcH, LONG to dstX, LONG to dstY, LONG to dstMip, LONG to layer)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_TEXTURE_SET_DATA_PARTIAL, NIL)
  }

  /**
   * Sets the texture's flags. See [enum TextureFlags] for options.
   */
  public fun textureSetFlags(texture: RID, flags: Long): Unit {
    TransferContext.writeArguments(_RID to texture, LONG to flags)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_TEXTURE_SET_FLAGS, NIL)
  }

  /**
   * Sets the texture's path.
   */
  public fun textureSetPath(texture: RID, path: String): Unit {
    TransferContext.writeArguments(_RID to texture, STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_TEXTURE_SET_PATH, NIL)
  }

  /**
   * If `true`, sets internal processes to shrink all image data to half the size.
   */
  public fun textureSetShrinkAllX2OnSetData(shrink: Boolean): Unit {
    TransferContext.writeArguments(BOOL to shrink)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_TEXTURE_SET_SHRINK_ALL_X2_ON_SET_DATA, NIL)
  }

  /**
   * Resizes the texture to the specified dimensions.
   */
  public fun textureSetSizeOverride(
    texture: RID,
    width: Long,
    height: Long,
    depth: Long
  ): Unit {
    TransferContext.writeArguments(_RID to texture, LONG to width, LONG to height, LONG to depth)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_TEXTURE_SET_SIZE_OVERRIDE, NIL)
  }

  /**
   * If `true`, the image will be stored in the texture's images array if overwritten.
   */
  public fun texturesKeepOriginal(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_TEXTURES_KEEP_ORIGINAL,
        NIL)
  }

  /**
   * Sets a viewport's camera.
   */
  public fun viewportAttachCamera(viewport: RID, camera: RID): Unit {
    TransferContext.writeArguments(_RID to viewport, _RID to camera)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_VIEWPORT_ATTACH_CAMERA,
        NIL)
  }

  /**
   * Sets a viewport's canvas.
   */
  public fun viewportAttachCanvas(viewport: RID, canvas: RID): Unit {
    TransferContext.writeArguments(_RID to viewport, _RID to canvas)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_VIEWPORT_ATTACH_CANVAS,
        NIL)
  }

  /**
   * Copies viewport to a region of the screen specified by `rect`. If [godot.Viewport.renderDirectToScreen] is `true`, then viewport does not use a framebuffer and the contents of the viewport are rendered directly to screen. However, note that the root viewport is drawn last, therefore it will draw over the screen. Accordingly, you must set the root viewport to an area that does not cover the area that you have attached this viewport to.
   *
   * For example, you can set the root viewport to not render at all with the following code:
   *
   * ```
   * 				func _ready():
   * 				    get_viewport().set_attach_to_screen_rect(Rect2())
   * 				    $Viewport.set_attach_to_screen_rect(Rect2(0, 0, 600, 600))
   * 				```
   *
   * Using this can result in significant optimization, especially on lower-end devices. However, it comes at the cost of having to manage your viewports manually. For a further optimization see, [viewportSetRenderDirectToScreen].
   */
  public fun viewportAttachToScreen(
    viewport: RID,
    rect: Rect2 = Rect2(0.0, 0.0, 0.0, 0.0),
    screen: Long = 0
  ): Unit {
    TransferContext.writeArguments(_RID to viewport, RECT2 to rect, LONG to screen)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_VIEWPORT_ATTACH_TO_SCREEN, NIL)
  }

  /**
   * Creates an empty viewport and adds it to the VisualServer. It can be accessed with the RID that is returned. This RID will be used in all `viewport_*` VisualServer functions.
   *
   * Once finished with your RID, you will want to free the RID using the VisualServer's [freeRid] static method.
   */
  public fun viewportCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_VIEWPORT_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Detaches the viewport from the screen.
   */
  public fun viewportDetach(viewport: RID): Unit {
    TransferContext.writeArguments(_RID to viewport)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_VIEWPORT_DETACH, NIL)
  }

  /**
   * Returns a viewport's render information. For options, see the [enum ViewportRenderInfo] constants.
   */
  public fun viewportGetRenderInfo(viewport: RID, info: Long): Long {
    TransferContext.writeArguments(_RID to viewport, LONG to info)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_VIEWPORT_GET_RENDER_INFO, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the viewport's last rendered frame.
   */
  public fun viewportGetTexture(viewport: RID): RID {
    TransferContext.writeArguments(_RID to viewport)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_VIEWPORT_GET_TEXTURE,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Detaches a viewport from a canvas and vice versa.
   */
  public fun viewportRemoveCanvas(viewport: RID, canvas: RID): Unit {
    TransferContext.writeArguments(_RID to viewport, _RID to canvas)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_VIEWPORT_REMOVE_CANVAS,
        NIL)
  }

  /**
   * If `true`, sets the viewport active, else sets it inactive.
   */
  public fun viewportSetActive(viewport: RID, active: Boolean): Unit {
    TransferContext.writeArguments(_RID to viewport, BOOL to active)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_VIEWPORT_SET_ACTIVE,
        NIL)
  }

  /**
   * Sets the stacking order for a viewport's canvas.
   *
   * `layer` is the actual canvas layer, while `sublayer` specifies the stacking order of the canvas among those in the same layer.
   */
  public fun viewportSetCanvasStacking(
    viewport: RID,
    canvas: RID,
    layer: Long,
    sublayer: Long
  ): Unit {
    TransferContext.writeArguments(_RID to viewport, _RID to canvas, LONG to layer, LONG to
        sublayer)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_VIEWPORT_SET_CANVAS_STACKING, NIL)
  }

  /**
   * Sets the transformation of a viewport's canvas.
   */
  public fun viewportSetCanvasTransform(
    viewport: RID,
    canvas: RID,
    offset: Transform2D
  ): Unit {
    TransferContext.writeArguments(_RID to viewport, _RID to canvas, TRANSFORM2D to offset)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_VIEWPORT_SET_CANVAS_TRANSFORM, NIL)
  }

  /**
   * Sets the clear mode of a viewport. See [enum ViewportClearMode] for options.
   */
  public fun viewportSetClearMode(viewport: RID, clearMode: Long): Unit {
    TransferContext.writeArguments(_RID to viewport, LONG to clearMode)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_VIEWPORT_SET_CLEAR_MODE, NIL)
  }

  /**
   * Sets the debug draw mode of a viewport. See [enum ViewportDebugDraw] for options.
   */
  public fun viewportSetDebugDraw(viewport: RID, draw: Long): Unit {
    TransferContext.writeArguments(_RID to viewport, LONG to draw)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_VIEWPORT_SET_DEBUG_DRAW, NIL)
  }

  /**
   * If `true`, a viewport's 3D rendering is disabled.
   */
  public fun viewportSetDisable3d(viewport: RID, disabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to viewport, BOOL to disabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_VIEWPORT_SET_DISABLE_3D, NIL)
  }

  /**
   * If `true`, rendering of a viewport's environment is disabled.
   */
  public fun viewportSetDisableEnvironment(viewport: RID, disabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to viewport, BOOL to disabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_VIEWPORT_SET_DISABLE_ENVIRONMENT, NIL)
  }

  /**
   * Sets the viewport's global transformation matrix.
   */
  public fun viewportSetGlobalCanvasTransform(viewport: RID, transform: Transform2D): Unit {
    TransferContext.writeArguments(_RID to viewport, TRANSFORM2D to transform)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_VIEWPORT_SET_GLOBAL_CANVAS_TRANSFORM, NIL)
  }

  /**
   * If `true`, the viewport renders to hdr.
   */
  public fun viewportSetHdr(viewport: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to viewport, BOOL to enabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_VIEWPORT_SET_HDR, NIL)
  }

  /**
   * If `true`, the viewport's canvas is not rendered.
   */
  public fun viewportSetHideCanvas(viewport: RID, hidden: Boolean): Unit {
    TransferContext.writeArguments(_RID to viewport, BOOL to hidden)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_VIEWPORT_SET_HIDE_CANVAS, NIL)
  }

  /**
   * Currently unimplemented in Godot 3.x.
   */
  public fun viewportSetHideScenario(viewport: RID, hidden: Boolean): Unit {
    TransferContext.writeArguments(_RID to viewport, BOOL to hidden)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_VIEWPORT_SET_HIDE_SCENARIO, NIL)
  }

  /**
   * Sets the anti-aliasing mode. See [enum ViewportMSAA] for options.
   */
  public fun viewportSetMsaa(viewport: RID, msaa: Long): Unit {
    TransferContext.writeArguments(_RID to viewport, LONG to msaa)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_VIEWPORT_SET_MSAA, NIL)
  }

  /**
   * Sets the viewport's parent to another viewport.
   */
  public fun viewportSetParentViewport(viewport: RID, parentViewport: RID): Unit {
    TransferContext.writeArguments(_RID to viewport, _RID to parentViewport)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_VIEWPORT_SET_PARENT_VIEWPORT, NIL)
  }

  /**
   * If `true`, render the contents of the viewport directly to screen. This allows a low-level optimization where you can skip drawing a viewport to the root viewport. While this optimization can result in a significant increase in speed (especially on older devices), it comes at a cost of usability. When this is enabled, you cannot read from the viewport or from the `SCREEN_TEXTURE`. You also lose the benefit of certain window settings, such as the various stretch modes. Another consequence to be aware of is that in 2D the rendering happens in window coordinates, so if you have a viewport that is double the size of the window, and you set this, then only the portion that fits within the window will be drawn, no automatic scaling is possible, even if your game scene is significantly larger than the window size.
   */
  public fun viewportSetRenderDirectToScreen(viewport: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to viewport, BOOL to enabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_VIEWPORT_SET_RENDER_DIRECT_TO_SCREEN, NIL)
  }

  /**
   * Sets a viewport's scenario.
   *
   * The scenario contains information about the [enum ScenarioDebugMode], environment information, reflection atlas etc.
   */
  public fun viewportSetScenario(viewport: RID, scenario: RID): Unit {
    TransferContext.writeArguments(_RID to viewport, _RID to scenario)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_VIEWPORT_SET_SCENARIO,
        NIL)
  }

  /**
   * Sets the shadow atlas quadrant's subdivision.
   */
  public fun viewportSetShadowAtlasQuadrantSubdivision(
    viewport: RID,
    quadrant: Long,
    subdivision: Long
  ): Unit {
    TransferContext.writeArguments(_RID to viewport, LONG to quadrant, LONG to subdivision)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_VIEWPORT_SET_SHADOW_ATLAS_QUADRANT_SUBDIVISION, NIL)
  }

  /**
   * Sets the size of the shadow atlas's images (used for omni and spot lights). The value will be rounded up to the nearest power of 2.
   */
  public fun viewportSetShadowAtlasSize(viewport: RID, size: Long): Unit {
    TransferContext.writeArguments(_RID to viewport, LONG to size)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_VIEWPORT_SET_SHADOW_ATLAS_SIZE, NIL)
  }

  /**
   * Sets the sharpening `intensity` for the `viewport`. If set to a value greater than `0.0`, contrast-adaptive sharpening will be applied to the 3D viewport. This has a low performance cost and can be used to recover some of the sharpness lost from using FXAA. Values around `0.5` generally give the best results. See also [viewportSetUseFxaa].
   */
  public fun viewportSetSharpenIntensity(viewport: RID, intensity: Double): Unit {
    TransferContext.writeArguments(_RID to viewport, DOUBLE to intensity)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_VIEWPORT_SET_SHARPEN_INTENSITY, NIL)
  }

  /**
   * Sets the viewport's width and height.
   */
  public fun viewportSetSize(
    viewport: RID,
    width: Long,
    height: Long
  ): Unit {
    TransferContext.writeArguments(_RID to viewport, LONG to width, LONG to height)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_VIEWPORT_SET_SIZE, NIL)
  }

  /**
   * If `true`, the viewport renders its background as transparent.
   */
  public fun viewportSetTransparentBackground(viewport: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to viewport, BOOL to enabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_VIEWPORT_SET_TRANSPARENT_BACKGROUND, NIL)
  }

  /**
   * Sets when the viewport should be updated. See [enum ViewportUpdateMode] constants for options.
   */
  public fun viewportSetUpdateMode(viewport: RID, updateMode: Long): Unit {
    TransferContext.writeArguments(_RID to viewport, LONG to updateMode)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_VIEWPORT_SET_UPDATE_MODE, NIL)
  }

  /**
   * Sets the viewport's 2D/3D mode. See [enum ViewportUsage] constants for options.
   */
  public fun viewportSetUsage(viewport: RID, usage: Long): Unit {
    TransferContext.writeArguments(_RID to viewport, LONG to usage)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_VIEWPORT_SET_USAGE,
        NIL)
  }

  /**
   * If `true`, the viewport uses augmented or virtual reality technologies. See [godot.ARVRInterface].
   */
  public fun viewportSetUseArvr(viewport: RID, useArvr: Boolean): Unit {
    TransferContext.writeArguments(_RID to viewport, BOOL to useArvr)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_VIEWPORT_SET_USE_ARVR,
        NIL)
  }

  /**
   * If `true`, uses a fast post-processing filter to make banding significantly less visible. In some cases, debanding may introduce a slightly noticeable dithering pattern. It's recommended to enable debanding only when actually needed since the dithering pattern will make lossless-compressed screenshots larger.
   *
   * **Note:** Only available on the GLES3 backend. [godot.Viewport.hdr] must also be `true` for debanding to be effective.
   */
  public fun viewportSetUseDebanding(viewport: RID, debanding: Boolean): Unit {
    TransferContext.writeArguments(_RID to viewport, BOOL to debanding)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VISUALSERVER_VIEWPORT_SET_USE_DEBANDING, NIL)
  }

  /**
   * Enables fast approximate antialiasing for this viewport. FXAA is a popular screen-space antialiasing method, which is fast but will make the image look blurry, especially at lower resolutions. It can still work relatively well at large resolutions such as 1440p and 4K. Some of the lost sharpness can be recovered by enabling contrast-adaptive sharpening (see [viewportSetSharpenIntensity]).
   */
  public fun viewportSetUseFxaa(viewport: RID, fxaa: Boolean): Unit {
    TransferContext.writeArguments(_RID to viewport, BOOL to fxaa)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_VIEWPORT_SET_USE_FXAA,
        NIL)
  }

  /**
   * If `true`, the viewport's rendering is flipped vertically.
   */
  public fun viewportSetVflip(viewport: RID, enabled: Boolean): Unit {
    TransferContext.writeArguments(_RID to viewport, BOOL to enabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSERVER_VIEWPORT_SET_VFLIP,
        NIL)
  }

  public enum class ReflectionProbeUpdateMode(
    id: Long
  ) {
    /**
     * Reflection probe will update reflections once and then stop.
     */
    REFLECTION_PROBE_UPDATE_ONCE(0),
    /**
     * Reflection probe will update each frame. This mode is necessary to capture moving objects.
     */
    REFLECTION_PROBE_UPDATE_ALWAYS(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class LightDirectionalShadowDepthRangeMode(
    id: Long
  ) {
    /**
     * Keeps shadows stable as camera moves but has lower effective resolution.
     */
    LIGHT_DIRECTIONAL_SHADOW_DEPTH_RANGE_STABLE(0),
    /**
     * Optimize use of shadow maps, increasing the effective resolution. But may result in shadows moving or flickering slightly.
     */
    LIGHT_DIRECTIONAL_SHADOW_DEPTH_RANGE_OPTIMIZED(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class BlendShapeMode(
    id: Long
  ) {
    /**
     * Blend shapes are normalized.
     */
    BLEND_SHAPE_MODE_NORMALIZED(0),
    /**
     * Blend shapes are relative to base weight.
     */
    BLEND_SHAPE_MODE_RELATIVE(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class PrimitiveType(
    id: Long
  ) {
    /**
     * Primitive to draw consists of points.
     */
    PRIMITIVE_POINTS(0),
    /**
     * Primitive to draw consists of lines.
     */
    PRIMITIVE_LINES(1),
    /**
     * Primitive to draw consists of a line strip from start to end.
     */
    PRIMITIVE_LINE_STRIP(2),
    /**
     * Primitive to draw consists of a line loop (a line strip with a line between the last and the first vertex).
     */
    PRIMITIVE_LINE_LOOP(3),
    /**
     * Primitive to draw consists of triangles.
     */
    PRIMITIVE_TRIANGLES(4),
    /**
     * Primitive to draw consists of a triangle strip (the last 3 vertices are always combined to make a triangle).
     */
    PRIMITIVE_TRIANGLE_STRIP(5),
    /**
     * Primitive to draw consists of a triangle strip (the last 2 vertices are always combined with the first to make a triangle).
     */
    PRIMITIVE_TRIANGLE_FAN(6),
    /**
     * Represents the size of the [enum PrimitiveType] enum.
     */
    PRIMITIVE_MAX(7),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class TextureType(
    id: Long
  ) {
    /**
     * Normal texture with 2 dimensions, width and height.
     */
    TEXTURE_TYPE_2D(0),
    /**
     * Texture made up of six faces, can be looked up with a `vec3` in shader.
     */
    TEXTURE_TYPE_CUBEMAP(2),
    /**
     * An array of 2-dimensional textures.
     */
    TEXTURE_TYPE_2D_ARRAY(3),
    /**
     * A 3-dimensional texture with width, height, and depth.
     */
    TEXTURE_TYPE_3D(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class EnvironmentSSAOQuality(
    id: Long
  ) {
    /**
     * Lowest quality of screen space ambient occlusion.
     */
    ENV_SSAO_QUALITY_LOW(0),
    /**
     * Medium quality screen space ambient occlusion.
     */
    ENV_SSAO_QUALITY_MEDIUM(1),
    /**
     * Highest quality screen space ambient occlusion.
     */
    ENV_SSAO_QUALITY_HIGH(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class EnvironmentDOFBlurQuality(
    id: Long
  ) {
    /**
     * Use lowest blur quality. Fastest, but may look bad.
     */
    ENV_DOF_BLUR_QUALITY_LOW(0),
    /**
     * Use medium blur quality.
     */
    ENV_DOF_BLUR_QUALITY_MEDIUM(1),
    /**
     * Used highest blur quality. Looks the best, but is the slowest.
     */
    ENV_DOF_BLUR_QUALITY_HIGH(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class RenderInfo(
    id: Long
  ) {
    /**
     * The amount of objects in the frame.
     */
    INFO_OBJECTS_IN_FRAME(0),
    /**
     * The amount of vertices in the frame.
     */
    INFO_VERTICES_IN_FRAME(1),
    /**
     * The amount of modified materials in the frame.
     */
    INFO_MATERIAL_CHANGES_IN_FRAME(2),
    /**
     * The amount of shader rebinds in the frame.
     */
    INFO_SHADER_CHANGES_IN_FRAME(3),
    /**
     * The amount of surface changes in the frame.
     */
    INFO_SURFACE_CHANGES_IN_FRAME(4),
    /**
     * The amount of draw calls in frame.
     */
    INFO_DRAW_CALLS_IN_FRAME(5),
    /**
     * The amount of 2d items in the frame.
     */
    INFO_2D_ITEMS_IN_FRAME(6),
    /**
     * The amount of 2d draw calls in frame.
     */
    INFO_2D_DRAW_CALLS_IN_FRAME(7),
    /**
     * Unimplemented in the GLES2 and GLES3 rendering backends, always returns 0.
     */
    INFO_USAGE_VIDEO_MEM_TOTAL(8),
    /**
     * The amount of video memory used, i.e. texture and vertex memory combined.
     */
    INFO_VIDEO_MEM_USED(9),
    /**
     * The amount of texture memory used.
     */
    INFO_TEXTURE_MEM_USED(10),
    /**
     * The amount of vertex memory used.
     */
    INFO_VERTEX_MEM_USED(11),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class NinePatchAxisMode(
    id: Long
  ) {
    /**
     * The nine patch gets stretched where needed.
     */
    NINE_PATCH_STRETCH(0),
    /**
     * The nine patch gets filled with tiles where needed.
     */
    NINE_PATCH_TILE(1),
    /**
     * The nine patch gets filled with tiles where needed and stretches them a bit if needed.
     */
    NINE_PATCH_TILE_FIT(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class ViewportRenderInfo(
    id: Long
  ) {
    /**
     * Number of objects drawn in a single frame.
     */
    VIEWPORT_RENDER_INFO_OBJECTS_IN_FRAME(0),
    /**
     * Number of vertices drawn in a single frame.
     */
    VIEWPORT_RENDER_INFO_VERTICES_IN_FRAME(1),
    /**
     * Number of material changes during this frame.
     */
    VIEWPORT_RENDER_INFO_MATERIAL_CHANGES_IN_FRAME(2),
    /**
     * Number of shader changes during this frame.
     */
    VIEWPORT_RENDER_INFO_SHADER_CHANGES_IN_FRAME(3),
    /**
     * Number of surface changes during this frame.
     */
    VIEWPORT_RENDER_INFO_SURFACE_CHANGES_IN_FRAME(4),
    /**
     * Number of draw calls during this frame.
     */
    VIEWPORT_RENDER_INFO_DRAW_CALLS_IN_FRAME(5),
    /**
     * Number of 2d items drawn this frame.
     */
    VIEWPORT_RENDER_INFO_2D_ITEMS_IN_FRAME(6),
    /**
     * Number of 2d draw calls during this frame.
     */
    VIEWPORT_RENDER_INFO_2D_DRAW_CALLS_IN_FRAME(7),
    /**
     * Represents the size of the [enum ViewportRenderInfo] enum.
     */
    VIEWPORT_RENDER_INFO_MAX(8),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class ViewportClearMode(
    id: Long
  ) {
    /**
     * The viewport is always cleared before drawing.
     */
    VIEWPORT_CLEAR_ALWAYS(0),
    /**
     * The viewport is never cleared before drawing.
     */
    VIEWPORT_CLEAR_NEVER(1),
    /**
     * The viewport is cleared once, then the clear mode is set to [VIEWPORT_CLEAR_NEVER].
     */
    VIEWPORT_CLEAR_ONLY_NEXT_FRAME(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class LightOmniShadowDetail(
    id: Long
  ) {
    /**
     * Use more detail vertically when computing shadow map.
     */
    LIGHT_OMNI_SHADOW_DETAIL_VERTICAL(0),
    /**
     * Use more detail horizontally when computing shadow map.
     */
    LIGHT_OMNI_SHADOW_DETAIL_HORIZONTAL(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class ShaderMode(
    id: Long
  ) {
    /**
     * Shader is a 3D shader.
     */
    SHADER_SPATIAL(0),
    /**
     * Shader is a 2D shader.
     */
    SHADER_CANVAS_ITEM(1),
    /**
     * Shader is a particle shader.
     */
    SHADER_PARTICLES(2),
    /**
     * Represents the size of the [enum ShaderMode] enum.
     */
    SHADER_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class MultimeshTransformFormat(
    id: Long
  ) {
    /**
     * Use [godot.core.Transform2D] to store MultiMesh transform.
     */
    MULTIMESH_TRANSFORM_2D(0),
    /**
     * Use [godot.core.Transform] to store MultiMesh transform.
     */
    MULTIMESH_TRANSFORM_3D(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class ShadowCastingSetting(
    id: Long
  ) {
    /**
     * Disable shadows from this instance.
     */
    SHADOW_CASTING_SETTING_OFF(0),
    /**
     * Cast shadows from this instance.
     */
    SHADOW_CASTING_SETTING_ON(1),
    /**
     * Disable backface culling when rendering the shadow of the object. This is slightly slower but may result in more correct shadows.
     */
    SHADOW_CASTING_SETTING_DOUBLE_SIDED(2),
    /**
     * Only render the shadows from the object. The object itself will not be drawn.
     */
    SHADOW_CASTING_SETTING_SHADOWS_ONLY(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class ViewportDebugDraw(
    id: Long
  ) {
    /**
     * Debug draw is disabled. Default setting.
     */
    VIEWPORT_DEBUG_DRAW_DISABLED(0),
    /**
     * Debug draw sets objects to unshaded.
     */
    VIEWPORT_DEBUG_DRAW_UNSHADED(1),
    /**
     * Overwrites clear color to `(0,0,0,0)`.
     */
    VIEWPORT_DEBUG_DRAW_OVERDRAW(2),
    /**
     * Debug draw draws objects in wireframe.
     */
    VIEWPORT_DEBUG_DRAW_WIREFRAME(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class ViewportUsage(
    id: Long
  ) {
    /**
     * The Viewport does not render 3D but samples.
     */
    VIEWPORT_USAGE_2D(0),
    /**
     * The Viewport does not render 3D and does not sample.
     */
    VIEWPORT_USAGE_2D_NO_SAMPLING(1),
    /**
     * The Viewport renders 3D with effects.
     */
    VIEWPORT_USAGE_3D(2),
    /**
     * The Viewport renders 3D but without effects.
     */
    VIEWPORT_USAGE_3D_NO_EFFECTS(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class EnvironmentBG(
    id: Long
  ) {
    /**
     * Use the clear color as background.
     */
    ENV_BG_CLEAR_COLOR(0),
    /**
     * Use a specified color as the background.
     */
    ENV_BG_COLOR(1),
    /**
     * Use a sky resource for the background.
     */
    ENV_BG_SKY(2),
    /**
     * Use a custom color for background, but use a sky for shading and reflections.
     */
    ENV_BG_COLOR_SKY(3),
    /**
     * Use a specified canvas layer as the background. This can be useful for instantiating a 2D scene in a 3D world.
     */
    ENV_BG_CANVAS(4),
    /**
     * Do not clear the background, use whatever was rendered last frame as the background.
     */
    ENV_BG_KEEP(5),
    /**
     * Represents the size of the [enum EnvironmentBG] enum.
     */
    ENV_BG_MAX(7),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class MultimeshCustomDataFormat(
    id: Long
  ) {
    /**
     * MultiMesh does not use custom data.
     */
    MULTIMESH_CUSTOM_DATA_NONE(0),
    /**
     * MultiMesh custom data uses 8 bits per component. This packs the 4-component custom data into a single float.
     */
    MULTIMESH_CUSTOM_DATA_8BIT(1),
    /**
     * MultiMesh custom data uses a float per component.
     */
    MULTIMESH_CUSTOM_DATA_FLOAT(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class LightOmniShadowMode(
    id: Long
  ) {
    /**
     * Use a dual paraboloid shadow map for omni lights.
     */
    LIGHT_OMNI_SHADOW_DUAL_PARABOLOID(0),
    /**
     * Use a cubemap shadow map for omni lights. Slower but better quality than dual paraboloid.
     */
    LIGHT_OMNI_SHADOW_CUBE(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class TextureFlags(
    id: Long
  ) {
    /**
     * Generates mipmaps, which are smaller versions of the same texture to use when zoomed out, keeping the aspect ratio.
     */
    TEXTURE_FLAG_MIPMAPS(1),
    /**
     * Repeats the texture (instead of clamp to edge).
     */
    TEXTURE_FLAG_REPEAT(2),
    /**
     * Uses a magnifying filter, to enable smooth zooming in of the texture.
     */
    TEXTURE_FLAG_FILTER(4),
    /**
     * Default flags. [TEXTURE_FLAG_MIPMAPS], [TEXTURE_FLAG_REPEAT] and [TEXTURE_FLAG_FILTER] are enabled.
     */
    TEXTURE_FLAGS_DEFAULT(7),
    /**
     * Uses anisotropic mipmap filtering. Generates smaller versions of the same texture with different aspect ratios.
     *
     * This results in better-looking textures when viewed from oblique angles.
     */
    TEXTURE_FLAG_ANISOTROPIC_FILTER(8),
    /**
     * Converts the texture to the sRGB color space.
     */
    TEXTURE_FLAG_CONVERT_TO_LINEAR(16),
    /**
     * Repeats the texture with alternate sections mirrored.
     */
    TEXTURE_FLAG_MIRRORED_REPEAT(32),
    /**
     * Texture is a video surface.
     */
    TEXTURE_FLAG_USED_FOR_STREAMING(2048),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class Features(
    id: Long
  ) {
    /**
     * Hardware supports shaders. This enum is currently unused in Godot 3.x.
     */
    FEATURE_SHADERS(0),
    /**
     * Hardware supports multithreading. This enum is currently unused in Godot 3.x.
     */
    FEATURE_MULTITHREADED(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class InstanceType(
    id: Long
  ) {
    /**
     * The instance does not have a type.
     */
    INSTANCE_NONE(0),
    /**
     * The instance is a mesh.
     */
    INSTANCE_MESH(1),
    /**
     * The instance is a multimesh.
     */
    INSTANCE_MULTIMESH(2),
    /**
     * The instance is an immediate geometry.
     */
    INSTANCE_IMMEDIATE(3),
    /**
     * The instance is a particle emitter.
     */
    INSTANCE_PARTICLES(4),
    /**
     * The instance is a light.
     */
    INSTANCE_LIGHT(5),
    /**
     * The instance is a reflection probe.
     */
    INSTANCE_REFLECTION_PROBE(6),
    /**
     * The instance is a GI probe.
     */
    INSTANCE_GI_PROBE(7),
    /**
     * The instance is a lightmap capture.
     */
    INSTANCE_LIGHTMAP_CAPTURE(8),
    /**
     * Represents the size of the [enum InstanceType] enum.
     */
    INSTANCE_MAX(9),
    /**
     * A combination of the flags of geometry instances (mesh, multimesh, immediate and particles).
     */
    INSTANCE_GEOMETRY_MASK(30),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class EnvironmentSSAOBlur(
    id: Long
  ) {
    /**
     * Disables the blur set for SSAO. Will make SSAO look noisier.
     */
    ENV_SSAO_BLUR_DISABLED(0),
    /**
     * Perform a 1x1 blur on the SSAO output.
     */
    ENV_SSAO_BLUR_1x1(1),
    /**
     * Performs a 2x2 blur on the SSAO output.
     */
    ENV_SSAO_BLUR_2x2(2),
    /**
     * Performs a 3x3 blur on the SSAO output. Use this for smoothest SSAO.
     */
    ENV_SSAO_BLUR_3x3(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class EnvironmentToneMapper(
    id: Long
  ) {
    /**
     * Output color as they came in.
     */
    ENV_TONE_MAPPER_LINEAR(0),
    /**
     * Use the Reinhard tonemapper.
     */
    ENV_TONE_MAPPER_REINHARD(1),
    /**
     * Use the filmic tonemapper.
     */
    ENV_TONE_MAPPER_FILMIC(2),
    /**
     * Use the ACES tonemapper.
     */
    ENV_TONE_MAPPER_ACES(3),
    /**
     * Use the ACES Fitted tonemapper.
     */
    ENV_TONE_MAPPER_ACES_FITTED(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class EnvironmentGlowBlendMode(
    id: Long
  ) {
    /**
     * Add the effect of the glow on top of the scene.
     */
    GLOW_BLEND_MODE_ADDITIVE(0),
    /**
     * Blends the glow effect with the screen. Does not get as bright as additive.
     */
    GLOW_BLEND_MODE_SCREEN(1),
    /**
     * Produces a subtle color disturbance around objects.
     */
    GLOW_BLEND_MODE_SOFTLIGHT(2),
    /**
     * Shows the glow effect by itself without the underlying scene.
     */
    GLOW_BLEND_MODE_REPLACE(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class MultimeshColorFormat(
    id: Long
  ) {
    /**
     * MultiMesh does not use per-instance color.
     */
    MULTIMESH_COLOR_NONE(0),
    /**
     * MultiMesh color uses 8 bits per component. This packs the color into a single float.
     */
    MULTIMESH_COLOR_8BIT(1),
    /**
     * MultiMesh color uses a float per channel.
     */
    MULTIMESH_COLOR_FLOAT(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class CanvasLightShadowFilter(
    id: Long
  ) {
    /**
     * Do not apply a filter to canvas light shadows.
     */
    CANVAS_LIGHT_FILTER_NONE(0),
    /**
     * Use PCF3 filtering to filter canvas light shadows.
     */
    CANVAS_LIGHT_FILTER_PCF3(1),
    /**
     * Use PCF5 filtering to filter canvas light shadows.
     */
    CANVAS_LIGHT_FILTER_PCF5(2),
    /**
     * Use PCF7 filtering to filter canvas light shadows.
     */
    CANVAS_LIGHT_FILTER_PCF7(3),
    /**
     * Use PCF9 filtering to filter canvas light shadows.
     */
    CANVAS_LIGHT_FILTER_PCF9(4),
    /**
     * Use PCF13 filtering to filter canvas light shadows.
     */
    CANVAS_LIGHT_FILTER_PCF13(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class ScenarioDebugMode(
    id: Long
  ) {
    /**
     * Do not use a debug mode.
     */
    SCENARIO_DEBUG_DISABLED(0),
    /**
     * Draw all objects as wireframe models.
     */
    SCENARIO_DEBUG_WIREFRAME(1),
    /**
     * Draw all objects in a way that displays how much overdraw is occurring. Overdraw occurs when a section of pixels is drawn and shaded and then another object covers it up. To optimize a scene, you should reduce overdraw.
     */
    SCENARIO_DEBUG_OVERDRAW(2),
    /**
     * Draw all objects without shading. Equivalent to setting all objects shaders to `unshaded`.
     */
    SCENARIO_DEBUG_SHADELESS(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class ViewportUpdateMode(
    id: Long
  ) {
    /**
     * Do not update the viewport.
     */
    VIEWPORT_UPDATE_DISABLED(0),
    /**
     * Update the viewport once then set to disabled.
     */
    VIEWPORT_UPDATE_ONCE(1),
    /**
     * Update the viewport whenever it is visible.
     */
    VIEWPORT_UPDATE_WHEN_VISIBLE(2),
    /**
     * Always update the viewport.
     */
    VIEWPORT_UPDATE_ALWAYS(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class LightBakeMode(
    id: Long
  ) {
    /**
     *
     */
    LIGHT_BAKE_DISABLED(0),
    /**
     *
     */
    LIGHT_BAKE_INDIRECT(1),
    /**
     *
     */
    LIGHT_BAKE_ALL(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class ArrayFormat(
    id: Long
  ) {
    /**
     * Flag used to mark a vertex array.
     */
    ARRAY_FORMAT_VERTEX(1),
    /**
     * Flag used to mark a normal array.
     */
    ARRAY_FORMAT_NORMAL(2),
    /**
     * Flag used to mark a tangent array.
     */
    ARRAY_FORMAT_TANGENT(4),
    /**
     * Flag used to mark a color array.
     */
    ARRAY_FORMAT_COLOR(8),
    /**
     * Flag used to mark an UV coordinates array.
     */
    ARRAY_FORMAT_TEX_UV(16),
    /**
     * Flag used to mark an UV coordinates array for the second UV coordinates.
     */
    ARRAY_FORMAT_TEX_UV2(32),
    /**
     * Flag used to mark a bone information array.
     */
    ARRAY_FORMAT_BONES(64),
    /**
     * Flag used to mark a weights array.
     */
    ARRAY_FORMAT_WEIGHTS(128),
    /**
     * Flag used to mark an index array.
     */
    ARRAY_FORMAT_INDEX(256),
    /**
     * Flag used to mark a compressed (half float) vertex array.
     */
    ARRAY_COMPRESS_VERTEX(512),
    /**
     * Flag used to mark a compressed (half float) normal array.
     */
    ARRAY_COMPRESS_NORMAL(1024),
    /**
     * Flag used to mark a compressed (half float) tangent array.
     */
    ARRAY_COMPRESS_TANGENT(2048),
    /**
     * Flag used to mark a compressed (half float) color array.
     */
    ARRAY_COMPRESS_COLOR(4096),
    /**
     * Flag used to mark a compressed (half float) UV coordinates array.
     */
    ARRAY_COMPRESS_TEX_UV(8192),
    /**
     * Flag used to mark a compressed (half float) UV coordinates array for the second UV coordinates.
     */
    ARRAY_COMPRESS_TEX_UV2(16384),
    /**
     * Flag used to mark a compressed bone array.
     */
    ARRAY_COMPRESS_BONES(32768),
    /**
     * Flag used to mark a compressed (half float) weight array.
     */
    ARRAY_COMPRESS_WEIGHTS(65536),
    /**
     * Flag used to mark a compressed index array.
     */
    ARRAY_COMPRESS_INDEX(131072),
    /**
     * Flag used to mark that the array contains 2D vertices.
     */
    ARRAY_FLAG_USE_2D_VERTICES(262144),
    /**
     * Flag used to mark that the array uses 16-bit bones instead of 8-bit.
     */
    ARRAY_FLAG_USE_16_BIT_BONES(524288),
    /**
     * Flag used to mark that the array uses an octahedral representation of normal and tangent vectors rather than cartesian.
     */
    ARRAY_FLAG_USE_OCTAHEDRAL_COMPRESSION(2097152),
    /**
     * Used to set flags [ARRAY_COMPRESS_NORMAL], [ARRAY_COMPRESS_TANGENT], [ARRAY_COMPRESS_COLOR], [ARRAY_COMPRESS_TEX_UV], [godot.ARRAY_COMPRESS_TEX_UV2], [ARRAY_COMPRESS_WEIGHTS], and [ARRAY_FLAG_USE_OCTAHEDRAL_COMPRESSION] quickly.
     */
    ARRAY_COMPRESS_DEFAULT(2194432),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class ParticlesDrawOrder(
    id: Long
  ) {
    /**
     * Draw particles in the order that they appear in the particles array.
     */
    PARTICLES_DRAW_ORDER_INDEX(0),
    /**
     * Sort particles based on their lifetime.
     */
    PARTICLES_DRAW_ORDER_LIFETIME(1),
    /**
     * Sort particles based on their distance to the camera.
     */
    PARTICLES_DRAW_ORDER_VIEW_DEPTH(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class CanvasLightMode(
    id: Long
  ) {
    /**
     * Adds light color additive to the canvas.
     */
    CANVAS_LIGHT_MODE_ADD(0),
    /**
     * Adds light color subtractive to the canvas.
     */
    CANVAS_LIGHT_MODE_SUB(1),
    /**
     * The light adds color depending on transparency.
     */
    CANVAS_LIGHT_MODE_MIX(2),
    /**
     * The light adds color depending on mask.
     */
    CANVAS_LIGHT_MODE_MASK(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class LightDirectionalShadowMode(
    id: Long
  ) {
    /**
     * Use orthogonal shadow projection for directional light.
     */
    LIGHT_DIRECTIONAL_SHADOW_ORTHOGONAL(0),
    /**
     * Use 2 splits for shadow projection when using directional light.
     */
    LIGHT_DIRECTIONAL_SHADOW_PARALLEL_2_SPLITS(1),
    /**
     * Use 4 splits for shadow projection when using directional light.
     */
    LIGHT_DIRECTIONAL_SHADOW_PARALLEL_4_SPLITS(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class LightParam(
    id: Long
  ) {
    /**
     * The light's energy.
     */
    LIGHT_PARAM_ENERGY(0),
    /**
     * Secondary multiplier used with indirect light (light bounces).
     */
    LIGHT_PARAM_INDIRECT_ENERGY(1),
    /**
     * The light's size, currently only used for soft shadows in baked lightmaps.
     */
    LIGHT_PARAM_SIZE(2),
    /**
     * The light's influence on specularity.
     */
    LIGHT_PARAM_SPECULAR(3),
    /**
     * The light's range.
     */
    LIGHT_PARAM_RANGE(4),
    /**
     * The light's attenuation.
     */
    LIGHT_PARAM_ATTENUATION(5),
    /**
     * The spotlight's angle.
     */
    LIGHT_PARAM_SPOT_ANGLE(6),
    /**
     * The spotlight's attenuation.
     */
    LIGHT_PARAM_SPOT_ATTENUATION(7),
    /**
     * Scales the shadow color.
     */
    LIGHT_PARAM_CONTACT_SHADOW_SIZE(8),
    /**
     * Max distance that shadows will be rendered.
     */
    LIGHT_PARAM_SHADOW_MAX_DISTANCE(9),
    /**
     * Proportion of shadow atlas occupied by the first split.
     */
    LIGHT_PARAM_SHADOW_SPLIT_1_OFFSET(10),
    /**
     * Proportion of shadow atlas occupied by the second split.
     */
    LIGHT_PARAM_SHADOW_SPLIT_2_OFFSET(11),
    /**
     * Proportion of shadow atlas occupied by the third split. The fourth split occupies the rest.
     */
    LIGHT_PARAM_SHADOW_SPLIT_3_OFFSET(12),
    /**
     * Normal bias used to offset shadow lookup by object normal. Can be used to fix self-shadowing artifacts.
     */
    LIGHT_PARAM_SHADOW_NORMAL_BIAS(13),
    /**
     * Bias the shadow lookup to fix self-shadowing artifacts.
     */
    LIGHT_PARAM_SHADOW_BIAS(14),
    /**
     * Increases bias on further splits to fix self-shadowing that only occurs far away from the camera.
     */
    LIGHT_PARAM_SHADOW_BIAS_SPLIT_SCALE(15),
    /**
     * Represents the size of the [enum LightParam] enum.
     */
    LIGHT_PARAM_MAX(16),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class ArrayType(
    id: Long
  ) {
    /**
     * Array is a vertex array.
     */
    ARRAY_VERTEX(0),
    /**
     * Array is a normal array.
     */
    ARRAY_NORMAL(1),
    /**
     * Array is a tangent array.
     */
    ARRAY_TANGENT(2),
    /**
     * Array is a color array.
     */
    ARRAY_COLOR(3),
    /**
     * Array is an UV coordinates array.
     */
    ARRAY_TEX_UV(4),
    /**
     * Array is an UV coordinates array for the second UV coordinates.
     */
    ARRAY_TEX_UV2(5),
    /**
     * Array contains bone information.
     */
    ARRAY_BONES(6),
    /**
     * Array is weight information.
     */
    ARRAY_WEIGHTS(7),
    /**
     * Array is index array.
     */
    ARRAY_INDEX(8),
    /**
     * Represents the size of the [enum ArrayType] enum.
     */
    ARRAY_MAX(9),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class CanvasOccluderPolygonCullMode(
    id: Long
  ) {
    /**
     * Culling of the canvas occluder is disabled.
     */
    CANVAS_OCCLUDER_POLYGON_CULL_DISABLED(0),
    /**
     * Culling of the canvas occluder is clockwise.
     */
    CANVAS_OCCLUDER_POLYGON_CULL_CLOCKWISE(1),
    /**
     * Culling of the canvas occluder is counterclockwise.
     */
    CANVAS_OCCLUDER_POLYGON_CULL_COUNTER_CLOCKWISE(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class InstanceFlags(
    id: Long
  ) {
    /**
     * Allows the instance to be used in baked lighting.
     */
    INSTANCE_FLAG_USE_BAKED_LIGHT(0),
    /**
     * When set, manually requests to draw geometry on next frame.
     */
    INSTANCE_FLAG_DRAW_NEXT_FRAME_IF_VISIBLE(1),
    /**
     * Represents the size of the [enum InstanceFlags] enum.
     */
    INSTANCE_FLAG_MAX(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class ViewportMSAA(
    id: Long
  ) {
    /**
     * Multisample antialiasing is disabled.
     */
    VIEWPORT_MSAA_DISABLED(0),
    /**
     * Multisample antialiasing is set to 2×.
     */
    VIEWPORT_MSAA_2X(1),
    /**
     * Multisample antialiasing is set to 4×.
     */
    VIEWPORT_MSAA_4X(2),
    /**
     * Multisample antialiasing is set to 8×.
     */
    VIEWPORT_MSAA_8X(3),
    /**
     * Multisample antialiasing is set to 16×.
     */
    VIEWPORT_MSAA_16X(4),
    /**
     * Multisample antialiasing is set to 2× on external texture. Special mode for GLES2 Android VR (Oculus Quest and Go).
     */
    VIEWPORT_MSAA_EXT_2X(5),
    /**
     * Multisample antialiasing is set to 4× on external texture. Special mode for GLES2 Android VR (Oculus Quest and Go).
     */
    VIEWPORT_MSAA_EXT_4X(6),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class LightType(
    id: Long
  ) {
    /**
     * Is a directional (sun) light.
     */
    LIGHT_DIRECTIONAL(0),
    /**
     * Is an omni light.
     */
    LIGHT_OMNI(1),
    /**
     * Is a spot light.
     */
    LIGHT_SPOT(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class CubeMapSide(
    id: Long
  ) {
    /**
     * Marks the left side of a cubemap.
     */
    CUBEMAP_LEFT(0),
    /**
     * Marks the right side of a cubemap.
     */
    CUBEMAP_RIGHT(1),
    /**
     * Marks the bottom side of a cubemap.
     */
    CUBEMAP_BOTTOM(2),
    /**
     * Marks the top side of a cubemap.
     */
    CUBEMAP_TOP(3),
    /**
     * Marks the front side of a cubemap.
     */
    CUBEMAP_FRONT(4),
    /**
     * Marks the back side of a cubemap.
     */
    CUBEMAP_BACK(5),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }
}
