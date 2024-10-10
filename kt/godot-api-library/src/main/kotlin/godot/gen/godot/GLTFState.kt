// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.PackedByteArray
import godot.core.PackedInt32Array
import godot.core.StringName
import godot.core.VariantArray
import godot.core.VariantCaster.ANY
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DICTIONARY
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.PACKED_BYTE_ARRAY
import godot.core.VariantParser.PACKED_INT_32_ARRAY
import godot.core.VariantParser.STRING
import godot.core.VariantParser.STRING_NAME
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_GLTFSTATE_INDEX: Int = 247

/**
 * Contains all nodes and resources of a GLTF file. This is used by [GLTFDocument] as data storage,
 * which allows [GLTFDocument] and all [GLTFDocumentExtension] classes to remain stateless.
 * GLTFState can be populated by [GLTFDocument] reading a file or by converting a Godot scene. Then
 * the data can either be used to create a Godot scene or save to a GLTF file. The code that converts
 * to/from a Godot scene can be intercepted at arbitrary points by [GLTFDocumentExtension] classes.
 * This allows for custom data to be stored in the GLTF file or for custom data to be converted to/from
 * Godot nodes.
 */
@GodotBaseType
public open class GLTFState : Resource() {
  /**
   * The original raw JSON document corresponding to this GLTFState.
   */
  public final inline var json: Dictionary<Any?, Any?>
    @JvmName("jsonProperty")
    get() = getJson()
    @JvmName("jsonProperty")
    set(`value`) {
      setJson(value)
    }

  public final inline var majorVersion: Int
    @JvmName("majorVersionProperty")
    get() = getMajorVersion()
    @JvmName("majorVersionProperty")
    set(`value`) {
      setMajorVersion(value)
    }

  public final inline var minorVersion: Int
    @JvmName("minorVersionProperty")
    get() = getMinorVersion()
    @JvmName("minorVersionProperty")
    set(`value`) {
      setMinorVersion(value)
    }

  /**
   * The copyright string in the asset header of the GLTF file. This is set during import if present
   * and export if non-empty. See the GLTF asset header documentation for more information.
   */
  public final inline var copyright: String
    @JvmName("copyrightProperty")
    get() = getCopyright()
    @JvmName("copyrightProperty")
    set(`value`) {
      setCopyright(value)
    }

  /**
   * The binary buffer attached to a .glb file.
   */
  public final inline var glbData: PackedByteArray
    @JvmName("glbDataProperty")
    get() = getGlbData()
    @JvmName("glbDataProperty")
    set(`value`) {
      setGlbData(value)
    }

  public final inline var useNamedSkinBinds: Boolean
    @JvmName("useNamedSkinBindsProperty")
    get() = getUseNamedSkinBinds()
    @JvmName("useNamedSkinBindsProperty")
    set(`value`) {
      setUseNamedSkinBinds(value)
    }

  public final inline var nodes: VariantArray<GLTFNode>
    @JvmName("nodesProperty")
    get() = getNodes()
    @JvmName("nodesProperty")
    set(`value`) {
      setNodes(value)
    }

  public final inline var buffers: VariantArray<PackedByteArray>
    @JvmName("buffersProperty")
    get() = getBuffers()
    @JvmName("buffersProperty")
    set(`value`) {
      setBuffers(value)
    }

  public final inline var bufferViews: VariantArray<GLTFBufferView>
    @JvmName("bufferViewsProperty")
    get() = getBufferViews()
    @JvmName("bufferViewsProperty")
    set(`value`) {
      setBufferViews(value)
    }

  public final inline var accessors: VariantArray<GLTFAccessor>
    @JvmName("accessorsProperty")
    get() = getAccessors()
    @JvmName("accessorsProperty")
    set(`value`) {
      setAccessors(value)
    }

  public final inline var meshes: VariantArray<GLTFMesh>
    @JvmName("meshesProperty")
    get() = getMeshes()
    @JvmName("meshesProperty")
    set(`value`) {
      setMeshes(value)
    }

  public final inline var materials: VariantArray<Material>
    @JvmName("materialsProperty")
    get() = getMaterials()
    @JvmName("materialsProperty")
    set(`value`) {
      setMaterials(value)
    }

