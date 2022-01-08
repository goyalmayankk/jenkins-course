job('DUP product lisitngs') {
    scm {
        git('git://github.com/wardviaene/docker-demo.git') {  node -> // is hudson.plugins.git.GitSCM
            node / gitConfigName('DSL User')
            node / gitConfigEmail('jenkins-dsl@newtech.academy')
        }
    }
    parameters {
        stringParam('RHEL_ProductVersion', '', 'RHEL productversion name f.e RHEL-8.4.0.Z.EUS')
        
    }
    parameters {
        stringParam('Build_NVR', '', 'Build NVR for kmod-redhat package')
        
    }
    steps {
        shell('echo python dud_prod.py --rhel-pv $RHEL_ProductVersion --build-nvr $Build_NVR')
        shell('date')
    }
}
