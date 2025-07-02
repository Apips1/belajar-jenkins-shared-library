def call(){

node {
    stage("Maven Clean")
    {
        maven(["clean"])
    }
    stage("Maven Compile")
    {
        maven(["compile"])
    }
    stage("Maven Test")
    {
        maven(["test"])
    }

}

}
  