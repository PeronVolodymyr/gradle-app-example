// General java configuration plugin to use in other specific plugins.
plugins {
    id("java") // Core java. Needed to set java version extension.
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(17))
}