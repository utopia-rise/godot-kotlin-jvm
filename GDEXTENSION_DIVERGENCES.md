# Master (module) vs. GDExtension: significant implementation divergences

This documents every place where the GDExtension port (`rework/gdextension`) had to use a
**genuinely different mechanism** than the Godot-module `master` branch — not renames or
signature tweaks, but a different API family, a different control-flow shape, or something with
no public equivalent godot-cpp exposes at all. Compiled from a full master-vs-branch review plus
the build-fix pass that got both `editor` and `template_release` targets compiling and linking.

Two items below were corrected mid-investigation after being challenged — see the "Corrected"
notes. Two items are still open decisions, not yet acted on — see "Open follow-up" at the bottom.

## Script instance ABI (foundational)

- **Whole instance model**: master subclassed Godot's C++ `ScriptInstance` directly (virtual
  dispatch, real C++ types). GDExtension has no such class — instead you populate a
  `GDExtensionScriptInstanceInfo3`, a struct of C function pointers keyed to an opaque
  `GDExtensionScriptInstanceDataPtr`, using raw ABI types (`GDExtensionBool`,
  `GDExtensionVariantPtr`, `GDExtensionPropertyInfo`, `GDExtensionMethodInfo`,
  `GDExtensionCallError`) instead of C++ objects/references.
- **Attaching an instance to an object**: master called `owner->set_script_instance(instance)`
  directly. No such entry point exists for GDExtensions — the port calls `owner->set_script(this)`
  and relies on the engine's own internal machinery to create the instance via the registered
  `GDExtensionScriptInstanceInfo3`. This is a workaround (flagged with a TODO in
  `jvm_script.cpp`), not a full equivalent.
- **RPC config reporting**: master's `ScriptInstance` had a per-instance `get_rpc_config()` the
  engine queried live. `GDExtensionScriptInstanceInfo3` has no RPC-config function pointer at
  all — the capability moved up to the `Script`-level `_get_rpc_config()` virtual instead.
- **Method/property-info marshaling — corrected, prior work already existed**: godot-cpp provides
  a whole-list converter for `PropertyInfo` (`internal::create_c_property_list`/
  `free_c_property_list`) but nothing for `MethodInfo` lists or for converting a single
  `PropertyInfo` in place (needed by `validate_property`, `get_method_list`/`free_method_list`).
  Initially hand-written from scratch into a new file, `src/engine/method_info_conversion.{h,cpp}`,
  believing no prior attempt existed. **This was wrong** — a matching `godot::internal::
  convert_property_to_c`/`create_c_method_list`/`free_c_method_list` implementation already
  existed in `src/engine/internal.{h,cpp}` (same on `origin/rework/gdextension`), but it was
  silently broken in two ways: (1) `internal.cpp` opened `namespace internal { ... }` at *global*
  scope instead of `godot::internal` — `using namespace godot;` earlier in the file does **not**
  make an unqualified `namespace internal {}` block extend `godot::internal`; namespace-reopening
  is purely lexical and ignores using-directives — so it defined a disconnected `::internal::*`
  that could never satisfy the `godot::internal::*` declarations the rest of the code calls, and
  would never have linked; (2) `create_c_method_list`'s loop never incremented its index, so every
  method overwrote array slot 0 and the rest of the array was uninitialized garbage. Because that
  file was dead code, the new from-scratch file accidentally became the one satisfying the
  linker — duplicating the same three declarations under two names. Consolidated: fixed both bugs
  in `src/engine/internal.{h,cpp}` (the intended, pre-existing location) and deleted
  `method_info_conversion.{h,cpp}` entirely, updating the two call sites'
  (`jvm_instance.cpp`/`jvm_placeholder_instance.cpp`) includes accordingly.