  /**
   * The name of the scene. When importing, if not specified, this will be the file name. When
   * exporting, if specified, the scene name will be saved to the GLTF file.
   */
  public final inline var sceneName: String
    @JvmName("sceneNameProperty")
    get() = getSceneName()
    @JvmName("sceneNameProperty")
    set(`value`) {
      setSceneName(value)
    }

  /**
   * The folder path associated with this GLTF data. This is used to find other files the GLTF file
   * references, like images or binary buffers. This will be set during import when appending from a
   * file, and will be set during export when writing to a file.
   */
  public final inline var basePath: String
    @JvmName("basePathProperty")
    get() = getBasePath()
    @JvmName("basePathProperty")
    set(`value`) {
      setBasePath(value)
    }

  /**
   * The file name associated with this GLTF data. If it ends with `.gltf`, this is text-based GLTF,
   * otherwise this is binary GLB. This will be set during import when appending from a file, and will
   * be set during export when writing to a file. If writing to a buffer, this will be an empty string.
   */
  public final inline var filename: String
    @JvmName("filenameProperty")
    get() = getFilename()
    @JvmName("filenameProperty")
    set(`value`) {
      setFilename(value)
    }

  /**
   * The root nodes of the GLTF file. Typically, a GLTF file will only have one scene, and therefore
   * one root node. However, a GLTF file may have multiple scenes and therefore multiple root nodes,
   * which will be generated as siblings of each other and as children of the root node of the
   * generated Godot scene.
   */
  public final inline var rootNodes: PackedInt32Array
    @JvmName("rootNodesProperty")
    get() = getRootNodes()
    @JvmName("rootNodesProperty")
    set(`value`) {
      setRootNodes(value)
    }

  public final inline var textures: VariantArray<GLTFTexture>
    @JvmName("texturesProperty")
    get() = getTextures()
    @JvmName("texturesProperty")
    set(`value`) {
      setTextures(value)
    }

  public final inline var textureSamplers: VariantArray<GLTFTextureSampler>
    @JvmName("textureSamplersProperty")
    get() = getTextureSamplers()
    @JvmName("textureSamplersProperty")
    set(`value`) {
      setTextureSamplers(value)
    }

  public final inline var images: VariantArray<Texture2D>
    @JvmName("imagesProperty")
    get() = getImages()
    @JvmName("imagesProperty")
    set(`value`) {
      setImages(value)
    }

  public final inline var skins: VariantArray<GLTFSkin>
    @JvmName("skinsProperty")
    get() = getSkins()
    @JvmName("skinsProperty")
    set(`value`) {
      setSkins(value)
    }

  public final inline var cameras: VariantArray<GLTFCamera>
    @JvmName("camerasProperty")
    get() = getCameras()
    @JvmName("camerasProperty")
    set(`value`) {
      setCameras(value)
    }

  public final inline var lights: VariantArray<GLTFLight>
    @JvmName("lightsProperty")
    get() = getLights()
    @JvmName("lightsProperty")
    set(`value`) {
      setLights(value)
    }

  public final inline var uniqueNames: VariantArray<String>
    @JvmName("uniqueNamesProperty")
    get() = getUniqueNames()
    @JvmName("uniqueNamesProperty")
    set(`value`) {
      setUniqueNames(value)
    }

  public final inline var uniqueAnimationNames: VariantArray<String>
    @JvmName("uniqueAnimationNamesProperty")
    get() = getUniqueAnimationNames()
    @JvmName("uniqueAnimationNamesProperty")
    set(`value`) {
      setUniqueAnimationNames(value)
    }

  public final inline var skeletons: VariantArray<GLTFSkeleton>
    @JvmName("skeletonsProperty")
    get() = getSkeletons()
    @JvmName("skeletonsProperty")
    set(`value`) {
      setSkeletons(value)
    }

  public final inline var createAnimations: Boolean
    @JvmName("createAnimationsProperty")
    get() = getCreateAnimations()
    @JvmName("createAnimationsProperty")
    set(`value`) {
      setCreateAnimations(value)
    }

