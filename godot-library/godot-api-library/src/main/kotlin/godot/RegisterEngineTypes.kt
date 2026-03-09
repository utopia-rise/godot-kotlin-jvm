package godot

import godot.`internal`.reflection.TypeManager
import godot.api.AESContext
import godot.api.AStar2D
import godot.api.AStar3D
import godot.api.AStarGrid2D
import godot.api.AcceptDialog
import godot.api.AimModifier3D
import godot.api.AnimatableBody2D
import godot.api.AnimatableBody3D
import godot.api.AnimatedSprite2D
import godot.api.AnimatedSprite3D
import godot.api.AnimatedTexture
import godot.api.Animation
import godot.api.AnimationLibrary
import godot.api.AnimationMixer
import godot.api.AnimationNode
import godot.api.AnimationNodeAdd2
import godot.api.AnimationNodeAdd3
import godot.api.AnimationNodeAnimation
import godot.api.AnimationNodeBlend2
import godot.api.AnimationNodeBlend3
import godot.api.AnimationNodeBlendSpace1D
import godot.api.AnimationNodeBlendSpace2D
import godot.api.AnimationNodeBlendTree
import godot.api.AnimationNodeExtension
import godot.api.AnimationNodeOneShot
import godot.api.AnimationNodeOutput
import godot.api.AnimationNodeStateMachine
import godot.api.AnimationNodeStateMachinePlayback
import godot.api.AnimationNodeStateMachineTransition
import godot.api.AnimationNodeSub2
import godot.api.AnimationNodeSync
import godot.api.AnimationNodeTimeScale
import godot.api.AnimationNodeTimeSeek
import godot.api.AnimationNodeTransition
import godot.api.AnimationPlayer
import godot.api.AnimationRootNode
import godot.api.AnimationTree
import godot.api.Area2D
import godot.api.Area3D
import godot.api.ArrayMesh
import godot.api.ArrayOccluder3D
import godot.api.AspectRatioContainer
import godot.api.AtlasTexture
import godot.api.AudioBusLayout
import godot.api.AudioEffect
import godot.api.AudioEffectAmplify
import godot.api.AudioEffectBandLimitFilter
import godot.api.AudioEffectBandPassFilter
import godot.api.AudioEffectCapture
import godot.api.AudioEffectChorus
import godot.api.AudioEffectCompressor
import godot.api.AudioEffectDelay
import godot.api.AudioEffectDistortion
import godot.api.AudioEffectEQ
import godot.api.AudioEffectEQ10
import godot.api.AudioEffectEQ21
import godot.api.AudioEffectEQ6
import godot.api.AudioEffectFilter
import godot.api.AudioEffectHardLimiter
import godot.api.AudioEffectHighPassFilter
import godot.api.AudioEffectHighShelfFilter
import godot.api.AudioEffectInstance
import godot.api.AudioEffectLimiter
import godot.api.AudioEffectLowPassFilter
import godot.api.AudioEffectLowShelfFilter
import godot.api.AudioEffectNotchFilter
import godot.api.AudioEffectPanner
import godot.api.AudioEffectPhaser
import godot.api.AudioEffectPitchShift
import godot.api.AudioEffectRecord
import godot.api.AudioEffectReverb
import godot.api.AudioEffectSpectrumAnalyzer
import godot.api.AudioEffectSpectrumAnalyzerInstance
import godot.api.AudioEffectStereoEnhance
import godot.api.AudioListener2D
import godot.api.AudioListener3D
import godot.api.AudioSample
import godot.api.AudioSamplePlayback
import godot.api.AudioServer
import godot.api.AudioStream
import godot.api.AudioStreamGenerator
import godot.api.AudioStreamGeneratorPlayback
import godot.api.AudioStreamInteractive
import godot.api.AudioStreamMP3
import godot.api.AudioStreamMicrophone
import godot.api.AudioStreamOggVorbis
import godot.api.AudioStreamPlayback
import godot.api.AudioStreamPlaybackInteractive
import godot.api.AudioStreamPlaybackOggVorbis
import godot.api.AudioStreamPlaybackPlaylist
import godot.api.AudioStreamPlaybackPolyphonic
import godot.api.AudioStreamPlaybackResampled
import godot.api.AudioStreamPlaybackSynchronized
import godot.api.AudioStreamPlayer
import godot.api.AudioStreamPlayer2D
import godot.api.AudioStreamPlayer3D
import godot.api.AudioStreamPlaylist
import godot.api.AudioStreamPolyphonic
import godot.api.AudioStreamRandomizer
import godot.api.AudioStreamSynchronized
import godot.api.AudioStreamWAV
import godot.api.BackBufferCopy
import godot.api.BaseButton
import godot.api.BaseMaterial3D
import godot.api.BitMap
import godot.api.Bone2D
import godot.api.BoneAttachment3D
import godot.api.BoneConstraint3D
import godot.api.BoneMap
import godot.api.BoxContainer
import godot.api.BoxMesh
import godot.api.BoxOccluder3D
import godot.api.BoxShape3D
import godot.api.Button
import godot.api.ButtonGroup
import godot.api.CPUParticles2D
import godot.api.CPUParticles3D
import godot.api.CSGBox3D
import godot.api.CSGCombiner3D
import godot.api.CSGCylinder3D
import godot.api.CSGMesh3D
import godot.api.CSGPolygon3D
import godot.api.CSGPrimitive3D
import godot.api.CSGShape3D
import godot.api.CSGSphere3D
import godot.api.CSGTorus3D
import godot.api.CallbackTweener
import godot.api.Camera2D
import godot.api.Camera3D
import godot.api.CameraAttributes
import godot.api.CameraAttributesPhysical
import godot.api.CameraAttributesPractical
import godot.api.CameraFeed
import godot.api.CameraServer
import godot.api.CameraTexture
import godot.api.CanvasGroup
import godot.api.CanvasItem
import godot.api.CanvasItemMaterial
import godot.api.CanvasLayer
import godot.api.CanvasModulate
import godot.api.CanvasTexture
import godot.api.CapsuleMesh
import godot.api.CapsuleShape2D
import godot.api.CapsuleShape3D
import godot.api.CenterContainer
import godot.api.CharFXTransform
import godot.api.CharacterBody2D
import godot.api.CharacterBody3D
import godot.api.CheckBox
import godot.api.CheckButton
import godot.api.CircleShape2D
import godot.api.ClassDB
import godot.api.CodeEdit
import godot.api.CodeHighlighter
import godot.api.CollisionObject2D
import godot.api.CollisionObject3D
import godot.api.CollisionPolygon2D
import godot.api.CollisionPolygon3D
import godot.api.CollisionShape2D
import godot.api.CollisionShape3D
import godot.api.ColorPalette
import godot.api.ColorPicker
import godot.api.ColorPickerButton
import godot.api.ColorRect
import godot.api.Compositor
import godot.api.CompositorEffect
import godot.api.CompressedCubemap
import godot.api.CompressedCubemapArray
import godot.api.CompressedTexture2D
import godot.api.CompressedTexture2DArray
import godot.api.CompressedTexture3D
import godot.api.CompressedTextureLayered
import godot.api.ConcavePolygonShape2D
import godot.api.ConcavePolygonShape3D
import godot.api.ConeTwistJoint3D
import godot.api.ConfigFile
import godot.api.ConfirmationDialog
import godot.api.Container
import godot.api.Control
import godot.api.ConvertTransformModifier3D
import godot.api.ConvexPolygonShape2D
import godot.api.ConvexPolygonShape3D
import godot.api.CopyTransformModifier3D
import godot.api.Crypto
import godot.api.CryptoKey
import godot.api.Cubemap
import godot.api.CubemapArray
import godot.api.Curve
import godot.api.Curve2D
import godot.api.Curve3D
import godot.api.CurveTexture
import godot.api.CurveXYZTexture
import godot.api.CylinderMesh
import godot.api.CylinderShape3D
import godot.api.DPITexture
import godot.api.DTLSServer
import godot.api.DampedSpringJoint2D
import godot.api.Decal
import godot.api.DirAccess
import godot.api.DirectionalLight2D
import godot.api.DirectionalLight3D
import godot.api.DisplayServer
import godot.api.ENetConnection
import godot.api.ENetMultiplayerPeer
import godot.api.ENetPacketPeer
import godot.api.EncodedObjectAsID
import godot.api.Engine
import godot.api.EngineDebugger
import godot.api.EngineProfiler
import godot.api.Environment
import godot.api.Expression
import godot.api.ExternalTexture
import godot.api.FBXDocument
import godot.api.FBXState
import godot.api.FastNoiseLite
import godot.api.FileAccess
import godot.api.FileDialog
import godot.api.FlowContainer
import godot.api.FogMaterial
import godot.api.FogVolume
import godot.api.FoldableContainer
import godot.api.FoldableGroup
import godot.api.Font
import godot.api.FontFile
import godot.api.FontVariation
import godot.api.FramebufferCacheRD
import godot.api.GDExtension
import godot.api.GDExtensionManager
import godot.api.GDScript
import godot.api.GLTFAccessor
import godot.api.GLTFAnimation
import godot.api.GLTFBufferView
import godot.api.GLTFCamera
import godot.api.GLTFDocument
import godot.api.GLTFDocumentExtension
import godot.api.GLTFDocumentExtensionConvertImporterMesh
import godot.api.GLTFLight
import godot.api.GLTFMesh
import godot.api.GLTFNode
import godot.api.GLTFObjectModelProperty
import godot.api.GLTFPhysicsBody
import godot.api.GLTFPhysicsShape
import godot.api.GLTFSkeleton
import godot.api.GLTFSkin
import godot.api.GLTFSpecGloss
import godot.api.GLTFState
import godot.api.GLTFTexture
import godot.api.GLTFTextureSampler
import godot.api.GPUParticles2D
import godot.api.GPUParticles3D
import godot.api.GPUParticlesAttractor3D
import godot.api.GPUParticlesAttractorBox3D
import godot.api.GPUParticlesAttractorSphere3D
import godot.api.GPUParticlesAttractorVectorField3D
import godot.api.GPUParticlesCollision3D
import godot.api.GPUParticlesCollisionBox3D
import godot.api.GPUParticlesCollisionHeightField3D
import godot.api.GPUParticlesCollisionSDF3D
import godot.api.GPUParticlesCollisionSphere3D
import godot.api.GdjScript
import godot.api.Generic6DOFJoint3D
import godot.api.Geometry2D
import godot.api.Geometry3D
import godot.api.GeometryInstance3D
import godot.api.Gradient
import godot.api.GradientTexture1D
import godot.api.GradientTexture2D
import godot.api.GraphEdit
import godot.api.GraphElement
import godot.api.GraphFrame
import godot.api.GraphNode
import godot.api.GridContainer
import godot.api.GridMap
import godot.api.GrooveJoint2D
import godot.api.HBoxContainer
import godot.api.HFlowContainer
import godot.api.HMACContext
import godot.api.HScrollBar
import godot.api.HSeparator
import godot.api.HSlider
import godot.api.HSplitContainer
import godot.api.HTTPClient
import godot.api.HTTPRequest
import godot.api.HashingContext
import godot.api.HeightMapShape3D
import godot.api.HingeJoint3D
import godot.api.IP
import godot.api.Image
import godot.api.ImageFormatLoader
import godot.api.ImageFormatLoaderExtension
import godot.api.ImageTexture
import godot.api.ImageTexture3D
import godot.api.ImageTextureLayered
import godot.api.ImmediateMesh
import godot.api.ImporterMesh
import godot.api.ImporterMeshInstance3D
import godot.api.Input
import godot.api.InputEvent
import godot.api.InputEventAction
import godot.api.InputEventFromWindow
import godot.api.InputEventGesture
import godot.api.InputEventJoypadButton
import godot.api.InputEventJoypadMotion
import godot.api.InputEventKey
import godot.api.InputEventMIDI
import godot.api.InputEventMagnifyGesture
import godot.api.InputEventMouse
import godot.api.InputEventMouseButton
import godot.api.InputEventMouseMotion
import godot.api.InputEventPanGesture
import godot.api.InputEventScreenDrag
import godot.api.InputEventScreenTouch
import godot.api.InputEventShortcut
import godot.api.InputEventWithModifiers
import godot.api.InputMap
import godot.api.InstancePlaceholder
import godot.api.IntervalTweener
import godot.api.ItemList
import godot.api.JNISingleton
import godot.api.JSON
import godot.api.JSONRPC
import godot.api.JavaClass
import godot.api.JavaClassWrapper
import godot.api.JavaObject
import godot.api.JavaScript
import godot.api.JavaScriptBridge
import godot.api.JavaScriptObject
import godot.api.Joint2D
import godot.api.Joint3D
import godot.api.JvmScript
import godot.api.KinematicCollision2D
import godot.api.KinematicCollision3D
import godot.api.KotlinScript
import godot.api.Label
import godot.api.Label3D
import godot.api.LabelSettings
import godot.api.Light2D
import godot.api.Light3D
import godot.api.LightOccluder2D
import godot.api.LightmapGI
import godot.api.LightmapGIData
import godot.api.LightmapProbe
import godot.api.Lightmapper
import godot.api.LightmapperRD
import godot.api.Line2D
import godot.api.LineEdit
import godot.api.LinkButton
import godot.api.Logger
import godot.api.LookAtModifier3D
import godot.api.MainLoop
import godot.api.MarginContainer
import godot.api.Marker2D
import godot.api.Marker3D
import godot.api.Marshalls
import godot.api.Material
import godot.api.MenuBar
import godot.api.MenuButton
import godot.api.Mesh
import godot.api.MeshConvexDecompositionSettings
import godot.api.MeshDataTool
import godot.api.MeshInstance2D
import godot.api.MeshInstance3D
import godot.api.MeshLibrary
import godot.api.MeshTexture
import godot.api.MethodTweener
import godot.api.MissingNode
import godot.api.MissingResource
import godot.api.MobileVRInterface
import godot.api.ModifierBoneTarget3D
import godot.api.MovieWriter
import godot.api.MultiMesh
import godot.api.MultiMeshInstance2D
import godot.api.MultiMeshInstance3D
import godot.api.MultiplayerAPI
import godot.api.MultiplayerAPIExtension
import godot.api.MultiplayerPeer
import godot.api.MultiplayerPeerExtension
import godot.api.MultiplayerSpawner
import godot.api.MultiplayerSynchronizer
import godot.api.Mutex
import godot.api.NativeMenu
import godot.api.NavigationAgent2D
import godot.api.NavigationAgent3D
import godot.api.NavigationLink2D
import godot.api.NavigationLink3D
import godot.api.NavigationMesh
import godot.api.NavigationMeshGenerator
import godot.api.NavigationMeshSourceGeometryData2D
import godot.api.NavigationMeshSourceGeometryData3D
import godot.api.NavigationObstacle2D
import godot.api.NavigationObstacle3D
import godot.api.NavigationPathQueryParameters2D
import godot.api.NavigationPathQueryParameters3D
import godot.api.NavigationPathQueryResult2D
import godot.api.NavigationPathQueryResult3D
import godot.api.NavigationPolygon
import godot.api.NavigationRegion2D
import godot.api.NavigationRegion3D
import godot.api.NavigationServer2D
import godot.api.NavigationServer3D
import godot.api.NinePatchRect
import godot.api.Node
import godot.api.Node2D
import godot.api.Node3D
import godot.api.Node3DGizmo
import godot.api.Noise
import godot.api.NoiseTexture2D
import godot.api.NoiseTexture3D
import godot.api.ORMMaterial3D
import godot.api.OS
import godot.api.Object
import godot.api.Occluder3D
import godot.api.OccluderInstance3D
import godot.api.OccluderPolygon2D
import godot.api.OfflineMultiplayerPeer
import godot.api.OggPacketSequence
import godot.api.OggPacketSequencePlayback
import godot.api.OmniLight3D
import godot.api.OpenXRAPIExtension
import godot.api.OpenXRAction
import godot.api.OpenXRActionBindingModifier
import godot.api.OpenXRActionMap
import godot.api.OpenXRActionSet
import godot.api.OpenXRAnalogThresholdModifier
import godot.api.OpenXRBindingModifier
import godot.api.OpenXRCompositionLayer
import godot.api.OpenXRCompositionLayerCylinder
import godot.api.OpenXRCompositionLayerEquirect
import godot.api.OpenXRCompositionLayerQuad
import godot.api.OpenXRDpadBindingModifier
import godot.api.OpenXRExtensionWrapper
import godot.api.OpenXRExtensionWrapperExtension
import godot.api.OpenXRFutureExtension
import godot.api.OpenXRFutureResult
import godot.api.OpenXRHand
import godot.api.OpenXRHapticBase
import godot.api.OpenXRHapticVibration
import godot.api.OpenXRIPBinding
import godot.api.OpenXRIPBindingModifier
import godot.api.OpenXRInteractionProfile
import godot.api.OpenXRInteractionProfileMetadata
import godot.api.OpenXRInterface
import godot.api.OpenXRRenderModel
import godot.api.OpenXRRenderModelExtension
import godot.api.OpenXRRenderModelManager
import godot.api.OpenXRVisibilityMask
import godot.api.OptimizedTranslation
import godot.api.OptionButton
import godot.api.PCKPacker
import godot.api.PackedDataContainer
import godot.api.PackedDataContainerRef
import godot.api.PackedScene
import godot.api.PacketPeer
import godot.api.PacketPeerDTLS
import godot.api.PacketPeerExtension
import godot.api.PacketPeerStream
import godot.api.PacketPeerUDP
import godot.api.Panel
import godot.api.PanelContainer
import godot.api.PanoramaSkyMaterial
import godot.api.Parallax2D
import godot.api.ParallaxBackground
import godot.api.ParallaxLayer
import godot.api.ParticleProcessMaterial
import godot.api.Path2D
import godot.api.Path3D
import godot.api.PathFollow2D
import godot.api.PathFollow3D
import godot.api.Performance
import godot.api.PhysicalBone2D
import godot.api.PhysicalBone3D
import godot.api.PhysicalBoneSimulator3D
import godot.api.PhysicalSkyMaterial
import godot.api.PhysicsBody2D
import godot.api.PhysicsBody3D
import godot.api.PhysicsDirectBodyState2D
import godot.api.PhysicsDirectBodyState2DExtension
import godot.api.PhysicsDirectBodyState3D
import godot.api.PhysicsDirectBodyState3DExtension
import godot.api.PhysicsDirectSpaceState2D
import godot.api.PhysicsDirectSpaceState2DExtension
import godot.api.PhysicsDirectSpaceState3D
import godot.api.PhysicsDirectSpaceState3DExtension
import godot.api.PhysicsMaterial
import godot.api.PhysicsPointQueryParameters2D
import godot.api.PhysicsPointQueryParameters3D
import godot.api.PhysicsRayQueryParameters2D
import godot.api.PhysicsRayQueryParameters3D
import godot.api.PhysicsServer2D
import godot.api.PhysicsServer2DManager
import godot.api.PhysicsServer3D
import godot.api.PhysicsServer3DManager
import godot.api.PhysicsServer3DRenderingServerHandler
import godot.api.PhysicsShapeQueryParameters2D
import godot.api.PhysicsShapeQueryParameters3D
import godot.api.PhysicsTestMotionParameters2D
import godot.api.PhysicsTestMotionParameters3D
import godot.api.PhysicsTestMotionResult2D
import godot.api.PhysicsTestMotionResult3D
import godot.api.PinJoint2D
import godot.api.PinJoint3D
import godot.api.PlaceholderCubemap
import godot.api.PlaceholderCubemapArray
import godot.api.PlaceholderMaterial
import godot.api.PlaceholderMesh
import godot.api.PlaceholderTexture2D
import godot.api.PlaceholderTexture2DArray
import godot.api.PlaceholderTexture3D
import godot.api.PlaceholderTextureLayered
import godot.api.PlaneMesh
import godot.api.PointLight2D
import godot.api.PointMesh
import godot.api.Polygon2D
import godot.api.PolygonOccluder3D
import godot.api.PolygonPathFinder
import godot.api.Popup
import godot.api.PopupMenu
import godot.api.PopupPanel
import godot.api.PortableCompressedTexture2D
import godot.api.PrimitiveMesh
import godot.api.PrismMesh
import godot.api.ProceduralSkyMaterial
import godot.api.ProgressBar
import godot.api.ProjectSettings
import godot.api.PropertyTweener
import godot.api.QuadMesh
import godot.api.QuadOccluder3D
import godot.api.RDAttachmentFormat
import godot.api.RDFramebufferPass
import godot.api.RDPipelineColorBlendState
import godot.api.RDPipelineColorBlendStateAttachment
import godot.api.RDPipelineDepthStencilState
import godot.api.RDPipelineMultisampleState
import godot.api.RDPipelineRasterizationState
import godot.api.RDPipelineSpecializationConstant
import godot.api.RDSamplerState
import godot.api.RDShaderFile
import godot.api.RDShaderSPIRV
import godot.api.RDShaderSource
import godot.api.RDTextureFormat
import godot.api.RDTextureView
import godot.api.RDUniform
import godot.api.RDVertexAttribute
import godot.api.RandomNumberGenerator
import godot.api.Range
import godot.api.RayCast2D
import godot.api.RayCast3D
import godot.api.RectangleShape2D
import godot.api.RefCounted
import godot.api.ReferenceRect
import godot.api.ReflectionProbe
import godot.api.RegEx
import godot.api.RegExMatch
import godot.api.RemoteTransform2D
import godot.api.RemoteTransform3D
import godot.api.RenderData
import godot.api.RenderDataExtension
import godot.api.RenderDataRD
import godot.api.RenderSceneBuffers
import godot.api.RenderSceneBuffersConfiguration
import godot.api.RenderSceneBuffersExtension
import godot.api.RenderSceneBuffersRD
import godot.api.RenderSceneData
import godot.api.RenderSceneDataExtension
import godot.api.RenderSceneDataRD
import godot.api.RenderingDevice
import godot.api.RenderingServer
import godot.api.Resource
import godot.api.ResourceFormatLoader
import godot.api.ResourceFormatSaver
import godot.api.ResourceImporter
import godot.api.ResourceLoader
import godot.api.ResourcePreloader
import godot.api.ResourceSaver
import godot.api.ResourceUID
import godot.api.RetargetModifier3D
import godot.api.RibbonTrailMesh
import godot.api.RichTextEffect
import godot.api.RichTextLabel
import godot.api.RigidBody2D
import godot.api.RigidBody3D
import godot.api.RootMotionView
import godot.api.ScalaScript
import godot.api.SceneMultiplayer
import godot.api.SceneReplicationConfig
import godot.api.SceneState
import godot.api.SceneTree
import godot.api.SceneTreeTimer
import godot.api.Script
import godot.api.ScriptBacktrace
import godot.api.ScriptExtension
import godot.api.ScriptLanguage
import godot.api.ScriptLanguageExtension
import godot.api.ScrollBar
import godot.api.ScrollContainer
import godot.api.SegmentShape2D
import godot.api.Semaphore
import godot.api.SeparationRayShape2D
import godot.api.SeparationRayShape3D
import godot.api.Separator
import godot.api.Shader
import godot.api.ShaderGlobalsOverride
import godot.api.ShaderInclude
import godot.api.ShaderIncludeDB
import godot.api.ShaderMaterial
import godot.api.Shape2D
import godot.api.Shape3D
import godot.api.ShapeCast2D
import godot.api.ShapeCast3D
import godot.api.Shortcut
import godot.api.Skeleton2D
import godot.api.Skeleton3D
import godot.api.SkeletonIK3D
import godot.api.SkeletonModification2D
import godot.api.SkeletonModification2DCCDIK
import godot.api.SkeletonModification2DFABRIK
import godot.api.SkeletonModification2DJiggle
import godot.api.SkeletonModification2DLookAt
import godot.api.SkeletonModification2DPhysicalBones
import godot.api.SkeletonModification2DStackHolder
import godot.api.SkeletonModification2DTwoBoneIK
import godot.api.SkeletonModificationStack2D
import godot.api.SkeletonModifier3D
import godot.api.SkeletonProfile
import godot.api.SkeletonProfileHumanoid
import godot.api.Skin
import godot.api.SkinReference
import godot.api.Sky
import godot.api.Slider
import godot.api.SliderJoint3D
import godot.api.SoftBody3D
import godot.api.SphereMesh
import godot.api.SphereOccluder3D
import godot.api.SphereShape3D
import godot.api.SpinBox
import godot.api.SplitContainer
import godot.api.SpotLight3D
import godot.api.SpringArm3D
import godot.api.SpringBoneCollision3D
import godot.api.SpringBoneCollisionCapsule3D
import godot.api.SpringBoneCollisionPlane3D
import godot.api.SpringBoneCollisionSphere3D
import godot.api.SpringBoneSimulator3D
import godot.api.Sprite2D
import godot.api.Sprite3D
import godot.api.SpriteBase3D
import godot.api.SpriteFrames
import godot.api.StandardMaterial3D
import godot.api.StaticBody2D
import godot.api.StaticBody3D
import godot.api.StatusIndicator
import godot.api.StreamPeer
import godot.api.StreamPeerBuffer
import godot.api.StreamPeerExtension
import godot.api.StreamPeerGZIP
import godot.api.StreamPeerTCP
import godot.api.StreamPeerTLS
import godot.api.StyleBox
import godot.api.StyleBoxEmpty
import godot.api.StyleBoxFlat
import godot.api.StyleBoxLine
import godot.api.StyleBoxTexture
import godot.api.SubViewport
import godot.api.SubViewportContainer
import godot.api.SubtweenTweener
import godot.api.SurfaceTool
import godot.api.SyntaxHighlighter
import godot.api.SystemFont
import godot.api.TCPServer
import godot.api.TLSOptions
import godot.api.TabBar
import godot.api.TabContainer
import godot.api.TextEdit
import godot.api.TextLine
import godot.api.TextMesh
import godot.api.TextParagraph
import godot.api.TextServer
import godot.api.TextServerAdvanced
import godot.api.TextServerDummy
import godot.api.TextServerExtension
import godot.api.TextServerManager
import godot.api.Texture
import godot.api.Texture2D
import godot.api.Texture2DArray
import godot.api.Texture2DArrayRD
import godot.api.Texture2DRD
import godot.api.Texture3D
import godot.api.Texture3DRD
import godot.api.TextureButton
import godot.api.TextureCubemapArrayRD
import godot.api.TextureCubemapRD
import godot.api.TextureLayered
import godot.api.TextureLayeredRD
import godot.api.TextureProgressBar
import godot.api.TextureRect
import godot.api.Theme
import godot.api.ThemeDB
import godot.api.Thread
import godot.api.TileData
import godot.api.TileMap
import godot.api.TileMapLayer
import godot.api.TileMapPattern
import godot.api.TileSet
import godot.api.TileSetAtlasSource
import godot.api.TileSetScenesCollectionSource
import godot.api.TileSetSource
import godot.api.Time
import godot.api.Timer
import godot.api.TorusMesh
import godot.api.TouchScreenButton
import godot.api.Translation
import godot.api.TranslationDomain
import godot.api.TranslationServer
import godot.api.Tree
import godot.api.TreeItem
import godot.api.TriangleMesh
import godot.api.TubeTrailMesh
import godot.api.Tween
import godot.api.Tweener
import godot.api.UDPServer
import godot.api.UPNP
import godot.api.UPNPDevice
import godot.api.UndoRedo
import godot.api.UniformSetCacheRD
import godot.api.VBoxContainer
import godot.api.VFlowContainer
import godot.api.VScrollBar
import godot.api.VSeparator
import godot.api.VSlider
import godot.api.VSplitContainer
import godot.api.VehicleBody3D
import godot.api.VehicleWheel3D
import godot.api.VideoStream
import godot.api.VideoStreamPlayback
import godot.api.VideoStreamPlayer
import godot.api.VideoStreamTheora
import godot.api.Viewport
import godot.api.ViewportTexture
import godot.api.VisibleOnScreenEnabler2D
import godot.api.VisibleOnScreenEnabler3D
import godot.api.VisibleOnScreenNotifier2D
import godot.api.VisibleOnScreenNotifier3D
import godot.api.VisualInstance3D
import godot.api.VisualShader
import godot.api.VisualShaderNode
import godot.api.VisualShaderNodeBillboard
import godot.api.VisualShaderNodeBooleanConstant
import godot.api.VisualShaderNodeBooleanParameter
import godot.api.VisualShaderNodeClamp
import godot.api.VisualShaderNodeColorConstant
import godot.api.VisualShaderNodeColorFunc
import godot.api.VisualShaderNodeColorOp
import godot.api.VisualShaderNodeColorParameter
import godot.api.VisualShaderNodeComment
import godot.api.VisualShaderNodeCompare
import godot.api.VisualShaderNodeConstant
import godot.api.VisualShaderNodeCubemap
import godot.api.VisualShaderNodeCubemapParameter
import godot.api.VisualShaderNodeCurveTexture
import godot.api.VisualShaderNodeCurveXYZTexture
import godot.api.VisualShaderNodeCustom
import godot.api.VisualShaderNodeDerivativeFunc
import godot.api.VisualShaderNodeDeterminant
import godot.api.VisualShaderNodeDistanceFade
import godot.api.VisualShaderNodeDotProduct
import godot.api.VisualShaderNodeExpression
import godot.api.VisualShaderNodeFaceForward
import godot.api.VisualShaderNodeFloatConstant
import godot.api.VisualShaderNodeFloatFunc
import godot.api.VisualShaderNodeFloatOp
import godot.api.VisualShaderNodeFloatParameter
import godot.api.VisualShaderNodeFrame
import godot.api.VisualShaderNodeFresnel
import godot.api.VisualShaderNodeGlobalExpression
import godot.api.VisualShaderNodeGroupBase
import godot.api.VisualShaderNodeIf
import godot.api.VisualShaderNodeInput
import godot.api.VisualShaderNodeIntConstant
import godot.api.VisualShaderNodeIntFunc
import godot.api.VisualShaderNodeIntOp
import godot.api.VisualShaderNodeIntParameter
import godot.api.VisualShaderNodeIs
import godot.api.VisualShaderNodeLinearSceneDepth
import godot.api.VisualShaderNodeMix
import godot.api.VisualShaderNodeMultiplyAdd
import godot.api.VisualShaderNodeOuterProduct
import godot.api.VisualShaderNodeOutput
import godot.api.VisualShaderNodeParameter
import godot.api.VisualShaderNodeParameterRef
import godot.api.VisualShaderNodeParticleAccelerator
import godot.api.VisualShaderNodeParticleBoxEmitter
import godot.api.VisualShaderNodeParticleConeVelocity
import godot.api.VisualShaderNodeParticleEmit
import godot.api.VisualShaderNodeParticleEmitter
import godot.api.VisualShaderNodeParticleMeshEmitter
import godot.api.VisualShaderNodeParticleMultiplyByAxisAngle
import godot.api.VisualShaderNodeParticleOutput
import godot.api.VisualShaderNodeParticleRandomness
import godot.api.VisualShaderNodeParticleRingEmitter
import godot.api.VisualShaderNodeParticleSphereEmitter
import godot.api.VisualShaderNodeProximityFade
import godot.api.VisualShaderNodeRandomRange
import godot.api.VisualShaderNodeRemap
import godot.api.VisualShaderNodeReroute
import godot.api.VisualShaderNodeResizableBase
import godot.api.VisualShaderNodeRotationByAxis
import godot.api.VisualShaderNodeSDFRaymarch
import godot.api.VisualShaderNodeSDFToScreenUV
import godot.api.VisualShaderNodeSample3D
import godot.api.VisualShaderNodeScreenNormalWorldSpace
import godot.api.VisualShaderNodeScreenUVToSDF
import godot.api.VisualShaderNodeSmoothStep
import godot.api.VisualShaderNodeStep
import godot.api.VisualShaderNodeSwitch
import godot.api.VisualShaderNodeTexture
import godot.api.VisualShaderNodeTexture2DArray
import godot.api.VisualShaderNodeTexture2DArrayParameter
import godot.api.VisualShaderNodeTexture2DParameter
import godot.api.VisualShaderNodeTexture3D
import godot.api.VisualShaderNodeTexture3DParameter
import godot.api.VisualShaderNodeTextureParameter
import godot.api.VisualShaderNodeTextureParameterTriplanar
import godot.api.VisualShaderNodeTextureSDF
import godot.api.VisualShaderNodeTextureSDFNormal
import godot.api.VisualShaderNodeTransformCompose
import godot.api.VisualShaderNodeTransformConstant
import godot.api.VisualShaderNodeTransformDecompose
import godot.api.VisualShaderNodeTransformFunc
import godot.api.VisualShaderNodeTransformOp
import godot.api.VisualShaderNodeTransformParameter
import godot.api.VisualShaderNodeTransformVecMult
import godot.api.VisualShaderNodeUIntConstant
import godot.api.VisualShaderNodeUIntFunc
import godot.api.VisualShaderNodeUIntOp
import godot.api.VisualShaderNodeUIntParameter
import godot.api.VisualShaderNodeUVFunc
import godot.api.VisualShaderNodeUVPolarCoord
import godot.api.VisualShaderNodeVarying
import godot.api.VisualShaderNodeVaryingGetter
import godot.api.VisualShaderNodeVaryingSetter
import godot.api.VisualShaderNodeVec2Constant
import godot.api.VisualShaderNodeVec2Parameter
import godot.api.VisualShaderNodeVec3Constant
import godot.api.VisualShaderNodeVec3Parameter
import godot.api.VisualShaderNodeVec4Constant
import godot.api.VisualShaderNodeVec4Parameter
import godot.api.VisualShaderNodeVectorBase
import godot.api.VisualShaderNodeVectorCompose
import godot.api.VisualShaderNodeVectorDecompose
import godot.api.VisualShaderNodeVectorDistance
import godot.api.VisualShaderNodeVectorFunc
import godot.api.VisualShaderNodeVectorLen
import godot.api.VisualShaderNodeVectorOp
import godot.api.VisualShaderNodeVectorRefract
import godot.api.VisualShaderNodeWorldPositionFromDepth
import godot.api.VoxelGI
import godot.api.VoxelGIData
import godot.api.WeakRef
import godot.api.WebRTCDataChannel
import godot.api.WebRTCDataChannelExtension
import godot.api.WebRTCMultiplayerPeer
import godot.api.WebRTCPeerConnection
import godot.api.WebRTCPeerConnectionExtension
import godot.api.WebSocketMultiplayerPeer
import godot.api.WebSocketPeer
import godot.api.WebXRInterface
import godot.api.Window
import godot.api.WorkerThreadPool
import godot.api.World2D
import godot.api.World3D
import godot.api.WorldBoundaryShape2D
import godot.api.WorldBoundaryShape3D
import godot.api.WorldEnvironment
import godot.api.X509Certificate
import godot.api.XMLParser
import godot.api.XRAnchor3D
import godot.api.XRBodyModifier3D
import godot.api.XRBodyTracker
import godot.api.XRCamera3D
import godot.api.XRController3D
import godot.api.XRControllerTracker
import godot.api.XRFaceModifier3D
import godot.api.XRFaceTracker
import godot.api.XRHandModifier3D
import godot.api.XRHandTracker
import godot.api.XRInterface
import godot.api.XRInterfaceExtension
import godot.api.XRNode3D
import godot.api.XROrigin3D
import godot.api.XRPose
import godot.api.XRPositionalTracker
import godot.api.XRServer
import godot.api.XRTracker
import godot.api.XRVRS
import godot.api.ZIPPacker
import godot.api.ZIPReader
import godot.core.VariantParser.OBJECT
import godot.core.variantMapper
import kotlin.Unit

