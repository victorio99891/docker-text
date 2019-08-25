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

    stage('Show files') {
       steps {
            sh 'ls -lai'
       }
    }

    stage('Build Docker Image') {
      steps {
        sh 'docker build -t simple-rest .'
      }
    }

    stage('Docker Compose Stop'){
      steps {
        sh 'docker-compose stop'
      }
    }

    stage('Docker Compose Remove Containers'){
      steps {
        sh 'docker-compose rm -f'
      }
    }

    stage('Docker Compose Up'){
      steps {
        sh 'docker-compose up -d'
      }
    }

    stage('Prune unused images'){
      steps {
       sh 'docker image prune -a -f'
      }
    }

   }
 }