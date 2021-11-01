CODE_CHANGES = getGitChanges()

pipeline {

    agent any
    environment {
        NEW_VERSION == '1.0.1'
        SERVER_CREDENTIALS = credentials('Timesheet-cre')
    }

    stages {

       stage ('git') {
           when{
                expression{
                    BRANCH_NAME == 'master' && CODE_CHANGES == true
                }
            }
            steps {
               echo "Getting Project from Git"; 
            }
        }
        
        stage ('build') {
            when{
                expression{
                    BRANCH_NAME == 'master'
                }
            }
            steps {
                echo "We'll do a build here";
                echo "Building version ${NEW_VERSION}"
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
        stage ('deploy') {
            steps {
                echo "Deployment";
                echo "Deployment with ${SERVER_CREDENTIALS}"
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