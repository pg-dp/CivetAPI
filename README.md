# Spring-Boot-WebServices-Civet

This is a spring-boot Maven app. So download this repository and in the root folder of this repository (the folder where the pom.xml can be found) open a terminal and run this command, mvn spring-boot:run.

How to run the application:
1. Clone the repository.
2. Run Spring Boot Application
3. Open Postman, under form-data:
(i) Upload turtle file and give the key value = file.
(ii) Give datasetUri and give the key value = dataset.
4. Send the post request to the endpoint, the return result will be evaluated star.

Example queries:
localhost:8080/uploadFile/DateFormat,
localhost:8080/uploadFile/Description,
localhost:8080/uploadFile/ProviderIdentity,
localhost:8080/uploadFile/Licenses,
localhost:8080/uploadFile/DataFormat.
