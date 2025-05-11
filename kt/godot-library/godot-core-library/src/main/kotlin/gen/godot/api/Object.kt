// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Callable
import godot.core.Dictionary
import godot.core.Error
import godot.core.GodotEnum
import godot.core.KtObject
import godot.core.NodePath
import godot.core.Signal0
import godot.core.StringName
import godot.core.VariantArray
import godot.core.VariantCaster.ANY
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.CALLABLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.NODE_PATH
import godot.core.VariantParser.STRING
import godot.core.VariantParser.STRING_NAME
import godot.core.asCachedNodePath
import godot.core.asCachedStringName
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * An advanced [Variant] type. All classes in the engine inherit from Object. Each class may define
 * new properties, methods or signals, which are available to all inheriting classes. For example, a
 * [Sprite2D] instance is able to call [Node.addChild] because it inherits from [Node].
 *
 * You can create new instances, using `Object.new()` in GDScript, or `new GodotObject` in C#.
 *
 * To delete an Object instance, call [free]. This is necessary for most classes inheriting Object,
 * because they do not manage memory on their own, and will otherwise cause memory leaks when no longer
 * in use. There are a few classes that perform memory management. For example, [RefCounted] (and by
 * extension [Resource]) deletes itself when no longer referenced, and [Node] deletes its children when
 * freed.
 *
 * Objects can have a [Script] attached to them. Once the [Script] is instantiated, it effectively
 * acts as an extension to the base class, allowing it to define and inherit new properties, methods
 * and signals.
 *
 * Inside a [Script], [_getPropertyList] may be overridden to customize properties in several ways.
 * This allows them to be available to the editor, display as lists of options, sub-divide into groups,
 * save on disk, etc. Scripting languages offer easier ways to customize properties, such as with the
 * [annotation @GDScript.@export] annotation.
 *
 * Godot is very dynamic. An object's script, and therefore its properties, methods and signals, can
 * be changed at run-time. Because of this, there can be occasions where, for example, a property
 * required by a method may not exist. To prevent run-time errors, see methods such as [set], [get],
 * [call], [hasMethod], [hasSignal], etc. Note that these methods are **much** slower than direct
 * references.
 *
 * In GDScript, you can also check if a given property, method, or signal name exists in an object
 * with the `in` operator:
 *
 * ```
 * var node = Node.new()
 * print("name" in node)         # Prints true
 * print("get_parent" in node)   # Prints true
 * print("tree_entered" in node) # Prints true
 * print("unknown" in node)      # Prints false
 * ```
 *
 * Notifications are [int] constants commonly sent and received by objects. For example, on every
 * rendered frame, the [SceneTree] notifies nodes inside the tree with a [Node.NOTIFICATION_PROCESS].
 * The nodes receive it and may call [Node.Process] to update. To make use of notifications, see
 * [notification] and [_notification].
 *
 * Lastly, every object can also contain metadata (data about data). [setMeta] can be useful to
 * store information that the object itself does not depend on. To keep your code clean, making
 * excessive use of metadata is discouraged.
 *
 * **Note:** Unlike references to a [RefCounted], references to an object stored in a variable can
 * become invalid without being set to `null`. To check if an object has been deleted, do *not* compare
 * it against `null`. Instead, use [@GlobalScope.isInstanceValid]. It's also recommended to inherit
 * from [RefCounted] for classes storing data instead of [Object].
 *
 * **Note:** The `script` is not exposed like most properties. To set or get an object's [Script] in
 * code, use [setScript] and [getScript], respectively.
 *
 * **Note:** In a boolean context, an [Object] will evaluate to `false` if it is equal to `null` or
 * it has been freed. Otherwise, an [Object] will always evaluate to `true`. See also
 * [@GlobalScope.isInstanceValid].
 */
@GodotBaseType
public open class Object : KtObject() {
  /**
   * Emitted when the object's script is changed.
   *
   * **Note:** When this signal is emitted, the new script is not initialized yet. If you need to
   * access the new script, defer connections to this signal with [CONNECT_DEFERRED].
   */
  public val scriptChanged: Signal0 by Signal0

