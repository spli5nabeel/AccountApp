pipeline {
    agent any

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
                println "Inside SonarQube"
            }
        }
        stage('Build') {
            steps {
                println "Inside build package..." 
                withMaven(maven: 'maven_3_6_3') {
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
