plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.seleniumhq.selenium" ,"selenium-java", "4.18.1")
    testImplementation("org.testng","testng", "7.8.0")

}

tasks.test {
    useJUnitPlatform()
}