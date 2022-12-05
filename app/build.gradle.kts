plugins {
//  Custom plugin on top of standard "application" plugin
    id("my-application")
}

application {
    mainClass.set("com.example.MyApplication")  // This is the entry point of our application.
}

// 'app' depends on 'data-model' and 'business-logic' modules
dependencies {
//  Dependency versioning
    implementation(platform("com.example:platform"))

    implementation(project(":data-model"))
    implementation(project(":business-logic"))
//  This library is declared here and in 'business-logic' module for strict dependency separation.
    implementation("org.apache.commons:commons-lang3")

//  slf4j implementation
    runtimeOnly("org.slf4j:slf4j-simple")
}