  /**
   * True to force all GLTFNodes in the document to be bones of a single Skeleton3D godot node.
   */
  public final inline var importAsSkeletonBones: Boolean
    @JvmName("importAsSkeletonBonesProperty")
    get() = getImportAsSkeletonBones()
    @JvmName("importAsSkeletonBonesProperty")
    set(`value`) {
      setImportAsSkeletonBones(value)
    }

  public final inline var animations: VariantArray<GLTFAnimation>
    @JvmName("animationsProperty")
    get() = getAnimations()
    @JvmName("animationsProperty")
    set(`value`) {
      setAnimations(value)
    }

  public final inline var handleBinaryImage: Int
    @JvmName("handleBinaryImageProperty")
    get() = getHandleBinaryImage()
    @JvmName("handleBinaryImageProperty")
    set(`value`) {
      setHandleBinaryImage(value)
    }

  /**
   * The baking fps of the animation for either import or export.
   */
  public final inline var bakeFps: Double
    @JvmName("bakeFpsProperty")
    get() = getBakeFps()
    @JvmName("bakeFpsProperty")
    set(`value`) {
      setBakeFps(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_GLTFSTATE_INDEX, scriptIndex)
  }

  /**
   * Appends an extension to the list of extensions used by this GLTF file during serialization. If
   * [required] is true, the extension will also be added to the list of required extensions. Do not
   * run this in [GLTFDocumentExtension.ExportPost], as that stage is too late to add extensions. The
   * final list is sorted alphabetically.
   */
  public final fun addUsedExtension(extensionName: String, required: Boolean): Unit {
    Internals.writeArguments(STRING to extensionName, BOOL to required)
    Internals.callMethod(rawPtr, MethodBindings.addUsedExtensionPtr, NIL)
  }

  /**
   * Appends the given byte array data to the buffers and creates a [GLTFBufferView] for it. The
   * index of the destination [GLTFBufferView] is returned. If [deduplication] is true, the buffers
   * will first be searched for duplicate data, otherwise new bytes will always be appended.
   */
  public final fun appendDataToBuffers(`data`: PackedByteArray, deduplication: Boolean): Int {
    Internals.writeArguments(PACKED_BYTE_ARRAY to data, BOOL to deduplication)
    Internals.callMethod(rawPtr, MethodBindings.appendDataToBuffersPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun getJson(): Dictionary<Any?, Any?> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getJsonPtr, DICTIONARY)
    return (Internals.readReturnValue(DICTIONARY) as Dictionary<Any?, Any?>)
  }

  public final fun setJson(json: Dictionary<Any?, Any?>): Unit {
    Internals.writeArguments(DICTIONARY to json)
    Internals.callMethod(rawPtr, MethodBindings.setJsonPtr, NIL)
  }

