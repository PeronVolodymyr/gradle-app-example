plugins {
//    Standard gradle plugin
//    id("java-library") // id("java") includes here

//  Custom plugin on top of standard "java-library" plugin
    id("my-java-library")
}

dependencies {
//  Dependency versioning. Comment it out as I would prefer to use another approach with 'libs.versions.toml'.
//  implementation(platform("com.example:platform"))
}

