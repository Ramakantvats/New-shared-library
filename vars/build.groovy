def call(){
  echo "Building the django docker image chal be clonngin the code in build stage"
  // sh "docker build -t django-image:v1 ."
  git url: "https://github.com/Ramakantvats/django-notes-app.git", branch: "main"
  echo "Image build successfullyy.... clonned"
}
