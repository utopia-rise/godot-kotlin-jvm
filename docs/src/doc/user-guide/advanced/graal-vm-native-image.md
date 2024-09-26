!!!danger
    If you intend to use GraalVM native image for your project, it should be considered from the beginning of your project and the configurations tested regularly! Adding GraalVM native image after the fact can be very hard to do! 

!!! warning  
    Reloading code changes in the editor is not possible with native-image, as it would require to reload the JVM.

On desktop platform, you can choose to build a [GraalVM native image](https://www.graalvm.org/reference-manual/native-image/). You first need to install graal-vm and its tool native image. Then, you should set `GRAALVM_HOME` environment variable to point to GraalVM's home folder.  

On Windows, you should add `VC_VARS_PATH` environment variable to point to vcvars bat file. This is mandatory so that we can initialize visual studio tools. (Example: `C:\Program Files (x86)\Microsoft Visual Studio\2019\Community\VC\Auxiliary\Build\vcvars64.bat`)

In order to build a native image, you should add the following configuration to gradle plugin to enable building of native-image:
```kotlin
godot {
    isGraalNativeImageExportEnabled.set(true)
    graalVmDirectory.set(File(System.getenv("GRAALVM_HOME")))
    windowsDeveloperVCVarsPath.set(File(System.getenv("VC_VARS_PATH")))
}
```

In order to use the generated native-image, you can pass `--java-vm-type=graal` argument to engine, or simply change `godot_kotlin_configuration.json` to set vm_type to `graal_native_image`.

## Reflection, libraries and JNI with native image

GraalVM native image performs AOT compilation. In order to be able to use reflection and jni, you need to provide an additional configuration file.  
This applies also for third party library you use that would do reflection. You can find documentation on how to easily generate them [here](https://www.graalvm.org/reference-manual/native-image/Agent/).

In order to append those configurations add the json in `graal` folder of your project (it should be generated on first graal native image use). Then you can add the `additionalGraalJniConfigurationFiles` and `additionalGraalReflectionConfigurationFiles` parameters like this:

```kotlin
godot {
    isGraalNativeImageExportEnabled.set(true)
    graalVmDirectory.set(File(System.getenv("GRAALVM_HOME")))
    windowsDeveloperVCVarsPath.set(File(System.getenv("VC_VARS_PATH")))
    
    additionalGraalJniConfigurationFiles.set(arrayOf("my-jni-configuration-file.json", "another-conf.json"))
    additionalGraalReflectionConfigurationFiles.set(arrayOf("my-reflection-configuration-file.json", "another-conf.json"))
}
```

The same applies for resource files which should be added (basically any files in the `res` folder of your project or a dependency of it):

```kotlin
godot {
    isGraalNativeImageExportEnabled.set(true)
    graalVmDirectory.set(File(System.getenv("GRAALVM_HOME")))
    windowsDeveloperVCVarsPath.set(File(System.getenv("VC_VARS_PATH")))
    
    additionalGraalJniConfigurationFiles.set(arrayOf("my-jni-configuration-file.json", "another-conf.json"))
    additionalGraalReflectionConfigurationFiles.set(arrayOf("my-reflection-configuration-file.json", "another-conf.json"))
    additionalGraalResourceConfigurationFiles.set(arrayOf("my-resource-configuration-file.json", "another-conf.json"))
}
```