  /**
   * Emitted when [notifyPropertyListChanged] is called.
   */
  public val propertyListChanged: Signal0 by Signal0

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(0, scriptIndex)
  }

  /**
   * Returns the object's built-in class name, as a [String]. See also [isClass].
   *
   * **Note:** This method ignores `class_name` declarations. If this object's script has defined a
   * `class_name`, the base, built-in class name is returned instead.
   */
  public final fun getGodotClass(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getClassPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns `true` if the object inherits from the given [class]. See also [getClass].
   *
   * ```gdscript
   * //gdscript
   * var sprite2d = Sprite2D.new()
   * sprite2d.is_class("Sprite2D") # Returns true
   * sprite2d.is_class("Node")     # Returns true
   * sprite2d.is_class("Node3D")   # Returns false
   * ```
   *
   * ```csharp
   * //csharp
   * var sprite2D = new Sprite2D();
   * sprite2D.IsClass("Sprite2D"); // Returns true
   * sprite2D.IsClass("Node");     // Returns true
   * sprite2D.IsClass("Node3D");   // Returns false
   * ```
   *
   * **Note:** This method ignores `class_name` declarations in the object's script.
   */
  public final fun isClass(`class`: String): Boolean {
    TransferContext.writeArguments(STRING to `class`)
    TransferContext.callMethod(ptr, MethodBindings.isClassPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Assigns [value] to the given [property]. If the property does not exist or the given [value]'s
   * type doesn't match, nothing happens.
   *
   * ```gdscript
   * //gdscript
   * var node = Node2D.new()
   * node.set("global_scale", Vector2(8, 2.5))
   * print(node.global_scale) # Prints (8.0, 2.5)
   * ```
   *
   * ```csharp
   * //csharp
   * var node = new Node2D();
   * node.Set(Node2D.PropertyName.GlobalScale, new Vector2(8, 2.5f));
   * GD.Print(node.GlobalScale); // Prints (8, 2.5)
   * ```
   *
   * **Note:** In C#, [property] must be in snake_case when referring to built-in Godot properties.
   * Prefer using the names exposed in the `PropertyName` class to avoid allocating a new [StringName]
   * on each call.
   */
  public final fun `set`(`property`: StringName, `value`: Any?): Unit {
    TransferContext.writeArguments(STRING_NAME to property, ANY to value)
    TransferContext.callMethod(ptr, MethodBindings.setPtr, NIL)
  }

  /**
   * Returns the [Variant] value of the given [property]. If the [property] does not exist, this
   * method returns `null`.
   *
   * ```gdscript
   * //gdscript
   * var node = Node2D.new()
   * node.rotation = 1.5
   * var a = node.get("rotation") # a is 1.5
   * ```
   *
   * ```csharp
   * //csharp
   * var node = new Node2D();
   * node.Rotation = 1.5f;
   * var a = node.Get(Node2D.PropertyName.Rotation); // a is 1.5
   * ```
   *
   * **Note:** In C#, [property] must be in snake_case when referring to built-in Godot properties.
   * Prefer using the names exposed in the `PropertyName` class to avoid allocating a new [StringName]
   * on each call.
   */
  public final fun `get`(`property`: StringName): Any? {
    TransferContext.writeArguments(STRING_NAME to property)
    TransferContext.callMethod(ptr, MethodBindings.getPtr, ANY)
    return (TransferContext.readReturnValue(ANY) as Any?)
  }

  /**
   * Assigns a new [value] to the property identified by the [propertyPath]. The path should be a
   * [NodePath] relative to this object, and can use the colon character (`:`) to access nested
   * properties.
   *
   * ```gdscript
   * //gdscript
   * var node = Node2D.new()
   * node.set_indexed("position", Vector2(42, 0))
   * node.set_indexed("position:y", -10)
   * print(node.position) # Prints (42.0, -10.0)
   * ```
   *
   * ```csharp
   * //csharp
   * var node = new Node2D();
   * node.SetIndexed("position", new Vector2(42, 0));
   * node.SetIndexed("position:y", -10);
   * GD.Print(node.Position); // Prints (42, -10)
   * ```
   *
   * **Note:** In C#, [propertyPath] must be in snake_case when referring to built-in Godot
   * properties. Prefer using the names exposed in the `PropertyName` class to avoid allocating a new
   * [StringName] on each call.
   */
  public final fun setIndexed(propertyPath: NodePath, `value`: Any?): Unit {
    TransferContext.writeArguments(NODE_PATH to propertyPath, ANY to value)
    TransferContext.callMethod(ptr, MethodBindings.setIndexedPtr, NIL)
  }

  /**
   * Gets the object's property indexed by the given [propertyPath]. The path should be a [NodePath]
   * relative to the current object and can use the colon character (`:`) to access nested properties.
   *
   * **Examples:** `"position:x"` or `"material:next_pass:blend_mode"`.
   *
   * ```gdscript
   * //gdscript
   * var node = Node2D.new()
   * node.position = Vector2(5, -10)
   * var a = node.get_indexed("position")   # a is Vector2(5, -10)
   * var b = node.get_indexed("position:y") # b is -10
   * ```
   *
   * ```csharp
   * //csharp
   * var node = new Node2D();
   * node.Position = new Vector2(5, -10);
   * var a = node.GetIndexed("position");   // a is Vector2(5, -10)
   * var b = node.GetIndexed("position:y"); // b is -10
   * ```
   *
   * **Note:** In C#, [propertyPath] must be in snake_case when referring to built-in Godot
   * properties. Prefer using the names exposed in the `PropertyName` class to avoid allocating a new
   * [StringName] on each call.
   *
   * **Note:** This method does not support actual paths to nodes in the [SceneTree], only
   * sub-property paths. In the context of nodes, use [Node.getNodeAndResource] instead.
   */
  public final fun getIndexed(propertyPath: NodePath): Any? {
    TransferContext.writeArguments(NODE_PATH to propertyPath)
    TransferContext.callMethod(ptr, MethodBindings.getIndexedPtr, ANY)
    return (TransferContext.readReturnValue(ANY) as Any?)
  }

  /**
   * Returns the object's property list as an [Array] of dictionaries. Each [Dictionary] contains
   * the following entries:
   *
   * - `name` is the property's name, as a [String];
   *
   * - `class_name` is an empty [StringName], unless the property is [TYPE_OBJECT] and it inherits
   * from a class;
   *
   * - `type` is the property's type, as an [int] (see [Variant.Type]);
   *
   * - `hint` is *how* the property is meant to be edited (see [PropertyHint]);
   *
   * - `hint_string` depends on the hint (see [PropertyHint]);
   *
   * - `usage` is a combination of [PropertyUsageFlags].
   *
   * **Note:** In GDScript, all class members are treated as properties. In C# and GDExtension, it
   * may be necessary to explicitly mark class members as Godot properties using decorators or
   * attributes.
   */
  public final fun getPropertyList(): VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPropertyListPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Dictionary<Any?, Any?>>)
  }

  /**
   * Returns this object's methods and their signatures as an [Array] of dictionaries. Each
   * [Dictionary] contains the following entries:
   *
   * - `name` is the name of the method, as a [String];
   *
   * - `args` is an [Array] of dictionaries representing the arguments;
   *
   * - `default_args` is the default arguments as an [Array] of variants;
   *
   * - `flags` is a combination of [MethodFlags];
   *
   * - `id` is the method's internal identifier [int];
   *
   * - `return` is the returned value, as a [Dictionary];
   *
   * **Note:** The dictionaries of `args` and `return` are formatted identically to the results of
   * [getPropertyList], although not all entries are used.
   */
  public final fun getMethodList(): VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMethodListPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Dictionary<Any?, Any?>>)
  }

  /**
   * Returns `true` if the given [property] has a custom default value. Use [propertyGetRevert] to
   * get the [property]'s default value.
   *
   * **Note:** This method is used by the Inspector dock to display a revert icon. The object must
   * implement [_propertyCanRevert] to customize the default value. If [_propertyCanRevert] is not
   * implemented, this method returns `false`.
   */
  public final fun propertyCanRevert(`property`: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to property)
    TransferContext.callMethod(ptr, MethodBindings.propertyCanRevertPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the custom default value of the given [property]. Use [propertyCanRevert] to check if
   * the [property] has a custom default value.
   *
   * **Note:** This method is used by the Inspector dock to display a revert icon. The object must
   * implement [_propertyGetRevert] to customize the default value. If [_propertyGetRevert] is not
   * implemented, this method returns `null`.
   */
  public final fun propertyGetRevert(`property`: StringName): Any? {
    TransferContext.writeArguments(STRING_NAME to property)
    TransferContext.callMethod(ptr, MethodBindings.propertyGetRevertPtr, ANY)
    return (TransferContext.readReturnValue(ANY) as Any?)
  }

  /**
   * Sends the given [what] notification to all classes inherited by the object, triggering calls to
   * [_notification], starting from the highest ancestor (the [Object] class) and going down to the
   * object's script.
   *
   * If [reversed] is `true`, the call order is reversed.
   *
   * ```gdscript
   * //gdscript
   * var player = Node2D.new()
   * player.set_script(load("res://player.gd"))
   *
   * player.notification(NOTIFICATION_ENTER_TREE)
   * # The call order is Object -> Node -> Node2D -> player.gd.
   *
   * player.notification(NOTIFICATION_ENTER_TREE, true)
   * # The call order is player.gd -> Node2D -> Node -> Object.
   * ```
   *
   * ```csharp
   * //csharp
   * var player = new Node2D();
   * player.SetScript(GD.Load("res://player.gd"));
   *
   * player.Notification(NotificationEnterTree);
   * // The call order is GodotObject -> Node -> Node2D -> player.gd.
   *
   * player.Notification(NotificationEnterTree, true);
   * // The call order is player.gd -> Node2D -> Node -> GodotObject.
   * ```
   */
  @JvmOverloads
  public final fun notification(what: Int, reversed: Boolean = false): Unit {
    TransferContext.writeArguments(LONG to what.toLong(), BOOL to reversed)
    TransferContext.callMethod(ptr, MethodBindings.notificationPtr, NIL)
  }

  /**
   * Returns a [String] representing the object. Defaults to `"<ClassName#RID>"`. Override
   * [_toString] to customize the string representation of the object.
   */
  public final override fun toString(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.toStringPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns the object's unique instance ID. This ID can be saved in [EncodedObjectAsID], and can
   * be used to retrieve this object instance with [@GlobalScope.instanceFromId].
   *
   * **Note:** This ID is only useful during the current session. It won't correspond to a similar
   * object if the ID is sent over a network, or loaded from a file at a later time.
   */
  public final fun getInstanceId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getInstanceIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Attaches [script] to the object, and instantiates it. As a result, the script's [_init] is
   * called. A [Script] is used to extend the object's functionality.
   *
   * If a script already exists, its instance is detached, and its property values and state are
   * lost. Built-in property values are still kept.
   */
  public final fun setScript(script: Any?): Unit {
    TransferContext.writeArguments(ANY to script)
    TransferContext.callMethod(ptr, MethodBindings.setScriptPtr, NIL)
  }

  /**
   * Returns the object's [Script] instance, or `null` if no script is attached.
   */
  public final fun getScript(): Any? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getScriptPtr, ANY)
    return (TransferContext.readReturnValue(ANY) as Any?)
  }

  /**
   * Adds or changes the entry [name] inside the object's metadata. The metadata [value] can be any
   * [Variant], although some types cannot be serialized correctly.
   *
   * If [value] is `null`, the entry is removed. This is the equivalent of using [removeMeta]. See
   * also [hasMeta] and [getMeta].
   *
   * **Note:** A metadata's name must be a valid identifier as per [StringName.isValidIdentifier]
   * method.
   *
   * **Note:** Metadata that has a name starting with an underscore (`_`) is considered editor-only.
   * Editor-only metadata is not displayed in the Inspector and should not be edited, although it can
   * still be found by this method.
   */
  public final fun setMeta(name: StringName, `value`: Any?): Unit {
    TransferContext.writeArguments(STRING_NAME to name, ANY to value)
    TransferContext.callMethod(ptr, MethodBindings.setMetaPtr, NIL)
  }

  /**
   * Removes the given entry [name] from the object's metadata. See also [hasMeta], [getMeta] and
   * [setMeta].
   *
   * **Note:** A metadata's name must be a valid identifier as per [StringName.isValidIdentifier]
   * method.
   *
   * **Note:** Metadata that has a name starting with an underscore (`_`) is considered editor-only.
   * Editor-only metadata is not displayed in the Inspector and should not be edited, although it can
   * still be found by this method.
   */
  public final fun removeMeta(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(ptr, MethodBindings.removeMetaPtr, NIL)
  }

  /**
   * Returns the object's metadata value for the given entry [name]. If the entry does not exist,
   * returns [default]. If [default] is `null`, an error is also generated.
   *
   * **Note:** A metadata's name must be a valid identifier as per [StringName.isValidIdentifier]
   * method.
   *
   * **Note:** Metadata that has a name starting with an underscore (`_`) is considered editor-only.
   * Editor-only metadata is not displayed in the Inspector and should not be edited, although it can
   * still be found by this method.
   */
  @JvmOverloads
  public final fun getMeta(name: StringName, default: Any? = null): Any? {
    TransferContext.writeArguments(STRING_NAME to name, ANY to default)
    TransferContext.callMethod(ptr, MethodBindings.getMetaPtr, ANY)
    return (TransferContext.readReturnValue(ANY) as Any?)
  }

  /**
   * Returns `true` if a metadata entry is found with the given [name]. See also [getMeta],
   * [setMeta] and [removeMeta].
   *
   * **Note:** A metadata's name must be a valid identifier as per [StringName.isValidIdentifier]
   * method.
   *
   * **Note:** Metadata that has a name starting with an underscore (`_`) is considered editor-only.
   * Editor-only metadata is not displayed in the Inspector and should not be edited, although it can
   * still be found by this method.
   */
  public final fun hasMeta(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(ptr, MethodBindings.hasMetaPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the object's metadata entry names as an [Array] of [StringName]s.
   */
  public final fun getMetaList(): VariantArray<StringName> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getMetaListPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<StringName>)
  }

  /**
   * Adds a user-defined signal named [signal]. Optional arguments for the signal can be added as an
   * [Array] of dictionaries, each defining a `name` [String] and a `type` [int] (see [Variant.Type]).
   * See also [hasUserSignal] and [removeUserSignal].
   *
   * ```gdscript
   * //gdscript
   * add_user_signal("hurt", [
   * 	{ "name": "damage", "type": TYPE_INT },
   * 	{ "name": "source", "type": TYPE_OBJECT }
   * ])
   * ```
   *
   * ```csharp
   * //csharp
   * AddUserSignal("Hurt",
   * [
   * 	new Godot.Collections.Dictionary()
   * 	{
   * 		{ "name", "damage" },
   * 		{ "type", (int)Variant.Type.Int },
   * 	},
   * 	new Godot.Collections.Dictionary()
   * 	{
   * 		{ "name", "source" },
   * 		{ "type", (int)Variant.Type.Object },
   * 	},
   * ]);
   * ```
   */
  @JvmOverloads
  public final fun addUserSignal(signal: String, arguments: VariantArray<Any?> =
      godot.core.variantArrayOf()): Unit {
    TransferContext.writeArguments(STRING to signal, ARRAY to arguments)
    TransferContext.callMethod(ptr, MethodBindings.addUserSignalPtr, NIL)
  }

  /**
   * Returns `true` if the given user-defined [signal] name exists. Only signals added with
   * [addUserSignal] are included. See also [removeUserSignal].
   */
  public final fun hasUserSignal(signal: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to signal)
    TransferContext.callMethod(ptr, MethodBindings.hasUserSignalPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Removes the given user signal [signal] from the object. See also [addUserSignal] and
   * [hasUserSignal].
   */
  public final fun removeUserSignal(signal: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to signal)
    TransferContext.callMethod(ptr, MethodBindings.removeUserSignalPtr, NIL)
  }

  /**
   * Emits the given [signal] by name. The signal must exist, so it should be a built-in signal of
   * this class or one of its inherited classes, or a user-defined signal (see [addUserSignal]). This
   * method supports a variable number of arguments, so parameters can be passed as a comma separated
   * list.
   *
   * Returns [ERR_UNAVAILABLE] if [signal] does not exist or the parameters are invalid.
   *
   * ```gdscript
   * //gdscript
   * emit_signal("hit", "sword", 100)
   * emit_signal("game_over")
   * ```
   *
   * ```csharp
   * //csharp
   * EmitSignal(SignalName.Hit, "sword", 100);
   * EmitSignal(SignalName.GameOver);
   * ```
   *
   * **Note:** In C#, [signal] must be in snake_case when referring to built-in Godot signals.
   * Prefer using the names exposed in the `SignalName` class to avoid allocating a new [StringName] on
   * each call.
   */
  public final fun emitSignal(signal: StringName, vararg args: Any?): Error {
    TransferContext.writeArguments(STRING_NAME to signal,  *args.map { ANY to it }.toTypedArray())
    TransferContext.callMethod(ptr, MethodBindings.emitSignalPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Calls the [method] on the object and returns the result. This method supports a variable number
   * of arguments, so parameters can be passed as a comma separated list.
   *
   * ```gdscript
   * //gdscript
   * var node = Node3D.new()
   * node.call("rotate", Vector3(1.0, 0.0, 0.0), 1.571)
   * ```
   *
   * ```csharp
   * //csharp
   * var node = new Node3D();
   * node.Call(Node3D.MethodName.Rotate, new Vector3(1f, 0f, 0f), 1.571f);
   * ```
   *
   * **Note:** In C#, [method] must be in snake_case when referring to built-in Godot methods.
   * Prefer using the names exposed in the `MethodName` class to avoid allocating a new [StringName] on
   * each call.
   */
  public final fun call(method: StringName, vararg args: Any?): Any? {
    TransferContext.writeArguments(STRING_NAME to method,  *args.map { ANY to it }.toTypedArray())
    TransferContext.callMethod(ptr, MethodBindings.callPtr, ANY)
    return (TransferContext.readReturnValue(ANY) as Any?)
  }

  /**
   * Calls the [method] on the object during idle time. Always returns `null`, **not** the method's
   * result.
   *
   * Idle time happens mainly at the end of process and physics frames. In it, deferred calls will
   * be run until there are none left, which means you can defer calls from other deferred calls and
   * they'll still be run in the current idle time cycle. This means you should not call a method
   * deferred from itself (or from a method called by it), as this causes infinite recursion the same
   * way as if you had called the method directly.
   *
   * This method supports a variable number of arguments, so parameters can be passed as a comma
   * separated list.
   *
   * ```gdscript
   * //gdscript
   * var node = Node3D.new()
   * node.call_deferred("rotate", Vector3(1.0, 0.0, 0.0), 1.571)
   * ```
   *
   * ```csharp
   * //csharp
   * var node = new Node3D();
   * node.CallDeferred(Node3D.MethodName.Rotate, new Vector3(1f, 0f, 0f), 1.571f);
   * ```
   *
   * See also [Callable.callDeferred].
   *
   * **Note:** In C#, [method] must be in snake_case when referring to built-in Godot methods.
   * Prefer using the names exposed in the `MethodName` class to avoid allocating a new [StringName] on
   * each call.
   *
   * **Note:** If you're looking to delay the function call by a frame, refer to the [signal
   * SceneTree.process_frame] and [signal SceneTree.physics_frame] signals.
   *
   * ```
   * var node = Node3D.new()
   * # Make a Callable and bind the arguments to the node's rotate() call.
   * var callable = node.rotate.bind(Vector3(1.0, 0.0, 0.0), 1.571)
   * # Connect the callable to the process_frame signal, so it gets called in the next process
   * frame.
   * # CONNECT_ONE_SHOT makes sure it only gets called once instead of every frame.
   * get_tree().process_frame.connect(callable, CONNECT_ONE_SHOT)
   * ```
   */
  public final fun callDeferred(method: StringName, vararg args: Any?): Any? {
    TransferContext.writeArguments(STRING_NAME to method,  *args.map { ANY to it }.toTypedArray())
    TransferContext.callMethod(ptr, MethodBindings.callDeferredPtr, ANY)
    return (TransferContext.readReturnValue(ANY) as Any?)
  }

  /**
   * Assigns [value] to the given [property], at the end of the current frame. This is equivalent to
   * calling [set] through [callDeferred].
   *
   * ```gdscript
   * //gdscript
   * var node = Node2D.new()
   * add_child(node)
   *
   * node.rotation = 1.5
   * node.set_deferred("rotation", 3.0)
   * print(node.rotation) # Prints 1.5
   *
   * await get_tree().process_frame
   * print(node.rotation) # Prints 3.0
   * ```
   *
   * ```csharp
   * //csharp
   * var node = new Node2D();
   * node.Rotation = 1.5f;
   * node.SetDeferred(Node2D.PropertyName.Rotation, 3f);
   * GD.Print(node.Rotation); // Prints 1.5
   *
   * await ToSignal(GetTree(), SceneTree.SignalName.ProcessFrame);
   * GD.Print(node.Rotation); // Prints 3.0
   * ```
   *
   * **Note:** In C#, [property] must be in snake_case when referring to built-in Godot properties.
   * Prefer using the names exposed in the `PropertyName` class to avoid allocating a new [StringName]
   * on each call.
   */
  public final fun setDeferred(`property`: StringName, `value`: Any?): Unit {
    TransferContext.writeArguments(STRING_NAME to property, ANY to value)
    TransferContext.callMethod(ptr, MethodBindings.setDeferredPtr, NIL)
  }

  /**
   * Calls the [method] on the object and returns the result. Unlike [call], this method expects all
   * parameters to be contained inside [argArray].
   *
   * ```gdscript
   * //gdscript
   * var node = Node3D.new()
   * node.callv("rotate", [Vector3(1.0, 0.0, 0.0), 1.571])
   * ```
   *
   * ```csharp
   * //csharp
   * var node = new Node3D();
   * node.Callv(Node3D.MethodName.Rotate, [new Vector3(1f, 0f, 0f), 1.571f]);
   * ```
   *
   * **Note:** In C#, [method] must be in snake_case when referring to built-in Godot methods.
   * Prefer using the names exposed in the `MethodName` class to avoid allocating a new [StringName] on
   * each call.
   */
  public final fun callv(method: StringName, argArray: VariantArray<Any?>): Any? {
    TransferContext.writeArguments(STRING_NAME to method, ARRAY to argArray)
    TransferContext.callMethod(ptr, MethodBindings.callvPtr, ANY)
    return (TransferContext.readReturnValue(ANY) as Any?)
  }

  /**
   * Returns `true` if the given [method] name exists in the object.
   *
   * **Note:** In C#, [method] must be in snake_case when referring to built-in Godot methods.
   * Prefer using the names exposed in the `MethodName` class to avoid allocating a new [StringName] on
   * each call.
   */
  public final fun hasMethod(method: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to method)
    TransferContext.callMethod(ptr, MethodBindings.hasMethodPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the number of arguments of the given [method] by name.
   *
   * **Note:** In C#, [method] must be in snake_case when referring to built-in Godot methods.
   * Prefer using the names exposed in the `MethodName` class to avoid allocating a new [StringName] on
   * each call.
   */
  public final fun getMethodArgumentCount(method: StringName): Int {
    TransferContext.writeArguments(STRING_NAME to method)
    TransferContext.callMethod(ptr, MethodBindings.getMethodArgumentCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns `true` if the given [signal] name exists in the object.
   *
   * **Note:** In C#, [signal] must be in snake_case when referring to built-in Godot signals.
   * Prefer using the names exposed in the `SignalName` class to avoid allocating a new [StringName] on
   * each call.
   */
  public final fun hasSignal(signal: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to signal)
    TransferContext.callMethod(ptr, MethodBindings.hasSignalPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the list of existing signals as an [Array] of dictionaries.
   *
   * **Note:** Due of the implementation, each [Dictionary] is formatted very similarly to the
   * returned values of [getMethodList].
   */
  public final fun getSignalList(): VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getSignalListPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Dictionary<Any?, Any?>>)
  }

  /**
   * Returns an [Array] of connections for the given [signal] name. Each connection is represented
   * as a [Dictionary] that contains three entries:
   *
   * - [code skip-lint]signal[/code] is a reference to the [Signal];
   *
   * - `callable` is a reference to the connected [Callable];
   *
   * - `flags` is a combination of [ConnectFlags].
   */
  public final fun getSignalConnectionList(signal: StringName):
      VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments(STRING_NAME to signal)
    TransferContext.callMethod(ptr, MethodBindings.getSignalConnectionListPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Dictionary<Any?, Any?>>)
  }

  /**
   * Returns an [Array] of signal connections received by this object. Each connection is
   * represented as a [Dictionary] that contains three entries:
   *
   * - `signal` is a reference to the [Signal];
   *
   * - `callable` is a reference to the [Callable];
   *
   * - `flags` is a combination of [ConnectFlags].
   */
  public final fun getIncomingConnections(): VariantArray<Dictionary<Any?, Any?>> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getIncomingConnectionsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Dictionary<Any?, Any?>>)
  }

  /**
   * Connects a [signal] by name to a [callable]. Optional [flags] can be also added to configure
   * the connection's behavior (see [ConnectFlags] constants).
   *
   * A signal can only be connected once to the same [Callable]. If the signal is already connected,
   * this method returns [ERR_INVALID_PARAMETER] and generates an error, unless the signal is connected
   * with [CONNECT_REFERENCE_COUNTED]. To prevent this, use [isConnected] first to check for existing
   * connections.
   *
   * **Note:** If the [callable]'s object is freed, the connection will be lost.
   *
   * **Note:** In GDScript, it is generally recommended to connect signals with [Signal.connect]
   * instead.
   *
   * **Note:** This operation (and all other signal related operations) is thread-safe.
   */
  @JvmOverloads
  public final fun connect(
    signal: StringName,
    callable: Callable,
    flags: ConnectFlags = Object.ConnectFlags.DEFAULT,
  ): Error {
    TransferContext.writeArguments(STRING_NAME to signal, CALLABLE to callable, LONG to flags.id)
    TransferContext.callMethod(ptr, MethodBindings.connectPtr, LONG)
    return Error.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Disconnects a [signal] by name from a given [callable]. If the connection does not exist,
   * generates an error. Use [isConnected] to make sure that the connection exists.
   */
  public final fun disconnect(signal: StringName, callable: Callable): Unit {
    TransferContext.writeArguments(STRING_NAME to signal, CALLABLE to callable)
    TransferContext.callMethod(ptr, MethodBindings.disconnectPtr, NIL)
  }

  /**
   * Returns `true` if a connection exists between the given [signal] name and [callable].
   *
   * **Note:** In C#, [signal] must be in snake_case when referring to built-in Godot signals.
   * Prefer using the names exposed in the `SignalName` class to avoid allocating a new [StringName] on
   * each call.
   */
  public final fun isConnected(signal: StringName, callable: Callable): Boolean {
    TransferContext.writeArguments(STRING_NAME to signal, CALLABLE to callable)
    TransferContext.callMethod(ptr, MethodBindings.isConnectedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if any connection exists on the given [signal] name.
   *
   * **Note:** In C#, [signal] must be in snake_case when referring to built-in Godot methods.
   * Prefer using the names exposed in the `SignalName` class to avoid allocating a new [StringName] on
   * each call.
   */
  public final fun hasConnections(signal: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to signal)
    TransferContext.callMethod(ptr, MethodBindings.hasConnectionsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * If set to `true`, the object becomes unable to emit signals. As such, [emitSignal] and signal
   * connections will not work, until it is set to `false`.
   */
  public final fun setBlockSignals(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setBlockSignalsPtr, NIL)
  }

  /**
   * Returns `true` if the object is blocking its signals from being emitted. See [setBlockSignals].
   */
  public final fun isBlockingSignals(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isBlockingSignalsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Emits the [signal property_list_changed] signal. This is mainly used to refresh the editor, so
   * that the Inspector and editor plugins are properly updated.
   */
  public final fun notifyPropertyListChanged(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.notifyPropertyListChangedPtr, NIL)
  }

  /**
   * If set to `true`, allows the object to translate messages with [tr] and [trN]. Enabled by
   * default. See also [canTranslateMessages].
   */
  public final fun setMessageTranslation(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(ptr, MethodBindings.setMessageTranslationPtr, NIL)
  }

  /**
   * Returns `true` if the object is allowed to translate messages with [tr] and [trN]. See also
   * [setMessageTranslation].
   */
  public final fun canTranslateMessages(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.canTranslateMessagesPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Translates a [message], using the translation catalogs configured in the Project Settings.
   * Further [context] can be specified to help with the translation. Note that most [Control] nodes
   * automatically translate their strings, so this method is mostly useful for formatted strings or
   * custom drawn text.
   *
   * If [canTranslateMessages] is `false`, or no translation is available, this method returns the
   * [message] without changes. See [setMessageTranslation].
   *
   * For detailed examples, see
   * [url=$DOCS_URL/tutorials/i18n/internationalizing_games.html]Internationalizing games[/url].
   *
   * **Note:** This method can't be used without an [Object] instance, as it requires the
   * [canTranslateMessages] method. To translate strings in a static context, use
   * [TranslationServer.translate].
   */
  public final fun tr(message: StringName, context: StringName = StringName("")): String {
    TransferContext.writeArguments(STRING_NAME to message, STRING_NAME to context)
    TransferContext.callMethod(ptr, MethodBindings.trPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Translates a [message] or [pluralMessage], using the translation catalogs configured in the
   * Project Settings. Further [context] can be specified to help with the translation.
   *
   * If [canTranslateMessages] is `false`, or no translation is available, this method returns
   * [message] or [pluralMessage], without changes. See [setMessageTranslation].
   *
   * The [n] is the number, or amount, of the message's subject. It is used by the translation
   * system to fetch the correct plural form for the current language.
   *
   * For detailed examples, see
   * [url=$DOCS_URL/tutorials/i18n/localization_using_gettext.html]Localization using gettext[/url].
   *
   * **Note:** Negative and [float] numbers may not properly apply to some countable subjects. It's
   * recommended to handle these cases with [tr].
   *
   * **Note:** This method can't be used without an [Object] instance, as it requires the
   * [canTranslateMessages] method. To translate strings in a static context, use
   * [TranslationServer.translatePlural].
   */
  public final fun trN(
    message: StringName,
    pluralMessage: StringName,
    n: Int,
    context: StringName = StringName(""),
  ): String {
    TransferContext.writeArguments(STRING_NAME to message, STRING_NAME to pluralMessage, LONG to n.toLong(), STRING_NAME to context)
    TransferContext.callMethod(ptr, MethodBindings.trNPtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Returns the name of the translation domain used by [tr] and [trN]. See also
   * [TranslationServer].
   */
  public final fun getTranslationDomain(): StringName {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTranslationDomainPtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME) as StringName)
  }

  /**
   * Sets the name of the translation domain used by [tr] and [trN]. See also [TranslationServer].
   */
  public final fun setTranslationDomain(domain: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to domain)
    TransferContext.callMethod(ptr, MethodBindings.setTranslationDomainPtr, NIL)
  }

  /**
   * Returns `true` if the [Node.queueFree] method was called for the object.
   */
  public final fun isQueuedForDeletion(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isQueuedForDeletionPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * If this method is called during [NOTIFICATION_PREDELETE], this object will reject being freed
   * and will remain allocated. This is mostly an internal function used for error handling to avoid
   * the user from freeing objects when they are not intended to.
   */
  public final fun cancelFree(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.cancelFreePtr, NIL)
  }

  /**
   * Assigns [value] to the given [property]. If the property does not exist or the given [value]'s
   * type doesn't match, nothing happens.
   *
   * ```gdscript
   * //gdscript
   * var node = Node2D.new()
   * node.set("global_scale", Vector2(8, 2.5))
   * print(node.global_scale) # Prints (8.0, 2.5)
   * ```
   *
   * ```csharp
   * //csharp
   * var node = new Node2D();
   * node.Set(Node2D.PropertyName.GlobalScale, new Vector2(8, 2.5f));
   * GD.Print(node.GlobalScale); // Prints (8, 2.5)
   * ```
   *
   * **Note:** In C#, [property] must be in snake_case when referring to built-in Godot properties.
   * Prefer using the names exposed in the `PropertyName` class to avoid allocating a new [StringName]
   * on each call.
   */
  public final fun `set`(`property`: String, `value`: Any?) =
      set(property.asCachedStringName(), value)

  /**
   * Returns the [Variant] value of the given [property]. If the [property] does not exist, this
   * method returns `null`.
   *
   * ```gdscript
   * //gdscript
   * var node = Node2D.new()
   * node.rotation = 1.5
   * var a = node.get("rotation") # a is 1.5
   * ```
   *
   * ```csharp
   * //csharp
   * var node = new Node2D();
   * node.Rotation = 1.5f;
   * var a = node.Get(Node2D.PropertyName.Rotation); // a is 1.5
   * ```
   *
   * **Note:** In C#, [property] must be in snake_case when referring to built-in Godot properties.
   * Prefer using the names exposed in the `PropertyName` class to avoid allocating a new [StringName]
   * on each call.
   */
  public final fun `get`(`property`: String): Any? = get(property.asCachedStringName())

  /**
   * Assigns a new [value] to the property identified by the [propertyPath]. The path should be a
   * [NodePath] relative to this object, and can use the colon character (`:`) to access nested
   * properties.
   *
   * ```gdscript
   * //gdscript
   * var node = Node2D.new()
   * node.set_indexed("position", Vector2(42, 0))
   * node.set_indexed("position:y", -10)
   * print(node.position) # Prints (42.0, -10.0)
   * ```
   *
   * ```csharp
   * //csharp
   * var node = new Node2D();
   * node.SetIndexed("position", new Vector2(42, 0));
   * node.SetIndexed("position:y", -10);
   * GD.Print(node.Position); // Prints (42, -10)
   * ```
   *
   * **Note:** In C#, [propertyPath] must be in snake_case when referring to built-in Godot
   * properties. Prefer using the names exposed in the `PropertyName` class to avoid allocating a new
   * [StringName] on each call.
   */
  public final fun setIndexed(propertyPath: String, `value`: Any?) =
      setIndexed(propertyPath.asCachedNodePath(), value)

  /**
   * Gets the object's property indexed by the given [propertyPath]. The path should be a [NodePath]
   * relative to the current object and can use the colon character (`:`) to access nested properties.
   *
   * **Examples:** `"position:x"` or `"material:next_pass:blend_mode"`.
   *
   * ```gdscript
   * //gdscript
   * var node = Node2D.new()
   * node.position = Vector2(5, -10)
   * var a = node.get_indexed("position")   # a is Vector2(5, -10)
   * var b = node.get_indexed("position:y") # b is -10
   * ```
   *
   * ```csharp
   * //csharp
   * var node = new Node2D();
   * node.Position = new Vector2(5, -10);
   * var a = node.GetIndexed("position");   // a is Vector2(5, -10)
   * var b = node.GetIndexed("position:y"); // b is -10
   * ```
   *
   * **Note:** In C#, [propertyPath] must be in snake_case when referring to built-in Godot
   * properties. Prefer using the names exposed in the `PropertyName` class to avoid allocating a new
   * [StringName] on each call.
   *
   * **Note:** This method does not support actual paths to nodes in the [SceneTree], only
   * sub-property paths. In the context of nodes, use [Node.getNodeAndResource] instead.
   */
  public final fun getIndexed(propertyPath: String): Any? =
      getIndexed(propertyPath.asCachedNodePath())

  /**
   * Returns `true` if the given [property] has a custom default value. Use [propertyGetRevert] to
   * get the [property]'s default value.
   *
   * **Note:** This method is used by the Inspector dock to display a revert icon. The object must
   * implement [_propertyCanRevert] to customize the default value. If [_propertyCanRevert] is not
   * implemented, this method returns `false`.
   */
  public final fun propertyCanRevert(`property`: String): Boolean =
      propertyCanRevert(property.asCachedStringName())

  /**
   * Returns the custom default value of the given [property]. Use [propertyCanRevert] to check if
   * the [property] has a custom default value.
   *
   * **Note:** This method is used by the Inspector dock to display a revert icon. The object must
   * implement [_propertyGetRevert] to customize the default value. If [_propertyGetRevert] is not
   * implemented, this method returns `null`.
   */
  public final fun propertyGetRevert(`property`: String): Any? =
      propertyGetRevert(property.asCachedStringName())

  /**
   * Adds or changes the entry [name] inside the object's metadata. The metadata [value] can be any
   * [Variant], although some types cannot be serialized correctly.
   *
   * If [value] is `null`, the entry is removed. This is the equivalent of using [removeMeta]. See
   * also [hasMeta] and [getMeta].
   *
   * **Note:** A metadata's name must be a valid identifier as per [StringName.isValidIdentifier]
   * method.
   *
   * **Note:** Metadata that has a name starting with an underscore (`_`) is considered editor-only.
   * Editor-only metadata is not displayed in the Inspector and should not be edited, although it can
   * still be found by this method.
   */
  public final fun setMeta(name: String, `value`: Any?) = setMeta(name.asCachedStringName(), value)

  /**
   * Removes the given entry [name] from the object's metadata. See also [hasMeta], [getMeta] and
   * [setMeta].
   *
   * **Note:** A metadata's name must be a valid identifier as per [StringName.isValidIdentifier]
   * method.
   *
   * **Note:** Metadata that has a name starting with an underscore (`_`) is considered editor-only.
   * Editor-only metadata is not displayed in the Inspector and should not be edited, although it can
   * still be found by this method.
   */
  public final fun removeMeta(name: String) = removeMeta(name.asCachedStringName())

  /**
   * Returns the object's metadata value for the given entry [name]. If the entry does not exist,
   * returns [default]. If [default] is `null`, an error is also generated.
   *
   * **Note:** A metadata's name must be a valid identifier as per [StringName.isValidIdentifier]
   * method.
   *
   * **Note:** Metadata that has a name starting with an underscore (`_`) is considered editor-only.
   * Editor-only metadata is not displayed in the Inspector and should not be edited, although it can
   * still be found by this method.
   */
  @JvmOverloads
  public final fun getMeta(name: String, default: Any? = null): Any? =
      getMeta(name.asCachedStringName(), default)

  /**
   * Returns `true` if a metadata entry is found with the given [name]. See also [getMeta],
   * [setMeta] and [removeMeta].
   *
   * **Note:** A metadata's name must be a valid identifier as per [StringName.isValidIdentifier]
   * method.
   *
   * **Note:** Metadata that has a name starting with an underscore (`_`) is considered editor-only.
   * Editor-only metadata is not displayed in the Inspector and should not be edited, although it can
   * still be found by this method.
   */
  public final fun hasMeta(name: String): Boolean = hasMeta(name.asCachedStringName())

  /**
   * Returns `true` if the given user-defined [signal] name exists. Only signals added with
   * [addUserSignal] are included. See also [removeUserSignal].
   */
  public final fun hasUserSignal(signal: String): Boolean =
      hasUserSignal(signal.asCachedStringName())

  /**
   * Removes the given user signal [signal] from the object. See also [addUserSignal] and
   * [hasUserSignal].
   */
  public final fun removeUserSignal(signal: String) = removeUserSignal(signal.asCachedStringName())

  /**
   * Emits the given [signal] by name. The signal must exist, so it should be a built-in signal of
   * this class or one of its inherited classes, or a user-defined signal (see [addUserSignal]). This
   * method supports a variable number of arguments, so parameters can be passed as a comma separated
   * list.
   *
   * Returns [ERR_UNAVAILABLE] if [signal] does not exist or the parameters are invalid.
   *
   * ```gdscript
   * //gdscript
   * emit_signal("hit", "sword", 100)
   * emit_signal("game_over")
   * ```
   *
   * ```csharp
   * //csharp
   * EmitSignal(SignalName.Hit, "sword", 100);
   * EmitSignal(SignalName.GameOver);
   * ```
   *
   * **Note:** In C#, [signal] must be in snake_case when referring to built-in Godot signals.
   * Prefer using the names exposed in the `SignalName` class to avoid allocating a new [StringName] on
   * each call.
   */
  public final fun emitSignal(signal: String, vararg args: Any?): Error =
      emitSignal(signal.asCachedStringName(), *args)

  /**
   * Calls the [method] on the object and returns the result. This method supports a variable number
   * of arguments, so parameters can be passed as a comma separated list.
   *
   * ```gdscript
   * //gdscript
   * var node = Node3D.new()
   * node.call("rotate", Vector3(1.0, 0.0, 0.0), 1.571)
   * ```
   *
   * ```csharp
   * //csharp
   * var node = new Node3D();
   * node.Call(Node3D.MethodName.Rotate, new Vector3(1f, 0f, 0f), 1.571f);
   * ```
   *
   * **Note:** In C#, [method] must be in snake_case when referring to built-in Godot methods.
   * Prefer using the names exposed in the `MethodName` class to avoid allocating a new [StringName] on
   * each call.
   */
  public final fun call(method: String, vararg args: Any?): Any? =
      call(method.asCachedStringName(), *args)

  /**
   * Calls the [method] on the object during idle time. Always returns `null`, **not** the method's
   * result.
   *
   * Idle time happens mainly at the end of process and physics frames. In it, deferred calls will
   * be run until there are none left, which means you can defer calls from other deferred calls and
   * they'll still be run in the current idle time cycle. This means you should not call a method
   * deferred from itself (or from a method called by it), as this causes infinite recursion the same
   * way as if you had called the method directly.
   *
   * This method supports a variable number of arguments, so parameters can be passed as a comma
   * separated list.
   *
   * ```gdscript
   * //gdscript
   * var node = Node3D.new()
   * node.call_deferred("rotate", Vector3(1.0, 0.0, 0.0), 1.571)
   * ```
   *
   * ```csharp
   * //csharp
   * var node = new Node3D();
   * node.CallDeferred(Node3D.MethodName.Rotate, new Vector3(1f, 0f, 0f), 1.571f);
   * ```
   *
   * See also [Callable.callDeferred].
   *
   * **Note:** In C#, [method] must be in snake_case when referring to built-in Godot methods.
   * Prefer using the names exposed in the `MethodName` class to avoid allocating a new [StringName] on
   * each call.
   *
   * **Note:** If you're looking to delay the function call by a frame, refer to the [signal
   * SceneTree.process_frame] and [signal SceneTree.physics_frame] signals.
   *
   * ```
   * var node = Node3D.new()
   * # Make a Callable and bind the arguments to the node's rotate() call.
   * var callable = node.rotate.bind(Vector3(1.0, 0.0, 0.0), 1.571)
   * # Connect the callable to the process_frame signal, so it gets called in the next process
   * frame.
   * # CONNECT_ONE_SHOT makes sure it only gets called once instead of every frame.
   * get_tree().process_frame.connect(callable, CONNECT_ONE_SHOT)
   * ```
   */
  public final fun callDeferred(method: String, vararg args: Any?): Any? =
      callDeferred(method.asCachedStringName(), *args)

  /**
   * Assigns [value] to the given [property], at the end of the current frame. This is equivalent to
   * calling [set] through [callDeferred].
   *
   * ```gdscript
   * //gdscript
   * var node = Node2D.new()
   * add_child(node)
   *
   * node.rotation = 1.5
   * node.set_deferred("rotation", 3.0)
   * print(node.rotation) # Prints 1.5
   *
   * await get_tree().process_frame
   * print(node.rotation) # Prints 3.0
   * ```
   *
   * ```csharp
   * //csharp
   * var node = new Node2D();
   * node.Rotation = 1.5f;
   * node.SetDeferred(Node2D.PropertyName.Rotation, 3f);
   * GD.Print(node.Rotation); // Prints 1.5
   *
   * await ToSignal(GetTree(), SceneTree.SignalName.ProcessFrame);
   * GD.Print(node.Rotation); // Prints 3.0
   * ```
   *
   * **Note:** In C#, [property] must be in snake_case when referring to built-in Godot properties.
   * Prefer using the names exposed in the `PropertyName` class to avoid allocating a new [StringName]
   * on each call.
   */
  public final fun setDeferred(`property`: String, `value`: Any?) =
      setDeferred(property.asCachedStringName(), value)

  /**
   * Calls the [method] on the object and returns the result. Unlike [call], this method expects all
   * parameters to be contained inside [argArray].
   *
   * ```gdscript
   * //gdscript
   * var node = Node3D.new()
   * node.callv("rotate", [Vector3(1.0, 0.0, 0.0), 1.571])
   * ```
   *
   * ```csharp
   * //csharp
   * var node = new Node3D();
   * node.Callv(Node3D.MethodName.Rotate, [new Vector3(1f, 0f, 0f), 1.571f]);
   * ```
   *
   * **Note:** In C#, [method] must be in snake_case when referring to built-in Godot methods.
   * Prefer using the names exposed in the `MethodName` class to avoid allocating a new [StringName] on
   * each call.
   */
  public final fun callv(method: String, argArray: VariantArray<Any?>): Any? =
      callv(method.asCachedStringName(), argArray)

  /**
   * Returns `true` if the given [method] name exists in the object.
   *
   * **Note:** In C#, [method] must be in snake_case when referring to built-in Godot methods.
   * Prefer using the names exposed in the `MethodName` class to avoid allocating a new [StringName] on
   * each call.
   */
  public final fun hasMethod(method: String): Boolean = hasMethod(method.asCachedStringName())

  /**
   * Returns the number of arguments of the given [method] by name.
   *
   * **Note:** In C#, [method] must be in snake_case when referring to built-in Godot methods.
   * Prefer using the names exposed in the `MethodName` class to avoid allocating a new [StringName] on
   * each call.
   */
  public final fun getMethodArgumentCount(method: String): Int =
      getMethodArgumentCount(method.asCachedStringName())

  /**
   * Returns `true` if the given [signal] name exists in the object.
   *
   * **Note:** In C#, [signal] must be in snake_case when referring to built-in Godot signals.
   * Prefer using the names exposed in the `SignalName` class to avoid allocating a new [StringName] on
   * each call.
   */
  public final fun hasSignal(signal: String): Boolean = hasSignal(signal.asCachedStringName())

  /**
   * Returns an [Array] of connections for the given [signal] name. Each connection is represented
   * as a [Dictionary] that contains three entries:
   *
   * - [code skip-lint]signal[/code] is a reference to the [Signal];
   *
   * - `callable` is a reference to the connected [Callable];
   *
   * - `flags` is a combination of [ConnectFlags].
   */
  public final fun getSignalConnectionList(signal: String): VariantArray<Dictionary<Any?, Any?>> =
      getSignalConnectionList(signal.asCachedStringName())

  /**
   * Connects a [signal] by name to a [callable]. Optional [flags] can be also added to configure
   * the connection's behavior (see [ConnectFlags] constants).
   *
   * A signal can only be connected once to the same [Callable]. If the signal is already connected,
   * this method returns [ERR_INVALID_PARAMETER] and generates an error, unless the signal is connected
   * with [CONNECT_REFERENCE_COUNTED]. To prevent this, use [isConnected] first to check for existing
   * connections.
   *
   * **Note:** If the [callable]'s object is freed, the connection will be lost.
   *
   * **Note:** In GDScript, it is generally recommended to connect signals with [Signal.connect]
   * instead.
   *
   * **Note:** This operation (and all other signal related operations) is thread-safe.
   */
  @JvmOverloads
  public final fun connect(
    signal: String,
    callable: Callable,
    flags: ConnectFlags = Object.ConnectFlags.DEFAULT,
  ): Error = connect(signal.asCachedStringName(), callable, flags)

  /**
   * Disconnects a [signal] by name from a given [callable]. If the connection does not exist,
   * generates an error. Use [isConnected] to make sure that the connection exists.
   */
  public final fun disconnect(signal: String, callable: Callable) =
      disconnect(signal.asCachedStringName(), callable)

  /**
   * Returns `true` if a connection exists between the given [signal] name and [callable].
   *
   * **Note:** In C#, [signal] must be in snake_case when referring to built-in Godot signals.
   * Prefer using the names exposed in the `SignalName` class to avoid allocating a new [StringName] on
   * each call.
   */
  public final fun isConnected(signal: String, callable: Callable): Boolean =
      isConnected(signal.asCachedStringName(), callable)

  /**
   * Returns `true` if any connection exists on the given [signal] name.
   *
   * **Note:** In C#, [signal] must be in snake_case when referring to built-in Godot methods.
   * Prefer using the names exposed in the `SignalName` class to avoid allocating a new [StringName] on
   * each call.
   */
  public final fun hasConnections(signal: String): Boolean =
      hasConnections(signal.asCachedStringName())

  /**
   * Translates a [message], using the translation catalogs configured in the Project Settings.
   * Further [context] can be specified to help with the translation. Note that most [Control] nodes
   * automatically translate their strings, so this method is mostly useful for formatted strings or
   * custom drawn text.
   *
   * If [canTranslateMessages] is `false`, or no translation is available, this method returns the
   * [message] without changes. See [setMessageTranslation].
   *
   * For detailed examples, see
   * [url=$DOCS_URL/tutorials/i18n/internationalizing_games.html]Internationalizing games[/url].
   *
   * **Note:** This method can't be used without an [Object] instance, as it requires the
   * [canTranslateMessages] method. To translate strings in a static context, use
   * [TranslationServer.translate].
   */
  public final fun tr(message: String, context: String): String =
      tr(message.asCachedStringName(), context.asCachedStringName())

  /**
   * Translates a [message] or [pluralMessage], using the translation catalogs configured in the
   * Project Settings. Further [context] can be specified to help with the translation.
   *
   * If [canTranslateMessages] is `false`, or no translation is available, this method returns
   * [message] or [pluralMessage], without changes. See [setMessageTranslation].
   *
   * The [n] is the number, or amount, of the message's subject. It is used by the translation
   * system to fetch the correct plural form for the current language.
   *
   * For detailed examples, see
   * [url=$DOCS_URL/tutorials/i18n/localization_using_gettext.html]Localization using gettext[/url].
   *
   * **Note:** Negative and [float] numbers may not properly apply to some countable subjects. It's
   * recommended to handle these cases with [tr].
   *
   * **Note:** This method can't be used without an [Object] instance, as it requires the
   * [canTranslateMessages] method. To translate strings in a static context, use
   * [TranslationServer.translatePlural].
   */
  public final fun trN(
    message: String,
    pluralMessage: String,
    n: Int,
    context: String,
  ): String =
      trN(message.asCachedStringName(), pluralMessage.asCachedStringName(), n, context.asCachedStringName())

  /**
   * Sets the name of the translation domain used by [tr] and [trN]. See also [TranslationServer].
   */
  public final fun setTranslationDomain(domain: String) =
      setTranslationDomain(domain.asCachedStringName())

  public enum class ConnectFlags(
    `value`: Long,
  ) : GodotEnum {
    /**
     * Default connections that are immediately emitted
     */
    DEFAULT(0),
    /**
     * Deferred connections trigger their [Callable]s on idle time (at the end of the frame), rather
     * than instantly.
     */
    DEFERRED(1),
    /**
     * Persisting connections are stored when the object is serialized (such as when using
     * [PackedScene.pack]). In the editor, connections created through the Node dock are always
     * persisting.
     */
    PERSIST(2),
    /**
     * One-shot connections disconnect themselves after emission.
     */
    ONE_SHOT(4),
    /**
     * Reference-counted connections can be assigned to the same [Callable] multiple times. Each
     * disconnection decreases the internal counter. The signal fully disconnects only when the counter
     * reaches 0.
     */
    REFERENCE_COUNTED(8),
    /**
     * The source object is automatically bound when a [PackedScene] is instantiated. If this flag
     * bit is enabled, the source object will be appended right after the original arguments of the
     * signal.
     */
    APPEND_SOURCE_OBJECT(16),
    ;

    public override val `value`: Long
    init {
      this.`value` = `value`
    }

    public companion object {
      public fun from(`value`: Long): ConnectFlags = entries.single { it.`value` == `value` }
    }
  }

  public companion object {
    /**
     * Notification received when the object is initialized, before its script is attached. Used
     * internally.
     */
    public final const val NOTIFICATION_POSTINITIALIZE: Long = 0

    /**
     * Notification received when the object is about to be deleted. Can be used like destructors in
     * object-oriented programming languages.
     */
    public final const val NOTIFICATION_PREDELETE: Long = 1

    /**
     * Notification received when the object finishes hot reloading. This notification is only sent
     * for extensions classes and derived.
     */
    public final const val NOTIFICATION_EXTENSION_RELOADED: Long = 2
  }

  public object MethodBindings {
    internal val getClassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Object", "get_class", 201670096)

    internal val isClassPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Object", "is_class", 3927539163)

    internal val setPtr: VoidPtr = TypeManager.getMethodBindPtr("Object", "set", 3776071444)

    internal val getPtr: VoidPtr = TypeManager.getMethodBindPtr("Object", "get", 2760726917)

    internal val setIndexedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Object", "set_indexed", 3500910842)

    internal val getIndexedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Object", "get_indexed", 4006125091)

    internal val getPropertyListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Object", "get_property_list", 3995934104)

    internal val getMethodListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Object", "get_method_list", 3995934104)

    internal val propertyCanRevertPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Object", "property_can_revert", 2619796661)

    internal val propertyGetRevertPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Object", "property_get_revert", 2760726917)

    internal val notificationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Object", "notification", 4023243586)

    internal val toStringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Object", "to_string", 2841200299)

    internal val getInstanceIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Object", "get_instance_id", 3905245786)

    internal val setScriptPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Object", "set_script", 1114965689)

    internal val getScriptPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Object", "get_script", 1214101251)

    internal val setMetaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Object", "set_meta", 3776071444)

    internal val removeMetaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Object", "remove_meta", 3304788590)

    internal val getMetaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Object", "get_meta", 3990617847)

    internal val hasMetaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Object", "has_meta", 2619796661)

    internal val getMetaListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Object", "get_meta_list", 3995934104)

    internal val addUserSignalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Object", "add_user_signal", 85656714)

    internal val hasUserSignalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Object", "has_user_signal", 2619796661)

    internal val removeUserSignalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Object", "remove_user_signal", 3304788590)

    internal val emitSignalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Object", "emit_signal", 4047867050)

    internal val callPtr: VoidPtr = TypeManager.getMethodBindPtr("Object", "call", 3400424181)

    internal val callDeferredPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Object", "call_deferred", 3400424181)

    internal val setDeferredPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Object", "set_deferred", 3776071444)

    internal val callvPtr: VoidPtr = TypeManager.getMethodBindPtr("Object", "callv", 1260104456)

    internal val hasMethodPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Object", "has_method", 2619796661)

    internal val getMethodArgumentCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Object", "get_method_argument_count", 2458036349)

    internal val hasSignalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Object", "has_signal", 2619796661)

    internal val getSignalListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Object", "get_signal_list", 3995934104)

    internal val getSignalConnectionListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Object", "get_signal_connection_list", 3147814860)

    internal val getIncomingConnectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Object", "get_incoming_connections", 3995934104)

    internal val connectPtr: VoidPtr = TypeManager.getMethodBindPtr("Object", "connect", 1518946055)

    internal val disconnectPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Object", "disconnect", 1874754934)

    internal val isConnectedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Object", "is_connected", 768136979)

    internal val hasConnectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Object", "has_connections", 2619796661)

    internal val setBlockSignalsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Object", "set_block_signals", 2586408642)

    internal val isBlockingSignalsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Object", "is_blocking_signals", 36873697)

    internal val notifyPropertyListChangedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Object", "notify_property_list_changed", 3218959716)

    internal val setMessageTranslationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Object", "set_message_translation", 2586408642)

    internal val canTranslateMessagesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Object", "can_translate_messages", 36873697)

    internal val trPtr: VoidPtr = TypeManager.getMethodBindPtr("Object", "tr", 1195764410)

    internal val trNPtr: VoidPtr = TypeManager.getMethodBindPtr("Object", "tr_n", 162698058)

    internal val getTranslationDomainPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Object", "get_translation_domain", 2002593661)

    internal val setTranslationDomainPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Object", "set_translation_domain", 3304788590)

    internal val isQueuedForDeletionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Object", "is_queued_for_deletion", 36873697)

    internal val cancelFreePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Object", "cancel_free", 3218959716)
  }
}
