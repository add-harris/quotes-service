# Quotes Service

A Quotes API for returning randomized quotes.

>**_Including a replica of the infamous [Kanye REST API](https://kanye.rest/)._**

### Tech Stack:

>- [Quarkus](https://quarkus.io/)
>- Kotlin
>- Java 17
>- Maven

## Running Instructions

#### Prerequisites:
- Java 17 setup and configured.
- Maven version 3.6.2+.

To start the application: 
```shell script
mvn compile quarkus:dev
```
The API will then be running on http://localhost:8080/v1/quotes

## Example Requests

The API has two endpoints for querying.

### Get Random Quote

Request:
```shell
curl -v http://localhost:8080/v1/quotes/kanye
```
Response
```shell
< HTTP/1.1 200 OK
< Content-Type: application/json
< content-length: 86
< 
* Connection #0 to host localhost left intact
{
  "id":"015",
  "text":"I make awesome decisions in bike stores!!!",
  "author":"Kanye West"
}    
```

### Get Quote by Id

Request:
```shell
curl -v http://localhost:8080/v1/quotes/kanye/003
```
Response
```shell
< HTTP/1.1 200 OK
< Content-Type: application/json
< content-length: 86
< 
* Connection #0 to host localhost left intact
{
  "id":"015",
  "text":"I make awesome decisions in bike stores!!!",
  "author":"Kanye West"
}    
```

## Packaging the application

#### Creating a native executable

The application can be packaged into a native linux executable with command: 
```shell
mvn package -Pnative -Dquarkus.native.container-build=true
```

#### Building and Running in Docker image

The native executable can then be built into a docker image with:
```shell
docker build -f src/main/docker/Dockerfile.native -t quotes .
```

And ran in a docker container with:
```shell
docker run -i --rm -p 8080:8080 quotes
```
