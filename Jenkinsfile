pipeline {

    agent any


    stages {
       stage ('GIT') {
            steps {
               echo "Getting Project from Git"; 
               git branch:"entreprise-management-jesser", url:"https://github.com/TiffanyNgono/Timesheet-ci.git"; 
            }
        }
        stage("Build") {
           steps {
                bat "mvn -version"
                bat "mvn clean install"
            }
           
        }
       stage("Sonar") {
        steps {
           bat "mvn sonar:sonar"
         }
       }
       stage("nexus") {
        steps {
           bat "mvn deploy -Dmaven.test.skip"
         }
       }
   }   
}