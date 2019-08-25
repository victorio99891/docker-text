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

    stage('Copy Docker Compose File') {
      steps {
        sh 'cp /var/jenkins_home/workspace/docker-text_master/docker-compose.yml docker-compose.yml'
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