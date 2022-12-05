plugins {
    `kotlin-dsl` // The same as: id("kotlin-dsl"). DSL to write plugin with. Can be kotlin, groovy or java.
}

dependencies {
    implementation("com.diffplug.spotless:spotless-plugin-gradle:6.12.0")
}