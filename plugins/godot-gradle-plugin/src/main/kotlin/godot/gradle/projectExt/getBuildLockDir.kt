package godot.gradle.projectExt

import org.gradle.api.Project
import java.io.File

fun Project.getBuildLockDir(): File {
    val name = "${projectDir.name}_buildLockDir"  //keep the same in the Bootstrap class!
    val tmpDir = System.getProperty("java.io.tmpdir")
    val lockDir = File(tmpDir, name)

    return if (lockDir.exists() && lockDir.isDirectory) {
        lockDir
    } else {
        lockDir.delete()
        lockDir.mkdirs()
        lockDir
    }
}
