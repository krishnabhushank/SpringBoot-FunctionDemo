# Demo of Spring Cloud Function

To Build
Use : `mvn clean package`

To Run 
Use : `jar FunctionDem-0.0.1-SNAPSHOT.jar`

Verify
- Use : `curl localhost:8080/reverseString -H "Content-Type: text/plain" -d "New User"`
- Use : `curl localhost:8080/greeter -H "Content-Type: text/plain" -d "krishna bhushan k"`
- In Postman : 
  - Setup POST request
  - URL : http://localhost:8080/reverseString
  - Header : Add Key Value as "Content-Type: text/plain"
  - Data : Select "Raw data" > Enter Text
