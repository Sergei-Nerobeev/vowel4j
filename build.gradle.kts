plugins {
    id("java")
    id("jacoco")
    id("maven-publish")
}

group = "hu.nerbe"
version = "1.0.1"

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

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])

            pom {
                name.set("vowel4j")
                description.set("Java Library for comparing char.")
                url.set("https://github.com/Sergei-Nerobeev/vowel4j")

                licenses {
                    license {
                        name.set("The Apache License, Version 2.0")
                        url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
                    }
                }

                developers {
                    developer {
                        id.set("sergei-nerobeev")
                        name.set("Sergei Nerobeev")
                        email.set("sergeinerobeev@gmail.com")
                    }
                }

                scm {
                    connection.set("scm:git:git://github.com/Sergei-Nerobeev/vowel4j")
                    developerConnection.set("scm:git:ssh://git@github.com/Sergei-Nerobeev/vowel4j")
                    url.set("https://github.com/Sergei-Nerobeev/vowel4j")
                }
            }
        }
    }
}

