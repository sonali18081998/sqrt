def gv

pipeline {
  agent any

    //Parametrize your Build
    // select version of the application you want to deploy
  parameters {
    string(name: 'VERSION', defaultValue: '', description: 'version to deploy ob prod')
    string(name: 'NEW_VERSION', defaultValue: '', description: 'version to deploy ob prod')
    choice(name: 'VERSION', choices: ['1.1.0', '1.2.0', '1.3.0'], description: '')
    booleanParam(name: 'executeTests', defaultValue: true, description: '')
  }

  stages {

    stage("init") { 
        steps { 
          script {
            gv = load "script.groovy"
          }
        }
    }

    stage("build") { 
        steps { //it will execute if the when condition is true
          echo 'building the application...'
          sh "g++ src/main.cpp -o build/main"
          steps { 
          // echo 'building the application...'
           //sh "g++ src/main.cpp -o build/main" 

          script {
            gv.buildApp()  //using groovy function
          }
        }
    }
    stage("test") {
