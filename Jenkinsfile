pipeline {
    agent any

    tools{
        maven '3.9.5'
        

    }
    stages {
        stage('Initialize'){
            steps{
                sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                '''
            }
        }
        stage('SonarQube'){
            steps{
                withSonarQubeEnv('SonarQube') {
                    sh "${scannerHome}/bin/sonar-scanner"
                }
                println "Inside SonarQube"
            }
        }
        stage('Build') {
            steps {
                println "Inside build package..." 
                withMaven {
                    sh "mvn clean verify"
                }  
                         
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
