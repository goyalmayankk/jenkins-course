job('DUP product lisitngs') {
    scm {
        git('git://github.com/wardviaene/docker-demo.git') {  node -> // is hudson.plugins.git.GitSCM
            node / gitConfigName('DSL User')
            node / gitConfigEmail('jenkins-dsl@newtech.academy')
        }
    }
    parameters {
        stringParam('TestParam', '', 'this is test parameter')
        
    }
    steps {
        shell('echo $TestParam')
        shell('date')
    }
}
