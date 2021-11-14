pipeline {

    agent any


      stages {
          stage ('pull') {
                steps {
                   scripts{
                       checkout([$class: 'GitSCM', branches: [[name: '*/master']],
                           userRemoteConfigs: [[
                               credentialsId: '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',
                               url: 'https://github.com/TiffanyNgono/Timesheet-ci.git']]])

                
            }
        }

        

        
       
    }
    
    
}
}
