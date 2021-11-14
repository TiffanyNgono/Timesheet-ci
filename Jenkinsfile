pipeline {

    agent any


      stages {
          stage ('pull') {
                steps {
                   script{
                       checkout([$class: 'GitSCM', branches: [[name: '*/master']],
                           userRemoteConfigs: [[
                               credentialsId: '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',
                               url: 'https://github.com/TiffanyNgono/Timesheet-ci.git']]])

                
            }
        }

        

        
       
    }
          
          stage ('build') {
              steps {
                   script{
                   sh "ansible-playbook project-cd/ansible/build.yml -i project-cd/ansible/inventory/host.yml "
                   }
              }
          }
    
    
}
}
