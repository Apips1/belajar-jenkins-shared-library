def call(String command) {
    if (isUnix()) {
        // Untuk sistem Unix/Linux
        if (fileExists('./mvnw')) {
            sh("chmod +x ./mvnw")
            sh("./mvnw ${command}")
        } else {
            echo "Maven wrapper tidak ditemukan, menggunakan maven sistem"
            sh("mvn ${command}")
        }
    } else {
        // Untuk sistem Windows
        if (fileExists('mvnw.cmd')) {
            bat("mvnw.cmd ${command}")
        } else {
            echo "Maven wrapper tidak ditemukan, menggunakan maven sistem"
            bat("mvn ${command}")
        }
    }
}