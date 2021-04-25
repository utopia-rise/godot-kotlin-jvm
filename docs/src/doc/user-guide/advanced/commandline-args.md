The following command line args can be supplied to customize the behaviour or the Godot Kotlin/JVM binding:

| Argument | Default value | Description |
| --- | --- | ---|
| --jvm-debug-port | | Defines the port to which you can attach a remote debugger. **Note:** the module `jdk.jdwp.agent` is needed in the embedded JRE if you want to debug your application. If you need `jmx`, also the module `jdk.management.agent` is needed |
| --jvm-debug-address | | Defines which adresses are allowed for debugging |
| --jvm-jmx-port | | Defines the jmx port. **Note:** the module `jdk.management.agent` is needed in the embedded JRE to be able to use jmx |
| --jvm-to-engine-max-string-size | 512 | Maximun size of strings sent through the buffer. When above that value, strings are sent with a slower JNI Call. A bigger size means a bigger buffer. Increase if you need a lot of long strings and don't mind using more memory. One buffer exists for each thread |
| --jvm-force-gc | | If set the JVM GC is forced to run when our own GC runs. The interval is defined with `--jvm-gc-thread-period-millis` and defaults to 500ms |
| --jvm-disable-gc | | Disables our GC. **Caution:** If you disable our GC you **will** have memory leaks as all Reference types and Native Types are not Garbage collected anymore |
| --jvm-disable-closing-leaks-warning | | Disables the output of leaked instances when closing the application |
