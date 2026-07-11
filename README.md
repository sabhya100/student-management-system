# 🎓 Student Management System

A RESTful **Student Management System** built with **Java, Spring Boot, Spring Data JPA, MySQL, and Maven**. The application provides complete CRUD functionality along with search, filtering, pagination, validation, and interactive API documentation using Swagger/OpenAPI.

---

## ✨ Features

- ✅ Create, Read, Update and Delete (CRUD) student records
- 🔍 Search students by name
- 📚 Filter students by course
- 📄 Pagination and sorting support
- 📊 Total student count endpoint
- ✔️ Input validation using Bean Validation
- 🚫 Duplicate email validation
- ⚠️ Global exception handling
- 📖 Interactive API documentation with Swagger UI

---

## 🛠️ Tech Stack

| Technology | Purpose |
|------------|---------|
| Java 21 | Programming Language |
| Spring Boot | Backend Framework |
| Spring Data JPA | Database Operations |
| Hibernate | ORM |
| MySQL | Database |
| Maven | Dependency Management |
| Swagger/OpenAPI | API Documentation |
| Postman | API Testing |

---

## 📂 Project Structure

```
src
└── main
    ├── java
    │   ├── controller
    │   ├── service
    │   ├── repository
    │   ├── entity
    │   ├── dto
    │   ├── exception
    │   └── StudentManagementApplication
    └── resources
        └── application.properties
```

---

## 📌 REST API Endpoints

| Method | Endpoint | Description |
|---------|----------|-------------|
| GET | `/students` | Get all students |
| GET | `/students/{id}` | Get student by ID |
| POST | `/students` | Add new student |
| PUT | `/students/{id}` | Update student |
| DELETE | `/students/{id}` | Delete student |
| GET | `/students/search?name=value` | Search by name |
| GET | `/students/course?course=value` | Filter by course |
| GET | `/students/page?page=0&size=5&sortBy=name` | Pagination & Sorting |
| GET | `/students/count` | Total number of students |

---

## 📖 Swagger API Documentation

After running the project, open:

```
http://localhost:8080/swagger-ui/index.html
```

Swagger provides an interactive interface for testing all available endpoints.

---

## 🗄️ Database Schema

```sql
CREATE TABLE students (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(150) UNIQUE NOT NULL,
    course VARCHAR(100) NOT NULL,
    phone VARCHAR(15),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
```

---

## 🚀 Getting Started

### Clone the repository

```bash
git clone https://github.com/sabhya100/student-management-system.git
```

### Navigate to the project

```bash
cd student-management-system
```

### Configure MySQL

Create a database named

```text
student_management_db
```

Update your `application.properties`

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/student_management_db
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD
```

### Run the application

```bash
mvn spring-boot:run
```

or run

```
StudentManagementApplication.java
```

from your IDE.

---

## 📬 Sample Request

```json
{
  "name": "Rahul Sharma",
  "email": "rahul@example.com",
  "course": "BTech CSE",
  "phone": "9876543210"
}
```

---

## 📸 Screenshots

### Swagger UI

> Add your Swagger screenshot here.

```
images/swagger-ui.png
```

### Home Page

> Add your frontend screenshot here.

```
images/home-page.png
```

---

## 🔮 Future Improvements

- JWT Authentication
- Role-Based Access Control
- Unit Testing with JUnit
- Docker Deployment
- CI/CD using GitHub Actions
- Cloud Deployment (Azure/AWS)

---

## 👨‍💻 Author

**Sabhya Malhotra**

- GitHub: https://github.com/sabhya100
- LinkedIn: https://www.linkedin.com/in/sabhya-malhotra/

---

⭐ If you found this project useful, consider giving it a star.
