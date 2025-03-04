// vars/mavenBuild.groovy
def call(String goals = 'clean install', String pomFile = 'pom.xml') {
    script {
        echo "🚀 Starting Maven Build: Goals - ${goals}, POM - ${pomFile}"
        
        try {
            sh "mvn -f ${pomFile} ${goals}"
            echo "✅ Maven Build Successful"
        } catch (Exception e) {
            echo "❌ Maven Build Failed: ${e.message}"
            error("Build failed, stopping pipeline.")
        }
    }
}
