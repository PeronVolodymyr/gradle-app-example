plugins {
//  Custom plugin on top of standard "java-library" plugin
    id("my-java-library")
}

// 'business-logic' depends on 'data-model' module and external 'commons-lang3' library.
dependencies {
    implementation(project(":data-model"))
    implementation("org.apache.commons:commons-lang3:3.12.0")
}
