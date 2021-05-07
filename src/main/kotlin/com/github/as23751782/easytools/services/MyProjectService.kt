package com.github.as23751782.easytools.services

import com.github.as23751782.easytools.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
