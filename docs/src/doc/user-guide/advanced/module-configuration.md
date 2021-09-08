Some settings can be changed to alter the behaviour of this module to your needs.

## Configuration file
Upon first execution, the editor will generate a `godot_kotlin_configuration.json` configuration file with all default settings defined. You can alter each of the settings to your liking changes will apply once the editor is reloaded.

!!! warning "Exports"
    The contents of `godot_kotlin_configuration.json` are also exported when you export a game! So if you change some debug settings you don't want to have included in a release build, make sure to reset those before exporting. But we generally advise you to use commandline args for these kind of settings. See [Commandline args](#commandline-args).

## Commandline args
Each of the settings defined in the `godot_kotlin_configuration.json` can also be passed as commandline args to the editor or your game executable. Our module will first load all configurations defined in `godot_kotlin_configuration.json` and will then override all values which you have passed through commandline. So commandline args take precedence over `godot_kotlin_configuration.json`!

## Exporting
When you export your game, the content of `godot_kotlin_configuration.json` will be copied to the exported game. Any settings passed to the editor through [Commandline args](#commandline-args) are ignored. Commandline args are only for the currently executed instance and are thus not passed on to exported games.

!!! info
    We generally advise you to pass settings you only need for the editor to pass via commandline to not accidentally include debug settings in exported executables

## Configuration options
The options below are the same regardless if you pass them by commandline or provide them through the `godot_kotlin_configuration.json`:

| Argument | Default value | Description | Example |
| --- | --- | --- | --- |
| --java-vm-type | jvm | Defines the VM to run on. Possible values are `jvm` and `graal_native_image`. When set to `graal_native_image` it uses Graal native image. This has no effect on android platform. |
| --jvm-debug-port | | Defines the port to which you can attach a remote debugger. **Note:** the module `jdk.jdwp.agent` is needed in the embedded JRE if you want to debug your application. If you need `jmx`, also the module `jdk.management.agent` is needed | `--jvm-debug-port=5005` |
| --jvm-debug-address | | Defines which adresses are allowed for debugging | `--jvm-debug-address=localhost` |
| --wait-for-debugger | true | Accepted values: `true` or `false`. Defines if the jvm should suspend execution until a remote debugger is attached. Only effective if either `--jvm-debug-port` or `--jvm-debug-address` is set | `--wait-for-debugger=true` |
| --jvm-jmx-port | | Defines the jmx port. **Note:** the module `jdk.management.agent` is needed in the embedded JRE to be able to use jmx | `--jvm-jmx-port=5006` |
| --jvm-to-engine-max-string-size | 512 | Maximun size of strings sent through the buffer. When above that value, strings are sent with a slower JNI Call. A bigger size means a bigger buffer. Increase if you need a lot of long strings and don't mind using more memory. One buffer exists for each thread | `--jvm-to-engine-max-string-size=512` |
| --jvm-force-gc | | If set the JVM GC is forced to run when our own GC runs. | `--jvm-force-gc` |
| --jvm-disable-gc | | Disables our GC. **Caution:** If you disable our GC you **will** have memory leaks as all Reference types and Native Types are not Garbage collected anymore | `--jvm-disable-gc` |
| --jvm-disable-closing-leaks-warning | | Disables the output of leaked instances when closing the application | `--jvm-disable-closing-leaks-warning` |


## Examples
```json
{
  "is_waiting_for_debugger": true,
  "jvm-disable-closing-leaks-warning": true,
  "jvm-disable-gc": false,
  "jvm-force-gc": false,
  "jvm_debug_address": "",
  "jvm_debug_port": "",
  "jvm_jmx_port": "",
  "max_string_size": 512,
  "vm_type": "jvm"
}
```

`./godot.x11.tools.64 -v --jvm-debug-port=5005 --jvm-debug-address=localhost`