// Custom convention plugin. Created for shared build configuration.
// Plugins that only reconfigure existing plugins are typically called 'convention plugin'.
plugins {
    // Core java. Needed to set java version extension.
    // Includes id("base") which adds 'assemble', 'build' and 'check' tasks.
    id("java")
    // Code style library.
    id("com.diffplug.spotless")
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(17))
}

// Be careful as it will configure all tasks with type 'JavaCompile'.
tasks.withType<JavaCompile>().configureEach {
    options.encoding = "UTF-8"
}
// Comment out the code below as encoding is set in 'tasks.withType<JavaCompile>'
// for both 'tasks.compileJava' and 'tasks.compileTestJava'.
//tasks.compileJava {
//    options.encoding = "UTF-8"
//}
//tasks.compileTestJava {
//    options.encoding = "UTF-8"
//}