  public final fun getMajorVersion(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMajorVersionPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setMajorVersion(majorVersion: Int): Unit {
    Internals.writeArguments(LONG to majorVersion.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setMajorVersionPtr, NIL)
  }

  public final fun getMinorVersion(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMinorVersionPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setMinorVersion(minorVersion: Int): Unit {
    Internals.writeArguments(LONG to minorVersion.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setMinorVersionPtr, NIL)
  }

  public final fun getCopyright(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCopyrightPtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  public final fun setCopyright(copyright: String): Unit {
    Internals.writeArguments(STRING to copyright)
    Internals.callMethod(rawPtr, MethodBindings.setCopyrightPtr, NIL)
  }

  public final fun getGlbData(): PackedByteArray {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getGlbDataPtr, PACKED_BYTE_ARRAY)
    return (Internals.readReturnValue(PACKED_BYTE_ARRAY) as PackedByteArray)
  }

  public final fun setGlbData(glbData: PackedByteArray): Unit {
    Internals.writeArguments(PACKED_BYTE_ARRAY to glbData)
    Internals.callMethod(rawPtr, MethodBindings.setGlbDataPtr, NIL)
  }

  public final fun getUseNamedSkinBinds(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getUseNamedSkinBindsPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setUseNamedSkinBinds(useNamedSkinBinds: Boolean): Unit {
    Internals.writeArguments(BOOL to useNamedSkinBinds)
    Internals.callMethod(rawPtr, MethodBindings.setUseNamedSkinBindsPtr, NIL)
  }

  /**
   * Returns an array of all [GLTFNode]s in the GLTF file. These are the nodes that
   * [GLTFNode.children] and [rootNodes] refer to. This includes nodes that may not be generated in the
   * Godot scene, or nodes that may generate multiple Godot scene nodes.
   */
  public final fun getNodes(): VariantArray<GLTFNode> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getNodesPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<GLTFNode>)
  }

  /**
   * Sets the [GLTFNode]s in the state. These are the nodes that [GLTFNode.children] and [rootNodes]
   * refer to. Some of the nodes set here may not be generated in the Godot scene, or may generate
   * multiple Godot scene nodes.
   */
  public final fun setNodes(nodes: VariantArray<GLTFNode>): Unit {
    Internals.writeArguments(ARRAY to nodes)
    Internals.callMethod(rawPtr, MethodBindings.setNodesPtr, NIL)
  }

  public final fun getBuffers(): VariantArray<PackedByteArray> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBuffersPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<PackedByteArray>)
  }

  public final fun setBuffers(buffers: VariantArray<PackedByteArray>): Unit {
    Internals.writeArguments(ARRAY to buffers)
    Internals.callMethod(rawPtr, MethodBindings.setBuffersPtr, NIL)
  }

  public final fun getBufferViews(): VariantArray<GLTFBufferView> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBufferViewsPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<GLTFBufferView>)
  }

  public final fun setBufferViews(bufferViews: VariantArray<GLTFBufferView>): Unit {
    Internals.writeArguments(ARRAY to bufferViews)
    Internals.callMethod(rawPtr, MethodBindings.setBufferViewsPtr, NIL)
  }

  public final fun getAccessors(): VariantArray<GLTFAccessor> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAccessorsPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<GLTFAccessor>)
  }

  public final fun setAccessors(accessors: VariantArray<GLTFAccessor>): Unit {
    Internals.writeArguments(ARRAY to accessors)
    Internals.callMethod(rawPtr, MethodBindings.setAccessorsPtr, NIL)
  }

  /**
   * Returns an array of all [GLTFMesh]es in the GLTF file. These are the meshes that the
   * [GLTFNode.mesh] index refers to.
   */
  public final fun getMeshes(): VariantArray<GLTFMesh> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMeshesPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<GLTFMesh>)
  }

  /**
   * Sets the [GLTFMesh]es in the state. These are the meshes that the [GLTFNode.mesh] index refers
   * to.
   */
  public final fun setMeshes(meshes: VariantArray<GLTFMesh>): Unit {
    Internals.writeArguments(ARRAY to meshes)
    Internals.callMethod(rawPtr, MethodBindings.setMeshesPtr, NIL)
  }

  /**
   * Returns the number of [AnimationPlayer] nodes in this [GLTFState]. These nodes are only used
   * during the export process when converting Godot [AnimationPlayer] nodes to GLTF animations.
   */
  public final fun getAnimationPlayersCount(idx: Int): Int {
    Internals.writeArguments(LONG to idx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getAnimationPlayersCountPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the [AnimationPlayer] node with the given index. These nodes are only used during the
   * export process when converting Godot [AnimationPlayer] nodes to GLTF animations.
   */
  public final fun getAnimationPlayer(idx: Int): AnimationPlayer? {
    Internals.writeArguments(LONG to idx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getAnimationPlayerPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as AnimationPlayer?)
  }

  public final fun getMaterials(): VariantArray<Material> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getMaterialsPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<Material>)
  }

  public final fun setMaterials(materials: VariantArray<Material>): Unit {
    Internals.writeArguments(ARRAY to materials)
    Internals.callMethod(rawPtr, MethodBindings.setMaterialsPtr, NIL)
  }

  public final fun getSceneName(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSceneNamePtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  public final fun setSceneName(sceneName: String): Unit {
    Internals.writeArguments(STRING to sceneName)
    Internals.callMethod(rawPtr, MethodBindings.setSceneNamePtr, NIL)
  }

  public final fun getBasePath(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBasePathPtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  public final fun setBasePath(basePath: String): Unit {
    Internals.writeArguments(STRING to basePath)
    Internals.callMethod(rawPtr, MethodBindings.setBasePathPtr, NIL)
  }

  public final fun getFilename(): String {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFilenamePtr, STRING)
    return (Internals.readReturnValue(STRING) as String)
  }

  public final fun setFilename(filename: String): Unit {
    Internals.writeArguments(STRING to filename)
    Internals.callMethod(rawPtr, MethodBindings.setFilenamePtr, NIL)
  }

  public final fun getRootNodes(): PackedInt32Array {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRootNodesPtr, PACKED_INT_32_ARRAY)
    return (Internals.readReturnValue(PACKED_INT_32_ARRAY) as PackedInt32Array)
  }

  public final fun setRootNodes(rootNodes: PackedInt32Array): Unit {
    Internals.writeArguments(PACKED_INT_32_ARRAY to rootNodes)
    Internals.callMethod(rawPtr, MethodBindings.setRootNodesPtr, NIL)
  }

  public final fun getTextures(): VariantArray<GLTFTexture> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTexturesPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<GLTFTexture>)
  }

  public final fun setTextures(textures: VariantArray<GLTFTexture>): Unit {
    Internals.writeArguments(ARRAY to textures)
    Internals.callMethod(rawPtr, MethodBindings.setTexturesPtr, NIL)
  }

  /**
   * Retrieves the array of texture samplers that are used by the textures contained in the GLTF.
   */
  public final fun getTextureSamplers(): VariantArray<GLTFTextureSampler> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTextureSamplersPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<GLTFTextureSampler>)
  }

  /**
   * Sets the array of texture samplers that are used by the textures contained in the GLTF.
   */
  public final fun setTextureSamplers(textureSamplers: VariantArray<GLTFTextureSampler>): Unit {
    Internals.writeArguments(ARRAY to textureSamplers)
    Internals.callMethod(rawPtr, MethodBindings.setTextureSamplersPtr, NIL)
  }

  /**
   * Gets the images of the GLTF file as an array of [Texture2D]s. These are the images that the
   * [GLTFTexture.srcImage] index refers to.
   */
  public final fun getImages(): VariantArray<Texture2D> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getImagesPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<Texture2D>)
  }

  /**
   * Sets the images in the state stored as an array of [Texture2D]s. This can be used during
   * export. These are the images that the [GLTFTexture.srcImage] index refers to.
   */
  public final fun setImages(images: VariantArray<Texture2D>): Unit {
    Internals.writeArguments(ARRAY to images)
    Internals.callMethod(rawPtr, MethodBindings.setImagesPtr, NIL)
  }

  /**
   * Returns an array of all [GLTFSkin]s in the GLTF file. These are the skins that the
   * [GLTFNode.skin] index refers to.
   */
  public final fun getSkins(): VariantArray<GLTFSkin> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSkinsPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<GLTFSkin>)
  }

  /**
   * Sets the [GLTFSkin]s in the state. These are the skins that the [GLTFNode.skin] index refers
   * to.
   */
  public final fun setSkins(skins: VariantArray<GLTFSkin>): Unit {
    Internals.writeArguments(ARRAY to skins)
    Internals.callMethod(rawPtr, MethodBindings.setSkinsPtr, NIL)
  }

  /**
   * Returns an array of all [GLTFCamera]s in the GLTF file. These are the cameras that the
   * [GLTFNode.camera] index refers to.
   */
  public final fun getCameras(): VariantArray<GLTFCamera> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCamerasPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<GLTFCamera>)
  }

  /**
   * Sets the [GLTFCamera]s in the state. These are the cameras that the [GLTFNode.camera] index
   * refers to.
   */
  public final fun setCameras(cameras: VariantArray<GLTFCamera>): Unit {
    Internals.writeArguments(ARRAY to cameras)
    Internals.callMethod(rawPtr, MethodBindings.setCamerasPtr, NIL)
  }

  /**
   * Returns an array of all [GLTFLight]s in the GLTF file. These are the lights that the
   * [GLTFNode.light] index refers to.
   */
  public final fun getLights(): VariantArray<GLTFLight> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getLightsPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<GLTFLight>)
  }

  /**
   * Sets the [GLTFLight]s in the state. These are the lights that the [GLTFNode.light] index refers
   * to.
   */
  public final fun setLights(lights: VariantArray<GLTFLight>): Unit {
    Internals.writeArguments(ARRAY to lights)
    Internals.callMethod(rawPtr, MethodBindings.setLightsPtr, NIL)
  }

  /**
   * Returns an array of unique node names. This is used in both the import process and export
   * process.
   */
  public final fun getUniqueNames(): VariantArray<String> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getUniqueNamesPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<String>)
  }

  /**
   * Sets the unique node names in the state. This is used in both the import process and export
   * process.
   */
  public final fun setUniqueNames(uniqueNames: VariantArray<String>): Unit {
    Internals.writeArguments(ARRAY to uniqueNames)
    Internals.callMethod(rawPtr, MethodBindings.setUniqueNamesPtr, NIL)
  }

  /**
   * Returns an array of unique animation names. This is only used during the import process.
   */
  public final fun getUniqueAnimationNames(): VariantArray<String> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getUniqueAnimationNamesPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<String>)
  }

  /**
   * Sets the unique animation names in the state. This is only used during the import process.
   */
  public final fun setUniqueAnimationNames(uniqueAnimationNames: VariantArray<String>): Unit {
    Internals.writeArguments(ARRAY to uniqueAnimationNames)
    Internals.callMethod(rawPtr, MethodBindings.setUniqueAnimationNamesPtr, NIL)
  }

  /**
   * Returns an array of all [GLTFSkeleton]s in the GLTF file. These are the skeletons that the
   * [GLTFNode.skeleton] index refers to.
   */
  public final fun getSkeletons(): VariantArray<GLTFSkeleton> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getSkeletonsPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<GLTFSkeleton>)
  }

  /**
   * Sets the [GLTFSkeleton]s in the state. These are the skeletons that the [GLTFNode.skeleton]
   * index refers to.
   */
  public final fun setSkeletons(skeletons: VariantArray<GLTFSkeleton>): Unit {
    Internals.writeArguments(ARRAY to skeletons)
    Internals.callMethod(rawPtr, MethodBindings.setSkeletonsPtr, NIL)
  }

  public final fun getCreateAnimations(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCreateAnimationsPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setCreateAnimations(createAnimations: Boolean): Unit {
    Internals.writeArguments(BOOL to createAnimations)
    Internals.callMethod(rawPtr, MethodBindings.setCreateAnimationsPtr, NIL)
  }

  public final fun getImportAsSkeletonBones(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getImportAsSkeletonBonesPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setImportAsSkeletonBones(importAsSkeletonBones: Boolean): Unit {
    Internals.writeArguments(BOOL to importAsSkeletonBones)
    Internals.callMethod(rawPtr, MethodBindings.setImportAsSkeletonBonesPtr, NIL)
  }

  /**
   * Returns an array of all [GLTFAnimation]s in the GLTF file. When importing, these will be
   * generated as animations in an [AnimationPlayer] node. When exporting, these will be generated from
   * Godot [AnimationPlayer] nodes.
   */
  public final fun getAnimations(): VariantArray<GLTFAnimation> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getAnimationsPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<GLTFAnimation>)
  }

  /**
   * Sets the [GLTFAnimation]s in the state. When importing, these will be generated as animations
   * in an [AnimationPlayer] node. When exporting, these will be generated from Godot [AnimationPlayer]
   * nodes.
   */
  public final fun setAnimations(animations: VariantArray<GLTFAnimation>): Unit {
    Internals.writeArguments(ARRAY to animations)
    Internals.callMethod(rawPtr, MethodBindings.setAnimationsPtr, NIL)
  }

  /**
   * Returns the Godot scene node that corresponds to the same index as the [GLTFNode] it was
   * generated from. This is the inverse of [getNodeIndex]. Useful during the import process.
   * **Note:** Not every [GLTFNode] will have a scene node generated, and not every generated scene
   * node will have a corresponding [GLTFNode]. If there is no scene node for this [GLTFNode] index,
   * `null` is returned.
   */
  public final fun getSceneNode(idx: Int): Node? {
    Internals.writeArguments(LONG to idx.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getSceneNodePtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Node?)
  }

  /**
   * Returns the index of the [GLTFNode] corresponding to this Godot scene node. This is the inverse
   * of [getSceneNode]. Useful during the export process.
   * **Note:** Not every Godot scene node will have a corresponding [GLTFNode], and not every
   * [GLTFNode] will have a scene node generated. If there is no [GLTFNode] index for this scene node,
   * `-1` is returned.
   */
  public final fun getNodeIndex(sceneNode: Node?): Int {
    Internals.writeArguments(OBJECT to sceneNode)
    Internals.callMethod(rawPtr, MethodBindings.getNodeIndexPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Gets additional arbitrary data in this [GLTFState] instance. This can be used to keep per-file
   * state data in [GLTFDocumentExtension] classes, which is important because they are stateless.
   * The argument should be the [GLTFDocumentExtension] name (does not have to match the extension
   * name in the GLTF file), and the return value can be anything you set. If nothing was set, the
   * return value is null.
   */
  public final fun getAdditionalData(extensionName: StringName): Any? {
    Internals.writeArguments(STRING_NAME to extensionName)
    Internals.callMethod(rawPtr, MethodBindings.getAdditionalDataPtr, ANY)
    return (Internals.readReturnValue(ANY) as Any?)
  }

  /**
   * Sets additional arbitrary data in this [GLTFState] instance. This can be used to keep per-file
   * state data in [GLTFDocumentExtension] classes, which is important because they are stateless.
   * The first argument should be the [GLTFDocumentExtension] name (does not have to match the
   * extension name in the GLTF file), and the second argument can be anything you want.
   */
  public final fun setAdditionalData(extensionName: StringName, additionalData: Any?): Unit {
    Internals.writeArguments(STRING_NAME to extensionName, ANY to additionalData)
    Internals.callMethod(rawPtr, MethodBindings.setAdditionalDataPtr, NIL)
  }

  public final fun getHandleBinaryImage(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getHandleBinaryImagePtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setHandleBinaryImage(method: Int): Unit {
    Internals.writeArguments(LONG to method.toLong())
    Internals.callMethod(rawPtr, MethodBindings.setHandleBinaryImagePtr, NIL)
  }

  public final fun setBakeFps(`value`: Double): Unit {
    Internals.writeArguments(DOUBLE to value)
    Internals.callMethod(rawPtr, MethodBindings.setBakeFpsPtr, NIL)
  }

  public final fun getBakeFps(): Double {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getBakeFpsPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double)
  }

  public companion object {
    /**
     * Discards all embedded textures and uses untextured materials.
     */
    public final const val HANDLE_BINARY_DISCARD_TEXTURES: Long = 0

    /**
     * Extracts embedded textures to be reimported and compressed. Editor only. Acts as uncompressed
     * at runtime.
     */
    public final const val HANDLE_BINARY_EXTRACT_TEXTURES: Long = 1

    /**
     * Embeds textures VRAM compressed with Basis Universal into the generated scene.
     */
    public final const val HANDLE_BINARY_EMBED_AS_BASISU: Long = 2

    /**
     * Embeds textures compressed losslessly into the generated scene, matching old behavior.
     */
    public final const val HANDLE_BINARY_EMBED_AS_UNCOMPRESSED: Long = 3
  }

  internal object MethodBindings {
    public val addUsedExtensionPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFState", "add_used_extension", 2678287736)

    public val appendDataToBuffersPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFState", "append_data_to_buffers", 1460416665)

    public val getJsonPtr: VoidPtr = Internals.getMethodBindPtr("GLTFState", "get_json", 2382534195)

    public val setJsonPtr: VoidPtr = Internals.getMethodBindPtr("GLTFState", "set_json", 4155329257)

    public val getMajorVersionPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFState", "get_major_version", 2455072627)

    public val setMajorVersionPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFState", "set_major_version", 1286410249)

    public val getMinorVersionPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFState", "get_minor_version", 2455072627)

    public val setMinorVersionPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFState", "set_minor_version", 1286410249)

    public val getCopyrightPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFState", "get_copyright", 201670096)

    public val setCopyrightPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFState", "set_copyright", 83702148)

    public val getGlbDataPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFState", "get_glb_data", 2115431945)

    public val setGlbDataPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFState", "set_glb_data", 2971499966)

    public val getUseNamedSkinBindsPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFState", "get_use_named_skin_binds", 2240911060)

    public val setUseNamedSkinBindsPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFState", "set_use_named_skin_binds", 2586408642)

    public val getNodesPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFState", "get_nodes", 2915620761)

    public val setNodesPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFState", "set_nodes", 381264803)

    public val getBuffersPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFState", "get_buffers", 2915620761)

    public val setBuffersPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFState", "set_buffers", 381264803)

    public val getBufferViewsPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFState", "get_buffer_views", 2915620761)

    public val setBufferViewsPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFState", "set_buffer_views", 381264803)

    public val getAccessorsPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFState", "get_accessors", 2915620761)

    public val setAccessorsPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFState", "set_accessors", 381264803)

    public val getMeshesPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFState", "get_meshes", 2915620761)

    public val setMeshesPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFState", "set_meshes", 381264803)

    public val getAnimationPlayersCountPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFState", "get_animation_players_count", 3744713108)

    public val getAnimationPlayerPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFState", "get_animation_player", 925043400)

    public val getMaterialsPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFState", "get_materials", 2915620761)

    public val setMaterialsPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFState", "set_materials", 381264803)

    public val getSceneNamePtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFState", "get_scene_name", 2841200299)

    public val setSceneNamePtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFState", "set_scene_name", 83702148)

    public val getBasePathPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFState", "get_base_path", 2841200299)

    public val setBasePathPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFState", "set_base_path", 83702148)

    public val getFilenamePtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFState", "get_filename", 201670096)

    public val setFilenamePtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFState", "set_filename", 83702148)

    public val getRootNodesPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFState", "get_root_nodes", 969006518)

    public val setRootNodesPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFState", "set_root_nodes", 3614634198)

    public val getTexturesPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFState", "get_textures", 2915620761)

    public val setTexturesPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFState", "set_textures", 381264803)

    public val getTextureSamplersPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFState", "get_texture_samplers", 2915620761)

    public val setTextureSamplersPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFState", "set_texture_samplers", 381264803)

    public val getImagesPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFState", "get_images", 2915620761)

    public val setImagesPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFState", "set_images", 381264803)

    public val getSkinsPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFState", "get_skins", 2915620761)

    public val setSkinsPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFState", "set_skins", 381264803)

    public val getCamerasPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFState", "get_cameras", 2915620761)

    public val setCamerasPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFState", "set_cameras", 381264803)

    public val getLightsPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFState", "get_lights", 2915620761)

    public val setLightsPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFState", "set_lights", 381264803)

    public val getUniqueNamesPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFState", "get_unique_names", 2915620761)

    public val setUniqueNamesPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFState", "set_unique_names", 381264803)

    public val getUniqueAnimationNamesPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFState", "get_unique_animation_names", 2915620761)

    public val setUniqueAnimationNamesPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFState", "set_unique_animation_names", 381264803)

    public val getSkeletonsPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFState", "get_skeletons", 2915620761)

    public val setSkeletonsPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFState", "set_skeletons", 381264803)

    public val getCreateAnimationsPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFState", "get_create_animations", 2240911060)

    public val setCreateAnimationsPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFState", "set_create_animations", 2586408642)

    public val getImportAsSkeletonBonesPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFState", "get_import_as_skeleton_bones", 2240911060)

    public val setImportAsSkeletonBonesPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFState", "set_import_as_skeleton_bones", 2586408642)

    public val getAnimationsPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFState", "get_animations", 2915620761)

    public val setAnimationsPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFState", "set_animations", 381264803)

    public val getSceneNodePtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFState", "get_scene_node", 4253421667)

    public val getNodeIndexPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFState", "get_node_index", 1205807060)

    public val getAdditionalDataPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFState", "get_additional_data", 2138907829)

    public val setAdditionalDataPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFState", "set_additional_data", 3776071444)

    public val getHandleBinaryImagePtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFState", "get_handle_binary_image", 2455072627)

    public val setHandleBinaryImagePtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFState", "set_handle_binary_image", 1286410249)

    public val setBakeFpsPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFState", "set_bake_fps", 373806689)

    public val getBakeFpsPtr: VoidPtr =
        Internals.getMethodBindPtr("GLTFState", "get_bake_fps", 1740695150)
  }
}
