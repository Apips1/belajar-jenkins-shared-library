def call(String command) {
    if (isUnix()) {
        sh "./mvnw ${command}"
    } else {
        bat ".\\mvnw.cmd ${command}"
    }
}
