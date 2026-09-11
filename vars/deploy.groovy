def call(){
  echo "Deploying the code..."
  sh 'docker compose up -d' 
  echo "Deployment completeted..."
}
