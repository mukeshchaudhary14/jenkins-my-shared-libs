def call() {
    stage("Build Docker Image") {
        steps {
            sh "docker build -t two-tier-flask-app ."
        }
    }
}
