[![Build Status](https://travis-ci.com/rafael-pieri/soap-service.svg?branch=master)](https://travis-ci.com/rafael-pieri/soap-service)

## JAX-WS: SOAP webservices

### Overview
This repository contains an example of how to implement SOAP Web Services in Java.

#### JAX-WS
JAX-WS is a fundamental technology for developing SOAP (Simple Object Access Protocol) and RESTful (Web services that use representational state transfer, or REST, tools) Java Web services,
where JAX-WS is designed to take the place of the JAVA-RPC (Remote Procedure Call) interface in Web services and Web-based applications.
JAX-WS is also used to build Web services and corresponding clients that communicate using XML to send messages or use remote procedure calls to exchange data between client and service provider.

#### SOAP
SOAP (Simple Object Access Protocol) is a messaging protocol that allows programs that run on disparate operating systems (such as Windows and Linux) to communicate using Hypertext Transfer Protocol (HTTP) and its Extensible Markup Language (XML).
SOAP defines the XML-based message format that Web service-enabled applications use to communicate and inter-operate with each other over the Web. 
The heterogeneous environment of the Web demands that applications support a common data encoding protocol and message format. 
SOAP is a standard for encoding messages in XML that invoke functions in other applications.


### How to run the application
Execute the following command to deploy the application:

`sh run-application.sh`

### Calling services through SoapUI
To install SoapUI follow the instructions at https://www.soapui.org/getting-started/installing-soapui.html

Once installed SoapUI, open it and go to ```File> Import Project``` and then choose the project file ```soap-service-soapui-project.xml``` in the folder ```soap-ui```.
