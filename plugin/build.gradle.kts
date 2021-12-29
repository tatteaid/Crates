plugins {
    java
}

group = "me.tatteaid"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()

    // spigot repo
    maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
    maven("https://oss.sonatype.org/content/repositories/snapshots")
    maven("https://oss.sonatype.org/content/repositories/central")
}

dependencies {
    // spigot dependency
    compileOnly("org.spigotmc:spigot-api:1.18-R0.1-SNAPSHOT")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}