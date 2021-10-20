def call(Closure body) {
  pipeline {
    agent any
       options {
        disableConcurrentBuilds()
              skipDefaultCheckout()
    }
       parameters {
              choice (
                     name: "deploymentTrack",
                     choices: ['cr','ar1','ar2', 'pr'],
                     description: "choose tracl"
                     )
       }
      
       stages {
           stage("Tools initialization") {
               steps {
                   echo "Started"
                 echo "${env.BRANCH_NAME}"
                  
                 echo "${env.foo}"
                 script {
                 welcomeJob()
//                  echo "${env.foo}"
                 }
                 echo "${env.foo}"
               }
           }
          stage("Checking") {
              steps {
                   echo "checkingssssssssss"
               }
           }
         
          body()
           
           
           stage("Running Testcase") {
              steps {
                   echo "completedssssssssss"
               }
           }
           stage("Running Testcases") {
              steps {
                   echo "completesssssssssss"
               }
           }
           stage("Running") {
              steps {
                   echo "completes"
               }
           }
         stage("Runningsss ") {
              steps {
                   echo "completessss"
               }
           }
           
       }
   }
}
