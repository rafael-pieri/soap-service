FROM jboss/wildfly
ADD /target/soap-service.war /opt/jboss/wildfly/standalone/deployments/