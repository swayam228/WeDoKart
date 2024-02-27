plugins {
    id("com.android.application")
    id("com.google.gms.google-services")
}

android {

    buildFeatures {
        viewBinding = true
    }
    namespace = "com.example.wedokart"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.wedokart"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.legacy:legacy-support-v4:1.0.0")
    implementation("androidx.mediarouter:mediarouter:1.6.0")
    implementation("com.google.firebase:firebase-auth:22.3.1")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    //for image package
    implementation ("com.github.bumptech.glide:glide:4.16.0")
    //for round image view
    implementation ("com.makeramen:roundedimageview:2.3.0")
    //for search bar
    implementation ("com.github.mancj:MaterialSearchBar:0.8.5")

    //for notification slider
    implementation ("com.google.android.material:material:1.11.0")
    implementation ("me.relex:circleindicator:2.1.6")
    implementation ("org.imaginativeworld.whynotimagecarousel:whynotimagecarousel:2.1.0")

    //volley implementation
    implementation ("com.android.volley:volley:1.2.1")

    //tiny cart library
    implementation ("com.github.hishd:TinyCart:1.0.1")

}