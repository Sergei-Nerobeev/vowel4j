
plugins {
    id("java")
    id("jacoco")
    id("com.vanniktech.maven.publish") version "0.34.0"
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

group = "io.github.snerobeev"
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

mavenPublishing {
    coordinates("io.github.snerobeev", "vowel4j", "1.0.1")

            pom {
                name.set("vowel4j")
                description.set("Java Library for comparing char.")
                url.set("https://github.com/snerobeev/vowel4j")

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
                    connection.set("scm:git:git://github.com/snerobeev/vowel4j")
                    developerConnection.set("scm:git:ssh://git@github.com/snerobeev/vowel4j")
                    url.set("https://github.com/snerobeev/vowel4j")
                }
            }
        }

mavenPublishing {
    publishToMavenCentral()
    signAllPublications()
}





