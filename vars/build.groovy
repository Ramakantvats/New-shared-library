def call(){
  echo "Building the django docker image"
  sh "docker build -t django-image:v1 ."
  echo "Image build successfullyy...."
}
