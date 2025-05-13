package godot

import godot.`internal`.reflection.TypeManager
import godot.api.AESContext
import godot.api.AStar2D
import godot.api.AStar3D
import godot.api.AStarGrid2D
import godot.api.AcceptDialog
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
import godot.api.ConvexPolygonShape2D
import godot.api.ConvexPolygonShape3D
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
import godot.api.OpenXRExtensionWrapperExtension
import godot.api.OpenXRHand
import godot.api.OpenXRHapticBase
import godot.api.OpenXRHapticVibration
import godot.api.OpenXRIPBinding
import godot.api.OpenXRIPBindingModifier
import godot.api.OpenXRInteractionProfile
import godot.api.OpenXRInteractionProfileMetadata
import godot.api.OpenXRInterface
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
import godot.api.SceneMultiplayer
import godot.api.SceneReplicationConfig
import godot.api.SceneState
import godot.api.SceneTree
import godot.api.SceneTreeTimer
import godot.api.Script
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
import godot.core.addVariantMapping
import kotlin.Unit

public fun registerVariantMapping(): Unit {
  addVariantMapping(Object::class, OBJECT)
  addVariantMapping(RefCounted::class, OBJECT)
  addVariantMapping(AESContext::class, OBJECT)
  addVariantMapping(AStar2D::class, OBJECT)
  addVariantMapping(AStar3D::class, OBJECT)
  addVariantMapping(AStarGrid2D::class, OBJECT)
  addVariantMapping(AcceptDialog::class, OBJECT)
  addVariantMapping(AnimatableBody2D::class, OBJECT)
  addVariantMapping(AnimatableBody3D::class, OBJECT)
  addVariantMapping(AnimatedSprite2D::class, OBJECT)
  addVariantMapping(AnimatedSprite3D::class, OBJECT)
  addVariantMapping(AnimatedTexture::class, OBJECT)
  addVariantMapping(Animation::class, OBJECT)
  addVariantMapping(AnimationLibrary::class, OBJECT)
  addVariantMapping(AnimationMixer::class, OBJECT)
  addVariantMapping(AnimationNode::class, OBJECT)
  addVariantMapping(AnimationNodeAdd2::class, OBJECT)
  addVariantMapping(AnimationNodeAdd3::class, OBJECT)
  addVariantMapping(AnimationNodeAnimation::class, OBJECT)
  addVariantMapping(AnimationNodeBlend2::class, OBJECT)
  addVariantMapping(AnimationNodeBlend3::class, OBJECT)
  addVariantMapping(AnimationNodeBlendSpace1D::class, OBJECT)
  addVariantMapping(AnimationNodeBlendSpace2D::class, OBJECT)
  addVariantMapping(AnimationNodeBlendTree::class, OBJECT)
  addVariantMapping(AnimationNodeExtension::class, OBJECT)
  addVariantMapping(AnimationNodeOneShot::class, OBJECT)
  addVariantMapping(AnimationNodeOutput::class, OBJECT)
  addVariantMapping(AnimationNodeStateMachine::class, OBJECT)
  addVariantMapping(AnimationNodeStateMachinePlayback::class, OBJECT)
  addVariantMapping(AnimationNodeStateMachineTransition::class, OBJECT)
  addVariantMapping(AnimationNodeSub2::class, OBJECT)
  addVariantMapping(AnimationNodeSync::class, OBJECT)
  addVariantMapping(AnimationNodeTimeScale::class, OBJECT)
  addVariantMapping(AnimationNodeTimeSeek::class, OBJECT)
  addVariantMapping(AnimationNodeTransition::class, OBJECT)
  addVariantMapping(AnimationPlayer::class, OBJECT)
  addVariantMapping(AnimationRootNode::class, OBJECT)
  addVariantMapping(AnimationTree::class, OBJECT)
  addVariantMapping(Area2D::class, OBJECT)
  addVariantMapping(Area3D::class, OBJECT)
  addVariantMapping(ArrayMesh::class, OBJECT)
  addVariantMapping(ArrayOccluder3D::class, OBJECT)
  addVariantMapping(AspectRatioContainer::class, OBJECT)
  addVariantMapping(AtlasTexture::class, OBJECT)
  addVariantMapping(AudioBusLayout::class, OBJECT)
  addVariantMapping(AudioEffect::class, OBJECT)
  addVariantMapping(AudioEffectAmplify::class, OBJECT)
  addVariantMapping(AudioEffectBandLimitFilter::class, OBJECT)
  addVariantMapping(AudioEffectBandPassFilter::class, OBJECT)
  addVariantMapping(AudioEffectCapture::class, OBJECT)
  addVariantMapping(AudioEffectChorus::class, OBJECT)
  addVariantMapping(AudioEffectCompressor::class, OBJECT)
  addVariantMapping(AudioEffectDelay::class, OBJECT)
  addVariantMapping(AudioEffectDistortion::class, OBJECT)
  addVariantMapping(AudioEffectEQ::class, OBJECT)
  addVariantMapping(AudioEffectEQ10::class, OBJECT)
  addVariantMapping(AudioEffectEQ21::class, OBJECT)
  addVariantMapping(AudioEffectEQ6::class, OBJECT)
  addVariantMapping(AudioEffectFilter::class, OBJECT)
  addVariantMapping(AudioEffectHardLimiter::class, OBJECT)
  addVariantMapping(AudioEffectHighPassFilter::class, OBJECT)
  addVariantMapping(AudioEffectHighShelfFilter::class, OBJECT)
  addVariantMapping(AudioEffectInstance::class, OBJECT)
  addVariantMapping(AudioEffectLimiter::class, OBJECT)
  addVariantMapping(AudioEffectLowPassFilter::class, OBJECT)
  addVariantMapping(AudioEffectLowShelfFilter::class, OBJECT)
  addVariantMapping(AudioEffectNotchFilter::class, OBJECT)
  addVariantMapping(AudioEffectPanner::class, OBJECT)
  addVariantMapping(AudioEffectPhaser::class, OBJECT)
  addVariantMapping(AudioEffectPitchShift::class, OBJECT)
  addVariantMapping(AudioEffectRecord::class, OBJECT)
  addVariantMapping(AudioEffectReverb::class, OBJECT)
  addVariantMapping(AudioEffectSpectrumAnalyzer::class, OBJECT)
  addVariantMapping(AudioEffectSpectrumAnalyzerInstance::class, OBJECT)
  addVariantMapping(AudioEffectStereoEnhance::class, OBJECT)
  addVariantMapping(AudioListener2D::class, OBJECT)
  addVariantMapping(AudioListener3D::class, OBJECT)
  addVariantMapping(AudioSample::class, OBJECT)
  addVariantMapping(AudioSamplePlayback::class, OBJECT)
  addVariantMapping(AudioServer::class, OBJECT)
  addVariantMapping(AudioStream::class, OBJECT)
  addVariantMapping(AudioStreamGenerator::class, OBJECT)
  addVariantMapping(AudioStreamGeneratorPlayback::class, OBJECT)
  addVariantMapping(AudioStreamInteractive::class, OBJECT)
  addVariantMapping(AudioStreamMP3::class, OBJECT)
  addVariantMapping(AudioStreamMicrophone::class, OBJECT)
  addVariantMapping(AudioStreamOggVorbis::class, OBJECT)
  addVariantMapping(AudioStreamPlayback::class, OBJECT)
  addVariantMapping(AudioStreamPlaybackInteractive::class, OBJECT)
  addVariantMapping(AudioStreamPlaybackOggVorbis::class, OBJECT)
  addVariantMapping(AudioStreamPlaybackPlaylist::class, OBJECT)
  addVariantMapping(AudioStreamPlaybackPolyphonic::class, OBJECT)
  addVariantMapping(AudioStreamPlaybackResampled::class, OBJECT)
  addVariantMapping(AudioStreamPlaybackSynchronized::class, OBJECT)
  addVariantMapping(AudioStreamPlayer::class, OBJECT)
  addVariantMapping(AudioStreamPlayer2D::class, OBJECT)
  addVariantMapping(AudioStreamPlayer3D::class, OBJECT)
  addVariantMapping(AudioStreamPlaylist::class, OBJECT)
  addVariantMapping(AudioStreamPolyphonic::class, OBJECT)
  addVariantMapping(AudioStreamRandomizer::class, OBJECT)
  addVariantMapping(AudioStreamSynchronized::class, OBJECT)
  addVariantMapping(AudioStreamWAV::class, OBJECT)
  addVariantMapping(BackBufferCopy::class, OBJECT)
  addVariantMapping(BaseButton::class, OBJECT)
  addVariantMapping(BaseMaterial3D::class, OBJECT)
  addVariantMapping(BitMap::class, OBJECT)
  addVariantMapping(Bone2D::class, OBJECT)
  addVariantMapping(BoneAttachment3D::class, OBJECT)
  addVariantMapping(BoneMap::class, OBJECT)
  addVariantMapping(BoxContainer::class, OBJECT)
  addVariantMapping(BoxMesh::class, OBJECT)
  addVariantMapping(BoxOccluder3D::class, OBJECT)
  addVariantMapping(BoxShape3D::class, OBJECT)
  addVariantMapping(Button::class, OBJECT)
  addVariantMapping(ButtonGroup::class, OBJECT)
  addVariantMapping(CPUParticles2D::class, OBJECT)
  addVariantMapping(CPUParticles3D::class, OBJECT)
  addVariantMapping(CSGBox3D::class, OBJECT)
  addVariantMapping(CSGCombiner3D::class, OBJECT)
  addVariantMapping(CSGCylinder3D::class, OBJECT)
  addVariantMapping(CSGMesh3D::class, OBJECT)
  addVariantMapping(CSGPolygon3D::class, OBJECT)
  addVariantMapping(CSGPrimitive3D::class, OBJECT)
  addVariantMapping(CSGShape3D::class, OBJECT)
  addVariantMapping(CSGSphere3D::class, OBJECT)
  addVariantMapping(CSGTorus3D::class, OBJECT)
  addVariantMapping(CallbackTweener::class, OBJECT)
  addVariantMapping(Camera2D::class, OBJECT)
  addVariantMapping(Camera3D::class, OBJECT)
  addVariantMapping(CameraAttributes::class, OBJECT)
  addVariantMapping(CameraAttributesPhysical::class, OBJECT)
  addVariantMapping(CameraAttributesPractical::class, OBJECT)
  addVariantMapping(CameraFeed::class, OBJECT)
  addVariantMapping(CameraServer::class, OBJECT)
  addVariantMapping(CameraTexture::class, OBJECT)
  addVariantMapping(CanvasGroup::class, OBJECT)
  addVariantMapping(CanvasItem::class, OBJECT)
  addVariantMapping(CanvasItemMaterial::class, OBJECT)
  addVariantMapping(CanvasLayer::class, OBJECT)
  addVariantMapping(CanvasModulate::class, OBJECT)
  addVariantMapping(CanvasTexture::class, OBJECT)
  addVariantMapping(CapsuleMesh::class, OBJECT)
  addVariantMapping(CapsuleShape2D::class, OBJECT)
  addVariantMapping(CapsuleShape3D::class, OBJECT)
  addVariantMapping(CenterContainer::class, OBJECT)
  addVariantMapping(CharFXTransform::class, OBJECT)
  addVariantMapping(CharacterBody2D::class, OBJECT)
  addVariantMapping(CharacterBody3D::class, OBJECT)
  addVariantMapping(CheckBox::class, OBJECT)
  addVariantMapping(CheckButton::class, OBJECT)
  addVariantMapping(CircleShape2D::class, OBJECT)
  addVariantMapping(ClassDB::class, OBJECT)
  addVariantMapping(CodeEdit::class, OBJECT)
  addVariantMapping(CodeHighlighter::class, OBJECT)
  addVariantMapping(CollisionObject2D::class, OBJECT)
  addVariantMapping(CollisionObject3D::class, OBJECT)
  addVariantMapping(CollisionPolygon2D::class, OBJECT)
  addVariantMapping(CollisionPolygon3D::class, OBJECT)
  addVariantMapping(CollisionShape2D::class, OBJECT)
  addVariantMapping(CollisionShape3D::class, OBJECT)
  addVariantMapping(ColorPalette::class, OBJECT)
  addVariantMapping(ColorPicker::class, OBJECT)
  addVariantMapping(ColorPickerButton::class, OBJECT)
  addVariantMapping(ColorRect::class, OBJECT)
  addVariantMapping(Compositor::class, OBJECT)
  addVariantMapping(CompositorEffect::class, OBJECT)
  addVariantMapping(CompressedCubemap::class, OBJECT)
  addVariantMapping(CompressedCubemapArray::class, OBJECT)
  addVariantMapping(CompressedTexture2D::class, OBJECT)
  addVariantMapping(CompressedTexture2DArray::class, OBJECT)
  addVariantMapping(CompressedTexture3D::class, OBJECT)
  addVariantMapping(CompressedTextureLayered::class, OBJECT)
  addVariantMapping(ConcavePolygonShape2D::class, OBJECT)
  addVariantMapping(ConcavePolygonShape3D::class, OBJECT)
  addVariantMapping(ConeTwistJoint3D::class, OBJECT)
  addVariantMapping(ConfigFile::class, OBJECT)
  addVariantMapping(ConfirmationDialog::class, OBJECT)
  addVariantMapping(Container::class, OBJECT)
  addVariantMapping(Control::class, OBJECT)
  addVariantMapping(ConvexPolygonShape2D::class, OBJECT)
  addVariantMapping(ConvexPolygonShape3D::class, OBJECT)
  addVariantMapping(Crypto::class, OBJECT)
  addVariantMapping(CryptoKey::class, OBJECT)
  addVariantMapping(Cubemap::class, OBJECT)
  addVariantMapping(CubemapArray::class, OBJECT)
  addVariantMapping(Curve::class, OBJECT)
  addVariantMapping(Curve2D::class, OBJECT)
  addVariantMapping(Curve3D::class, OBJECT)
  addVariantMapping(CurveTexture::class, OBJECT)
  addVariantMapping(CurveXYZTexture::class, OBJECT)
  addVariantMapping(CylinderMesh::class, OBJECT)
  addVariantMapping(CylinderShape3D::class, OBJECT)
  addVariantMapping(DTLSServer::class, OBJECT)
  addVariantMapping(DampedSpringJoint2D::class, OBJECT)
  addVariantMapping(Decal::class, OBJECT)
  addVariantMapping(DirAccess::class, OBJECT)
  addVariantMapping(DirectionalLight2D::class, OBJECT)
  addVariantMapping(DirectionalLight3D::class, OBJECT)
  addVariantMapping(DisplayServer::class, OBJECT)
  addVariantMapping(ENetConnection::class, OBJECT)
  addVariantMapping(ENetMultiplayerPeer::class, OBJECT)
  addVariantMapping(ENetPacketPeer::class, OBJECT)
  addVariantMapping(EncodedObjectAsID::class, OBJECT)
  addVariantMapping(Engine::class, OBJECT)
  addVariantMapping(EngineDebugger::class, OBJECT)
  addVariantMapping(EngineProfiler::class, OBJECT)
  addVariantMapping(Environment::class, OBJECT)
  addVariantMapping(Expression::class, OBJECT)
  addVariantMapping(ExternalTexture::class, OBJECT)
  addVariantMapping(FBXDocument::class, OBJECT)
  addVariantMapping(FBXState::class, OBJECT)
  addVariantMapping(FastNoiseLite::class, OBJECT)
  addVariantMapping(FileAccess::class, OBJECT)
  addVariantMapping(FileDialog::class, OBJECT)
  addVariantMapping(FlowContainer::class, OBJECT)
  addVariantMapping(FogMaterial::class, OBJECT)
  addVariantMapping(FogVolume::class, OBJECT)
  addVariantMapping(Font::class, OBJECT)
  addVariantMapping(FontFile::class, OBJECT)
  addVariantMapping(FontVariation::class, OBJECT)
  addVariantMapping(FramebufferCacheRD::class, OBJECT)
  addVariantMapping(GDExtension::class, OBJECT)
  addVariantMapping(GDExtensionManager::class, OBJECT)
  addVariantMapping(GDScript::class, OBJECT)
  addVariantMapping(GLTFAccessor::class, OBJECT)
  addVariantMapping(GLTFAnimation::class, OBJECT)
  addVariantMapping(GLTFBufferView::class, OBJECT)
  addVariantMapping(GLTFCamera::class, OBJECT)
  addVariantMapping(GLTFDocument::class, OBJECT)
  addVariantMapping(GLTFDocumentExtension::class, OBJECT)
  addVariantMapping(GLTFDocumentExtensionConvertImporterMesh::class, OBJECT)
  addVariantMapping(GLTFLight::class, OBJECT)
  addVariantMapping(GLTFMesh::class, OBJECT)
  addVariantMapping(GLTFNode::class, OBJECT)
  addVariantMapping(GLTFObjectModelProperty::class, OBJECT)
  addVariantMapping(GLTFPhysicsBody::class, OBJECT)
  addVariantMapping(GLTFPhysicsShape::class, OBJECT)
  addVariantMapping(GLTFSkeleton::class, OBJECT)
  addVariantMapping(GLTFSkin::class, OBJECT)
  addVariantMapping(GLTFSpecGloss::class, OBJECT)
  addVariantMapping(GLTFState::class, OBJECT)
  addVariantMapping(GLTFTexture::class, OBJECT)
  addVariantMapping(GLTFTextureSampler::class, OBJECT)
  addVariantMapping(GPUParticles2D::class, OBJECT)
  addVariantMapping(GPUParticles3D::class, OBJECT)
  addVariantMapping(GPUParticlesAttractor3D::class, OBJECT)
  addVariantMapping(GPUParticlesAttractorBox3D::class, OBJECT)
  addVariantMapping(GPUParticlesAttractorSphere3D::class, OBJECT)
  addVariantMapping(GPUParticlesAttractorVectorField3D::class, OBJECT)
  addVariantMapping(GPUParticlesCollision3D::class, OBJECT)
  addVariantMapping(GPUParticlesCollisionBox3D::class, OBJECT)
  addVariantMapping(GPUParticlesCollisionHeightField3D::class, OBJECT)
  addVariantMapping(GPUParticlesCollisionSDF3D::class, OBJECT)
  addVariantMapping(GPUParticlesCollisionSphere3D::class, OBJECT)
  addVariantMapping(GdjScript::class, OBJECT)
  addVariantMapping(Generic6DOFJoint3D::class, OBJECT)
  addVariantMapping(Geometry2D::class, OBJECT)
  addVariantMapping(Geometry3D::class, OBJECT)
  addVariantMapping(GeometryInstance3D::class, OBJECT)
  addVariantMapping(Gradient::class, OBJECT)
  addVariantMapping(GradientTexture1D::class, OBJECT)
  addVariantMapping(GradientTexture2D::class, OBJECT)
  addVariantMapping(GraphEdit::class, OBJECT)
  addVariantMapping(GraphElement::class, OBJECT)
  addVariantMapping(GraphFrame::class, OBJECT)
  addVariantMapping(GraphNode::class, OBJECT)
  addVariantMapping(GridContainer::class, OBJECT)
  addVariantMapping(GridMap::class, OBJECT)
  addVariantMapping(GrooveJoint2D::class, OBJECT)
  addVariantMapping(HBoxContainer::class, OBJECT)
  addVariantMapping(HFlowContainer::class, OBJECT)
  addVariantMapping(HMACContext::class, OBJECT)
  addVariantMapping(HScrollBar::class, OBJECT)
  addVariantMapping(HSeparator::class, OBJECT)
  addVariantMapping(HSlider::class, OBJECT)
  addVariantMapping(HSplitContainer::class, OBJECT)
  addVariantMapping(HTTPClient::class, OBJECT)
  addVariantMapping(HTTPRequest::class, OBJECT)
  addVariantMapping(HashingContext::class, OBJECT)
  addVariantMapping(HeightMapShape3D::class, OBJECT)
  addVariantMapping(HingeJoint3D::class, OBJECT)
  addVariantMapping(IP::class, OBJECT)
  addVariantMapping(Image::class, OBJECT)
  addVariantMapping(ImageFormatLoader::class, OBJECT)
  addVariantMapping(ImageFormatLoaderExtension::class, OBJECT)
  addVariantMapping(ImageTexture::class, OBJECT)
  addVariantMapping(ImageTexture3D::class, OBJECT)
  addVariantMapping(ImageTextureLayered::class, OBJECT)
  addVariantMapping(ImmediateMesh::class, OBJECT)
  addVariantMapping(ImporterMesh::class, OBJECT)
  addVariantMapping(ImporterMeshInstance3D::class, OBJECT)
  addVariantMapping(Input::class, OBJECT)
  addVariantMapping(InputEvent::class, OBJECT)
  addVariantMapping(InputEventAction::class, OBJECT)
  addVariantMapping(InputEventFromWindow::class, OBJECT)
  addVariantMapping(InputEventGesture::class, OBJECT)
  addVariantMapping(InputEventJoypadButton::class, OBJECT)
  addVariantMapping(InputEventJoypadMotion::class, OBJECT)
  addVariantMapping(InputEventKey::class, OBJECT)
  addVariantMapping(InputEventMIDI::class, OBJECT)
  addVariantMapping(InputEventMagnifyGesture::class, OBJECT)
  addVariantMapping(InputEventMouse::class, OBJECT)
  addVariantMapping(InputEventMouseButton::class, OBJECT)
  addVariantMapping(InputEventMouseMotion::class, OBJECT)
  addVariantMapping(InputEventPanGesture::class, OBJECT)
  addVariantMapping(InputEventScreenDrag::class, OBJECT)
  addVariantMapping(InputEventScreenTouch::class, OBJECT)
  addVariantMapping(InputEventShortcut::class, OBJECT)
  addVariantMapping(InputEventWithModifiers::class, OBJECT)
  addVariantMapping(InputMap::class, OBJECT)
  addVariantMapping(InstancePlaceholder::class, OBJECT)
  addVariantMapping(IntervalTweener::class, OBJECT)
  addVariantMapping(ItemList::class, OBJECT)
  addVariantMapping(JNISingleton::class, OBJECT)
  addVariantMapping(JSON::class, OBJECT)
  addVariantMapping(JSONRPC::class, OBJECT)
  addVariantMapping(JavaClass::class, OBJECT)
  addVariantMapping(JavaClassWrapper::class, OBJECT)
  addVariantMapping(JavaObject::class, OBJECT)
  addVariantMapping(JavaScript::class, OBJECT)
  addVariantMapping(JavaScriptBridge::class, OBJECT)
  addVariantMapping(JavaScriptObject::class, OBJECT)
  addVariantMapping(Joint2D::class, OBJECT)
  addVariantMapping(Joint3D::class, OBJECT)
  addVariantMapping(JvmScript::class, OBJECT)
  addVariantMapping(KinematicCollision2D::class, OBJECT)
  addVariantMapping(KinematicCollision3D::class, OBJECT)
  addVariantMapping(KotlinScript::class, OBJECT)
  addVariantMapping(Label::class, OBJECT)
  addVariantMapping(Label3D::class, OBJECT)
  addVariantMapping(LabelSettings::class, OBJECT)
  addVariantMapping(Light2D::class, OBJECT)
  addVariantMapping(Light3D::class, OBJECT)
  addVariantMapping(LightOccluder2D::class, OBJECT)
  addVariantMapping(LightmapGI::class, OBJECT)
  addVariantMapping(LightmapGIData::class, OBJECT)
  addVariantMapping(LightmapProbe::class, OBJECT)
  addVariantMapping(Lightmapper::class, OBJECT)
  addVariantMapping(LightmapperRD::class, OBJECT)
  addVariantMapping(Line2D::class, OBJECT)
  addVariantMapping(LineEdit::class, OBJECT)
  addVariantMapping(LinkButton::class, OBJECT)
  addVariantMapping(LookAtModifier3D::class, OBJECT)
  addVariantMapping(MainLoop::class, OBJECT)
  addVariantMapping(MarginContainer::class, OBJECT)
  addVariantMapping(Marker2D::class, OBJECT)
  addVariantMapping(Marker3D::class, OBJECT)
  addVariantMapping(Marshalls::class, OBJECT)
  addVariantMapping(Material::class, OBJECT)
  addVariantMapping(MenuBar::class, OBJECT)
  addVariantMapping(MenuButton::class, OBJECT)
  addVariantMapping(Mesh::class, OBJECT)
  addVariantMapping(MeshConvexDecompositionSettings::class, OBJECT)
  addVariantMapping(MeshDataTool::class, OBJECT)
  addVariantMapping(MeshInstance2D::class, OBJECT)
  addVariantMapping(MeshInstance3D::class, OBJECT)
  addVariantMapping(MeshLibrary::class, OBJECT)
  addVariantMapping(MeshTexture::class, OBJECT)
  addVariantMapping(MethodTweener::class, OBJECT)
  addVariantMapping(MissingNode::class, OBJECT)
  addVariantMapping(MissingResource::class, OBJECT)
  addVariantMapping(MobileVRInterface::class, OBJECT)
  addVariantMapping(MovieWriter::class, OBJECT)
  addVariantMapping(MultiMesh::class, OBJECT)
  addVariantMapping(MultiMeshInstance2D::class, OBJECT)
  addVariantMapping(MultiMeshInstance3D::class, OBJECT)
  addVariantMapping(MultiplayerAPI::class, OBJECT)
  addVariantMapping(MultiplayerAPIExtension::class, OBJECT)
  addVariantMapping(MultiplayerPeer::class, OBJECT)
  addVariantMapping(MultiplayerPeerExtension::class, OBJECT)
  addVariantMapping(MultiplayerSpawner::class, OBJECT)
  addVariantMapping(MultiplayerSynchronizer::class, OBJECT)
  addVariantMapping(Mutex::class, OBJECT)
  addVariantMapping(NativeMenu::class, OBJECT)
  addVariantMapping(NavigationAgent2D::class, OBJECT)
  addVariantMapping(NavigationAgent3D::class, OBJECT)
  addVariantMapping(NavigationLink2D::class, OBJECT)
  addVariantMapping(NavigationLink3D::class, OBJECT)
  addVariantMapping(NavigationMesh::class, OBJECT)
  addVariantMapping(NavigationMeshGenerator::class, OBJECT)
  addVariantMapping(NavigationMeshSourceGeometryData2D::class, OBJECT)
  addVariantMapping(NavigationMeshSourceGeometryData3D::class, OBJECT)
  addVariantMapping(NavigationObstacle2D::class, OBJECT)
  addVariantMapping(NavigationObstacle3D::class, OBJECT)
  addVariantMapping(NavigationPathQueryParameters2D::class, OBJECT)
  addVariantMapping(NavigationPathQueryParameters3D::class, OBJECT)
  addVariantMapping(NavigationPathQueryResult2D::class, OBJECT)
  addVariantMapping(NavigationPathQueryResult3D::class, OBJECT)
  addVariantMapping(NavigationPolygon::class, OBJECT)
  addVariantMapping(NavigationRegion2D::class, OBJECT)
  addVariantMapping(NavigationRegion3D::class, OBJECT)
  addVariantMapping(NavigationServer2D::class, OBJECT)
  addVariantMapping(NavigationServer3D::class, OBJECT)
  addVariantMapping(NinePatchRect::class, OBJECT)
  addVariantMapping(Node::class, OBJECT)
  addVariantMapping(Node2D::class, OBJECT)
  addVariantMapping(Node3D::class, OBJECT)
  addVariantMapping(Node3DGizmo::class, OBJECT)
  addVariantMapping(Noise::class, OBJECT)
  addVariantMapping(NoiseTexture2D::class, OBJECT)
  addVariantMapping(NoiseTexture3D::class, OBJECT)
  addVariantMapping(ORMMaterial3D::class, OBJECT)
  addVariantMapping(OS::class, OBJECT)
  addVariantMapping(Occluder3D::class, OBJECT)
  addVariantMapping(OccluderInstance3D::class, OBJECT)
  addVariantMapping(OccluderPolygon2D::class, OBJECT)
  addVariantMapping(OfflineMultiplayerPeer::class, OBJECT)
  addVariantMapping(OggPacketSequence::class, OBJECT)
  addVariantMapping(OggPacketSequencePlayback::class, OBJECT)
  addVariantMapping(OmniLight3D::class, OBJECT)
  addVariantMapping(OpenXRAPIExtension::class, OBJECT)
  addVariantMapping(OpenXRAction::class, OBJECT)
  addVariantMapping(OpenXRActionBindingModifier::class, OBJECT)
  addVariantMapping(OpenXRActionMap::class, OBJECT)
  addVariantMapping(OpenXRActionSet::class, OBJECT)
  addVariantMapping(OpenXRAnalogThresholdModifier::class, OBJECT)
  addVariantMapping(OpenXRBindingModifier::class, OBJECT)
  addVariantMapping(OpenXRCompositionLayer::class, OBJECT)
  addVariantMapping(OpenXRCompositionLayerCylinder::class, OBJECT)
  addVariantMapping(OpenXRCompositionLayerEquirect::class, OBJECT)
  addVariantMapping(OpenXRCompositionLayerQuad::class, OBJECT)
  addVariantMapping(OpenXRDpadBindingModifier::class, OBJECT)
  addVariantMapping(OpenXRExtensionWrapperExtension::class, OBJECT)
  addVariantMapping(OpenXRHand::class, OBJECT)
  addVariantMapping(OpenXRHapticBase::class, OBJECT)
  addVariantMapping(OpenXRHapticVibration::class, OBJECT)
  addVariantMapping(OpenXRIPBinding::class, OBJECT)
  addVariantMapping(OpenXRIPBindingModifier::class, OBJECT)
  addVariantMapping(OpenXRInteractionProfile::class, OBJECT)
  addVariantMapping(OpenXRInteractionProfileMetadata::class, OBJECT)
  addVariantMapping(OpenXRInterface::class, OBJECT)
  addVariantMapping(OpenXRVisibilityMask::class, OBJECT)
  addVariantMapping(OptimizedTranslation::class, OBJECT)
  addVariantMapping(OptionButton::class, OBJECT)
  addVariantMapping(PCKPacker::class, OBJECT)
  addVariantMapping(PackedDataContainer::class, OBJECT)
  addVariantMapping(PackedDataContainerRef::class, OBJECT)
  addVariantMapping(PackedScene::class, OBJECT)
  addVariantMapping(PacketPeer::class, OBJECT)
  addVariantMapping(PacketPeerDTLS::class, OBJECT)
  addVariantMapping(PacketPeerExtension::class, OBJECT)
  addVariantMapping(PacketPeerStream::class, OBJECT)
  addVariantMapping(PacketPeerUDP::class, OBJECT)
  addVariantMapping(Panel::class, OBJECT)
  addVariantMapping(PanelContainer::class, OBJECT)
  addVariantMapping(PanoramaSkyMaterial::class, OBJECT)
  addVariantMapping(Parallax2D::class, OBJECT)
  addVariantMapping(ParallaxBackground::class, OBJECT)
  addVariantMapping(ParallaxLayer::class, OBJECT)
  addVariantMapping(ParticleProcessMaterial::class, OBJECT)
  addVariantMapping(Path2D::class, OBJECT)
  addVariantMapping(Path3D::class, OBJECT)
  addVariantMapping(PathFollow2D::class, OBJECT)
  addVariantMapping(PathFollow3D::class, OBJECT)
  addVariantMapping(Performance::class, OBJECT)
  addVariantMapping(PhysicalBone2D::class, OBJECT)
  addVariantMapping(PhysicalBone3D::class, OBJECT)
  addVariantMapping(PhysicalBoneSimulator3D::class, OBJECT)
  addVariantMapping(PhysicalSkyMaterial::class, OBJECT)
  addVariantMapping(PhysicsBody2D::class, OBJECT)
  addVariantMapping(PhysicsBody3D::class, OBJECT)
  addVariantMapping(PhysicsDirectBodyState2D::class, OBJECT)
  addVariantMapping(PhysicsDirectBodyState2DExtension::class, OBJECT)
  addVariantMapping(PhysicsDirectBodyState3D::class, OBJECT)
  addVariantMapping(PhysicsDirectBodyState3DExtension::class, OBJECT)
  addVariantMapping(PhysicsDirectSpaceState2D::class, OBJECT)
  addVariantMapping(PhysicsDirectSpaceState2DExtension::class, OBJECT)
  addVariantMapping(PhysicsDirectSpaceState3D::class, OBJECT)
  addVariantMapping(PhysicsDirectSpaceState3DExtension::class, OBJECT)
  addVariantMapping(PhysicsMaterial::class, OBJECT)
  addVariantMapping(PhysicsPointQueryParameters2D::class, OBJECT)
  addVariantMapping(PhysicsPointQueryParameters3D::class, OBJECT)
  addVariantMapping(PhysicsRayQueryParameters2D::class, OBJECT)
  addVariantMapping(PhysicsRayQueryParameters3D::class, OBJECT)
  addVariantMapping(PhysicsServer2D::class, OBJECT)
  addVariantMapping(PhysicsServer2DManager::class, OBJECT)
  addVariantMapping(PhysicsServer3D::class, OBJECT)
  addVariantMapping(PhysicsServer3DManager::class, OBJECT)
  addVariantMapping(PhysicsServer3DRenderingServerHandler::class, OBJECT)
  addVariantMapping(PhysicsShapeQueryParameters2D::class, OBJECT)
  addVariantMapping(PhysicsShapeQueryParameters3D::class, OBJECT)
  addVariantMapping(PhysicsTestMotionParameters2D::class, OBJECT)
  addVariantMapping(PhysicsTestMotionParameters3D::class, OBJECT)
  addVariantMapping(PhysicsTestMotionResult2D::class, OBJECT)
  addVariantMapping(PhysicsTestMotionResult3D::class, OBJECT)
  addVariantMapping(PinJoint2D::class, OBJECT)
  addVariantMapping(PinJoint3D::class, OBJECT)
  addVariantMapping(PlaceholderCubemap::class, OBJECT)
  addVariantMapping(PlaceholderCubemapArray::class, OBJECT)
  addVariantMapping(PlaceholderMaterial::class, OBJECT)
  addVariantMapping(PlaceholderMesh::class, OBJECT)
  addVariantMapping(PlaceholderTexture2D::class, OBJECT)
  addVariantMapping(PlaceholderTexture2DArray::class, OBJECT)
  addVariantMapping(PlaceholderTexture3D::class, OBJECT)
  addVariantMapping(PlaceholderTextureLayered::class, OBJECT)
  addVariantMapping(PlaneMesh::class, OBJECT)
  addVariantMapping(PointLight2D::class, OBJECT)
  addVariantMapping(PointMesh::class, OBJECT)
  addVariantMapping(Polygon2D::class, OBJECT)
  addVariantMapping(PolygonOccluder3D::class, OBJECT)
  addVariantMapping(PolygonPathFinder::class, OBJECT)
  addVariantMapping(Popup::class, OBJECT)
  addVariantMapping(PopupMenu::class, OBJECT)
  addVariantMapping(PopupPanel::class, OBJECT)
  addVariantMapping(PortableCompressedTexture2D::class, OBJECT)
  addVariantMapping(PrimitiveMesh::class, OBJECT)
  addVariantMapping(PrismMesh::class, OBJECT)
  addVariantMapping(ProceduralSkyMaterial::class, OBJECT)
  addVariantMapping(ProgressBar::class, OBJECT)
  addVariantMapping(ProjectSettings::class, OBJECT)
  addVariantMapping(PropertyTweener::class, OBJECT)
  addVariantMapping(QuadMesh::class, OBJECT)
  addVariantMapping(QuadOccluder3D::class, OBJECT)
  addVariantMapping(RDAttachmentFormat::class, OBJECT)
  addVariantMapping(RDFramebufferPass::class, OBJECT)
  addVariantMapping(RDPipelineColorBlendState::class, OBJECT)
  addVariantMapping(RDPipelineColorBlendStateAttachment::class, OBJECT)
  addVariantMapping(RDPipelineDepthStencilState::class, OBJECT)
  addVariantMapping(RDPipelineMultisampleState::class, OBJECT)
  addVariantMapping(RDPipelineRasterizationState::class, OBJECT)
  addVariantMapping(RDPipelineSpecializationConstant::class, OBJECT)
  addVariantMapping(RDSamplerState::class, OBJECT)
  addVariantMapping(RDShaderFile::class, OBJECT)
  addVariantMapping(RDShaderSPIRV::class, OBJECT)
  addVariantMapping(RDShaderSource::class, OBJECT)
  addVariantMapping(RDTextureFormat::class, OBJECT)
  addVariantMapping(RDTextureView::class, OBJECT)
  addVariantMapping(RDUniform::class, OBJECT)
  addVariantMapping(RDVertexAttribute::class, OBJECT)
  addVariantMapping(RandomNumberGenerator::class, OBJECT)
  addVariantMapping(Range::class, OBJECT)
  addVariantMapping(RayCast2D::class, OBJECT)
  addVariantMapping(RayCast3D::class, OBJECT)
  addVariantMapping(RectangleShape2D::class, OBJECT)
  addVariantMapping(ReferenceRect::class, OBJECT)
  addVariantMapping(ReflectionProbe::class, OBJECT)
  addVariantMapping(RegEx::class, OBJECT)
  addVariantMapping(RegExMatch::class, OBJECT)
  addVariantMapping(RemoteTransform2D::class, OBJECT)
  addVariantMapping(RemoteTransform3D::class, OBJECT)
  addVariantMapping(RenderData::class, OBJECT)
  addVariantMapping(RenderDataExtension::class, OBJECT)
  addVariantMapping(RenderDataRD::class, OBJECT)
  addVariantMapping(RenderSceneBuffers::class, OBJECT)
  addVariantMapping(RenderSceneBuffersConfiguration::class, OBJECT)
  addVariantMapping(RenderSceneBuffersExtension::class, OBJECT)
  addVariantMapping(RenderSceneBuffersRD::class, OBJECT)
  addVariantMapping(RenderSceneData::class, OBJECT)
  addVariantMapping(RenderSceneDataExtension::class, OBJECT)
  addVariantMapping(RenderSceneDataRD::class, OBJECT)
  addVariantMapping(RenderingDevice::class, OBJECT)
  addVariantMapping(RenderingServer::class, OBJECT)
  addVariantMapping(Resource::class, OBJECT)
  addVariantMapping(ResourceFormatLoader::class, OBJECT)
  addVariantMapping(ResourceFormatSaver::class, OBJECT)
  addVariantMapping(ResourceImporter::class, OBJECT)
  addVariantMapping(ResourceLoader::class, OBJECT)
  addVariantMapping(ResourcePreloader::class, OBJECT)
  addVariantMapping(ResourceSaver::class, OBJECT)
  addVariantMapping(ResourceUID::class, OBJECT)
  addVariantMapping(RetargetModifier3D::class, OBJECT)
  addVariantMapping(RibbonTrailMesh::class, OBJECT)
  addVariantMapping(RichTextEffect::class, OBJECT)
  addVariantMapping(RichTextLabel::class, OBJECT)
  addVariantMapping(RigidBody2D::class, OBJECT)
  addVariantMapping(RigidBody3D::class, OBJECT)
  addVariantMapping(RootMotionView::class, OBJECT)
  addVariantMapping(SceneMultiplayer::class, OBJECT)
  addVariantMapping(SceneReplicationConfig::class, OBJECT)
  addVariantMapping(SceneState::class, OBJECT)
  addVariantMapping(SceneTree::class, OBJECT)
  addVariantMapping(SceneTreeTimer::class, OBJECT)
  addVariantMapping(Script::class, OBJECT)
  addVariantMapping(ScriptExtension::class, OBJECT)
  addVariantMapping(ScriptLanguage::class, OBJECT)
  addVariantMapping(ScriptLanguageExtension::class, OBJECT)
  addVariantMapping(ScrollBar::class, OBJECT)
  addVariantMapping(ScrollContainer::class, OBJECT)
  addVariantMapping(SegmentShape2D::class, OBJECT)
  addVariantMapping(Semaphore::class, OBJECT)
  addVariantMapping(SeparationRayShape2D::class, OBJECT)
  addVariantMapping(SeparationRayShape3D::class, OBJECT)
  addVariantMapping(Separator::class, OBJECT)
  addVariantMapping(Shader::class, OBJECT)
  addVariantMapping(ShaderGlobalsOverride::class, OBJECT)
  addVariantMapping(ShaderInclude::class, OBJECT)
  addVariantMapping(ShaderIncludeDB::class, OBJECT)
  addVariantMapping(ShaderMaterial::class, OBJECT)
  addVariantMapping(Shape2D::class, OBJECT)
  addVariantMapping(Shape3D::class, OBJECT)
  addVariantMapping(ShapeCast2D::class, OBJECT)
  addVariantMapping(ShapeCast3D::class, OBJECT)
  addVariantMapping(Shortcut::class, OBJECT)
  addVariantMapping(Skeleton2D::class, OBJECT)
  addVariantMapping(Skeleton3D::class, OBJECT)
  addVariantMapping(SkeletonIK3D::class, OBJECT)
  addVariantMapping(SkeletonModification2D::class, OBJECT)
  addVariantMapping(SkeletonModification2DCCDIK::class, OBJECT)
  addVariantMapping(SkeletonModification2DFABRIK::class, OBJECT)
  addVariantMapping(SkeletonModification2DJiggle::class, OBJECT)
  addVariantMapping(SkeletonModification2DLookAt::class, OBJECT)
  addVariantMapping(SkeletonModification2DPhysicalBones::class, OBJECT)
  addVariantMapping(SkeletonModification2DStackHolder::class, OBJECT)
  addVariantMapping(SkeletonModification2DTwoBoneIK::class, OBJECT)
  addVariantMapping(SkeletonModificationStack2D::class, OBJECT)
  addVariantMapping(SkeletonModifier3D::class, OBJECT)
  addVariantMapping(SkeletonProfile::class, OBJECT)
  addVariantMapping(SkeletonProfileHumanoid::class, OBJECT)
  addVariantMapping(Skin::class, OBJECT)
  addVariantMapping(SkinReference::class, OBJECT)
  addVariantMapping(Sky::class, OBJECT)
  addVariantMapping(Slider::class, OBJECT)
  addVariantMapping(SliderJoint3D::class, OBJECT)
  addVariantMapping(SoftBody3D::class, OBJECT)
  addVariantMapping(SphereMesh::class, OBJECT)
  addVariantMapping(SphereOccluder3D::class, OBJECT)
  addVariantMapping(SphereShape3D::class, OBJECT)
  addVariantMapping(SpinBox::class, OBJECT)
  addVariantMapping(SplitContainer::class, OBJECT)
  addVariantMapping(SpotLight3D::class, OBJECT)
  addVariantMapping(SpringArm3D::class, OBJECT)
  addVariantMapping(SpringBoneCollision3D::class, OBJECT)
  addVariantMapping(SpringBoneCollisionCapsule3D::class, OBJECT)
  addVariantMapping(SpringBoneCollisionPlane3D::class, OBJECT)
  addVariantMapping(SpringBoneCollisionSphere3D::class, OBJECT)
  addVariantMapping(SpringBoneSimulator3D::class, OBJECT)
  addVariantMapping(Sprite2D::class, OBJECT)
  addVariantMapping(Sprite3D::class, OBJECT)
  addVariantMapping(SpriteBase3D::class, OBJECT)
  addVariantMapping(SpriteFrames::class, OBJECT)
  addVariantMapping(StandardMaterial3D::class, OBJECT)
  addVariantMapping(StaticBody2D::class, OBJECT)
  addVariantMapping(StaticBody3D::class, OBJECT)
  addVariantMapping(StatusIndicator::class, OBJECT)
  addVariantMapping(StreamPeer::class, OBJECT)
  addVariantMapping(StreamPeerBuffer::class, OBJECT)
  addVariantMapping(StreamPeerExtension::class, OBJECT)
  addVariantMapping(StreamPeerGZIP::class, OBJECT)
  addVariantMapping(StreamPeerTCP::class, OBJECT)
  addVariantMapping(StreamPeerTLS::class, OBJECT)
  addVariantMapping(StyleBox::class, OBJECT)
  addVariantMapping(StyleBoxEmpty::class, OBJECT)
  addVariantMapping(StyleBoxFlat::class, OBJECT)
  addVariantMapping(StyleBoxLine::class, OBJECT)
  addVariantMapping(StyleBoxTexture::class, OBJECT)
  addVariantMapping(SubViewport::class, OBJECT)
  addVariantMapping(SubViewportContainer::class, OBJECT)
  addVariantMapping(SubtweenTweener::class, OBJECT)
  addVariantMapping(SurfaceTool::class, OBJECT)
  addVariantMapping(SyntaxHighlighter::class, OBJECT)
  addVariantMapping(SystemFont::class, OBJECT)
  addVariantMapping(TCPServer::class, OBJECT)
  addVariantMapping(TLSOptions::class, OBJECT)
  addVariantMapping(TabBar::class, OBJECT)
  addVariantMapping(TabContainer::class, OBJECT)
  addVariantMapping(TextEdit::class, OBJECT)
  addVariantMapping(TextLine::class, OBJECT)
  addVariantMapping(TextMesh::class, OBJECT)
  addVariantMapping(TextParagraph::class, OBJECT)
  addVariantMapping(TextServer::class, OBJECT)
  addVariantMapping(TextServerAdvanced::class, OBJECT)
  addVariantMapping(TextServerDummy::class, OBJECT)
  addVariantMapping(TextServerExtension::class, OBJECT)
  addVariantMapping(TextServerManager::class, OBJECT)
  addVariantMapping(Texture::class, OBJECT)
  addVariantMapping(Texture2D::class, OBJECT)
  addVariantMapping(Texture2DArray::class, OBJECT)
  addVariantMapping(Texture2DArrayRD::class, OBJECT)
  addVariantMapping(Texture2DRD::class, OBJECT)
  addVariantMapping(Texture3D::class, OBJECT)
  addVariantMapping(Texture3DRD::class, OBJECT)
  addVariantMapping(TextureButton::class, OBJECT)
  addVariantMapping(TextureCubemapArrayRD::class, OBJECT)
  addVariantMapping(TextureCubemapRD::class, OBJECT)
  addVariantMapping(TextureLayered::class, OBJECT)
  addVariantMapping(TextureLayeredRD::class, OBJECT)
  addVariantMapping(TextureProgressBar::class, OBJECT)
  addVariantMapping(TextureRect::class, OBJECT)
  addVariantMapping(Theme::class, OBJECT)
  addVariantMapping(ThemeDB::class, OBJECT)
  addVariantMapping(Thread::class, OBJECT)
  addVariantMapping(TileData::class, OBJECT)
  addVariantMapping(TileMap::class, OBJECT)
  addVariantMapping(TileMapLayer::class, OBJECT)
  addVariantMapping(TileMapPattern::class, OBJECT)
  addVariantMapping(TileSet::class, OBJECT)
  addVariantMapping(TileSetAtlasSource::class, OBJECT)
  addVariantMapping(TileSetScenesCollectionSource::class, OBJECT)
  addVariantMapping(TileSetSource::class, OBJECT)
  addVariantMapping(Time::class, OBJECT)
  addVariantMapping(Timer::class, OBJECT)
  addVariantMapping(TorusMesh::class, OBJECT)
  addVariantMapping(TouchScreenButton::class, OBJECT)
  addVariantMapping(Translation::class, OBJECT)
  addVariantMapping(TranslationDomain::class, OBJECT)
  addVariantMapping(TranslationServer::class, OBJECT)
  addVariantMapping(Tree::class, OBJECT)
  addVariantMapping(TreeItem::class, OBJECT)
  addVariantMapping(TriangleMesh::class, OBJECT)
  addVariantMapping(TubeTrailMesh::class, OBJECT)
  addVariantMapping(Tween::class, OBJECT)
  addVariantMapping(Tweener::class, OBJECT)
  addVariantMapping(UDPServer::class, OBJECT)
  addVariantMapping(UPNP::class, OBJECT)
  addVariantMapping(UPNPDevice::class, OBJECT)
  addVariantMapping(UndoRedo::class, OBJECT)
  addVariantMapping(UniformSetCacheRD::class, OBJECT)
  addVariantMapping(VBoxContainer::class, OBJECT)
  addVariantMapping(VFlowContainer::class, OBJECT)
  addVariantMapping(VScrollBar::class, OBJECT)
  addVariantMapping(VSeparator::class, OBJECT)
  addVariantMapping(VSlider::class, OBJECT)
  addVariantMapping(VSplitContainer::class, OBJECT)
  addVariantMapping(VehicleBody3D::class, OBJECT)
  addVariantMapping(VehicleWheel3D::class, OBJECT)
  addVariantMapping(VideoStream::class, OBJECT)
  addVariantMapping(VideoStreamPlayback::class, OBJECT)
  addVariantMapping(VideoStreamPlayer::class, OBJECT)
  addVariantMapping(VideoStreamTheora::class, OBJECT)
  addVariantMapping(Viewport::class, OBJECT)
  addVariantMapping(ViewportTexture::class, OBJECT)
  addVariantMapping(VisibleOnScreenEnabler2D::class, OBJECT)
  addVariantMapping(VisibleOnScreenEnabler3D::class, OBJECT)
  addVariantMapping(VisibleOnScreenNotifier2D::class, OBJECT)
  addVariantMapping(VisibleOnScreenNotifier3D::class, OBJECT)
  addVariantMapping(VisualInstance3D::class, OBJECT)
  addVariantMapping(VisualShader::class, OBJECT)
  addVariantMapping(VisualShaderNode::class, OBJECT)
  addVariantMapping(VisualShaderNodeBillboard::class, OBJECT)
  addVariantMapping(VisualShaderNodeBooleanConstant::class, OBJECT)
  addVariantMapping(VisualShaderNodeBooleanParameter::class, OBJECT)
  addVariantMapping(VisualShaderNodeClamp::class, OBJECT)
  addVariantMapping(VisualShaderNodeColorConstant::class, OBJECT)
  addVariantMapping(VisualShaderNodeColorFunc::class, OBJECT)
  addVariantMapping(VisualShaderNodeColorOp::class, OBJECT)
  addVariantMapping(VisualShaderNodeColorParameter::class, OBJECT)
  addVariantMapping(VisualShaderNodeComment::class, OBJECT)
  addVariantMapping(VisualShaderNodeCompare::class, OBJECT)
  addVariantMapping(VisualShaderNodeConstant::class, OBJECT)
  addVariantMapping(VisualShaderNodeCubemap::class, OBJECT)
  addVariantMapping(VisualShaderNodeCubemapParameter::class, OBJECT)
  addVariantMapping(VisualShaderNodeCurveTexture::class, OBJECT)
  addVariantMapping(VisualShaderNodeCurveXYZTexture::class, OBJECT)
  addVariantMapping(VisualShaderNodeCustom::class, OBJECT)
  addVariantMapping(VisualShaderNodeDerivativeFunc::class, OBJECT)
  addVariantMapping(VisualShaderNodeDeterminant::class, OBJECT)
  addVariantMapping(VisualShaderNodeDistanceFade::class, OBJECT)
  addVariantMapping(VisualShaderNodeDotProduct::class, OBJECT)
  addVariantMapping(VisualShaderNodeExpression::class, OBJECT)
  addVariantMapping(VisualShaderNodeFaceForward::class, OBJECT)
  addVariantMapping(VisualShaderNodeFloatConstant::class, OBJECT)
  addVariantMapping(VisualShaderNodeFloatFunc::class, OBJECT)
  addVariantMapping(VisualShaderNodeFloatOp::class, OBJECT)
  addVariantMapping(VisualShaderNodeFloatParameter::class, OBJECT)
  addVariantMapping(VisualShaderNodeFrame::class, OBJECT)
  addVariantMapping(VisualShaderNodeFresnel::class, OBJECT)
  addVariantMapping(VisualShaderNodeGlobalExpression::class, OBJECT)
  addVariantMapping(VisualShaderNodeGroupBase::class, OBJECT)
  addVariantMapping(VisualShaderNodeIf::class, OBJECT)
  addVariantMapping(VisualShaderNodeInput::class, OBJECT)
  addVariantMapping(VisualShaderNodeIntConstant::class, OBJECT)
  addVariantMapping(VisualShaderNodeIntFunc::class, OBJECT)
  addVariantMapping(VisualShaderNodeIntOp::class, OBJECT)
  addVariantMapping(VisualShaderNodeIntParameter::class, OBJECT)
  addVariantMapping(VisualShaderNodeIs::class, OBJECT)
  addVariantMapping(VisualShaderNodeLinearSceneDepth::class, OBJECT)
  addVariantMapping(VisualShaderNodeMix::class, OBJECT)
  addVariantMapping(VisualShaderNodeMultiplyAdd::class, OBJECT)
  addVariantMapping(VisualShaderNodeOuterProduct::class, OBJECT)
  addVariantMapping(VisualShaderNodeOutput::class, OBJECT)
  addVariantMapping(VisualShaderNodeParameter::class, OBJECT)
  addVariantMapping(VisualShaderNodeParameterRef::class, OBJECT)
  addVariantMapping(VisualShaderNodeParticleAccelerator::class, OBJECT)
  addVariantMapping(VisualShaderNodeParticleBoxEmitter::class, OBJECT)
  addVariantMapping(VisualShaderNodeParticleConeVelocity::class, OBJECT)
  addVariantMapping(VisualShaderNodeParticleEmit::class, OBJECT)
  addVariantMapping(VisualShaderNodeParticleEmitter::class, OBJECT)
  addVariantMapping(VisualShaderNodeParticleMeshEmitter::class, OBJECT)
  addVariantMapping(VisualShaderNodeParticleMultiplyByAxisAngle::class, OBJECT)
  addVariantMapping(VisualShaderNodeParticleOutput::class, OBJECT)
  addVariantMapping(VisualShaderNodeParticleRandomness::class, OBJECT)
  addVariantMapping(VisualShaderNodeParticleRingEmitter::class, OBJECT)
  addVariantMapping(VisualShaderNodeParticleSphereEmitter::class, OBJECT)
  addVariantMapping(VisualShaderNodeProximityFade::class, OBJECT)
  addVariantMapping(VisualShaderNodeRandomRange::class, OBJECT)
  addVariantMapping(VisualShaderNodeRemap::class, OBJECT)
  addVariantMapping(VisualShaderNodeReroute::class, OBJECT)
  addVariantMapping(VisualShaderNodeResizableBase::class, OBJECT)
  addVariantMapping(VisualShaderNodeRotationByAxis::class, OBJECT)
  addVariantMapping(VisualShaderNodeSDFRaymarch::class, OBJECT)
  addVariantMapping(VisualShaderNodeSDFToScreenUV::class, OBJECT)
  addVariantMapping(VisualShaderNodeSample3D::class, OBJECT)
  addVariantMapping(VisualShaderNodeScreenNormalWorldSpace::class, OBJECT)
  addVariantMapping(VisualShaderNodeScreenUVToSDF::class, OBJECT)
  addVariantMapping(VisualShaderNodeSmoothStep::class, OBJECT)
  addVariantMapping(VisualShaderNodeStep::class, OBJECT)
  addVariantMapping(VisualShaderNodeSwitch::class, OBJECT)
  addVariantMapping(VisualShaderNodeTexture::class, OBJECT)
  addVariantMapping(VisualShaderNodeTexture2DArray::class, OBJECT)
  addVariantMapping(VisualShaderNodeTexture2DArrayParameter::class, OBJECT)
  addVariantMapping(VisualShaderNodeTexture2DParameter::class, OBJECT)
  addVariantMapping(VisualShaderNodeTexture3D::class, OBJECT)
  addVariantMapping(VisualShaderNodeTexture3DParameter::class, OBJECT)
  addVariantMapping(VisualShaderNodeTextureParameter::class, OBJECT)
  addVariantMapping(VisualShaderNodeTextureParameterTriplanar::class, OBJECT)
  addVariantMapping(VisualShaderNodeTextureSDF::class, OBJECT)
  addVariantMapping(VisualShaderNodeTextureSDFNormal::class, OBJECT)
  addVariantMapping(VisualShaderNodeTransformCompose::class, OBJECT)
  addVariantMapping(VisualShaderNodeTransformConstant::class, OBJECT)
  addVariantMapping(VisualShaderNodeTransformDecompose::class, OBJECT)
  addVariantMapping(VisualShaderNodeTransformFunc::class, OBJECT)
  addVariantMapping(VisualShaderNodeTransformOp::class, OBJECT)
  addVariantMapping(VisualShaderNodeTransformParameter::class, OBJECT)
  addVariantMapping(VisualShaderNodeTransformVecMult::class, OBJECT)
  addVariantMapping(VisualShaderNodeUIntConstant::class, OBJECT)
  addVariantMapping(VisualShaderNodeUIntFunc::class, OBJECT)
  addVariantMapping(VisualShaderNodeUIntOp::class, OBJECT)
  addVariantMapping(VisualShaderNodeUIntParameter::class, OBJECT)
  addVariantMapping(VisualShaderNodeUVFunc::class, OBJECT)
  addVariantMapping(VisualShaderNodeUVPolarCoord::class, OBJECT)
  addVariantMapping(VisualShaderNodeVarying::class, OBJECT)
  addVariantMapping(VisualShaderNodeVaryingGetter::class, OBJECT)
  addVariantMapping(VisualShaderNodeVaryingSetter::class, OBJECT)
  addVariantMapping(VisualShaderNodeVec2Constant::class, OBJECT)
  addVariantMapping(VisualShaderNodeVec2Parameter::class, OBJECT)
  addVariantMapping(VisualShaderNodeVec3Constant::class, OBJECT)
  addVariantMapping(VisualShaderNodeVec3Parameter::class, OBJECT)
  addVariantMapping(VisualShaderNodeVec4Constant::class, OBJECT)
  addVariantMapping(VisualShaderNodeVec4Parameter::class, OBJECT)
  addVariantMapping(VisualShaderNodeVectorBase::class, OBJECT)
  addVariantMapping(VisualShaderNodeVectorCompose::class, OBJECT)
  addVariantMapping(VisualShaderNodeVectorDecompose::class, OBJECT)
  addVariantMapping(VisualShaderNodeVectorDistance::class, OBJECT)
  addVariantMapping(VisualShaderNodeVectorFunc::class, OBJECT)
  addVariantMapping(VisualShaderNodeVectorLen::class, OBJECT)
  addVariantMapping(VisualShaderNodeVectorOp::class, OBJECT)
  addVariantMapping(VisualShaderNodeVectorRefract::class, OBJECT)
  addVariantMapping(VisualShaderNodeWorldPositionFromDepth::class, OBJECT)
  addVariantMapping(VoxelGI::class, OBJECT)
  addVariantMapping(VoxelGIData::class, OBJECT)
  addVariantMapping(WeakRef::class, OBJECT)
  addVariantMapping(WebRTCDataChannel::class, OBJECT)
  addVariantMapping(WebRTCDataChannelExtension::class, OBJECT)
  addVariantMapping(WebRTCMultiplayerPeer::class, OBJECT)
  addVariantMapping(WebRTCPeerConnection::class, OBJECT)
  addVariantMapping(WebRTCPeerConnectionExtension::class, OBJECT)
  addVariantMapping(WebSocketMultiplayerPeer::class, OBJECT)
  addVariantMapping(WebSocketPeer::class, OBJECT)
  addVariantMapping(WebXRInterface::class, OBJECT)
  addVariantMapping(Window::class, OBJECT)
  addVariantMapping(WorkerThreadPool::class, OBJECT)
  addVariantMapping(World2D::class, OBJECT)
  addVariantMapping(World3D::class, OBJECT)
  addVariantMapping(WorldBoundaryShape2D::class, OBJECT)
  addVariantMapping(WorldBoundaryShape3D::class, OBJECT)
  addVariantMapping(WorldEnvironment::class, OBJECT)
  addVariantMapping(X509Certificate::class, OBJECT)
  addVariantMapping(XMLParser::class, OBJECT)
  addVariantMapping(XRAnchor3D::class, OBJECT)
  addVariantMapping(XRBodyModifier3D::class, OBJECT)
  addVariantMapping(XRBodyTracker::class, OBJECT)
  addVariantMapping(XRCamera3D::class, OBJECT)
  addVariantMapping(XRController3D::class, OBJECT)
  addVariantMapping(XRControllerTracker::class, OBJECT)
  addVariantMapping(XRFaceModifier3D::class, OBJECT)
  addVariantMapping(XRFaceTracker::class, OBJECT)
  addVariantMapping(XRHandModifier3D::class, OBJECT)
  addVariantMapping(XRHandTracker::class, OBJECT)
  addVariantMapping(XRInterface::class, OBJECT)
  addVariantMapping(XRInterfaceExtension::class, OBJECT)
  addVariantMapping(XRNode3D::class, OBJECT)
  addVariantMapping(XROrigin3D::class, OBJECT)
  addVariantMapping(XRPose::class, OBJECT)
  addVariantMapping(XRPositionalTracker::class, OBJECT)
  addVariantMapping(XRServer::class, OBJECT)
  addVariantMapping(XRTracker::class, OBJECT)
  addVariantMapping(XRVRS::class, OBJECT)
  addVariantMapping(ZIPPacker::class, OBJECT)
  addVariantMapping(ZIPReader::class, OBJECT)
}

