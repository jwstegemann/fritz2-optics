
buildscript {
    repositories {
        mavenLocal()
        mavenCentral()
        jcenter()
    }

    dependencies {
        classpath(kotlin("gradle-plugin", version = "1.3.72"))
    }
}

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
