def call(List commands) {
    for (command in commands) {
        bat "call mvnw.cmd ${command}"
    }
}
