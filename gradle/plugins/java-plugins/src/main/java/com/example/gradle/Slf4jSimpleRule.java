package com.example.gradle;

import org.gradle.api.artifacts.CacheableRule;
import org.gradle.api.artifacts.ComponentMetadataContext;
import org.gradle.api.artifacts.ComponentMetadataRule;

/**
 * Before:
 * <p>
 * runtimeClasspath - Runtime classpath of source set 'main'.
 * +--- project :data-model
 * +--- project :business-logic
 * |    +--- project :data-model
 * |    +--- org.apache.commons:commons-lang3:3.12.0
 * |    \--- org.slf4j:slf4j-api:1.7.36
 * +--- org.apache.commons:commons-lang3:3.12.0
 * \--- org.slf4j:slf4j-simple:1.7.36
 * \--- org.slf4j:slf4j-api:1.7.36
 * <p>
 * After:
 * <p>
 * runtimeClasspath - Runtime classpath of source set 'main'.
 * +--- project :data-model
 * +--- project :business-logic
 * |    +--- project :data-model
 * |    +--- org.apache.commons:commons-lang3:3.12.0
 * |    \--- org.slf4j:slf4j-api:1.7.36
 * +--- org.apache.commons:commons-lang3:3.12.0
 * \--- org.slf4j:slf4j-simple:1.7.36
 */
@CacheableRule
public class Slf4jSimpleRule implements ComponentMetadataRule {

    @Override
    public void execute(ComponentMetadataContext componentMetadataContext) {
        componentMetadataContext.getDetails()
                .allVariants(v -> v.withDependencies(d -> d.removeIf(gav -> gav.getName().equals("slf4j-api"))));
    }
}
