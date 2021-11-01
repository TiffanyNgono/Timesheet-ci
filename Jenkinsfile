pipeline {

    agent any


    stages {
       stage ('GIT') {
            steps {
               echo "Getting Project from Git"; 
               git branch:"entreprise-management-jesser", url:"https://github.com/TiffanyNgono/Timesheet-ci.git"; 
            }
        }
   }   
}