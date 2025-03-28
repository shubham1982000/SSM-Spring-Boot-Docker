FROM openjdk:8 
EXPOSE 9090
ADD target/ssm-spring-boot-docker.jar ssm-spring-boot-docker.jar
ENTRYPOINT [ "java","-jar","/ssm-spring-boot-docker.jar" ]
