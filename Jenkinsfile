pipeline {

    agent any

    parameters {
        choice(name: 'VERSION', choices: ['1.1.0', '1.2.0', '1.3.0' , '1.4.0' , '1.5.0'], description: '')
        booleanParam(name: 'executeTests', defaultValue: true, description: '')
    }


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
                bat "mvn versions:set -DnewVersion=${VERSION}"
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
        stage ('deploy') {
            steps {
                echo "Deployment";
                bat "mvn deploy:deploy-file -DgroupId=tn.esprit -DartifactId=timesheet-ci  -DgeneratePom=true -Dpackaging=jar -DrepositoryId=deploymentRepo -Durl=http://localhost:8081/#browse/browse:maven-releases/ -Dfile=target/timesheet-ci-${VERSION}.jar"
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