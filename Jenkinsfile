pipeline {
    agent any
    stages {
        stage('Build'){
            steps{
                sh "mvn -f pom.xml clean package"
            }
        }
        
        stage('Build image') {
        steps{
        /* This builds the actual image */
		sh "docker build -t deepakram03/awsdevop ."
		}
    }
    
    stage('Push image') {
    steps{
        sh "docker login -u deepakram03 -p Enfield@93"
    }
    }
    
    stage('Push image') {
    steps{
    sh "docker push deepakram03/awsdevop"
    }
    }
    
    stage("Deploy to staging") {
     steps {
       	sh "docker run -d --rm -p 1210:1210 --name awsdevop deepakram03/awsdevop"
     }
	}
    
    
    }
}