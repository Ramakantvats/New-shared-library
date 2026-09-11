def call(){
  echo "Pushing the docker image on docker hub"
  withCredentials([usernamePassword(credentialsId:"dockerHubCred", passwordVariable:"dockerHubPass", usernameVariable:"dockerHubUser")]){
  sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPass}"
  sh " docker image tag django-image:v1 ${env.dockerHubUser}/django-image:v1"
  sh "docker push ${env.dockerHubUser}/django-image:v1 "
  echo "Image pushed successfully.."
}
