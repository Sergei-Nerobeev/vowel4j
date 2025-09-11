plugins {
    id("java")
    id("jacoco")
}

group = "hu.nerbe"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test(Test::useJUnitPlatform)

jacoco {
    toolVersion = "0.8.11"
}

