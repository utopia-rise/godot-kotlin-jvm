On desktop platform, you can choose to build a [GraalVM native image](https://www.graalvm.org/reference-manual/native-image/).  
You first need to install graal-vm and its tool native image. Then, you should set `GRAALVM_HOME` environment variable
to point to GraalVM's home folder.  

On windows, you should add `VCINSTALLDIR` environment variable. This is mandatory so that we can initialize visual studio
tools.

In order to build a native image, you should add configuration to gradle plugin to enable building of native-image this
way:
```kotlin
godot {
    isGraalExportEnabled.set(true)
    nativeImageToolPath.set("${System.getenv("GRAALVM_HOME")}/bin/native-image")
    
    windowsDeveloperVCVarsPath.set("${System.getenv("VCINSTALLDIR")}/Auxiliary/Build/vcvars64.bat")
}
```

In order to use the generated native-image, you can pass `--java-vm-type=graal` argument to engine, or simply change
`godot_kotlin_configuration.json` to set vm_type to `graal`.