- **`Object::get_class_name()`**: master's virtual, dynamic-dispatch class-name lookup has no
  direct analog. The similarly-named `get_class_static()` is a **non-virtual, compile-time-per-type
  static method** that silently returns the wrong answer through a base pointer (always
  `"Object"`). The real equivalent is the differently-named `get_class()` (confirmed: it ptrcalls
  the engine's own `get_class` method-bind). Fixed in `src/core/jvm_binding.cpp`.

## Variant / Callable / packed-array bridging

- **Packed array backing type**: master could use the generic `Vector<T>` directly as bridge
  storage with free implicit conversion to/from `Variant`. GDExtension's `Variant` has no
  conversion to/from generic `Vector<T>` at all — only to the concrete `Packed*Array` types. The
  whole bridge template (`src/jvm/wrapper/bridge/packed_array_bridge.h`) was restructured around a
  compile-time trait mapping each element type to its real `Packed*Array` type. Files touched:
  `packed_array_bridge.h` (core rewrite) plus `packed_byte_array_bridge.cpp`,
  `packed_float_32/64_array_bridge.cpp`, `packed_int_32/64_array_bridge.cpp`,
  `packed_color_array_bridge.cpp` (each had their own separate leftover `Vector<T>` in their
  per-type conversion methods). `packed_string/vector2/3/4_array_bridge.cpp` needed no direct
  edits — they already used the concrete type in their own conversion methods.
- **Dynamic-arity deferred calls**: `call_deferred()` is a variadic-template-only signature (no
  Array/pointer-array overload) — bridging a JNI call with a runtime-determined argument count
  requires a hand-written 17-way `switch` unpacking 0–16 positional arguments into the template
  call. (An alternative was investigated — `callable->bindv(args_array).call_deferred()`, binding
  the dynamic Array first since `bindv()` is real and Array-based, then deferring with zero further
  arguments — and it does work and compiles. Deliberately kept as the explicit switch instead, by
  request, rather than switched to the `bindv` composition.) Implemented in
  `src/jvm/wrapper/bridge/callable_bridge.cpp`.
- **Dynamic-arity call/bind**: similarly, master's `callp`/`bindp` (pointer array + count) and
  `Callable::CallError` don't exist in godot-cpp; only the Array-based `callv`/`bindv` do, and
  error reporting is the raw `GDExtensionCallError` struct instead of a C++ type.
- **Cancellable-callable + Signal connect**: master connected a custom Callable to a Signal with
  `CONNECT_ONE_SHOT`, special-casing `Node` targets via `call_thread_safe` to force the connect
  onto the main thread. `call_thread_safe` doesn't exist anywhere in godot-cpp's public API — that
  thread-safety mechanism was dropped outright, not replaced.
- **`WeakRef` construction**: master built a `Ref<WeakRef>` and called `->set_obj(target)`
  directly. godot-cpp's `WeakRef` exposes only `get_ref()` — no setter. The only public path to a
  populated `WeakRef` is the free function `UtilityFunctions::weakref(variant)`.
- **`duplicate_deep()` signature**: master took a `ResourceDeepDuplicateMode` enum. godot-cpp's
  real signature takes a raw `int64_t` — no enum type exists in the public API for this at all.
- **`printRaw()`**: master used `OS::print(...)` (no forced newline). godot-cpp exposes no
  `OS::print` — only `print_line()`, which always appends `\n`.

## Registration / engine wiring

- **Script language registration**: master's `ScriptServer::register_language/unregister_language`
  (a static registry class) doesn't exist in godot-cpp — the equivalent is an instance method on
  the `Engine` singleton, `Engine::get_singleton()->register_script_language(...)`.
- **Resource loader/saver registration**: same shape — `ResourceLoader::add_resource_format_loader`
  went from a static-style call to an instance method on `ResourceLoader::get_singleton()`.
- **Custom EditorPlugin registration**: master used `EditorPlugins::add_create_func(factory)`.
  godot-cpp only exposes the template-based `EditorPlugins::add_by_type<T>()` — the factory
  function pattern is gone entirely.
- **Deferred editor-plugin init timing**: master used `EditorNode::add_init_callback(callback)` to
  defer work until the editor UI existed. `EditorNode` isn't exposed to GDExtensions at all — the
  logic now runs synchronously inside the `MODULE_INITIALIZATION_LEVEL_EDITOR` callback instead.
- **`Engine::is_project_manager_hint()` — reframed after user correction**: no equivalent exists
  in godot-cpp's `Engine` (only the semantically different `is_editor_hint()`). Initially framed
  as "a dropped capability." **Corrected**: it isn't a gap at all — a GDExtension is never loaded
  by the bare project manager in the first place (unlike a module, which is compiled into the
  binary and always initializes), so the guard had nothing to protect against here. The check was
  removed and `src/register_types.cpp` documents this explicitly instead of carrying a TODO.
- **JVM stacktrace surfaced to the debugger**: master fed live JVM call-stack frames into Godot's
  debugger via `debug_get_current_stack_info()`. No GDExtension path exists for this currently —
  dropped, not reimplemented (the surviving TODO cites upstream Godot issue #91006).

## Dynamic library / JVM lifecycle

- **JVM shared-library loading**: master used `OS::open_dynamic_library`/`close_dynamic_library`/
  `get_dynamic_library_symbol_handle`. None of these exist in godot-cpp's `OS` binding at all. Had
  to hand-implement raw native `LoadLibrary`/`FreeLibrary`/`GetProcAddress` (Windows) and
  `dlopen`/`dlclose`/`dlsym` (POSIX) — new `src/engine/dynamic_library.{h,cpp}`, bypassing Godot's
  API entirely for this one need.
- **Android JVM discovery**: master used Godot's own internal `platform/android/...` headers and a
  `get_jni_env()` helper to reuse the JNIEnv/JavaVM the engine's Android activity already created.
  Nothing in godot-cpp exposes this — unresolved gap, documented with a TODO, no substitute
  written.

## Editor/project settings & I/O

- **`_GLOBAL_DEF`/`_EDITOR_DEF` — corrected after user-prompted investigation**: master's macros
  atomically "create this setting with a default if missing, and record the reset value." No
  single godot-cpp equivalent exists — but a real dedicated `set_setting(name, value)` method
  **does** exist on both `ProjectSettings` and `EditorSettings` (confirmed by checking
  `utopia-rise/fmod-gdextension`, a sibling project on the same godot-cpp version, which uses
  exactly this pattern in `src/tools/fmod_editor_plugin.cpp`). The first pass in this repo used the
  generic `Object::set()` instead of the dedicated `set_setting()`, and was missing
  `set_initial_value()`/`set_as_basic()` for the `gradle_dir` project setting. Fixed in
  `src/editor/godot_jvm_editor.cpp` to match the proven pattern: `has_setting()` check →
  `set_setting()` → `add_property_info()` → `set_as_basic()` → `set_initial_value()`.
- **Package-substitution trigger point**: master hooked the per-language `Script::set_path()`
  override to substitute `%PACKAGE%` the first time a templated script's path was set. Initially
  claimed `ScriptExtension` has no path hook at all — **wrong**: `godot::Resource` (base of
  `Script`) exposes a real virtual, `virtual void _set_path_cache(const String &p_path) const;`,
  confirmed to fire from the engine's own `set_path()`/`take_over_path()`/`set_path_cache()` flow
  (`gen/src/classes/resource.cpp`). Now implemented: `JvmScript::_set_path_cache()` (TOOLS_ENABLED
  only, matching master) calls the existing per-language `_format_template()` virtual, restoring
  master's exact trigger timing — substitution happens once, at path assignment, not just at save
  time. Required marking `JvmScript::source` (`src/api/script/jvm_script.h`) `mutable` and
  `_format_template()` `const` throughout, since `_set_path_cache` is `const`. The one remaining
  divergence is just the mechanism name/shape (`_set_path_cache` on `Resource`, no `p_take_over`
  parameter, `const`-qualified) vs. master's non-const `Script::set_path(path, take_over)` — no
  longer a behavioral gap.
- **Editor syntax highlighting**: master subclassed the engine-internal
  `EditorStandardSyntaxHighlighter`, inheriting generic keyword/comment/string highlighting for
  free. godot-cpp only exposes the much lower-level base `EditorSyntaxHighlighter` (different
  virtual: `_get_line_syntax_highlighting`) — the highlighting logic had to be rewritten from
  scratch, and the rewrite is a materially simpler approximation (no multiline block-comment
  tracking, hardcoded colors, no per-language keyword source).
- **`FileAccess::open` with inline error**: master's `open(path, mode, &err)` overload doesn't
  exist — godot-cpp requires a separate `FileAccess::get_open_error()` call immediately after a
  plain `open()`, a two-step pattern instead of one (a source of a real null-deref bug in the
  port's first pass).
- **UTF-8 validity checking**: master's `get_as_utf8_string()` + `String::is_valid_string()` combo
  detected and rejected malformed file content, failing the load with `ERR_INVALID_DATA`.
  godot-cpp only exposes `get_as_text()`, which silently replaces invalid byte sequences (typically
  with U+FFFD) instead of signaling failure — you still always get a `String` back, there's just no
  way to detect/report that the input was malformed anymore, so a bad file loads as garbled text
  instead of failing outright.
- **Resource loader `_load()` error signaling**: master's `load()` had explicit `Error*`/`float*`
  out-parameters. GDExtension's `_load()` virtual returns a bare `Variant` where an `Error` value
  doubles as the failure signal — an out-param vs. tagged-return-value shape change.
- **Editor filesystem refresh**: master's incremental `scan_changes()` has no godot-cpp
  equivalent — only the heavier full `scan()` is exposed.
- **Blocking subprocess execution**: master's `OS::execute(...)` overload took an explicit
  `Mutex*` to synchronize concurrent pipe reads. `execute()` itself is still used identically in
  the port (there's no other way to run Gradle) — only the mutex parameter is gone; godot-cpp's
  public `OS::execute()` binding has no such parameter slot, so that synchronization primitive
  can't be expressed through the public API at all and was dropped rather than replaced.
- **Recursive directory copy** (export plugin, JRE bundling): godot-cpp's `DirAccess` has no
  `copy_dir` — hand-rolled from `list_dir_begin`/`get_next`/`copy`/`make_dir_recursive`.
- **Export-preset exclude filtering**: master could set the preset's exclude filter directly.
  godot-cpp's `EditorExportPreset` only exposes a getter — achieved the same practical effect via
  a per-file `should_skip_export()`/`skip()` check inside `_export_file()` instead.

## Open follow-up (not yet acted on)

- **`KtFunction::get_parameter_count()`**: the C++ side (`kt_function.h/.cpp`) is wired up, but
  no Kotlin-side `getParameterCount()` exists anywhere in `kt/godot-library/...` — this will throw
  `NoSuchMethodError` at runtime the first time it's invoked. Needs a Kotlin-side addition, outside
  this C++-only pass's scope.
- **Custom-Callable JNI surface**: the real compiled Kotlin classes backing the callable bridge are
  `godot.core.Callable$Bridge`/`LambdaContainer` (per `Callable.kt`/`LambdaCallable.kt`), not the
  `NativeCallable$Bridge`/`LambdaCallable$Bridge` names the current C++ code (`kotlin_callable_custom.h`)
  expects. This is a real, larger mismatch needing a coordinated C++ + Kotlin redesign, not covered
  by this pass.
- **`TransferContext::icall` debug-mode safety check**: master decoded the receiver's `ObjectID`
  and checked liveness before dereferencing, throwing a clean JVM exception on a freed object
  instead of dereferencing a dangling pointer. The redesigned `icall` (now cached-`MethodBind`-based)
  never restored this check. Not yet fixed.
