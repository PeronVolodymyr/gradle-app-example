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
}

