def call(Map config){
    if (config.type == "maven"){
        mavenPipeline();
    } else {
        stage("Unknown Type"){
            error "Unknown type: ${config.type}"
        }
    }
}