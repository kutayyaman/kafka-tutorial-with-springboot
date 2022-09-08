# kafka-tutorial-with-springboot

If you want to try this project you must set up a `kafka` server on port `9092` and after that you can try to use this project from endpoints.

## Services Table
Method	| Path	| Description	| User authenticated	| Available from UI
------------- | ------------------------- | ------------- |:-------------:|:----------------:|
POST	| /api/v1/kafka/json-message/publish	| Produces a json message	| × | ×
POST	| api/v1/kafka/publish	| Produces a string message	| × | ×

## Requirements:
* JDK >= 18
* kafka server
