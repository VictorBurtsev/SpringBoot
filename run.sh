#!/usr/bin/env bash
mvn clean install
sleep 5 && open http://localhost:8081/stackoverflow.html &
sleep 5 && open http://localhost:8081/api/ntc-4 &
java -jar target/springboot-1.0-SNAPSHOT.jar --port 8081