public fun registerVariantMapping(): Unit {
  variantMapper[Object::class] = OBJECT
  variantMapper[RefCounted::class] = OBJECT
  variantMapper[AESContext::class] = OBJECT
  variantMapper[AStar2D::class] = OBJECT
  variantMapper[AStar3D::class] = OBJECT
  variantMapper[AStarGrid2D::class] = OBJECT
  variantMapper[AcceptDialog::class] = OBJECT
  variantMapper[AimModifier3D::class] = OBJECT
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
  variantMapper[AnimationNodeExtension::class] = OBJECT
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
  variantMapper[AudioServer::class] = OBJECT
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
  variantMapper[BoneConstraint3D::class] = OBJECT
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
  variantMapper[CameraServer::class] = OBJECT
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
  variantMapper[ClassDB::class] = OBJECT
  variantMapper[CodeEdit::class] = OBJECT
  variantMapper[CodeHighlighter::class] = OBJECT
  variantMapper[CollisionObject2D::class] = OBJECT
  variantMapper[CollisionObject3D::class] = OBJECT
  variantMapper[CollisionPolygon2D::class] = OBJECT
  variantMapper[CollisionPolygon3D::class] = OBJECT
  variantMapper[CollisionShape2D::class] = OBJECT
  variantMapper[CollisionShape3D::class] = OBJECT
  variantMapper[ColorPalette::class] = OBJECT
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
  variantMapper[ConvertTransformModifier3D::class] = OBJECT
  variantMapper[ConvexPolygonShape2D::class] = OBJECT
  variantMapper[ConvexPolygonShape3D::class] = OBJECT
  variantMapper[CopyTransformModifier3D::class] = OBJECT
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
  variantMapper[DPITexture::class] = OBJECT
  variantMapper[DTLSServer::class] = OBJECT
  variantMapper[DampedSpringJoint2D::class] = OBJECT
  variantMapper[Decal::class] = OBJECT
  variantMapper[DirAccess::class] = OBJECT
  variantMapper[DirectionalLight2D::class] = OBJECT
  variantMapper[DirectionalLight3D::class] = OBJECT
  variantMapper[DisplayServer::class] = OBJECT
  variantMapper[ENetConnection::class] = OBJECT
  variantMapper[ENetMultiplayerPeer::class] = OBJECT
  variantMapper[ENetPacketPeer::class] = OBJECT
  variantMapper[EncodedObjectAsID::class] = OBJECT
  variantMapper[Engine::class] = OBJECT
  variantMapper[EngineDebugger::class] = OBJECT
  variantMapper[EngineProfiler::class] = OBJECT
  variantMapper[Environment::class] = OBJECT
  variantMapper[Expression::class] = OBJECT
  variantMapper[ExternalTexture::class] = OBJECT
  variantMapper[FBXDocument::class] = OBJECT
  variantMapper[FBXState::class] = OBJECT
  variantMapper[FastNoiseLite::class] = OBJECT
  variantMapper[FileAccess::class] = OBJECT
  variantMapper[FileDialog::class] = OBJECT
  variantMapper[FlowContainer::class] = OBJECT
  variantMapper[FogMaterial::class] = OBJECT
  variantMapper[FogVolume::class] = OBJECT
  variantMapper[FoldableContainer::class] = OBJECT
  variantMapper[FoldableGroup::class] = OBJECT
  variantMapper[Font::class] = OBJECT
  variantMapper[FontFile::class] = OBJECT
  variantMapper[FontVariation::class] = OBJECT
  variantMapper[FramebufferCacheRD::class] = OBJECT
  variantMapper[GDExtension::class] = OBJECT
  variantMapper[GDExtensionManager::class] = OBJECT
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
  variantMapper[GLTFObjectModelProperty::class] = OBJECT
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
  variantMapper[Geometry2D::class] = OBJECT
  variantMapper[Geometry3D::class] = OBJECT
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
  variantMapper[IP::class] = OBJECT
  variantMapper[Image::class] = OBJECT
  variantMapper[ImageFormatLoader::class] = OBJECT
  variantMapper[ImageFormatLoaderExtension::class] = OBJECT
  variantMapper[ImageTexture::class] = OBJECT
  variantMapper[ImageTexture3D::class] = OBJECT
  variantMapper[ImageTextureLayered::class] = OBJECT
  variantMapper[ImmediateMesh::class] = OBJECT
  variantMapper[ImporterMesh::class] = OBJECT
  variantMapper[ImporterMeshInstance3D::class] = OBJECT
  variantMapper[Input::class] = OBJECT
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
  variantMapper[InputMap::class] = OBJECT
  variantMapper[InstancePlaceholder::class] = OBJECT
  variantMapper[IntervalTweener::class] = OBJECT
  variantMapper[ItemList::class] = OBJECT
  variantMapper[JNISingleton::class] = OBJECT
  variantMapper[JSON::class] = OBJECT
  variantMapper[JSONRPC::class] = OBJECT
  variantMapper[JavaClass::class] = OBJECT
  variantMapper[JavaClassWrapper::class] = OBJECT
  variantMapper[JavaObject::class] = OBJECT
  variantMapper[JavaScript::class] = OBJECT
  variantMapper[JavaScriptBridge::class] = OBJECT
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
  variantMapper[Logger::class] = OBJECT
  variantMapper[LookAtModifier3D::class] = OBJECT
  variantMapper[MainLoop::class] = OBJECT
  variantMapper[MarginContainer::class] = OBJECT
  variantMapper[Marker2D::class] = OBJECT
  variantMapper[Marker3D::class] = OBJECT
  variantMapper[Marshalls::class] = OBJECT
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
  variantMapper[ModifierBoneTarget3D::class] = OBJECT
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
  variantMapper[NativeMenu::class] = OBJECT
  variantMapper[NavigationAgent2D::class] = OBJECT
  variantMapper[NavigationAgent3D::class] = OBJECT
  variantMapper[NavigationLink2D::class] = OBJECT
  variantMapper[NavigationLink3D::class] = OBJECT
  variantMapper[NavigationMesh::class] = OBJECT
  variantMapper[NavigationMeshGenerator::class] = OBJECT
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
  variantMapper[NavigationServer2D::class] = OBJECT
  variantMapper[NavigationServer3D::class] = OBJECT
  variantMapper[NinePatchRect::class] = OBJECT
  variantMapper[Node::class] = OBJECT
  variantMapper[Node2D::class] = OBJECT
  variantMapper[Node3D::class] = OBJECT
  variantMapper[Node3DGizmo::class] = OBJECT
  variantMapper[Noise::class] = OBJECT
  variantMapper[NoiseTexture2D::class] = OBJECT
  variantMapper[NoiseTexture3D::class] = OBJECT
  variantMapper[ORMMaterial3D::class] = OBJECT
  variantMapper[OS::class] = OBJECT
  variantMapper[Occluder3D::class] = OBJECT
  variantMapper[OccluderInstance3D::class] = OBJECT
  variantMapper[OccluderPolygon2D::class] = OBJECT
  variantMapper[OfflineMultiplayerPeer::class] = OBJECT
  variantMapper[OggPacketSequence::class] = OBJECT
  variantMapper[OggPacketSequencePlayback::class] = OBJECT
  variantMapper[OmniLight3D::class] = OBJECT
  variantMapper[OpenXRAPIExtension::class] = OBJECT
  variantMapper[OpenXRAction::class] = OBJECT
  variantMapper[OpenXRActionBindingModifier::class] = OBJECT
  variantMapper[OpenXRActionMap::class] = OBJECT
  variantMapper[OpenXRActionSet::class] = OBJECT
  variantMapper[OpenXRAnalogThresholdModifier::class] = OBJECT
  variantMapper[OpenXRBindingModifier::class] = OBJECT
  variantMapper[OpenXRCompositionLayer::class] = OBJECT
  variantMapper[OpenXRCompositionLayerCylinder::class] = OBJECT
  variantMapper[OpenXRCompositionLayerEquirect::class] = OBJECT
  variantMapper[OpenXRCompositionLayerQuad::class] = OBJECT
  variantMapper[OpenXRDpadBindingModifier::class] = OBJECT
  variantMapper[OpenXRExtensionWrapper::class] = OBJECT
  variantMapper[OpenXRExtensionWrapperExtension::class] = OBJECT
  variantMapper[OpenXRFutureExtension::class] = OBJECT
  variantMapper[OpenXRFutureResult::class] = OBJECT
  variantMapper[OpenXRHand::class] = OBJECT
  variantMapper[OpenXRHapticBase::class] = OBJECT
  variantMapper[OpenXRHapticVibration::class] = OBJECT
  variantMapper[OpenXRIPBinding::class] = OBJECT
  variantMapper[OpenXRIPBindingModifier::class] = OBJECT
  variantMapper[OpenXRInteractionProfile::class] = OBJECT
  variantMapper[OpenXRInteractionProfileMetadata::class] = OBJECT
  variantMapper[OpenXRInterface::class] = OBJECT
  variantMapper[OpenXRRenderModel::class] = OBJECT
  variantMapper[OpenXRRenderModelExtension::class] = OBJECT
  variantMapper[OpenXRRenderModelManager::class] = OBJECT
  variantMapper[OpenXRVisibilityMask::class] = OBJECT
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
  variantMapper[Performance::class] = OBJECT
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
  variantMapper[PhysicsServer2D::class] = OBJECT
  variantMapper[PhysicsServer2DManager::class] = OBJECT
  variantMapper[PhysicsServer3D::class] = OBJECT
  variantMapper[PhysicsServer3DManager::class] = OBJECT
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
  variantMapper[ProjectSettings::class] = OBJECT
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
  variantMapper[RenderingServer::class] = OBJECT
  variantMapper[Resource::class] = OBJECT
  variantMapper[ResourceFormatLoader::class] = OBJECT
  variantMapper[ResourceFormatSaver::class] = OBJECT
  variantMapper[ResourceImporter::class] = OBJECT
  variantMapper[ResourceLoader::class] = OBJECT
  variantMapper[ResourcePreloader::class] = OBJECT
  variantMapper[ResourceSaver::class] = OBJECT
  variantMapper[ResourceUID::class] = OBJECT
  variantMapper[RetargetModifier3D::class] = OBJECT
  variantMapper[RibbonTrailMesh::class] = OBJECT
  variantMapper[RichTextEffect::class] = OBJECT
  variantMapper[RichTextLabel::class] = OBJECT
  variantMapper[RigidBody2D::class] = OBJECT
  variantMapper[RigidBody3D::class] = OBJECT
  variantMapper[RootMotionView::class] = OBJECT
  variantMapper[ScalaScript::class] = OBJECT
  variantMapper[SceneMultiplayer::class] = OBJECT
  variantMapper[SceneReplicationConfig::class] = OBJECT
  variantMapper[SceneState::class] = OBJECT
  variantMapper[SceneTree::class] = OBJECT
  variantMapper[SceneTreeTimer::class] = OBJECT
  variantMapper[Script::class] = OBJECT
  variantMapper[ScriptBacktrace::class] = OBJECT
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
  variantMapper[ShaderIncludeDB::class] = OBJECT
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
  variantMapper[SpringBoneCollision3D::class] = OBJECT
  variantMapper[SpringBoneCollisionCapsule3D::class] = OBJECT
  variantMapper[SpringBoneCollisionPlane3D::class] = OBJECT
  variantMapper[SpringBoneCollisionSphere3D::class] = OBJECT
  variantMapper[SpringBoneSimulator3D::class] = OBJECT
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
  variantMapper[SubtweenTweener::class] = OBJECT
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
  variantMapper[TextServerManager::class] = OBJECT
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
  variantMapper[ThemeDB::class] = OBJECT
  variantMapper[Thread::class] = OBJECT
  variantMapper[TileData::class] = OBJECT
  variantMapper[TileMap::class] = OBJECT
  variantMapper[TileMapLayer::class] = OBJECT
  variantMapper[TileMapPattern::class] = OBJECT
  variantMapper[TileSet::class] = OBJECT
  variantMapper[TileSetAtlasSource::class] = OBJECT
  variantMapper[TileSetScenesCollectionSource::class] = OBJECT
  variantMapper[TileSetSource::class] = OBJECT
  variantMapper[Time::class] = OBJECT
  variantMapper[Timer::class] = OBJECT
  variantMapper[TorusMesh::class] = OBJECT
  variantMapper[TouchScreenButton::class] = OBJECT
  variantMapper[Translation::class] = OBJECT
  variantMapper[TranslationDomain::class] = OBJECT
  variantMapper[TranslationServer::class] = OBJECT
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
  variantMapper[WorkerThreadPool::class] = OBJECT
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
  variantMapper[XRServer::class] = OBJECT
  variantMapper[XRTracker::class] = OBJECT
  variantMapper[XRVRS::class] = OBJECT
  variantMapper[ZIPPacker::class] = OBJECT
  variantMapper[ZIPReader::class] = OBJECT
}

