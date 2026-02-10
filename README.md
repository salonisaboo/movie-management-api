# Movie Management REST API

A professional, lightweight Java backend application built using **Spring Boot** to manage a collection of movies. This project demonstrates RESTful API design, layered architecture, and input validation.

---

## 🚀 Features

- RESTful Architecture with standard HTTP methods and status codes
- In-Memory Storage using ArrayList
- Input Validation for required fields
- Layered Design (Controller → Service → Model)
- Automatic UUID generation for each movie

---

## 🛠️ Tech Stack

- Java 17+
- Spring Boot 3.x
- Maven
- Lombok

---

## 📋 Prerequisites

- JDK 17 or higher
- Maven (optional if using Maven Wrapper)

---
## 🔗 Live Demo
The API is deployed and accessible at: https://movie-management-api-production-4c7e.up.railway.app

## 🏃 Getting Started

### Clone Repository

```bash
git clone https://github.com/salonisaboo/movie-management-api.git
cd movie-management-api
Run Application
mvn spring-boot:run
Server runs at:

http://localhost:8080
API Endpoints
Add a New Movie
Method: POST

Endpoint: /api/movies

Payload:

{
  "title": "Inception",
  "description": "A thief who enters the dreams of others.",
  "genre": "Sci-Fi",
  "releaseYear": 2010
}
Success Response

201 Created
Get Movie by ID
Method: GET

Endpoint: /api/movies/{id}

Success Response

200 OK
Error Response

404 Not Found
🛠 Implementation Details
Data Storage
In-memory ArrayList in Service layer. Data resets on restart.

ID Generation
UUID generated using java.util.UUID.

Input Validation
Title field is mandatory. Missing or empty title returns:

400 Bad Request
Architecture
Controller → Service → Model layered structure.

Dependencies
Spring Web

Lombok
