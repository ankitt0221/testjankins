pipeline {
    agent any
    tools {
        maven 'Maven'
    }
    stages {
        stage('Build Maven') {
            steps {
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/ankitt0221/testjankins.git']])
                bat 'mvn clean install'
            }
        }
        stage('Build Docker Image') {
            steps {
                bat 'docker build -t jenkinstest .'
            }
        }
        stage('Run Docker Image') {
            steps {
                script {
                    bat '''
                    docker ps -a -q --filter "name=jenkinstest-container" | findstr . > nul && docker rm -f jenkinstest-container || echo "No existing container to remove."
                    docker run -d -p 8083:8083 --name jenkinstest-container jenkinstest
                    '''
                }
            }
//             steps {
//                 bat 'docker run -d -p 8083:8083 --name jenkinstest-container jenkinstest'
//             }
        }
    }
}