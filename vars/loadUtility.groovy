def call() {
   echo "inside loadutility"
    checkout scm
//    def rootDir = pwd()
//    echo "${rootDir}"
   def obj = load "utilities.groovy"
//   def obj = load "vars/utilities.groovy"
   echo "here"
 
  echo "${obj.firstJob()}"
}
