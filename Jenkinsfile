pipeline {

    agent any


    stages {

       stage ('git') {
            steps {
               echo "Getting Project from Git"; 
            }
        }
        
        stage ('build') {
            steps {
                echo "We'll do a build here";
                bat "mvn -version"
                bat "mvn versions:set -DnewVersion=1.0"
                bat "mvn clean package"
            }
        }

        stage ('test') {
            steps {
                echo "This place is for test";
                bat "mvn test";
            }
        }

        stage ('sonar') {
            steps {
                echo "Here its for sonar";
                bat "mvn sonar:sonar"
            }
        }
       
    }
}
