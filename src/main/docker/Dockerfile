FROM java:8
VOLUME /tmp
ADD video-2.0-RELEASE.jar app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 8443
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]

