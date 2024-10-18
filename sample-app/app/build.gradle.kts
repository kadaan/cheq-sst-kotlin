import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import java.util.Properties

//val mavenCentralDeploymentVersion = findOptionalLocalProperty("maven.central.deployment.version")
//fun DependencyHandlerScope.foo(group: String, name: String) {
//    if (mavenCentralDeploymentVersion != null) {
//        println("Substituting $group:$name with $group:$name:$mavenCentralDeploymentVersion")
//        implementation(group, name) {
//            version {
//                strictly(mavenCentralDeploymentVersion)
//            }
//        }
//    } else {
//        println("Substituting $group:$name with project(:$name)")
//        implementation(project(":$name"))
//    }
//}

plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    alias(libs.plugins.kotlin.parcelize)
}

dependencies {
//    foo("ai.cheq.sst.android", "cheq-sst-kotlin")
//    foo("ai.cheq.sst.android", "cheq-sst-kotlin-advertising")
////    implementation("ai.cheq.sst.android", "cheq-sst-kotlin") {
////        version {
////            strictly("1234")
////        }
////    }
////    implementation("ai.cheq.sst.android", "cheq-sst-kotlin-advertising", "1234")
    implementation(libs.cheq.sst.kotlin.core)
    implementation(libs.cheq.sst.kotlin.advertising)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.extensions)
    implementation(libs.androidx.lifecycle.runtime.android)
    implementation(libs.json.viewer)
    implementation(libs.jackson.kotlin)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.androidx.junit)
    coreLibraryDesugaring(libs.android.desugar)
}

android {
    findProperty("project.group")?.toString()?.let { group = it }
    findProperty("project.version")?.toString()?.let { version = it }

    namespace = "${group}.${name.replace("-", ".")}"

    compileSdk = 34

    defaultConfig {
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    compileOptions {
        // Up to Java 11 APIs are available through desugaring
        // https://developer.android.com/studio/write/java11-minimal-support-table
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
        isCoreLibraryDesugaringEnabled = true
    }

    buildFeatures {
        buildConfig = true
        viewBinding = true
    }

    buildTypes {
        defaultConfig {
            applicationId = namespace
            targetSdk = 34
            minSdk = 34
            versionCode = 1
            versionName = "$version"
        }

        debug {
            enableAndroidTestCoverage = true
            enableUnitTestCoverage = true
        }

        release {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"
            )
        }
    }

    kotlin {
        compilerOptions {
            jvmTarget = JvmTarget.JVM_11
            allWarningsAsErrors = true
            freeCompilerArgs.add(
                // Enable experimental coroutines APIs, including Flow
                "-opt-in=kotlinx.coroutines.ExperimentalCoroutinesApi",
            )
        }
    }
}

//private fun findOptionalLocalProperty(propertyName: String): String? =
//    properties(rootDir, "local.properties").getProperty(propertyName)
//
//private fun properties(rootDir: File?, name: String): Properties {
//    return rootDir?.resolve(name)?.let {
//        when {
//            it.exists() -> Properties().apply { it.reader().use(::load) }
//            else -> properties(rootDir.parentFile, name)
//        }
//    } ?: Properties()
//}