public fun registerEngineTypeMethods(): Unit {
  Object.MethodBindings
  RefCounted.MethodBindings
  AESContext.MethodBindings
  AStar2D.MethodBindings
  AStar3D.MethodBindings
  AStarGrid2D.MethodBindings
  AcceptDialog.MethodBindings
  AimModifier3D.MethodBindings
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
  AnimationNodeExtension.MethodBindings
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
  AudioServer.MethodBindings
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
  BoneConstraint3D.MethodBindings
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
  CameraServer.MethodBindings
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
  ClassDB.MethodBindings
  CodeEdit.MethodBindings
  CodeHighlighter.MethodBindings
  CollisionObject2D.MethodBindings
  CollisionObject3D.MethodBindings
  CollisionPolygon2D.MethodBindings
  CollisionPolygon3D.MethodBindings
  CollisionShape2D.MethodBindings
  CollisionShape3D.MethodBindings
  ColorPalette.MethodBindings
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
  ConvertTransformModifier3D.MethodBindings
  ConvexPolygonShape2D.MethodBindings
  ConvexPolygonShape3D.MethodBindings
  CopyTransformModifier3D.MethodBindings
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
  DPITexture.MethodBindings
  DTLSServer.MethodBindings
  DampedSpringJoint2D.MethodBindings
  Decal.MethodBindings
  DirAccess.MethodBindings
  DirectionalLight2D.MethodBindings
  DirectionalLight3D.MethodBindings
  DisplayServer.MethodBindings
  ENetConnection.MethodBindings
  ENetMultiplayerPeer.MethodBindings
  ENetPacketPeer.MethodBindings
  EncodedObjectAsID.MethodBindings
  Engine.MethodBindings
  EngineDebugger.MethodBindings
  EngineProfiler.MethodBindings
  Environment.MethodBindings
  Expression.MethodBindings
  ExternalTexture.MethodBindings
  FBXDocument.MethodBindings
  FBXState.MethodBindings
  FastNoiseLite.MethodBindings
  FileAccess.MethodBindings
  FileDialog.MethodBindings
  FlowContainer.MethodBindings
  FogMaterial.MethodBindings
  FogVolume.MethodBindings
  FoldableContainer.MethodBindings
  FoldableGroup.MethodBindings
  Font.MethodBindings
  FontFile.MethodBindings
  FontVariation.MethodBindings
  FramebufferCacheRD.MethodBindings
  GDExtension.MethodBindings
  GDExtensionManager.MethodBindings
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
  GLTFObjectModelProperty.MethodBindings
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
  Geometry2D.MethodBindings
  Geometry3D.MethodBindings
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
  IP.MethodBindings
  Image.MethodBindings
  ImageFormatLoader.MethodBindings
  ImageFormatLoaderExtension.MethodBindings
  ImageTexture.MethodBindings
  ImageTexture3D.MethodBindings
  ImageTextureLayered.MethodBindings
  ImmediateMesh.MethodBindings
  ImporterMesh.MethodBindings
  ImporterMeshInstance3D.MethodBindings
  Input.MethodBindings
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
  InputMap.MethodBindings
  InstancePlaceholder.MethodBindings
  IntervalTweener.MethodBindings
  ItemList.MethodBindings
  JNISingleton.MethodBindings
  JSON.MethodBindings
  JSONRPC.MethodBindings
  JavaClass.MethodBindings
  JavaClassWrapper.MethodBindings
  JavaObject.MethodBindings
  JavaScript.MethodBindings
  JavaScriptBridge.MethodBindings
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
  Logger.MethodBindings
  LookAtModifier3D.MethodBindings
  MainLoop.MethodBindings
  MarginContainer.MethodBindings
  Marker2D.MethodBindings
  Marker3D.MethodBindings
  Marshalls.MethodBindings
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
  ModifierBoneTarget3D.MethodBindings
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
  NativeMenu.MethodBindings
  NavigationAgent2D.MethodBindings
  NavigationAgent3D.MethodBindings
  NavigationLink2D.MethodBindings
  NavigationLink3D.MethodBindings
  NavigationMesh.MethodBindings
  NavigationMeshGenerator.MethodBindings
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
  NavigationServer2D.MethodBindings
  NavigationServer3D.MethodBindings
  NinePatchRect.MethodBindings
  Node.MethodBindings
  Node2D.MethodBindings
  Node3D.MethodBindings
  Node3DGizmo.MethodBindings
  Noise.MethodBindings
  NoiseTexture2D.MethodBindings
  NoiseTexture3D.MethodBindings
  ORMMaterial3D.MethodBindings
  OS.MethodBindings
  Occluder3D.MethodBindings
  OccluderInstance3D.MethodBindings
  OccluderPolygon2D.MethodBindings
  OfflineMultiplayerPeer.MethodBindings
  OggPacketSequence.MethodBindings
  OggPacketSequencePlayback.MethodBindings
  OmniLight3D.MethodBindings
  OpenXRAPIExtension.MethodBindings
  OpenXRAction.MethodBindings
  OpenXRActionBindingModifier.MethodBindings
  OpenXRActionMap.MethodBindings
  OpenXRActionSet.MethodBindings
  OpenXRAnalogThresholdModifier.MethodBindings
  OpenXRBindingModifier.MethodBindings
  OpenXRCompositionLayer.MethodBindings
  OpenXRCompositionLayerCylinder.MethodBindings
  OpenXRCompositionLayerEquirect.MethodBindings
  OpenXRCompositionLayerQuad.MethodBindings
  OpenXRDpadBindingModifier.MethodBindings
  OpenXRExtensionWrapper.MethodBindings
  OpenXRExtensionWrapperExtension.MethodBindings
  OpenXRFutureExtension.MethodBindings
  OpenXRFutureResult.MethodBindings
  OpenXRHand.MethodBindings
  OpenXRHapticBase.MethodBindings
  OpenXRHapticVibration.MethodBindings
  OpenXRIPBinding.MethodBindings
  OpenXRIPBindingModifier.MethodBindings
  OpenXRInteractionProfile.MethodBindings
  OpenXRInteractionProfileMetadata.MethodBindings
  OpenXRInterface.MethodBindings
  OpenXRRenderModel.MethodBindings
  OpenXRRenderModelExtension.MethodBindings
  OpenXRRenderModelManager.MethodBindings
  OpenXRVisibilityMask.MethodBindings
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
  Performance.MethodBindings
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
  PhysicsServer2D.MethodBindings
  PhysicsServer2DManager.MethodBindings
  PhysicsServer3D.MethodBindings
  PhysicsServer3DManager.MethodBindings
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
  ProjectSettings.MethodBindings
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
  RenderingServer.MethodBindings
  Resource.MethodBindings
  ResourceFormatLoader.MethodBindings
  ResourceFormatSaver.MethodBindings
  ResourceImporter.MethodBindings
  ResourceLoader.MethodBindings
  ResourcePreloader.MethodBindings
  ResourceSaver.MethodBindings
  ResourceUID.MethodBindings
  RetargetModifier3D.MethodBindings
  RibbonTrailMesh.MethodBindings
  RichTextEffect.MethodBindings
  RichTextLabel.MethodBindings
  RigidBody2D.MethodBindings
  RigidBody3D.MethodBindings
  RootMotionView.MethodBindings
  ScalaScript.MethodBindings
  SceneMultiplayer.MethodBindings
  SceneReplicationConfig.MethodBindings
  SceneState.MethodBindings
  SceneTree.MethodBindings
  SceneTreeTimer.MethodBindings
  Script.MethodBindings
  ScriptBacktrace.MethodBindings
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
  ShaderIncludeDB.MethodBindings
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
  SpringBoneCollision3D.MethodBindings
  SpringBoneCollisionCapsule3D.MethodBindings
  SpringBoneCollisionPlane3D.MethodBindings
  SpringBoneCollisionSphere3D.MethodBindings
  SpringBoneSimulator3D.MethodBindings
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
  SubtweenTweener.MethodBindings
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
  TextServerManager.MethodBindings
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
  ThemeDB.MethodBindings
  Thread.MethodBindings
  TileData.MethodBindings
  TileMap.MethodBindings
  TileMapLayer.MethodBindings
  TileMapPattern.MethodBindings
  TileSet.MethodBindings
  TileSetAtlasSource.MethodBindings
  TileSetScenesCollectionSource.MethodBindings
  TileSetSource.MethodBindings
  Time.MethodBindings
  Timer.MethodBindings
  TorusMesh.MethodBindings
  TouchScreenButton.MethodBindings
  Translation.MethodBindings
  TranslationDomain.MethodBindings
  TranslationServer.MethodBindings
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
  WorkerThreadPool.MethodBindings
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
  XRServer.MethodBindings
  XRTracker.MethodBindings
  XRVRS.MethodBindings
  ZIPPacker.MethodBindings
  ZIPReader.MethodBindings
}

