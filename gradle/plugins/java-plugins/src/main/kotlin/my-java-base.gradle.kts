import com.example.gradle.Slf4jSimpleRule

// Custom convention plugin. Created for shared build configuration.
// Plugins that only reconfigure existing plugins are typically called 'convention plugin'.
plugins {
    // Core java. Needed to set java version extension.
    // Includes id("base") which adds 'assemble', 'build' and 'check' tasks.
    id("java")
    // Code style library.
    id("com.diffplug.spotless")
}

sourceSets.main {
//    You can change the path to your source code. It's preferable stick to default source - src/main.
//    java.setSrcDirs(listOf(layout.projectDirectory.dir("sources")))
}
//  sourceSets.test {}

//  We can create custom source sets.
//  sourceSets.create("integrationTest")

dependencies.components {
//  Correction of 'slf4j-simple' dependency metadata to exclude 'slf4j-api' transitive dependency.
//  Not practical example. Just for education.
    withModule<Slf4jSimpleRule>("org.slf4j:slf4j-simple")
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(17))
}

tasks.test {
    // Use Junit 5
    useJUnitPlatform()
    // Increase your test performance by parallel execution
    maxParallelForks = 4
    // Modify this if you have memory hungry tests
    maxHeapSize = "1g"
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