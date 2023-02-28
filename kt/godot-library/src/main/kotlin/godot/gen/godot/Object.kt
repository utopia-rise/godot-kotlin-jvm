// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Callable
import godot.core.Dictionary
import godot.core.GodotError
import godot.core.KtObject
import godot.core.NodePath
import godot.core.PackedStringArray
import godot.core.StringName
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.CALLABLE
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.asStringName
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.Signal10
import godot.signals.Signal2
import godot.signals.Signal3
import godot.signals.Signal4
import godot.signals.Signal5
import godot.signals.Signal6
import godot.signals.Signal7
import godot.signals.Signal8
import godot.signals.Signal9
import godot.signals.signal
import godot.util.camelToSnakeCase
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.reflect.KCallable

/**
 * Base class for all other classes in the engine.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/best_practices/godot_notifications.html]($DOCS_URL/tutorials/best_practices/godot_notifications.html)
 *
 * An advanced [Variant] type. All classes in the engine inherit from Object. Each class may define new properties, methods or signals, which are available to all inheriting classes. For example, a [godot.Sprite2D] instance is able to call [godot.Node.addChild] because it inherits from [godot.Node].
 *
 * You can create new instances, using `Object.new()` in GDScript, or `new Object` in C#.
 *
 * To delete an Object instance, call [free]. This is necessary for most classes inheriting Object, because they do not manage memory on their own, and will otherwise cause memory leaks when no longer in use. There are a few classes that perform memory management. For example, [godot.RefCounted] (and by extension [godot.Resource]) deletes itself when no longer referenced, and [godot.Node] deletes its children when freed.
 *
 * Objects can have a [godot.Script] attached to them. Once the [godot.Script] is instantiated, it effectively acts as an extension to the base class, allowing it to define and inherit new properties, methods and signals.
 *
 * Inside a [godot.Script], [_getPropertyList] may be overridden to customize properties in several ways. This allows them to be available to the editor, display as lists of options, sub-divide into groups, save on disk, etc. Scripting languages offer easier ways to customize properties, such as with the [annotation @GDScript.@export] annotation.
 *
 * Godot is very dynamic. An object's script, and therefore its properties, methods and signals, can be changed at run-time. Because of this, there can be occasions where, for example, a property required by a method may not exist. To prevent run-time errors, see methods such as [set], [get], [call], [hasMethod], [hasSignal], etc. Note that these methods are **much** slower than direct references.
 *
 * In GDScript, you can also check if a given property, method, or signal name exists in an object with the `in` operator:
 *
 * ```
 * 		var node = Node.new()
 * 		print("name" in node)         # Prints true
 * 		print("get_parent" in node)   # Prints true
 * 		print("tree_entered" in node) # Prints true
 * 		print("unknown" in node)      # Prints false
 * 		```
 *
 * Notifications are [int] constants commonly sent and received by objects. For example, on every rendered frame, the [godot.SceneTree] notifies nodes inside the tree with a [godot.Node.NOTIFICATION_PROCESS]. The nodes receive it and may call [godot.Node.Process] to update. To make use of notifications, see [notification] and [_notification].
 *
 * Lastly, every object can also contain metadata (data about data). [setMeta] can be useful to store information that the object itself does not depend on. To keep your code clean, making excessive use of metadata is discouraged.
 *
 * **Note:** Unlike references to a [godot.RefCounted], references to an object stored in a variable can become invalid without being set to `null`. To check if an object has been deleted, do *not* compare it against `null`. Instead, use [@GlobalScope.isInstanceValid]. It's also recommended to inherit from [godot.RefCounted] for classes storing data instead of [godot.Object].
 *
 * **Note:** The `script` is not exposed like most properties. To set or get an object's [godot.Script] in code, use [setScript] and [getScript], respectively.
 */
@GodotBaseType
public open class Object : KtObject() {
  /**
   * Emitted when the object's script is changed.
   *
   * **Note:** When this signal is emitted, the new script is not initialized yet. If you need to access the new script, defer connections to this signal with [CONNECT_DEFERRED].
   */
  public val scriptChanged: Signal0 by signal()

