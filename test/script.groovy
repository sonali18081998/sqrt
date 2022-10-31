def buildApp() {
  echo 'building the application...'
  sh "g++ src/main.cpp -o build/main"
}

def testApp() {
  echo 'testing the application...'
  sh "./build/main"
}

def deployApp {

