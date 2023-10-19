pipeline {
    agent any

    stages {
        stage('SonarQube'){
            steps{
                println "Inside SonarQube"
            }
        }
        stage('Build') {
            steps {
                println "Inside build package..."   
                         
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
