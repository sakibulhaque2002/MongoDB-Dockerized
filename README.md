./gradlew bootJar

docker build -t saaaakibbb/mongospring:1.0.0 .

docker login -u saaaakibbb

docker push saaaakibbb/mongospring:1.0.0

docker push saaaakibbb/mongospring:1.0.0

docker pull saaaakibbb/mongospring:1.0.0

docker run -d --name mongodb -e MONGO_INITDB_DATABASE=usersdb mongo:7

docker run -d -p 8080:8080 \
  --link mongodb:mongo \
  -e SPRING_DATA_MONGODB_URI="mongodb://mongo:27017/usersdb" \
  saaaakibbb/mongospring:1.0.0
