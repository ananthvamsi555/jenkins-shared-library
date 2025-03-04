def call(String saywhat = "nothing") {
    if (saywhat == "hi") {
        script {
            bat """
                echo Hi Alice
            """
        }
    } else if (saywhat == "hello") {
        script {
            bat """
                echo Hello Alice
            """
        }
    } else {
        script {
            bat """
                echo Whats up Alice
            """
        }
    }
}

