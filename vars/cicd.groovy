def downloadCode(repo) {
  git "${repo}"
}

def generateBuild() {
  sh "mvn package"
}
