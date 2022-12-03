// Custom convention plugin.
// Plugins that only reconfigure existing plugins are typically called 'convention plugin'.
plugins {
    id("java") // Core java. Needed to set java version extension.
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(17))
}