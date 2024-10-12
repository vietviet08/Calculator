pipeline {
    agent any

    stages {
        stage('Clone repository') {
            steps {
                git branch: 'main', url: 'https://github.com/vietviet08/Calculator.git'
            }
        }
        stage('Build') {
            steps {
                echo 'Building...'
                // Lệnh build (ví dụ: mvn clean install nếu là dự án Maven)
            }
        }
        stage('Test') {
            steps {
                echo 'Running tests...'
                // Lệnh test (ví dụ: mvn test)
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying...'
                // Lệnh deploy hoặc các bước tiếp theo
            }
        }
    }
}