  /**
   * Emitted when [notifyPropertyListChanged] is called.
   */
  public val propertyListChanged: Signal0 by signal()

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_OBJECT, scriptIndex)
    return true
  }

  public fun Signal0.emit(): Unit {
    emit(this@Object)
  }

  public inline fun <reified K : () -> Unit> Signal0.connect(
    target: Object,
    method: K,
    flags: Long = 0
  ): GodotError {
    val methodName = (method as KCallable<*>).name.camelToSnakeCase().asStringName()
    return connect(Callable(target, methodName), flags)
  }

  public fun <A0> Signal1<A0>.emit(a0: A0): Unit {
    emit(this@Object, a0)
  }

  public inline fun <A0, reified K : (A0) -> Unit> Signal1<A0>.connect(
    target: Object,
    method: K,
    flags: Long = 0
  ): GodotError {
    val methodName = (method as KCallable<*>).name.camelToSnakeCase().asStringName()
    return connect(Callable(target, methodName), flags)
  }

  public fun <A0, A1> Signal2<A0, A1>.emit(a0: A0, a1: A1): Unit {
    emit(this@Object, a0, a1)
  }

  public inline fun <A0, A1, reified K : (A0, A1) -> Unit> Signal2<A0, A1>.connect(
    target: Object,
    method: K,
    flags: Long = 0
  ): GodotError {
    val methodName = (method as KCallable<*>).name.camelToSnakeCase().asStringName()
    return connect(Callable(target, methodName), flags)
  }

  public fun <A0, A1, A2> Signal3<A0, A1, A2>.emit(
    a0: A0,
    a1: A1,
    a2: A2
  ): Unit {
    emit(this@Object, a0, a1, a2)
  }

  public inline fun <A0, A1, A2, reified K : (
    A0,
    A1,
    A2
  ) -> Unit> Signal3<A0, A1, A2>.connect(
    target: Object,
    method: K,
    flags: Long = 0
  ): GodotError {
    val methodName = (method as KCallable<*>).name.camelToSnakeCase().asStringName()
    return connect(Callable(target, methodName), flags)
  }

  public fun <A0, A1, A2, A3> Signal4<A0, A1, A2, A3>.emit(
    a0: A0,
    a1: A1,
    a2: A2,
    a3: A3
  ): Unit {
    emit(this@Object, a0, a1, a2, a3)
  }

  public inline fun <A0, A1, A2, A3, reified K : (
    A0,
    A1,
    A2,
    A3
  ) -> Unit> Signal4<A0, A1, A2, A3>.connect(
    target: Object,
    method: K,
    flags: Long = 0
  ): GodotError {
    val methodName = (method as KCallable<*>).name.camelToSnakeCase().asStringName()
    return connect(Callable(target, methodName), flags)
  }

  public fun <A0, A1, A2, A3, A4> Signal5<A0, A1, A2, A3, A4>.emit(
    a0: A0,
    a1: A1,
    a2: A2,
    a3: A3,
    a4: A4
  ): Unit {
    emit(this@Object, a0, a1, a2, a3, a4)
  }

  public inline fun <A0, A1, A2, A3, A4, reified K : (
    A0,
    A1,
    A2,
    A3,
    A4
  ) -> Unit> Signal5<A0, A1, A2, A3, A4>.connect(
    target: Object,
    method: K,
    flags: Long = 0
  ): GodotError {
    val methodName = (method as KCallable<*>).name.camelToSnakeCase().asStringName()
    return connect(Callable(target, methodName), flags)
  }

  public fun <A0, A1, A2, A3, A4, A5> Signal6<A0, A1, A2, A3, A4, A5>.emit(
    a0: A0,
    a1: A1,
    a2: A2,
    a3: A3,
    a4: A4,
    a5: A5
  ): Unit {
    emit(this@Object, a0, a1, a2, a3, a4, a5)
  }

  public inline fun <A0, A1, A2, A3, A4, A5, reified K : (
    A0,
    A1,
    A2,
    A3,
    A4,
    A5
  ) -> Unit> Signal6<A0, A1, A2, A3, A4, A5>.connect(
    target: Object,
    method: K,
    flags: Long = 0
  ): GodotError {
    val methodName = (method as KCallable<*>).name.camelToSnakeCase().asStringName()
    return connect(Callable(target, methodName), flags)
  }

  public fun <A0, A1, A2, A3, A4, A5, A6> Signal7<A0, A1, A2, A3, A4, A5, A6>.emit(
    a0: A0,
    a1: A1,
    a2: A2,
    a3: A3,
    a4: A4,
    a5: A5,
    a6: A6
  ): Unit {
    emit(this@Object, a0, a1, a2, a3, a4, a5, a6)
  }

  public inline fun <A0, A1, A2, A3, A4, A5, A6, reified K : (
    A0,
    A1,
    A2,
    A3,
    A4,
    A5,
    A6
  ) -> Unit> Signal7<A0, A1, A2, A3, A4, A5, A6>.connect(
    target: Object,
    method: K,
    flags: Long = 0
  ): GodotError {
    val methodName = (method as KCallable<*>).name.camelToSnakeCase().asStringName()
    return connect(Callable(target, methodName), flags)
  }

  public fun <A0, A1, A2, A3, A4, A5, A6, A7> Signal8<A0, A1, A2, A3, A4, A5, A6, A7>.emit(
    a0: A0,
    a1: A1,
    a2: A2,
    a3: A3,
    a4: A4,
    a5: A5,
    a6: A6,
    a7: A7
  ): Unit {
    emit(this@Object, a0, a1, a2, a3, a4, a5, a6, a7)
  }

  public inline fun <A0, A1, A2, A3, A4, A5, A6, A7, reified K : (
    A0,
    A1,
    A2,
    A3,
    A4,
    A5,
    A6,
    A7
  ) -> Unit> Signal8<A0, A1, A2, A3, A4, A5, A6, A7>.connect(
    target: Object,
    method: K,
    flags: Long = 0
  ): GodotError {
    val methodName = (method as KCallable<*>).name.camelToSnakeCase().asStringName()
    return connect(Callable(target, methodName), flags)
  }

  public fun <A0, A1, A2, A3, A4, A5, A6, A7, A8> Signal9<A0, A1, A2, A3, A4, A5, A6, A7, A8>.emit(
    a0: A0,
    a1: A1,
    a2: A2,
    a3: A3,
    a4: A4,
    a5: A5,
    a6: A6,
    a7: A7,
    a8: A8
  ): Unit {
    emit(this@Object, a0, a1, a2, a3, a4, a5, a6, a7, a8)
  }

  public inline fun <A0, A1, A2, A3, A4, A5, A6, A7, A8, reified K : (
    A0,
    A1,
    A2,
    A3,
    A4,
    A5,
    A6,
    A7,
    A8
  ) -> Unit> Signal9<A0, A1, A2, A3, A4, A5, A6, A7, A8>.connect(
    target: Object,
    method: K,
    flags: Long = 0
  ): GodotError {
    val methodName = (method as KCallable<*>).name.camelToSnakeCase().asStringName()
    return connect(Callable(target, methodName), flags)
  }

  public fun <A0, A1, A2, A3, A4, A5, A6, A7, A8, A9>
      Signal10<A0, A1, A2, A3, A4, A5, A6, A7, A8, A9>.emit(
    a0: A0,
    a1: A1,
    a2: A2,
    a3: A3,
    a4: A4,
    a5: A5,
    a6: A6,
    a7: A7,
    a8: A8,
    a9: A9
  ): Unit {
    emit(this@Object, a0, a1, a2, a3, a4, a5, a6, a7, a8, a9)
  }

  public inline fun <A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, reified K : (
    A0,
    A1,
    A2,
    A3,
    A4,
    A5,
    A6,
    A7,
    A8,
    A9
  ) -> Unit> Signal10<A0, A1, A2, A3, A4, A5, A6, A7, A8, A9>.connect(
    target: Object,
    method: K,
    flags: Long = 0
  ): GodotError {
    val methodName = (method as KCallable<*>).name.camelToSnakeCase().asStringName()
    return connect(Callable(target, methodName), flags)
  }

  /**
   * Returns the object's built-in class name, as a [godot.String]. See also [isClass].
   *
   * **Note:** This method ignores `class_name` declarations. If this object's script has defined a `class_name`, the base, built-in class name is returned instead.
   */
  public fun getClass(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_GET_CLASS, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns `true` if the object inherits from the given [class]. See also [getClass].
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * var sprite2d = Sprite2D.new()
   *
   * sprite2d.is_class("Sprite2D") # Returns true
   *
   * sprite2d.is_class("Node")     # Returns true
   *
   * sprite2d.is_class("Node3D")   # Returns false
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * var sprite2D = new Sprite2D();
   *
   * sprite2D.IsClass("Sprite2D"); // Returns true
   *
   * sprite2D.IsClass("Node");     // Returns true
   *
   * sprite2D.IsClass("Node3D");   // Returns false
   *
   * [/csharp]
   *
   * [/codeblocks]
   *
   * **Note:** This method ignores `class_name` declarations in the object's script.
   */
  public fun isClass(_class: String): Boolean {
    TransferContext.writeArguments(STRING to _class)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_IS_CLASS, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Assigns [value] to the given [property]. If the property does not exist or the given [value]'s type doesn't match, nothing happens.
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * var node = Node2D.new()
   *
   * node.set("global_scale", Vector2(8, 2.5))
   *
   * print(node.global_scale) # Prints (8, 2.5)
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * var node = new Node2D();
   *
   * node.Set("global_scale", new Vector2(8, 2.5));
   *
   * GD.Print(node.GlobalScale); // Prints Vector2(8, 2.5)
   *
   * [/csharp]
   *
   * [/codeblocks]
   *
   * **Note:** In C#, [property] must be in snake_case when referring to built-in Godot properties. Prefer using the names exposed in the `PropertyName` class to avoid allocating a new [godot.StringName] on each call.
   */
  public fun `set`(`property`: StringName, `value`: Any): Unit {
    TransferContext.writeArguments(STRING_NAME to property, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_SET, NIL)
  }

  /**
   * Returns the [Variant] value of the given [property]. If the [property] does not exist, this method returns `null`.
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * var node = Node2D.new()
   *
   * node.rotation = 1.5
   *
   * var a = node.get("rotation") # a is 1.5
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * var node = new Node2D();
   *
   * node.Rotation = 1.5f;
   *
   * var a = node.Get("rotation"); // a is 1.5
   *
   * [/csharp]
   *
   * [/codeblocks]
   *
   * **Note:** In C#, [property] must be in snake_case when referring to built-in Godot properties. Prefer using the names exposed in the `PropertyName` class to avoid allocating a new [godot.StringName] on each call.
   */
  public fun `get`(`property`: StringName): Any? {
    TransferContext.writeArguments(STRING_NAME to property)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_GET, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Assigns a new [value] to the property identified by the [propertyPath]. The path should be a [godot.core.NodePath] relative to this object, and can use the colon character (`:`) to access nested properties.
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * var node = Node2D.new()
   *
   * node.set_indexed("position", Vector2(42, 0))
   *
   * node.set_indexed("position:y", -10)
   *
   * print(node.position) # Prints (42, -10)
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * var node = new Node2D();
   *
   * node.SetIndexed("position", new Vector2(42, 0));
   *
   * node.SetIndexed("position:y", -10);
   *
   * GD.Print(node.Position); // Prints (42, -10)
   *
   * [/csharp]
   *
   * [/codeblocks]
   *
   * **Note:** In C#, [propertyPath] must be in snake_case when referring to built-in Godot properties. Prefer using the names exposed in the `PropertyName` class to avoid allocating a new [godot.StringName] on each call.
   */
  public fun setIndexed(propertyPath: NodePath, `value`: Any): Unit {
    TransferContext.writeArguments(NODE_PATH to propertyPath, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_SET_INDEXED, NIL)
  }

  /**
   * Gets the object's property indexed by the given [propertyPath]. The path should be a [godot.core.NodePath] relative to the current object and can use the colon character (`:`) to access nested properties.
   *
   * **Examples:** `"position:x"` or `"material:next_pass:blend_mode"`.
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * var node = Node2D.new()
   *
   * node.position = Vector2(5, -10)
   *
   * var a = node.get_indexed("position")   # a is Vector2(5, -10)
   *
   * var b = node.get_indexed("position:y") # b is -10
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * var node = new Node2D();
   *
   * node.Position = new Vector2(5, -10);
   *
   * var a = node.GetIndexed("position");   // a is Vector2(5, -10)
   *
   * var b = node.GetIndexed("position:y"); // b is -10
   *
   * [/csharp]
   *
   * [/codeblocks]
   *
   * **Note:** In C#, [propertyPath] must be in snake_case when referring to built-in Godot properties. Prefer using the names exposed in the `PropertyName` class to avoid allocating a new [godot.StringName] on each call.
   *
   * **Note:** This method does not support actual paths to nodes in the [godot.SceneTree], only sub-property paths. In the context of nodes, use [godot.Node.getNodeAndResource] instead.
   */
  public fun getIndexed(propertyPath: NodePath): Any? {
    TransferContext.writeArguments(NODE_PATH to propertyPath)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_GET_INDEXED, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Returns the object's property list as an [godot.Array] of dictionaries. Each [godot.core.Dictionary] contains the following entries:
   *
   * - `name` is the property's name, as a [godot.String];
   *
   * - `class_name` is an empty [godot.StringName], unless the property is [TYPE_OBJECT] and it inherits from a class;
   *
   * - `type` is the property's type, as an [int] (see [enum Variant.Type]);
   *
   * - `hint` is *how* the property is meant to be edited (see [enum PropertyHint]);
   *
   * - `hint_string` depends on the hint (see [enum PropertyHint]);
   *
   * - `usage` is a combination of [enum PropertyUsageFlags].
   */
  public fun getPropertyList(): VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_GET_PROPERTY_LIST, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Dictionary<Any?, Any?>>
  }

  /**
   * Returns this object's methods and their signatures as an [godot.Array] of dictionaries. Each [godot.core.Dictionary] contains the following entries:
   *
   * - `name` is the name of the method, as a [godot.String];
   *
   * - `args` is an [godot.Array] of dictionaries representing the arguments;
   *
   * - `default_args` is the default arguments as an [godot.Array] of variants;
   *
   * - `flags` is a combination of [enum MethodFlags];
   *
   * - `id` is the method's internal identifier [int];
   *
   * - `return` is the returned value, as a [godot.core.Dictionary];
   *
   * **Note:** The dictionaries of `args` and `return` are formatted identically to the results of [getPropertyList], although not all entries are used.
   */
  public fun getMethodList(): VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_GET_METHOD_LIST, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Dictionary<Any?, Any?>>
  }

  /**
   * Returns `true` if the given [property] has a custom default value. Use [propertyGetRevert] to get the [property]'s default value.
   *
   * **Note:** This method is used by the Inspector dock to display a revert icon. The object must implement [_propertyCanRevert] to customize the default value. If [_propertyCanRevert] is not implemented, this method returns `false`.
   */
  public fun propertyCanRevert(`property`: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to property)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_PROPERTY_CAN_REVERT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the custom default value of the given [property]. Use [propertyCanRevert] to check if the [property] has a custom default value.
   *
   * **Note:** This method is used by the Inspector dock to display a revert icon. The object must implement [_propertyGetRevert] to customize the default value. If [_propertyGetRevert] is not implemented, this method returns `null`.
   */
  public fun propertyGetRevert(`property`: StringName): Any? {
    TransferContext.writeArguments(STRING_NAME to property)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_PROPERTY_GET_REVERT, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Sends the given [what] notification to all classes inherited by the object, triggering calls to [_notification], starting from the highest ancestor (the [godot.Object] class) and going down to the object's script.
   *
   * If [reversed] is `true`, the call order is reversed.
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * var player = Node2D.new()
   *
   * player.set_script(load("res://player.gd"))
   *
   *
   *
   * player.notification(NOTIFICATION_ENTER_TREE)
   *
   * # The call order is Object -> Node -> Node2D -> player.gd.
   *
   *
   *
   * player.notification(NOTIFICATION_ENTER_TREE, true)
   *
   * # The call order is player.gd -> Node2D -> Node -> Object.
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * var player = new Node2D();
   *
   * player.SetScript(GD.Load("res://player.gd"));
   *
   *
   *
   * player.Notification(NotificationEnterTree);
   *
   * // The call order is GodotObject -> Node -> Node2D -> player.gd.
   *
   *
   *
   * player.Notification(NotificationEnterTree, true);
   *
   * // The call order is player.gd -> Node2D -> Node -> GodotObject.
   *
   * [/csharp]
   *
   * [/codeblocks]
   */
  public fun notification(what: Long, reversed: Boolean = false): Unit {
    TransferContext.writeArguments(LONG to what, BOOL to reversed)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_NOTIFICATION, NIL)
  }

  /**
   * Returns a [godot.String] representing the object. Defaults to `"<ClassName#RID>"`. Override [_toString] to customize the string representation of the object.
   */
  public override fun toString(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_TO_STRING, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the object's unique instance ID. This ID can be saved in [godot.EncodedObjectAsID], and can be used to retrieve this object instance with [@GlobalScope.instanceFromId].
   */
  public fun getInstanceId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_GET_INSTANCE_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Attaches [script] to the object, and instantiates it. As a result, the script's [_init] is called. A [godot.Script] is used to extend the object's functionality.
   *
   * If a script already exists, its instance is detached, and its property values and state are lost. Built-in property values are still kept.
   */
  public fun setScript(script: Any): Unit {
    TransferContext.writeArguments(ANY to script)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_SET_SCRIPT, NIL)
  }

  /**
   * Returns the object's [godot.Script] instance, or `null` if no script is attached.
   */
  public fun getScript(): Any? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_GET_SCRIPT, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Adds or changes the entry [name] inside the object's metadata. The metadata [value] can be any [Variant], although some types cannot be serialized correctly.
   *
   * If [value] is `null`, the entry is removed. This is the equivalent of using [removeMeta]. See also [hasMeta] and [getMeta].
   *
   * **Note:** Metadata that has a [name] starting with an underscore (`_`) is considered editor-only. Editor-only metadata is not displayed in the Inspector dock and should not be edited.
   */
  public fun setMeta(name: StringName, `value`: Any): Unit {
    TransferContext.writeArguments(STRING_NAME to name, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_SET_META, NIL)
  }

  /**
   * Removes the given entry [name] from the object's metadata. See also [hasMeta], [getMeta] and [setMeta].
   *
   * **Note:** Metadata that has a [name] starting with an underscore (`_`) is considered editor-only. Editor-only metadata is not displayed in the Inspector and should not be edited.
   */
  public fun removeMeta(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_REMOVE_META, NIL)
  }

  /**
   * Returns the object's metadata value for the given entry [name]. If the entry does not exist, returns [default]. If [default] is `null`, an error is also generated.
   *
   * **Note:** Metadata that has a [name] starting with an underscore (`_`) is considered editor-only. Editor-only metadata is not displayed in the Inspector dock and should not be edited.
   */
  public fun getMeta(name: StringName, default: Any? = null): Any? {
    TransferContext.writeArguments(STRING_NAME to name, ANY to default)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_GET_META, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Returns `true` if a metadata entry is found with the given [name]. See also [getMeta], [setMeta] and [removeMeta].
   *
   * **Note:** Metadata that has a [name] starting with an underscore (`_`) is considered editor-only. Editor-only metadata is not displayed in the Inspector and should not be edited, although it can still be found by this method.
   */
  public fun hasMeta(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_HAS_META, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the object's metadata entry names as a [godot.PackedStringArray].
   */
  public fun getMetaList(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_GET_META_LIST,
        PACKED_STRING_ARRAY)
    return TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray
  }

  /**
   * Adds a user-defined [signal]. Optional arguments for the signal can be added as an [godot.Array] of dictionaries, each defining a `name` [godot.String] and a `type` [int] (see [enum Variant.Type]). See also [hasUserSignal].
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * add_user_signal("hurt", [
   *
   *     { "name": "damage", "type": TYPE_INT },
   *
   *     { "name": "source", "type": TYPE_OBJECT }
   *
   * ])
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * AddUserSignal("Hurt", new Godot.Collections.Array()
   *
   * {
   *
   *     new Godot.Collections.Dictionary()
   *
   *     {
   *
   *         { "name", "damage" },
   *
   *         { "type", (int)Variant.Type.Int }
   *
   *     },
   *
   *     new Godot.Collections.Dictionary()
   *
   *     {
   *
   *         { "name", "source" },
   *
   *         { "type", (int)Variant.Type.Object }
   *
   *     }
   *
   * });
   *
   * [/csharp]
   *
   * [/codeblocks]
   */
  public fun addUserSignal(signal: String, arguments: VariantArray<Any?> =
      godot.core.variantArrayOf()): Unit {
    TransferContext.writeArguments(STRING to signal, ARRAY to arguments)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_ADD_USER_SIGNAL, NIL)
  }

  /**
   * Returns `true` if the given user-defined [signal] name exists. Only signals added with [addUserSignal] are included.
   */
  public fun hasUserSignal(signal: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to signal)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_HAS_USER_SIGNAL, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Emits the given [signal] by name. The signal must exist, so it should be a built-in signal of this class or one of its inherited classes, or a user-defined signal (see [addUserSignal]). This method supports a variable number of arguments, so parameters can be passed as a comma separated list.
   *
   * Returns [ERR_UNAVAILABLE] if [signal] does not exist or the parameters are invalid.
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * emit_signal("hit", "sword", 100)
   *
   * emit_signal("game_over")
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * EmitSignal(SignalName.Hit, "sword", 100);
   *
   * EmitSignal(SignalName.GameOver);
   *
   * [/csharp]
   *
   * [/codeblocks]
   *
   * **Note:** In C#, [signal] must be in snake_case when referring to built-in Godot signals. Prefer using the names exposed in the `SignalName` class to avoid allocating a new [godot.StringName] on each call.
   */
  public fun emitSignal(signal: StringName, vararg __var_args: Any?): GodotError {
    TransferContext.writeArguments(STRING_NAME to signal,  *__var_args.map { ANY to it }.toTypedArray())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_EMIT_SIGNAL, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Calls the [method] on the object and returns the result. This method supports a variable number of arguments, so parameters can be passed as a comma separated list.
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * var node = Node3D.new()
   *
   * node.call("rotate", Vector3(1.0, 0.0, 0.0), 1.571)
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * var node = new Node3D();
   *
   * node.Call(Node3D.MethodName.Rotate, new Vector3(1f, 0f, 0f), 1.571f);
   *
   * [/csharp]
   *
   * [/codeblocks]
   *
   * **Note:** In C#, [method] must be in snake_case when referring to built-in Godot methods. Prefer using the names exposed in the `MethodName` class to avoid allocating a new [godot.StringName] on each call.
   */
  public fun call(method: StringName, vararg __var_args: Any?): Any? {
    TransferContext.writeArguments(STRING_NAME to method,  *__var_args.map { ANY to it }.toTypedArray())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_CALL, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Calls the [method] on the object during idle time. This method supports a variable number of arguments, so parameters can be passed as a comma separated list.
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * var node = Node3D.new()
   *
   * node.call_deferred("rotate", Vector3(1.0, 0.0, 0.0), 1.571)
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * var node = new Node3D();
   *
   * node.CallDeferred(Node3D.MethodName.Rotate, new Vector3(1f, 0f, 0f), 1.571f);
   *
   * [/csharp]
   *
   * [/codeblocks]
   *
   * **Note:** In C#, [method] must be in snake_case when referring to built-in Godot methods. Prefer using the names exposed in the `MethodName` class to avoid allocating a new [godot.StringName] on each call.
   */
  public fun callDeferred(method: StringName, vararg __var_args: Any?): Any? {
    TransferContext.writeArguments(STRING_NAME to method,  *__var_args.map { ANY to it }.toTypedArray())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_CALL_DEFERRED, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Assigns [value] to the given [property], after the current frame's physics step. This is equivalent to calling [set] through [callDeferred].
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * var node = Node2D.new()
   *
   * add_child(node)
   *
   *
   *
   * node.rotation = 45.0
   *
   * node.set_deferred("rotation", 90.0)
   *
   * print(node.rotation) # Prints 45.0
   *
   *
   *
   * await get_tree().process_frame
   *
   * print(node.rotation) # Prints 90.0
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * var node = new Node2D();
   *
   * node.Rotation = 45f;
   *
   * node.SetDeferred("rotation", 90f);
   *
   * GD.Print(node.Rotation); // Prints 45.0
   *
   *
   *
   * await ToSignal(GetTree(), SceneTree.SignalName.ProcessFrame);
   *
   * GD.Print(node.Rotation); // Prints 90.0
   *
   * [/csharp]
   *
   * [/codeblocks]
   *
   * **Note:** In C#, [property] must be in snake_case when referring to built-in Godot properties. Prefer using the names exposed in the `PropertyName` class to avoid allocating a new [godot.StringName] on each call.
   */
  public fun setDeferred(`property`: StringName, `value`: Any): Unit {
    TransferContext.writeArguments(STRING_NAME to property, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_SET_DEFERRED, NIL)
  }

  /**
   * Calls the [method] on the object and returns the result. Unlike [call], this method expects all parameters to be contained inside [argArray].
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * var node = Node3D.new()
   *
   * node.callv("rotate", [godot.Vector3(1.0, 0.0, 0.0), 1.571])
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * var node = new Node3D();
   *
   * node.Callv(Node3D.MethodName.Rotate, new Godot.Collections.Array { new Vector3(1f, 0f, 0f), 1.571f });
   *
   * [/csharp]
   *
   * [/codeblocks]
   *
   * **Note:** In C#, [method] must be in snake_case when referring to built-in Godot methods. Prefer using the names exposed in the `MethodName` class to avoid allocating a new [godot.StringName] on each call.
   */
  public fun callv(method: StringName, argArray: VariantArray<Any?>): Any? {
    TransferContext.writeArguments(STRING_NAME to method, ARRAY to argArray)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_CALLV, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Returns `true` if the the given [method] name exists in the object.
   *
   * **Note:** In C#, [method] must be in snake_case when referring to built-in Godot methods. Prefer using the names exposed in the `MethodName` class to avoid allocating a new [godot.StringName] on each call.
   */
  public fun hasMethod(method: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to method)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_HAS_METHOD, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the given [signal] name exists in the object.
   *
   * **Note:** In C#, [signal] must be in snake_case when referring to built-in Godot methods. Prefer using the names exposed in the `SignalName` class to avoid allocating a new [godot.StringName] on each call.
   */
  public fun hasSignal(signal: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to signal)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_HAS_SIGNAL, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the list of existing signals as an [godot.Array] of dictionaries.
   *
   * **Note:** Due of the implementation, each [godot.core.Dictionary] is formatted very similarly to the returned values of [getMethodList].
   */
  public fun getSignalList(): VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_GET_SIGNAL_LIST, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Dictionary<Any?, Any?>>
  }

  /**
   * Returns an [godot.Array] of connections for the given [signal] name. Each connection is represented as a [godot.core.Dictionary] that contains three entries:
   *
   * - `signal` is a reference to the [godot.Signal];
   *
   * - `callable` is a reference to the connected [godot.Callable];
   *
   * - `flags` is a combination of [enum ConnectFlags].
   */
  public fun getSignalConnectionList(signal: StringName): VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments(STRING_NAME to signal)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_GET_SIGNAL_CONNECTION_LIST,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Dictionary<Any?, Any?>>
  }

  /**
   * Returns an [godot.Array] of signal connections received by this object. Each connection is represented as a [godot.core.Dictionary] that contains three entries:
   *
   * - `signal` is a reference to the [godot.Signal];
   *
   * - `callable` is a reference to the [godot.Callable];
   *
   * - `flags` is a combination of [enum ConnectFlags].
   */
  public fun getIncomingConnections(): VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_GET_INCOMING_CONNECTIONS,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Dictionary<Any?, Any?>>
  }

  /**
   * Connects a [signal] by name to a [callable]. Optional [flags] can be also added to configure the connection's behavior (see [enum ConnectFlags] constants).
   *
   * A signal can only be connected once to the same [godot.Callable]. If the signal is already connected, this method returns [ERR_INVALID_PARAMETER] and pushes an error message, unless the signal is connected with [CONNECT_REFERENCE_COUNTED]. To prevent this, use [isConnected] first to check for existing connections.
   *
   * If the [callable]'s object is freed, the connection will be lost.
   *
   * **Examples with recommended syntax:**
   *
   * Connecting signals is one of the most common operations in Godot and the API gives many options to do so, which are described further down. The code block below shows the recommended approach.
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * func _ready():
   *
   *     var button = Button.new()
   *
   *     # `button_down` here is a Signal variant type, and we thus call the Signal.connect() method, not Object.connect().
   *
   *     # See discussion below for a more in-depth overview of the API.
   *
   *     button.button_down.connect(_on_button_down)
   *
   *
   *
   *     # This assumes that a `Player` class exists, which defines a `hit` signal.
   *
   *     var player = Player.new()
   *
   *     # We use Signal.connect() again, and we also use the Callable.bind() method,
   *
   *     # which returns a new Callable with the parameter binds.
   *
   *     player.hit.connect(_on_player_hit.bind("sword", 100))
   *
   *
   *
   * func _on_button_down():
   *
   *     print("Button down!")
   *
   *
   *
   * func _on_player_hit(weapon_type, damage):
   *
   *     print("Hit with weapon %s for %d damage." % [weapon_type, damage])
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * public override void _Ready()
   *
   * {
   *
   *     var button = new Button();
   *
   *     // C# supports passing signals as events, so we can use this idiomatic construct:
   *
   *     button.ButtonDown += OnButtonDown;
   *
   *
   *
   *     // This assumes that a `Player` class exists, which defines a `Hit` signal.
   *
   *     var player = new Player();
   *
   *     // We can use lambdas when we need to bind additional parameters.
   *
   *     player.Hit += () => OnPlayerHit("sword", 100);
   *
   * }
   *
   *
   *
   * private void OnButtonDown()
   *
   * {
   *
   *     GD.Print("Button down!");
   *
   * }
   *
   *
   *
   * private void OnPlayerHit(string weaponType, int damage)
   *
   * {
   *
   *     GD.Print($"Hit with weapon {weaponType} for {damage} damage.");
   *
   * }
   *
   * [/csharp]
   *
   * [/codeblocks]
   *
   * **`Object.connect()` or `Signal.connect()`?**
   *
   * As seen above, the recommended method to connect signals is not [godot.Object.connect]. The code block below shows the four options for connecting signals, using either this legacy method or the recommended [godot.Signal.connect], and using either an implicit [godot.Callable] or a manually defined one.
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * func _ready():
   *
   *     var button = Button.new()
   *
   *     # Option 1: Object.connect() with an implicit Callable for the defined function.
   *
   *     button.connect("button_down", _on_button_down)
   *
   *     # Option 2: Object.connect() with a constructed Callable using a target object and method name.
   *
   *     button.connect("button_down", Callable(self, "_on_button_down"))
   *
   *     # Option 3: Signal.connect() with an implicit Callable for the defined function.
   *
   *     button.button_down.connect(_on_button_down)
   *
   *     # Option 4: Signal.connect() with a constructed Callable using a target object and method name.
   *
   *     button.button_down.connect(Callable(self, "_on_button_down"))
   *
   *
   *
   * func _on_button_down():
   *
   *     print("Button down!")
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * public override void _Ready()
   *
   * {
   *
   *     var button = new Button();
   *
   *     // Option 1: In C#, we can use signals as events and connect with this idiomatic syntax:
   *
   *     button.ButtonDown += OnButtonDown;
   *
   *     // Option 2: GodotObject.Connect() with a constructed Callable from a method group.
   *
   *     button.Connect(Button.SignalName.ButtonDown, Callable.From(OnButtonDown));
   *
   *     // Option 3: GodotObject.Connect() with a constructed Callable using a target object and method name.
   *
   *     button.Connect(Button.SignalName.ButtonDown, new Callable(this, MethodName.OnButtonDown));
   *
   * }
   *
   *
   *
   * private void OnButtonDown()
   *
   * {
   *
   *     GD.Print("Button down!");
   *
   * }
   *
   * [/csharp]
   *
   * [/codeblocks]
   *
   * While all options have the same outcome (`button`'s [godot.BaseButton.buttonDown] signal will be connected to `_on_button_down`), **option 3** offers the best validation: it will print a compile-time error if either the `button_down` [godot.Signal] or the `_on_button_down` [godot.Callable] are not defined. On the other hand, **option 2** only relies on string names and will only be able to validate either names at runtime: it will print a runtime error if `"button_down"` doesn't correspond to a signal, or if `"_on_button_down"` is not a registered method in the object `self`. The main reason for using options 1, 2, or 4 would be if you actually need to use strings (e.g. to connect signals programmatically based on strings read from a configuration file). Otherwise, option 3 is the recommended (and fastest) method.
   *
   * **Binding and passing parameters:**
   *
   * The syntax to bind parameters is through [godot.Callable.bind], which returns a copy of the [godot.Callable] with its parameters bound.
   *
   * When calling [emitSignal], the signal parameters can be also passed. The examples below show the relationship between these signal parameters and bound parameters.
   *
   * [codeblocks]
   *
   * [gdscript]
   *
   * func _ready():
   *
   *     # This assumes that a `Player` class exists, which defines a `hit` signal.
   *
   *     var player = Player.new()
   *
   *     # Using Callable.bind().
   *
   *     player.hit.connect(_on_player_hit.bind("sword", 100))
   *
   *
   *
   *     # Parameters added when emitting the signal are passed first.
   *
   *     player.emit_signal("hit", "Dark lord", 5)
   *
   *
   *
   * # We pass two arguments when emitting (`hit_by`, `level`),
   *
   * # and bind two more arguments when connecting (`weapon_type`, `damage`).
   *
   * func _on_player_hit(hit_by, level, weapon_type, damage):
   *
   *     print("Hit by %s (level %d) with weapon %s for %d damage." % [hit_by, level, weapon_type, damage])
   *
   * [/gdscript]
   *
   * [csharp]
   *
   * public override void _Ready()
   *
   * {
   *
   *     // This assumes that a `Player` class exists, which defines a `Hit` signal.
   *
   *     var player = new Player();
   *
   *     // Using lambda expressions that create a closure that captures the additional parameters.
   *
   *     // The lambda only receives the parameters defined by the signal's delegate.
   *
   *     player.Hit += (hitBy, level) => OnPlayerHit(hitBy, level, "sword", 100);
   *
   *
   *
   *     // Parameters added when emitting the signal are passed first.
   *
   *     player.EmitSignal(SignalName.Hit, "Dark lord", 5);
   *
   * }
   *
   *
   *
   * // We pass two arguments when emitting (`hit_by`, `level`),
   *
   * // and bind two more arguments when connecting (`weapon_type`, `damage`).
   *
   * private void OnPlayerHit(string hitBy, int level, string weaponType, int damage)
   *
   * {
   *
   *     GD.Print($"Hit by {hitBy} (level {level}) with weapon {weaponType} for {damage} damage.");
   *
   * }
   *
   * [/csharp]
   *
   * [/codeblocks]
   */
  public fun connect(
    signal: StringName,
    callable: Callable,
    flags: Long = 0
  ): GodotError {
    TransferContext.writeArguments(STRING_NAME to signal, CALLABLE to callable, LONG to flags)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_CONNECT, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Disconnects a [signal] by name from a given [callable]. If the connection does not exist, generates an error. Use [isConnected] to make sure that the connection exists.
   */
  public fun disconnect(signal: StringName, callable: Callable): Unit {
    TransferContext.writeArguments(STRING_NAME to signal, CALLABLE to callable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_DISCONNECT, NIL)
  }

  /**
   * Returns `true` if a connection exists between the given [signal] name and [callable].
   *
   * **Note:** In C#, [signal] must be in snake_case when referring to built-in Godot methods. Prefer using the names exposed in the `SignalName` class to avoid allocating a new [godot.StringName] on each call.
   */
  public fun isConnected(signal: StringName, callable: Callable): Boolean {
    TransferContext.writeArguments(STRING_NAME to signal, CALLABLE to callable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_IS_CONNECTED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * If set to `true`, the object becomes unable to emit signals. As such, [emitSignal] and signal connections will not work, until it is set to `false`.
   */
  public fun setBlockSignals(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_SET_BLOCK_SIGNALS, NIL)
  }

  /**
   * Returns `true` if the object is blocking its signals from being emitted. See [setBlockSignals].
   */
  public fun isBlockingSignals(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_IS_BLOCKING_SIGNALS, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Emits the [propertyListChanged] signal. This is mainly used to refresh the editor, so that the Inspector and editor plugins are properly updated.
   */
  public fun notifyPropertyListChanged(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_NOTIFY_PROPERTY_LIST_CHANGED,
        NIL)
  }

  /**
   * If set to `true`, allows the object to translate messages with [tr] and [trN]. Enabled by default. See also [canTranslateMessages].
   */
  public fun setMessageTranslation(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_SET_MESSAGE_TRANSLATION, NIL)
  }

  /**
   * Returns `true` if the object is allowed to translate messages with [tr] and [trN]. See also [setMessageTranslation].
   */
  public fun canTranslateMessages(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_CAN_TRANSLATE_MESSAGES, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Translates a [message], using the translation catalogs configured in the Project Settings. Further [context] can be specified to help with the translation.
   *
   * If [canTranslateMessages] is `false`, or no translation is available, this method returns the [message] without changes. See [setMessageTranslation].
   *
   * For detailed examples, see [godot.Internationalizing games]($DOCS_URL/tutorials/i18n/internationalizing_games.html).
   */
  public fun tr(message: StringName, context: StringName = StringName("")): String {
    TransferContext.writeArguments(STRING_NAME to message, STRING_NAME to context)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_TR, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Translates a [message] or [pluralMessage], using the translation catalogs configured in the Project Settings. Further [context] can be specified to help with the translation.
   *
   * If [canTranslateMessages] is `false`, or no translation is available, this method returns [message] or [pluralMessage], without changes. See [setMessageTranslation].
   *
   * The [n] is the number, or amount, of the message's subject. It is used by the translation system to fetch the correct plural form for the current language.
   *
   * For detailed examples, see [godot.Localization using gettext]($DOCS_URL/tutorials/i18n/localization_using_gettext.html).
   *
   * **Note:** Negative and [float] numbers may not properly apply to some countable subjects. It's recommended handling these cases with [tr].
   */
  public fun trN(
    message: StringName,
    pluralMessage: StringName,
    n: Long,
    context: StringName = StringName("")
  ): String {
    TransferContext.writeArguments(STRING_NAME to message, STRING_NAME to pluralMessage, LONG to n, STRING_NAME to context)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_TR_N, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns `true` if the [godot.Node.queueFree] method was called for the object.
   */
  public fun isQueuedForDeletion(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OBJECT_IS_QUEUED_FOR_DELETION, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public enum class ConnectFlags(
    id: Long
  ) {
    /**
     * Deferred connections trigger their [godot.Callable]s on idle time, rather than instantly.
     */
    CONNECT_DEFERRED(1),
    /**
     * Persisting connections are stored when the object is serialized (such as when using [godot.PackedScene.pack]). In the editor, connections created through the Node dock are always persisting.
     */
    CONNECT_PERSIST(2),
    /**
     * One-shot connections disconnect themselves after emission.
     */
    CONNECT_ONE_SHOT(4),
    /**
     * Reference-counted connections can be assigned to the same [godot.Callable] multiple times. Each disconnection decreases the internal counter. The signal fully disconnects only when the counter reaches 0.
     */
    CONNECT_REFERENCE_COUNTED(8),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object {
    /**
     * Notification received when the object is initialized, before its script is attached. Used internally.
     */
    public final const val NOTIFICATION_POSTINITIALIZE: Long = 0

    /**
     * Notification received when the object is about to be deleted. Can act as the deconstructor of some programming languages.
     */
    public final const val NOTIFICATION_PREDELETE: Long = 1
  }
}
