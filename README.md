<center>
<h1> RESTAURANT MANAGEMENT SYSTEM </h1>
</center>
<center>
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-3.0.5-brightgreen.svg" />
</a>
</center>
This project is based on Restaurant management system that is built with the help of Spring Boot with Java.

---

## Framework Used
* Spring Boot

---

## Language Used
* Java

---

## Data Model

The user data model is defined in the User class, which has the following attributes:
```
restaurantId : unique identifier for each restaurant
restaurantName : Organisation user name
restaurantAddress : address of the restaurant
restaurantNumber : Phone number of the restaurant
restaurantTotalStaffs : Total numbers of staff does restaurant have.
restaurantSpeciality : Speciality about Restaurant
```

---

## Data Flow

1. The user sends a request to the application through the API endpoints.
2. The API receives the request and sends it to the proper controller method.
3. The controller method makes a call to the method in service class.

4. The method in service class builds logic and retrieves or modifies data from the database, which is in turn given to controller class
5. The controller method returns a response to the API.
6. The API sends the response back to the restaurant.

---

## Functions used :-

### API Endpoints :-
</br>
<b> Add User </b>

* PostMapping: /newRestaurant
```
This endpoint makes a call to method in restaurantService class which is connected to database. In database we add a new user given through API.
```

* GetMapping: /restaurants
```
This endpoint makes a call to method in restaurantService class which retrieves data of all restaurants from database. This data is sent to controller which is then sent through the API to client.
```

* GetMapping: "restaurantId"
```
This endpoint returns data of specific user based on restaurantid through API
```

* PutMapping : 
```
This endpoint makes a call to method in restaurantService class which is connected to database. In database we update a restaurant by restaurantid given through API.
```

* DeleteMapping
```
This endpoint makes a call to method in restaurantService class which is connected to database. In database we delete a user by restaurantid given through API.
```

---

## Data structure Used
* HashMap
```
We have used HashMap data structure as a database to implement CRUD Operations 
```
---

## Project Summary

The Restuarant Management System is a Spring Boot project using Java as a language to enables basic functionality for managing restaurant.The project is built with the help of Spring Boot Framework for building production-ready applications and this project also use HashMap as the data structure to store and manage restaurant data. 

The following project consist of four class i.e; the RestaurantManagementController, the RestaurantService, the RestaurantDao, and the Restaurant class.
