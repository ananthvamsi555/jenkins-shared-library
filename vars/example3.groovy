def call(Closure postHelloScript) {
    node {
        stage("Hello World") {
            script {
                bat """
                    echo Hello
                """
            }
        }
        postHelloScript()
    }
}

