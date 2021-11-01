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
    // post{
    //     always{
    //         //Fait le traitement ci dessous quand tout a bien exécuté
    //     }

    //     success{

    //     }

    //     failure{

    //     }
    // }
    
}
