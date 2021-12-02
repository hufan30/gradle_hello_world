import org.gradle.api.Plugin
import org.gradle.api.Project

class Myplugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.tasks.create("print233") {
            doLast {
                println(project.name)
            }
        }
    }
}