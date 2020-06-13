# Spring-Boot-WebServices-Civet

This repository is only for showing demo for Web Services.
This is the multiple controller for all the metrics.
Right now, It consists of two metrics and later on more metrics will be added.

How to run the application:

1. Clone the repository.
2. Run Spring Boot Application
3. Open Postman, under form-data:
(i) Upload turtle file and give the key value = file.
(ii) Give datasetUri and give the key value = dataset.
4. Send the post request to the endpoint, the return result will be evaluated star.

Example queries
localhost:8080/uploadFile/DateFormat
localhost:8080/uploadFile/Description

Done: (i). Send file and datasetUri(in parameters) using POST request.
       (ii). Handle file and datasetUri in backend for further process.
       (iii). Test for single datasetUri.
       (iv). Return response must be evaluated metric result that is stars.
       (v). Maybe: Response in JSON.
