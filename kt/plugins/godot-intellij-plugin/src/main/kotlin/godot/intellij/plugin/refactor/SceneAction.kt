package godot.intellij.plugin.refactor

import com.intellij.openapi.module.Module
import godot.intellij.plugin.data.model.ResPath

object SceneAction {

    /**
     * Replaces old script paths in scene files with new script paths where possible
     */
//    fun scriptMoved(project: Project, oldPath: String, newPath: String, fqNames: List<String>) {
//        val resPath = project.basePath ?: return
//        val oldPathResBased = oldPath.removePrefix(resPath).removePrefix(File.separator).replace(File.separator, "/")
//        val newPathResBased = newPath.removePrefix(resPath).removePrefix(File.separator).replace(File.separator, "/")
//
//        File(resPath)
//            .walkTopDown()
//            .filter { it.isFile && it.exists() && it.extension == "tscn" }
//            .forEach { sceneFile ->
//                // if this should become a memory problem on large scene files,
//                // replace it with a buffered read/write line by line to a new file
//                // and replace the old file with the new one when done writing
//                val sceneContent = sceneFile.readText()
//                var newSceneContent = sceneContent
//                fqNames.forEach { fqName ->
//                    val className = fqName.substringAfterLast(".")
//                    val oldResPath = "res://$oldPathResBased/$className.kt"
//                    val newResPath = "res://$newPathResBased/$className.kt"
//
//                    if (sceneContent.contains(oldResPath)) {
//                        newSceneContent = sceneContent.replace(oldResPath, newResPath)
//                    }
//                }
//                if (newSceneContent != sceneContent) {
//                    sceneFile.writeText(newSceneContent)
//                }
//            }
//    }

    fun scriptMoved(module: Module, oldResPath: ResPath, newResPath: ResPath) {
        val oldResPathFile = oldResPath.asFile(module) ?: return
        val newResPathFile = oldResPath.asFile(module) ?: return

        println("Performing refactor:")
        println("Old ResPath: $oldResPath")
        println("New ResPath: $newResPath")

//        if (oldResPathFile.exists()) {
//            oldResPathFile.copyTo(newResPathFile, overwrite = true)
//            oldResPathFile.delete()
//        }
//
//        FileTypeIndex
//            .getFiles(GodotSceneFileType.INSTANCE, GlobalSearchScope.projectScope(module.project))
//            .forEach { sceneFile ->
//                // if this should become a memory problem on large scene files,
//                // replace it with a buffered read/write line by line to a new file
//                // and replace the old file with the new one when done writing
//                val sceneContent = sceneFile.readText()
//
//                if (sceneContent.contains(oldResPath.godotPath)) {
//                    sceneFile.writeText(
//                        sceneContent
//                            .replace(oldResPath.godotPath, newResPath.godotPath)
//                    )
//                }
//            }
    }
}
