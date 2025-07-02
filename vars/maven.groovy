def call(String command){
    bat "mvnw.cmd ${command}"
}

stage('Debug') {
    steps {
        bat 'dir'
        bat 'echo %CD%'
        bat 'type mvnw.cmd'
    }
}
