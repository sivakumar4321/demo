/* Requires the Docker Pipeline plugin */
pipeline {
    agent { docker { image 'maven:3.8.6-openjdk-11-slim' } }
    environment {
        PATH = "/usr/local/bin"
    }
    stages {
        stage('build') {
            steps {
                sh 'mvn --version'
            }
        }
    }
}
