# Build instructions: 

Before running the application, you need to create the "transportation" database: 

1. Run the Xampp application on your computer.  
2. Start the "Apache" and "MySQL" modules. 
3. Click on the "Admin" button in front of the MySQL module in Xampp.
4. You will be redirected to a UI in the browser. Follow the UI to create a database. 

To build an run the backend application: 

1. run "mvn clean install -DskipTests " to build the project
2. run "java -jar target/backend-1.0.jar" to start the application
4. Swagger can be accessible via link: "http://localhost:8080/swagger-ui/index.html"

# Project requirements and description 

## Description

The transportation services interacts with 3 different models: 
1. Address: Represents certain addresses in the City, contains information such as city name, street name, building number.
2. Route: Represents a certain route to reach from Address A to Address B, contains information such us the stops, workload and usage indicator.

The base URL for the API is `/api`

## Addresses API

1. `GET /addresses` Retrieves a list of all addresses in the database. Filtering and sorting options are described in swagger UI
2. `GET /addresses/{id}` Retrieves a specific address by its unique identifier.
3. `POST /addresses` Creates a new address in the database.
4. `PUT /addresses/{id}` Updates an existing address in the database.
5. `DELETE /addresses/{id}` Deletes an existing address from the database.When deleting an Address all the related Routes should be deleted too


## Routes API
1. `GET /routes` Retrieves a list of all routes in the database. Filtering and sorting options are described in swagger UI. 
   
2. `GET /routes/{id}` Retrieves a specific route by its unique identifier.
3. `POST /routes` Creates a new route in the database.
4. `PUT /routes/{id}` Updates an existing route in the database.
5. `DELETE /routes/{id}` Deletes an existing route from the database, When deleting a Route, make sure to NOT DELETE related addresses. 
