// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
package godot

import godot.`internal`.reflection.TypeManager
import godot.core.VariantParser.OBJECT
import godot.core.variantMapper
import kotlin.Unit

public fun registerEngineTypes(): Unit {
  TypeManager.registerEngineType("Performance", Performance::class) { Performance }
  TypeManager.registerSingleton("Performance")
  TypeManager.registerEngineType("TextServerManager", TextServerManager::class) { TextServerManager
      }
  TypeManager.registerSingleton("TextServerManager")
  TypeManager.registerEngineType("PhysicsServer2DManager", PhysicsServer2DManager::class) {
      PhysicsServer2DManager }
  TypeManager.registerSingleton("PhysicsServer2DManager")
  TypeManager.registerEngineType("PhysicsServer3DManager", PhysicsServer3DManager::class) {
      PhysicsServer3DManager }
  TypeManager.registerSingleton("PhysicsServer3DManager")
  TypeManager.registerEngineType("NavigationMeshGenerator", NavigationMeshGenerator::class) {
      NavigationMeshGenerator }
  TypeManager.registerSingleton("NavigationMeshGenerator")
  TypeManager.registerEngineType("ProjectSettings", ProjectSettings::class) { ProjectSettings }
  TypeManager.registerSingleton("ProjectSettings")
  TypeManager.registerEngineType("IP", IP::class) { IP }
  TypeManager.registerSingleton("IP")
  TypeManager.registerEngineType("Geometry2D", Geometry2D::class) { Geometry2D }
  TypeManager.registerSingleton("Geometry2D")
  TypeManager.registerEngineType("Geometry3D", Geometry3D::class) { Geometry3D }
  TypeManager.registerSingleton("Geometry3D")
  TypeManager.registerEngineType("ResourceLoader", ResourceLoader::class) { ResourceLoader }
  TypeManager.registerSingleton("ResourceLoader")
  TypeManager.registerEngineType("ResourceSaver", ResourceSaver::class) { ResourceSaver }
  TypeManager.registerSingleton("ResourceSaver")
  TypeManager.registerEngineType("OS", OS::class) { OS }
  TypeManager.registerSingleton("OS")
  TypeManager.registerEngineType("Engine", Engine::class) { Engine }
  TypeManager.registerSingleton("Engine")
  TypeManager.registerEngineType("ClassDB", ClassDB::class) { ClassDB }
  TypeManager.registerSingleton("ClassDB")
  TypeManager.registerEngineType("Marshalls", Marshalls::class) { Marshalls }
  TypeManager.registerSingleton("Marshalls")
  TypeManager.registerEngineType("TranslationServer", TranslationServer::class) { TranslationServer
      }
  TypeManager.registerSingleton("TranslationServer")
  TypeManager.registerEngineType("Input", Input::class) { Input }
  TypeManager.registerSingleton("Input")
  TypeManager.registerEngineType("InputMap", InputMap::class) { InputMap }
  TypeManager.registerSingleton("InputMap")
  TypeManager.registerEngineType("EngineDebugger", EngineDebugger::class) { EngineDebugger }
  TypeManager.registerSingleton("EngineDebugger")
  TypeManager.registerEngineType("Time", Time::class) { Time }
  TypeManager.registerSingleton("Time")
  TypeManager.registerEngineType("GDExtensionManager", GDExtensionManager::class) {
      GDExtensionManager }
  TypeManager.registerSingleton("GDExtensionManager")
  TypeManager.registerEngineType("ResourceUID", ResourceUID::class) { ResourceUID }
  TypeManager.registerSingleton("ResourceUID")
  TypeManager.registerEngineType("WorkerThreadPool", WorkerThreadPool::class) { WorkerThreadPool }
  TypeManager.registerSingleton("WorkerThreadPool")
  TypeManager.registerEngineType("ThemeDB", ThemeDB::class) { ThemeDB }
  TypeManager.registerSingleton("ThemeDB")
  TypeManager.registerEngineType("JavaClassWrapper", JavaClassWrapper::class) { JavaClassWrapper }
  TypeManager.registerSingleton("JavaClassWrapper")
  TypeManager.registerEngineType("JavaScriptBridge", JavaScriptBridge::class) { JavaScriptBridge }
  TypeManager.registerSingleton("JavaScriptBridge")
  TypeManager.registerEngineType("AudioServer", AudioServer::class) { AudioServer }
  TypeManager.registerSingleton("AudioServer")
  TypeManager.registerEngineType("CameraServer", CameraServer::class) { CameraServer }
  TypeManager.registerSingleton("CameraServer")
  TypeManager.registerEngineType("DisplayServer", DisplayServer::class) { DisplayServer }
  TypeManager.registerSingleton("DisplayServer")
  TypeManager.registerEngineType("NativeMenu", NativeMenu::class) { NativeMenu }
  TypeManager.registerSingleton("NativeMenu")
  TypeManager.registerEngineType("NavigationServer2D", NavigationServer2D::class) {
      NavigationServer2D }
  TypeManager.registerSingleton("NavigationServer2D")
  TypeManager.registerEngineType("NavigationServer3D", NavigationServer3D::class) {
      NavigationServer3D }
  TypeManager.registerSingleton("NavigationServer3D")
  TypeManager.registerEngineType("RenderingServer", RenderingServer::class) { RenderingServer }
  TypeManager.registerSingleton("RenderingServer")
  TypeManager.registerEngineType("PhysicsServer2D", PhysicsServer2D::class) { PhysicsServer2D }
  TypeManager.registerSingleton("PhysicsServer2D")
  TypeManager.registerEngineType("PhysicsServer3D", PhysicsServer3D::class) { PhysicsServer3D }
  TypeManager.registerSingleton("PhysicsServer3D")
  TypeManager.registerEngineType("XRServer", XRServer::class) { XRServer }
  TypeManager.registerSingleton("XRServer")
  TypeManager.registerEngineType("AESContext", AESContext::class, ::AESContext)
  TypeManager.registerEngineType("AStar2D", AStar2D::class, ::AStar2D)
  TypeManager.registerEngineType("AStar3D", AStar3D::class, ::AStar3D)
  TypeManager.registerEngineType("AStarGrid2D", AStarGrid2D::class, ::AStarGrid2D)
  TypeManager.registerEngineType("AcceptDialog", AcceptDialog::class, ::AcceptDialog)
  TypeManager.registerEngineType("AnimatableBody2D", AnimatableBody2D::class, ::AnimatableBody2D)
  TypeManager.registerEngineType("AnimatableBody3D", AnimatableBody3D::class, ::AnimatableBody3D)
  TypeManager.registerEngineType("AnimatedSprite2D", AnimatedSprite2D::class, ::AnimatedSprite2D)
  TypeManager.registerEngineType("AnimatedSprite3D", AnimatedSprite3D::class, ::AnimatedSprite3D)
  TypeManager.registerEngineType("AnimatedTexture", AnimatedTexture::class, ::AnimatedTexture)
  TypeManager.registerEngineType("Animation", Animation::class, ::Animation)
  TypeManager.registerEngineType("AnimationLibrary", AnimationLibrary::class, ::AnimationLibrary)
  TypeManager.registerEngineType("AnimationMixer", AnimationMixer::class, ::AnimationMixer)
  TypeManager.registerEngineType("AnimationNode", AnimationNode::class, ::AnimationNode)
  TypeManager.registerEngineType("AnimationNodeAdd2", AnimationNodeAdd2::class, ::AnimationNodeAdd2)
  TypeManager.registerEngineType("AnimationNodeAdd3", AnimationNodeAdd3::class, ::AnimationNodeAdd3)
  TypeManager.registerEngineType("AnimationNodeAnimation", AnimationNodeAnimation::class,
      ::AnimationNodeAnimation)
  TypeManager.registerEngineType("AnimationNodeBlend2", AnimationNodeBlend2::class,
      ::AnimationNodeBlend2)
  TypeManager.registerEngineType("AnimationNodeBlend3", AnimationNodeBlend3::class,
      ::AnimationNodeBlend3)
  TypeManager.registerEngineType("AnimationNodeBlendSpace1D", AnimationNodeBlendSpace1D::class,
      ::AnimationNodeBlendSpace1D)
  TypeManager.registerEngineType("AnimationNodeBlendSpace2D", AnimationNodeBlendSpace2D::class,
      ::AnimationNodeBlendSpace2D)
  TypeManager.registerEngineType("AnimationNodeBlendTree", AnimationNodeBlendTree::class,
      ::AnimationNodeBlendTree)
  TypeManager.registerEngineType("AnimationNodeOneShot", AnimationNodeOneShot::class,
      ::AnimationNodeOneShot)
  TypeManager.registerEngineType("AnimationNodeOutput", AnimationNodeOutput::class,
      ::AnimationNodeOutput)
  TypeManager.registerEngineType("AnimationNodeStateMachine", AnimationNodeStateMachine::class,
      ::AnimationNodeStateMachine)
  TypeManager.registerEngineType("AnimationNodeStateMachinePlayback",
      AnimationNodeStateMachinePlayback::class, ::AnimationNodeStateMachinePlayback)
  TypeManager.registerEngineType("AnimationNodeStateMachineTransition",
      AnimationNodeStateMachineTransition::class, ::AnimationNodeStateMachineTransition)
  TypeManager.registerEngineType("AnimationNodeSub2", AnimationNodeSub2::class, ::AnimationNodeSub2)
  TypeManager.registerEngineType("AnimationNodeSync", AnimationNodeSync::class, ::AnimationNodeSync)
  TypeManager.registerEngineType("AnimationNodeTimeScale", AnimationNodeTimeScale::class,
      ::AnimationNodeTimeScale)
  TypeManager.registerEngineType("AnimationNodeTimeSeek", AnimationNodeTimeSeek::class,
      ::AnimationNodeTimeSeek)
  TypeManager.registerEngineType("AnimationNodeTransition", AnimationNodeTransition::class,
      ::AnimationNodeTransition)
  TypeManager.registerEngineType("AnimationPlayer", AnimationPlayer::class, ::AnimationPlayer)
  TypeManager.registerEngineType("AnimationRootNode", AnimationRootNode::class, ::AnimationRootNode)
  TypeManager.registerEngineType("AnimationTree", AnimationTree::class, ::AnimationTree)
  TypeManager.registerEngineType("Area2D", Area2D::class, ::Area2D)
  TypeManager.registerEngineType("Area3D", Area3D::class, ::Area3D)
  TypeManager.registerEngineType("ArrayMesh", ArrayMesh::class, ::ArrayMesh)
  TypeManager.registerEngineType("ArrayOccluder3D", ArrayOccluder3D::class, ::ArrayOccluder3D)
  TypeManager.registerEngineType("AspectRatioContainer", AspectRatioContainer::class,
      ::AspectRatioContainer)
  TypeManager.registerEngineType("AtlasTexture", AtlasTexture::class, ::AtlasTexture)
  TypeManager.registerEngineType("AudioBusLayout", AudioBusLayout::class, ::AudioBusLayout)
  TypeManager.registerEngineType("AudioEffect", AudioEffect::class, ::AudioEffect)
  TypeManager.registerEngineType("AudioEffectAmplify", AudioEffectAmplify::class,
      ::AudioEffectAmplify)
  TypeManager.registerEngineType("AudioEffectBandLimitFilter", AudioEffectBandLimitFilter::class,
      ::AudioEffectBandLimitFilter)
  TypeManager.registerEngineType("AudioEffectBandPassFilter", AudioEffectBandPassFilter::class,
      ::AudioEffectBandPassFilter)
  TypeManager.registerEngineType("AudioEffectCapture", AudioEffectCapture::class,
      ::AudioEffectCapture)
  TypeManager.registerEngineType("AudioEffectChorus", AudioEffectChorus::class, ::AudioEffectChorus)
  TypeManager.registerEngineType("AudioEffectCompressor", AudioEffectCompressor::class,
      ::AudioEffectCompressor)
  TypeManager.registerEngineType("AudioEffectDelay", AudioEffectDelay::class, ::AudioEffectDelay)
  TypeManager.registerEngineType("AudioEffectDistortion", AudioEffectDistortion::class,
      ::AudioEffectDistortion)
  TypeManager.registerEngineType("AudioEffectEQ", AudioEffectEQ::class, ::AudioEffectEQ)
  TypeManager.registerEngineType("AudioEffectEQ10", AudioEffectEQ10::class, ::AudioEffectEQ10)
  TypeManager.registerEngineType("AudioEffectEQ21", AudioEffectEQ21::class, ::AudioEffectEQ21)
  TypeManager.registerEngineType("AudioEffectEQ6", AudioEffectEQ6::class, ::AudioEffectEQ6)
  TypeManager.registerEngineType("AudioEffectFilter", AudioEffectFilter::class, ::AudioEffectFilter)
  TypeManager.registerEngineType("AudioEffectHardLimiter", AudioEffectHardLimiter::class,
      ::AudioEffectHardLimiter)
  TypeManager.registerEngineType("AudioEffectHighPassFilter", AudioEffectHighPassFilter::class,
      ::AudioEffectHighPassFilter)
  TypeManager.registerEngineType("AudioEffectHighShelfFilter", AudioEffectHighShelfFilter::class,
      ::AudioEffectHighShelfFilter)
  TypeManager.registerEngineType("AudioEffectInstance", AudioEffectInstance::class,
      ::AudioEffectInstance)
  TypeManager.registerEngineType("AudioEffectLimiter", AudioEffectLimiter::class,
      ::AudioEffectLimiter)
  TypeManager.registerEngineType("AudioEffectLowPassFilter", AudioEffectLowPassFilter::class,
      ::AudioEffectLowPassFilter)
  TypeManager.registerEngineType("AudioEffectLowShelfFilter", AudioEffectLowShelfFilter::class,
      ::AudioEffectLowShelfFilter)
  TypeManager.registerEngineType("AudioEffectNotchFilter", AudioEffectNotchFilter::class,
      ::AudioEffectNotchFilter)
  TypeManager.registerEngineType("AudioEffectPanner", AudioEffectPanner::class, ::AudioEffectPanner)
  TypeManager.registerEngineType("AudioEffectPhaser", AudioEffectPhaser::class, ::AudioEffectPhaser)
  TypeManager.registerEngineType("AudioEffectPitchShift", AudioEffectPitchShift::class,
      ::AudioEffectPitchShift)
  TypeManager.registerEngineType("AudioEffectRecord", AudioEffectRecord::class, ::AudioEffectRecord)
  TypeManager.registerEngineType("AudioEffectReverb", AudioEffectReverb::class, ::AudioEffectReverb)
  TypeManager.registerEngineType("AudioEffectSpectrumAnalyzer", AudioEffectSpectrumAnalyzer::class,
      ::AudioEffectSpectrumAnalyzer)
  TypeManager.registerEngineType("AudioEffectSpectrumAnalyzerInstance",
      AudioEffectSpectrumAnalyzerInstance::class, ::AudioEffectSpectrumAnalyzerInstance)
  TypeManager.registerEngineType("AudioEffectStereoEnhance", AudioEffectStereoEnhance::class,
      ::AudioEffectStereoEnhance)
  TypeManager.registerEngineType("AudioListener2D", AudioListener2D::class, ::AudioListener2D)
  TypeManager.registerEngineType("AudioListener3D", AudioListener3D::class, ::AudioListener3D)
  TypeManager.registerEngineType("AudioSample", AudioSample::class, ::AudioSample)
  TypeManager.registerEngineType("AudioSamplePlayback", AudioSamplePlayback::class,
      ::AudioSamplePlayback)
  TypeManager.registerEngineType("AudioStream", AudioStream::class, ::AudioStream)
  TypeManager.registerEngineType("AudioStreamGenerator", AudioStreamGenerator::class,
      ::AudioStreamGenerator)
  TypeManager.registerEngineType("AudioStreamGeneratorPlayback",
      AudioStreamGeneratorPlayback::class, ::AudioStreamGeneratorPlayback)
  TypeManager.registerEngineType("AudioStreamInteractive", AudioStreamInteractive::class,
      ::AudioStreamInteractive)
  TypeManager.registerEngineType("AudioStreamMP3", AudioStreamMP3::class, ::AudioStreamMP3)
  TypeManager.registerEngineType("AudioStreamMicrophone", AudioStreamMicrophone::class,
      ::AudioStreamMicrophone)
  TypeManager.registerEngineType("AudioStreamOggVorbis", AudioStreamOggVorbis::class,
      ::AudioStreamOggVorbis)
  TypeManager.registerEngineType("AudioStreamPlayback", AudioStreamPlayback::class,
      ::AudioStreamPlayback)
  TypeManager.registerEngineType("AudioStreamPlaybackInteractive",
      AudioStreamPlaybackInteractive::class, ::AudioStreamPlaybackInteractive)
  TypeManager.registerEngineType("AudioStreamPlaybackOggVorbis",
      AudioStreamPlaybackOggVorbis::class, ::AudioStreamPlaybackOggVorbis)
  TypeManager.registerEngineType("AudioStreamPlaybackPlaylist", AudioStreamPlaybackPlaylist::class,
      ::AudioStreamPlaybackPlaylist)
  TypeManager.registerEngineType("AudioStreamPlaybackPolyphonic",
      AudioStreamPlaybackPolyphonic::class, ::AudioStreamPlaybackPolyphonic)
  TypeManager.registerEngineType("AudioStreamPlaybackResampled",
      AudioStreamPlaybackResampled::class, ::AudioStreamPlaybackResampled)
  TypeManager.registerEngineType("AudioStreamPlaybackSynchronized",
      AudioStreamPlaybackSynchronized::class, ::AudioStreamPlaybackSynchronized)
  TypeManager.registerEngineType("AudioStreamPlayer", AudioStreamPlayer::class, ::AudioStreamPlayer)
  TypeManager.registerEngineType("AudioStreamPlayer2D", AudioStreamPlayer2D::class,
      ::AudioStreamPlayer2D)
  TypeManager.registerEngineType("AudioStreamPlayer3D", AudioStreamPlayer3D::class,
      ::AudioStreamPlayer3D)
  TypeManager.registerEngineType("AudioStreamPlaylist", AudioStreamPlaylist::class,
      ::AudioStreamPlaylist)
  TypeManager.registerEngineType("AudioStreamPolyphonic", AudioStreamPolyphonic::class,
      ::AudioStreamPolyphonic)
  TypeManager.registerEngineType("AudioStreamRandomizer", AudioStreamRandomizer::class,
      ::AudioStreamRandomizer)
  TypeManager.registerEngineType("AudioStreamSynchronized", AudioStreamSynchronized::class,
      ::AudioStreamSynchronized)
  TypeManager.registerEngineType("AudioStreamWAV", AudioStreamWAV::class, ::AudioStreamWAV)
  TypeManager.registerEngineType("BackBufferCopy", BackBufferCopy::class, ::BackBufferCopy)
  TypeManager.registerEngineType("BaseButton", BaseButton::class, ::BaseButton)
  TypeManager.registerEngineType("BaseMaterial3D", BaseMaterial3D::class, ::BaseMaterial3D)
  TypeManager.registerEngineType("BitMap", BitMap::class, ::BitMap)
  TypeManager.registerEngineType("Bone2D", Bone2D::class, ::Bone2D)
  TypeManager.registerEngineType("BoneAttachment3D", BoneAttachment3D::class, ::BoneAttachment3D)
  TypeManager.registerEngineType("BoneMap", BoneMap::class, ::BoneMap)
  TypeManager.registerEngineType("BoxContainer", BoxContainer::class, ::BoxContainer)
  TypeManager.registerEngineType("BoxMesh", BoxMesh::class, ::BoxMesh)
  TypeManager.registerEngineType("BoxOccluder3D", BoxOccluder3D::class, ::BoxOccluder3D)
  TypeManager.registerEngineType("BoxShape3D", BoxShape3D::class, ::BoxShape3D)
  TypeManager.registerEngineType("Button", Button::class, ::Button)
  TypeManager.registerEngineType("ButtonGroup", ButtonGroup::class, ::ButtonGroup)
  TypeManager.registerEngineType("CPUParticles2D", CPUParticles2D::class, ::CPUParticles2D)
  TypeManager.registerEngineType("CPUParticles3D", CPUParticles3D::class, ::CPUParticles3D)
  TypeManager.registerEngineType("CSGBox3D", CSGBox3D::class, ::CSGBox3D)
  TypeManager.registerEngineType("CSGCombiner3D", CSGCombiner3D::class, ::CSGCombiner3D)
  TypeManager.registerEngineType("CSGCylinder3D", CSGCylinder3D::class, ::CSGCylinder3D)
  TypeManager.registerEngineType("CSGMesh3D", CSGMesh3D::class, ::CSGMesh3D)
  TypeManager.registerEngineType("CSGPolygon3D", CSGPolygon3D::class, ::CSGPolygon3D)
  TypeManager.registerEngineType("CSGPrimitive3D", CSGPrimitive3D::class, ::CSGPrimitive3D)
  TypeManager.registerEngineType("CSGShape3D", CSGShape3D::class, ::CSGShape3D)
  TypeManager.registerEngineType("CSGSphere3D", CSGSphere3D::class, ::CSGSphere3D)
  TypeManager.registerEngineType("CSGTorus3D", CSGTorus3D::class, ::CSGTorus3D)
  TypeManager.registerEngineType("CallbackTweener", CallbackTweener::class, ::CallbackTweener)
  TypeManager.registerEngineType("Camera2D", Camera2D::class, ::Camera2D)
  TypeManager.registerEngineType("Camera3D", Camera3D::class, ::Camera3D)
  TypeManager.registerEngineType("CameraAttributes", CameraAttributes::class, ::CameraAttributes)
  TypeManager.registerEngineType("CameraAttributesPhysical", CameraAttributesPhysical::class,
      ::CameraAttributesPhysical)
  TypeManager.registerEngineType("CameraAttributesPractical", CameraAttributesPractical::class,
      ::CameraAttributesPractical)
  TypeManager.registerEngineType("CameraFeed", CameraFeed::class, ::CameraFeed)
  TypeManager.registerEngineType("CameraTexture", CameraTexture::class, ::CameraTexture)
  TypeManager.registerEngineType("CanvasGroup", CanvasGroup::class, ::CanvasGroup)
  TypeManager.registerEngineType("CanvasItem", CanvasItem::class, ::CanvasItem)
  TypeManager.registerEngineType("CanvasItemMaterial", CanvasItemMaterial::class,
      ::CanvasItemMaterial)
  TypeManager.registerEngineType("CanvasLayer", CanvasLayer::class, ::CanvasLayer)
  TypeManager.registerEngineType("CanvasModulate", CanvasModulate::class, ::CanvasModulate)
  TypeManager.registerEngineType("CanvasTexture", CanvasTexture::class, ::CanvasTexture)
  TypeManager.registerEngineType("CapsuleMesh", CapsuleMesh::class, ::CapsuleMesh)
  TypeManager.registerEngineType("CapsuleShape2D", CapsuleShape2D::class, ::CapsuleShape2D)
  TypeManager.registerEngineType("CapsuleShape3D", CapsuleShape3D::class, ::CapsuleShape3D)
  TypeManager.registerEngineType("CenterContainer", CenterContainer::class, ::CenterContainer)
  TypeManager.registerEngineType("CharFXTransform", CharFXTransform::class, ::CharFXTransform)
  TypeManager.registerEngineType("CharacterBody2D", CharacterBody2D::class, ::CharacterBody2D)
  TypeManager.registerEngineType("CharacterBody3D", CharacterBody3D::class, ::CharacterBody3D)
  TypeManager.registerEngineType("CheckBox", CheckBox::class, ::CheckBox)
  TypeManager.registerEngineType("CheckButton", CheckButton::class, ::CheckButton)
  TypeManager.registerEngineType("CircleShape2D", CircleShape2D::class, ::CircleShape2D)
  TypeManager.registerEngineType("CodeEdit", CodeEdit::class, ::CodeEdit)
  TypeManager.registerEngineType("CodeHighlighter", CodeHighlighter::class, ::CodeHighlighter)
  TypeManager.registerEngineType("CollisionObject2D", CollisionObject2D::class, ::CollisionObject2D)
  TypeManager.registerEngineType("CollisionObject3D", CollisionObject3D::class, ::CollisionObject3D)
  TypeManager.registerEngineType("CollisionPolygon2D", CollisionPolygon2D::class,
      ::CollisionPolygon2D)
  TypeManager.registerEngineType("CollisionPolygon3D", CollisionPolygon3D::class,
      ::CollisionPolygon3D)
  TypeManager.registerEngineType("CollisionShape2D", CollisionShape2D::class, ::CollisionShape2D)
  TypeManager.registerEngineType("CollisionShape3D", CollisionShape3D::class, ::CollisionShape3D)
  TypeManager.registerEngineType("ColorPicker", ColorPicker::class, ::ColorPicker)
  TypeManager.registerEngineType("ColorPickerButton", ColorPickerButton::class, ::ColorPickerButton)
  TypeManager.registerEngineType("ColorRect", ColorRect::class, ::ColorRect)
  TypeManager.registerEngineType("Compositor", Compositor::class, ::Compositor)
  TypeManager.registerEngineType("CompositorEffect", CompositorEffect::class, ::CompositorEffect)
  TypeManager.registerEngineType("CompressedCubemap", CompressedCubemap::class, ::CompressedCubemap)
  TypeManager.registerEngineType("CompressedCubemapArray", CompressedCubemapArray::class,
      ::CompressedCubemapArray)
  TypeManager.registerEngineType("CompressedTexture2D", CompressedTexture2D::class,
      ::CompressedTexture2D)
  TypeManager.registerEngineType("CompressedTexture2DArray", CompressedTexture2DArray::class,
      ::CompressedTexture2DArray)
  TypeManager.registerEngineType("CompressedTexture3D", CompressedTexture3D::class,
      ::CompressedTexture3D)
  TypeManager.registerEngineType("CompressedTextureLayered", CompressedTextureLayered::class,
      ::CompressedTextureLayered)
  TypeManager.registerEngineType("ConcavePolygonShape2D", ConcavePolygonShape2D::class,
      ::ConcavePolygonShape2D)
  TypeManager.registerEngineType("ConcavePolygonShape3D", ConcavePolygonShape3D::class,
      ::ConcavePolygonShape3D)
  TypeManager.registerEngineType("ConeTwistJoint3D", ConeTwistJoint3D::class, ::ConeTwistJoint3D)
  TypeManager.registerEngineType("ConfigFile", ConfigFile::class, ::ConfigFile)
  TypeManager.registerEngineType("ConfirmationDialog", ConfirmationDialog::class,
      ::ConfirmationDialog)
  TypeManager.registerEngineType("Container", Container::class, ::Container)
  TypeManager.registerEngineType("Control", Control::class, ::Control)
  TypeManager.registerEngineType("ConvexPolygonShape2D", ConvexPolygonShape2D::class,
      ::ConvexPolygonShape2D)
  TypeManager.registerEngineType("ConvexPolygonShape3D", ConvexPolygonShape3D::class,
      ::ConvexPolygonShape3D)
  TypeManager.registerEngineType("Crypto", Crypto::class, ::Crypto)
  TypeManager.registerEngineType("CryptoKey", CryptoKey::class, ::CryptoKey)
  TypeManager.registerEngineType("Cubemap", Cubemap::class, ::Cubemap)
  TypeManager.registerEngineType("CubemapArray", CubemapArray::class, ::CubemapArray)
  TypeManager.registerEngineType("Curve", Curve::class, ::Curve)
  TypeManager.registerEngineType("Curve2D", Curve2D::class, ::Curve2D)
  TypeManager.registerEngineType("Curve3D", Curve3D::class, ::Curve3D)
  TypeManager.registerEngineType("CurveTexture", CurveTexture::class, ::CurveTexture)
  TypeManager.registerEngineType("CurveXYZTexture", CurveXYZTexture::class, ::CurveXYZTexture)
  TypeManager.registerEngineType("CylinderMesh", CylinderMesh::class, ::CylinderMesh)
  TypeManager.registerEngineType("CylinderShape3D", CylinderShape3D::class, ::CylinderShape3D)
  TypeManager.registerEngineType("DTLSServer", DTLSServer::class, ::DTLSServer)
  TypeManager.registerEngineType("DampedSpringJoint2D", DampedSpringJoint2D::class,
      ::DampedSpringJoint2D)
  TypeManager.registerEngineType("Decal", Decal::class, ::Decal)
  TypeManager.registerEngineType("DirAccess", DirAccess::class, ::DirAccess)
  TypeManager.registerEngineType("DirectionalLight2D", DirectionalLight2D::class,
      ::DirectionalLight2D)
  TypeManager.registerEngineType("DirectionalLight3D", DirectionalLight3D::class,
      ::DirectionalLight3D)
  TypeManager.registerEngineType("ENetConnection", ENetConnection::class, ::ENetConnection)
  TypeManager.registerEngineType("ENetMultiplayerPeer", ENetMultiplayerPeer::class,
      ::ENetMultiplayerPeer)
  TypeManager.registerEngineType("ENetPacketPeer", ENetPacketPeer::class, ::ENetPacketPeer)
  TypeManager.registerEngineType("EncodedObjectAsID", EncodedObjectAsID::class, ::EncodedObjectAsID)
  TypeManager.registerEngineType("EngineProfiler", EngineProfiler::class, ::EngineProfiler)
  TypeManager.registerEngineType("Environment", Environment::class, ::Environment)
  TypeManager.registerEngineType("Expression", Expression::class, ::Expression)
  TypeManager.registerEngineType("FBXDocument", FBXDocument::class, ::FBXDocument)
  TypeManager.registerEngineType("FBXState", FBXState::class, ::FBXState)
  TypeManager.registerEngineType("FastNoiseLite", FastNoiseLite::class, ::FastNoiseLite)
  TypeManager.registerEngineType("FileAccess", FileAccess::class, ::FileAccess)
  TypeManager.registerEngineType("FileDialog", FileDialog::class, ::FileDialog)
  TypeManager.registerEngineType("FlowContainer", FlowContainer::class, ::FlowContainer)
  TypeManager.registerEngineType("FogMaterial", FogMaterial::class, ::FogMaterial)
  TypeManager.registerEngineType("FogVolume", FogVolume::class, ::FogVolume)
  TypeManager.registerEngineType("Font", Font::class, ::Font)
  TypeManager.registerEngineType("FontFile", FontFile::class, ::FontFile)
  TypeManager.registerEngineType("FontVariation", FontVariation::class, ::FontVariation)
  TypeManager.registerEngineType("FramebufferCacheRD", FramebufferCacheRD::class,
      ::FramebufferCacheRD)
  TypeManager.registerEngineType("GDExtension", GDExtension::class, ::GDExtension)
  TypeManager.registerEngineType("GDScript", GDScript::class, ::GDScript)
  TypeManager.registerEngineType("GLTFAccessor", GLTFAccessor::class, ::GLTFAccessor)
  TypeManager.registerEngineType("GLTFAnimation", GLTFAnimation::class, ::GLTFAnimation)
  TypeManager.registerEngineType("GLTFBufferView", GLTFBufferView::class, ::GLTFBufferView)
  TypeManager.registerEngineType("GLTFCamera", GLTFCamera::class, ::GLTFCamera)
  TypeManager.registerEngineType("GLTFDocument", GLTFDocument::class, ::GLTFDocument)
  TypeManager.registerEngineType("GLTFDocumentExtension", GLTFDocumentExtension::class,
      ::GLTFDocumentExtension)
  TypeManager.registerEngineType("GLTFDocumentExtensionConvertImporterMesh",
      GLTFDocumentExtensionConvertImporterMesh::class, ::GLTFDocumentExtensionConvertImporterMesh)
  TypeManager.registerEngineType("GLTFLight", GLTFLight::class, ::GLTFLight)
  TypeManager.registerEngineType("GLTFMesh", GLTFMesh::class, ::GLTFMesh)
  TypeManager.registerEngineType("GLTFNode", GLTFNode::class, ::GLTFNode)
  TypeManager.registerEngineType("GLTFPhysicsBody", GLTFPhysicsBody::class, ::GLTFPhysicsBody)
  TypeManager.registerEngineType("GLTFPhysicsShape", GLTFPhysicsShape::class, ::GLTFPhysicsShape)
  TypeManager.registerEngineType("GLTFSkeleton", GLTFSkeleton::class, ::GLTFSkeleton)
  TypeManager.registerEngineType("GLTFSkin", GLTFSkin::class, ::GLTFSkin)
  TypeManager.registerEngineType("GLTFSpecGloss", GLTFSpecGloss::class, ::GLTFSpecGloss)
  TypeManager.registerEngineType("GLTFState", GLTFState::class, ::GLTFState)
  TypeManager.registerEngineType("GLTFTexture", GLTFTexture::class, ::GLTFTexture)
  TypeManager.registerEngineType("GLTFTextureSampler", GLTFTextureSampler::class,
      ::GLTFTextureSampler)
  TypeManager.registerEngineType("GPUParticles2D", GPUParticles2D::class, ::GPUParticles2D)
  TypeManager.registerEngineType("GPUParticles3D", GPUParticles3D::class, ::GPUParticles3D)
  TypeManager.registerEngineType("GPUParticlesAttractor3D", GPUParticlesAttractor3D::class,
      ::GPUParticlesAttractor3D)
  TypeManager.registerEngineType("GPUParticlesAttractorBox3D", GPUParticlesAttractorBox3D::class,
      ::GPUParticlesAttractorBox3D)
  TypeManager.registerEngineType("GPUParticlesAttractorSphere3D",
      GPUParticlesAttractorSphere3D::class, ::GPUParticlesAttractorSphere3D)
  TypeManager.registerEngineType("GPUParticlesAttractorVectorField3D",
      GPUParticlesAttractorVectorField3D::class, ::GPUParticlesAttractorVectorField3D)
  TypeManager.registerEngineType("GPUParticlesCollision3D", GPUParticlesCollision3D::class,
      ::GPUParticlesCollision3D)
  TypeManager.registerEngineType("GPUParticlesCollisionBox3D", GPUParticlesCollisionBox3D::class,
      ::GPUParticlesCollisionBox3D)
  TypeManager.registerEngineType("GPUParticlesCollisionHeightField3D",
      GPUParticlesCollisionHeightField3D::class, ::GPUParticlesCollisionHeightField3D)
  TypeManager.registerEngineType("GPUParticlesCollisionSDF3D", GPUParticlesCollisionSDF3D::class,
      ::GPUParticlesCollisionSDF3D)
  TypeManager.registerEngineType("GPUParticlesCollisionSphere3D",
      GPUParticlesCollisionSphere3D::class, ::GPUParticlesCollisionSphere3D)
  TypeManager.registerEngineType("GdjScript", GdjScript::class, ::GdjScript)
  TypeManager.registerEngineType("Generic6DOFJoint3D", Generic6DOFJoint3D::class,
      ::Generic6DOFJoint3D)
  TypeManager.registerEngineType("GeometryInstance3D", GeometryInstance3D::class,
      ::GeometryInstance3D)
  TypeManager.registerEngineType("Gradient", Gradient::class, ::Gradient)
  TypeManager.registerEngineType("GradientTexture1D", GradientTexture1D::class, ::GradientTexture1D)
  TypeManager.registerEngineType("GradientTexture2D", GradientTexture2D::class, ::GradientTexture2D)
  TypeManager.registerEngineType("GraphEdit", GraphEdit::class, ::GraphEdit)
  TypeManager.registerEngineType("GraphElement", GraphElement::class, ::GraphElement)
  TypeManager.registerEngineType("GraphFrame", GraphFrame::class, ::GraphFrame)
  TypeManager.registerEngineType("GraphNode", GraphNode::class, ::GraphNode)
  TypeManager.registerEngineType("GridContainer", GridContainer::class, ::GridContainer)
  TypeManager.registerEngineType("GridMap", GridMap::class, ::GridMap)
  TypeManager.registerEngineType("GrooveJoint2D", GrooveJoint2D::class, ::GrooveJoint2D)
  TypeManager.registerEngineType("HBoxContainer", HBoxContainer::class, ::HBoxContainer)
  TypeManager.registerEngineType("HFlowContainer", HFlowContainer::class, ::HFlowContainer)
  TypeManager.registerEngineType("HMACContext", HMACContext::class, ::HMACContext)
  TypeManager.registerEngineType("HScrollBar", HScrollBar::class, ::HScrollBar)
  TypeManager.registerEngineType("HSeparator", HSeparator::class, ::HSeparator)
  TypeManager.registerEngineType("HSlider", HSlider::class, ::HSlider)
  TypeManager.registerEngineType("HSplitContainer", HSplitContainer::class, ::HSplitContainer)
  TypeManager.registerEngineType("HTTPClient", HTTPClient::class, ::HTTPClient)
  TypeManager.registerEngineType("HTTPRequest", HTTPRequest::class, ::HTTPRequest)
  TypeManager.registerEngineType("HashingContext", HashingContext::class, ::HashingContext)
  TypeManager.registerEngineType("HeightMapShape3D", HeightMapShape3D::class, ::HeightMapShape3D)
  TypeManager.registerEngineType("HingeJoint3D", HingeJoint3D::class, ::HingeJoint3D)
  TypeManager.registerEngineType("Image", Image::class, ::Image)
  TypeManager.registerEngineType("ImageFormatLoader", ImageFormatLoader::class, ::ImageFormatLoader)
  TypeManager.registerEngineType("ImageFormatLoaderExtension", ImageFormatLoaderExtension::class,
      ::ImageFormatLoaderExtension)
  TypeManager.registerEngineType("ImageTexture", ImageTexture::class, ::ImageTexture)
  TypeManager.registerEngineType("ImageTexture3D", ImageTexture3D::class, ::ImageTexture3D)
  TypeManager.registerEngineType("ImageTextureLayered", ImageTextureLayered::class,
      ::ImageTextureLayered)
  TypeManager.registerEngineType("ImmediateMesh", ImmediateMesh::class, ::ImmediateMesh)
  TypeManager.registerEngineType("ImporterMesh", ImporterMesh::class, ::ImporterMesh)
  TypeManager.registerEngineType("ImporterMeshInstance3D", ImporterMeshInstance3D::class,
      ::ImporterMeshInstance3D)
  TypeManager.registerEngineType("InputEvent", InputEvent::class, ::InputEvent)
  TypeManager.registerEngineType("InputEventAction", InputEventAction::class, ::InputEventAction)
  TypeManager.registerEngineType("InputEventFromWindow", InputEventFromWindow::class,
      ::InputEventFromWindow)
  TypeManager.registerEngineType("InputEventGesture", InputEventGesture::class, ::InputEventGesture)
  TypeManager.registerEngineType("InputEventJoypadButton", InputEventJoypadButton::class,
      ::InputEventJoypadButton)
  TypeManager.registerEngineType("InputEventJoypadMotion", InputEventJoypadMotion::class,
      ::InputEventJoypadMotion)
  TypeManager.registerEngineType("InputEventKey", InputEventKey::class, ::InputEventKey)
  TypeManager.registerEngineType("InputEventMIDI", InputEventMIDI::class, ::InputEventMIDI)
  TypeManager.registerEngineType("InputEventMagnifyGesture", InputEventMagnifyGesture::class,
      ::InputEventMagnifyGesture)
  TypeManager.registerEngineType("InputEventMouse", InputEventMouse::class, ::InputEventMouse)
  TypeManager.registerEngineType("InputEventMouseButton", InputEventMouseButton::class,
      ::InputEventMouseButton)
  TypeManager.registerEngineType("InputEventMouseMotion", InputEventMouseMotion::class,
      ::InputEventMouseMotion)
  TypeManager.registerEngineType("InputEventPanGesture", InputEventPanGesture::class,
      ::InputEventPanGesture)
  TypeManager.registerEngineType("InputEventScreenDrag", InputEventScreenDrag::class,
      ::InputEventScreenDrag)
  TypeManager.registerEngineType("InputEventScreenTouch", InputEventScreenTouch::class,
      ::InputEventScreenTouch)
  TypeManager.registerEngineType("InputEventShortcut", InputEventShortcut::class,
      ::InputEventShortcut)
  TypeManager.registerEngineType("InputEventWithModifiers", InputEventWithModifiers::class,
      ::InputEventWithModifiers)
  TypeManager.registerEngineType("InstancePlaceholder", InstancePlaceholder::class,
      ::InstancePlaceholder)
  TypeManager.registerEngineType("IntervalTweener", IntervalTweener::class, ::IntervalTweener)
  TypeManager.registerEngineType("ItemList", ItemList::class, ::ItemList)
  TypeManager.registerEngineType("JNISingleton", JNISingleton::class, ::JNISingleton)
  TypeManager.registerEngineType("JSON", JSON::class, ::JSON)
  TypeManager.registerEngineType("JSONRPC", JSONRPC::class, ::JSONRPC)
  TypeManager.registerEngineType("JavaClass", JavaClass::class, ::JavaClass)
  TypeManager.registerEngineType("JavaScript", JavaScript::class, ::JavaScript)
  TypeManager.registerEngineType("JavaScriptObject", JavaScriptObject::class, ::JavaScriptObject)
  TypeManager.registerEngineType("Joint2D", Joint2D::class, ::Joint2D)
  TypeManager.registerEngineType("Joint3D", Joint3D::class, ::Joint3D)
  TypeManager.registerEngineType("JvmScript", JvmScript::class, ::JvmScript)
  TypeManager.registerEngineType("KinematicCollision2D", KinematicCollision2D::class,
      ::KinematicCollision2D)
  TypeManager.registerEngineType("KinematicCollision3D", KinematicCollision3D::class,
      ::KinematicCollision3D)
  TypeManager.registerEngineType("KotlinScript", KotlinScript::class, ::KotlinScript)
  TypeManager.registerEngineType("Label", Label::class, ::Label)
  TypeManager.registerEngineType("Label3D", Label3D::class, ::Label3D)
  TypeManager.registerEngineType("LabelSettings", LabelSettings::class, ::LabelSettings)
  TypeManager.registerEngineType("Light2D", Light2D::class, ::Light2D)
  TypeManager.registerEngineType("Light3D", Light3D::class, ::Light3D)
  TypeManager.registerEngineType("LightOccluder2D", LightOccluder2D::class, ::LightOccluder2D)
  TypeManager.registerEngineType("LightmapGI", LightmapGI::class, ::LightmapGI)
  TypeManager.registerEngineType("LightmapGIData", LightmapGIData::class, ::LightmapGIData)
  TypeManager.registerEngineType("LightmapProbe", LightmapProbe::class, ::LightmapProbe)
  TypeManager.registerEngineType("Lightmapper", Lightmapper::class, ::Lightmapper)
  TypeManager.registerEngineType("LightmapperRD", LightmapperRD::class, ::LightmapperRD)
  TypeManager.registerEngineType("Line2D", Line2D::class, ::Line2D)
  TypeManager.registerEngineType("LineEdit", LineEdit::class, ::LineEdit)
  TypeManager.registerEngineType("LinkButton", LinkButton::class, ::LinkButton)
  TypeManager.registerEngineType("MainLoop", MainLoop::class, ::MainLoop)
  TypeManager.registerEngineType("MarginContainer", MarginContainer::class, ::MarginContainer)
  TypeManager.registerEngineType("Marker2D", Marker2D::class, ::Marker2D)
  TypeManager.registerEngineType("Marker3D", Marker3D::class, ::Marker3D)
  TypeManager.registerEngineType("Material", Material::class, ::Material)
  TypeManager.registerEngineType("MenuBar", MenuBar::class, ::MenuBar)
  TypeManager.registerEngineType("MenuButton", MenuButton::class, ::MenuButton)
  TypeManager.registerEngineType("Mesh", Mesh::class, ::Mesh)
  TypeManager.registerEngineType("MeshConvexDecompositionSettings",
      MeshConvexDecompositionSettings::class, ::MeshConvexDecompositionSettings)
  TypeManager.registerEngineType("MeshDataTool", MeshDataTool::class, ::MeshDataTool)
  TypeManager.registerEngineType("MeshInstance2D", MeshInstance2D::class, ::MeshInstance2D)
  TypeManager.registerEngineType("MeshInstance3D", MeshInstance3D::class, ::MeshInstance3D)
  TypeManager.registerEngineType("MeshLibrary", MeshLibrary::class, ::MeshLibrary)
  TypeManager.registerEngineType("MeshTexture", MeshTexture::class, ::MeshTexture)
  TypeManager.registerEngineType("MethodTweener", MethodTweener::class, ::MethodTweener)
  TypeManager.registerEngineType("MissingNode", MissingNode::class, ::MissingNode)
  TypeManager.registerEngineType("MissingResource", MissingResource::class, ::MissingResource)
  TypeManager.registerEngineType("MobileVRInterface", MobileVRInterface::class, ::MobileVRInterface)
  TypeManager.registerEngineType("MovieWriter", MovieWriter::class, ::MovieWriter)
  TypeManager.registerEngineType("MultiMesh", MultiMesh::class, ::MultiMesh)
  TypeManager.registerEngineType("MultiMeshInstance2D", MultiMeshInstance2D::class,
      ::MultiMeshInstance2D)
  TypeManager.registerEngineType("MultiMeshInstance3D", MultiMeshInstance3D::class,
      ::MultiMeshInstance3D)
  TypeManager.registerEngineType("MultiplayerAPI", MultiplayerAPI::class, ::MultiplayerAPI)
  TypeManager.registerEngineType("MultiplayerAPIExtension", MultiplayerAPIExtension::class,
      ::MultiplayerAPIExtension)
  TypeManager.registerEngineType("MultiplayerPeer", MultiplayerPeer::class, ::MultiplayerPeer)
  TypeManager.registerEngineType("MultiplayerPeerExtension", MultiplayerPeerExtension::class,
      ::MultiplayerPeerExtension)
  TypeManager.registerEngineType("MultiplayerSpawner", MultiplayerSpawner::class,
      ::MultiplayerSpawner)
  TypeManager.registerEngineType("MultiplayerSynchronizer", MultiplayerSynchronizer::class,
      ::MultiplayerSynchronizer)
  TypeManager.registerEngineType("Mutex", Mutex::class, ::Mutex)
  TypeManager.registerEngineType("NavigationAgent2D", NavigationAgent2D::class, ::NavigationAgent2D)
  TypeManager.registerEngineType("NavigationAgent3D", NavigationAgent3D::class, ::NavigationAgent3D)
  TypeManager.registerEngineType("NavigationLink2D", NavigationLink2D::class, ::NavigationLink2D)
  TypeManager.registerEngineType("NavigationLink3D", NavigationLink3D::class, ::NavigationLink3D)
  TypeManager.registerEngineType("NavigationMesh", NavigationMesh::class, ::NavigationMesh)
  TypeManager.registerEngineType("NavigationMeshSourceGeometryData2D",
      NavigationMeshSourceGeometryData2D::class, ::NavigationMeshSourceGeometryData2D)
  TypeManager.registerEngineType("NavigationMeshSourceGeometryData3D",
      NavigationMeshSourceGeometryData3D::class, ::NavigationMeshSourceGeometryData3D)
  TypeManager.registerEngineType("NavigationObstacle2D", NavigationObstacle2D::class,
      ::NavigationObstacle2D)
  TypeManager.registerEngineType("NavigationObstacle3D", NavigationObstacle3D::class,
      ::NavigationObstacle3D)
  TypeManager.registerEngineType("NavigationPathQueryParameters2D",
      NavigationPathQueryParameters2D::class, ::NavigationPathQueryParameters2D)
  TypeManager.registerEngineType("NavigationPathQueryParameters3D",
      NavigationPathQueryParameters3D::class, ::NavigationPathQueryParameters3D)
  TypeManager.registerEngineType("NavigationPathQueryResult2D", NavigationPathQueryResult2D::class,
      ::NavigationPathQueryResult2D)
  TypeManager.registerEngineType("NavigationPathQueryResult3D", NavigationPathQueryResult3D::class,
      ::NavigationPathQueryResult3D)
  TypeManager.registerEngineType("NavigationPolygon", NavigationPolygon::class, ::NavigationPolygon)
  TypeManager.registerEngineType("NavigationRegion2D", NavigationRegion2D::class,
      ::NavigationRegion2D)
  TypeManager.registerEngineType("NavigationRegion3D", NavigationRegion3D::class,
      ::NavigationRegion3D)
  TypeManager.registerEngineType("NinePatchRect", NinePatchRect::class, ::NinePatchRect)
  TypeManager.registerEngineType("Node", Node::class, ::Node)
  TypeManager.registerEngineType("Node2D", Node2D::class, ::Node2D)
  TypeManager.registerEngineType("Node3D", Node3D::class, ::Node3D)
  TypeManager.registerEngineType("Node3DGizmo", Node3DGizmo::class, ::Node3DGizmo)
  TypeManager.registerEngineType("Noise", Noise::class, ::Noise)
  TypeManager.registerEngineType("NoiseTexture2D", NoiseTexture2D::class, ::NoiseTexture2D)
  TypeManager.registerEngineType("NoiseTexture3D", NoiseTexture3D::class, ::NoiseTexture3D)
  TypeManager.registerEngineType("ORMMaterial3D", ORMMaterial3D::class, ::ORMMaterial3D)
  TypeManager.registerEngineType("Object", Object::class, ::Object)
  TypeManager.registerEngineType("Occluder3D", Occluder3D::class, ::Occluder3D)
  TypeManager.registerEngineType("OccluderInstance3D", OccluderInstance3D::class,
      ::OccluderInstance3D)
  TypeManager.registerEngineType("OccluderPolygon2D", OccluderPolygon2D::class, ::OccluderPolygon2D)
  TypeManager.registerEngineType("OfflineMultiplayerPeer", OfflineMultiplayerPeer::class,
      ::OfflineMultiplayerPeer)
  TypeManager.registerEngineType("OggPacketSequence", OggPacketSequence::class, ::OggPacketSequence)
  TypeManager.registerEngineType("OggPacketSequencePlayback", OggPacketSequencePlayback::class,
      ::OggPacketSequencePlayback)
  TypeManager.registerEngineType("OmniLight3D", OmniLight3D::class, ::OmniLight3D)
  TypeManager.registerEngineType("OpenXRAPIExtension", OpenXRAPIExtension::class,
      ::OpenXRAPIExtension)
  TypeManager.registerEngineType("OpenXRAction", OpenXRAction::class, ::OpenXRAction)
  TypeManager.registerEngineType("OpenXRActionMap", OpenXRActionMap::class, ::OpenXRActionMap)
  TypeManager.registerEngineType("OpenXRActionSet", OpenXRActionSet::class, ::OpenXRActionSet)
  TypeManager.registerEngineType("OpenXRCompositionLayer", OpenXRCompositionLayer::class,
      ::OpenXRCompositionLayer)
  TypeManager.registerEngineType("OpenXRCompositionLayerCylinder",
      OpenXRCompositionLayerCylinder::class, ::OpenXRCompositionLayerCylinder)
  TypeManager.registerEngineType("OpenXRCompositionLayerEquirect",
      OpenXRCompositionLayerEquirect::class, ::OpenXRCompositionLayerEquirect)
  TypeManager.registerEngineType("OpenXRCompositionLayerQuad", OpenXRCompositionLayerQuad::class,
      ::OpenXRCompositionLayerQuad)
  TypeManager.registerEngineType("OpenXRExtensionWrapperExtension",
      OpenXRExtensionWrapperExtension::class, ::OpenXRExtensionWrapperExtension)
  TypeManager.registerEngineType("OpenXRHand", OpenXRHand::class, ::OpenXRHand)
  TypeManager.registerEngineType("OpenXRIPBinding", OpenXRIPBinding::class, ::OpenXRIPBinding)
  TypeManager.registerEngineType("OpenXRInteractionProfile", OpenXRInteractionProfile::class,
      ::OpenXRInteractionProfile)
  TypeManager.registerEngineType("OpenXRInteractionProfileMetadata",
      OpenXRInteractionProfileMetadata::class, ::OpenXRInteractionProfileMetadata)
  TypeManager.registerEngineType("OpenXRInterface", OpenXRInterface::class, ::OpenXRInterface)
  TypeManager.registerEngineType("OptimizedTranslation", OptimizedTranslation::class,
      ::OptimizedTranslation)
  TypeManager.registerEngineType("OptionButton", OptionButton::class, ::OptionButton)
  TypeManager.registerEngineType("PCKPacker", PCKPacker::class, ::PCKPacker)
  TypeManager.registerEngineType("PackedDataContainer", PackedDataContainer::class,
      ::PackedDataContainer)
  TypeManager.registerEngineType("PackedDataContainerRef", PackedDataContainerRef::class,
      ::PackedDataContainerRef)
  TypeManager.registerEngineType("PackedScene", PackedScene::class, ::PackedScene)
  TypeManager.registerEngineType("PacketPeer", PacketPeer::class, ::PacketPeer)
  TypeManager.registerEngineType("PacketPeerDTLS", PacketPeerDTLS::class, ::PacketPeerDTLS)
  TypeManager.registerEngineType("PacketPeerExtension", PacketPeerExtension::class,
      ::PacketPeerExtension)
  TypeManager.registerEngineType("PacketPeerStream", PacketPeerStream::class, ::PacketPeerStream)
  TypeManager.registerEngineType("PacketPeerUDP", PacketPeerUDP::class, ::PacketPeerUDP)
  TypeManager.registerEngineType("Panel", Panel::class, ::Panel)
  TypeManager.registerEngineType("PanelContainer", PanelContainer::class, ::PanelContainer)
  TypeManager.registerEngineType("PanoramaSkyMaterial", PanoramaSkyMaterial::class,
      ::PanoramaSkyMaterial)
  TypeManager.registerEngineType("Parallax2D", Parallax2D::class, ::Parallax2D)
  TypeManager.registerEngineType("ParallaxBackground", ParallaxBackground::class,
      ::ParallaxBackground)
  TypeManager.registerEngineType("ParallaxLayer", ParallaxLayer::class, ::ParallaxLayer)
  TypeManager.registerEngineType("ParticleProcessMaterial", ParticleProcessMaterial::class,
      ::ParticleProcessMaterial)
  TypeManager.registerEngineType("Path2D", Path2D::class, ::Path2D)
  TypeManager.registerEngineType("Path3D", Path3D::class, ::Path3D)
  TypeManager.registerEngineType("PathFollow2D", PathFollow2D::class, ::PathFollow2D)
  TypeManager.registerEngineType("PathFollow3D", PathFollow3D::class, ::PathFollow3D)
  TypeManager.registerEngineType("PhysicalBone2D", PhysicalBone2D::class, ::PhysicalBone2D)
  TypeManager.registerEngineType("PhysicalBone3D", PhysicalBone3D::class, ::PhysicalBone3D)
  TypeManager.registerEngineType("PhysicalBoneSimulator3D", PhysicalBoneSimulator3D::class,
      ::PhysicalBoneSimulator3D)
  TypeManager.registerEngineType("PhysicalSkyMaterial", PhysicalSkyMaterial::class,
      ::PhysicalSkyMaterial)
  TypeManager.registerEngineType("PhysicsBody2D", PhysicsBody2D::class, ::PhysicsBody2D)
  TypeManager.registerEngineType("PhysicsBody3D", PhysicsBody3D::class, ::PhysicsBody3D)
  TypeManager.registerEngineType("PhysicsDirectBodyState2D", PhysicsDirectBodyState2D::class,
      ::PhysicsDirectBodyState2D)
  TypeManager.registerEngineType("PhysicsDirectBodyState2DExtension",
      PhysicsDirectBodyState2DExtension::class, ::PhysicsDirectBodyState2DExtension)
  TypeManager.registerEngineType("PhysicsDirectBodyState3D", PhysicsDirectBodyState3D::class,
      ::PhysicsDirectBodyState3D)
  TypeManager.registerEngineType("PhysicsDirectBodyState3DExtension",
      PhysicsDirectBodyState3DExtension::class, ::PhysicsDirectBodyState3DExtension)
  TypeManager.registerEngineType("PhysicsDirectSpaceState2D", PhysicsDirectSpaceState2D::class,
      ::PhysicsDirectSpaceState2D)
  TypeManager.registerEngineType("PhysicsDirectSpaceState2DExtension",
      PhysicsDirectSpaceState2DExtension::class, ::PhysicsDirectSpaceState2DExtension)
  TypeManager.registerEngineType("PhysicsDirectSpaceState3D", PhysicsDirectSpaceState3D::class,
      ::PhysicsDirectSpaceState3D)
  TypeManager.registerEngineType("PhysicsDirectSpaceState3DExtension",
      PhysicsDirectSpaceState3DExtension::class, ::PhysicsDirectSpaceState3DExtension)
  TypeManager.registerEngineType("PhysicsMaterial", PhysicsMaterial::class, ::PhysicsMaterial)
  TypeManager.registerEngineType("PhysicsPointQueryParameters2D",
      PhysicsPointQueryParameters2D::class, ::PhysicsPointQueryParameters2D)
  TypeManager.registerEngineType("PhysicsPointQueryParameters3D",
      PhysicsPointQueryParameters3D::class, ::PhysicsPointQueryParameters3D)
  TypeManager.registerEngineType("PhysicsRayQueryParameters2D", PhysicsRayQueryParameters2D::class,
      ::PhysicsRayQueryParameters2D)
  TypeManager.registerEngineType("PhysicsRayQueryParameters3D", PhysicsRayQueryParameters3D::class,
      ::PhysicsRayQueryParameters3D)
  TypeManager.registerEngineType("PhysicsServer3DRenderingServerHandler",
      PhysicsServer3DRenderingServerHandler::class, ::PhysicsServer3DRenderingServerHandler)
  TypeManager.registerEngineType("PhysicsShapeQueryParameters2D",
      PhysicsShapeQueryParameters2D::class, ::PhysicsShapeQueryParameters2D)
  TypeManager.registerEngineType("PhysicsShapeQueryParameters3D",
      PhysicsShapeQueryParameters3D::class, ::PhysicsShapeQueryParameters3D)
  TypeManager.registerEngineType("PhysicsTestMotionParameters2D",
      PhysicsTestMotionParameters2D::class, ::PhysicsTestMotionParameters2D)
  TypeManager.registerEngineType("PhysicsTestMotionParameters3D",
      PhysicsTestMotionParameters3D::class, ::PhysicsTestMotionParameters3D)
  TypeManager.registerEngineType("PhysicsTestMotionResult2D", PhysicsTestMotionResult2D::class,
      ::PhysicsTestMotionResult2D)
  TypeManager.registerEngineType("PhysicsTestMotionResult3D", PhysicsTestMotionResult3D::class,
      ::PhysicsTestMotionResult3D)
  TypeManager.registerEngineType("PinJoint2D", PinJoint2D::class, ::PinJoint2D)
  TypeManager.registerEngineType("PinJoint3D", PinJoint3D::class, ::PinJoint3D)
  TypeManager.registerEngineType("PlaceholderCubemap", PlaceholderCubemap::class,
      ::PlaceholderCubemap)
  TypeManager.registerEngineType("PlaceholderCubemapArray", PlaceholderCubemapArray::class,
      ::PlaceholderCubemapArray)
  TypeManager.registerEngineType("PlaceholderMaterial", PlaceholderMaterial::class,
      ::PlaceholderMaterial)
  TypeManager.registerEngineType("PlaceholderMesh", PlaceholderMesh::class, ::PlaceholderMesh)
  TypeManager.registerEngineType("PlaceholderTexture2D", PlaceholderTexture2D::class,
      ::PlaceholderTexture2D)
  TypeManager.registerEngineType("PlaceholderTexture2DArray", PlaceholderTexture2DArray::class,
      ::PlaceholderTexture2DArray)
  TypeManager.registerEngineType("PlaceholderTexture3D", PlaceholderTexture3D::class,
      ::PlaceholderTexture3D)
  TypeManager.registerEngineType("PlaceholderTextureLayered", PlaceholderTextureLayered::class,
      ::PlaceholderTextureLayered)
  TypeManager.registerEngineType("PlaneMesh", PlaneMesh::class, ::PlaneMesh)
  TypeManager.registerEngineType("PointLight2D", PointLight2D::class, ::PointLight2D)
  TypeManager.registerEngineType("PointMesh", PointMesh::class, ::PointMesh)
  TypeManager.registerEngineType("Polygon2D", Polygon2D::class, ::Polygon2D)
  TypeManager.registerEngineType("PolygonOccluder3D", PolygonOccluder3D::class, ::PolygonOccluder3D)
  TypeManager.registerEngineType("PolygonPathFinder", PolygonPathFinder::class, ::PolygonPathFinder)
  TypeManager.registerEngineType("Popup", Popup::class, ::Popup)
  TypeManager.registerEngineType("PopupMenu", PopupMenu::class, ::PopupMenu)
  TypeManager.registerEngineType("PopupPanel", PopupPanel::class, ::PopupPanel)
  TypeManager.registerEngineType("PortableCompressedTexture2D", PortableCompressedTexture2D::class,
      ::PortableCompressedTexture2D)
  TypeManager.registerEngineType("PrimitiveMesh", PrimitiveMesh::class, ::PrimitiveMesh)
  TypeManager.registerEngineType("PrismMesh", PrismMesh::class, ::PrismMesh)
  TypeManager.registerEngineType("ProceduralSkyMaterial", ProceduralSkyMaterial::class,
      ::ProceduralSkyMaterial)
  TypeManager.registerEngineType("ProgressBar", ProgressBar::class, ::ProgressBar)
  TypeManager.registerEngineType("PropertyTweener", PropertyTweener::class, ::PropertyTweener)
  TypeManager.registerEngineType("QuadMesh", QuadMesh::class, ::QuadMesh)
  TypeManager.registerEngineType("QuadOccluder3D", QuadOccluder3D::class, ::QuadOccluder3D)
  TypeManager.registerEngineType("RDAttachmentFormat", RDAttachmentFormat::class,
      ::RDAttachmentFormat)
  TypeManager.registerEngineType("RDFramebufferPass", RDFramebufferPass::class, ::RDFramebufferPass)
  TypeManager.registerEngineType("RDPipelineColorBlendState", RDPipelineColorBlendState::class,
      ::RDPipelineColorBlendState)
  TypeManager.registerEngineType("RDPipelineColorBlendStateAttachment",
      RDPipelineColorBlendStateAttachment::class, ::RDPipelineColorBlendStateAttachment)
  TypeManager.registerEngineType("RDPipelineDepthStencilState", RDPipelineDepthStencilState::class,
      ::RDPipelineDepthStencilState)
  TypeManager.registerEngineType("RDPipelineMultisampleState", RDPipelineMultisampleState::class,
      ::RDPipelineMultisampleState)
  TypeManager.registerEngineType("RDPipelineRasterizationState",
      RDPipelineRasterizationState::class, ::RDPipelineRasterizationState)
  TypeManager.registerEngineType("RDPipelineSpecializationConstant",
      RDPipelineSpecializationConstant::class, ::RDPipelineSpecializationConstant)
  TypeManager.registerEngineType("RDSamplerState", RDSamplerState::class, ::RDSamplerState)
  TypeManager.registerEngineType("RDShaderFile", RDShaderFile::class, ::RDShaderFile)
  TypeManager.registerEngineType("RDShaderSPIRV", RDShaderSPIRV::class, ::RDShaderSPIRV)
  TypeManager.registerEngineType("RDShaderSource", RDShaderSource::class, ::RDShaderSource)
  TypeManager.registerEngineType("RDTextureFormat", RDTextureFormat::class, ::RDTextureFormat)
  TypeManager.registerEngineType("RDTextureView", RDTextureView::class, ::RDTextureView)
  TypeManager.registerEngineType("RDUniform", RDUniform::class, ::RDUniform)
  TypeManager.registerEngineType("RDVertexAttribute", RDVertexAttribute::class, ::RDVertexAttribute)
  TypeManager.registerEngineType("RandomNumberGenerator", RandomNumberGenerator::class,
      ::RandomNumberGenerator)
  TypeManager.registerEngineType("Range", Range::class, ::Range)
  TypeManager.registerEngineType("RayCast2D", RayCast2D::class, ::RayCast2D)
  TypeManager.registerEngineType("RayCast3D", RayCast3D::class, ::RayCast3D)
  TypeManager.registerEngineType("RectangleShape2D", RectangleShape2D::class, ::RectangleShape2D)
  TypeManager.registerEngineType("RefCounted", RefCounted::class, ::RefCounted)
  TypeManager.registerEngineType("ReferenceRect", ReferenceRect::class, ::ReferenceRect)
  TypeManager.registerEngineType("ReflectionProbe", ReflectionProbe::class, ::ReflectionProbe)
  TypeManager.registerEngineType("RegEx", RegEx::class, ::RegEx)
  TypeManager.registerEngineType("RegExMatch", RegExMatch::class, ::RegExMatch)
  TypeManager.registerEngineType("RemoteTransform2D", RemoteTransform2D::class, ::RemoteTransform2D)
  TypeManager.registerEngineType("RemoteTransform3D", RemoteTransform3D::class, ::RemoteTransform3D)
  TypeManager.registerEngineType("RenderData", RenderData::class, ::RenderData)
  TypeManager.registerEngineType("RenderDataExtension", RenderDataExtension::class,
      ::RenderDataExtension)
  TypeManager.registerEngineType("RenderDataRD", RenderDataRD::class, ::RenderDataRD)
  TypeManager.registerEngineType("RenderSceneBuffers", RenderSceneBuffers::class,
      ::RenderSceneBuffers)
  TypeManager.registerEngineType("RenderSceneBuffersConfiguration",
      RenderSceneBuffersConfiguration::class, ::RenderSceneBuffersConfiguration)
  TypeManager.registerEngineType("RenderSceneBuffersExtension", RenderSceneBuffersExtension::class,
      ::RenderSceneBuffersExtension)
  TypeManager.registerEngineType("RenderSceneBuffersRD", RenderSceneBuffersRD::class,
      ::RenderSceneBuffersRD)
  TypeManager.registerEngineType("RenderSceneData", RenderSceneData::class, ::RenderSceneData)
  TypeManager.registerEngineType("RenderSceneDataExtension", RenderSceneDataExtension::class,
      ::RenderSceneDataExtension)
  TypeManager.registerEngineType("RenderSceneDataRD", RenderSceneDataRD::class, ::RenderSceneDataRD)
  TypeManager.registerEngineType("RenderingDevice", RenderingDevice::class, ::RenderingDevice)
  TypeManager.registerEngineType("Resource", Resource::class, ::Resource)
  TypeManager.registerEngineType("ResourceFormatLoader", ResourceFormatLoader::class,
      ::ResourceFormatLoader)
  TypeManager.registerEngineType("ResourceFormatSaver", ResourceFormatSaver::class,
      ::ResourceFormatSaver)
  TypeManager.registerEngineType("ResourceImporter", ResourceImporter::class, ::ResourceImporter)
  TypeManager.registerEngineType("ResourcePreloader", ResourcePreloader::class, ::ResourcePreloader)
  TypeManager.registerEngineType("RibbonTrailMesh", RibbonTrailMesh::class, ::RibbonTrailMesh)
  TypeManager.registerEngineType("RichTextEffect", RichTextEffect::class, ::RichTextEffect)
  TypeManager.registerEngineType("RichTextLabel", RichTextLabel::class, ::RichTextLabel)
  TypeManager.registerEngineType("RigidBody2D", RigidBody2D::class, ::RigidBody2D)
  TypeManager.registerEngineType("RigidBody3D", RigidBody3D::class, ::RigidBody3D)
  TypeManager.registerEngineType("RootMotionView", RootMotionView::class, ::RootMotionView)
  TypeManager.registerEngineType("SceneMultiplayer", SceneMultiplayer::class, ::SceneMultiplayer)
  TypeManager.registerEngineType("SceneReplicationConfig", SceneReplicationConfig::class,
      ::SceneReplicationConfig)
  TypeManager.registerEngineType("SceneState", SceneState::class, ::SceneState)
  TypeManager.registerEngineType("SceneTree", SceneTree::class, ::SceneTree)
  TypeManager.registerEngineType("SceneTreeTimer", SceneTreeTimer::class, ::SceneTreeTimer)
  TypeManager.registerEngineType("Script", Script::class, ::Script)
  TypeManager.registerEngineType("ScriptExtension", ScriptExtension::class, ::ScriptExtension)
  TypeManager.registerEngineType("ScriptLanguage", ScriptLanguage::class, ::ScriptLanguage)
  TypeManager.registerEngineType("ScriptLanguageExtension", ScriptLanguageExtension::class,
      ::ScriptLanguageExtension)
  TypeManager.registerEngineType("ScrollBar", ScrollBar::class, ::ScrollBar)
  TypeManager.registerEngineType("ScrollContainer", ScrollContainer::class, ::ScrollContainer)
  TypeManager.registerEngineType("SegmentShape2D", SegmentShape2D::class, ::SegmentShape2D)
  TypeManager.registerEngineType("Semaphore", Semaphore::class, ::Semaphore)
  TypeManager.registerEngineType("SeparationRayShape2D", SeparationRayShape2D::class,
      ::SeparationRayShape2D)
  TypeManager.registerEngineType("SeparationRayShape3D", SeparationRayShape3D::class,
      ::SeparationRayShape3D)
  TypeManager.registerEngineType("Separator", Separator::class, ::Separator)
  TypeManager.registerEngineType("Shader", Shader::class, ::Shader)
  TypeManager.registerEngineType("ShaderGlobalsOverride", ShaderGlobalsOverride::class,
      ::ShaderGlobalsOverride)
  TypeManager.registerEngineType("ShaderInclude", ShaderInclude::class, ::ShaderInclude)
  TypeManager.registerEngineType("ShaderMaterial", ShaderMaterial::class, ::ShaderMaterial)
  TypeManager.registerEngineType("Shape2D", Shape2D::class, ::Shape2D)
  TypeManager.registerEngineType("Shape3D", Shape3D::class, ::Shape3D)
  TypeManager.registerEngineType("ShapeCast2D", ShapeCast2D::class, ::ShapeCast2D)
  TypeManager.registerEngineType("ShapeCast3D", ShapeCast3D::class, ::ShapeCast3D)
  TypeManager.registerEngineType("Shortcut", Shortcut::class, ::Shortcut)
  TypeManager.registerEngineType("Skeleton2D", Skeleton2D::class, ::Skeleton2D)
  TypeManager.registerEngineType("Skeleton3D", Skeleton3D::class, ::Skeleton3D)
  TypeManager.registerEngineType("SkeletonIK3D", SkeletonIK3D::class, ::SkeletonIK3D)
  TypeManager.registerEngineType("SkeletonModification2D", SkeletonModification2D::class,
      ::SkeletonModification2D)
  TypeManager.registerEngineType("SkeletonModification2DCCDIK", SkeletonModification2DCCDIK::class,
      ::SkeletonModification2DCCDIK)
  TypeManager.registerEngineType("SkeletonModification2DFABRIK",
      SkeletonModification2DFABRIK::class, ::SkeletonModification2DFABRIK)
  TypeManager.registerEngineType("SkeletonModification2DJiggle",
      SkeletonModification2DJiggle::class, ::SkeletonModification2DJiggle)
  TypeManager.registerEngineType("SkeletonModification2DLookAt",
      SkeletonModification2DLookAt::class, ::SkeletonModification2DLookAt)
  TypeManager.registerEngineType("SkeletonModification2DPhysicalBones",
      SkeletonModification2DPhysicalBones::class, ::SkeletonModification2DPhysicalBones)
  TypeManager.registerEngineType("SkeletonModification2DStackHolder",
      SkeletonModification2DStackHolder::class, ::SkeletonModification2DStackHolder)
  TypeManager.registerEngineType("SkeletonModification2DTwoBoneIK",
      SkeletonModification2DTwoBoneIK::class, ::SkeletonModification2DTwoBoneIK)
  TypeManager.registerEngineType("SkeletonModificationStack2D", SkeletonModificationStack2D::class,
      ::SkeletonModificationStack2D)
  TypeManager.registerEngineType("SkeletonModifier3D", SkeletonModifier3D::class,
      ::SkeletonModifier3D)
  TypeManager.registerEngineType("SkeletonProfile", SkeletonProfile::class, ::SkeletonProfile)
  TypeManager.registerEngineType("SkeletonProfileHumanoid", SkeletonProfileHumanoid::class,
      ::SkeletonProfileHumanoid)
  TypeManager.registerEngineType("Skin", Skin::class, ::Skin)
  TypeManager.registerEngineType("SkinReference", SkinReference::class, ::SkinReference)
  TypeManager.registerEngineType("Sky", Sky::class, ::Sky)
  TypeManager.registerEngineType("Slider", Slider::class, ::Slider)
  TypeManager.registerEngineType("SliderJoint3D", SliderJoint3D::class, ::SliderJoint3D)
  TypeManager.registerEngineType("SoftBody3D", SoftBody3D::class, ::SoftBody3D)
  TypeManager.registerEngineType("SphereMesh", SphereMesh::class, ::SphereMesh)
  TypeManager.registerEngineType("SphereOccluder3D", SphereOccluder3D::class, ::SphereOccluder3D)
  TypeManager.registerEngineType("SphereShape3D", SphereShape3D::class, ::SphereShape3D)
  TypeManager.registerEngineType("SpinBox", SpinBox::class, ::SpinBox)
  TypeManager.registerEngineType("SplitContainer", SplitContainer::class, ::SplitContainer)
  TypeManager.registerEngineType("SpotLight3D", SpotLight3D::class, ::SpotLight3D)
  TypeManager.registerEngineType("SpringArm3D", SpringArm3D::class, ::SpringArm3D)
  TypeManager.registerEngineType("Sprite2D", Sprite2D::class, ::Sprite2D)
  TypeManager.registerEngineType("Sprite3D", Sprite3D::class, ::Sprite3D)
  TypeManager.registerEngineType("SpriteBase3D", SpriteBase3D::class, ::SpriteBase3D)
  TypeManager.registerEngineType("SpriteFrames", SpriteFrames::class, ::SpriteFrames)
  TypeManager.registerEngineType("StandardMaterial3D", StandardMaterial3D::class,
      ::StandardMaterial3D)
  TypeManager.registerEngineType("StaticBody2D", StaticBody2D::class, ::StaticBody2D)
  TypeManager.registerEngineType("StaticBody3D", StaticBody3D::class, ::StaticBody3D)
  TypeManager.registerEngineType("StatusIndicator", StatusIndicator::class, ::StatusIndicator)
  TypeManager.registerEngineType("StreamPeer", StreamPeer::class, ::StreamPeer)
  TypeManager.registerEngineType("StreamPeerBuffer", StreamPeerBuffer::class, ::StreamPeerBuffer)
  TypeManager.registerEngineType("StreamPeerExtension", StreamPeerExtension::class,
      ::StreamPeerExtension)
  TypeManager.registerEngineType("StreamPeerGZIP", StreamPeerGZIP::class, ::StreamPeerGZIP)
  TypeManager.registerEngineType("StreamPeerTCP", StreamPeerTCP::class, ::StreamPeerTCP)
  TypeManager.registerEngineType("StreamPeerTLS", StreamPeerTLS::class, ::StreamPeerTLS)
  TypeManager.registerEngineType("StyleBox", StyleBox::class, ::StyleBox)
  TypeManager.registerEngineType("StyleBoxEmpty", StyleBoxEmpty::class, ::StyleBoxEmpty)
  TypeManager.registerEngineType("StyleBoxFlat", StyleBoxFlat::class, ::StyleBoxFlat)
  TypeManager.registerEngineType("StyleBoxLine", StyleBoxLine::class, ::StyleBoxLine)
  TypeManager.registerEngineType("StyleBoxTexture", StyleBoxTexture::class, ::StyleBoxTexture)
  TypeManager.registerEngineType("SubViewport", SubViewport::class, ::SubViewport)
  TypeManager.registerEngineType("SubViewportContainer", SubViewportContainer::class,
      ::SubViewportContainer)
  TypeManager.registerEngineType("SurfaceTool", SurfaceTool::class, ::SurfaceTool)
  TypeManager.registerEngineType("SyntaxHighlighter", SyntaxHighlighter::class, ::SyntaxHighlighter)
  TypeManager.registerEngineType("SystemFont", SystemFont::class, ::SystemFont)
  TypeManager.registerEngineType("TCPServer", TCPServer::class, ::TCPServer)
  TypeManager.registerEngineType("TLSOptions", TLSOptions::class, ::TLSOptions)
  TypeManager.registerEngineType("TabBar", TabBar::class, ::TabBar)
  TypeManager.registerEngineType("TabContainer", TabContainer::class, ::TabContainer)
  TypeManager.registerEngineType("TextEdit", TextEdit::class, ::TextEdit)
  TypeManager.registerEngineType("TextLine", TextLine::class, ::TextLine)
  TypeManager.registerEngineType("TextMesh", TextMesh::class, ::TextMesh)
  TypeManager.registerEngineType("TextParagraph", TextParagraph::class, ::TextParagraph)
  TypeManager.registerEngineType("TextServer", TextServer::class, ::TextServer)
  TypeManager.registerEngineType("TextServerAdvanced", TextServerAdvanced::class,
      ::TextServerAdvanced)
  TypeManager.registerEngineType("TextServerDummy", TextServerDummy::class, ::TextServerDummy)
  TypeManager.registerEngineType("TextServerExtension", TextServerExtension::class,
      ::TextServerExtension)
  TypeManager.registerEngineType("Texture", Texture::class, ::Texture)
  TypeManager.registerEngineType("Texture2D", Texture2D::class, ::Texture2D)
  TypeManager.registerEngineType("Texture2DArray", Texture2DArray::class, ::Texture2DArray)
  TypeManager.registerEngineType("Texture2DArrayRD", Texture2DArrayRD::class, ::Texture2DArrayRD)
  TypeManager.registerEngineType("Texture2DRD", Texture2DRD::class, ::Texture2DRD)
  TypeManager.registerEngineType("Texture3D", Texture3D::class, ::Texture3D)
  TypeManager.registerEngineType("Texture3DRD", Texture3DRD::class, ::Texture3DRD)
  TypeManager.registerEngineType("TextureButton", TextureButton::class, ::TextureButton)
  TypeManager.registerEngineType("TextureCubemapArrayRD", TextureCubemapArrayRD::class,
      ::TextureCubemapArrayRD)
  TypeManager.registerEngineType("TextureCubemapRD", TextureCubemapRD::class, ::TextureCubemapRD)
  TypeManager.registerEngineType("TextureLayered", TextureLayered::class, ::TextureLayered)
  TypeManager.registerEngineType("TextureLayeredRD", TextureLayeredRD::class, ::TextureLayeredRD)
  TypeManager.registerEngineType("TextureProgressBar", TextureProgressBar::class,
      ::TextureProgressBar)
  TypeManager.registerEngineType("TextureRect", TextureRect::class, ::TextureRect)
  TypeManager.registerEngineType("Theme", Theme::class, ::Theme)
  TypeManager.registerEngineType("Thread", Thread::class, ::Thread)
  TypeManager.registerEngineType("TileData", TileData::class, ::TileData)
  TypeManager.registerEngineType("TileMap", TileMap::class, ::TileMap)
  TypeManager.registerEngineType("TileMapLayer", TileMapLayer::class, ::TileMapLayer)
  TypeManager.registerEngineType("TileMapPattern", TileMapPattern::class, ::TileMapPattern)
  TypeManager.registerEngineType("TileSet", TileSet::class, ::TileSet)
  TypeManager.registerEngineType("TileSetAtlasSource", TileSetAtlasSource::class,
      ::TileSetAtlasSource)
  TypeManager.registerEngineType("TileSetScenesCollectionSource",
      TileSetScenesCollectionSource::class, ::TileSetScenesCollectionSource)
  TypeManager.registerEngineType("TileSetSource", TileSetSource::class, ::TileSetSource)
  TypeManager.registerEngineType("Timer", Timer::class, ::Timer)
  TypeManager.registerEngineType("TorusMesh", TorusMesh::class, ::TorusMesh)
  TypeManager.registerEngineType("TouchScreenButton", TouchScreenButton::class, ::TouchScreenButton)
  TypeManager.registerEngineType("Translation", Translation::class, ::Translation)
  TypeManager.registerEngineType("Tree", Tree::class, ::Tree)
  TypeManager.registerEngineType("TreeItem", TreeItem::class, ::TreeItem)
  TypeManager.registerEngineType("TriangleMesh", TriangleMesh::class, ::TriangleMesh)
  TypeManager.registerEngineType("TubeTrailMesh", TubeTrailMesh::class, ::TubeTrailMesh)
  TypeManager.registerEngineType("Tween", Tween::class, ::Tween)
  TypeManager.registerEngineType("Tweener", Tweener::class, ::Tweener)
  TypeManager.registerEngineType("UDPServer", UDPServer::class, ::UDPServer)
  TypeManager.registerEngineType("UPNP", UPNP::class, ::UPNP)
  TypeManager.registerEngineType("UPNPDevice", UPNPDevice::class, ::UPNPDevice)
  TypeManager.registerEngineType("UndoRedo", UndoRedo::class, ::UndoRedo)
  TypeManager.registerEngineType("UniformSetCacheRD", UniformSetCacheRD::class, ::UniformSetCacheRD)
  TypeManager.registerEngineType("VBoxContainer", VBoxContainer::class, ::VBoxContainer)
  TypeManager.registerEngineType("VFlowContainer", VFlowContainer::class, ::VFlowContainer)
  TypeManager.registerEngineType("VScrollBar", VScrollBar::class, ::VScrollBar)
  TypeManager.registerEngineType("VSeparator", VSeparator::class, ::VSeparator)
  TypeManager.registerEngineType("VSlider", VSlider::class, ::VSlider)
  TypeManager.registerEngineType("VSplitContainer", VSplitContainer::class, ::VSplitContainer)
  TypeManager.registerEngineType("VehicleBody3D", VehicleBody3D::class, ::VehicleBody3D)
  TypeManager.registerEngineType("VehicleWheel3D", VehicleWheel3D::class, ::VehicleWheel3D)
  TypeManager.registerEngineType("VideoStream", VideoStream::class, ::VideoStream)
  TypeManager.registerEngineType("VideoStreamPlayback", VideoStreamPlayback::class,
      ::VideoStreamPlayback)
  TypeManager.registerEngineType("VideoStreamPlayer", VideoStreamPlayer::class, ::VideoStreamPlayer)
  TypeManager.registerEngineType("VideoStreamTheora", VideoStreamTheora::class, ::VideoStreamTheora)
  TypeManager.registerEngineType("Viewport", Viewport::class, ::Viewport)
  TypeManager.registerEngineType("ViewportTexture", ViewportTexture::class, ::ViewportTexture)
  TypeManager.registerEngineType("VisibleOnScreenEnabler2D", VisibleOnScreenEnabler2D::class,
      ::VisibleOnScreenEnabler2D)
  TypeManager.registerEngineType("VisibleOnScreenEnabler3D", VisibleOnScreenEnabler3D::class,
      ::VisibleOnScreenEnabler3D)
  TypeManager.registerEngineType("VisibleOnScreenNotifier2D", VisibleOnScreenNotifier2D::class,
      ::VisibleOnScreenNotifier2D)
  TypeManager.registerEngineType("VisibleOnScreenNotifier3D", VisibleOnScreenNotifier3D::class,
      ::VisibleOnScreenNotifier3D)
  TypeManager.registerEngineType("VisualInstance3D", VisualInstance3D::class, ::VisualInstance3D)
  TypeManager.registerEngineType("VisualShader", VisualShader::class, ::VisualShader)
  TypeManager.registerEngineType("VisualShaderNode", VisualShaderNode::class, ::VisualShaderNode)
  TypeManager.registerEngineType("VisualShaderNodeBillboard", VisualShaderNodeBillboard::class,
      ::VisualShaderNodeBillboard)
  TypeManager.registerEngineType("VisualShaderNodeBooleanConstant",
      VisualShaderNodeBooleanConstant::class, ::VisualShaderNodeBooleanConstant)
  TypeManager.registerEngineType("VisualShaderNodeBooleanParameter",
      VisualShaderNodeBooleanParameter::class, ::VisualShaderNodeBooleanParameter)
  TypeManager.registerEngineType("VisualShaderNodeClamp", VisualShaderNodeClamp::class,
      ::VisualShaderNodeClamp)
  TypeManager.registerEngineType("VisualShaderNodeColorConstant",
      VisualShaderNodeColorConstant::class, ::VisualShaderNodeColorConstant)
  TypeManager.registerEngineType("VisualShaderNodeColorFunc", VisualShaderNodeColorFunc::class,
      ::VisualShaderNodeColorFunc)
  TypeManager.registerEngineType("VisualShaderNodeColorOp", VisualShaderNodeColorOp::class,
      ::VisualShaderNodeColorOp)
  TypeManager.registerEngineType("VisualShaderNodeColorParameter",
      VisualShaderNodeColorParameter::class, ::VisualShaderNodeColorParameter)
  TypeManager.registerEngineType("VisualShaderNodeComment", VisualShaderNodeComment::class,
      ::VisualShaderNodeComment)
  TypeManager.registerEngineType("VisualShaderNodeCompare", VisualShaderNodeCompare::class,
      ::VisualShaderNodeCompare)
  TypeManager.registerEngineType("VisualShaderNodeConstant", VisualShaderNodeConstant::class,
      ::VisualShaderNodeConstant)
  TypeManager.registerEngineType("VisualShaderNodeCubemap", VisualShaderNodeCubemap::class,
      ::VisualShaderNodeCubemap)
  TypeManager.registerEngineType("VisualShaderNodeCubemapParameter",
      VisualShaderNodeCubemapParameter::class, ::VisualShaderNodeCubemapParameter)
  TypeManager.registerEngineType("VisualShaderNodeCurveTexture",
      VisualShaderNodeCurveTexture::class, ::VisualShaderNodeCurveTexture)
  TypeManager.registerEngineType("VisualShaderNodeCurveXYZTexture",
      VisualShaderNodeCurveXYZTexture::class, ::VisualShaderNodeCurveXYZTexture)
  TypeManager.registerEngineType("VisualShaderNodeCustom", VisualShaderNodeCustom::class,
      ::VisualShaderNodeCustom)
  TypeManager.registerEngineType("VisualShaderNodeDerivativeFunc",
      VisualShaderNodeDerivativeFunc::class, ::VisualShaderNodeDerivativeFunc)
  TypeManager.registerEngineType("VisualShaderNodeDeterminant", VisualShaderNodeDeterminant::class,
      ::VisualShaderNodeDeterminant)
  TypeManager.registerEngineType("VisualShaderNodeDistanceFade",
      VisualShaderNodeDistanceFade::class, ::VisualShaderNodeDistanceFade)
  TypeManager.registerEngineType("VisualShaderNodeDotProduct", VisualShaderNodeDotProduct::class,
      ::VisualShaderNodeDotProduct)
  TypeManager.registerEngineType("VisualShaderNodeExpression", VisualShaderNodeExpression::class,
      ::VisualShaderNodeExpression)
  TypeManager.registerEngineType("VisualShaderNodeFaceForward", VisualShaderNodeFaceForward::class,
      ::VisualShaderNodeFaceForward)
  TypeManager.registerEngineType("VisualShaderNodeFloatConstant",
      VisualShaderNodeFloatConstant::class, ::VisualShaderNodeFloatConstant)
  TypeManager.registerEngineType("VisualShaderNodeFloatFunc", VisualShaderNodeFloatFunc::class,
      ::VisualShaderNodeFloatFunc)
  TypeManager.registerEngineType("VisualShaderNodeFloatOp", VisualShaderNodeFloatOp::class,
      ::VisualShaderNodeFloatOp)
  TypeManager.registerEngineType("VisualShaderNodeFloatParameter",
      VisualShaderNodeFloatParameter::class, ::VisualShaderNodeFloatParameter)
  TypeManager.registerEngineType("VisualShaderNodeFrame", VisualShaderNodeFrame::class,
      ::VisualShaderNodeFrame)
  TypeManager.registerEngineType("VisualShaderNodeFresnel", VisualShaderNodeFresnel::class,
      ::VisualShaderNodeFresnel)
  TypeManager.registerEngineType("VisualShaderNodeGlobalExpression",
      VisualShaderNodeGlobalExpression::class, ::VisualShaderNodeGlobalExpression)
  TypeManager.registerEngineType("VisualShaderNodeGroupBase", VisualShaderNodeGroupBase::class,
      ::VisualShaderNodeGroupBase)
  TypeManager.registerEngineType("VisualShaderNodeIf", VisualShaderNodeIf::class,
      ::VisualShaderNodeIf)
  TypeManager.registerEngineType("VisualShaderNodeInput", VisualShaderNodeInput::class,
      ::VisualShaderNodeInput)
  TypeManager.registerEngineType("VisualShaderNodeIntConstant", VisualShaderNodeIntConstant::class,
      ::VisualShaderNodeIntConstant)
  TypeManager.registerEngineType("VisualShaderNodeIntFunc", VisualShaderNodeIntFunc::class,
      ::VisualShaderNodeIntFunc)
  TypeManager.registerEngineType("VisualShaderNodeIntOp", VisualShaderNodeIntOp::class,
      ::VisualShaderNodeIntOp)
  TypeManager.registerEngineType("VisualShaderNodeIntParameter",
      VisualShaderNodeIntParameter::class, ::VisualShaderNodeIntParameter)
  TypeManager.registerEngineType("VisualShaderNodeIs", VisualShaderNodeIs::class,
      ::VisualShaderNodeIs)
  TypeManager.registerEngineType("VisualShaderNodeLinearSceneDepth",
      VisualShaderNodeLinearSceneDepth::class, ::VisualShaderNodeLinearSceneDepth)
  TypeManager.registerEngineType("VisualShaderNodeMix", VisualShaderNodeMix::class,
      ::VisualShaderNodeMix)
  TypeManager.registerEngineType("VisualShaderNodeMultiplyAdd", VisualShaderNodeMultiplyAdd::class,
      ::VisualShaderNodeMultiplyAdd)
  TypeManager.registerEngineType("VisualShaderNodeOuterProduct",
      VisualShaderNodeOuterProduct::class, ::VisualShaderNodeOuterProduct)
  TypeManager.registerEngineType("VisualShaderNodeOutput", VisualShaderNodeOutput::class,
      ::VisualShaderNodeOutput)
  TypeManager.registerEngineType("VisualShaderNodeParameter", VisualShaderNodeParameter::class,
      ::VisualShaderNodeParameter)
  TypeManager.registerEngineType("VisualShaderNodeParameterRef",
      VisualShaderNodeParameterRef::class, ::VisualShaderNodeParameterRef)
  TypeManager.registerEngineType("VisualShaderNodeParticleAccelerator",
      VisualShaderNodeParticleAccelerator::class, ::VisualShaderNodeParticleAccelerator)
  TypeManager.registerEngineType("VisualShaderNodeParticleBoxEmitter",
      VisualShaderNodeParticleBoxEmitter::class, ::VisualShaderNodeParticleBoxEmitter)
  TypeManager.registerEngineType("VisualShaderNodeParticleConeVelocity",
      VisualShaderNodeParticleConeVelocity::class, ::VisualShaderNodeParticleConeVelocity)
  TypeManager.registerEngineType("VisualShaderNodeParticleEmit",
      VisualShaderNodeParticleEmit::class, ::VisualShaderNodeParticleEmit)
  TypeManager.registerEngineType("VisualShaderNodeParticleEmitter",
      VisualShaderNodeParticleEmitter::class, ::VisualShaderNodeParticleEmitter)
  TypeManager.registerEngineType("VisualShaderNodeParticleMeshEmitter",
      VisualShaderNodeParticleMeshEmitter::class, ::VisualShaderNodeParticleMeshEmitter)
  TypeManager.registerEngineType("VisualShaderNodeParticleMultiplyByAxisAngle",
      VisualShaderNodeParticleMultiplyByAxisAngle::class,
      ::VisualShaderNodeParticleMultiplyByAxisAngle)
  TypeManager.registerEngineType("VisualShaderNodeParticleOutput",
      VisualShaderNodeParticleOutput::class, ::VisualShaderNodeParticleOutput)
  TypeManager.registerEngineType("VisualShaderNodeParticleRandomness",
      VisualShaderNodeParticleRandomness::class, ::VisualShaderNodeParticleRandomness)
  TypeManager.registerEngineType("VisualShaderNodeParticleRingEmitter",
      VisualShaderNodeParticleRingEmitter::class, ::VisualShaderNodeParticleRingEmitter)
  TypeManager.registerEngineType("VisualShaderNodeParticleSphereEmitter",
      VisualShaderNodeParticleSphereEmitter::class, ::VisualShaderNodeParticleSphereEmitter)
  TypeManager.registerEngineType("VisualShaderNodeProximityFade",
      VisualShaderNodeProximityFade::class, ::VisualShaderNodeProximityFade)
  TypeManager.registerEngineType("VisualShaderNodeRandomRange", VisualShaderNodeRandomRange::class,
      ::VisualShaderNodeRandomRange)
  TypeManager.registerEngineType("VisualShaderNodeRemap", VisualShaderNodeRemap::class,
      ::VisualShaderNodeRemap)
  TypeManager.registerEngineType("VisualShaderNodeReroute", VisualShaderNodeReroute::class,
      ::VisualShaderNodeReroute)
  TypeManager.registerEngineType("VisualShaderNodeResizableBase",
      VisualShaderNodeResizableBase::class, ::VisualShaderNodeResizableBase)
  TypeManager.registerEngineType("VisualShaderNodeRotationByAxis",
      VisualShaderNodeRotationByAxis::class, ::VisualShaderNodeRotationByAxis)
  TypeManager.registerEngineType("VisualShaderNodeSDFRaymarch", VisualShaderNodeSDFRaymarch::class,
      ::VisualShaderNodeSDFRaymarch)
  TypeManager.registerEngineType("VisualShaderNodeSDFToScreenUV",
      VisualShaderNodeSDFToScreenUV::class, ::VisualShaderNodeSDFToScreenUV)
  TypeManager.registerEngineType("VisualShaderNodeSample3D", VisualShaderNodeSample3D::class,
      ::VisualShaderNodeSample3D)
  TypeManager.registerEngineType("VisualShaderNodeScreenNormalWorldSpace",
      VisualShaderNodeScreenNormalWorldSpace::class, ::VisualShaderNodeScreenNormalWorldSpace)
  TypeManager.registerEngineType("VisualShaderNodeScreenUVToSDF",
      VisualShaderNodeScreenUVToSDF::class, ::VisualShaderNodeScreenUVToSDF)
  TypeManager.registerEngineType("VisualShaderNodeSmoothStep", VisualShaderNodeSmoothStep::class,
      ::VisualShaderNodeSmoothStep)
  TypeManager.registerEngineType("VisualShaderNodeStep", VisualShaderNodeStep::class,
      ::VisualShaderNodeStep)
  TypeManager.registerEngineType("VisualShaderNodeSwitch", VisualShaderNodeSwitch::class,
      ::VisualShaderNodeSwitch)
  TypeManager.registerEngineType("VisualShaderNodeTexture", VisualShaderNodeTexture::class,
      ::VisualShaderNodeTexture)
  TypeManager.registerEngineType("VisualShaderNodeTexture2DArray",
      VisualShaderNodeTexture2DArray::class, ::VisualShaderNodeTexture2DArray)
  TypeManager.registerEngineType("VisualShaderNodeTexture2DArrayParameter",
      VisualShaderNodeTexture2DArrayParameter::class, ::VisualShaderNodeTexture2DArrayParameter)
  TypeManager.registerEngineType("VisualShaderNodeTexture2DParameter",
      VisualShaderNodeTexture2DParameter::class, ::VisualShaderNodeTexture2DParameter)
  TypeManager.registerEngineType("VisualShaderNodeTexture3D", VisualShaderNodeTexture3D::class,
      ::VisualShaderNodeTexture3D)
  TypeManager.registerEngineType("VisualShaderNodeTexture3DParameter",
      VisualShaderNodeTexture3DParameter::class, ::VisualShaderNodeTexture3DParameter)
  TypeManager.registerEngineType("VisualShaderNodeTextureParameter",
      VisualShaderNodeTextureParameter::class, ::VisualShaderNodeTextureParameter)
  TypeManager.registerEngineType("VisualShaderNodeTextureParameterTriplanar",
      VisualShaderNodeTextureParameterTriplanar::class, ::VisualShaderNodeTextureParameterTriplanar)
  TypeManager.registerEngineType("VisualShaderNodeTextureSDF", VisualShaderNodeTextureSDF::class,
      ::VisualShaderNodeTextureSDF)
  TypeManager.registerEngineType("VisualShaderNodeTextureSDFNormal",
      VisualShaderNodeTextureSDFNormal::class, ::VisualShaderNodeTextureSDFNormal)
  TypeManager.registerEngineType("VisualShaderNodeTransformCompose",
      VisualShaderNodeTransformCompose::class, ::VisualShaderNodeTransformCompose)
  TypeManager.registerEngineType("VisualShaderNodeTransformConstant",
      VisualShaderNodeTransformConstant::class, ::VisualShaderNodeTransformConstant)
  TypeManager.registerEngineType("VisualShaderNodeTransformDecompose",
      VisualShaderNodeTransformDecompose::class, ::VisualShaderNodeTransformDecompose)
  TypeManager.registerEngineType("VisualShaderNodeTransformFunc",
      VisualShaderNodeTransformFunc::class, ::VisualShaderNodeTransformFunc)
  TypeManager.registerEngineType("VisualShaderNodeTransformOp", VisualShaderNodeTransformOp::class,
      ::VisualShaderNodeTransformOp)
  TypeManager.registerEngineType("VisualShaderNodeTransformParameter",
      VisualShaderNodeTransformParameter::class, ::VisualShaderNodeTransformParameter)
  TypeManager.registerEngineType("VisualShaderNodeTransformVecMult",
      VisualShaderNodeTransformVecMult::class, ::VisualShaderNodeTransformVecMult)
  TypeManager.registerEngineType("VisualShaderNodeUIntConstant",
      VisualShaderNodeUIntConstant::class, ::VisualShaderNodeUIntConstant)
  TypeManager.registerEngineType("VisualShaderNodeUIntFunc", VisualShaderNodeUIntFunc::class,
      ::VisualShaderNodeUIntFunc)
  TypeManager.registerEngineType("VisualShaderNodeUIntOp", VisualShaderNodeUIntOp::class,
      ::VisualShaderNodeUIntOp)
  TypeManager.registerEngineType("VisualShaderNodeUIntParameter",
      VisualShaderNodeUIntParameter::class, ::VisualShaderNodeUIntParameter)
  TypeManager.registerEngineType("VisualShaderNodeUVFunc", VisualShaderNodeUVFunc::class,
      ::VisualShaderNodeUVFunc)
  TypeManager.registerEngineType("VisualShaderNodeUVPolarCoord",
      VisualShaderNodeUVPolarCoord::class, ::VisualShaderNodeUVPolarCoord)
  TypeManager.registerEngineType("VisualShaderNodeVarying", VisualShaderNodeVarying::class,
      ::VisualShaderNodeVarying)
  TypeManager.registerEngineType("VisualShaderNodeVaryingGetter",
      VisualShaderNodeVaryingGetter::class, ::VisualShaderNodeVaryingGetter)
  TypeManager.registerEngineType("VisualShaderNodeVaryingSetter",
      VisualShaderNodeVaryingSetter::class, ::VisualShaderNodeVaryingSetter)
  TypeManager.registerEngineType("VisualShaderNodeVec2Constant",
      VisualShaderNodeVec2Constant::class, ::VisualShaderNodeVec2Constant)
  TypeManager.registerEngineType("VisualShaderNodeVec2Parameter",
      VisualShaderNodeVec2Parameter::class, ::VisualShaderNodeVec2Parameter)
  TypeManager.registerEngineType("VisualShaderNodeVec3Constant",
      VisualShaderNodeVec3Constant::class, ::VisualShaderNodeVec3Constant)
  TypeManager.registerEngineType("VisualShaderNodeVec3Parameter",
      VisualShaderNodeVec3Parameter::class, ::VisualShaderNodeVec3Parameter)
  TypeManager.registerEngineType("VisualShaderNodeVec4Constant",
      VisualShaderNodeVec4Constant::class, ::VisualShaderNodeVec4Constant)
  TypeManager.registerEngineType("VisualShaderNodeVec4Parameter",
      VisualShaderNodeVec4Parameter::class, ::VisualShaderNodeVec4Parameter)
  TypeManager.registerEngineType("VisualShaderNodeVectorBase", VisualShaderNodeVectorBase::class,
      ::VisualShaderNodeVectorBase)
  TypeManager.registerEngineType("VisualShaderNodeVectorCompose",
      VisualShaderNodeVectorCompose::class, ::VisualShaderNodeVectorCompose)
  TypeManager.registerEngineType("VisualShaderNodeVectorDecompose",
      VisualShaderNodeVectorDecompose::class, ::VisualShaderNodeVectorDecompose)
  TypeManager.registerEngineType("VisualShaderNodeVectorDistance",
      VisualShaderNodeVectorDistance::class, ::VisualShaderNodeVectorDistance)
  TypeManager.registerEngineType("VisualShaderNodeVectorFunc", VisualShaderNodeVectorFunc::class,
      ::VisualShaderNodeVectorFunc)
  TypeManager.registerEngineType("VisualShaderNodeVectorLen", VisualShaderNodeVectorLen::class,
      ::VisualShaderNodeVectorLen)
  TypeManager.registerEngineType("VisualShaderNodeVectorOp", VisualShaderNodeVectorOp::class,
      ::VisualShaderNodeVectorOp)
  TypeManager.registerEngineType("VisualShaderNodeVectorRefract",
      VisualShaderNodeVectorRefract::class, ::VisualShaderNodeVectorRefract)
  TypeManager.registerEngineType("VisualShaderNodeWorldPositionFromDepth",
      VisualShaderNodeWorldPositionFromDepth::class, ::VisualShaderNodeWorldPositionFromDepth)
  TypeManager.registerEngineType("VoxelGI", VoxelGI::class, ::VoxelGI)
  TypeManager.registerEngineType("VoxelGIData", VoxelGIData::class, ::VoxelGIData)
  TypeManager.registerEngineType("WeakRef", WeakRef::class, ::WeakRef)
  TypeManager.registerEngineType("WebRTCDataChannel", WebRTCDataChannel::class, ::WebRTCDataChannel)
  TypeManager.registerEngineType("WebRTCDataChannelExtension", WebRTCDataChannelExtension::class,
      ::WebRTCDataChannelExtension)
  TypeManager.registerEngineType("WebRTCMultiplayerPeer", WebRTCMultiplayerPeer::class,
      ::WebRTCMultiplayerPeer)
  TypeManager.registerEngineType("WebRTCPeerConnection", WebRTCPeerConnection::class,
      ::WebRTCPeerConnection)
  TypeManager.registerEngineType("WebRTCPeerConnectionExtension",
      WebRTCPeerConnectionExtension::class, ::WebRTCPeerConnectionExtension)
  TypeManager.registerEngineType("WebSocketMultiplayerPeer", WebSocketMultiplayerPeer::class,
      ::WebSocketMultiplayerPeer)
  TypeManager.registerEngineType("WebSocketPeer", WebSocketPeer::class, ::WebSocketPeer)
  TypeManager.registerEngineType("WebXRInterface", WebXRInterface::class, ::WebXRInterface)
  TypeManager.registerEngineType("Window", Window::class, ::Window)
  TypeManager.registerEngineType("World2D", World2D::class, ::World2D)
  TypeManager.registerEngineType("World3D", World3D::class, ::World3D)
  TypeManager.registerEngineType("WorldBoundaryShape2D", WorldBoundaryShape2D::class,
      ::WorldBoundaryShape2D)
  TypeManager.registerEngineType("WorldBoundaryShape3D", WorldBoundaryShape3D::class,
      ::WorldBoundaryShape3D)
  TypeManager.registerEngineType("WorldEnvironment", WorldEnvironment::class, ::WorldEnvironment)
  TypeManager.registerEngineType("X509Certificate", X509Certificate::class, ::X509Certificate)
  TypeManager.registerEngineType("XMLParser", XMLParser::class, ::XMLParser)
  TypeManager.registerEngineType("XRAnchor3D", XRAnchor3D::class, ::XRAnchor3D)
  TypeManager.registerEngineType("XRBodyModifier3D", XRBodyModifier3D::class, ::XRBodyModifier3D)
  TypeManager.registerEngineType("XRBodyTracker", XRBodyTracker::class, ::XRBodyTracker)
  TypeManager.registerEngineType("XRCamera3D", XRCamera3D::class, ::XRCamera3D)
  TypeManager.registerEngineType("XRController3D", XRController3D::class, ::XRController3D)
  TypeManager.registerEngineType("XRControllerTracker", XRControllerTracker::class,
      ::XRControllerTracker)
  TypeManager.registerEngineType("XRFaceModifier3D", XRFaceModifier3D::class, ::XRFaceModifier3D)
  TypeManager.registerEngineType("XRFaceTracker", XRFaceTracker::class, ::XRFaceTracker)
  TypeManager.registerEngineType("XRHandModifier3D", XRHandModifier3D::class, ::XRHandModifier3D)
  TypeManager.registerEngineType("XRHandTracker", XRHandTracker::class, ::XRHandTracker)
  TypeManager.registerEngineType("XRInterface", XRInterface::class, ::XRInterface)
  TypeManager.registerEngineType("XRInterfaceExtension", XRInterfaceExtension::class,
      ::XRInterfaceExtension)
  TypeManager.registerEngineType("XRNode3D", XRNode3D::class, ::XRNode3D)
  TypeManager.registerEngineType("XROrigin3D", XROrigin3D::class, ::XROrigin3D)
  TypeManager.registerEngineType("XRPose", XRPose::class, ::XRPose)
  TypeManager.registerEngineType("XRPositionalTracker", XRPositionalTracker::class,
      ::XRPositionalTracker)
  TypeManager.registerEngineType("XRTracker", XRTracker::class, ::XRTracker)
  TypeManager.registerEngineType("XRVRS", XRVRS::class, ::XRVRS)
  TypeManager.registerEngineType("ZIPPacker", ZIPPacker::class, ::ZIPPacker)
  TypeManager.registerEngineType("ZIPReader", ZIPReader::class, ::ZIPReader)
}

