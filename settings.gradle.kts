import java.util.Locale

pluginManagement {
    repositories {
        mavenLocal()
        gradlePluginPortal()
        maven("https://papermc.io/repo/repository/maven-public/")
    }
}

rootProject.name = "Nanaica"

for (name in listOf("Nanaica-API", "Nanaica-Server")) {
    val projName = name.lowercase(Locale.ENGLISH)
    include(projName)
    findProject(":$projName")!!.projectDir = file(name)