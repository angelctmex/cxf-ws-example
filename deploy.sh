#!/bin/bash

clear &&
rm /home/pegaso/system/bam/apache-tomcat-7.0.108/webapps/cxf-ws.war 
sleep 3 &&
gradle war &&
mv build/libs/cxf-ws-1.0-SNAPSHOT.war build/libs/cxf-ws.war &&
mv build/libs/cxf-ws.war /home/pegaso/system/bam/apache-tomcat-7.0.108/webapps

