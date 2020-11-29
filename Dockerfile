FROM java:8
EXPOSE 8080:8080
ADD /build/libs/docker-demo-1.0.jar docker-demo-1.0.jar
ENTRYPOINT ["java","-jar","docker-demo-1.0.jar"]
