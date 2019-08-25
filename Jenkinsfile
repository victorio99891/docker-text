pipeline {
  agent any
  stages {

    stage('Checkout Sources') {
      steps {
        git(url: 'https://github.com/victorio99891/docker-text.git', branch: 'master')
      }
    }

    stage('Compile') {
      steps {
        sh 'mvn clean package'
      }
    }

    stage('Build Docker Image') {
      steps {
        sh 'docker build -t simple-rest .'
      }
    }

    stage('Publish Docker Image'){
      steps {
      sh 'docker run -t -p 8081:8081 --name simple-rest -d simple-rest'
      }
    }

    stage('Prune unused images'){
          steps {
          sh 'docker image prune -a -f'
          }
        }

   }
 }