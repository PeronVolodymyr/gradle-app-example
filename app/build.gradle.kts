plugins {
//  Custom plugin on top of standard "application" plugin
    id("my-application")
}

application {
    mainClass.set("com.example.MyApplication")  // This is the entry point of our application.
}

// 'app' depends on 'data-model' and 'business-logic' modules
dependencies {
//  Dependency versioning. Comment it out as I would prefer to use another approach with 'libs.versions.toml'.
//  implementation(platform("com.example:platform"))

    implementation(project(":data-model"))
    implementation(project(":business-logic"))
//  This library is declared here and in 'business-logic' module for strict dependency separation.
    implementation(libs.commons.lang)

//  slf4j implementation
    runtimeOnly(libs.slf4j.simple)
}

