plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation(project(":library"))
    testImplementation("org.assertj:assertj-core:3.24.2")
    testImplementation("io.cucumber:cucumber-java:7.18.0")
    testImplementation("io.cucumber:cucumber-junit:7.18.0")
    testImplementation("org.seleniumhq.selenium:selenium-java:4.3.0")
    testImplementation("org.slf4j:slf4j-api:1.7.32")
    testImplementation("org.slf4j:slf4j-simple:1.7.32")
}

tasks.test {
    useJUnitPlatform()
}