plugins {
//  Custom plugin on top of standard "application" plugin
    id("my-application")
}

application {
    mainClass.set("com.example.MyApplication")  // This is the entry point of our application.
}

// 'app' depends on 'data-model' and 'business-logic' modules
dependencies {
    implementation(project(":data-model"))
    implementation(project(":business-logic"))

//  slf4j implementation
    runtimeOnly("org.slf4j:slf4j-simple:1.7.36")
}

