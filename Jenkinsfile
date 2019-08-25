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

    stage('Docker Compose Stop'){
      steps {
        sh 'docker-compose --file ./var/jenkins_home/workspace/docker-text_master/docker-compose.yml stop'
      }
    }

    stage('Docker Compose Remove Containers'){
      steps {
        sh 'docker-compose --file ./var/jenkins_home/workspace/docker-text_master/docker-compose.yml rm -f'
      }
    }

    stage('Docker Compose Up'){
      steps {
        sh 'docker-compose --file ./var/jenkins_home/workspace/docker-text_master/docker-compose.yml up -d'
      }
    }

    stage('Prune unused images'){
      steps {
       sh 'docker image prune -a -f'
      }
    }

   }
 }