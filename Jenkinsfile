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
                bat "mvn clean package -DskipTests"
            }
        }

        stage ('test') {
            steps {
                echo "This place is for test";
                //bat "mvn test -DskipTests";
            }
        }

        stage ('sonar') {
            steps {
                echo "Here its for sonar";
                bat "mvn sonar:sonar -DskipTests"
            }
        }
       
    }
    // post{
    //     always{
    //         //Faait le traitement ci dessous quand tout a bien exécuté
    //     }

    //     success{

    //     }

    //     failure{

    //     }
    // }
    
}
