plugins {
    id("java-platform") // Similar to BOM in Maven.
}

group = "com.example"

javaPlatform.allowDependencies()
dependencies {
    api(platform("com.fasterxml.jackson:jackson-bom:2.13.3"))
}

// This doesn't add any dependency. It's just controls dependency versioning.
dependencies.constraints {
    api("org.slf4j:slf4j-api:1.7.36")
    api("org.slf4j:slf4j-simple:1.7.36")
    api("org.apache.commons:commons-lang3:3.12.0")
}