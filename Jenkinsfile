CODE_CHANGES = getGitChanges()

pipeline {

    agent any

    parameters {
        choice(name: 'VERSION', choices: ['1.1.0', '1.2.0', '1.3.0'], description: '')
        booleanParam(name: 'executeTests', defaultValue: true, description: '')
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
                echo "Building version ${VERSION}"
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