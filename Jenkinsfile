pipeline {
    agent any
    stages {
        stage('Build'){
            steps{
                sh "mvn -f AWSDemo/pom.xml clean package"
            }
        }
    }
}