public fun registerEngineTypeMethods(): Unit {
  Object.MethodBindings
  RefCounted.MethodBindings
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
  OpenXRExtensionWrapperExtension.MethodBindings
  OpenXRHand.MethodBindings
  OpenXRHapticBase.MethodBindings
  OpenXRHapticVibration.MethodBindings
  OpenXRIPBinding.MethodBindings
  OpenXRIPBindingModifier.MethodBindings
  OpenXRInteractionProfile.MethodBindings
  OpenXRInteractionProfileMetadata.MethodBindings
  OpenXRInterface.MethodBindings
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
  TypeManager.registerEngineType("AnimationNodeExtension", AnimationNodeExtension::class, ::AnimationNodeExtension)
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
  TypeManager.registerEngineType("AudioEffect", AudioEffect::class, ::AudioEffect)
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
  TypeManager.registerEngineType("AudioEffectInstance", AudioEffectInstance::class, ::AudioEffectInstance)
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
  TypeManager.registerEngineType("AudioStreamPlayback", AudioStreamPlayback::class, ::AudioStreamPlayback)
  TypeManager.registerEngineType("AudioStreamPlaybackInteractive", AudioStreamPlaybackInteractive::class, ::AudioStreamPlaybackInteractive)
  TypeManager.registerEngineType("AudioStreamPlaybackOggVorbis", AudioStreamPlaybackOggVorbis::class, ::AudioStreamPlaybackOggVorbis)
  TypeManager.registerEngineType("AudioStreamPlaybackPlaylist", AudioStreamPlaybackPlaylist::class, ::AudioStreamPlaybackPlaylist)
  TypeManager.registerEngineType("AudioStreamPlaybackPolyphonic", AudioStreamPlaybackPolyphonic::class, ::AudioStreamPlaybackPolyphonic)
  TypeManager.registerEngineType("AudioStreamPlaybackResampled", AudioStreamPlaybackResampled::class, ::AudioStreamPlaybackResampled)
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
  TypeManager.registerEngineType("ConvexPolygonShape2D", ConvexPolygonShape2D::class, ::ConvexPolygonShape2D)
  TypeManager.registerEngineType("ConvexPolygonShape3D", ConvexPolygonShape3D::class, ::ConvexPolygonShape3D)
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
  TypeManager.registerEngineType("LookAtModifier3D", LookAtModifier3D::class, ::LookAtModifier3D)
  TypeManager.registerEngineType("MainLoop", MainLoop::class, ::MainLoop)
  TypeManager.registerEngineType("MarginContainer", MarginContainer::class, ::MarginContainer)
  TypeManager.registerEngineType("Marker2D", Marker2D::class, ::Marker2D)
  TypeManager.registerEngineType("Marker3D", Marker3D::class, ::Marker3D)
  TypeManager.registerSingleton("Marshalls") { Marshalls }
  TypeManager.registerEngineType("Marshalls", Marshalls::class) { Marshalls }
  TypeManager.registerEngineType("Material", Material::class, ::Material)
  TypeManager.registerEngineType("MenuBar", MenuBar::class, ::MenuBar)
  TypeManager.registerEngineType("MenuButton", MenuButton::class, ::MenuButton)
  TypeManager.registerEngineType("Mesh", Mesh::class, ::Mesh)
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
  TypeManager.registerEngineType("MovieWriter", MovieWriter::class, ::MovieWriter)
  TypeManager.registerEngineType("MultiMesh", MultiMesh::class, ::MultiMesh)
  TypeManager.registerEngineType("MultiMeshInstance2D", MultiMeshInstance2D::class, ::MultiMeshInstance2D)
  TypeManager.registerEngineType("MultiMeshInstance3D", MultiMeshInstance3D::class, ::MultiMeshInstance3D)
  TypeManager.registerEngineType("MultiplayerAPI", MultiplayerAPI::class, ::MultiplayerAPI)
  TypeManager.registerEngineType("MultiplayerAPIExtension", MultiplayerAPIExtension::class, ::MultiplayerAPIExtension)
  TypeManager.registerEngineType("MultiplayerPeer", MultiplayerPeer::class, ::MultiplayerPeer)
  TypeManager.registerEngineType("MultiplayerPeerExtension", MultiplayerPeerExtension::class, ::MultiplayerPeerExtension)
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
  TypeManager.registerEngineType("OpenXRBindingModifier", OpenXRBindingModifier::class, ::OpenXRBindingModifier)
  TypeManager.registerEngineType("OpenXRCompositionLayer", OpenXRCompositionLayer::class, ::OpenXRCompositionLayer)
  TypeManager.registerEngineType("OpenXRCompositionLayerCylinder", OpenXRCompositionLayerCylinder::class, ::OpenXRCompositionLayerCylinder)
  TypeManager.registerEngineType("OpenXRCompositionLayerEquirect", OpenXRCompositionLayerEquirect::class, ::OpenXRCompositionLayerEquirect)
  TypeManager.registerEngineType("OpenXRCompositionLayerQuad", OpenXRCompositionLayerQuad::class, ::OpenXRCompositionLayerQuad)
  TypeManager.registerEngineType("OpenXRDpadBindingModifier", OpenXRDpadBindingModifier::class, ::OpenXRDpadBindingModifier)
  TypeManager.registerEngineType("OpenXRExtensionWrapperExtension", OpenXRExtensionWrapperExtension::class, ::OpenXRExtensionWrapperExtension)
  TypeManager.registerEngineType("OpenXRHand", OpenXRHand::class, ::OpenXRHand)
  TypeManager.registerEngineType("OpenXRHapticBase", OpenXRHapticBase::class, ::OpenXRHapticBase)
  TypeManager.registerEngineType("OpenXRHapticVibration", OpenXRHapticVibration::class, ::OpenXRHapticVibration)
  TypeManager.registerEngineType("OpenXRIPBinding", OpenXRIPBinding::class, ::OpenXRIPBinding)
  TypeManager.registerEngineType("OpenXRIPBindingModifier", OpenXRIPBindingModifier::class, ::OpenXRIPBindingModifier)
  TypeManager.registerEngineType("OpenXRInteractionProfile", OpenXRInteractionProfile::class, ::OpenXRInteractionProfile)
  TypeManager.registerEngineType("OpenXRInteractionProfileMetadata", OpenXRInteractionProfileMetadata::class, ::OpenXRInteractionProfileMetadata)
  TypeManager.registerEngineType("OpenXRInterface", OpenXRInterface::class, ::OpenXRInterface)
  TypeManager.registerEngineType("OpenXRVisibilityMask", OpenXRVisibilityMask::class, ::OpenXRVisibilityMask)
  TypeManager.registerEngineType("OptimizedTranslation", OptimizedTranslation::class, ::OptimizedTranslation)
  TypeManager.registerEngineType("OptionButton", OptionButton::class, ::OptionButton)
  TypeManager.registerEngineType("PCKPacker", PCKPacker::class, ::PCKPacker)
  TypeManager.registerEngineType("PackedDataContainer", PackedDataContainer::class, ::PackedDataContainer)
  TypeManager.registerEngineType("PackedDataContainerRef", PackedDataContainerRef::class, ::PackedDataContainerRef)
  TypeManager.registerEngineType("PackedScene", PackedScene::class, ::PackedScene)
  TypeManager.registerEngineType("PacketPeer", PacketPeer::class, ::PacketPeer)
  TypeManager.registerEngineType("PacketPeerDTLS", PacketPeerDTLS::class, ::PacketPeerDTLS)
  TypeManager.registerEngineType("PacketPeerExtension", PacketPeerExtension::class, ::PacketPeerExtension)
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
  TypeManager.registerEngineType("PhysicsDirectBodyState2DExtension", PhysicsDirectBodyState2DExtension::class, ::PhysicsDirectBodyState2DExtension)
  TypeManager.registerEngineType("PhysicsDirectBodyState3D", PhysicsDirectBodyState3D::class, ::PhysicsDirectBodyState3D)
  TypeManager.registerEngineType("PhysicsDirectBodyState3DExtension", PhysicsDirectBodyState3DExtension::class, ::PhysicsDirectBodyState3DExtension)
  TypeManager.registerEngineType("PhysicsDirectSpaceState2D", PhysicsDirectSpaceState2D::class, ::PhysicsDirectSpaceState2D)
  TypeManager.registerEngineType("PhysicsDirectSpaceState2DExtension", PhysicsDirectSpaceState2DExtension::class, ::PhysicsDirectSpaceState2DExtension)
  TypeManager.registerEngineType("PhysicsDirectSpaceState3D", PhysicsDirectSpaceState3D::class, ::PhysicsDirectSpaceState3D)
  TypeManager.registerEngineType("PhysicsDirectSpaceState3DExtension", PhysicsDirectSpaceState3DExtension::class, ::PhysicsDirectSpaceState3DExtension)
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
  TypeManager.registerEngineType("PhysicsServer3DRenderingServerHandler", PhysicsServer3DRenderingServerHandler::class, ::PhysicsServer3DRenderingServerHandler)
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
  TypeManager.registerEngineType("SceneMultiplayer", SceneMultiplayer::class, ::SceneMultiplayer)
  TypeManager.registerEngineType("SceneReplicationConfig", SceneReplicationConfig::class, ::SceneReplicationConfig)
  TypeManager.registerEngineType("SceneState", SceneState::class, ::SceneState)
  TypeManager.registerEngineType("SceneTree", SceneTree::class, ::SceneTree)
  TypeManager.registerEngineType("SceneTreeTimer", SceneTreeTimer::class, ::SceneTreeTimer)
  TypeManager.registerEngineType("Script", Script::class, ::Script)
  TypeManager.registerEngineType("ScriptExtension", ScriptExtension::class, ::ScriptExtension)
  TypeManager.registerEngineType("ScriptLanguage", ScriptLanguage::class, ::ScriptLanguage)
  TypeManager.registerEngineType("ScriptLanguageExtension", ScriptLanguageExtension::class, ::ScriptLanguageExtension)
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
  TypeManager.registerEngineType("StreamPeerExtension", StreamPeerExtension::class, ::StreamPeerExtension)
  TypeManager.registerEngineType("StreamPeerGZIP", StreamPeerGZIP::class, ::StreamPeerGZIP)
  TypeManager.registerEngineType("StreamPeerTCP", StreamPeerTCP::class, ::StreamPeerTCP)
  TypeManager.registerEngineType("StreamPeerTLS", StreamPeerTLS::class, ::StreamPeerTLS)
  TypeManager.registerEngineType("StyleBox", StyleBox::class, ::StyleBox)
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
  TypeManager.registerEngineType("TextServerExtension", TextServerExtension::class, ::TextServerExtension)
  TypeManager.registerSingleton("TextServerManager") { TextServerManager }
  TypeManager.registerEngineType("TextServerManager", TextServerManager::class) { TextServerManager }
  TypeManager.registerEngineType("Texture", Texture::class, ::Texture)
  TypeManager.registerEngineType("Texture2D", Texture2D::class, ::Texture2D)
  TypeManager.registerEngineType("Texture2DArray", Texture2DArray::class, ::Texture2DArray)
  TypeManager.registerEngineType("Texture2DArrayRD", Texture2DArrayRD::class, ::Texture2DArrayRD)
  TypeManager.registerEngineType("Texture2DRD", Texture2DRD::class, ::Texture2DRD)
  TypeManager.registerEngineType("Texture3D", Texture3D::class, ::Texture3D)
  TypeManager.registerEngineType("Texture3DRD", Texture3DRD::class, ::Texture3DRD)
  TypeManager.registerEngineType("TextureButton", TextureButton::class, ::TextureButton)
  TypeManager.registerEngineType("TextureCubemapArrayRD", TextureCubemapArrayRD::class, ::TextureCubemapArrayRD)
  TypeManager.registerEngineType("TextureCubemapRD", TextureCubemapRD::class, ::TextureCubemapRD)
  TypeManager.registerEngineType("TextureLayered", TextureLayered::class, ::TextureLayered)
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
  TypeManager.registerEngineType("VideoStreamPlayback", VideoStreamPlayback::class, ::VideoStreamPlayback)
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
  TypeManager.registerEngineType("WebRTCDataChannelExtension", WebRTCDataChannelExtension::class, ::WebRTCDataChannelExtension)
  TypeManager.registerEngineType("WebRTCMultiplayerPeer", WebRTCMultiplayerPeer::class, ::WebRTCMultiplayerPeer)
  TypeManager.registerEngineType("WebRTCPeerConnection", WebRTCPeerConnection::class, ::WebRTCPeerConnection)
  TypeManager.registerEngineType("WebRTCPeerConnectionExtension", WebRTCPeerConnectionExtension::class, ::WebRTCPeerConnectionExtension)
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