public fun registerVariantMapping(): Unit {
  variantMapper[Performance::class] = OBJECT
  variantMapper[TextServerManager::class] = OBJECT
  variantMapper[PhysicsServer2DManager::class] = OBJECT
  variantMapper[PhysicsServer3DManager::class] = OBJECT
  variantMapper[NavigationMeshGenerator::class] = OBJECT
  variantMapper[ProjectSettings::class] = OBJECT
  variantMapper[IP::class] = OBJECT
  variantMapper[Geometry2D::class] = OBJECT
  variantMapper[Geometry3D::class] = OBJECT
  variantMapper[ResourceLoader::class] = OBJECT
  variantMapper[ResourceSaver::class] = OBJECT
  variantMapper[OS::class] = OBJECT
  variantMapper[Engine::class] = OBJECT
  variantMapper[ClassDB::class] = OBJECT
  variantMapper[Marshalls::class] = OBJECT
  variantMapper[TranslationServer::class] = OBJECT
  variantMapper[Input::class] = OBJECT
  variantMapper[InputMap::class] = OBJECT
  variantMapper[EngineDebugger::class] = OBJECT
  variantMapper[Time::class] = OBJECT
  variantMapper[GDExtensionManager::class] = OBJECT
  variantMapper[ResourceUID::class] = OBJECT
  variantMapper[WorkerThreadPool::class] = OBJECT
  variantMapper[ThemeDB::class] = OBJECT
  variantMapper[JavaClassWrapper::class] = OBJECT
  variantMapper[JavaScriptBridge::class] = OBJECT
  variantMapper[AudioServer::class] = OBJECT
  variantMapper[CameraServer::class] = OBJECT
  variantMapper[DisplayServer::class] = OBJECT
  variantMapper[NativeMenu::class] = OBJECT
  variantMapper[NavigationServer2D::class] = OBJECT
  variantMapper[NavigationServer3D::class] = OBJECT
  variantMapper[RenderingServer::class] = OBJECT
  variantMapper[PhysicsServer2D::class] = OBJECT
  variantMapper[PhysicsServer3D::class] = OBJECT
  variantMapper[XRServer::class] = OBJECT
  variantMapper[AESContext::class] = OBJECT
  variantMapper[AStar2D::class] = OBJECT
  variantMapper[AStar3D::class] = OBJECT
  variantMapper[AStarGrid2D::class] = OBJECT
  variantMapper[AcceptDialog::class] = OBJECT
  variantMapper[AnimatableBody2D::class] = OBJECT
  variantMapper[AnimatableBody3D::class] = OBJECT
  variantMapper[AnimatedSprite2D::class] = OBJECT
  variantMapper[AnimatedSprite3D::class] = OBJECT
  variantMapper[AnimatedTexture::class] = OBJECT
  variantMapper[Animation::class] = OBJECT
  variantMapper[AnimationLibrary::class] = OBJECT
  variantMapper[AnimationMixer::class] = OBJECT
  variantMapper[AnimationNode::class] = OBJECT
  variantMapper[AnimationNodeAdd2::class] = OBJECT
  variantMapper[AnimationNodeAdd3::class] = OBJECT
  variantMapper[AnimationNodeAnimation::class] = OBJECT
  variantMapper[AnimationNodeBlend2::class] = OBJECT
  variantMapper[AnimationNodeBlend3::class] = OBJECT
  variantMapper[AnimationNodeBlendSpace1D::class] = OBJECT
  variantMapper[AnimationNodeBlendSpace2D::class] = OBJECT
  variantMapper[AnimationNodeBlendTree::class] = OBJECT
  variantMapper[AnimationNodeOneShot::class] = OBJECT
  variantMapper[AnimationNodeOutput::class] = OBJECT
  variantMapper[AnimationNodeStateMachine::class] = OBJECT
  variantMapper[AnimationNodeStateMachinePlayback::class] = OBJECT
  variantMapper[AnimationNodeStateMachineTransition::class] = OBJECT
  variantMapper[AnimationNodeSub2::class] = OBJECT
  variantMapper[AnimationNodeSync::class] = OBJECT
  variantMapper[AnimationNodeTimeScale::class] = OBJECT
  variantMapper[AnimationNodeTimeSeek::class] = OBJECT
  variantMapper[AnimationNodeTransition::class] = OBJECT
  variantMapper[AnimationPlayer::class] = OBJECT
  variantMapper[AnimationRootNode::class] = OBJECT
  variantMapper[AnimationTree::class] = OBJECT
  variantMapper[Area2D::class] = OBJECT
  variantMapper[Area3D::class] = OBJECT
  variantMapper[ArrayMesh::class] = OBJECT
  variantMapper[ArrayOccluder3D::class] = OBJECT
  variantMapper[AspectRatioContainer::class] = OBJECT
  variantMapper[AtlasTexture::class] = OBJECT
  variantMapper[AudioBusLayout::class] = OBJECT
  variantMapper[AudioEffect::class] = OBJECT
  variantMapper[AudioEffectAmplify::class] = OBJECT
  variantMapper[AudioEffectBandLimitFilter::class] = OBJECT
  variantMapper[AudioEffectBandPassFilter::class] = OBJECT
  variantMapper[AudioEffectCapture::class] = OBJECT
  variantMapper[AudioEffectChorus::class] = OBJECT
  variantMapper[AudioEffectCompressor::class] = OBJECT
  variantMapper[AudioEffectDelay::class] = OBJECT
  variantMapper[AudioEffectDistortion::class] = OBJECT
  variantMapper[AudioEffectEQ::class] = OBJECT
  variantMapper[AudioEffectEQ10::class] = OBJECT
  variantMapper[AudioEffectEQ21::class] = OBJECT
  variantMapper[AudioEffectEQ6::class] = OBJECT
  variantMapper[AudioEffectFilter::class] = OBJECT
  variantMapper[AudioEffectHardLimiter::class] = OBJECT
  variantMapper[AudioEffectHighPassFilter::class] = OBJECT
  variantMapper[AudioEffectHighShelfFilter::class] = OBJECT
  variantMapper[AudioEffectInstance::class] = OBJECT
  variantMapper[AudioEffectLimiter::class] = OBJECT
  variantMapper[AudioEffectLowPassFilter::class] = OBJECT
  variantMapper[AudioEffectLowShelfFilter::class] = OBJECT
  variantMapper[AudioEffectNotchFilter::class] = OBJECT
  variantMapper[AudioEffectPanner::class] = OBJECT
  variantMapper[AudioEffectPhaser::class] = OBJECT
  variantMapper[AudioEffectPitchShift::class] = OBJECT
  variantMapper[AudioEffectRecord::class] = OBJECT
  variantMapper[AudioEffectReverb::class] = OBJECT
  variantMapper[AudioEffectSpectrumAnalyzer::class] = OBJECT
  variantMapper[AudioEffectSpectrumAnalyzerInstance::class] = OBJECT
  variantMapper[AudioEffectStereoEnhance::class] = OBJECT
  variantMapper[AudioListener2D::class] = OBJECT
  variantMapper[AudioListener3D::class] = OBJECT
  variantMapper[AudioSample::class] = OBJECT
  variantMapper[AudioSamplePlayback::class] = OBJECT
  variantMapper[AudioStream::class] = OBJECT
  variantMapper[AudioStreamGenerator::class] = OBJECT
  variantMapper[AudioStreamGeneratorPlayback::class] = OBJECT
  variantMapper[AudioStreamInteractive::class] = OBJECT
  variantMapper[AudioStreamMP3::class] = OBJECT
  variantMapper[AudioStreamMicrophone::class] = OBJECT
  variantMapper[AudioStreamOggVorbis::class] = OBJECT
  variantMapper[AudioStreamPlayback::class] = OBJECT
  variantMapper[AudioStreamPlaybackInteractive::class] = OBJECT
  variantMapper[AudioStreamPlaybackOggVorbis::class] = OBJECT
  variantMapper[AudioStreamPlaybackPlaylist::class] = OBJECT
  variantMapper[AudioStreamPlaybackPolyphonic::class] = OBJECT
  variantMapper[AudioStreamPlaybackResampled::class] = OBJECT
  variantMapper[AudioStreamPlaybackSynchronized::class] = OBJECT
  variantMapper[AudioStreamPlayer::class] = OBJECT
  variantMapper[AudioStreamPlayer2D::class] = OBJECT
  variantMapper[AudioStreamPlayer3D::class] = OBJECT
  variantMapper[AudioStreamPlaylist::class] = OBJECT
  variantMapper[AudioStreamPolyphonic::class] = OBJECT
  variantMapper[AudioStreamRandomizer::class] = OBJECT
  variantMapper[AudioStreamSynchronized::class] = OBJECT
  variantMapper[AudioStreamWAV::class] = OBJECT
  variantMapper[BackBufferCopy::class] = OBJECT
  variantMapper[BaseButton::class] = OBJECT
  variantMapper[BaseMaterial3D::class] = OBJECT
  variantMapper[BitMap::class] = OBJECT
  variantMapper[Bone2D::class] = OBJECT
  variantMapper[BoneAttachment3D::class] = OBJECT
  variantMapper[BoneMap::class] = OBJECT
  variantMapper[BoxContainer::class] = OBJECT
  variantMapper[BoxMesh::class] = OBJECT
  variantMapper[BoxOccluder3D::class] = OBJECT
  variantMapper[BoxShape3D::class] = OBJECT
  variantMapper[Button::class] = OBJECT
  variantMapper[ButtonGroup::class] = OBJECT
  variantMapper[CPUParticles2D::class] = OBJECT
  variantMapper[CPUParticles3D::class] = OBJECT
  variantMapper[CSGBox3D::class] = OBJECT
  variantMapper[CSGCombiner3D::class] = OBJECT
  variantMapper[CSGCylinder3D::class] = OBJECT
  variantMapper[CSGMesh3D::class] = OBJECT
  variantMapper[CSGPolygon3D::class] = OBJECT
  variantMapper[CSGPrimitive3D::class] = OBJECT
  variantMapper[CSGShape3D::class] = OBJECT
  variantMapper[CSGSphere3D::class] = OBJECT
  variantMapper[CSGTorus3D::class] = OBJECT
  variantMapper[CallbackTweener::class] = OBJECT
  variantMapper[Camera2D::class] = OBJECT
  variantMapper[Camera3D::class] = OBJECT
  variantMapper[CameraAttributes::class] = OBJECT
  variantMapper[CameraAttributesPhysical::class] = OBJECT
  variantMapper[CameraAttributesPractical::class] = OBJECT
  variantMapper[CameraFeed::class] = OBJECT
  variantMapper[CameraTexture::class] = OBJECT
  variantMapper[CanvasGroup::class] = OBJECT
  variantMapper[CanvasItem::class] = OBJECT
  variantMapper[CanvasItemMaterial::class] = OBJECT
  variantMapper[CanvasLayer::class] = OBJECT
  variantMapper[CanvasModulate::class] = OBJECT
  variantMapper[CanvasTexture::class] = OBJECT
  variantMapper[CapsuleMesh::class] = OBJECT
  variantMapper[CapsuleShape2D::class] = OBJECT
  variantMapper[CapsuleShape3D::class] = OBJECT
  variantMapper[CenterContainer::class] = OBJECT
  variantMapper[CharFXTransform::class] = OBJECT
  variantMapper[CharacterBody2D::class] = OBJECT
  variantMapper[CharacterBody3D::class] = OBJECT
  variantMapper[CheckBox::class] = OBJECT
  variantMapper[CheckButton::class] = OBJECT
  variantMapper[CircleShape2D::class] = OBJECT
  variantMapper[CodeEdit::class] = OBJECT
  variantMapper[CodeHighlighter::class] = OBJECT
  variantMapper[CollisionObject2D::class] = OBJECT
  variantMapper[CollisionObject3D::class] = OBJECT
  variantMapper[CollisionPolygon2D::class] = OBJECT
  variantMapper[CollisionPolygon3D::class] = OBJECT
  variantMapper[CollisionShape2D::class] = OBJECT
  variantMapper[CollisionShape3D::class] = OBJECT
  variantMapper[ColorPicker::class] = OBJECT
  variantMapper[ColorPickerButton::class] = OBJECT
  variantMapper[ColorRect::class] = OBJECT
  variantMapper[Compositor::class] = OBJECT
  variantMapper[CompositorEffect::class] = OBJECT
  variantMapper[CompressedCubemap::class] = OBJECT
  variantMapper[CompressedCubemapArray::class] = OBJECT
  variantMapper[CompressedTexture2D::class] = OBJECT
  variantMapper[CompressedTexture2DArray::class] = OBJECT
  variantMapper[CompressedTexture3D::class] = OBJECT
  variantMapper[CompressedTextureLayered::class] = OBJECT
  variantMapper[ConcavePolygonShape2D::class] = OBJECT
  variantMapper[ConcavePolygonShape3D::class] = OBJECT
  variantMapper[ConeTwistJoint3D::class] = OBJECT
  variantMapper[ConfigFile::class] = OBJECT
  variantMapper[ConfirmationDialog::class] = OBJECT
  variantMapper[Container::class] = OBJECT
  variantMapper[Control::class] = OBJECT
  variantMapper[ConvexPolygonShape2D::class] = OBJECT
  variantMapper[ConvexPolygonShape3D::class] = OBJECT
  variantMapper[Crypto::class] = OBJECT
  variantMapper[CryptoKey::class] = OBJECT
  variantMapper[Cubemap::class] = OBJECT
  variantMapper[CubemapArray::class] = OBJECT
  variantMapper[Curve::class] = OBJECT
  variantMapper[Curve2D::class] = OBJECT
  variantMapper[Curve3D::class] = OBJECT
  variantMapper[CurveTexture::class] = OBJECT
  variantMapper[CurveXYZTexture::class] = OBJECT
  variantMapper[CylinderMesh::class] = OBJECT
  variantMapper[CylinderShape3D::class] = OBJECT
  variantMapper[DTLSServer::class] = OBJECT
  variantMapper[DampedSpringJoint2D::class] = OBJECT
  variantMapper[Decal::class] = OBJECT
  variantMapper[DirAccess::class] = OBJECT
  variantMapper[DirectionalLight2D::class] = OBJECT
  variantMapper[DirectionalLight3D::class] = OBJECT
  variantMapper[ENetConnection::class] = OBJECT
  variantMapper[ENetMultiplayerPeer::class] = OBJECT
  variantMapper[ENetPacketPeer::class] = OBJECT
  variantMapper[EncodedObjectAsID::class] = OBJECT
  variantMapper[EngineProfiler::class] = OBJECT
  variantMapper[Environment::class] = OBJECT
  variantMapper[Expression::class] = OBJECT
  variantMapper[FBXDocument::class] = OBJECT
  variantMapper[FBXState::class] = OBJECT
  variantMapper[FastNoiseLite::class] = OBJECT
  variantMapper[FileAccess::class] = OBJECT
  variantMapper[FileDialog::class] = OBJECT
  variantMapper[FlowContainer::class] = OBJECT
  variantMapper[FogMaterial::class] = OBJECT
  variantMapper[FogVolume::class] = OBJECT
  variantMapper[Font::class] = OBJECT
  variantMapper[FontFile::class] = OBJECT
  variantMapper[FontVariation::class] = OBJECT
  variantMapper[FramebufferCacheRD::class] = OBJECT
  variantMapper[GDExtension::class] = OBJECT
  variantMapper[GDScript::class] = OBJECT
  variantMapper[GLTFAccessor::class] = OBJECT
  variantMapper[GLTFAnimation::class] = OBJECT
  variantMapper[GLTFBufferView::class] = OBJECT
  variantMapper[GLTFCamera::class] = OBJECT
  variantMapper[GLTFDocument::class] = OBJECT
  variantMapper[GLTFDocumentExtension::class] = OBJECT
  variantMapper[GLTFDocumentExtensionConvertImporterMesh::class] = OBJECT
  variantMapper[GLTFLight::class] = OBJECT
  variantMapper[GLTFMesh::class] = OBJECT
  variantMapper[GLTFNode::class] = OBJECT
  variantMapper[GLTFPhysicsBody::class] = OBJECT
  variantMapper[GLTFPhysicsShape::class] = OBJECT
  variantMapper[GLTFSkeleton::class] = OBJECT
  variantMapper[GLTFSkin::class] = OBJECT
  variantMapper[GLTFSpecGloss::class] = OBJECT
  variantMapper[GLTFState::class] = OBJECT
  variantMapper[GLTFTexture::class] = OBJECT
  variantMapper[GLTFTextureSampler::class] = OBJECT
  variantMapper[GPUParticles2D::class] = OBJECT
  variantMapper[GPUParticles3D::class] = OBJECT
  variantMapper[GPUParticlesAttractor3D::class] = OBJECT
  variantMapper[GPUParticlesAttractorBox3D::class] = OBJECT
  variantMapper[GPUParticlesAttractorSphere3D::class] = OBJECT
  variantMapper[GPUParticlesAttractorVectorField3D::class] = OBJECT
  variantMapper[GPUParticlesCollision3D::class] = OBJECT
  variantMapper[GPUParticlesCollisionBox3D::class] = OBJECT
  variantMapper[GPUParticlesCollisionHeightField3D::class] = OBJECT
  variantMapper[GPUParticlesCollisionSDF3D::class] = OBJECT
  variantMapper[GPUParticlesCollisionSphere3D::class] = OBJECT
  variantMapper[GdjScript::class] = OBJECT
  variantMapper[Generic6DOFJoint3D::class] = OBJECT
  variantMapper[GeometryInstance3D::class] = OBJECT
  variantMapper[Gradient::class] = OBJECT
  variantMapper[GradientTexture1D::class] = OBJECT
  variantMapper[GradientTexture2D::class] = OBJECT
  variantMapper[GraphEdit::class] = OBJECT
  variantMapper[GraphElement::class] = OBJECT
  variantMapper[GraphFrame::class] = OBJECT
  variantMapper[GraphNode::class] = OBJECT
  variantMapper[GridContainer::class] = OBJECT
  variantMapper[GridMap::class] = OBJECT
  variantMapper[GrooveJoint2D::class] = OBJECT
  variantMapper[HBoxContainer::class] = OBJECT
  variantMapper[HFlowContainer::class] = OBJECT
  variantMapper[HMACContext::class] = OBJECT
  variantMapper[HScrollBar::class] = OBJECT
  variantMapper[HSeparator::class] = OBJECT
  variantMapper[HSlider::class] = OBJECT
  variantMapper[HSplitContainer::class] = OBJECT
  variantMapper[HTTPClient::class] = OBJECT
  variantMapper[HTTPRequest::class] = OBJECT
  variantMapper[HashingContext::class] = OBJECT
  variantMapper[HeightMapShape3D::class] = OBJECT
  variantMapper[HingeJoint3D::class] = OBJECT
  variantMapper[Image::class] = OBJECT
  variantMapper[ImageFormatLoader::class] = OBJECT
  variantMapper[ImageFormatLoaderExtension::class] = OBJECT
  variantMapper[ImageTexture::class] = OBJECT
  variantMapper[ImageTexture3D::class] = OBJECT
  variantMapper[ImageTextureLayered::class] = OBJECT
  variantMapper[ImmediateMesh::class] = OBJECT
  variantMapper[ImporterMesh::class] = OBJECT
  variantMapper[ImporterMeshInstance3D::class] = OBJECT
  variantMapper[InputEvent::class] = OBJECT
  variantMapper[InputEventAction::class] = OBJECT
  variantMapper[InputEventFromWindow::class] = OBJECT
  variantMapper[InputEventGesture::class] = OBJECT
  variantMapper[InputEventJoypadButton::class] = OBJECT
  variantMapper[InputEventJoypadMotion::class] = OBJECT
  variantMapper[InputEventKey::class] = OBJECT
  variantMapper[InputEventMIDI::class] = OBJECT
  variantMapper[InputEventMagnifyGesture::class] = OBJECT
  variantMapper[InputEventMouse::class] = OBJECT
  variantMapper[InputEventMouseButton::class] = OBJECT
  variantMapper[InputEventMouseMotion::class] = OBJECT
  variantMapper[InputEventPanGesture::class] = OBJECT
  variantMapper[InputEventScreenDrag::class] = OBJECT
  variantMapper[InputEventScreenTouch::class] = OBJECT
  variantMapper[InputEventShortcut::class] = OBJECT
  variantMapper[InputEventWithModifiers::class] = OBJECT
  variantMapper[InstancePlaceholder::class] = OBJECT
  variantMapper[IntervalTweener::class] = OBJECT
  variantMapper[ItemList::class] = OBJECT
  variantMapper[JNISingleton::class] = OBJECT
  variantMapper[JSON::class] = OBJECT
  variantMapper[JSONRPC::class] = OBJECT
  variantMapper[JavaClass::class] = OBJECT
  variantMapper[JavaScript::class] = OBJECT
  variantMapper[JavaScriptObject::class] = OBJECT
  variantMapper[Joint2D::class] = OBJECT
  variantMapper[Joint3D::class] = OBJECT
  variantMapper[JvmScript::class] = OBJECT
  variantMapper[KinematicCollision2D::class] = OBJECT
  variantMapper[KinematicCollision3D::class] = OBJECT
  variantMapper[KotlinScript::class] = OBJECT
  variantMapper[Label::class] = OBJECT
  variantMapper[Label3D::class] = OBJECT
  variantMapper[LabelSettings::class] = OBJECT
  variantMapper[Light2D::class] = OBJECT
  variantMapper[Light3D::class] = OBJECT
  variantMapper[LightOccluder2D::class] = OBJECT
  variantMapper[LightmapGI::class] = OBJECT
  variantMapper[LightmapGIData::class] = OBJECT
  variantMapper[LightmapProbe::class] = OBJECT
  variantMapper[Lightmapper::class] = OBJECT
  variantMapper[LightmapperRD::class] = OBJECT
  variantMapper[Line2D::class] = OBJECT
  variantMapper[LineEdit::class] = OBJECT
  variantMapper[LinkButton::class] = OBJECT
  variantMapper[MainLoop::class] = OBJECT
  variantMapper[MarginContainer::class] = OBJECT
  variantMapper[Marker2D::class] = OBJECT
  variantMapper[Marker3D::class] = OBJECT
  variantMapper[Material::class] = OBJECT
  variantMapper[MenuBar::class] = OBJECT
  variantMapper[MenuButton::class] = OBJECT
  variantMapper[Mesh::class] = OBJECT
  variantMapper[MeshConvexDecompositionSettings::class] = OBJECT
  variantMapper[MeshDataTool::class] = OBJECT
  variantMapper[MeshInstance2D::class] = OBJECT
  variantMapper[MeshInstance3D::class] = OBJECT
  variantMapper[MeshLibrary::class] = OBJECT
  variantMapper[MeshTexture::class] = OBJECT
  variantMapper[MethodTweener::class] = OBJECT
  variantMapper[MissingNode::class] = OBJECT
  variantMapper[MissingResource::class] = OBJECT
  variantMapper[MobileVRInterface::class] = OBJECT
  variantMapper[MovieWriter::class] = OBJECT
  variantMapper[MultiMesh::class] = OBJECT
  variantMapper[MultiMeshInstance2D::class] = OBJECT
  variantMapper[MultiMeshInstance3D::class] = OBJECT
  variantMapper[MultiplayerAPI::class] = OBJECT
  variantMapper[MultiplayerAPIExtension::class] = OBJECT
  variantMapper[MultiplayerPeer::class] = OBJECT
  variantMapper[MultiplayerPeerExtension::class] = OBJECT
  variantMapper[MultiplayerSpawner::class] = OBJECT
  variantMapper[MultiplayerSynchronizer::class] = OBJECT
  variantMapper[Mutex::class] = OBJECT
  variantMapper[NavigationAgent2D::class] = OBJECT
  variantMapper[NavigationAgent3D::class] = OBJECT
  variantMapper[NavigationLink2D::class] = OBJECT
  variantMapper[NavigationLink3D::class] = OBJECT
  variantMapper[NavigationMesh::class] = OBJECT
  variantMapper[NavigationMeshSourceGeometryData2D::class] = OBJECT
  variantMapper[NavigationMeshSourceGeometryData3D::class] = OBJECT
  variantMapper[NavigationObstacle2D::class] = OBJECT
  variantMapper[NavigationObstacle3D::class] = OBJECT
  variantMapper[NavigationPathQueryParameters2D::class] = OBJECT
  variantMapper[NavigationPathQueryParameters3D::class] = OBJECT
  variantMapper[NavigationPathQueryResult2D::class] = OBJECT
  variantMapper[NavigationPathQueryResult3D::class] = OBJECT
  variantMapper[NavigationPolygon::class] = OBJECT
  variantMapper[NavigationRegion2D::class] = OBJECT
  variantMapper[NavigationRegion3D::class] = OBJECT
  variantMapper[NinePatchRect::class] = OBJECT
  variantMapper[Node::class] = OBJECT
  variantMapper[Node2D::class] = OBJECT
  variantMapper[Node3D::class] = OBJECT
  variantMapper[Node3DGizmo::class] = OBJECT
  variantMapper[Noise::class] = OBJECT
  variantMapper[NoiseTexture2D::class] = OBJECT
  variantMapper[NoiseTexture3D::class] = OBJECT
  variantMapper[ORMMaterial3D::class] = OBJECT
  variantMapper[Object::class] = OBJECT
  variantMapper[Occluder3D::class] = OBJECT
  variantMapper[OccluderInstance3D::class] = OBJECT
  variantMapper[OccluderPolygon2D::class] = OBJECT
  variantMapper[OfflineMultiplayerPeer::class] = OBJECT
  variantMapper[OggPacketSequence::class] = OBJECT
  variantMapper[OggPacketSequencePlayback::class] = OBJECT
  variantMapper[OmniLight3D::class] = OBJECT
  variantMapper[OpenXRAPIExtension::class] = OBJECT
  variantMapper[OpenXRAction::class] = OBJECT
  variantMapper[OpenXRActionMap::class] = OBJECT
  variantMapper[OpenXRActionSet::class] = OBJECT
  variantMapper[OpenXRCompositionLayer::class] = OBJECT
  variantMapper[OpenXRCompositionLayerCylinder::class] = OBJECT
  variantMapper[OpenXRCompositionLayerEquirect::class] = OBJECT
  variantMapper[OpenXRCompositionLayerQuad::class] = OBJECT
  variantMapper[OpenXRExtensionWrapperExtension::class] = OBJECT
  variantMapper[OpenXRHand::class] = OBJECT
  variantMapper[OpenXRIPBinding::class] = OBJECT
  variantMapper[OpenXRInteractionProfile::class] = OBJECT
  variantMapper[OpenXRInteractionProfileMetadata::class] = OBJECT
  variantMapper[OpenXRInterface::class] = OBJECT
  variantMapper[OptimizedTranslation::class] = OBJECT
  variantMapper[OptionButton::class] = OBJECT
  variantMapper[PCKPacker::class] = OBJECT
  variantMapper[PackedDataContainer::class] = OBJECT
  variantMapper[PackedDataContainerRef::class] = OBJECT
  variantMapper[PackedScene::class] = OBJECT
  variantMapper[PacketPeer::class] = OBJECT
  variantMapper[PacketPeerDTLS::class] = OBJECT
  variantMapper[PacketPeerExtension::class] = OBJECT
  variantMapper[PacketPeerStream::class] = OBJECT
  variantMapper[PacketPeerUDP::class] = OBJECT
  variantMapper[Panel::class] = OBJECT
  variantMapper[PanelContainer::class] = OBJECT
  variantMapper[PanoramaSkyMaterial::class] = OBJECT
  variantMapper[Parallax2D::class] = OBJECT
  variantMapper[ParallaxBackground::class] = OBJECT
  variantMapper[ParallaxLayer::class] = OBJECT
  variantMapper[ParticleProcessMaterial::class] = OBJECT
  variantMapper[Path2D::class] = OBJECT
  variantMapper[Path3D::class] = OBJECT
  variantMapper[PathFollow2D::class] = OBJECT
  variantMapper[PathFollow3D::class] = OBJECT
  variantMapper[PhysicalBone2D::class] = OBJECT
  variantMapper[PhysicalBone3D::class] = OBJECT
  variantMapper[PhysicalBoneSimulator3D::class] = OBJECT
  variantMapper[PhysicalSkyMaterial::class] = OBJECT
  variantMapper[PhysicsBody2D::class] = OBJECT
  variantMapper[PhysicsBody3D::class] = OBJECT
  variantMapper[PhysicsDirectBodyState2D::class] = OBJECT
  variantMapper[PhysicsDirectBodyState2DExtension::class] = OBJECT
  variantMapper[PhysicsDirectBodyState3D::class] = OBJECT
  variantMapper[PhysicsDirectBodyState3DExtension::class] = OBJECT
  variantMapper[PhysicsDirectSpaceState2D::class] = OBJECT
  variantMapper[PhysicsDirectSpaceState2DExtension::class] = OBJECT
  variantMapper[PhysicsDirectSpaceState3D::class] = OBJECT
  variantMapper[PhysicsDirectSpaceState3DExtension::class] = OBJECT
  variantMapper[PhysicsMaterial::class] = OBJECT
  variantMapper[PhysicsPointQueryParameters2D::class] = OBJECT
  variantMapper[PhysicsPointQueryParameters3D::class] = OBJECT
  variantMapper[PhysicsRayQueryParameters2D::class] = OBJECT
  variantMapper[PhysicsRayQueryParameters3D::class] = OBJECT
  variantMapper[PhysicsServer3DRenderingServerHandler::class] = OBJECT
  variantMapper[PhysicsShapeQueryParameters2D::class] = OBJECT
  variantMapper[PhysicsShapeQueryParameters3D::class] = OBJECT
  variantMapper[PhysicsTestMotionParameters2D::class] = OBJECT
  variantMapper[PhysicsTestMotionParameters3D::class] = OBJECT
  variantMapper[PhysicsTestMotionResult2D::class] = OBJECT
  variantMapper[PhysicsTestMotionResult3D::class] = OBJECT
  variantMapper[PinJoint2D::class] = OBJECT
  variantMapper[PinJoint3D::class] = OBJECT
  variantMapper[PlaceholderCubemap::class] = OBJECT
  variantMapper[PlaceholderCubemapArray::class] = OBJECT
  variantMapper[PlaceholderMaterial::class] = OBJECT
  variantMapper[PlaceholderMesh::class] = OBJECT
  variantMapper[PlaceholderTexture2D::class] = OBJECT
  variantMapper[PlaceholderTexture2DArray::class] = OBJECT
  variantMapper[PlaceholderTexture3D::class] = OBJECT
  variantMapper[PlaceholderTextureLayered::class] = OBJECT
  variantMapper[PlaneMesh::class] = OBJECT
  variantMapper[PointLight2D::class] = OBJECT
  variantMapper[PointMesh::class] = OBJECT
  variantMapper[Polygon2D::class] = OBJECT
  variantMapper[PolygonOccluder3D::class] = OBJECT
  variantMapper[PolygonPathFinder::class] = OBJECT
  variantMapper[Popup::class] = OBJECT
  variantMapper[PopupMenu::class] = OBJECT
  variantMapper[PopupPanel::class] = OBJECT
  variantMapper[PortableCompressedTexture2D::class] = OBJECT
  variantMapper[PrimitiveMesh::class] = OBJECT
  variantMapper[PrismMesh::class] = OBJECT
  variantMapper[ProceduralSkyMaterial::class] = OBJECT
  variantMapper[ProgressBar::class] = OBJECT
  variantMapper[PropertyTweener::class] = OBJECT
  variantMapper[QuadMesh::class] = OBJECT
  variantMapper[QuadOccluder3D::class] = OBJECT
  variantMapper[RDAttachmentFormat::class] = OBJECT
  variantMapper[RDFramebufferPass::class] = OBJECT
  variantMapper[RDPipelineColorBlendState::class] = OBJECT
  variantMapper[RDPipelineColorBlendStateAttachment::class] = OBJECT
  variantMapper[RDPipelineDepthStencilState::class] = OBJECT
  variantMapper[RDPipelineMultisampleState::class] = OBJECT
  variantMapper[RDPipelineRasterizationState::class] = OBJECT
  variantMapper[RDPipelineSpecializationConstant::class] = OBJECT
  variantMapper[RDSamplerState::class] = OBJECT
  variantMapper[RDShaderFile::class] = OBJECT
  variantMapper[RDShaderSPIRV::class] = OBJECT
  variantMapper[RDShaderSource::class] = OBJECT
  variantMapper[RDTextureFormat::class] = OBJECT
  variantMapper[RDTextureView::class] = OBJECT
  variantMapper[RDUniform::class] = OBJECT
  variantMapper[RDVertexAttribute::class] = OBJECT
  variantMapper[RandomNumberGenerator::class] = OBJECT
  variantMapper[Range::class] = OBJECT
  variantMapper[RayCast2D::class] = OBJECT
  variantMapper[RayCast3D::class] = OBJECT
  variantMapper[RectangleShape2D::class] = OBJECT
  variantMapper[RefCounted::class] = OBJECT
  variantMapper[ReferenceRect::class] = OBJECT
  variantMapper[ReflectionProbe::class] = OBJECT
  variantMapper[RegEx::class] = OBJECT
  variantMapper[RegExMatch::class] = OBJECT
  variantMapper[RemoteTransform2D::class] = OBJECT
  variantMapper[RemoteTransform3D::class] = OBJECT
  variantMapper[RenderData::class] = OBJECT
  variantMapper[RenderDataExtension::class] = OBJECT
  variantMapper[RenderDataRD::class] = OBJECT
  variantMapper[RenderSceneBuffers::class] = OBJECT
  variantMapper[RenderSceneBuffersConfiguration::class] = OBJECT
  variantMapper[RenderSceneBuffersExtension::class] = OBJECT
  variantMapper[RenderSceneBuffersRD::class] = OBJECT
  variantMapper[RenderSceneData::class] = OBJECT
  variantMapper[RenderSceneDataExtension::class] = OBJECT
  variantMapper[RenderSceneDataRD::class] = OBJECT
  variantMapper[RenderingDevice::class] = OBJECT
  variantMapper[Resource::class] = OBJECT
  variantMapper[ResourceFormatLoader::class] = OBJECT
  variantMapper[ResourceFormatSaver::class] = OBJECT
  variantMapper[ResourceImporter::class] = OBJECT
  variantMapper[ResourcePreloader::class] = OBJECT
  variantMapper[RibbonTrailMesh::class] = OBJECT
  variantMapper[RichTextEffect::class] = OBJECT
  variantMapper[RichTextLabel::class] = OBJECT
  variantMapper[RigidBody2D::class] = OBJECT
  variantMapper[RigidBody3D::class] = OBJECT
  variantMapper[RootMotionView::class] = OBJECT
  variantMapper[SceneMultiplayer::class] = OBJECT
  variantMapper[SceneReplicationConfig::class] = OBJECT
  variantMapper[SceneState::class] = OBJECT
  variantMapper[SceneTree::class] = OBJECT
  variantMapper[SceneTreeTimer::class] = OBJECT
  variantMapper[Script::class] = OBJECT
  variantMapper[ScriptExtension::class] = OBJECT
  variantMapper[ScriptLanguage::class] = OBJECT
  variantMapper[ScriptLanguageExtension::class] = OBJECT
  variantMapper[ScrollBar::class] = OBJECT
  variantMapper[ScrollContainer::class] = OBJECT
  variantMapper[SegmentShape2D::class] = OBJECT
  variantMapper[Semaphore::class] = OBJECT
  variantMapper[SeparationRayShape2D::class] = OBJECT
  variantMapper[SeparationRayShape3D::class] = OBJECT
  variantMapper[Separator::class] = OBJECT
  variantMapper[Shader::class] = OBJECT
  variantMapper[ShaderGlobalsOverride::class] = OBJECT
  variantMapper[ShaderInclude::class] = OBJECT
  variantMapper[ShaderMaterial::class] = OBJECT
  variantMapper[Shape2D::class] = OBJECT
  variantMapper[Shape3D::class] = OBJECT
  variantMapper[ShapeCast2D::class] = OBJECT
  variantMapper[ShapeCast3D::class] = OBJECT
  variantMapper[Shortcut::class] = OBJECT
  variantMapper[Skeleton2D::class] = OBJECT
  variantMapper[Skeleton3D::class] = OBJECT
  variantMapper[SkeletonIK3D::class] = OBJECT
  variantMapper[SkeletonModification2D::class] = OBJECT
  variantMapper[SkeletonModification2DCCDIK::class] = OBJECT
  variantMapper[SkeletonModification2DFABRIK::class] = OBJECT
  variantMapper[SkeletonModification2DJiggle::class] = OBJECT
  variantMapper[SkeletonModification2DLookAt::class] = OBJECT
  variantMapper[SkeletonModification2DPhysicalBones::class] = OBJECT
  variantMapper[SkeletonModification2DStackHolder::class] = OBJECT
  variantMapper[SkeletonModification2DTwoBoneIK::class] = OBJECT
  variantMapper[SkeletonModificationStack2D::class] = OBJECT
  variantMapper[SkeletonModifier3D::class] = OBJECT
  variantMapper[SkeletonProfile::class] = OBJECT
  variantMapper[SkeletonProfileHumanoid::class] = OBJECT
  variantMapper[Skin::class] = OBJECT
  variantMapper[SkinReference::class] = OBJECT
  variantMapper[Sky::class] = OBJECT
  variantMapper[Slider::class] = OBJECT
  variantMapper[SliderJoint3D::class] = OBJECT
  variantMapper[SoftBody3D::class] = OBJECT
  variantMapper[SphereMesh::class] = OBJECT
  variantMapper[SphereOccluder3D::class] = OBJECT
  variantMapper[SphereShape3D::class] = OBJECT
  variantMapper[SpinBox::class] = OBJECT
  variantMapper[SplitContainer::class] = OBJECT
  variantMapper[SpotLight3D::class] = OBJECT
  variantMapper[SpringArm3D::class] = OBJECT
  variantMapper[Sprite2D::class] = OBJECT
  variantMapper[Sprite3D::class] = OBJECT
  variantMapper[SpriteBase3D::class] = OBJECT
  variantMapper[SpriteFrames::class] = OBJECT
  variantMapper[StandardMaterial3D::class] = OBJECT
  variantMapper[StaticBody2D::class] = OBJECT
  variantMapper[StaticBody3D::class] = OBJECT
  variantMapper[StatusIndicator::class] = OBJECT
  variantMapper[StreamPeer::class] = OBJECT
  variantMapper[StreamPeerBuffer::class] = OBJECT
  variantMapper[StreamPeerExtension::class] = OBJECT
  variantMapper[StreamPeerGZIP::class] = OBJECT
  variantMapper[StreamPeerTCP::class] = OBJECT
  variantMapper[StreamPeerTLS::class] = OBJECT
  variantMapper[StyleBox::class] = OBJECT
  variantMapper[StyleBoxEmpty::class] = OBJECT
  variantMapper[StyleBoxFlat::class] = OBJECT
  variantMapper[StyleBoxLine::class] = OBJECT
  variantMapper[StyleBoxTexture::class] = OBJECT
  variantMapper[SubViewport::class] = OBJECT
  variantMapper[SubViewportContainer::class] = OBJECT
  variantMapper[SurfaceTool::class] = OBJECT
  variantMapper[SyntaxHighlighter::class] = OBJECT
  variantMapper[SystemFont::class] = OBJECT
  variantMapper[TCPServer::class] = OBJECT
  variantMapper[TLSOptions::class] = OBJECT
  variantMapper[TabBar::class] = OBJECT
  variantMapper[TabContainer::class] = OBJECT
  variantMapper[TextEdit::class] = OBJECT
  variantMapper[TextLine::class] = OBJECT
  variantMapper[TextMesh::class] = OBJECT
  variantMapper[TextParagraph::class] = OBJECT
  variantMapper[TextServer::class] = OBJECT
  variantMapper[TextServerAdvanced::class] = OBJECT
  variantMapper[TextServerDummy::class] = OBJECT
  variantMapper[TextServerExtension::class] = OBJECT
  variantMapper[Texture::class] = OBJECT
  variantMapper[Texture2D::class] = OBJECT
  variantMapper[Texture2DArray::class] = OBJECT
  variantMapper[Texture2DArrayRD::class] = OBJECT
  variantMapper[Texture2DRD::class] = OBJECT
  variantMapper[Texture3D::class] = OBJECT
  variantMapper[Texture3DRD::class] = OBJECT
  variantMapper[TextureButton::class] = OBJECT
  variantMapper[TextureCubemapArrayRD::class] = OBJECT
  variantMapper[TextureCubemapRD::class] = OBJECT
  variantMapper[TextureLayered::class] = OBJECT
  variantMapper[TextureLayeredRD::class] = OBJECT
  variantMapper[TextureProgressBar::class] = OBJECT
  variantMapper[TextureRect::class] = OBJECT
  variantMapper[Theme::class] = OBJECT
  variantMapper[Thread::class] = OBJECT
  variantMapper[TileData::class] = OBJECT
  variantMapper[TileMap::class] = OBJECT
  variantMapper[TileMapLayer::class] = OBJECT
  variantMapper[TileMapPattern::class] = OBJECT
  variantMapper[TileSet::class] = OBJECT
  variantMapper[TileSetAtlasSource::class] = OBJECT
  variantMapper[TileSetScenesCollectionSource::class] = OBJECT
  variantMapper[TileSetSource::class] = OBJECT
  variantMapper[Timer::class] = OBJECT
  variantMapper[TorusMesh::class] = OBJECT
  variantMapper[TouchScreenButton::class] = OBJECT
  variantMapper[Translation::class] = OBJECT
  variantMapper[Tree::class] = OBJECT
  variantMapper[TreeItem::class] = OBJECT
  variantMapper[TriangleMesh::class] = OBJECT
  variantMapper[TubeTrailMesh::class] = OBJECT
  variantMapper[Tween::class] = OBJECT
  variantMapper[Tweener::class] = OBJECT
  variantMapper[UDPServer::class] = OBJECT
  variantMapper[UPNP::class] = OBJECT
  variantMapper[UPNPDevice::class] = OBJECT
  variantMapper[UndoRedo::class] = OBJECT
  variantMapper[UniformSetCacheRD::class] = OBJECT
  variantMapper[VBoxContainer::class] = OBJECT
  variantMapper[VFlowContainer::class] = OBJECT
  variantMapper[VScrollBar::class] = OBJECT
  variantMapper[VSeparator::class] = OBJECT
  variantMapper[VSlider::class] = OBJECT
  variantMapper[VSplitContainer::class] = OBJECT
  variantMapper[VehicleBody3D::class] = OBJECT
  variantMapper[VehicleWheel3D::class] = OBJECT
  variantMapper[VideoStream::class] = OBJECT
  variantMapper[VideoStreamPlayback::class] = OBJECT
  variantMapper[VideoStreamPlayer::class] = OBJECT
  variantMapper[VideoStreamTheora::class] = OBJECT
  variantMapper[Viewport::class] = OBJECT
  variantMapper[ViewportTexture::class] = OBJECT
  variantMapper[VisibleOnScreenEnabler2D::class] = OBJECT
  variantMapper[VisibleOnScreenEnabler3D::class] = OBJECT
  variantMapper[VisibleOnScreenNotifier2D::class] = OBJECT
  variantMapper[VisibleOnScreenNotifier3D::class] = OBJECT
  variantMapper[VisualInstance3D::class] = OBJECT
  variantMapper[VisualShader::class] = OBJECT
  variantMapper[VisualShaderNode::class] = OBJECT
  variantMapper[VisualShaderNodeBillboard::class] = OBJECT
  variantMapper[VisualShaderNodeBooleanConstant::class] = OBJECT
  variantMapper[VisualShaderNodeBooleanParameter::class] = OBJECT
  variantMapper[VisualShaderNodeClamp::class] = OBJECT
  variantMapper[VisualShaderNodeColorConstant::class] = OBJECT
  variantMapper[VisualShaderNodeColorFunc::class] = OBJECT
  variantMapper[VisualShaderNodeColorOp::class] = OBJECT
  variantMapper[VisualShaderNodeColorParameter::class] = OBJECT
  variantMapper[VisualShaderNodeComment::class] = OBJECT
  variantMapper[VisualShaderNodeCompare::class] = OBJECT
  variantMapper[VisualShaderNodeConstant::class] = OBJECT
  variantMapper[VisualShaderNodeCubemap::class] = OBJECT
  variantMapper[VisualShaderNodeCubemapParameter::class] = OBJECT
  variantMapper[VisualShaderNodeCurveTexture::class] = OBJECT
  variantMapper[VisualShaderNodeCurveXYZTexture::class] = OBJECT
  variantMapper[VisualShaderNodeCustom::class] = OBJECT
  variantMapper[VisualShaderNodeDerivativeFunc::class] = OBJECT
  variantMapper[VisualShaderNodeDeterminant::class] = OBJECT
  variantMapper[VisualShaderNodeDistanceFade::class] = OBJECT
  variantMapper[VisualShaderNodeDotProduct::class] = OBJECT
  variantMapper[VisualShaderNodeExpression::class] = OBJECT
  variantMapper[VisualShaderNodeFaceForward::class] = OBJECT
  variantMapper[VisualShaderNodeFloatConstant::class] = OBJECT
  variantMapper[VisualShaderNodeFloatFunc::class] = OBJECT
  variantMapper[VisualShaderNodeFloatOp::class] = OBJECT
  variantMapper[VisualShaderNodeFloatParameter::class] = OBJECT
  variantMapper[VisualShaderNodeFrame::class] = OBJECT
  variantMapper[VisualShaderNodeFresnel::class] = OBJECT
  variantMapper[VisualShaderNodeGlobalExpression::class] = OBJECT
  variantMapper[VisualShaderNodeGroupBase::class] = OBJECT
  variantMapper[VisualShaderNodeIf::class] = OBJECT
  variantMapper[VisualShaderNodeInput::class] = OBJECT
  variantMapper[VisualShaderNodeIntConstant::class] = OBJECT
  variantMapper[VisualShaderNodeIntFunc::class] = OBJECT
  variantMapper[VisualShaderNodeIntOp::class] = OBJECT
  variantMapper[VisualShaderNodeIntParameter::class] = OBJECT
  variantMapper[VisualShaderNodeIs::class] = OBJECT
  variantMapper[VisualShaderNodeLinearSceneDepth::class] = OBJECT
  variantMapper[VisualShaderNodeMix::class] = OBJECT
  variantMapper[VisualShaderNodeMultiplyAdd::class] = OBJECT
  variantMapper[VisualShaderNodeOuterProduct::class] = OBJECT
  variantMapper[VisualShaderNodeOutput::class] = OBJECT
  variantMapper[VisualShaderNodeParameter::class] = OBJECT
  variantMapper[VisualShaderNodeParameterRef::class] = OBJECT
  variantMapper[VisualShaderNodeParticleAccelerator::class] = OBJECT
  variantMapper[VisualShaderNodeParticleBoxEmitter::class] = OBJECT
  variantMapper[VisualShaderNodeParticleConeVelocity::class] = OBJECT
  variantMapper[VisualShaderNodeParticleEmit::class] = OBJECT
  variantMapper[VisualShaderNodeParticleEmitter::class] = OBJECT
  variantMapper[VisualShaderNodeParticleMeshEmitter::class] = OBJECT
  variantMapper[VisualShaderNodeParticleMultiplyByAxisAngle::class] = OBJECT
  variantMapper[VisualShaderNodeParticleOutput::class] = OBJECT
  variantMapper[VisualShaderNodeParticleRandomness::class] = OBJECT
  variantMapper[VisualShaderNodeParticleRingEmitter::class] = OBJECT
  variantMapper[VisualShaderNodeParticleSphereEmitter::class] = OBJECT
  variantMapper[VisualShaderNodeProximityFade::class] = OBJECT
  variantMapper[VisualShaderNodeRandomRange::class] = OBJECT
  variantMapper[VisualShaderNodeRemap::class] = OBJECT
  variantMapper[VisualShaderNodeReroute::class] = OBJECT
  variantMapper[VisualShaderNodeResizableBase::class] = OBJECT
  variantMapper[VisualShaderNodeRotationByAxis::class] = OBJECT
  variantMapper[VisualShaderNodeSDFRaymarch::class] = OBJECT
  variantMapper[VisualShaderNodeSDFToScreenUV::class] = OBJECT
  variantMapper[VisualShaderNodeSample3D::class] = OBJECT
  variantMapper[VisualShaderNodeScreenNormalWorldSpace::class] = OBJECT
  variantMapper[VisualShaderNodeScreenUVToSDF::class] = OBJECT
  variantMapper[VisualShaderNodeSmoothStep::class] = OBJECT
  variantMapper[VisualShaderNodeStep::class] = OBJECT
  variantMapper[VisualShaderNodeSwitch::class] = OBJECT
  variantMapper[VisualShaderNodeTexture::class] = OBJECT
  variantMapper[VisualShaderNodeTexture2DArray::class] = OBJECT
  variantMapper[VisualShaderNodeTexture2DArrayParameter::class] = OBJECT
  variantMapper[VisualShaderNodeTexture2DParameter::class] = OBJECT
  variantMapper[VisualShaderNodeTexture3D::class] = OBJECT
  variantMapper[VisualShaderNodeTexture3DParameter::class] = OBJECT
  variantMapper[VisualShaderNodeTextureParameter::class] = OBJECT
  variantMapper[VisualShaderNodeTextureParameterTriplanar::class] = OBJECT
  variantMapper[VisualShaderNodeTextureSDF::class] = OBJECT
  variantMapper[VisualShaderNodeTextureSDFNormal::class] = OBJECT
  variantMapper[VisualShaderNodeTransformCompose::class] = OBJECT
  variantMapper[VisualShaderNodeTransformConstant::class] = OBJECT
  variantMapper[VisualShaderNodeTransformDecompose::class] = OBJECT
  variantMapper[VisualShaderNodeTransformFunc::class] = OBJECT
  variantMapper[VisualShaderNodeTransformOp::class] = OBJECT
  variantMapper[VisualShaderNodeTransformParameter::class] = OBJECT
  variantMapper[VisualShaderNodeTransformVecMult::class] = OBJECT
  variantMapper[VisualShaderNodeUIntConstant::class] = OBJECT
  variantMapper[VisualShaderNodeUIntFunc::class] = OBJECT
  variantMapper[VisualShaderNodeUIntOp::class] = OBJECT
  variantMapper[VisualShaderNodeUIntParameter::class] = OBJECT
  variantMapper[VisualShaderNodeUVFunc::class] = OBJECT
  variantMapper[VisualShaderNodeUVPolarCoord::class] = OBJECT
  variantMapper[VisualShaderNodeVarying::class] = OBJECT
  variantMapper[VisualShaderNodeVaryingGetter::class] = OBJECT
  variantMapper[VisualShaderNodeVaryingSetter::class] = OBJECT
  variantMapper[VisualShaderNodeVec2Constant::class] = OBJECT
  variantMapper[VisualShaderNodeVec2Parameter::class] = OBJECT
  variantMapper[VisualShaderNodeVec3Constant::class] = OBJECT
  variantMapper[VisualShaderNodeVec3Parameter::class] = OBJECT
  variantMapper[VisualShaderNodeVec4Constant::class] = OBJECT
  variantMapper[VisualShaderNodeVec4Parameter::class] = OBJECT
  variantMapper[VisualShaderNodeVectorBase::class] = OBJECT
  variantMapper[VisualShaderNodeVectorCompose::class] = OBJECT
  variantMapper[VisualShaderNodeVectorDecompose::class] = OBJECT
  variantMapper[VisualShaderNodeVectorDistance::class] = OBJECT
  variantMapper[VisualShaderNodeVectorFunc::class] = OBJECT
  variantMapper[VisualShaderNodeVectorLen::class] = OBJECT
  variantMapper[VisualShaderNodeVectorOp::class] = OBJECT
  variantMapper[VisualShaderNodeVectorRefract::class] = OBJECT
  variantMapper[VisualShaderNodeWorldPositionFromDepth::class] = OBJECT
  variantMapper[VoxelGI::class] = OBJECT
  variantMapper[VoxelGIData::class] = OBJECT
  variantMapper[WeakRef::class] = OBJECT
  variantMapper[WebRTCDataChannel::class] = OBJECT
  variantMapper[WebRTCDataChannelExtension::class] = OBJECT
  variantMapper[WebRTCMultiplayerPeer::class] = OBJECT
  variantMapper[WebRTCPeerConnection::class] = OBJECT
  variantMapper[WebRTCPeerConnectionExtension::class] = OBJECT
  variantMapper[WebSocketMultiplayerPeer::class] = OBJECT
  variantMapper[WebSocketPeer::class] = OBJECT
  variantMapper[WebXRInterface::class] = OBJECT
  variantMapper[Window::class] = OBJECT
  variantMapper[World2D::class] = OBJECT
  variantMapper[World3D::class] = OBJECT
  variantMapper[WorldBoundaryShape2D::class] = OBJECT
  variantMapper[WorldBoundaryShape3D::class] = OBJECT
  variantMapper[WorldEnvironment::class] = OBJECT
  variantMapper[X509Certificate::class] = OBJECT
  variantMapper[XMLParser::class] = OBJECT
  variantMapper[XRAnchor3D::class] = OBJECT
  variantMapper[XRBodyModifier3D::class] = OBJECT
  variantMapper[XRBodyTracker::class] = OBJECT
  variantMapper[XRCamera3D::class] = OBJECT
  variantMapper[XRController3D::class] = OBJECT
  variantMapper[XRControllerTracker::class] = OBJECT
  variantMapper[XRFaceModifier3D::class] = OBJECT
  variantMapper[XRFaceTracker::class] = OBJECT
  variantMapper[XRHandModifier3D::class] = OBJECT
  variantMapper[XRHandTracker::class] = OBJECT
  variantMapper[XRInterface::class] = OBJECT
  variantMapper[XRInterfaceExtension::class] = OBJECT
  variantMapper[XRNode3D::class] = OBJECT
  variantMapper[XROrigin3D::class] = OBJECT
  variantMapper[XRPose::class] = OBJECT
  variantMapper[XRPositionalTracker::class] = OBJECT
  variantMapper[XRTracker::class] = OBJECT
  variantMapper[XRVRS::class] = OBJECT
  variantMapper[ZIPPacker::class] = OBJECT
  variantMapper[ZIPReader::class] = OBJECT
}

