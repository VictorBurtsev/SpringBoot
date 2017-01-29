#!/usr/bin/env bash
mvn clean install
sleep 10 &&
open http://localhost:8081/stackoverflow.html &&
open http://localhost:8081/api/ntc-4 &&
open http://localhost:8081/api/stackoverflow &&
open http://localhost:8081/stackoverflowAPI.html &
java -jar target/springboot-1.0-SNAPSHOT.jar --port 8081