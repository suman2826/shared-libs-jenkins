def call(String name="Suman") {
    echo "deploymentTrack: ${params.deploymentTrack}"
    env.foo="hello"
    echo "${env.foo}"
    echo "Welcome, ${name}"
    loadUtility()
}