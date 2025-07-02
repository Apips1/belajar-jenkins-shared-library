deff call(){

node {
    stage('Hello World') {
        hello.world()
    }

    stage('Hello Groovy') {
        Output.hello(this, 'Groovy')
    }

    stage('Global Variable') {
        echo author()
        echo author.name()
        echo author.channel()
    }

    stage("Hello Person")
    {
        hello.person([
            firstName: 'Afif',
            lastName: 'Nugroho',
        ])
    }

    stage("Library Resources"){
        def config = libraryResource("config/build.json")
        echo(config)

    }

}
}