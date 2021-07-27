## Prerequisites
If you want to debug your code and you're already using an embedded jre, make sure you've included the following modules:

- `jdk.jdwp.agent`

!!! info
    Example: `jlink --add-modules java.base,java.logging,jdk.jdwp.agent --output jre`

If you still rely on your installed jdk in `JAVA_HOME` you can just follow on.

## Run and attach Remote Debugger
Run your game with the commandline option `--jvm-debug-port=<port (normally 5005)>` and attach a remote debugger.

!!! info
    If you specify either `--jvm-debug-port` or `--jvm-debug-address` the execution of the game will suspend until you attach a remote debugger.

Example:  
![remote debug configuration](../assets/img/remote_debug_configuration.png)