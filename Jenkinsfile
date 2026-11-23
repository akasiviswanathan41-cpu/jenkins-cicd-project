pipeline {
    agent { label 'python-agent' }

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/akasiviswanathan41-cpu/jenkins-cicd-project.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Automated Testing') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Package WAR') {
            steps {
                sh 'mvn package'
            }
        }

        stage('Verify WAR') {
            steps {
                sh 'ls -lh target/*.war'
            }
        }

        stage('Deploy to Tomcat') {
            steps {
                sh '''
                    cp target/jenkins-cicd-project-1.0.war \
                    /var/lib/tomcat10/webapps/
                '''
            }
        }
    }
}
