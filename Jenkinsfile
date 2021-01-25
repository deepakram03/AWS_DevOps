pipeline {
    agent any
    stages {
        stage('Build'){
            steps{
                sh "mvn -f pom.xml clean package"
            }
        }
        
        stage('Build image') {
        /* This builds the actual image */

        docker.build("deepakram03/awsdevop")
    }
    
    stage('Push image') {
        /* 
			You would need to first register with DockerHub before you can push images to your account
		*/
        docker.withRegistry('https://registry.hub.docker.com', 'docker-hub') {
            app.push("${env.BUILD_NUMBER}")
            app.push("latest")
            } 
                echo "Trying to Push Docker Build to DockerHub"
    }
    
    }
}