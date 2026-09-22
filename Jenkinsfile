pipeline {
    agent any
     
       stages {
          

        stage ('Build'){
          steps {
             sh 'mvn clean compile'
           }
         }

       stage ('Test'){
          steps {
            sh 'mvn test'
           }
         }
       
      stage ('Package') {
          steps {
            sh 'mvn clean package'
           }
         }
  
      stage ('SonarQube Analysis') {
        steps {
           withCredentials([string(credentialsId: 'sonar-token', variable: 'SONAR-TOKEN')]) {
            sh '''
               mvn sonar:sonar \
               -Dsonar.host.url=http://15.207.71.237:9000 \
               -DSonar.token=$SONAR-TOKEN
              '''
            }
          }
       }
     }
   }
