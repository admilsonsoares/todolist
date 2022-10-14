#!/usr/bin/env bash

echo '(-) Stopping and removing all containers'
docker-compose down --remove-orphans
docker stop $(docker ps -a -q)
docker rm -f $(docker ps -a -q)
echo '(✔) Stopped and removed all containers'

echo '(-) Starting application'
./gradlew clean bootJar -x test
docker-compose up --build