public fun registerEngineTypes(): Unit {
  TypeManager.registerEngineType("Object", Object::class, ::Object)
  TypeManager.registerEngineType("RefCounted", RefCounted::class, ::RefCounted)
  TypeManager.registerEngineType("AESContext", AESContext::class, ::AESContext)
  TypeManager.registerEngineType("AStar2D", AStar2D::class, ::AStar2D)
  TypeManager.registerEngineType("AStar3D", AStar3D::class, ::AStar3D)
  TypeManager.registerEngineType("AStarGrid2D", AStarGrid2D::class, ::AStarGrid2D)
  TypeManager.registerEngineType("AcceptDialog", AcceptDialog::class, ::AcceptDialog)
  TypeManager.registerEngineType("AimModifier3D", AimModifier3D::class, ::AimModifier3D)
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
  TypeManager.registerEngineType("AnimationNodeAnimation", AnimationNodeAnimation::class, ::AnimationNodeAnimation)
  TypeManager.registerEngineType("AnimationNodeBlend2", AnimationNodeBlend2::class, ::AnimationNodeBlend2)
  TypeManager.registerEngineType("AnimationNodeBlend3", AnimationNodeBlend3::class, ::AnimationNodeBlend3)
  TypeManager.registerEngineType("AnimationNodeBlendSpace1D", AnimationNodeBlendSpace1D::class, ::AnimationNodeBlendSpace1D)
  TypeManager.registerEngineType("AnimationNodeBlendSpace2D", AnimationNodeBlendSpace2D::class, ::AnimationNodeBlendSpace2D)
  TypeManager.registerEngineType("AnimationNodeBlendTree", AnimationNodeBlendTree::class, ::AnimationNodeBlendTree)
  TypeManager.registerEngineType("AnimationNodeExtension", AnimationNodeExtension::class, null)
  TypeManager.registerEngineType("AnimationNodeOneShot", AnimationNodeOneShot::class, ::AnimationNodeOneShot)
  TypeManager.registerEngineType("AnimationNodeOutput", AnimationNodeOutput::class, ::AnimationNodeOutput)
  TypeManager.registerEngineType("AnimationNodeStateMachine", AnimationNodeStateMachine::class, ::AnimationNodeStateMachine)
  TypeManager.registerEngineType("AnimationNodeStateMachinePlayback", AnimationNodeStateMachinePlayback::class, ::AnimationNodeStateMachinePlayback)
  TypeManager.registerEngineType("AnimationNodeStateMachineTransition", AnimationNodeStateMachineTransition::class, ::AnimationNodeStateMachineTransition)
  TypeManager.registerEngineType("AnimationNodeSub2", AnimationNodeSub2::class, ::AnimationNodeSub2)
  TypeManager.registerEngineType("AnimationNodeSync", AnimationNodeSync::class, ::AnimationNodeSync)
  TypeManager.registerEngineType("AnimationNodeTimeScale", AnimationNodeTimeScale::class, ::AnimationNodeTimeScale)
  TypeManager.registerEngineType("AnimationNodeTimeSeek", AnimationNodeTimeSeek::class, ::AnimationNodeTimeSeek)
  TypeManager.registerEngineType("AnimationNodeTransition", AnimationNodeTransition::class, ::AnimationNodeTransition)
  TypeManager.registerEngineType("AnimationPlayer", AnimationPlayer::class, ::AnimationPlayer)
  TypeManager.registerEngineType("AnimationRootNode", AnimationRootNode::class, ::AnimationRootNode)
  TypeManager.registerEngineType("AnimationTree", AnimationTree::class, ::AnimationTree)
  TypeManager.registerEngineType("Area2D", Area2D::class, ::Area2D)
  TypeManager.registerEngineType("Area3D", Area3D::class, ::Area3D)
  TypeManager.registerEngineType("ArrayMesh", ArrayMesh::class, ::ArrayMesh)
  TypeManager.registerEngineType("ArrayOccluder3D", ArrayOccluder3D::class, ::ArrayOccluder3D)
  TypeManager.registerEngineType("AspectRatioContainer", AspectRatioContainer::class, ::AspectRatioContainer)
  TypeManager.registerEngineType("AtlasTexture", AtlasTexture::class, ::AtlasTexture)
  TypeManager.registerEngineType("AudioBusLayout", AudioBusLayout::class, ::AudioBusLayout)
  TypeManager.registerEngineType("AudioEffect", AudioEffect::class, null)
  TypeManager.registerEngineType("AudioEffectAmplify", AudioEffectAmplify::class, ::AudioEffectAmplify)
  TypeManager.registerEngineType("AudioEffectBandLimitFilter", AudioEffectBandLimitFilter::class, ::AudioEffectBandLimitFilter)
  TypeManager.registerEngineType("AudioEffectBandPassFilter", AudioEffectBandPassFilter::class, ::AudioEffectBandPassFilter)
  TypeManager.registerEngineType("AudioEffectCapture", AudioEffectCapture::class, ::AudioEffectCapture)
  TypeManager.registerEngineType("AudioEffectChorus", AudioEffectChorus::class, ::AudioEffectChorus)
  TypeManager.registerEngineType("AudioEffectCompressor", AudioEffectCompressor::class, ::AudioEffectCompressor)
  TypeManager.registerEngineType("AudioEffectDelay", AudioEffectDelay::class, ::AudioEffectDelay)
  TypeManager.registerEngineType("AudioEffectDistortion", AudioEffectDistortion::class, ::AudioEffectDistortion)
  TypeManager.registerEngineType("AudioEffectEQ", AudioEffectEQ::class, ::AudioEffectEQ)
  TypeManager.registerEngineType("AudioEffectEQ10", AudioEffectEQ10::class, ::AudioEffectEQ10)
  TypeManager.registerEngineType("AudioEffectEQ21", AudioEffectEQ21::class, ::AudioEffectEQ21)
  TypeManager.registerEngineType("AudioEffectEQ6", AudioEffectEQ6::class, ::AudioEffectEQ6)
  TypeManager.registerEngineType("AudioEffectFilter", AudioEffectFilter::class, ::AudioEffectFilter)
  TypeManager.registerEngineType("AudioEffectHardLimiter", AudioEffectHardLimiter::class, ::AudioEffectHardLimiter)
  TypeManager.registerEngineType("AudioEffectHighPassFilter", AudioEffectHighPassFilter::class, ::AudioEffectHighPassFilter)
  TypeManager.registerEngineType("AudioEffectHighShelfFilter", AudioEffectHighShelfFilter::class, ::AudioEffectHighShelfFilter)
  TypeManager.registerEngineType("AudioEffectInstance", AudioEffectInstance::class, null)
  TypeManager.registerEngineType("AudioEffectLimiter", AudioEffectLimiter::class, ::AudioEffectLimiter)
  TypeManager.registerEngineType("AudioEffectLowPassFilter", AudioEffectLowPassFilter::class, ::AudioEffectLowPassFilter)
  TypeManager.registerEngineType("AudioEffectLowShelfFilter", AudioEffectLowShelfFilter::class, ::AudioEffectLowShelfFilter)
  TypeManager.registerEngineType("AudioEffectNotchFilter", AudioEffectNotchFilter::class, ::AudioEffectNotchFilter)
  TypeManager.registerEngineType("AudioEffectPanner", AudioEffectPanner::class, ::AudioEffectPanner)
  TypeManager.registerEngineType("AudioEffectPhaser", AudioEffectPhaser::class, ::AudioEffectPhaser)
  TypeManager.registerEngineType("AudioEffectPitchShift", AudioEffectPitchShift::class, ::AudioEffectPitchShift)
  TypeManager.registerEngineType("AudioEffectRecord", AudioEffectRecord::class, ::AudioEffectRecord)
  TypeManager.registerEngineType("AudioEffectReverb", AudioEffectReverb::class, ::AudioEffectReverb)
  TypeManager.registerEngineType("AudioEffectSpectrumAnalyzer", AudioEffectSpectrumAnalyzer::class, ::AudioEffectSpectrumAnalyzer)
  TypeManager.registerEngineType("AudioEffectSpectrumAnalyzerInstance", AudioEffectSpectrumAnalyzerInstance::class, ::AudioEffectSpectrumAnalyzerInstance)
  TypeManager.registerEngineType("AudioEffectStereoEnhance", AudioEffectStereoEnhance::class, ::AudioEffectStereoEnhance)
  TypeManager.registerEngineType("AudioListener2D", AudioListener2D::class, ::AudioListener2D)
  TypeManager.registerEngineType("AudioListener3D", AudioListener3D::class, ::AudioListener3D)
  TypeManager.registerEngineType("AudioSample", AudioSample::class, ::AudioSample)
  TypeManager.registerEngineType("AudioSamplePlayback", AudioSamplePlayback::class, ::AudioSamplePlayback)
  TypeManager.registerSingleton("AudioServer") { AudioServer }
  TypeManager.registerEngineType("AudioServer", AudioServer::class) { AudioServer }
  TypeManager.registerEngineType("AudioStream", AudioStream::class, ::AudioStream)
  TypeManager.registerEngineType("AudioStreamGenerator", AudioStreamGenerator::class, ::AudioStreamGenerator)
  TypeManager.registerEngineType("AudioStreamGeneratorPlayback", AudioStreamGeneratorPlayback::class, ::AudioStreamGeneratorPlayback)
  TypeManager.registerEngineType("AudioStreamInteractive", AudioStreamInteractive::class, ::AudioStreamInteractive)
  TypeManager.registerEngineType("AudioStreamMP3", AudioStreamMP3::class, ::AudioStreamMP3)
  TypeManager.registerEngineType("AudioStreamMicrophone", AudioStreamMicrophone::class, ::AudioStreamMicrophone)
  TypeManager.registerEngineType("AudioStreamOggVorbis", AudioStreamOggVorbis::class, ::AudioStreamOggVorbis)
  TypeManager.registerEngineType("AudioStreamPlayback", AudioStreamPlayback::class, null)
  TypeManager.registerEngineType("AudioStreamPlaybackInteractive", AudioStreamPlaybackInteractive::class, ::AudioStreamPlaybackInteractive)
  TypeManager.registerEngineType("AudioStreamPlaybackOggVorbis", AudioStreamPlaybackOggVorbis::class, ::AudioStreamPlaybackOggVorbis)
  TypeManager.registerEngineType("AudioStreamPlaybackPlaylist", AudioStreamPlaybackPlaylist::class, ::AudioStreamPlaybackPlaylist)
  TypeManager.registerEngineType("AudioStreamPlaybackPolyphonic", AudioStreamPlaybackPolyphonic::class, ::AudioStreamPlaybackPolyphonic)
  TypeManager.registerEngineType("AudioStreamPlaybackResampled", AudioStreamPlaybackResampled::class, null)
  TypeManager.registerEngineType("AudioStreamPlaybackSynchronized", AudioStreamPlaybackSynchronized::class, ::AudioStreamPlaybackSynchronized)
  TypeManager.registerEngineType("AudioStreamPlayer", AudioStreamPlayer::class, ::AudioStreamPlayer)
  TypeManager.registerEngineType("AudioStreamPlayer2D", AudioStreamPlayer2D::class, ::AudioStreamPlayer2D)
  TypeManager.registerEngineType("AudioStreamPlayer3D", AudioStreamPlayer3D::class, ::AudioStreamPlayer3D)
  TypeManager.registerEngineType("AudioStreamPlaylist", AudioStreamPlaylist::class, ::AudioStreamPlaylist)
  TypeManager.registerEngineType("AudioStreamPolyphonic", AudioStreamPolyphonic::class, ::AudioStreamPolyphonic)
  TypeManager.registerEngineType("AudioStreamRandomizer", AudioStreamRandomizer::class, ::AudioStreamRandomizer)
  TypeManager.registerEngineType("AudioStreamSynchronized", AudioStreamSynchronized::class, ::AudioStreamSynchronized)
  TypeManager.registerEngineType("AudioStreamWAV", AudioStreamWAV::class, ::AudioStreamWAV)
  TypeManager.registerEngineType("BackBufferCopy", BackBufferCopy::class, ::BackBufferCopy)
  TypeManager.registerEngineType("BaseButton", BaseButton::class, ::BaseButton)
  TypeManager.registerEngineType("BaseMaterial3D", BaseMaterial3D::class, ::BaseMaterial3D)
  TypeManager.registerEngineType("BitMap", BitMap::class, ::BitMap)
  TypeManager.registerEngineType("Bone2D", Bone2D::class, ::Bone2D)
  TypeManager.registerEngineType("BoneAttachment3D", BoneAttachment3D::class, ::BoneAttachment3D)
  TypeManager.registerEngineType("BoneConstraint3D", BoneConstraint3D::class, ::BoneConstraint3D)
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
  TypeManager.registerEngineType("CameraAttributesPhysical", CameraAttributesPhysical::class, ::CameraAttributesPhysical)
  TypeManager.registerEngineType("CameraAttributesPractical", CameraAttributesPractical::class, ::CameraAttributesPractical)
  TypeManager.registerEngineType("CameraFeed", CameraFeed::class, ::CameraFeed)
  TypeManager.registerSingleton("CameraServer") { CameraServer }
  TypeManager.registerEngineType("CameraServer", CameraServer::class) { CameraServer }
  TypeManager.registerEngineType("CameraTexture", CameraTexture::class, ::CameraTexture)
  TypeManager.registerEngineType("CanvasGroup", CanvasGroup::class, ::CanvasGroup)
  TypeManager.registerEngineType("CanvasItem", CanvasItem::class, ::CanvasItem)
  TypeManager.registerEngineType("CanvasItemMaterial", CanvasItemMaterial::class, ::CanvasItemMaterial)
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
  TypeManager.registerSingleton("ClassDB") { ClassDB }
  TypeManager.registerEngineType("ClassDB", ClassDB::class) { ClassDB }
  TypeManager.registerEngineType("CodeEdit", CodeEdit::class, ::CodeEdit)
  TypeManager.registerEngineType("CodeHighlighter", CodeHighlighter::class, ::CodeHighlighter)
  TypeManager.registerEngineType("CollisionObject2D", CollisionObject2D::class, ::CollisionObject2D)
  TypeManager.registerEngineType("CollisionObject3D", CollisionObject3D::class, ::CollisionObject3D)
  TypeManager.registerEngineType("CollisionPolygon2D", CollisionPolygon2D::class, ::CollisionPolygon2D)
  TypeManager.registerEngineType("CollisionPolygon3D", CollisionPolygon3D::class, ::CollisionPolygon3D)
  TypeManager.registerEngineType("CollisionShape2D", CollisionShape2D::class, ::CollisionShape2D)
  TypeManager.registerEngineType("CollisionShape3D", CollisionShape3D::class, ::CollisionShape3D)
  TypeManager.registerEngineType("ColorPalette", ColorPalette::class, ::ColorPalette)
  TypeManager.registerEngineType("ColorPicker", ColorPicker::class, ::ColorPicker)
  TypeManager.registerEngineType("ColorPickerButton", ColorPickerButton::class, ::ColorPickerButton)
  TypeManager.registerEngineType("ColorRect", ColorRect::class, ::ColorRect)
  TypeManager.registerEngineType("Compositor", Compositor::class, ::Compositor)
  TypeManager.registerEngineType("CompositorEffect", CompositorEffect::class, ::CompositorEffect)
  TypeManager.registerEngineType("CompressedCubemap", CompressedCubemap::class, ::CompressedCubemap)
  TypeManager.registerEngineType("CompressedCubemapArray", CompressedCubemapArray::class, ::CompressedCubemapArray)
  TypeManager.registerEngineType("CompressedTexture2D", CompressedTexture2D::class, ::CompressedTexture2D)
  TypeManager.registerEngineType("CompressedTexture2DArray", CompressedTexture2DArray::class, ::CompressedTexture2DArray)
  TypeManager.registerEngineType("CompressedTexture3D", CompressedTexture3D::class, ::CompressedTexture3D)
  TypeManager.registerEngineType("CompressedTextureLayered", CompressedTextureLayered::class, ::CompressedTextureLayered)
  TypeManager.registerEngineType("ConcavePolygonShape2D", ConcavePolygonShape2D::class, ::ConcavePolygonShape2D)
  TypeManager.registerEngineType("ConcavePolygonShape3D", ConcavePolygonShape3D::class, ::ConcavePolygonShape3D)
  TypeManager.registerEngineType("ConeTwistJoint3D", ConeTwistJoint3D::class, ::ConeTwistJoint3D)
  TypeManager.registerEngineType("ConfigFile", ConfigFile::class, ::ConfigFile)
  TypeManager.registerEngineType("ConfirmationDialog", ConfirmationDialog::class, ::ConfirmationDialog)
  TypeManager.registerEngineType("Container", Container::class, ::Container)
  TypeManager.registerEngineType("Control", Control::class, ::Control)
  TypeManager.registerEngineType("ConvertTransformModifier3D", ConvertTransformModifier3D::class, ::ConvertTransformModifier3D)
  TypeManager.registerEngineType("ConvexPolygonShape2D", ConvexPolygonShape2D::class, ::ConvexPolygonShape2D)
  TypeManager.registerEngineType("ConvexPolygonShape3D", ConvexPolygonShape3D::class, ::ConvexPolygonShape3D)
  TypeManager.registerEngineType("CopyTransformModifier3D", CopyTransformModifier3D::class, ::CopyTransformModifier3D)
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
  TypeManager.registerEngineType("DPITexture", DPITexture::class, ::DPITexture)
  TypeManager.registerEngineType("DTLSServer", DTLSServer::class, ::DTLSServer)
  TypeManager.registerEngineType("DampedSpringJoint2D", DampedSpringJoint2D::class, ::DampedSpringJoint2D)
  TypeManager.registerEngineType("Decal", Decal::class, ::Decal)
  TypeManager.registerEngineType("DirAccess", DirAccess::class, ::DirAccess)
  TypeManager.registerEngineType("DirectionalLight2D", DirectionalLight2D::class, ::DirectionalLight2D)
  TypeManager.registerEngineType("DirectionalLight3D", DirectionalLight3D::class, ::DirectionalLight3D)
  TypeManager.registerSingleton("DisplayServer") { DisplayServer }
  TypeManager.registerEngineType("DisplayServer", DisplayServer::class) { DisplayServer }
  TypeManager.registerEngineType("ENetConnection", ENetConnection::class, ::ENetConnection)
  TypeManager.registerEngineType("ENetMultiplayerPeer", ENetMultiplayerPeer::class, ::ENetMultiplayerPeer)
  TypeManager.registerEngineType("ENetPacketPeer", ENetPacketPeer::class, ::ENetPacketPeer)
  TypeManager.registerEngineType("EncodedObjectAsID", EncodedObjectAsID::class, ::EncodedObjectAsID)
  TypeManager.registerSingleton("Engine") { Engine }
  TypeManager.registerEngineType("Engine", Engine::class) { Engine }
  TypeManager.registerSingleton("EngineDebugger") { EngineDebugger }
  TypeManager.registerEngineType("EngineDebugger", EngineDebugger::class) { EngineDebugger }
  TypeManager.registerEngineType("EngineProfiler", EngineProfiler::class, ::EngineProfiler)
  TypeManager.registerEngineType("Environment", Environment::class, ::Environment)
  TypeManager.registerEngineType("Expression", Expression::class, ::Expression)
  TypeManager.registerEngineType("ExternalTexture", ExternalTexture::class, ::ExternalTexture)
  TypeManager.registerEngineType("FBXDocument", FBXDocument::class, ::FBXDocument)
  TypeManager.registerEngineType("FBXState", FBXState::class, ::FBXState)
  TypeManager.registerEngineType("FastNoiseLite", FastNoiseLite::class, ::FastNoiseLite)
  TypeManager.registerEngineType("FileAccess", FileAccess::class, ::FileAccess)
  TypeManager.registerEngineType("FileDialog", FileDialog::class, ::FileDialog)
  TypeManager.registerEngineType("FlowContainer", FlowContainer::class, ::FlowContainer)
  TypeManager.registerEngineType("FogMaterial", FogMaterial::class, ::FogMaterial)
  TypeManager.registerEngineType("FogVolume", FogVolume::class, ::FogVolume)
  TypeManager.registerEngineType("FoldableContainer", FoldableContainer::class, ::FoldableContainer)
  TypeManager.registerEngineType("FoldableGroup", FoldableGroup::class, ::FoldableGroup)
  TypeManager.registerEngineType("Font", Font::class, ::Font)
  TypeManager.registerEngineType("FontFile", FontFile::class, ::FontFile)
  TypeManager.registerEngineType("FontVariation", FontVariation::class, ::FontVariation)
  TypeManager.registerEngineType("FramebufferCacheRD", FramebufferCacheRD::class, ::FramebufferCacheRD)
  TypeManager.registerEngineType("GDExtension", GDExtension::class, ::GDExtension)
  TypeManager.registerSingleton("GDExtensionManager") { GDExtensionManager }
  TypeManager.registerEngineType("GDExtensionManager", GDExtensionManager::class) { GDExtensionManager }
  TypeManager.registerEngineType("GDScript", GDScript::class, ::GDScript)
  TypeManager.registerEngineType("GLTFAccessor", GLTFAccessor::class, ::GLTFAccessor)
  TypeManager.registerEngineType("GLTFAnimation", GLTFAnimation::class, ::GLTFAnimation)
  TypeManager.registerEngineType("GLTFBufferView", GLTFBufferView::class, ::GLTFBufferView)
  TypeManager.registerEngineType("GLTFCamera", GLTFCamera::class, ::GLTFCamera)
  TypeManager.registerEngineType("GLTFDocument", GLTFDocument::class, ::GLTFDocument)
  TypeManager.registerEngineType("GLTFDocumentExtension", GLTFDocumentExtension::class, ::GLTFDocumentExtension)
  TypeManager.registerEngineType("GLTFDocumentExtensionConvertImporterMesh", GLTFDocumentExtensionConvertImporterMesh::class, ::GLTFDocumentExtensionConvertImporterMesh)
  TypeManager.registerEngineType("GLTFLight", GLTFLight::class, ::GLTFLight)
  TypeManager.registerEngineType("GLTFMesh", GLTFMesh::class, ::GLTFMesh)
  TypeManager.registerEngineType("GLTFNode", GLTFNode::class, ::GLTFNode)
  TypeManager.registerEngineType("GLTFObjectModelProperty", GLTFObjectModelProperty::class, ::GLTFObjectModelProperty)
  TypeManager.registerEngineType("GLTFPhysicsBody", GLTFPhysicsBody::class, ::GLTFPhysicsBody)
  TypeManager.registerEngineType("GLTFPhysicsShape", GLTFPhysicsShape::class, ::GLTFPhysicsShape)
  TypeManager.registerEngineType("GLTFSkeleton", GLTFSkeleton::class, ::GLTFSkeleton)
  TypeManager.registerEngineType("GLTFSkin", GLTFSkin::class, ::GLTFSkin)
  TypeManager.registerEngineType("GLTFSpecGloss", GLTFSpecGloss::class, ::GLTFSpecGloss)
  TypeManager.registerEngineType("GLTFState", GLTFState::class, ::GLTFState)
  TypeManager.registerEngineType("GLTFTexture", GLTFTexture::class, ::GLTFTexture)
  TypeManager.registerEngineType("GLTFTextureSampler", GLTFTextureSampler::class, ::GLTFTextureSampler)
  TypeManager.registerEngineType("GPUParticles2D", GPUParticles2D::class, ::GPUParticles2D)
  TypeManager.registerEngineType("GPUParticles3D", GPUParticles3D::class, ::GPUParticles3D)
  TypeManager.registerEngineType("GPUParticlesAttractor3D", GPUParticlesAttractor3D::class, ::GPUParticlesAttractor3D)
  TypeManager.registerEngineType("GPUParticlesAttractorBox3D", GPUParticlesAttractorBox3D::class, ::GPUParticlesAttractorBox3D)
  TypeManager.registerEngineType("GPUParticlesAttractorSphere3D", GPUParticlesAttractorSphere3D::class, ::GPUParticlesAttractorSphere3D)
  TypeManager.registerEngineType("GPUParticlesAttractorVectorField3D", GPUParticlesAttractorVectorField3D::class, ::GPUParticlesAttractorVectorField3D)
  TypeManager.registerEngineType("GPUParticlesCollision3D", GPUParticlesCollision3D::class, ::GPUParticlesCollision3D)
  TypeManager.registerEngineType("GPUParticlesCollisionBox3D", GPUParticlesCollisionBox3D::class, ::GPUParticlesCollisionBox3D)
  TypeManager.registerEngineType("GPUParticlesCollisionHeightField3D", GPUParticlesCollisionHeightField3D::class, ::GPUParticlesCollisionHeightField3D)
  TypeManager.registerEngineType("GPUParticlesCollisionSDF3D", GPUParticlesCollisionSDF3D::class, ::GPUParticlesCollisionSDF3D)
  TypeManager.registerEngineType("GPUParticlesCollisionSphere3D", GPUParticlesCollisionSphere3D::class, ::GPUParticlesCollisionSphere3D)
  TypeManager.registerEngineType("GdjScript", GdjScript::class, ::GdjScript)
  TypeManager.registerEngineType("Generic6DOFJoint3D", Generic6DOFJoint3D::class, ::Generic6DOFJoint3D)
  TypeManager.registerSingleton("Geometry2D") { Geometry2D }
  TypeManager.registerEngineType("Geometry2D", Geometry2D::class) { Geometry2D }
  TypeManager.registerSingleton("Geometry3D") { Geometry3D }
  TypeManager.registerEngineType("Geometry3D", Geometry3D::class) { Geometry3D }
  TypeManager.registerEngineType("GeometryInstance3D", GeometryInstance3D::class, ::GeometryInstance3D)
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
  TypeManager.registerSingleton("IP") { IP }
  TypeManager.registerEngineType("IP", IP::class) { IP }
  TypeManager.registerEngineType("Image", Image::class, ::Image)
  TypeManager.registerEngineType("ImageFormatLoader", ImageFormatLoader::class, ::ImageFormatLoader)
  TypeManager.registerEngineType("ImageFormatLoaderExtension", ImageFormatLoaderExtension::class, ::ImageFormatLoaderExtension)
  TypeManager.registerEngineType("ImageTexture", ImageTexture::class, ::ImageTexture)
  TypeManager.registerEngineType("ImageTexture3D", ImageTexture3D::class, ::ImageTexture3D)
  TypeManager.registerEngineType("ImageTextureLayered", ImageTextureLayered::class, ::ImageTextureLayered)
  TypeManager.registerEngineType("ImmediateMesh", ImmediateMesh::class, ::ImmediateMesh)
  TypeManager.registerEngineType("ImporterMesh", ImporterMesh::class, ::ImporterMesh)
  TypeManager.registerEngineType("ImporterMeshInstance3D", ImporterMeshInstance3D::class, ::ImporterMeshInstance3D)
  TypeManager.registerSingleton("Input") { Input }
  TypeManager.registerEngineType("Input", Input::class) { Input }
  TypeManager.registerEngineType("InputEvent", InputEvent::class, ::InputEvent)
  TypeManager.registerEngineType("InputEventAction", InputEventAction::class, ::InputEventAction)
  TypeManager.registerEngineType("InputEventFromWindow", InputEventFromWindow::class, ::InputEventFromWindow)
  TypeManager.registerEngineType("InputEventGesture", InputEventGesture::class, ::InputEventGesture)
  TypeManager.registerEngineType("InputEventJoypadButton", InputEventJoypadButton::class, ::InputEventJoypadButton)
  TypeManager.registerEngineType("InputEventJoypadMotion", InputEventJoypadMotion::class, ::InputEventJoypadMotion)
  TypeManager.registerEngineType("InputEventKey", InputEventKey::class, ::InputEventKey)
  TypeManager.registerEngineType("InputEventMIDI", InputEventMIDI::class, ::InputEventMIDI)
  TypeManager.registerEngineType("InputEventMagnifyGesture", InputEventMagnifyGesture::class, ::InputEventMagnifyGesture)
  TypeManager.registerEngineType("InputEventMouse", InputEventMouse::class, ::InputEventMouse)
  TypeManager.registerEngineType("InputEventMouseButton", InputEventMouseButton::class, ::InputEventMouseButton)
  TypeManager.registerEngineType("InputEventMouseMotion", InputEventMouseMotion::class, ::InputEventMouseMotion)
  TypeManager.registerEngineType("InputEventPanGesture", InputEventPanGesture::class, ::InputEventPanGesture)
  TypeManager.registerEngineType("InputEventScreenDrag", InputEventScreenDrag::class, ::InputEventScreenDrag)
  TypeManager.registerEngineType("InputEventScreenTouch", InputEventScreenTouch::class, ::InputEventScreenTouch)
  TypeManager.registerEngineType("InputEventShortcut", InputEventShortcut::class, ::InputEventShortcut)
  TypeManager.registerEngineType("InputEventWithModifiers", InputEventWithModifiers::class, ::InputEventWithModifiers)
  TypeManager.registerSingleton("InputMap") { InputMap }
  TypeManager.registerEngineType("InputMap", InputMap::class) { InputMap }
  TypeManager.registerEngineType("InstancePlaceholder", InstancePlaceholder::class, ::InstancePlaceholder)
  TypeManager.registerEngineType("IntervalTweener", IntervalTweener::class, ::IntervalTweener)
  TypeManager.registerEngineType("ItemList", ItemList::class, ::ItemList)
  TypeManager.registerEngineType("JNISingleton", JNISingleton::class, ::JNISingleton)
  TypeManager.registerEngineType("JSON", JSON::class, ::JSON)
  TypeManager.registerEngineType("JSONRPC", JSONRPC::class, ::JSONRPC)
  TypeManager.registerEngineType("JavaClass", JavaClass::class, ::JavaClass)
  TypeManager.registerSingleton("JavaClassWrapper") { JavaClassWrapper }
  TypeManager.registerEngineType("JavaClassWrapper", JavaClassWrapper::class) { JavaClassWrapper }
  TypeManager.registerEngineType("JavaObject", JavaObject::class, ::JavaObject)
  TypeManager.registerEngineType("JavaScript", JavaScript::class, ::JavaScript)
  TypeManager.registerSingleton("JavaScriptBridge") { JavaScriptBridge }
  TypeManager.registerEngineType("JavaScriptBridge", JavaScriptBridge::class) { JavaScriptBridge }
  TypeManager.registerEngineType("JavaScriptObject", JavaScriptObject::class, ::JavaScriptObject)
  TypeManager.registerEngineType("Joint2D", Joint2D::class, ::Joint2D)
  TypeManager.registerEngineType("Joint3D", Joint3D::class, ::Joint3D)
  TypeManager.registerEngineType("JvmScript", JvmScript::class, ::JvmScript)
  TypeManager.registerEngineType("KinematicCollision2D", KinematicCollision2D::class, ::KinematicCollision2D)
  TypeManager.registerEngineType("KinematicCollision3D", KinematicCollision3D::class, ::KinematicCollision3D)
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
  TypeManager.registerEngineType("Logger", Logger::class, ::Logger)
  TypeManager.registerEngineType("LookAtModifier3D", LookAtModifier3D::class, ::LookAtModifier3D)
  TypeManager.registerEngineType("MainLoop", MainLoop::class, ::MainLoop)
  TypeManager.registerEngineType("MarginContainer", MarginContainer::class, ::MarginContainer)
  TypeManager.registerEngineType("Marker2D", Marker2D::class, ::Marker2D)
  TypeManager.registerEngineType("Marker3D", Marker3D::class, ::Marker3D)
  TypeManager.registerSingleton("Marshalls") { Marshalls }
  TypeManager.registerEngineType("Marshalls", Marshalls::class) { Marshalls }
  TypeManager.registerEngineType("Material", Material::class, null)
  TypeManager.registerEngineType("MenuBar", MenuBar::class, ::MenuBar)
  TypeManager.registerEngineType("MenuButton", MenuButton::class, ::MenuButton)
  TypeManager.registerEngineType("Mesh", Mesh::class, null)
  TypeManager.registerEngineType("MeshConvexDecompositionSettings", MeshConvexDecompositionSettings::class, ::MeshConvexDecompositionSettings)
  TypeManager.registerEngineType("MeshDataTool", MeshDataTool::class, ::MeshDataTool)
  TypeManager.registerEngineType("MeshInstance2D", MeshInstance2D::class, ::MeshInstance2D)
  TypeManager.registerEngineType("MeshInstance3D", MeshInstance3D::class, ::MeshInstance3D)
  TypeManager.registerEngineType("MeshLibrary", MeshLibrary::class, ::MeshLibrary)
  TypeManager.registerEngineType("MeshTexture", MeshTexture::class, ::MeshTexture)
  TypeManager.registerEngineType("MethodTweener", MethodTweener::class, ::MethodTweener)
  TypeManager.registerEngineType("MissingNode", MissingNode::class, ::MissingNode)
  TypeManager.registerEngineType("MissingResource", MissingResource::class, ::MissingResource)
  TypeManager.registerEngineType("MobileVRInterface", MobileVRInterface::class, ::MobileVRInterface)
  TypeManager.registerEngineType("ModifierBoneTarget3D", ModifierBoneTarget3D::class, ::ModifierBoneTarget3D)
  TypeManager.registerEngineType("MovieWriter", MovieWriter::class, null)
  TypeManager.registerEngineType("MultiMesh", MultiMesh::class, ::MultiMesh)
  TypeManager.registerEngineType("MultiMeshInstance2D", MultiMeshInstance2D::class, ::MultiMeshInstance2D)
  TypeManager.registerEngineType("MultiMeshInstance3D", MultiMeshInstance3D::class, ::MultiMeshInstance3D)
  TypeManager.registerEngineType("MultiplayerAPI", MultiplayerAPI::class, ::MultiplayerAPI)
  TypeManager.registerEngineType("MultiplayerAPIExtension", MultiplayerAPIExtension::class, ::MultiplayerAPIExtension)
  TypeManager.registerEngineType("MultiplayerPeer", MultiplayerPeer::class, ::MultiplayerPeer)
  TypeManager.registerEngineType("MultiplayerPeerExtension", MultiplayerPeerExtension::class, null)
  TypeManager.registerEngineType("MultiplayerSpawner", MultiplayerSpawner::class, ::MultiplayerSpawner)
  TypeManager.registerEngineType("MultiplayerSynchronizer", MultiplayerSynchronizer::class, ::MultiplayerSynchronizer)
  TypeManager.registerEngineType("Mutex", Mutex::class, ::Mutex)
  TypeManager.registerSingleton("NativeMenu") { NativeMenu }
  TypeManager.registerEngineType("NativeMenu", NativeMenu::class) { NativeMenu }
  TypeManager.registerEngineType("NavigationAgent2D", NavigationAgent2D::class, ::NavigationAgent2D)
  TypeManager.registerEngineType("NavigationAgent3D", NavigationAgent3D::class, ::NavigationAgent3D)
  TypeManager.registerEngineType("NavigationLink2D", NavigationLink2D::class, ::NavigationLink2D)
  TypeManager.registerEngineType("NavigationLink3D", NavigationLink3D::class, ::NavigationLink3D)
  TypeManager.registerEngineType("NavigationMesh", NavigationMesh::class, ::NavigationMesh)
  TypeManager.registerSingleton("NavigationMeshGenerator") { NavigationMeshGenerator }
  TypeManager.registerEngineType("NavigationMeshGenerator", NavigationMeshGenerator::class) { NavigationMeshGenerator }
  TypeManager.registerEngineType("NavigationMeshSourceGeometryData2D", NavigationMeshSourceGeometryData2D::class, ::NavigationMeshSourceGeometryData2D)
  TypeManager.registerEngineType("NavigationMeshSourceGeometryData3D", NavigationMeshSourceGeometryData3D::class, ::NavigationMeshSourceGeometryData3D)
  TypeManager.registerEngineType("NavigationObstacle2D", NavigationObstacle2D::class, ::NavigationObstacle2D)
  TypeManager.registerEngineType("NavigationObstacle3D", NavigationObstacle3D::class, ::NavigationObstacle3D)
  TypeManager.registerEngineType("NavigationPathQueryParameters2D", NavigationPathQueryParameters2D::class, ::NavigationPathQueryParameters2D)
  TypeManager.registerEngineType("NavigationPathQueryParameters3D", NavigationPathQueryParameters3D::class, ::NavigationPathQueryParameters3D)
  TypeManager.registerEngineType("NavigationPathQueryResult2D", NavigationPathQueryResult2D::class, ::NavigationPathQueryResult2D)
  TypeManager.registerEngineType("NavigationPathQueryResult3D", NavigationPathQueryResult3D::class, ::NavigationPathQueryResult3D)
  TypeManager.registerEngineType("NavigationPolygon", NavigationPolygon::class, ::NavigationPolygon)
  TypeManager.registerEngineType("NavigationRegion2D", NavigationRegion2D::class, ::NavigationRegion2D)
  TypeManager.registerEngineType("NavigationRegion3D", NavigationRegion3D::class, ::NavigationRegion3D)
  TypeManager.registerSingleton("NavigationServer2D") { NavigationServer2D }
  TypeManager.registerEngineType("NavigationServer2D", NavigationServer2D::class) { NavigationServer2D }
  TypeManager.registerSingleton("NavigationServer3D") { NavigationServer3D }
  TypeManager.registerEngineType("NavigationServer3D", NavigationServer3D::class) { NavigationServer3D }
  TypeManager.registerEngineType("NinePatchRect", NinePatchRect::class, ::NinePatchRect)
  TypeManager.registerEngineType("Node", Node::class, ::Node)
  TypeManager.registerEngineType("Node2D", Node2D::class, ::Node2D)
  TypeManager.registerEngineType("Node3D", Node3D::class, ::Node3D)
  TypeManager.registerEngineType("Node3DGizmo", Node3DGizmo::class, ::Node3DGizmo)
  TypeManager.registerEngineType("Noise", Noise::class, ::Noise)
  TypeManager.registerEngineType("NoiseTexture2D", NoiseTexture2D::class, ::NoiseTexture2D)
  TypeManager.registerEngineType("NoiseTexture3D", NoiseTexture3D::class, ::NoiseTexture3D)
  TypeManager.registerEngineType("ORMMaterial3D", ORMMaterial3D::class, ::ORMMaterial3D)
  TypeManager.registerSingleton("OS") { OS }
  TypeManager.registerEngineType("OS", OS::class) { OS }
  TypeManager.registerEngineType("Occluder3D", Occluder3D::class, ::Occluder3D)
  TypeManager.registerEngineType("OccluderInstance3D", OccluderInstance3D::class, ::OccluderInstance3D)
  TypeManager.registerEngineType("OccluderPolygon2D", OccluderPolygon2D::class, ::OccluderPolygon2D)
  TypeManager.registerEngineType("OfflineMultiplayerPeer", OfflineMultiplayerPeer::class, ::OfflineMultiplayerPeer)
  TypeManager.registerEngineType("OggPacketSequence", OggPacketSequence::class, ::OggPacketSequence)
  TypeManager.registerEngineType("OggPacketSequencePlayback", OggPacketSequencePlayback::class, ::OggPacketSequencePlayback)
  TypeManager.registerEngineType("OmniLight3D", OmniLight3D::class, ::OmniLight3D)
  TypeManager.registerEngineType("OpenXRAPIExtension", OpenXRAPIExtension::class, ::OpenXRAPIExtension)
  TypeManager.registerEngineType("OpenXRAction", OpenXRAction::class, ::OpenXRAction)
  TypeManager.registerEngineType("OpenXRActionBindingModifier", OpenXRActionBindingModifier::class, ::OpenXRActionBindingModifier)
  TypeManager.registerEngineType("OpenXRActionMap", OpenXRActionMap::class, ::OpenXRActionMap)
  TypeManager.registerEngineType("OpenXRActionSet", OpenXRActionSet::class, ::OpenXRActionSet)
  TypeManager.registerEngineType("OpenXRAnalogThresholdModifier", OpenXRAnalogThresholdModifier::class, ::OpenXRAnalogThresholdModifier)
  TypeManager.registerEngineType("OpenXRBindingModifier", OpenXRBindingModifier::class, null)
  TypeManager.registerEngineType("OpenXRCompositionLayer", OpenXRCompositionLayer::class, ::OpenXRCompositionLayer)
  TypeManager.registerEngineType("OpenXRCompositionLayerCylinder", OpenXRCompositionLayerCylinder::class, ::OpenXRCompositionLayerCylinder)
  TypeManager.registerEngineType("OpenXRCompositionLayerEquirect", OpenXRCompositionLayerEquirect::class, ::OpenXRCompositionLayerEquirect)
  TypeManager.registerEngineType("OpenXRCompositionLayerQuad", OpenXRCompositionLayerQuad::class, ::OpenXRCompositionLayerQuad)
  TypeManager.registerEngineType("OpenXRDpadBindingModifier", OpenXRDpadBindingModifier::class, ::OpenXRDpadBindingModifier)
  TypeManager.registerEngineType("OpenXRExtensionWrapper", OpenXRExtensionWrapper::class, ::OpenXRExtensionWrapper)
  TypeManager.registerEngineType("OpenXRExtensionWrapperExtension", OpenXRExtensionWrapperExtension::class, ::OpenXRExtensionWrapperExtension)
  TypeManager.registerEngineType("OpenXRFutureExtension", OpenXRFutureExtension::class, ::OpenXRFutureExtension)
  TypeManager.registerEngineType("OpenXRFutureResult", OpenXRFutureResult::class, ::OpenXRFutureResult)
  TypeManager.registerEngineType("OpenXRHand", OpenXRHand::class, ::OpenXRHand)
  TypeManager.registerEngineType("OpenXRHapticBase", OpenXRHapticBase::class, ::OpenXRHapticBase)
  TypeManager.registerEngineType("OpenXRHapticVibration", OpenXRHapticVibration::class, ::OpenXRHapticVibration)
  TypeManager.registerEngineType("OpenXRIPBinding", OpenXRIPBinding::class, ::OpenXRIPBinding)
  TypeManager.registerEngineType("OpenXRIPBindingModifier", OpenXRIPBindingModifier::class, ::OpenXRIPBindingModifier)
  TypeManager.registerEngineType("OpenXRInteractionProfile", OpenXRInteractionProfile::class, ::OpenXRInteractionProfile)
  TypeManager.registerEngineType("OpenXRInteractionProfileMetadata", OpenXRInteractionProfileMetadata::class, ::OpenXRInteractionProfileMetadata)
  TypeManager.registerEngineType("OpenXRInterface", OpenXRInterface::class, ::OpenXRInterface)
  TypeManager.registerEngineType("OpenXRRenderModel", OpenXRRenderModel::class, ::OpenXRRenderModel)
  TypeManager.registerEngineType("OpenXRRenderModelExtension", OpenXRRenderModelExtension::class, ::OpenXRRenderModelExtension)
  TypeManager.registerEngineType("OpenXRRenderModelManager", OpenXRRenderModelManager::class, ::OpenXRRenderModelManager)
  TypeManager.registerEngineType("OpenXRVisibilityMask", OpenXRVisibilityMask::class, ::OpenXRVisibilityMask)
  TypeManager.registerEngineType("OptimizedTranslation", OptimizedTranslation::class, ::OptimizedTranslation)
  TypeManager.registerEngineType("OptionButton", OptionButton::class, ::OptionButton)
  TypeManager.registerEngineType("PCKPacker", PCKPacker::class, ::PCKPacker)
  TypeManager.registerEngineType("PackedDataContainer", PackedDataContainer::class, ::PackedDataContainer)
  TypeManager.registerEngineType("PackedDataContainerRef", PackedDataContainerRef::class, ::PackedDataContainerRef)
  TypeManager.registerEngineType("PackedScene", PackedScene::class, ::PackedScene)
  TypeManager.registerEngineType("PacketPeer", PacketPeer::class, ::PacketPeer)
  TypeManager.registerEngineType("PacketPeerDTLS", PacketPeerDTLS::class, ::PacketPeerDTLS)
  TypeManager.registerEngineType("PacketPeerExtension", PacketPeerExtension::class, null)
  TypeManager.registerEngineType("PacketPeerStream", PacketPeerStream::class, ::PacketPeerStream)
  TypeManager.registerEngineType("PacketPeerUDP", PacketPeerUDP::class, ::PacketPeerUDP)
  TypeManager.registerEngineType("Panel", Panel::class, ::Panel)
  TypeManager.registerEngineType("PanelContainer", PanelContainer::class, ::PanelContainer)
  TypeManager.registerEngineType("PanoramaSkyMaterial", PanoramaSkyMaterial::class, ::PanoramaSkyMaterial)
  TypeManager.registerEngineType("Parallax2D", Parallax2D::class, ::Parallax2D)
  TypeManager.registerEngineType("ParallaxBackground", ParallaxBackground::class, ::ParallaxBackground)
  TypeManager.registerEngineType("ParallaxLayer", ParallaxLayer::class, ::ParallaxLayer)
  TypeManager.registerEngineType("ParticleProcessMaterial", ParticleProcessMaterial::class, ::ParticleProcessMaterial)
  TypeManager.registerEngineType("Path2D", Path2D::class, ::Path2D)
  TypeManager.registerEngineType("Path3D", Path3D::class, ::Path3D)
  TypeManager.registerEngineType("PathFollow2D", PathFollow2D::class, ::PathFollow2D)
  TypeManager.registerEngineType("PathFollow3D", PathFollow3D::class, ::PathFollow3D)
  TypeManager.registerSingleton("Performance") { Performance }
  TypeManager.registerEngineType("Performance", Performance::class) { Performance }
  TypeManager.registerEngineType("PhysicalBone2D", PhysicalBone2D::class, ::PhysicalBone2D)
  TypeManager.registerEngineType("PhysicalBone3D", PhysicalBone3D::class, ::PhysicalBone3D)
  TypeManager.registerEngineType("PhysicalBoneSimulator3D", PhysicalBoneSimulator3D::class, ::PhysicalBoneSimulator3D)
  TypeManager.registerEngineType("PhysicalSkyMaterial", PhysicalSkyMaterial::class, ::PhysicalSkyMaterial)
  TypeManager.registerEngineType("PhysicsBody2D", PhysicsBody2D::class, ::PhysicsBody2D)
  TypeManager.registerEngineType("PhysicsBody3D", PhysicsBody3D::class, ::PhysicsBody3D)
  TypeManager.registerEngineType("PhysicsDirectBodyState2D", PhysicsDirectBodyState2D::class, ::PhysicsDirectBodyState2D)
  TypeManager.registerEngineType("PhysicsDirectBodyState2DExtension", PhysicsDirectBodyState2DExtension::class, null)
  TypeManager.registerEngineType("PhysicsDirectBodyState3D", PhysicsDirectBodyState3D::class, ::PhysicsDirectBodyState3D)
  TypeManager.registerEngineType("PhysicsDirectBodyState3DExtension", PhysicsDirectBodyState3DExtension::class, null)
  TypeManager.registerEngineType("PhysicsDirectSpaceState2D", PhysicsDirectSpaceState2D::class, ::PhysicsDirectSpaceState2D)
  TypeManager.registerEngineType("PhysicsDirectSpaceState2DExtension", PhysicsDirectSpaceState2DExtension::class, null)
  TypeManager.registerEngineType("PhysicsDirectSpaceState3D", PhysicsDirectSpaceState3D::class, ::PhysicsDirectSpaceState3D)
  TypeManager.registerEngineType("PhysicsDirectSpaceState3DExtension", PhysicsDirectSpaceState3DExtension::class, null)
  TypeManager.registerEngineType("PhysicsMaterial", PhysicsMaterial::class, ::PhysicsMaterial)
  TypeManager.registerEngineType("PhysicsPointQueryParameters2D", PhysicsPointQueryParameters2D::class, ::PhysicsPointQueryParameters2D)
  TypeManager.registerEngineType("PhysicsPointQueryParameters3D", PhysicsPointQueryParameters3D::class, ::PhysicsPointQueryParameters3D)
  TypeManager.registerEngineType("PhysicsRayQueryParameters2D", PhysicsRayQueryParameters2D::class, ::PhysicsRayQueryParameters2D)
  TypeManager.registerEngineType("PhysicsRayQueryParameters3D", PhysicsRayQueryParameters3D::class, ::PhysicsRayQueryParameters3D)
  TypeManager.registerSingleton("PhysicsServer2D") { PhysicsServer2D }
  TypeManager.registerEngineType("PhysicsServer2D", PhysicsServer2D::class) { PhysicsServer2D }
  TypeManager.registerSingleton("PhysicsServer2DManager") { PhysicsServer2DManager }
  TypeManager.registerEngineType("PhysicsServer2DManager", PhysicsServer2DManager::class) { PhysicsServer2DManager }
  TypeManager.registerSingleton("PhysicsServer3D") { PhysicsServer3D }
  TypeManager.registerEngineType("PhysicsServer3D", PhysicsServer3D::class) { PhysicsServer3D }
  TypeManager.registerSingleton("PhysicsServer3DManager") { PhysicsServer3DManager }
  TypeManager.registerEngineType("PhysicsServer3DManager", PhysicsServer3DManager::class) { PhysicsServer3DManager }
  TypeManager.registerEngineType("PhysicsServer3DRenderingServerHandler", PhysicsServer3DRenderingServerHandler::class, null)
  TypeManager.registerEngineType("PhysicsShapeQueryParameters2D", PhysicsShapeQueryParameters2D::class, ::PhysicsShapeQueryParameters2D)
  TypeManager.registerEngineType("PhysicsShapeQueryParameters3D", PhysicsShapeQueryParameters3D::class, ::PhysicsShapeQueryParameters3D)
  TypeManager.registerEngineType("PhysicsTestMotionParameters2D", PhysicsTestMotionParameters2D::class, ::PhysicsTestMotionParameters2D)
  TypeManager.registerEngineType("PhysicsTestMotionParameters3D", PhysicsTestMotionParameters3D::class, ::PhysicsTestMotionParameters3D)
  TypeManager.registerEngineType("PhysicsTestMotionResult2D", PhysicsTestMotionResult2D::class, ::PhysicsTestMotionResult2D)
  TypeManager.registerEngineType("PhysicsTestMotionResult3D", PhysicsTestMotionResult3D::class, ::PhysicsTestMotionResult3D)
  TypeManager.registerEngineType("PinJoint2D", PinJoint2D::class, ::PinJoint2D)
  TypeManager.registerEngineType("PinJoint3D", PinJoint3D::class, ::PinJoint3D)
  TypeManager.registerEngineType("PlaceholderCubemap", PlaceholderCubemap::class, ::PlaceholderCubemap)
  TypeManager.registerEngineType("PlaceholderCubemapArray", PlaceholderCubemapArray::class, ::PlaceholderCubemapArray)
  TypeManager.registerEngineType("PlaceholderMaterial", PlaceholderMaterial::class, ::PlaceholderMaterial)
  TypeManager.registerEngineType("PlaceholderMesh", PlaceholderMesh::class, ::PlaceholderMesh)
  TypeManager.registerEngineType("PlaceholderTexture2D", PlaceholderTexture2D::class, ::PlaceholderTexture2D)
  TypeManager.registerEngineType("PlaceholderTexture2DArray", PlaceholderTexture2DArray::class, ::PlaceholderTexture2DArray)
  TypeManager.registerEngineType("PlaceholderTexture3D", PlaceholderTexture3D::class, ::PlaceholderTexture3D)
  TypeManager.registerEngineType("PlaceholderTextureLayered", PlaceholderTextureLayered::class, ::PlaceholderTextureLayered)
  TypeManager.registerEngineType("PlaneMesh", PlaneMesh::class, ::PlaneMesh)
  TypeManager.registerEngineType("PointLight2D", PointLight2D::class, ::PointLight2D)
  TypeManager.registerEngineType("PointMesh", PointMesh::class, ::PointMesh)
  TypeManager.registerEngineType("Polygon2D", Polygon2D::class, ::Polygon2D)
  TypeManager.registerEngineType("PolygonOccluder3D", PolygonOccluder3D::class, ::PolygonOccluder3D)
  TypeManager.registerEngineType("PolygonPathFinder", PolygonPathFinder::class, ::PolygonPathFinder)
  TypeManager.registerEngineType("Popup", Popup::class, ::Popup)
  TypeManager.registerEngineType("PopupMenu", PopupMenu::class, ::PopupMenu)
  TypeManager.registerEngineType("PopupPanel", PopupPanel::class, ::PopupPanel)
  TypeManager.registerEngineType("PortableCompressedTexture2D", PortableCompressedTexture2D::class, ::PortableCompressedTexture2D)
  TypeManager.registerEngineType("PrimitiveMesh", PrimitiveMesh::class, ::PrimitiveMesh)
  TypeManager.registerEngineType("PrismMesh", PrismMesh::class, ::PrismMesh)
  TypeManager.registerEngineType("ProceduralSkyMaterial", ProceduralSkyMaterial::class, ::ProceduralSkyMaterial)
  TypeManager.registerEngineType("ProgressBar", ProgressBar::class, ::ProgressBar)
  TypeManager.registerSingleton("ProjectSettings") { ProjectSettings }
  TypeManager.registerEngineType("ProjectSettings", ProjectSettings::class) { ProjectSettings }
  TypeManager.registerEngineType("PropertyTweener", PropertyTweener::class, ::PropertyTweener)
  TypeManager.registerEngineType("QuadMesh", QuadMesh::class, ::QuadMesh)
  TypeManager.registerEngineType("QuadOccluder3D", QuadOccluder3D::class, ::QuadOccluder3D)
  TypeManager.registerEngineType("RDAttachmentFormat", RDAttachmentFormat::class, ::RDAttachmentFormat)
  TypeManager.registerEngineType("RDFramebufferPass", RDFramebufferPass::class, ::RDFramebufferPass)
  TypeManager.registerEngineType("RDPipelineColorBlendState", RDPipelineColorBlendState::class, ::RDPipelineColorBlendState)
  TypeManager.registerEngineType("RDPipelineColorBlendStateAttachment", RDPipelineColorBlendStateAttachment::class, ::RDPipelineColorBlendStateAttachment)
  TypeManager.registerEngineType("RDPipelineDepthStencilState", RDPipelineDepthStencilState::class, ::RDPipelineDepthStencilState)
  TypeManager.registerEngineType("RDPipelineMultisampleState", RDPipelineMultisampleState::class, ::RDPipelineMultisampleState)
  TypeManager.registerEngineType("RDPipelineRasterizationState", RDPipelineRasterizationState::class, ::RDPipelineRasterizationState)
  TypeManager.registerEngineType("RDPipelineSpecializationConstant", RDPipelineSpecializationConstant::class, ::RDPipelineSpecializationConstant)
  TypeManager.registerEngineType("RDSamplerState", RDSamplerState::class, ::RDSamplerState)
  TypeManager.registerEngineType("RDShaderFile", RDShaderFile::class, ::RDShaderFile)
  TypeManager.registerEngineType("RDShaderSPIRV", RDShaderSPIRV::class, ::RDShaderSPIRV)
  TypeManager.registerEngineType("RDShaderSource", RDShaderSource::class, ::RDShaderSource)
  TypeManager.registerEngineType("RDTextureFormat", RDTextureFormat::class, ::RDTextureFormat)
  TypeManager.registerEngineType("RDTextureView", RDTextureView::class, ::RDTextureView)
  TypeManager.registerEngineType("RDUniform", RDUniform::class, ::RDUniform)
  TypeManager.registerEngineType("RDVertexAttribute", RDVertexAttribute::class, ::RDVertexAttribute)
  TypeManager.registerEngineType("RandomNumberGenerator", RandomNumberGenerator::class, ::RandomNumberGenerator)
  TypeManager.registerEngineType("Range", Range::class, ::Range)
  TypeManager.registerEngineType("RayCast2D", RayCast2D::class, ::RayCast2D)
  TypeManager.registerEngineType("RayCast3D", RayCast3D::class, ::RayCast3D)
  TypeManager.registerEngineType("RectangleShape2D", RectangleShape2D::class, ::RectangleShape2D)
  TypeManager.registerEngineType("ReferenceRect", ReferenceRect::class, ::ReferenceRect)
  TypeManager.registerEngineType("ReflectionProbe", ReflectionProbe::class, ::ReflectionProbe)
  TypeManager.registerEngineType("RegEx", RegEx::class, ::RegEx)
  TypeManager.registerEngineType("RegExMatch", RegExMatch::class, ::RegExMatch)
  TypeManager.registerEngineType("RemoteTransform2D", RemoteTransform2D::class, ::RemoteTransform2D)
  TypeManager.registerEngineType("RemoteTransform3D", RemoteTransform3D::class, ::RemoteTransform3D)
  TypeManager.registerEngineType("RenderData", RenderData::class, ::RenderData)
  TypeManager.registerEngineType("RenderDataExtension", RenderDataExtension::class, ::RenderDataExtension)
  TypeManager.registerEngineType("RenderDataRD", RenderDataRD::class, ::RenderDataRD)
  TypeManager.registerEngineType("RenderSceneBuffers", RenderSceneBuffers::class, ::RenderSceneBuffers)
  TypeManager.registerEngineType("RenderSceneBuffersConfiguration", RenderSceneBuffersConfiguration::class, ::RenderSceneBuffersConfiguration)
  TypeManager.registerEngineType("RenderSceneBuffersExtension", RenderSceneBuffersExtension::class, ::RenderSceneBuffersExtension)
  TypeManager.registerEngineType("RenderSceneBuffersRD", RenderSceneBuffersRD::class, ::RenderSceneBuffersRD)
  TypeManager.registerEngineType("RenderSceneData", RenderSceneData::class, ::RenderSceneData)
  TypeManager.registerEngineType("RenderSceneDataExtension", RenderSceneDataExtension::class, ::RenderSceneDataExtension)
  TypeManager.registerEngineType("RenderSceneDataRD", RenderSceneDataRD::class, ::RenderSceneDataRD)
  TypeManager.registerEngineType("RenderingDevice", RenderingDevice::class, ::RenderingDevice)
  TypeManager.registerSingleton("RenderingServer") { RenderingServer }
  TypeManager.registerEngineType("RenderingServer", RenderingServer::class) { RenderingServer }
  TypeManager.registerEngineType("Resource", Resource::class, ::Resource)
  TypeManager.registerEngineType("ResourceFormatLoader", ResourceFormatLoader::class, ::ResourceFormatLoader)
  TypeManager.registerEngineType("ResourceFormatSaver", ResourceFormatSaver::class, ::ResourceFormatSaver)
  TypeManager.registerEngineType("ResourceImporter", ResourceImporter::class, ::ResourceImporter)
  TypeManager.registerSingleton("ResourceLoader") { ResourceLoader }
  TypeManager.registerEngineType("ResourceLoader", ResourceLoader::class) { ResourceLoader }
  TypeManager.registerEngineType("ResourcePreloader", ResourcePreloader::class, ::ResourcePreloader)
  TypeManager.registerSingleton("ResourceSaver") { ResourceSaver }
  TypeManager.registerEngineType("ResourceSaver", ResourceSaver::class) { ResourceSaver }
  TypeManager.registerSingleton("ResourceUID") { ResourceUID }
  TypeManager.registerEngineType("ResourceUID", ResourceUID::class) { ResourceUID }
  TypeManager.registerEngineType("RetargetModifier3D", RetargetModifier3D::class, ::RetargetModifier3D)
  TypeManager.registerEngineType("RibbonTrailMesh", RibbonTrailMesh::class, ::RibbonTrailMesh)
  TypeManager.registerEngineType("RichTextEffect", RichTextEffect::class, ::RichTextEffect)
  TypeManager.registerEngineType("RichTextLabel", RichTextLabel::class, ::RichTextLabel)
  TypeManager.registerEngineType("RigidBody2D", RigidBody2D::class, ::RigidBody2D)
  TypeManager.registerEngineType("RigidBody3D", RigidBody3D::class, ::RigidBody3D)
  TypeManager.registerEngineType("RootMotionView", RootMotionView::class, ::RootMotionView)
  TypeManager.registerEngineType("ScalaScript", ScalaScript::class, ::ScalaScript)
  TypeManager.registerEngineType("SceneMultiplayer", SceneMultiplayer::class, ::SceneMultiplayer)
  TypeManager.registerEngineType("SceneReplicationConfig", SceneReplicationConfig::class, ::SceneReplicationConfig)
  TypeManager.registerEngineType("SceneState", SceneState::class, ::SceneState)
  TypeManager.registerEngineType("SceneTree", SceneTree::class, ::SceneTree)
  TypeManager.registerEngineType("SceneTreeTimer", SceneTreeTimer::class, ::SceneTreeTimer)
  TypeManager.registerEngineType("Script", Script::class, ::Script)
  TypeManager.registerEngineType("ScriptBacktrace", ScriptBacktrace::class, ::ScriptBacktrace)
  TypeManager.registerEngineType("ScriptExtension", ScriptExtension::class, null)
  TypeManager.registerEngineType("ScriptLanguage", ScriptLanguage::class, ::ScriptLanguage)
  TypeManager.registerEngineType("ScriptLanguageExtension", ScriptLanguageExtension::class, null)
  TypeManager.registerEngineType("ScrollBar", ScrollBar::class, ::ScrollBar)
  TypeManager.registerEngineType("ScrollContainer", ScrollContainer::class, ::ScrollContainer)
  TypeManager.registerEngineType("SegmentShape2D", SegmentShape2D::class, ::SegmentShape2D)
  TypeManager.registerEngineType("Semaphore", Semaphore::class, ::Semaphore)
  TypeManager.registerEngineType("SeparationRayShape2D", SeparationRayShape2D::class, ::SeparationRayShape2D)
  TypeManager.registerEngineType("SeparationRayShape3D", SeparationRayShape3D::class, ::SeparationRayShape3D)
  TypeManager.registerEngineType("Separator", Separator::class, ::Separator)
  TypeManager.registerEngineType("Shader", Shader::class, ::Shader)
  TypeManager.registerEngineType("ShaderGlobalsOverride", ShaderGlobalsOverride::class, ::ShaderGlobalsOverride)
  TypeManager.registerEngineType("ShaderInclude", ShaderInclude::class, ::ShaderInclude)
  TypeManager.registerEngineType("ShaderIncludeDB", ShaderIncludeDB::class, ::ShaderIncludeDB)
  TypeManager.registerEngineType("ShaderMaterial", ShaderMaterial::class, ::ShaderMaterial)
  TypeManager.registerEngineType("Shape2D", Shape2D::class, ::Shape2D)
  TypeManager.registerEngineType("Shape3D", Shape3D::class, ::Shape3D)
  TypeManager.registerEngineType("ShapeCast2D", ShapeCast2D::class, ::ShapeCast2D)
  TypeManager.registerEngineType("ShapeCast3D", ShapeCast3D::class, ::ShapeCast3D)
  TypeManager.registerEngineType("Shortcut", Shortcut::class, ::Shortcut)
  TypeManager.registerEngineType("Skeleton2D", Skeleton2D::class, ::Skeleton2D)
  TypeManager.registerEngineType("Skeleton3D", Skeleton3D::class, ::Skeleton3D)
  TypeManager.registerEngineType("SkeletonIK3D", SkeletonIK3D::class, ::SkeletonIK3D)
  TypeManager.registerEngineType("SkeletonModification2D", SkeletonModification2D::class, ::SkeletonModification2D)
  TypeManager.registerEngineType("SkeletonModification2DCCDIK", SkeletonModification2DCCDIK::class, ::SkeletonModification2DCCDIK)
  TypeManager.registerEngineType("SkeletonModification2DFABRIK", SkeletonModification2DFABRIK::class, ::SkeletonModification2DFABRIK)
  TypeManager.registerEngineType("SkeletonModification2DJiggle", SkeletonModification2DJiggle::class, ::SkeletonModification2DJiggle)
  TypeManager.registerEngineType("SkeletonModification2DLookAt", SkeletonModification2DLookAt::class, ::SkeletonModification2DLookAt)
  TypeManager.registerEngineType("SkeletonModification2DPhysicalBones", SkeletonModification2DPhysicalBones::class, ::SkeletonModification2DPhysicalBones)
  TypeManager.registerEngineType("SkeletonModification2DStackHolder", SkeletonModification2DStackHolder::class, ::SkeletonModification2DStackHolder)
  TypeManager.registerEngineType("SkeletonModification2DTwoBoneIK", SkeletonModification2DTwoBoneIK::class, ::SkeletonModification2DTwoBoneIK)
  TypeManager.registerEngineType("SkeletonModificationStack2D", SkeletonModificationStack2D::class, ::SkeletonModificationStack2D)
  TypeManager.registerEngineType("SkeletonModifier3D", SkeletonModifier3D::class, ::SkeletonModifier3D)
  TypeManager.registerEngineType("SkeletonProfile", SkeletonProfile::class, ::SkeletonProfile)
  TypeManager.registerEngineType("SkeletonProfileHumanoid", SkeletonProfileHumanoid::class, ::SkeletonProfileHumanoid)
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
  TypeManager.registerEngineType("SpringBoneCollision3D", SpringBoneCollision3D::class, ::SpringBoneCollision3D)
  TypeManager.registerEngineType("SpringBoneCollisionCapsule3D", SpringBoneCollisionCapsule3D::class, ::SpringBoneCollisionCapsule3D)
  TypeManager.registerEngineType("SpringBoneCollisionPlane3D", SpringBoneCollisionPlane3D::class, ::SpringBoneCollisionPlane3D)
  TypeManager.registerEngineType("SpringBoneCollisionSphere3D", SpringBoneCollisionSphere3D::class, ::SpringBoneCollisionSphere3D)
  TypeManager.registerEngineType("SpringBoneSimulator3D", SpringBoneSimulator3D::class, ::SpringBoneSimulator3D)
  TypeManager.registerEngineType("Sprite2D", Sprite2D::class, ::Sprite2D)
  TypeManager.registerEngineType("Sprite3D", Sprite3D::class, ::Sprite3D)
  TypeManager.registerEngineType("SpriteBase3D", SpriteBase3D::class, ::SpriteBase3D)
  TypeManager.registerEngineType("SpriteFrames", SpriteFrames::class, ::SpriteFrames)
  TypeManager.registerEngineType("StandardMaterial3D", StandardMaterial3D::class, ::StandardMaterial3D)
  TypeManager.registerEngineType("StaticBody2D", StaticBody2D::class, ::StaticBody2D)
  TypeManager.registerEngineType("StaticBody3D", StaticBody3D::class, ::StaticBody3D)
  TypeManager.registerEngineType("StatusIndicator", StatusIndicator::class, ::StatusIndicator)
  TypeManager.registerEngineType("StreamPeer", StreamPeer::class, ::StreamPeer)
  TypeManager.registerEngineType("StreamPeerBuffer", StreamPeerBuffer::class, ::StreamPeerBuffer)
  TypeManager.registerEngineType("StreamPeerExtension", StreamPeerExtension::class, null)
  TypeManager.registerEngineType("StreamPeerGZIP", StreamPeerGZIP::class, ::StreamPeerGZIP)
  TypeManager.registerEngineType("StreamPeerTCP", StreamPeerTCP::class, ::StreamPeerTCP)
  TypeManager.registerEngineType("StreamPeerTLS", StreamPeerTLS::class, ::StreamPeerTLS)
  TypeManager.registerEngineType("StyleBox", StyleBox::class, null)
  TypeManager.registerEngineType("StyleBoxEmpty", StyleBoxEmpty::class, ::StyleBoxEmpty)
  TypeManager.registerEngineType("StyleBoxFlat", StyleBoxFlat::class, ::StyleBoxFlat)
  TypeManager.registerEngineType("StyleBoxLine", StyleBoxLine::class, ::StyleBoxLine)
  TypeManager.registerEngineType("StyleBoxTexture", StyleBoxTexture::class, ::StyleBoxTexture)
  TypeManager.registerEngineType("SubViewport", SubViewport::class, ::SubViewport)
  TypeManager.registerEngineType("SubViewportContainer", SubViewportContainer::class, ::SubViewportContainer)
  TypeManager.registerEngineType("SubtweenTweener", SubtweenTweener::class, ::SubtweenTweener)
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
  TypeManager.registerEngineType("TextServerAdvanced", TextServerAdvanced::class, ::TextServerAdvanced)
  TypeManager.registerEngineType("TextServerDummy", TextServerDummy::class, ::TextServerDummy)
  TypeManager.registerEngineType("TextServerExtension", TextServerExtension::class, null)
  TypeManager.registerSingleton("TextServerManager") { TextServerManager }
  TypeManager.registerEngineType("TextServerManager", TextServerManager::class) { TextServerManager }
  TypeManager.registerEngineType("Texture", Texture::class, ::Texture)
  TypeManager.registerEngineType("Texture2D", Texture2D::class, null)
  TypeManager.registerEngineType("Texture2DArray", Texture2DArray::class, ::Texture2DArray)
  TypeManager.registerEngineType("Texture2DArrayRD", Texture2DArrayRD::class, ::Texture2DArrayRD)
  TypeManager.registerEngineType("Texture2DRD", Texture2DRD::class, ::Texture2DRD)
  TypeManager.registerEngineType("Texture3D", Texture3D::class, null)
  TypeManager.registerEngineType("Texture3DRD", Texture3DRD::class, ::Texture3DRD)
  TypeManager.registerEngineType("TextureButton", TextureButton::class, ::TextureButton)
  TypeManager.registerEngineType("TextureCubemapArrayRD", TextureCubemapArrayRD::class, ::TextureCubemapArrayRD)
  TypeManager.registerEngineType("TextureCubemapRD", TextureCubemapRD::class, ::TextureCubemapRD)
  TypeManager.registerEngineType("TextureLayered", TextureLayered::class, null)
  TypeManager.registerEngineType("TextureLayeredRD", TextureLayeredRD::class, ::TextureLayeredRD)
  TypeManager.registerEngineType("TextureProgressBar", TextureProgressBar::class, ::TextureProgressBar)
  TypeManager.registerEngineType("TextureRect", TextureRect::class, ::TextureRect)
  TypeManager.registerEngineType("Theme", Theme::class, ::Theme)
  TypeManager.registerSingleton("ThemeDB") { ThemeDB }
  TypeManager.registerEngineType("ThemeDB", ThemeDB::class) { ThemeDB }
  TypeManager.registerEngineType("Thread", Thread::class, ::Thread)
  TypeManager.registerEngineType("TileData", TileData::class, ::TileData)
  TypeManager.registerEngineType("TileMap", TileMap::class, ::TileMap)
  TypeManager.registerEngineType("TileMapLayer", TileMapLayer::class, ::TileMapLayer)
  TypeManager.registerEngineType("TileMapPattern", TileMapPattern::class, ::TileMapPattern)
  TypeManager.registerEngineType("TileSet", TileSet::class, ::TileSet)
  TypeManager.registerEngineType("TileSetAtlasSource", TileSetAtlasSource::class, ::TileSetAtlasSource)
  TypeManager.registerEngineType("TileSetScenesCollectionSource", TileSetScenesCollectionSource::class, ::TileSetScenesCollectionSource)
  TypeManager.registerEngineType("TileSetSource", TileSetSource::class, ::TileSetSource)
  TypeManager.registerSingleton("Time") { Time }
  TypeManager.registerEngineType("Time", Time::class) { Time }
  TypeManager.registerEngineType("Timer", Timer::class, ::Timer)
  TypeManager.registerEngineType("TorusMesh", TorusMesh::class, ::TorusMesh)
  TypeManager.registerEngineType("TouchScreenButton", TouchScreenButton::class, ::TouchScreenButton)
  TypeManager.registerEngineType("Translation", Translation::class, ::Translation)
  TypeManager.registerEngineType("TranslationDomain", TranslationDomain::class, ::TranslationDomain)
  TypeManager.registerSingleton("TranslationServer") { TranslationServer }
  TypeManager.registerEngineType("TranslationServer", TranslationServer::class) { TranslationServer }
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
  TypeManager.registerEngineType("VideoStreamPlayback", VideoStreamPlayback::class, null)
  TypeManager.registerEngineType("VideoStreamPlayer", VideoStreamPlayer::class, ::VideoStreamPlayer)
  TypeManager.registerEngineType("VideoStreamTheora", VideoStreamTheora::class, ::VideoStreamTheora)
  TypeManager.registerEngineType("Viewport", Viewport::class, ::Viewport)
  TypeManager.registerEngineType("ViewportTexture", ViewportTexture::class, ::ViewportTexture)
  TypeManager.registerEngineType("VisibleOnScreenEnabler2D", VisibleOnScreenEnabler2D::class, ::VisibleOnScreenEnabler2D)
  TypeManager.registerEngineType("VisibleOnScreenEnabler3D", VisibleOnScreenEnabler3D::class, ::VisibleOnScreenEnabler3D)
  TypeManager.registerEngineType("VisibleOnScreenNotifier2D", VisibleOnScreenNotifier2D::class, ::VisibleOnScreenNotifier2D)
  TypeManager.registerEngineType("VisibleOnScreenNotifier3D", VisibleOnScreenNotifier3D::class, ::VisibleOnScreenNotifier3D)
  TypeManager.registerEngineType("VisualInstance3D", VisualInstance3D::class, ::VisualInstance3D)
  TypeManager.registerEngineType("VisualShader", VisualShader::class, ::VisualShader)
  TypeManager.registerEngineType("VisualShaderNode", VisualShaderNode::class, ::VisualShaderNode)
  TypeManager.registerEngineType("VisualShaderNodeBillboard", VisualShaderNodeBillboard::class, ::VisualShaderNodeBillboard)
  TypeManager.registerEngineType("VisualShaderNodeBooleanConstant", VisualShaderNodeBooleanConstant::class, ::VisualShaderNodeBooleanConstant)
  TypeManager.registerEngineType("VisualShaderNodeBooleanParameter", VisualShaderNodeBooleanParameter::class, ::VisualShaderNodeBooleanParameter)
  TypeManager.registerEngineType("VisualShaderNodeClamp", VisualShaderNodeClamp::class, ::VisualShaderNodeClamp)
  TypeManager.registerEngineType("VisualShaderNodeColorConstant", VisualShaderNodeColorConstant::class, ::VisualShaderNodeColorConstant)
  TypeManager.registerEngineType("VisualShaderNodeColorFunc", VisualShaderNodeColorFunc::class, ::VisualShaderNodeColorFunc)
  TypeManager.registerEngineType("VisualShaderNodeColorOp", VisualShaderNodeColorOp::class, ::VisualShaderNodeColorOp)
  TypeManager.registerEngineType("VisualShaderNodeColorParameter", VisualShaderNodeColorParameter::class, ::VisualShaderNodeColorParameter)
  TypeManager.registerEngineType("VisualShaderNodeComment", VisualShaderNodeComment::class, ::VisualShaderNodeComment)
  TypeManager.registerEngineType("VisualShaderNodeCompare", VisualShaderNodeCompare::class, ::VisualShaderNodeCompare)
  TypeManager.registerEngineType("VisualShaderNodeConstant", VisualShaderNodeConstant::class, ::VisualShaderNodeConstant)
  TypeManager.registerEngineType("VisualShaderNodeCubemap", VisualShaderNodeCubemap::class, ::VisualShaderNodeCubemap)
  TypeManager.registerEngineType("VisualShaderNodeCubemapParameter", VisualShaderNodeCubemapParameter::class, ::VisualShaderNodeCubemapParameter)
  TypeManager.registerEngineType("VisualShaderNodeCurveTexture", VisualShaderNodeCurveTexture::class, ::VisualShaderNodeCurveTexture)
  TypeManager.registerEngineType("VisualShaderNodeCurveXYZTexture", VisualShaderNodeCurveXYZTexture::class, ::VisualShaderNodeCurveXYZTexture)
  TypeManager.registerEngineType("VisualShaderNodeCustom", VisualShaderNodeCustom::class, ::VisualShaderNodeCustom)
  TypeManager.registerEngineType("VisualShaderNodeDerivativeFunc", VisualShaderNodeDerivativeFunc::class, ::VisualShaderNodeDerivativeFunc)
  TypeManager.registerEngineType("VisualShaderNodeDeterminant", VisualShaderNodeDeterminant::class, ::VisualShaderNodeDeterminant)
  TypeManager.registerEngineType("VisualShaderNodeDistanceFade", VisualShaderNodeDistanceFade::class, ::VisualShaderNodeDistanceFade)
  TypeManager.registerEngineType("VisualShaderNodeDotProduct", VisualShaderNodeDotProduct::class, ::VisualShaderNodeDotProduct)
  TypeManager.registerEngineType("VisualShaderNodeExpression", VisualShaderNodeExpression::class, ::VisualShaderNodeExpression)
  TypeManager.registerEngineType("VisualShaderNodeFaceForward", VisualShaderNodeFaceForward::class, ::VisualShaderNodeFaceForward)
  TypeManager.registerEngineType("VisualShaderNodeFloatConstant", VisualShaderNodeFloatConstant::class, ::VisualShaderNodeFloatConstant)
  TypeManager.registerEngineType("VisualShaderNodeFloatFunc", VisualShaderNodeFloatFunc::class, ::VisualShaderNodeFloatFunc)
  TypeManager.registerEngineType("VisualShaderNodeFloatOp", VisualShaderNodeFloatOp::class, ::VisualShaderNodeFloatOp)
  TypeManager.registerEngineType("VisualShaderNodeFloatParameter", VisualShaderNodeFloatParameter::class, ::VisualShaderNodeFloatParameter)
  TypeManager.registerEngineType("VisualShaderNodeFrame", VisualShaderNodeFrame::class, ::VisualShaderNodeFrame)
  TypeManager.registerEngineType("VisualShaderNodeFresnel", VisualShaderNodeFresnel::class, ::VisualShaderNodeFresnel)
  TypeManager.registerEngineType("VisualShaderNodeGlobalExpression", VisualShaderNodeGlobalExpression::class, ::VisualShaderNodeGlobalExpression)
  TypeManager.registerEngineType("VisualShaderNodeGroupBase", VisualShaderNodeGroupBase::class, ::VisualShaderNodeGroupBase)
  TypeManager.registerEngineType("VisualShaderNodeIf", VisualShaderNodeIf::class, ::VisualShaderNodeIf)
  TypeManager.registerEngineType("VisualShaderNodeInput", VisualShaderNodeInput::class, ::VisualShaderNodeInput)
  TypeManager.registerEngineType("VisualShaderNodeIntConstant", VisualShaderNodeIntConstant::class, ::VisualShaderNodeIntConstant)
  TypeManager.registerEngineType("VisualShaderNodeIntFunc", VisualShaderNodeIntFunc::class, ::VisualShaderNodeIntFunc)
  TypeManager.registerEngineType("VisualShaderNodeIntOp", VisualShaderNodeIntOp::class, ::VisualShaderNodeIntOp)
  TypeManager.registerEngineType("VisualShaderNodeIntParameter", VisualShaderNodeIntParameter::class, ::VisualShaderNodeIntParameter)
  TypeManager.registerEngineType("VisualShaderNodeIs", VisualShaderNodeIs::class, ::VisualShaderNodeIs)
  TypeManager.registerEngineType("VisualShaderNodeLinearSceneDepth", VisualShaderNodeLinearSceneDepth::class, ::VisualShaderNodeLinearSceneDepth)
  TypeManager.registerEngineType("VisualShaderNodeMix", VisualShaderNodeMix::class, ::VisualShaderNodeMix)
  TypeManager.registerEngineType("VisualShaderNodeMultiplyAdd", VisualShaderNodeMultiplyAdd::class, ::VisualShaderNodeMultiplyAdd)
  TypeManager.registerEngineType("VisualShaderNodeOuterProduct", VisualShaderNodeOuterProduct::class, ::VisualShaderNodeOuterProduct)
  TypeManager.registerEngineType("VisualShaderNodeOutput", VisualShaderNodeOutput::class, ::VisualShaderNodeOutput)
  TypeManager.registerEngineType("VisualShaderNodeParameter", VisualShaderNodeParameter::class, ::VisualShaderNodeParameter)
  TypeManager.registerEngineType("VisualShaderNodeParameterRef", VisualShaderNodeParameterRef::class, ::VisualShaderNodeParameterRef)
  TypeManager.registerEngineType("VisualShaderNodeParticleAccelerator", VisualShaderNodeParticleAccelerator::class, ::VisualShaderNodeParticleAccelerator)
  TypeManager.registerEngineType("VisualShaderNodeParticleBoxEmitter", VisualShaderNodeParticleBoxEmitter::class, ::VisualShaderNodeParticleBoxEmitter)
  TypeManager.registerEngineType("VisualShaderNodeParticleConeVelocity", VisualShaderNodeParticleConeVelocity::class, ::VisualShaderNodeParticleConeVelocity)
  TypeManager.registerEngineType("VisualShaderNodeParticleEmit", VisualShaderNodeParticleEmit::class, ::VisualShaderNodeParticleEmit)
  TypeManager.registerEngineType("VisualShaderNodeParticleEmitter", VisualShaderNodeParticleEmitter::class, ::VisualShaderNodeParticleEmitter)
  TypeManager.registerEngineType("VisualShaderNodeParticleMeshEmitter", VisualShaderNodeParticleMeshEmitter::class, ::VisualShaderNodeParticleMeshEmitter)
  TypeManager.registerEngineType("VisualShaderNodeParticleMultiplyByAxisAngle", VisualShaderNodeParticleMultiplyByAxisAngle::class, ::VisualShaderNodeParticleMultiplyByAxisAngle)
  TypeManager.registerEngineType("VisualShaderNodeParticleOutput", VisualShaderNodeParticleOutput::class, ::VisualShaderNodeParticleOutput)
  TypeManager.registerEngineType("VisualShaderNodeParticleRandomness", VisualShaderNodeParticleRandomness::class, ::VisualShaderNodeParticleRandomness)
  TypeManager.registerEngineType("VisualShaderNodeParticleRingEmitter", VisualShaderNodeParticleRingEmitter::class, ::VisualShaderNodeParticleRingEmitter)
  TypeManager.registerEngineType("VisualShaderNodeParticleSphereEmitter", VisualShaderNodeParticleSphereEmitter::class, ::VisualShaderNodeParticleSphereEmitter)
  TypeManager.registerEngineType("VisualShaderNodeProximityFade", VisualShaderNodeProximityFade::class, ::VisualShaderNodeProximityFade)
  TypeManager.registerEngineType("VisualShaderNodeRandomRange", VisualShaderNodeRandomRange::class, ::VisualShaderNodeRandomRange)
  TypeManager.registerEngineType("VisualShaderNodeRemap", VisualShaderNodeRemap::class, ::VisualShaderNodeRemap)
  TypeManager.registerEngineType("VisualShaderNodeReroute", VisualShaderNodeReroute::class, ::VisualShaderNodeReroute)
  TypeManager.registerEngineType("VisualShaderNodeResizableBase", VisualShaderNodeResizableBase::class, ::VisualShaderNodeResizableBase)
  TypeManager.registerEngineType("VisualShaderNodeRotationByAxis", VisualShaderNodeRotationByAxis::class, ::VisualShaderNodeRotationByAxis)
  TypeManager.registerEngineType("VisualShaderNodeSDFRaymarch", VisualShaderNodeSDFRaymarch::class, ::VisualShaderNodeSDFRaymarch)
  TypeManager.registerEngineType("VisualShaderNodeSDFToScreenUV", VisualShaderNodeSDFToScreenUV::class, ::VisualShaderNodeSDFToScreenUV)
  TypeManager.registerEngineType("VisualShaderNodeSample3D", VisualShaderNodeSample3D::class, ::VisualShaderNodeSample3D)
  TypeManager.registerEngineType("VisualShaderNodeScreenNormalWorldSpace", VisualShaderNodeScreenNormalWorldSpace::class, ::VisualShaderNodeScreenNormalWorldSpace)
  TypeManager.registerEngineType("VisualShaderNodeScreenUVToSDF", VisualShaderNodeScreenUVToSDF::class, ::VisualShaderNodeScreenUVToSDF)
  TypeManager.registerEngineType("VisualShaderNodeSmoothStep", VisualShaderNodeSmoothStep::class, ::VisualShaderNodeSmoothStep)
  TypeManager.registerEngineType("VisualShaderNodeStep", VisualShaderNodeStep::class, ::VisualShaderNodeStep)
  TypeManager.registerEngineType("VisualShaderNodeSwitch", VisualShaderNodeSwitch::class, ::VisualShaderNodeSwitch)
  TypeManager.registerEngineType("VisualShaderNodeTexture", VisualShaderNodeTexture::class, ::VisualShaderNodeTexture)
  TypeManager.registerEngineType("VisualShaderNodeTexture2DArray", VisualShaderNodeTexture2DArray::class, ::VisualShaderNodeTexture2DArray)
  TypeManager.registerEngineType("VisualShaderNodeTexture2DArrayParameter", VisualShaderNodeTexture2DArrayParameter::class, ::VisualShaderNodeTexture2DArrayParameter)
  TypeManager.registerEngineType("VisualShaderNodeTexture2DParameter", VisualShaderNodeTexture2DParameter::class, ::VisualShaderNodeTexture2DParameter)
  TypeManager.registerEngineType("VisualShaderNodeTexture3D", VisualShaderNodeTexture3D::class, ::VisualShaderNodeTexture3D)
  TypeManager.registerEngineType("VisualShaderNodeTexture3DParameter", VisualShaderNodeTexture3DParameter::class, ::VisualShaderNodeTexture3DParameter)
  TypeManager.registerEngineType("VisualShaderNodeTextureParameter", VisualShaderNodeTextureParameter::class, ::VisualShaderNodeTextureParameter)
  TypeManager.registerEngineType("VisualShaderNodeTextureParameterTriplanar", VisualShaderNodeTextureParameterTriplanar::class, ::VisualShaderNodeTextureParameterTriplanar)
  TypeManager.registerEngineType("VisualShaderNodeTextureSDF", VisualShaderNodeTextureSDF::class, ::VisualShaderNodeTextureSDF)
  TypeManager.registerEngineType("VisualShaderNodeTextureSDFNormal", VisualShaderNodeTextureSDFNormal::class, ::VisualShaderNodeTextureSDFNormal)
  TypeManager.registerEngineType("VisualShaderNodeTransformCompose", VisualShaderNodeTransformCompose::class, ::VisualShaderNodeTransformCompose)
  TypeManager.registerEngineType("VisualShaderNodeTransformConstant", VisualShaderNodeTransformConstant::class, ::VisualShaderNodeTransformConstant)
  TypeManager.registerEngineType("VisualShaderNodeTransformDecompose", VisualShaderNodeTransformDecompose::class, ::VisualShaderNodeTransformDecompose)
  TypeManager.registerEngineType("VisualShaderNodeTransformFunc", VisualShaderNodeTransformFunc::class, ::VisualShaderNodeTransformFunc)
  TypeManager.registerEngineType("VisualShaderNodeTransformOp", VisualShaderNodeTransformOp::class, ::VisualShaderNodeTransformOp)
  TypeManager.registerEngineType("VisualShaderNodeTransformParameter", VisualShaderNodeTransformParameter::class, ::VisualShaderNodeTransformParameter)
  TypeManager.registerEngineType("VisualShaderNodeTransformVecMult", VisualShaderNodeTransformVecMult::class, ::VisualShaderNodeTransformVecMult)
  TypeManager.registerEngineType("VisualShaderNodeUIntConstant", VisualShaderNodeUIntConstant::class, ::VisualShaderNodeUIntConstant)
  TypeManager.registerEngineType("VisualShaderNodeUIntFunc", VisualShaderNodeUIntFunc::class, ::VisualShaderNodeUIntFunc)
  TypeManager.registerEngineType("VisualShaderNodeUIntOp", VisualShaderNodeUIntOp::class, ::VisualShaderNodeUIntOp)
  TypeManager.registerEngineType("VisualShaderNodeUIntParameter", VisualShaderNodeUIntParameter::class, ::VisualShaderNodeUIntParameter)
  TypeManager.registerEngineType("VisualShaderNodeUVFunc", VisualShaderNodeUVFunc::class, ::VisualShaderNodeUVFunc)
  TypeManager.registerEngineType("VisualShaderNodeUVPolarCoord", VisualShaderNodeUVPolarCoord::class, ::VisualShaderNodeUVPolarCoord)
  TypeManager.registerEngineType("VisualShaderNodeVarying", VisualShaderNodeVarying::class, ::VisualShaderNodeVarying)
  TypeManager.registerEngineType("VisualShaderNodeVaryingGetter", VisualShaderNodeVaryingGetter::class, ::VisualShaderNodeVaryingGetter)
  TypeManager.registerEngineType("VisualShaderNodeVaryingSetter", VisualShaderNodeVaryingSetter::class, ::VisualShaderNodeVaryingSetter)
  TypeManager.registerEngineType("VisualShaderNodeVec2Constant", VisualShaderNodeVec2Constant::class, ::VisualShaderNodeVec2Constant)
  TypeManager.registerEngineType("VisualShaderNodeVec2Parameter", VisualShaderNodeVec2Parameter::class, ::VisualShaderNodeVec2Parameter)
  TypeManager.registerEngineType("VisualShaderNodeVec3Constant", VisualShaderNodeVec3Constant::class, ::VisualShaderNodeVec3Constant)
  TypeManager.registerEngineType("VisualShaderNodeVec3Parameter", VisualShaderNodeVec3Parameter::class, ::VisualShaderNodeVec3Parameter)
  TypeManager.registerEngineType("VisualShaderNodeVec4Constant", VisualShaderNodeVec4Constant::class, ::VisualShaderNodeVec4Constant)
  TypeManager.registerEngineType("VisualShaderNodeVec4Parameter", VisualShaderNodeVec4Parameter::class, ::VisualShaderNodeVec4Parameter)
  TypeManager.registerEngineType("VisualShaderNodeVectorBase", VisualShaderNodeVectorBase::class, ::VisualShaderNodeVectorBase)
  TypeManager.registerEngineType("VisualShaderNodeVectorCompose", VisualShaderNodeVectorCompose::class, ::VisualShaderNodeVectorCompose)
  TypeManager.registerEngineType("VisualShaderNodeVectorDecompose", VisualShaderNodeVectorDecompose::class, ::VisualShaderNodeVectorDecompose)
  TypeManager.registerEngineType("VisualShaderNodeVectorDistance", VisualShaderNodeVectorDistance::class, ::VisualShaderNodeVectorDistance)
  TypeManager.registerEngineType("VisualShaderNodeVectorFunc", VisualShaderNodeVectorFunc::class, ::VisualShaderNodeVectorFunc)
  TypeManager.registerEngineType("VisualShaderNodeVectorLen", VisualShaderNodeVectorLen::class, ::VisualShaderNodeVectorLen)
  TypeManager.registerEngineType("VisualShaderNodeVectorOp", VisualShaderNodeVectorOp::class, ::VisualShaderNodeVectorOp)
  TypeManager.registerEngineType("VisualShaderNodeVectorRefract", VisualShaderNodeVectorRefract::class, ::VisualShaderNodeVectorRefract)
  TypeManager.registerEngineType("VisualShaderNodeWorldPositionFromDepth", VisualShaderNodeWorldPositionFromDepth::class, ::VisualShaderNodeWorldPositionFromDepth)
  TypeManager.registerEngineType("VoxelGI", VoxelGI::class, ::VoxelGI)
  TypeManager.registerEngineType("VoxelGIData", VoxelGIData::class, ::VoxelGIData)
  TypeManager.registerEngineType("WeakRef", WeakRef::class, ::WeakRef)
  TypeManager.registerEngineType("WebRTCDataChannel", WebRTCDataChannel::class, ::WebRTCDataChannel)
  TypeManager.registerEngineType("WebRTCDataChannelExtension", WebRTCDataChannelExtension::class, null)
  TypeManager.registerEngineType("WebRTCMultiplayerPeer", WebRTCMultiplayerPeer::class, ::WebRTCMultiplayerPeer)
  TypeManager.registerEngineType("WebRTCPeerConnection", WebRTCPeerConnection::class, ::WebRTCPeerConnection)
  TypeManager.registerEngineType("WebRTCPeerConnectionExtension", WebRTCPeerConnectionExtension::class, null)
  TypeManager.registerEngineType("WebSocketMultiplayerPeer", WebSocketMultiplayerPeer::class, ::WebSocketMultiplayerPeer)
  TypeManager.registerEngineType("WebSocketPeer", WebSocketPeer::class, ::WebSocketPeer)
  TypeManager.registerEngineType("WebXRInterface", WebXRInterface::class, ::WebXRInterface)
  TypeManager.registerEngineType("Window", Window::class, ::Window)
  TypeManager.registerSingleton("WorkerThreadPool") { WorkerThreadPool }
  TypeManager.registerEngineType("WorkerThreadPool", WorkerThreadPool::class) { WorkerThreadPool }
  TypeManager.registerEngineType("World2D", World2D::class, ::World2D)
  TypeManager.registerEngineType("World3D", World3D::class, ::World3D)
  TypeManager.registerEngineType("WorldBoundaryShape2D", WorldBoundaryShape2D::class, ::WorldBoundaryShape2D)
  TypeManager.registerEngineType("WorldBoundaryShape3D", WorldBoundaryShape3D::class, ::WorldBoundaryShape3D)
  TypeManager.registerEngineType("WorldEnvironment", WorldEnvironment::class, ::WorldEnvironment)
  TypeManager.registerEngineType("X509Certificate", X509Certificate::class, ::X509Certificate)
  TypeManager.registerEngineType("XMLParser", XMLParser::class, ::XMLParser)
  TypeManager.registerEngineType("XRAnchor3D", XRAnchor3D::class, ::XRAnchor3D)
  TypeManager.registerEngineType("XRBodyModifier3D", XRBodyModifier3D::class, ::XRBodyModifier3D)
  TypeManager.registerEngineType("XRBodyTracker", XRBodyTracker::class, ::XRBodyTracker)
  TypeManager.registerEngineType("XRCamera3D", XRCamera3D::class, ::XRCamera3D)
  TypeManager.registerEngineType("XRController3D", XRController3D::class, ::XRController3D)
  TypeManager.registerEngineType("XRControllerTracker", XRControllerTracker::class, ::XRControllerTracker)
  TypeManager.registerEngineType("XRFaceModifier3D", XRFaceModifier3D::class, ::XRFaceModifier3D)
  TypeManager.registerEngineType("XRFaceTracker", XRFaceTracker::class, ::XRFaceTracker)
  TypeManager.registerEngineType("XRHandModifier3D", XRHandModifier3D::class, ::XRHandModifier3D)
  TypeManager.registerEngineType("XRHandTracker", XRHandTracker::class, ::XRHandTracker)
  TypeManager.registerEngineType("XRInterface", XRInterface::class, ::XRInterface)
  TypeManager.registerEngineType("XRInterfaceExtension", XRInterfaceExtension::class, ::XRInterfaceExtension)
  TypeManager.registerEngineType("XRNode3D", XRNode3D::class, ::XRNode3D)
  TypeManager.registerEngineType("XROrigin3D", XROrigin3D::class, ::XROrigin3D)
  TypeManager.registerEngineType("XRPose", XRPose::class, ::XRPose)
  TypeManager.registerEngineType("XRPositionalTracker", XRPositionalTracker::class, ::XRPositionalTracker)
  TypeManager.registerSingleton("XRServer") { XRServer }
  TypeManager.registerEngineType("XRServer", XRServer::class) { XRServer }
  TypeManager.registerEngineType("XRTracker", XRTracker::class, ::XRTracker)
  TypeManager.registerEngineType("XRVRS", XRVRS::class, ::XRVRS)
  TypeManager.registerEngineType("ZIPPacker", ZIPPacker::class, ::ZIPPacker)
  TypeManager.registerEngineType("ZIPReader", ZIPReader::class, ::ZIPReader)
}
