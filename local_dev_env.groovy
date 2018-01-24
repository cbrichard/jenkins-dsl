job('Build Dev Env') {
    description('Build Local Development Environment with Vagrant and Virtualbox')
    scm {
        github('cbrichard/local-dev-env', 'master')
    }
    steps {
        shell('echo Testing Vagrantfile')
        shell('vagrant validate')
        shell('echo Running Vagrant to build Dev Environment')
        shell('export VAGRANT_DETECTED_OS="$(uname)"'
        shell('vagrant destroy')
    }
}
