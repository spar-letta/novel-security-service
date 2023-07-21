pipeline {
    agent any
    stages {
        stage('clone repo and clean') {
            steps {
                sh "mvn clean"
            }
        }
        stage('Clean Install') {
                    steps {
                        sh "mvn clean install -DskipTests=true"
                    }
                }
        stage("Build docker image"){
            steps{
                script{
                    sh "docker build -t javenockdocker/security-service.1.0 ."
                }
            }
        }
         stage("Push image to Dockerhub"){
                    steps{
                        script{
                            withCredentials([string(credentialsId: 'javenockdocker', variable: 'javenockdockerpwd')]) {
                                sh "docker login -u javenockdocker -p ${javenockdockerpwd}"
                            }
                            sh "docker push javenockdocker/security-service.1.0"
                        }
                    }
                }

    }
}