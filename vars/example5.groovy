def call() {
    stage("clone repo") {
        steps {
            script {
                bat """
                    echo "clone repo"
                """
            }
        }
    }
}

