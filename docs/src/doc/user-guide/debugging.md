## Prerequisites
In order to debug your code using an embedded JRE, make sure to include the following modules:

- `jdk.jdwp.agent`

!!! info
    Example: `jlink --add-modules java.base,java.logging,jdk.jdwp.agent --output jre`

## Run and attach Remote Debugger
Run your game with the commandline option `--jvm-debug-port=<port (normally 5005)>` and attach a remote debugger.

!!! info
    If you specify either `--jvm-debug-port` or `--jvm-debug-address` the execution of the game will suspend until you attach a remote debugger. You can configure this behaviour by specifying `--wait-for-debugger=true` or `--wait-for-debugger=false`. You can also supply these arguments through `godot_kotlin_configuration.json` (see: [Module configuration](advanced/module-configuration.md). But keep in mind the warnings mentioned in that section!)

Example:  
![remote debug configuration](../assets/img/remote_debug_configuration.png)
