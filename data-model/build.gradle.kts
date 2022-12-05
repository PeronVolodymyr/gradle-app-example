plugins {
//    Standard gradle plugin
//    id("java-library") // id("java") includes here

//  Custom plugin on top of standard "java-library" plugin
    id("my-java-library")
}

dependencies {
    //  Dependency versioning
    implementation(platform("com.example:platform"))
}

