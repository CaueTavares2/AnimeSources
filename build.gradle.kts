plugins {
    kotlin("jvm") version "1.9.10"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jsoup:jsoup:1.16.1")
}

sourceSets {
    main {
        java.srcDirs("src/main/kotlin")
    }
}

tasks.register<Jar>("assembleRelease") {
    archiveBaseName.set("AnimeSources")
    archiveVersion.set("1.0.0")
    from(sourceSets.main.get().output)
    duplicatesStrategy = DuplicatesStrategy.INCLUDE
    manifest {
        attributes["Extension"] = "true"
        attributes["Extension-Name"] = "AnimeSources"
        attributes["Extension-Version"] = "1.0.0"
        attributes["Extension-Pkg"] = "com.animesources.animiru"
    }
}
