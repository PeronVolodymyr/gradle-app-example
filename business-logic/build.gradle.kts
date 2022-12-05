plugins {
//  Custom plugin on top of standard "java-library" plugin
    id("my-java-library")
}

// 'business-logic' depends on 'data-model' module and external 'commons-lang3' library.
dependencies {
    implementation(project(":data-model"))
    implementation("org.apache.commons:commons-lang3:3.12.0")
//  slf4j API specification
    implementation("org.slf4j:slf4j-api:1.7.36")

//    Only available at compile time but when the application run it's gone.
//    compileOnly("group:name")

//    It's not there in compile time. You never use any classes to compile code.
//    You just plug it in the classpath at runtime, and then it somehow found in the classpath by some mechanism.
//    It can be useful when we have a separation of API and implementation. For example logging framework like slf4j.
//    runtimeOnly("group:name")
}

//configurations {
//    compileClasspath // <- Compile time "view"
//    runtimeClasspath // <- Runtime "view"
//}