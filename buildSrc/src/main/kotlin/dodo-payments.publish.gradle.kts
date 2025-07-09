import com.vanniktech.maven.publish.JavadocJar
import com.vanniktech.maven.publish.KotlinJvm
import com.vanniktech.maven.publish.MavenPublishBaseExtension
import com.vanniktech.maven.publish.SonatypeHost

plugins {
    id("com.vanniktech.maven.publish")
}

repositories {
    gradlePluginPortal()
    mavenCentral()
}

extra["signingInMemoryKey"] = System.getenv("GPG_SIGNING_KEY")
extra["signingInMemoryKeyId"] = System.getenv("GPG_SIGNING_KEY_ID")
extra["signingInMemoryKeyPassword"] = System.getenv("GPG_SIGNING_PASSWORD")

configure<MavenPublishBaseExtension> {
    signAllPublications()
    publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL)

    coordinates(project.group.toString(), project.name, project.version.toString())
    configure(
        KotlinJvm(
            javadocJar = JavadocJar.Dokka("dokkaHtml"),
            sourcesJar = true,
        )
    )

    pom {
        name.set("public")
        description.set("An SDK library for Dodo Payments")
        url.set("https://docs.dodopayments.com")

        licenses {
            license {
                name.set("Apache-2.0")
            }
        }

        developers {
            developer {
                name.set("Dodo Payments")
                email.set("founders@dodopayments.com")
            }
        }

        scm {
            connection.set("scm:git:git://github.com/dodopayments/dodopayments-kotlin.git")
            developerConnection.set("scm:git:git://github.com/dodopayments/dodopayments-kotlin.git")
            url.set("https://github.com/dodopayments/dodopayments-kotlin")
        }
    }
}

tasks.withType<Zip>().configureEach {
    isZip64 = true
}
