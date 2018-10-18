#!/bin/bash
mvn clean install
STATUS=$?

if [ ${STATUS} -eq 0 ]; then
    docker build --tag=wildfly-app .
    docker run -it wildfly-app
fi