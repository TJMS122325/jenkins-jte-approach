library_sources {
    github {
        org = "TJMS122325"
        repo = "jenkins-jte-approach"
        branch = "main"
    }
}
    // also load libraries from the checked-out repository for local/in-repo testing
    local {
        path = "libraries"
    }

libraries{
    maven
}