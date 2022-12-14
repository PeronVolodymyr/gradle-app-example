plugins {
    id("java-platform") // Similar to BOM in Maven.
}

group = "com.example"

javaPlatform.allowDependencies()
dependencies {
    api(platform("org.junit:junit-bom:5.8.2")) // Use Junit BOM file.
}

//  This doesn't add any dependency. It's just controls dependency versioning.
//  Comment out this because we use 'libs.versions.toml' instead.
//  dependencies.constraints {
//    api("org.slf4j:slf4j-api:1.7.36")
//    api("org.slf4j:slf4j-simple:1.7.36")
//    api("org.apache.commons:commons-lang3:3.12.0")

//    https://docs.gradle.org/current/userguide/rich_versions.html
//    api("com.google.guava:guava:28.0-jre")  {
//        version {
//            strictly("...")
//            reject("...")
//        }
//    } // might select higher like 30.0-jre
//  }

// Standard version conflict resolution in Gradle:
// If different dependency versions exists in a project then gradle select the highest version.