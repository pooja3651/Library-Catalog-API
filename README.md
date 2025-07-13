# 📚 Library Management REST API — Spring Boot + MySQL

This is a simple **Java Spring Boot REST API** project for managing a library’s book catalog. It provides endpoints to add, retrieve, delete, and update books.

🟢 This project:
- Was created manually in **IntelliJ IDEA** using **Spring Initializr**
- Uses **MySQL** database to persist book data
- Uses **Spring Data JPA** for database interaction
- Is tested using **Postman**

---

## 🛠️ Tech Stack
```
- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- MySQL Database
- Maven
- IntelliJ IDEA (local development)
- Postman (for API testing)
```
---

## 📦 Folder Structure

```
library/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── pooja/
│       │           └── library/
│       │               ├── LibraryApplication.java      <-- Main Spring Boot App
│       │               ├── model/
│       │               │   └── Book.java                <-- Entity Class
│       │               ├── repository/
│       │               │   └── BookRepository.java      <-- JPA Repository
│       │               ├── service/
│       │               │   └── BookService.java         <-- Business Logic Layer
│       │               └── controller/
│       │                   └── BookController.java      <-- REST API Endpoints
│       └── resources/
│           ├── application.properties                   <-- DB Config
│           ├── static/                                  <-- (Optional) Static Files
│           └── templates/                               <-- (Optional) Thymeleaf Templates
├── .gitignore                                            <-- (Optional) For GitHub repo
├── pom.xml                                               <-- Maven Configuration
└── README.md                                             <-- Project D


```
---

## 💾 Database Configuration

Make sure you have MySQL running locally, then update your `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/library_db?createDatabaseIfNotExist=true
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=create
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
```
- ddl-auto=create will create the books table automatically on startup

- library_db will be auto-created if it doesn't exist

## ▶️ How to Run the Project
✅ Start MySQL server and ensure the library_db database is accessible.

✅ Open the project in IntelliJ IDEA

✅ Run the main class:
  LibraryApplication.java

✅ The Spring Boot application will start at:
  http://localhost:8080

## 🌐 REST API Endpoints
🔗 Base URL: http://localhost:8080

## ➕ Add a New Book
POST /books

Headers:
Content-Type: application/json

Request Body:
{
  "title": "The Alchemist",
  "author": "Paulo Coelho",
  "isbn": "9780061122415",
  "available": true
}

## 📚 Get All Books
GET /books

## 🔍 Get Book by ID
GET /books/{id}
GET /books/1

## ❌ Delete Book by ID
DELETE /books/{id}
DELETE /books/1

## 🔁 Update Book Availability
PATCH /books/{id}/availability?available=false
PATCH /books/2/availability?available=true


## 🧪 Postman Usage

All endpoints were tested using Postman.
You can import a collection manually or test each endpoint above.
Ensure your server is running at http://localhost:8080.

## 📌 Example Book Table (in MySQL)

| id | title         | author        | isbn          | available |
| -- | ------------- | ------------- | ------------- | --------- |
| 1  | The Alchemist | Paulo Coelho  | 9780061122415 | true      |
| 2  | 1984          | George Orwell | 9780451524935 | false     |

## 🙋‍♀️ Author
Pooja Sahu
📎 GitHub: github.com/pooja3651
























