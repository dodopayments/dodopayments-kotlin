plugins {
    id("dodo-payments.kotlin")
    application
}

dependencies {
    implementation(project(":dodo-payments-kotlin"))
}

application {
    // Use `./gradlew :dodo-payments-kotlin-example:run` to run `Main`
    // Use `./gradlew :dodo-payments-kotlin-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = "com.dodopayments.api.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}ExampleKt"
        else
            "MainKt"
    }"
}
