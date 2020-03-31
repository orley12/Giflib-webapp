# gif-lib

#### What does this Application does?
- gif-lib is web application that enables users to create, edit, delete, view specific, and all gifs or images. It also enables users to create, edit, delete, view specific and all gif categories. Also add gifs to different categories. 

#### Technologies Used
- H2 Database
- Spring Boot MVC
- JPA

#### How should this be manually tested?
- Clone this repository
- Open it in your ide its recommended you use intellij IDEA so you can follow this steps.
- While being connected to the internet gradle will download all required dependencies.
- Start the database server by executing the **h2-1.4.190.jar** file located in the project folder, to start the database server credentials are. 
- - Driver Class: org.h2.Driver
  - JDBC URL: jdbc:h2:~/test
  - User Name: sa
  - password: 
- Once the database server as started and lunched in the browser, click connect to connect the server.
- Start the gif-lib server by executing the bootRun command in the gradle window.
- Go to the url at http://localhost:8080
