start java -jar  demotracing\target\tracing-zipkin-0.0.1-SNAPSHOT.jar 
start java -jar -Dspring.profiles.active=S1 -Dserver.port=9401 -Dspring.application.name=Service-1 zipkinservice\target\zipkinservice-0.0.1-SNAPSHOT.jar 
start java -jar -Dspring.profiles.active=S2 -Dserver.port=9402 -Dspring.application.name=Service-2 zipkinservice\target\zipkinservice-0.0.1-SNAPSHOT.jar 
start java -jar -Dspring.profiles.active=S3 -Dserver.port=9403 -Dspring.application.name=Service-3 zipkinservice\target\zipkinservice-0.0.1-SNAPSHOT.jar 


