plugins {
//  Custom plugin on top of standard "java-library" plugin
    id("my-java-library")
}

// 'business-logic' depends on 'data-model' module and external 'commons-lang3' library.
dependencies {
    implementation(project(":data-model"))

//  Use 'implementation' instead of 'api' scope as you can end up with mess.
//  It's better when each module has it's own dependencies declared.
//  In that case you have components strictly isolated and there is less risk that something
//  is used by an accident because it's just visible transitively during compilation.
    implementation("org.apache.commons:commons-lang3:3.12.0")

//  slf4j API specification
    implementation("org.slf4j:slf4j-api:1.7.36")

//  Dependency is transitively visible during compilation. Only applicable to java libraries.
//  This library will be transitively visible at compile. 'app' module depends on this 'business-logic' module.
//  So, we would be able to access 'commons-lang3' library transitively through 'business-logic' inside the 'app' module.
//  api("org.apache.commons:commons-lang3:3.12.0")

//  Only available at compile time but when the application run it's gone.
//  compileOnly("group:name")

//  It's not there in compile time. You never use any classes to compile code.
//  You just plug it in the classpath at runtime, and then it somehow found in the classpath by some mechanism.
//  It can be useful when we have a separation of API and implementation. For example logging framework like slf4j.
//  runtimeOnly("group:name")
}

//  configurations {
//    compileClasspath // <- Compile time "view"
//    runtimeClasspath // <- Runtime "view"
//  }