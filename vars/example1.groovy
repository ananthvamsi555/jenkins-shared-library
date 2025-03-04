def call(String name = "Alice") {
    script {
        bat """
            echo Hi ${name}
        """
    }
}
