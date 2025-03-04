def call(String repoUrl, String branch) {
    checkout([
        $class: 'GitSCM',
        branches: [[name: "*/${branch}"]],
        doGenerateSubmoduleConfigurations: false,
        extensions: [],
        submoduleCfg: [],
        userRemoteConfigs: [[
            url: repoUrl,
        ]]
    ])
    // Print checkout complete message
    echo "✅ SCM Checkout Completed: Repository - ${repoUrl}, Branch - ${branch}"
}
