FROM tomcat:9.0.46-jdk11-openjdk-buster

LABEL maintainer="sanjeev.dhir@gmail.com"

#clean up webapps folder
RUN rm -rf /usr/local/tomcat/webapps/*

#Transfer war file in
COPY ./target/booting-web-for-docker-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war

#set any environment variables here

ENV JAVA_OPTS="-Dspring.profiles.active=docker-demo"
#command line for starting tomcat

CMD ["catalina.sh", "run"]