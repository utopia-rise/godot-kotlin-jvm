package godot.annotation.processor.ext

import godot.entrygenerator.model.RegisteredClassMetadataContainer

internal fun RegisteredClassMetadataContainer.provideRegistrationFileDir(
    currentCompilationProjectName: String,
    registrationBaseDirPathRelativeToProjectDir: String
): String {
    // keep in sync with ClassRegistry!
    return if (currentCompilationProjectName == projectName) {
        "${registrationBaseDirPathRelativeToProjectDir}/${localResPath}"
    } else {
        "${registrationBaseDirPathRelativeToProjectDir}/dependencies/${projectName}/${localResPath}"
    }
}
