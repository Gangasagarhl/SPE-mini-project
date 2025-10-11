pipeline {
    agent any

    triggers {
        githubPush()
    }

    environment {
        GITHUB_REPO_URL = 'https://github.com/Gangasagarhl/SPE-mini-project.git'
        DOCKER_IMAGE_NAME = 'calculator'
    }

    stages {
        stage('Clone Repository') {
            steps {
                git branch: 'main', url: "${GITHUB_REPO_URL}"
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Build Docker Image') {
            steps {
                script {
                    docker.build("${DOCKER_IMAGE_NAME}", '.')
                }
            }
        }
    }
}