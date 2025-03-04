pipeline {
    agent any
    stages {
        stage('Checkout Code') {
            steps {
                script {
                    checkout([
                        $class: 'GitSCM',
                        branches: [[name: '*/main']],  // Change branch as needed
                        doGenerateSubmoduleConfigurations: false,
                        extensions: [],
                        submoduleCfg: [],
                        userRemoteConfigs: [[
                            url: 'https://github.com/ananthvamsi555/jenkins-shared-library.git',  // Replace with your repo URL
                        ]]
                    ])
                }
            }
        }
    }
}
