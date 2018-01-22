job('test build') {
    description('Test build')
    scm {
        github('cbrichard/buildme', 'master')
    }
    steps {
        shell('echo Hello Builder')
        shell('cat test.txt')
    }
}
