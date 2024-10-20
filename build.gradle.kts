// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.5.2" apply false
    alias(libs.plugins.compose.compiler) apply false
    id("org.jetbrains.kotlin.android") version "2.0.10" apply false
    kotlin("plugin.serialization") version "2.0.20" apply true
}