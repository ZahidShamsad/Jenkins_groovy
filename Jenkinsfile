pipeline {
    agent any
    options {
        ansiColor('xterm')
    }
    stages {
        stage('Introduction') {
            steps {
                echo "\033[34;1;4mCode starting\033[0m"
                echo ''
            }
        }
        stage('Checkout code from GitHub'){
            steps{
                git branch: 'developed', credentialsId: 'Github', url: 'https://github.com/ZahidShamsad/Jenkins_groovy.git'
                echo "\033[34;1;4mCode pulled from GitLab\033[0m"
            }
        }
        stage('Run Junit Test Cases'){
            steps{
                bat "mvn clean test"
                echo "\033[34;1;4mUnit tests executed\033[0m"
            }
        }
        stage('Publish Test Reports'){
            steps{
                junit 'target/surefire-reports/*.xml'
                echo "\033[34;1;4mUnit Tests report generated\033[0m"
                jacoco()
                echo "\033[34;1;4mJacoco report covered\033[0m"
            }
        }
        stage('Invoke Maven Target'){
            steps{
                bat 'mvn clean install'
                echo "\033[34;1;4mSonar Analysis done\033[0m"
            }
        }
        stage('Upload to Nexus'){
            steps{
                nexusArtifactUploader artifacts: [[artifactId: 'Java_Jenkins_II', classifier: '', file: 'target/Java_Jenkins_II-1.0-RELEASE.war', type: 'WAR']], credentialsId: 'Nexus', groupId: 'Java_Jenkins_II', nexusUrl: 'localhost:8081', nexusVersion: 'nexus3', protocol: 'http', repository: 'pipeline_groovy_releases', version: '1.0-RELEASE'
                echo "\033[34;1;4mArtifact successfully uploaded to Nexus repository\033[0m"
            }
        }
//         stage('Building DEPLOY ARTIFACT'){
//             steps{
//                 build quietPeriod: 0, job: 'Deploy_Artifact_Groovy'
//                 echo "\033[34;1;4mDownstream Job Building Artifact executed\033[0m"
//             }
//         }
    }
}
