// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
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
import godot.core.asCachedStringName
import kotlin.Any
import kotlin.Boolean
import kotlin.Byte
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Contains all nodes and resources of a glTF file. This is used by [GLTFDocument] as data storage,
 * which allows [GLTFDocument] and all [GLTFDocumentExtension] classes to remain stateless.
 *
 * GLTFState can be populated by [GLTFDocument] reading a file or by converting a Godot scene. Then
 * the data can either be used to create a Godot scene or save to a glTF file. The code that converts
 * to/from a Godot scene can be intercepted at arbitrary points by [GLTFDocumentExtension] classes.
 * This allows for custom data to be stored in the glTF file or for custom data to be converted to/from
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
   * The copyright string in the asset header of the glTF file. This is set during import if present
   * and export if non-empty. See the glTF asset header documentation for more information.
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
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
   */
  @CoreTypeLocalCopy
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
   * exporting, if specified, the scene name will be saved to the glTF file.
   */
  public final inline var sceneName: String
    @JvmName("sceneNameProperty")
    get() = getSceneName()
    @JvmName("sceneNameProperty")
    set(`value`) {
      setSceneName(value)
    }

  /**
   * The folder path associated with this glTF data. This is used to find other files the glTF file
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
   * The file name associated with this glTF data. If it ends with `.gltf`, this is text-based glTF,
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
   * The root nodes of the glTF file. Typically, a glTF file will only have one scene, and therefore
   * one root node. However, a glTF file may have multiple scenes and therefore multiple root nodes,
   * which will be generated as siblings of each other and as children of the root node of the
   * generated Godot scene.
   *
   * **Warning:**
   * Be careful when trying to modify a local
   * [copy](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types) obtained from this
   * getter.
   * Mutating it alone won't have any effect on the actual property, it has to be reassigned again
   * afterward.
   */
  @CoreTypeLocalCopy
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
   * If `true`, forces all GLTFNodes in the document to be bones of a single [Skeleton3D] Godot
   * node.
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
    createNativeObject(247, scriptIndex)
  }

  /**
   * This is a helper function for [glbData] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = gltfstate.glbData
   * //Your changes
   * gltfstate.glbData = myCoreType
   * ``````
   *
   * The binary buffer attached to a .glb file.
   */
  @CoreTypeHelper
  public final fun glbDataMutate(block: PackedByteArray.() -> Unit): PackedByteArray =
      glbData.apply {
     block(this)
     glbData = this
  }

  /**
   * This is a helper function for [glbData] to make dealing with local copies easier.
   * Allow to directly modify each element of the local copy of the property and assign it back to
   * the Object.
   *
   * The binary buffer attached to a .glb file.
   */
  @CoreTypeHelper
  public final fun glbDataMutateEach(block: (index: Int, `value`: Byte) -> Unit): PackedByteArray =
      glbData.apply {
     this.forEachIndexed { index, value ->
         block(index, value)
         this[index] = value
     }
     glbData = this
  }

  /**
   * This is a helper function for [rootNodes] to make dealing with local copies easier.
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = gltfstate.rootNodes
   * //Your changes
   * gltfstate.rootNodes = myCoreType
   * ``````
   *
   * The root nodes of the glTF file. Typically, a glTF file will only have one scene, and therefore
   * one root node. However, a glTF file may have multiple scenes and therefore multiple root nodes,
   * which will be generated as siblings of each other and as children of the root node of the
   * generated Godot scene.
   */
  @CoreTypeHelper
  public final fun rootNodesMutate(block: PackedInt32Array.() -> Unit): PackedInt32Array =
      rootNodes.apply {
     block(this)
     rootNodes = this
  }

  /**
   * This is a helper function for [rootNodes] to make dealing with local copies easier.
   * Allow to directly modify each element of the local copy of the property and assign it back to
   * the Object.
   *
   * The root nodes of the glTF file. Typically, a glTF file will only have one scene, and therefore
   * one root node. However, a glTF file may have multiple scenes and therefore multiple root nodes,
   * which will be generated as siblings of each other and as children of the root node of the
   * generated Godot scene.
   */
  @CoreTypeHelper
  public final fun rootNodesMutateEach(block: (index: Int, `value`: Int) -> Unit): PackedInt32Array
      = rootNodes.apply {
     this.forEachIndexed { index, value ->
         block(index, value)
         this[index] = value
     }
     rootNodes = this
  }

  /**
   * Appends an extension to the list of extensions used by this glTF file during serialization. If
   * [required] is `true`, the extension will also be added to the list of required extensions. Do not
   * run this in [GLTFDocumentExtension.ExportPost], as that stage is too late to add extensions. The
   * final list is sorted alphabetically.
   */
  public final fun addUsedExtension(extensionName: String, required: Boolean): Unit {
    TransferContext.writeArguments(STRING to extensionName, BOOL to required)
    TransferContext.callMethod(ptr, MethodBindings.addUsedExtensionPtr, NIL)
  }

  /**
   * Appends the given byte array [data] to the buffers and creates a [GLTFBufferView] for it. The
   * index of the destination [GLTFBufferView] is returned. If [deduplication] is `true`, the buffers
   * are first searched for duplicate data, otherwise new bytes are always appended.
   */
  public final fun appendDataToBuffers(`data`: PackedByteArray, deduplication: Boolean): Int {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to data, BOOL to deduplication)
    TransferContext.callMethod(ptr, MethodBindings.appendDataToBuffersPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Appends the given [GLTFNode] to the state, and returns its new index. This can be used to
   * export one Godot node as multiple glTF nodes, or inject new glTF nodes at import time. On import,
   * this must be called before [GLTFDocumentExtension.GenerateSceneNode] finishes for the parent node.
   * On export, this must be called before [GLTFDocumentExtension.ExportNode] runs for the parent node.
   *
   * The [godotSceneNode] parameter is the Godot scene node that corresponds to this glTF node. This
   * is highly recommended to be set to a valid node, but may be `null` if there is no corresponding
   * Godot scene node. One Godot scene node may be used for multiple glTF nodes, so if exporting
   * multiple glTF nodes for one Godot scene node, use the same Godot scene node for each.
   *
   * The [parentNodeIndex] parameter is the index of the parent [GLTFNode] in the state. If `-1`,
   * the node will be a root node, otherwise the new node will be added to the parent's list of
   * children. The index will also be written to the [GLTFNode.parent] property of the new node.
   */
  public final fun appendGltfNode(
    gltfNode: GLTFNode?,
    godotSceneNode: Node?,
    parentNodeIndex: Int,
  ): Int {
    TransferContext.writeArguments(OBJECT to gltfNode, OBJECT to godotSceneNode, LONG to parentNodeIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.appendGltfNodePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun getJson(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getJsonPtr, DICTIONARY)
    return (TransferContext.readReturnValue(DICTIONARY) as Dictionary<Any?, Any?>)
  }

  public final fun setJson(json: Dictionary<Any?, Any?>): Unit {
    TransferContext.writeArguments(DICTIONARY to json)
    TransferContext.callMethod(ptr, MethodBindings.setJsonPtr, NIL)
  }

  public final fun getMajorVersion(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMajorVersionPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setMajorVersion(majorVersion: Int): Unit {
    TransferContext.writeArguments(LONG to majorVersion.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setMajorVersionPtr, NIL)
  }

  public final fun getMinorVersion(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMinorVersionPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setMinorVersion(minorVersion: Int): Unit {
    TransferContext.writeArguments(LONG to minorVersion.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setMinorVersionPtr, NIL)
  }

  public final fun getCopyright(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCopyrightPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  public final fun setCopyright(copyright: String): Unit {
    TransferContext.writeArguments(STRING to copyright)
    TransferContext.callMethod(ptr, MethodBindings.setCopyrightPtr, NIL)
  }

  public final fun getGlbData(): PackedByteArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getGlbDataPtr, PACKED_BYTE_ARRAY)
    return (TransferContext.readReturnValue(PACKED_BYTE_ARRAY) as PackedByteArray)
  }

  public final fun setGlbData(glbData: PackedByteArray): Unit {
    TransferContext.writeArguments(PACKED_BYTE_ARRAY to glbData)
    TransferContext.callMethod(ptr, MethodBindings.setGlbDataPtr, NIL)
  }

  public final fun getUseNamedSkinBinds(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getUseNamedSkinBindsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setUseNamedSkinBinds(useNamedSkinBinds: Boolean): Unit {
    TransferContext.writeArguments(BOOL to useNamedSkinBinds)
    TransferContext.callMethod(ptr, MethodBindings.setUseNamedSkinBindsPtr, NIL)
  }

  /**
   * Returns an array of all [GLTFNode]s in the glTF file. These are the nodes that
   * [GLTFNode.children] and [rootNodes] refer to. This includes nodes that may not be generated in the
   * Godot scene, or nodes that may generate multiple Godot scene nodes.
   */
  public final fun getNodes(): VariantArray<GLTFNode> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getNodesPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<GLTFNode>)
  }

  /**
   * Sets the [GLTFNode]s in the state. These are the nodes that [GLTFNode.children] and [rootNodes]
   * refer to. Some of the nodes set here may not be generated in the Godot scene, or may generate
   * multiple Godot scene nodes.
   */
  public final fun setNodes(nodes: VariantArray<GLTFNode>): Unit {
    TransferContext.writeArguments(ARRAY to nodes)
    TransferContext.callMethod(ptr, MethodBindings.setNodesPtr, NIL)
  }

  public final fun getBuffers(): VariantArray<PackedByteArray> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBuffersPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<PackedByteArray>)
  }

  public final fun setBuffers(buffers: VariantArray<PackedByteArray>): Unit {
    TransferContext.writeArguments(ARRAY to buffers)
    TransferContext.callMethod(ptr, MethodBindings.setBuffersPtr, NIL)
  }

  public final fun getBufferViews(): VariantArray<GLTFBufferView> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBufferViewsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<GLTFBufferView>)
  }

  public final fun setBufferViews(bufferViews: VariantArray<GLTFBufferView>): Unit {
    TransferContext.writeArguments(ARRAY to bufferViews)
    TransferContext.callMethod(ptr, MethodBindings.setBufferViewsPtr, NIL)
  }

  public final fun getAccessors(): VariantArray<GLTFAccessor> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAccessorsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<GLTFAccessor>)
  }

  public final fun setAccessors(accessors: VariantArray<GLTFAccessor>): Unit {
    TransferContext.writeArguments(ARRAY to accessors)
    TransferContext.callMethod(ptr, MethodBindings.setAccessorsPtr, NIL)
  }

  /**
   * Returns an array of all [GLTFMesh]es in the glTF file. These are the meshes that the
   * [GLTFNode.mesh] index refers to.
   */
  public final fun getMeshes(): VariantArray<GLTFMesh> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMeshesPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<GLTFMesh>)
  }

  /**
   * Sets the [GLTFMesh]es in the state. These are the meshes that the [GLTFNode.mesh] index refers
   * to.
   */
  public final fun setMeshes(meshes: VariantArray<GLTFMesh>): Unit {
    TransferContext.writeArguments(ARRAY to meshes)
    TransferContext.callMethod(ptr, MethodBindings.setMeshesPtr, NIL)
  }

  /**
   * Returns the number of [AnimationPlayer] nodes in this [GLTFState]. These nodes are only used
   * during the export process when converting Godot [AnimationPlayer] nodes to glTF animations.
   */
  public final fun getAnimationPlayersCount(idx: Int): Int {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getAnimationPlayersCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the [AnimationPlayer] node with the given index. These nodes are only used during the
   * export process when converting Godot [AnimationPlayer] nodes to glTF animations.
   */
  public final fun getAnimationPlayer(idx: Int): AnimationPlayer? {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getAnimationPlayerPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as AnimationPlayer?)
  }

  public final fun getMaterials(): VariantArray<Material> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMaterialsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Material>)
  }

  public final fun setMaterials(materials: VariantArray<Material>): Unit {
    TransferContext.writeArguments(ARRAY to materials)
    TransferContext.callMethod(ptr, MethodBindings.setMaterialsPtr, NIL)
  }

  public final fun getSceneName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSceneNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  public final fun setSceneName(sceneName: String): Unit {
    TransferContext.writeArguments(STRING to sceneName)
    TransferContext.callMethod(ptr, MethodBindings.setSceneNamePtr, NIL)
  }

  public final fun getBasePath(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBasePathPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  public final fun setBasePath(basePath: String): Unit {
    TransferContext.writeArguments(STRING to basePath)
    TransferContext.callMethod(ptr, MethodBindings.setBasePathPtr, NIL)
  }

  public final fun getFilename(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFilenamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  public final fun setFilename(filename: String): Unit {
    TransferContext.writeArguments(STRING to filename)
    TransferContext.callMethod(ptr, MethodBindings.setFilenamePtr, NIL)
  }

  public final fun getRootNodes(): PackedInt32Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRootNodesPtr, PACKED_INT_32_ARRAY)
    return (TransferContext.readReturnValue(PACKED_INT_32_ARRAY) as PackedInt32Array)
  }

  public final fun setRootNodes(rootNodes: PackedInt32Array): Unit {
    TransferContext.writeArguments(PACKED_INT_32_ARRAY to rootNodes)
    TransferContext.callMethod(ptr, MethodBindings.setRootNodesPtr, NIL)
  }

  public final fun getTextures(): VariantArray<GLTFTexture> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTexturesPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<GLTFTexture>)
  }

  public final fun setTextures(textures: VariantArray<GLTFTexture>): Unit {
    TransferContext.writeArguments(ARRAY to textures)
    TransferContext.callMethod(ptr, MethodBindings.setTexturesPtr, NIL)
  }

  /**
   * Retrieves the array of texture samplers that are used by the textures contained in the glTF.
   */
  public final fun getTextureSamplers(): VariantArray<GLTFTextureSampler> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTextureSamplersPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<GLTFTextureSampler>)
  }

  /**
   * Sets the array of texture samplers that are used by the textures contained in the glTF.
   */
  public final fun setTextureSamplers(textureSamplers: VariantArray<GLTFTextureSampler>): Unit {
    TransferContext.writeArguments(ARRAY to textureSamplers)
    TransferContext.callMethod(ptr, MethodBindings.setTextureSamplersPtr, NIL)
  }

  /**
   * Gets the images of the glTF file as an array of [Texture2D]s. These are the images that the
   * [GLTFTexture.srcImage] index refers to.
   */
  public final fun getImages(): VariantArray<Texture2D> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getImagesPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Texture2D>)
  }

  /**
   * Sets the images in the state stored as an array of [Texture2D]s. This can be used during
   * export. These are the images that the [GLTFTexture.srcImage] index refers to.
   */
  public final fun setImages(images: VariantArray<Texture2D>): Unit {
    TransferContext.writeArguments(ARRAY to images)
    TransferContext.callMethod(ptr, MethodBindings.setImagesPtr, NIL)
  }

  /**
   * Returns an array of all [GLTFSkin]s in the glTF file. These are the skins that the
   * [GLTFNode.skin] index refers to.
   */
  public final fun getSkins(): VariantArray<GLTFSkin> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSkinsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<GLTFSkin>)
  }

  /**
   * Sets the [GLTFSkin]s in the state. These are the skins that the [GLTFNode.skin] index refers
   * to.
   */
  public final fun setSkins(skins: VariantArray<GLTFSkin>): Unit {
    TransferContext.writeArguments(ARRAY to skins)
    TransferContext.callMethod(ptr, MethodBindings.setSkinsPtr, NIL)
  }

  /**
   * Returns an array of all [GLTFCamera]s in the glTF file. These are the cameras that the
   * [GLTFNode.camera] index refers to.
   */
  public final fun getCameras(): VariantArray<GLTFCamera> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCamerasPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<GLTFCamera>)
  }

  /**
   * Sets the [GLTFCamera]s in the state. These are the cameras that the [GLTFNode.camera] index
   * refers to.
   */
  public final fun setCameras(cameras: VariantArray<GLTFCamera>): Unit {
    TransferContext.writeArguments(ARRAY to cameras)
    TransferContext.callMethod(ptr, MethodBindings.setCamerasPtr, NIL)
  }

  /**
   * Returns an array of all [GLTFLight]s in the glTF file. These are the lights that the
   * [GLTFNode.light] index refers to.
   */
  public final fun getLights(): VariantArray<GLTFLight> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLightsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<GLTFLight>)
  }

  /**
   * Sets the [GLTFLight]s in the state. These are the lights that the [GLTFNode.light] index refers
   * to.
   */
  public final fun setLights(lights: VariantArray<GLTFLight>): Unit {
    TransferContext.writeArguments(ARRAY to lights)
    TransferContext.callMethod(ptr, MethodBindings.setLightsPtr, NIL)
  }

  /**
   * Returns an array of unique node names. This is used in both the import process and export
   * process.
   */
  public final fun getUniqueNames(): VariantArray<String> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getUniqueNamesPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<String>)
  }

  /**
   * Sets the unique node names in the state. This is used in both the import process and export
   * process.
   */
  public final fun setUniqueNames(uniqueNames: VariantArray<String>): Unit {
    TransferContext.writeArguments(ARRAY to uniqueNames)
    TransferContext.callMethod(ptr, MethodBindings.setUniqueNamesPtr, NIL)
  }

  /**
   * Returns an array of unique animation names. This is only used during the import process.
   */
  public final fun getUniqueAnimationNames(): VariantArray<String> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getUniqueAnimationNamesPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<String>)
  }

  /**
   * Sets the unique animation names in the state. This is only used during the import process.
   */
  public final fun setUniqueAnimationNames(uniqueAnimationNames: VariantArray<String>): Unit {
    TransferContext.writeArguments(ARRAY to uniqueAnimationNames)
    TransferContext.callMethod(ptr, MethodBindings.setUniqueAnimationNamesPtr, NIL)
  }

  /**
   * Returns an array of all [GLTFSkeleton]s in the glTF file. These are the skeletons that the
   * [GLTFNode.skeleton] index refers to.
   */
  public final fun getSkeletons(): VariantArray<GLTFSkeleton> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSkeletonsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<GLTFSkeleton>)
  }

  /**
   * Sets the [GLTFSkeleton]s in the state. These are the skeletons that the [GLTFNode.skeleton]
   * index refers to.
   */
  public final fun setSkeletons(skeletons: VariantArray<GLTFSkeleton>): Unit {
    TransferContext.writeArguments(ARRAY to skeletons)
    TransferContext.callMethod(ptr, MethodBindings.setSkeletonsPtr, NIL)
  }

  public final fun getCreateAnimations(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCreateAnimationsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setCreateAnimations(createAnimations: Boolean): Unit {
    TransferContext.writeArguments(BOOL to createAnimations)
    TransferContext.callMethod(ptr, MethodBindings.setCreateAnimationsPtr, NIL)
  }

  public final fun getImportAsSkeletonBones(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getImportAsSkeletonBonesPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setImportAsSkeletonBones(importAsSkeletonBones: Boolean): Unit {
    TransferContext.writeArguments(BOOL to importAsSkeletonBones)
    TransferContext.callMethod(ptr, MethodBindings.setImportAsSkeletonBonesPtr, NIL)
  }

  /**
   * Returns an array of all [GLTFAnimation]s in the glTF file. When importing, these will be
   * generated as animations in an [AnimationPlayer] node. When exporting, these will be generated from
   * Godot [AnimationPlayer] nodes.
   */
  public final fun getAnimations(): VariantArray<GLTFAnimation> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getAnimationsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<GLTFAnimation>)
  }

  /**
   * Sets the [GLTFAnimation]s in the state. When importing, these will be generated as animations
   * in an [AnimationPlayer] node. When exporting, these will be generated from Godot [AnimationPlayer]
   * nodes.
   */
  public final fun setAnimations(animations: VariantArray<GLTFAnimation>): Unit {
    TransferContext.writeArguments(ARRAY to animations)
    TransferContext.callMethod(ptr, MethodBindings.setAnimationsPtr, NIL)
  }

  /**
   * Returns the Godot scene node that corresponds to the same index as the [GLTFNode] it was
   * generated from. This is the inverse of [getNodeIndex]. Useful during the import process.
   *
   * **Note:** Not every [GLTFNode] will have a scene node generated, and not every generated scene
   * node will have a corresponding [GLTFNode]. If there is no scene node for this [GLTFNode] index,
   * `null` is returned.
   */
  public final fun getSceneNode(idx: Int): Node? {
    TransferContext.writeArguments(LONG to idx.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getSceneNodePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Node?)
  }

  /**
   * Returns the index of the [GLTFNode] corresponding to this Godot scene node. This is the inverse
   * of [getSceneNode]. Useful during the export process.
   *
   * **Note:** Not every Godot scene node will have a corresponding [GLTFNode], and not every
   * [GLTFNode] will have a scene node generated. If there is no [GLTFNode] index for this scene node,
   * `-1` is returned.
   */
  public final fun getNodeIndex(sceneNode: Node?): Int {
    TransferContext.writeArguments(OBJECT to sceneNode)
    TransferContext.callMethod(ptr, MethodBindings.getNodeIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Gets additional arbitrary data in this [GLTFState] instance. This can be used to keep per-file
   * state data in [GLTFDocumentExtension] classes, which is important because they are stateless.
   *
   * The argument should be the [GLTFDocumentExtension] name (does not have to match the extension
   * name in the glTF file), and the return value can be anything you set. If nothing was set, the
   * return value is `null`.
   */
  public final fun getAdditionalData(extensionName: StringName): Any? {
    TransferContext.writeArguments(STRING_NAME to extensionName)
    TransferContext.callMethod(ptr, MethodBindings.getAdditionalDataPtr, ANY)
    return (TransferContext.readReturnValue(ANY) as Any?)
  }

  /**
   * Sets additional arbitrary data in this [GLTFState] instance. This can be used to keep per-file
   * state data in [GLTFDocumentExtension] classes, which is important because they are stateless.
   *
   * The first argument should be the [GLTFDocumentExtension] name (does not have to match the
   * extension name in the glTF file), and the second argument can be anything you want.
   */
  public final fun setAdditionalData(extensionName: StringName, additionalData: Any?): Unit {
    TransferContext.writeArguments(STRING_NAME to extensionName, ANY to additionalData)
    TransferContext.callMethod(ptr, MethodBindings.setAdditionalDataPtr, NIL)
  }

  public final fun getHandleBinaryImage(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getHandleBinaryImagePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun setHandleBinaryImage(method: Int): Unit {
    TransferContext.writeArguments(LONG to method.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setHandleBinaryImagePtr, NIL)
  }

  public final fun setBakeFps(`value`: Double): Unit {
    TransferContext.writeArguments(DOUBLE to value)
    TransferContext.callMethod(ptr, MethodBindings.setBakeFpsPtr, NIL)
  }

  public final fun getBakeFps(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getBakeFpsPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double)
  }

  /**
   * Gets additional arbitrary data in this [GLTFState] instance. This can be used to keep per-file
   * state data in [GLTFDocumentExtension] classes, which is important because they are stateless.
   *
   * The argument should be the [GLTFDocumentExtension] name (does not have to match the extension
   * name in the glTF file), and the return value can be anything you set. If nothing was set, the
   * return value is `null`.
   */
  public final fun getAdditionalData(extensionName: String): Any? =
      getAdditionalData(extensionName.asCachedStringName())

  /**
   * Sets additional arbitrary data in this [GLTFState] instance. This can be used to keep per-file
   * state data in [GLTFDocumentExtension] classes, which is important because they are stateless.
   *
   * The first argument should be the [GLTFDocumentExtension] name (does not have to match the
   * extension name in the glTF file), and the second argument can be anything you want.
   */
  public final fun setAdditionalData(extensionName: String, additionalData: Any?) =
      setAdditionalData(extensionName.asCachedStringName(), additionalData)

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

  public object MethodBindings {
    internal val addUsedExtensionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "add_used_extension", 2678287736)

    internal val appendDataToBuffersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "append_data_to_buffers", 1460416665)

    internal val appendGltfNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "append_gltf_node", 3562288551)

    internal val getJsonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "get_json", 2382534195)

    internal val setJsonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "set_json", 4155329257)

    internal val getMajorVersionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "get_major_version", 2455072627)

    internal val setMajorVersionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "set_major_version", 1286410249)

    internal val getMinorVersionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "get_minor_version", 2455072627)

    internal val setMinorVersionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "set_minor_version", 1286410249)

    internal val getCopyrightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "get_copyright", 201670096)

    internal val setCopyrightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "set_copyright", 83702148)

    internal val getGlbDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "get_glb_data", 2115431945)

    internal val setGlbDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "set_glb_data", 2971499966)

    internal val getUseNamedSkinBindsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "get_use_named_skin_binds", 2240911060)

    internal val setUseNamedSkinBindsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "set_use_named_skin_binds", 2586408642)

    internal val getNodesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "get_nodes", 2915620761)

    internal val setNodesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "set_nodes", 381264803)

    internal val getBuffersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "get_buffers", 2915620761)

    internal val setBuffersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "set_buffers", 381264803)

    internal val getBufferViewsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "get_buffer_views", 2915620761)

    internal val setBufferViewsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "set_buffer_views", 381264803)

    internal val getAccessorsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "get_accessors", 2915620761)

    internal val setAccessorsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "set_accessors", 381264803)

    internal val getMeshesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "get_meshes", 2915620761)

    internal val setMeshesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "set_meshes", 381264803)

    internal val getAnimationPlayersCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "get_animation_players_count", 3744713108)

    internal val getAnimationPlayerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "get_animation_player", 925043400)

    internal val getMaterialsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "get_materials", 2915620761)

    internal val setMaterialsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "set_materials", 381264803)

    internal val getSceneNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "get_scene_name", 2841200299)

    internal val setSceneNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "set_scene_name", 83702148)

    internal val getBasePathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "get_base_path", 2841200299)

    internal val setBasePathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "set_base_path", 83702148)

    internal val getFilenamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "get_filename", 201670096)

    internal val setFilenamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "set_filename", 83702148)

    internal val getRootNodesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "get_root_nodes", 969006518)

    internal val setRootNodesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "set_root_nodes", 3614634198)

    internal val getTexturesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "get_textures", 2915620761)

    internal val setTexturesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "set_textures", 381264803)

    internal val getTextureSamplersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "get_texture_samplers", 2915620761)

    internal val setTextureSamplersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "set_texture_samplers", 381264803)

    internal val getImagesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "get_images", 2915620761)

    internal val setImagesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "set_images", 381264803)

    internal val getSkinsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "get_skins", 2915620761)

    internal val setSkinsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "set_skins", 381264803)

    internal val getCamerasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "get_cameras", 2915620761)

    internal val setCamerasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "set_cameras", 381264803)

    internal val getLightsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "get_lights", 2915620761)

    internal val setLightsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "set_lights", 381264803)

    internal val getUniqueNamesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "get_unique_names", 2915620761)

    internal val setUniqueNamesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "set_unique_names", 381264803)

    internal val getUniqueAnimationNamesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "get_unique_animation_names", 2915620761)

    internal val setUniqueAnimationNamesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "set_unique_animation_names", 381264803)

    internal val getSkeletonsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "get_skeletons", 2915620761)

    internal val setSkeletonsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "set_skeletons", 381264803)

    internal val getCreateAnimationsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "get_create_animations", 2240911060)

    internal val setCreateAnimationsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "set_create_animations", 2586408642)

    internal val getImportAsSkeletonBonesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "get_import_as_skeleton_bones", 2240911060)

    internal val setImportAsSkeletonBonesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "set_import_as_skeleton_bones", 2586408642)

    internal val getAnimationsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "get_animations", 2915620761)

    internal val setAnimationsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "set_animations", 381264803)

    internal val getSceneNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "get_scene_node", 4253421667)

    internal val getNodeIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "get_node_index", 1205807060)

    internal val getAdditionalDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "get_additional_data", 2138907829)

    internal val setAdditionalDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "set_additional_data", 3776071444)

    internal val getHandleBinaryImagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "get_handle_binary_image", 2455072627)

    internal val setHandleBinaryImagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "set_handle_binary_image", 1286410249)

    internal val setBakeFpsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "set_bake_fps", 373806689)

    internal val getBakeFpsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("GLTFState", "get_bake_fps", 1740695150)
  }
}
