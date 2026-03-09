package versioninfo

import org.ajoberstar.grgit.Grgit
import org.ajoberstar.grgit.gradle.GrgitPlugin
import org.gradle.api.Plugin
import org.gradle.api.Project

class VersionInfoPlugin: Plugin<Project> {
    override fun apply(target: Project) {
        target.plugins.apply(GrgitPlugin::class.java)
        grgit = target.extensions.getByType(Grgit::class.java)
        // no op
    }
}

internal lateinit var grgit: Grgit
