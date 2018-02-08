start java -jar -Dspring.profiles.active=dev -Dserver.port=8881 configclient\target\configclient-0.0.1-SNAPSHOT.jar
start java -jar  demotracing\target\tracing-zipkin-0.0.1-SNAPSHOT.jar
start java -jar -Dspring.profiles.active=S1 -Dserver.port=9401 -Dspring.application.name=Service-1 zipkinservice\target\zipkinservice-0.0.1-SNAPSHOT.jar
start java -jar -Dspring.profiles.active=S2 -Dserver.port=9402 -Dspring.application.name=Service-2 zipkinservice\target\zipkinservice-0.0.1-SNAPSHOT.jar 
start java -jar -Dspring.profiles.active=S3 -Dserver.port=9403 -Dspring.application.name=Service-3 zipkinservice\target\zipkinservice-0.0.1-SNAPSHOT.jar 
start java -jar -Dserver.port=8761  eurekaserver\target\eurekaserver-0.0.1-SNAPSHOT.jar 
start java -jar -Dserver.port=8762 -Dspring.application.name=balance-service balanceservice\target\balanceservice-0.0.1-SNAPSHOT.jar 
