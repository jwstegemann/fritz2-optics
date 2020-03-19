
buildscript {
    repositories {
        mavenLocal()
        mavenCentral()
        jcenter()
    }

    dependencies {
        classpath(kotlin("gradle-plugin", version = "1.3.61"))
        classpath("com.jfrog.bintray.gradle:gradle-bintray-plugin:1.+")
    }
}

//apply(plugin = "com.jfrog.bintray")

allprojects {
    repositories {
        mavenLocal()
        mavenCentral()
        jcenter()
    }
}

subprojects {
    group = "io.fritz2.optics"
    version = "0.2"
}