public fun registerEngineTypeMethods(): Unit {
  Performance.MethodBindings
  TextServerManager.MethodBindings
  PhysicsServer2DManager.MethodBindings
  PhysicsServer3DManager.MethodBindings
  NavigationMeshGenerator.MethodBindings
  ProjectSettings.MethodBindings
  IP.MethodBindings
  Geometry2D.MethodBindings
  Geometry3D.MethodBindings
  ResourceLoader.MethodBindings
  ResourceSaver.MethodBindings
  OS.MethodBindings
  Engine.MethodBindings
  ClassDB.MethodBindings
  Marshalls.MethodBindings
  TranslationServer.MethodBindings
  Input.MethodBindings
  InputMap.MethodBindings
  EngineDebugger.MethodBindings
  Time.MethodBindings
  GDExtensionManager.MethodBindings
  ResourceUID.MethodBindings
  WorkerThreadPool.MethodBindings
  ThemeDB.MethodBindings
  JavaClassWrapper.MethodBindings
  JavaScriptBridge.MethodBindings
  AudioServer.MethodBindings
  CameraServer.MethodBindings
  DisplayServer.MethodBindings
  NativeMenu.MethodBindings
  NavigationServer2D.MethodBindings
  NavigationServer3D.MethodBindings
  RenderingServer.MethodBindings
  PhysicsServer2D.MethodBindings
  PhysicsServer3D.MethodBindings
  XRServer.MethodBindings
  AESContext.MethodBindings
  AStar2D.MethodBindings
  AStar3D.MethodBindings
  AStarGrid2D.MethodBindings
  AcceptDialog.MethodBindings
  AnimatableBody2D.MethodBindings
  AnimatableBody3D.MethodBindings
  AnimatedSprite2D.MethodBindings
  AnimatedSprite3D.MethodBindings
  AnimatedTexture.MethodBindings
  Animation.MethodBindings
  AnimationLibrary.MethodBindings
  AnimationMixer.MethodBindings
  AnimationNode.MethodBindings
  AnimationNodeAdd2.MethodBindings
  AnimationNodeAdd3.MethodBindings
  AnimationNodeAnimation.MethodBindings
  AnimationNodeBlend2.MethodBindings
  AnimationNodeBlend3.MethodBindings
  AnimationNodeBlendSpace1D.MethodBindings
  AnimationNodeBlendSpace2D.MethodBindings
  AnimationNodeBlendTree.MethodBindings
  AnimationNodeOneShot.MethodBindings
  AnimationNodeOutput.MethodBindings
  AnimationNodeStateMachine.MethodBindings
  AnimationNodeStateMachinePlayback.MethodBindings
  AnimationNodeStateMachineTransition.MethodBindings
  AnimationNodeSub2.MethodBindings
  AnimationNodeSync.MethodBindings
  AnimationNodeTimeScale.MethodBindings
  AnimationNodeTimeSeek.MethodBindings
  AnimationNodeTransition.MethodBindings
  AnimationPlayer.MethodBindings
  AnimationRootNode.MethodBindings
  AnimationTree.MethodBindings
  Area2D.MethodBindings
  Area3D.MethodBindings
  ArrayMesh.MethodBindings
  ArrayOccluder3D.MethodBindings
  AspectRatioContainer.MethodBindings
  AtlasTexture.MethodBindings
  AudioBusLayout.MethodBindings
  AudioEffect.MethodBindings
  AudioEffectAmplify.MethodBindings
  AudioEffectBandLimitFilter.MethodBindings
  AudioEffectBandPassFilter.MethodBindings
  AudioEffectCapture.MethodBindings
  AudioEffectChorus.MethodBindings
  AudioEffectCompressor.MethodBindings
  AudioEffectDelay.MethodBindings
  AudioEffectDistortion.MethodBindings
  AudioEffectEQ.MethodBindings
  AudioEffectEQ10.MethodBindings
  AudioEffectEQ21.MethodBindings
  AudioEffectEQ6.MethodBindings
  AudioEffectFilter.MethodBindings
  AudioEffectHardLimiter.MethodBindings
  AudioEffectHighPassFilter.MethodBindings
  AudioEffectHighShelfFilter.MethodBindings
  AudioEffectInstance.MethodBindings
  AudioEffectLimiter.MethodBindings
  AudioEffectLowPassFilter.MethodBindings
  AudioEffectLowShelfFilter.MethodBindings
  AudioEffectNotchFilter.MethodBindings
  AudioEffectPanner.MethodBindings
  AudioEffectPhaser.MethodBindings
  AudioEffectPitchShift.MethodBindings
  AudioEffectRecord.MethodBindings
  AudioEffectReverb.MethodBindings
  AudioEffectSpectrumAnalyzer.MethodBindings
  AudioEffectSpectrumAnalyzerInstance.MethodBindings
  AudioEffectStereoEnhance.MethodBindings
  AudioListener2D.MethodBindings
  AudioListener3D.MethodBindings
  AudioSample.MethodBindings
  AudioSamplePlayback.MethodBindings
  AudioStream.MethodBindings
  AudioStreamGenerator.MethodBindings
  AudioStreamGeneratorPlayback.MethodBindings
  AudioStreamInteractive.MethodBindings
  AudioStreamMP3.MethodBindings
  AudioStreamMicrophone.MethodBindings
  AudioStreamOggVorbis.MethodBindings
  AudioStreamPlayback.MethodBindings
  AudioStreamPlaybackInteractive.MethodBindings
  AudioStreamPlaybackOggVorbis.MethodBindings
  AudioStreamPlaybackPlaylist.MethodBindings
  AudioStreamPlaybackPolyphonic.MethodBindings
  AudioStreamPlaybackResampled.MethodBindings
  AudioStreamPlaybackSynchronized.MethodBindings
  AudioStreamPlayer.MethodBindings
  AudioStreamPlayer2D.MethodBindings
  AudioStreamPlayer3D.MethodBindings
  AudioStreamPlaylist.MethodBindings
  AudioStreamPolyphonic.MethodBindings
  AudioStreamRandomizer.MethodBindings
  AudioStreamSynchronized.MethodBindings
  AudioStreamWAV.MethodBindings
  BackBufferCopy.MethodBindings
  BaseButton.MethodBindings
  BaseMaterial3D.MethodBindings
  BitMap.MethodBindings
  Bone2D.MethodBindings
  BoneAttachment3D.MethodBindings
  BoneMap.MethodBindings
  BoxContainer.MethodBindings
  BoxMesh.MethodBindings
  BoxOccluder3D.MethodBindings
  BoxShape3D.MethodBindings
  Button.MethodBindings
  ButtonGroup.MethodBindings
  CPUParticles2D.MethodBindings
  CPUParticles3D.MethodBindings
  CSGBox3D.MethodBindings
  CSGCombiner3D.MethodBindings
  CSGCylinder3D.MethodBindings
  CSGMesh3D.MethodBindings
  CSGPolygon3D.MethodBindings
  CSGPrimitive3D.MethodBindings
  CSGShape3D.MethodBindings
  CSGSphere3D.MethodBindings
  CSGTorus3D.MethodBindings
  CallbackTweener.MethodBindings
  Camera2D.MethodBindings
  Camera3D.MethodBindings
  CameraAttributes.MethodBindings
  CameraAttributesPhysical.MethodBindings
  CameraAttributesPractical.MethodBindings
  CameraFeed.MethodBindings
  CameraTexture.MethodBindings
  CanvasGroup.MethodBindings
  CanvasItem.MethodBindings
  CanvasItemMaterial.MethodBindings
  CanvasLayer.MethodBindings
  CanvasModulate.MethodBindings
  CanvasTexture.MethodBindings
  CapsuleMesh.MethodBindings
  CapsuleShape2D.MethodBindings
  CapsuleShape3D.MethodBindings
  CenterContainer.MethodBindings
  CharFXTransform.MethodBindings
  CharacterBody2D.MethodBindings
  CharacterBody3D.MethodBindings
  CheckBox.MethodBindings
  CheckButton.MethodBindings
  CircleShape2D.MethodBindings
  CodeEdit.MethodBindings
  CodeHighlighter.MethodBindings
  CollisionObject2D.MethodBindings
  CollisionObject3D.MethodBindings
  CollisionPolygon2D.MethodBindings
  CollisionPolygon3D.MethodBindings
  CollisionShape2D.MethodBindings
  CollisionShape3D.MethodBindings
  ColorPicker.MethodBindings
  ColorPickerButton.MethodBindings
  ColorRect.MethodBindings
  Compositor.MethodBindings
  CompositorEffect.MethodBindings
  CompressedCubemap.MethodBindings
  CompressedCubemapArray.MethodBindings
  CompressedTexture2D.MethodBindings
  CompressedTexture2DArray.MethodBindings
  CompressedTexture3D.MethodBindings
  CompressedTextureLayered.MethodBindings
  ConcavePolygonShape2D.MethodBindings
  ConcavePolygonShape3D.MethodBindings
  ConeTwistJoint3D.MethodBindings
  ConfigFile.MethodBindings
  ConfirmationDialog.MethodBindings
  Container.MethodBindings
  Control.MethodBindings
  ConvexPolygonShape2D.MethodBindings
  ConvexPolygonShape3D.MethodBindings
  Crypto.MethodBindings
  CryptoKey.MethodBindings
  Cubemap.MethodBindings
  CubemapArray.MethodBindings
  Curve.MethodBindings
  Curve2D.MethodBindings
  Curve3D.MethodBindings
  CurveTexture.MethodBindings
  CurveXYZTexture.MethodBindings
  CylinderMesh.MethodBindings
  CylinderShape3D.MethodBindings
  DTLSServer.MethodBindings
  DampedSpringJoint2D.MethodBindings
  Decal.MethodBindings
  DirAccess.MethodBindings
  DirectionalLight2D.MethodBindings
  DirectionalLight3D.MethodBindings
  ENetConnection.MethodBindings
  ENetMultiplayerPeer.MethodBindings
  ENetPacketPeer.MethodBindings
  EncodedObjectAsID.MethodBindings
  EngineProfiler.MethodBindings
  Environment.MethodBindings
  Expression.MethodBindings
  FBXDocument.MethodBindings
  FBXState.MethodBindings
  FastNoiseLite.MethodBindings
  FileAccess.MethodBindings
  FileDialog.MethodBindings
  FlowContainer.MethodBindings
  FogMaterial.MethodBindings
  FogVolume.MethodBindings
  Font.MethodBindings
  FontFile.MethodBindings
  FontVariation.MethodBindings
  FramebufferCacheRD.MethodBindings
  GDExtension.MethodBindings
  GDScript.MethodBindings
  GLTFAccessor.MethodBindings
  GLTFAnimation.MethodBindings
  GLTFBufferView.MethodBindings
  GLTFCamera.MethodBindings
  GLTFDocument.MethodBindings
  GLTFDocumentExtension.MethodBindings
  GLTFDocumentExtensionConvertImporterMesh.MethodBindings
  GLTFLight.MethodBindings
  GLTFMesh.MethodBindings
  GLTFNode.MethodBindings
  GLTFPhysicsBody.MethodBindings
  GLTFPhysicsShape.MethodBindings
  GLTFSkeleton.MethodBindings
  GLTFSkin.MethodBindings
  GLTFSpecGloss.MethodBindings
  GLTFState.MethodBindings
  GLTFTexture.MethodBindings
  GLTFTextureSampler.MethodBindings
  GPUParticles2D.MethodBindings
  GPUParticles3D.MethodBindings
  GPUParticlesAttractor3D.MethodBindings
  GPUParticlesAttractorBox3D.MethodBindings
  GPUParticlesAttractorSphere3D.MethodBindings
  GPUParticlesAttractorVectorField3D.MethodBindings
  GPUParticlesCollision3D.MethodBindings
  GPUParticlesCollisionBox3D.MethodBindings
  GPUParticlesCollisionHeightField3D.MethodBindings
  GPUParticlesCollisionSDF3D.MethodBindings
  GPUParticlesCollisionSphere3D.MethodBindings
  GdjScript.MethodBindings
  Generic6DOFJoint3D.MethodBindings
  GeometryInstance3D.MethodBindings
  Gradient.MethodBindings
  GradientTexture1D.MethodBindings
  GradientTexture2D.MethodBindings
  GraphEdit.MethodBindings
  GraphElement.MethodBindings
  GraphFrame.MethodBindings
  GraphNode.MethodBindings
  GridContainer.MethodBindings
  GridMap.MethodBindings
  GrooveJoint2D.MethodBindings
  HBoxContainer.MethodBindings
  HFlowContainer.MethodBindings
  HMACContext.MethodBindings
  HScrollBar.MethodBindings
  HSeparator.MethodBindings
  HSlider.MethodBindings
  HSplitContainer.MethodBindings
  HTTPClient.MethodBindings
  HTTPRequest.MethodBindings
  HashingContext.MethodBindings
  HeightMapShape3D.MethodBindings
  HingeJoint3D.MethodBindings
  Image.MethodBindings
  ImageFormatLoader.MethodBindings
  ImageFormatLoaderExtension.MethodBindings
  ImageTexture.MethodBindings
  ImageTexture3D.MethodBindings
  ImageTextureLayered.MethodBindings
  ImmediateMesh.MethodBindings
  ImporterMesh.MethodBindings
  ImporterMeshInstance3D.MethodBindings
  InputEvent.MethodBindings
  InputEventAction.MethodBindings
  InputEventFromWindow.MethodBindings
  InputEventGesture.MethodBindings
  InputEventJoypadButton.MethodBindings
  InputEventJoypadMotion.MethodBindings
  InputEventKey.MethodBindings
  InputEventMIDI.MethodBindings
  InputEventMagnifyGesture.MethodBindings
  InputEventMouse.MethodBindings
  InputEventMouseButton.MethodBindings
  InputEventMouseMotion.MethodBindings
  InputEventPanGesture.MethodBindings
  InputEventScreenDrag.MethodBindings
  InputEventScreenTouch.MethodBindings
  InputEventShortcut.MethodBindings
  InputEventWithModifiers.MethodBindings
  InstancePlaceholder.MethodBindings
  IntervalTweener.MethodBindings
  ItemList.MethodBindings
  JNISingleton.MethodBindings
  JSON.MethodBindings
  JSONRPC.MethodBindings
  JavaClass.MethodBindings
  JavaScript.MethodBindings
  JavaScriptObject.MethodBindings
  Joint2D.MethodBindings
  Joint3D.MethodBindings
  JvmScript.MethodBindings
  KinematicCollision2D.MethodBindings
  KinematicCollision3D.MethodBindings
  KotlinScript.MethodBindings
  Label.MethodBindings
  Label3D.MethodBindings
  LabelSettings.MethodBindings
  Light2D.MethodBindings
  Light3D.MethodBindings
  LightOccluder2D.MethodBindings
  LightmapGI.MethodBindings
  LightmapGIData.MethodBindings
  LightmapProbe.MethodBindings
  Lightmapper.MethodBindings
  LightmapperRD.MethodBindings
  Line2D.MethodBindings
  LineEdit.MethodBindings
  LinkButton.MethodBindings
  MainLoop.MethodBindings
  MarginContainer.MethodBindings
  Marker2D.MethodBindings
  Marker3D.MethodBindings
  Material.MethodBindings
  MenuBar.MethodBindings
  MenuButton.MethodBindings
  Mesh.MethodBindings
  MeshConvexDecompositionSettings.MethodBindings
  MeshDataTool.MethodBindings
  MeshInstance2D.MethodBindings
  MeshInstance3D.MethodBindings
  MeshLibrary.MethodBindings
  MeshTexture.MethodBindings
  MethodTweener.MethodBindings
  MissingNode.MethodBindings
  MissingResource.MethodBindings
  MobileVRInterface.MethodBindings
  MovieWriter.MethodBindings
  MultiMesh.MethodBindings
  MultiMeshInstance2D.MethodBindings
  MultiMeshInstance3D.MethodBindings
  MultiplayerAPI.MethodBindings
  MultiplayerAPIExtension.MethodBindings
  MultiplayerPeer.MethodBindings
  MultiplayerPeerExtension.MethodBindings
  MultiplayerSpawner.MethodBindings
  MultiplayerSynchronizer.MethodBindings
  Mutex.MethodBindings
  NavigationAgent2D.MethodBindings
  NavigationAgent3D.MethodBindings
  NavigationLink2D.MethodBindings
  NavigationLink3D.MethodBindings
  NavigationMesh.MethodBindings
  NavigationMeshSourceGeometryData2D.MethodBindings
  NavigationMeshSourceGeometryData3D.MethodBindings
  NavigationObstacle2D.MethodBindings
  NavigationObstacle3D.MethodBindings
  NavigationPathQueryParameters2D.MethodBindings
  NavigationPathQueryParameters3D.MethodBindings
  NavigationPathQueryResult2D.MethodBindings
  NavigationPathQueryResult3D.MethodBindings
  NavigationPolygon.MethodBindings
  NavigationRegion2D.MethodBindings
  NavigationRegion3D.MethodBindings
  NinePatchRect.MethodBindings
  Node.MethodBindings
  Node2D.MethodBindings
  Node3D.MethodBindings
  Node3DGizmo.MethodBindings
  Noise.MethodBindings
  NoiseTexture2D.MethodBindings
  NoiseTexture3D.MethodBindings
  ORMMaterial3D.MethodBindings
  Object.MethodBindings
  Occluder3D.MethodBindings
  OccluderInstance3D.MethodBindings
  OccluderPolygon2D.MethodBindings
  OfflineMultiplayerPeer.MethodBindings
  OggPacketSequence.MethodBindings
  OggPacketSequencePlayback.MethodBindings
  OmniLight3D.MethodBindings
  OpenXRAPIExtension.MethodBindings
  OpenXRAction.MethodBindings
  OpenXRActionMap.MethodBindings
  OpenXRActionSet.MethodBindings
  OpenXRCompositionLayer.MethodBindings
  OpenXRCompositionLayerCylinder.MethodBindings
  OpenXRCompositionLayerEquirect.MethodBindings
  OpenXRCompositionLayerQuad.MethodBindings
  OpenXRExtensionWrapperExtension.MethodBindings
  OpenXRHand.MethodBindings
  OpenXRIPBinding.MethodBindings
  OpenXRInteractionProfile.MethodBindings
  OpenXRInteractionProfileMetadata.MethodBindings
  OpenXRInterface.MethodBindings
  OptimizedTranslation.MethodBindings
  OptionButton.MethodBindings
  PCKPacker.MethodBindings
  PackedDataContainer.MethodBindings
  PackedDataContainerRef.MethodBindings
  PackedScene.MethodBindings
  PacketPeer.MethodBindings
  PacketPeerDTLS.MethodBindings
  PacketPeerExtension.MethodBindings
  PacketPeerStream.MethodBindings
  PacketPeerUDP.MethodBindings
  Panel.MethodBindings
  PanelContainer.MethodBindings
  PanoramaSkyMaterial.MethodBindings
  Parallax2D.MethodBindings
  ParallaxBackground.MethodBindings
  ParallaxLayer.MethodBindings
  ParticleProcessMaterial.MethodBindings
  Path2D.MethodBindings
  Path3D.MethodBindings
  PathFollow2D.MethodBindings
  PathFollow3D.MethodBindings
  PhysicalBone2D.MethodBindings
  PhysicalBone3D.MethodBindings
  PhysicalBoneSimulator3D.MethodBindings
  PhysicalSkyMaterial.MethodBindings
  PhysicsBody2D.MethodBindings
  PhysicsBody3D.MethodBindings
  PhysicsDirectBodyState2D.MethodBindings
  PhysicsDirectBodyState2DExtension.MethodBindings
  PhysicsDirectBodyState3D.MethodBindings
  PhysicsDirectBodyState3DExtension.MethodBindings
  PhysicsDirectSpaceState2D.MethodBindings
  PhysicsDirectSpaceState2DExtension.MethodBindings
  PhysicsDirectSpaceState3D.MethodBindings
  PhysicsDirectSpaceState3DExtension.MethodBindings
  PhysicsMaterial.MethodBindings
  PhysicsPointQueryParameters2D.MethodBindings
  PhysicsPointQueryParameters3D.MethodBindings
  PhysicsRayQueryParameters2D.MethodBindings
  PhysicsRayQueryParameters3D.MethodBindings
  PhysicsServer3DRenderingServerHandler.MethodBindings
  PhysicsShapeQueryParameters2D.MethodBindings
  PhysicsShapeQueryParameters3D.MethodBindings
  PhysicsTestMotionParameters2D.MethodBindings
  PhysicsTestMotionParameters3D.MethodBindings
  PhysicsTestMotionResult2D.MethodBindings
  PhysicsTestMotionResult3D.MethodBindings
  PinJoint2D.MethodBindings
  PinJoint3D.MethodBindings
  PlaceholderCubemap.MethodBindings
  PlaceholderCubemapArray.MethodBindings
  PlaceholderMaterial.MethodBindings
  PlaceholderMesh.MethodBindings
  PlaceholderTexture2D.MethodBindings
  PlaceholderTexture2DArray.MethodBindings
  PlaceholderTexture3D.MethodBindings
  PlaceholderTextureLayered.MethodBindings
  PlaneMesh.MethodBindings
  PointLight2D.MethodBindings
  PointMesh.MethodBindings
  Polygon2D.MethodBindings
  PolygonOccluder3D.MethodBindings
  PolygonPathFinder.MethodBindings
  Popup.MethodBindings
  PopupMenu.MethodBindings
  PopupPanel.MethodBindings
  PortableCompressedTexture2D.MethodBindings
  PrimitiveMesh.MethodBindings
  PrismMesh.MethodBindings
  ProceduralSkyMaterial.MethodBindings
  ProgressBar.MethodBindings
  PropertyTweener.MethodBindings
  QuadMesh.MethodBindings
  QuadOccluder3D.MethodBindings
  RDAttachmentFormat.MethodBindings
  RDFramebufferPass.MethodBindings
  RDPipelineColorBlendState.MethodBindings
  RDPipelineColorBlendStateAttachment.MethodBindings
  RDPipelineDepthStencilState.MethodBindings
  RDPipelineMultisampleState.MethodBindings
  RDPipelineRasterizationState.MethodBindings
  RDPipelineSpecializationConstant.MethodBindings
  RDSamplerState.MethodBindings
  RDShaderFile.MethodBindings
  RDShaderSPIRV.MethodBindings
  RDShaderSource.MethodBindings
  RDTextureFormat.MethodBindings
  RDTextureView.MethodBindings
  RDUniform.MethodBindings
  RDVertexAttribute.MethodBindings
  RandomNumberGenerator.MethodBindings
  Range.MethodBindings
  RayCast2D.MethodBindings
  RayCast3D.MethodBindings
  RectangleShape2D.MethodBindings
  RefCounted.MethodBindings
  ReferenceRect.MethodBindings
  ReflectionProbe.MethodBindings
  RegEx.MethodBindings
  RegExMatch.MethodBindings
  RemoteTransform2D.MethodBindings
  RemoteTransform3D.MethodBindings
  RenderData.MethodBindings
  RenderDataExtension.MethodBindings
  RenderDataRD.MethodBindings
  RenderSceneBuffers.MethodBindings
  RenderSceneBuffersConfiguration.MethodBindings
  RenderSceneBuffersExtension.MethodBindings
  RenderSceneBuffersRD.MethodBindings
  RenderSceneData.MethodBindings
  RenderSceneDataExtension.MethodBindings
  RenderSceneDataRD.MethodBindings
  RenderingDevice.MethodBindings
  Resource.MethodBindings
  ResourceFormatLoader.MethodBindings
  ResourceFormatSaver.MethodBindings
  ResourceImporter.MethodBindings
  ResourcePreloader.MethodBindings
  RibbonTrailMesh.MethodBindings
  RichTextEffect.MethodBindings
  RichTextLabel.MethodBindings
  RigidBody2D.MethodBindings
  RigidBody3D.MethodBindings
  RootMotionView.MethodBindings
  SceneMultiplayer.MethodBindings
  SceneReplicationConfig.MethodBindings
  SceneState.MethodBindings
  SceneTree.MethodBindings
  SceneTreeTimer.MethodBindings
  Script.MethodBindings
  ScriptExtension.MethodBindings
  ScriptLanguage.MethodBindings
  ScriptLanguageExtension.MethodBindings
  ScrollBar.MethodBindings
  ScrollContainer.MethodBindings
  SegmentShape2D.MethodBindings
  Semaphore.MethodBindings
  SeparationRayShape2D.MethodBindings
  SeparationRayShape3D.MethodBindings
  Separator.MethodBindings
  Shader.MethodBindings
  ShaderGlobalsOverride.MethodBindings
  ShaderInclude.MethodBindings
  ShaderMaterial.MethodBindings
  Shape2D.MethodBindings
  Shape3D.MethodBindings
  ShapeCast2D.MethodBindings
  ShapeCast3D.MethodBindings
  Shortcut.MethodBindings
  Skeleton2D.MethodBindings
  Skeleton3D.MethodBindings
  SkeletonIK3D.MethodBindings
  SkeletonModification2D.MethodBindings
  SkeletonModification2DCCDIK.MethodBindings
  SkeletonModification2DFABRIK.MethodBindings
  SkeletonModification2DJiggle.MethodBindings
  SkeletonModification2DLookAt.MethodBindings
  SkeletonModification2DPhysicalBones.MethodBindings
  SkeletonModification2DStackHolder.MethodBindings
  SkeletonModification2DTwoBoneIK.MethodBindings
  SkeletonModificationStack2D.MethodBindings
  SkeletonModifier3D.MethodBindings
  SkeletonProfile.MethodBindings
  SkeletonProfileHumanoid.MethodBindings
  Skin.MethodBindings
  SkinReference.MethodBindings
  Sky.MethodBindings
  Slider.MethodBindings
  SliderJoint3D.MethodBindings
  SoftBody3D.MethodBindings
  SphereMesh.MethodBindings
  SphereOccluder3D.MethodBindings
  SphereShape3D.MethodBindings
  SpinBox.MethodBindings
  SplitContainer.MethodBindings
  SpotLight3D.MethodBindings
  SpringArm3D.MethodBindings
  Sprite2D.MethodBindings
  Sprite3D.MethodBindings
  SpriteBase3D.MethodBindings
  SpriteFrames.MethodBindings
  StandardMaterial3D.MethodBindings
  StaticBody2D.MethodBindings
  StaticBody3D.MethodBindings
  StatusIndicator.MethodBindings
  StreamPeer.MethodBindings
  StreamPeerBuffer.MethodBindings
  StreamPeerExtension.MethodBindings
  StreamPeerGZIP.MethodBindings
  StreamPeerTCP.MethodBindings
  StreamPeerTLS.MethodBindings
  StyleBox.MethodBindings
  StyleBoxEmpty.MethodBindings
  StyleBoxFlat.MethodBindings
  StyleBoxLine.MethodBindings
  StyleBoxTexture.MethodBindings
  SubViewport.MethodBindings
  SubViewportContainer.MethodBindings
  SurfaceTool.MethodBindings
  SyntaxHighlighter.MethodBindings
  SystemFont.MethodBindings
  TCPServer.MethodBindings
  TLSOptions.MethodBindings
  TabBar.MethodBindings
  TabContainer.MethodBindings
  TextEdit.MethodBindings
  TextLine.MethodBindings
  TextMesh.MethodBindings
  TextParagraph.MethodBindings
  TextServer.MethodBindings
  TextServerAdvanced.MethodBindings
  TextServerDummy.MethodBindings
  TextServerExtension.MethodBindings
  Texture.MethodBindings
  Texture2D.MethodBindings
  Texture2DArray.MethodBindings
  Texture2DArrayRD.MethodBindings
  Texture2DRD.MethodBindings
  Texture3D.MethodBindings
  Texture3DRD.MethodBindings
  TextureButton.MethodBindings
  TextureCubemapArrayRD.MethodBindings
  TextureCubemapRD.MethodBindings
  TextureLayered.MethodBindings
  TextureLayeredRD.MethodBindings
  TextureProgressBar.MethodBindings
  TextureRect.MethodBindings
  Theme.MethodBindings
  Thread.MethodBindings
  TileData.MethodBindings
  TileMap.MethodBindings
  TileMapLayer.MethodBindings
  TileMapPattern.MethodBindings
  TileSet.MethodBindings
  TileSetAtlasSource.MethodBindings
  TileSetScenesCollectionSource.MethodBindings
  TileSetSource.MethodBindings
  Timer.MethodBindings
  TorusMesh.MethodBindings
  TouchScreenButton.MethodBindings
  Translation.MethodBindings
  Tree.MethodBindings
  TreeItem.MethodBindings
  TriangleMesh.MethodBindings
  TubeTrailMesh.MethodBindings
  Tween.MethodBindings
  Tweener.MethodBindings
  UDPServer.MethodBindings
  UPNP.MethodBindings
  UPNPDevice.MethodBindings
  UndoRedo.MethodBindings
  UniformSetCacheRD.MethodBindings
  VBoxContainer.MethodBindings
  VFlowContainer.MethodBindings
  VScrollBar.MethodBindings
  VSeparator.MethodBindings
  VSlider.MethodBindings
  VSplitContainer.MethodBindings
  VehicleBody3D.MethodBindings
  VehicleWheel3D.MethodBindings
  VideoStream.MethodBindings
  VideoStreamPlayback.MethodBindings
  VideoStreamPlayer.MethodBindings
  VideoStreamTheora.MethodBindings
  Viewport.MethodBindings
  ViewportTexture.MethodBindings
  VisibleOnScreenEnabler2D.MethodBindings
  VisibleOnScreenEnabler3D.MethodBindings
  VisibleOnScreenNotifier2D.MethodBindings
  VisibleOnScreenNotifier3D.MethodBindings
  VisualInstance3D.MethodBindings
  VisualShader.MethodBindings
  VisualShaderNode.MethodBindings
  VisualShaderNodeBillboard.MethodBindings
  VisualShaderNodeBooleanConstant.MethodBindings
  VisualShaderNodeBooleanParameter.MethodBindings
  VisualShaderNodeClamp.MethodBindings
  VisualShaderNodeColorConstant.MethodBindings
  VisualShaderNodeColorFunc.MethodBindings
  VisualShaderNodeColorOp.MethodBindings
  VisualShaderNodeColorParameter.MethodBindings
  VisualShaderNodeComment.MethodBindings
  VisualShaderNodeCompare.MethodBindings
  VisualShaderNodeConstant.MethodBindings
  VisualShaderNodeCubemap.MethodBindings
  VisualShaderNodeCubemapParameter.MethodBindings
  VisualShaderNodeCurveTexture.MethodBindings
  VisualShaderNodeCurveXYZTexture.MethodBindings
  VisualShaderNodeCustom.MethodBindings
  VisualShaderNodeDerivativeFunc.MethodBindings
  VisualShaderNodeDeterminant.MethodBindings
  VisualShaderNodeDistanceFade.MethodBindings
  VisualShaderNodeDotProduct.MethodBindings
  VisualShaderNodeExpression.MethodBindings
  VisualShaderNodeFaceForward.MethodBindings
  VisualShaderNodeFloatConstant.MethodBindings
  VisualShaderNodeFloatFunc.MethodBindings
  VisualShaderNodeFloatOp.MethodBindings
  VisualShaderNodeFloatParameter.MethodBindings
  VisualShaderNodeFrame.MethodBindings
  VisualShaderNodeFresnel.MethodBindings
  VisualShaderNodeGlobalExpression.MethodBindings
  VisualShaderNodeGroupBase.MethodBindings
  VisualShaderNodeIf.MethodBindings
  VisualShaderNodeInput.MethodBindings
  VisualShaderNodeIntConstant.MethodBindings
  VisualShaderNodeIntFunc.MethodBindings
  VisualShaderNodeIntOp.MethodBindings
  VisualShaderNodeIntParameter.MethodBindings
  VisualShaderNodeIs.MethodBindings
  VisualShaderNodeLinearSceneDepth.MethodBindings
  VisualShaderNodeMix.MethodBindings
  VisualShaderNodeMultiplyAdd.MethodBindings
  VisualShaderNodeOuterProduct.MethodBindings
  VisualShaderNodeOutput.MethodBindings
  VisualShaderNodeParameter.MethodBindings
  VisualShaderNodeParameterRef.MethodBindings
  VisualShaderNodeParticleAccelerator.MethodBindings
  VisualShaderNodeParticleBoxEmitter.MethodBindings
  VisualShaderNodeParticleConeVelocity.MethodBindings
  VisualShaderNodeParticleEmit.MethodBindings
  VisualShaderNodeParticleEmitter.MethodBindings
  VisualShaderNodeParticleMeshEmitter.MethodBindings
  VisualShaderNodeParticleMultiplyByAxisAngle.MethodBindings
  VisualShaderNodeParticleOutput.MethodBindings
  VisualShaderNodeParticleRandomness.MethodBindings
  VisualShaderNodeParticleRingEmitter.MethodBindings
  VisualShaderNodeParticleSphereEmitter.MethodBindings
  VisualShaderNodeProximityFade.MethodBindings
  VisualShaderNodeRandomRange.MethodBindings
  VisualShaderNodeRemap.MethodBindings
  VisualShaderNodeReroute.MethodBindings
  VisualShaderNodeResizableBase.MethodBindings
  VisualShaderNodeRotationByAxis.MethodBindings
  VisualShaderNodeSDFRaymarch.MethodBindings
  VisualShaderNodeSDFToScreenUV.MethodBindings
  VisualShaderNodeSample3D.MethodBindings
  VisualShaderNodeScreenNormalWorldSpace.MethodBindings
  VisualShaderNodeScreenUVToSDF.MethodBindings
  VisualShaderNodeSmoothStep.MethodBindings
  VisualShaderNodeStep.MethodBindings
  VisualShaderNodeSwitch.MethodBindings
  VisualShaderNodeTexture.MethodBindings
  VisualShaderNodeTexture2DArray.MethodBindings
  VisualShaderNodeTexture2DArrayParameter.MethodBindings
  VisualShaderNodeTexture2DParameter.MethodBindings
  VisualShaderNodeTexture3D.MethodBindings
  VisualShaderNodeTexture3DParameter.MethodBindings
  VisualShaderNodeTextureParameter.MethodBindings
  VisualShaderNodeTextureParameterTriplanar.MethodBindings
  VisualShaderNodeTextureSDF.MethodBindings
  VisualShaderNodeTextureSDFNormal.MethodBindings
  VisualShaderNodeTransformCompose.MethodBindings
  VisualShaderNodeTransformConstant.MethodBindings
  VisualShaderNodeTransformDecompose.MethodBindings
  VisualShaderNodeTransformFunc.MethodBindings
  VisualShaderNodeTransformOp.MethodBindings
  VisualShaderNodeTransformParameter.MethodBindings
  VisualShaderNodeTransformVecMult.MethodBindings
  VisualShaderNodeUIntConstant.MethodBindings
  VisualShaderNodeUIntFunc.MethodBindings
  VisualShaderNodeUIntOp.MethodBindings
  VisualShaderNodeUIntParameter.MethodBindings
  VisualShaderNodeUVFunc.MethodBindings
  VisualShaderNodeUVPolarCoord.MethodBindings
  VisualShaderNodeVarying.MethodBindings
  VisualShaderNodeVaryingGetter.MethodBindings
  VisualShaderNodeVaryingSetter.MethodBindings
  VisualShaderNodeVec2Constant.MethodBindings
  VisualShaderNodeVec2Parameter.MethodBindings
  VisualShaderNodeVec3Constant.MethodBindings
  VisualShaderNodeVec3Parameter.MethodBindings
  VisualShaderNodeVec4Constant.MethodBindings
  VisualShaderNodeVec4Parameter.MethodBindings
  VisualShaderNodeVectorBase.MethodBindings
  VisualShaderNodeVectorCompose.MethodBindings
  VisualShaderNodeVectorDecompose.MethodBindings
  VisualShaderNodeVectorDistance.MethodBindings
  VisualShaderNodeVectorFunc.MethodBindings
  VisualShaderNodeVectorLen.MethodBindings
  VisualShaderNodeVectorOp.MethodBindings
  VisualShaderNodeVectorRefract.MethodBindings
  VisualShaderNodeWorldPositionFromDepth.MethodBindings
  VoxelGI.MethodBindings
  VoxelGIData.MethodBindings
  WeakRef.MethodBindings
  WebRTCDataChannel.MethodBindings
  WebRTCDataChannelExtension.MethodBindings
  WebRTCMultiplayerPeer.MethodBindings
  WebRTCPeerConnection.MethodBindings
  WebRTCPeerConnectionExtension.MethodBindings
  WebSocketMultiplayerPeer.MethodBindings
  WebSocketPeer.MethodBindings
  WebXRInterface.MethodBindings
  Window.MethodBindings
  World2D.MethodBindings
  World3D.MethodBindings
  WorldBoundaryShape2D.MethodBindings
  WorldBoundaryShape3D.MethodBindings
  WorldEnvironment.MethodBindings
  X509Certificate.MethodBindings
  XMLParser.MethodBindings
  XRAnchor3D.MethodBindings
  XRBodyModifier3D.MethodBindings
  XRBodyTracker.MethodBindings
  XRCamera3D.MethodBindings
  XRController3D.MethodBindings
  XRControllerTracker.MethodBindings
  XRFaceModifier3D.MethodBindings
  XRFaceTracker.MethodBindings
  XRHandModifier3D.MethodBindings
  XRHandTracker.MethodBindings
  XRInterface.MethodBindings
  XRInterfaceExtension.MethodBindings
  XRNode3D.MethodBindings
  XROrigin3D.MethodBindings
  XRPose.MethodBindings
  XRPositionalTracker.MethodBindings
  XRTracker.MethodBindings
  XRVRS.MethodBindings
  ZIPPacker.MethodBindings
  ZIPReader.MethodBindings
}
