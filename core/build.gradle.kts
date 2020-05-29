buildscript {
//    repositories {
//        jcenter()
//    }
}

plugins {
    kotlin("multiplatform")
    id("maven-publish")
}

repositories {
    mavenCentral()
    jcenter()
}

kotlin {
    jvm()
    js()

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(kotlin("stdlib-common"))
            }
        }
        val jvmMain by getting {
            dependencies {
                implementation(kotlin("stdlib-jdk8"))
            }
        }

        val jsMain by getting {
            dependencies {
                implementation(kotlin("stdlib-js"))
            }
        }
    }
}

//apply(plugin = "maven-publish")


