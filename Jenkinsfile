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
            }
        }

        stage ('test') {
            steps {
                echo "This place is for test";
            }
        }

        stage ('sonar') {
            steps {
                echo "Here its for sonar";
            }
        }
       
    }
    
}