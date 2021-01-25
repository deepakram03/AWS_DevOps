pipeline {
    agent any
    stages {
        stage('Build'){
            steps{
                sh "mvn -f AWS_DevOps/pom.xml clean package"
            }
        }
    }
}