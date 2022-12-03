// plugins to extend gradle itself
pluginManagement {
    repositories.gradlePluginPortal()
//    repositories.mavenCentral()
//    repositories.google()
//    // custom repository
//    repositories.maven("https://my.locationr/epo") {
//        credentials.username = "..."
//        credentials.password = "..."
//    }
//    // your own implemented plugins locally
//    includeBuild("gradle/plugins")
}

// include some java binary dependencies which are not a part of this project
dependencyResolutionManagement {
    repositories.mavenCentral()
//    repositories.google()
//    // custom repository
//    repositories.maven("https://my.locationr/epo") {
//        credentials.username = "..."
//        credentials.password = "..."
//    }
//    // include some java (not binary) dependency
//    includeBuild("../my-other-project")
}

rootProject.name = "gradle-app-example"

include("app")
include("business-logic")
include("data-model")
