TomRestTest_J1.5
================

This uses Jersey 1.15 to apply the @RolesAllowed security annotation - it's useful for securing rest services in JAVA. If you're interested in Jersey 2.x , look at TomRestTest 
I created this to make it easier to provide a base case for my stack overflow question: 
http://stackoverflow.com/questions/25020194/solved-jersey-security-annotations-on-tomcat-7 

Testing
===========================
This is a com.sun.jersey 1.15 answer to use @RolesAllowed() security annotations.
## TESTING
:: please change this when using curl - your ports are probably different
::curl -u robert:robert -basic http://localhost:8079/J1SecurityAnnotations/rest/hello/admin
curl -u admin:adminadmin -basic http://localhost:8079/J1SecurityAnnotations/rest/hello/admin
curl -u admin2:admin -basic http://localhost:8079/J1SecurityAnnotations/rest/hello/admin
conf/tomcat-users.xml should include the users "robert" and "admin" as well as the roles "robert" and "admin"
