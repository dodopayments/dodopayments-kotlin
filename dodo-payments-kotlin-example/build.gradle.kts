plugins {
    id("dodo-payments.kotlin")
    application
}

dependencies {
    implementation(project(":dodo-payments-kotlin"))
}

application {
    mainClass = "com.dodopayments.api.example.MainKt"
}
