# Movie Management REST API

A professional, lightweight Java backend application built using **Spring Boot** to manage a collection of movies. This project was developed as part of a technical assessment to demonstrate proficiency in RESTful API design, layered architecture, and input validation.

---

## 🚀 Features

- **RESTful Architecture:** Implements standard HTTP methods and status codes.
- **In-Memory Storage:** Uses an `ArrayList` for rapid data management without external database overhead.
- **Input Validation:** Ensures data integrity by validating required fields before processing.
- **Layered Design:** Separates concerns into Controller, Service, and Model layers for better maintainability.
- **Unique ID Generation:** Automatically assigns a `UUID` to every new entry.

---

## 🛠️ Tech Stack

- **Language:** Java 17+
- **Framework:** Spring Boot 3.x
- **Build Tool:** Maven
- **Utility:** Lombok (to reduce boilerplate code)

---

## 📋 Prerequisites

Before running the application, ensure you have the following installed:
- [JDK 17](https://www.oracle.com/java/technologies/downloads/) or higher.
- [Maven](https://maven.apache.org/download.cgi) (Optional if using the provided Maven Wrapper).

---

## 🏃 Getting Started

### 1. Clone the Repository
```bash
git clone [https://github.com/YOUR_USERNAME/movie-management-api.git](https://github.com/YOUR_USERNAME/movie-management-api.git)
cd movie-management-api
### 2. Navigate to the project root:
```bash
cd movie-api
### 3. Run the application:
```bash
mvn spring-boot:run
The server will be accessible at http://localhost:8086

## API Endpoints

### 1️⃣ Add a New Item

- **Method:** POST  
- **Endpoint:** `/api/movies`

**Payload (JSON):**
```json
{
  "title": "Inception",
  "description": "A thief who enters the dreams of others.",
  "genre": "Sci-Fi",
  "releaseYear": 2010
}

## Success Response
`201 Created`

---

## 2️⃣ Get Item by ID

- **Method:** GET  
- **Endpoint:** `/api/movies/{id}`

### Success Response
`200 OK`

### Error Response
`404 Not Found` — if the ID does not exist

---

## 🛠 Implementation Details

### Data Storage
Implemented using an in-memory `ArrayList` inside the Service layer. All data is cleared when the application restarts.

### ID Generation
Each item is assigned a unique identifier using `java.util.UUID` at creation time.

### Input Validation
The POST endpoint checks that the `title` field is present and not empty. If validation fails, the API returns: 400 Bad Request

### Architecture
Built using the **Controller → Service → Model** pattern to maintain clean separation of concerns.

### Dependencies
- Spring Web — for REST API development  
- Lombok — to reduce boilerplate code
