// Custom convention plugin. Created for shared build configuration.
// Plugins that only reconfigure existing plugins are typically called 'convention plugin'.
plugins {
    id("java") // Core java. Needed to set java version extension.
    id("com.diffplug.spotless")
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(17))
}