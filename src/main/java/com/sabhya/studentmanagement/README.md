# Student Management System API

A RESTful backend application for managing student records, built with Java, Spring Boot, and MySQL.

## Features

- Create, read, update, and delete student records
- Search students by name
- Filter students by course
- Pagination and sorting
- Student count endpoint
- Input validation
- Duplicate email prevention
- Global exception handling
- Swagger API documentation

## Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Swagger / OpenAPI

## API Endpoints

| Method | Endpoint | Description |
|---|---|---|
| GET | `/students` | Get all students |
| GET | `/students/{id}` | Get a student by ID |
| POST | `/students` | Add a student |
| PUT | `/students/{id}` | Update a student |
| DELETE | `/students/{id}` | Delete a student |
| GET | `/students/search?name=value` | Search students by name |
| GET | `/students/course?course=value` | Filter students by course |
| GET | `/students/page?page=0&size=5&sortBy=name` | Pagination and sorting |
| GET | `/students/count` | Get total student count |

## API Documentation

After starting the application, open:

`http://localhost:8080/swagger-ui/index.html`

## Local Setup

1. Clone the repository.
2. Create a MySQL database named `student_management_db`.
3. Copy `application.properties.example` to `application.properties`.
4. Add your MySQL username and password in `application.properties`.
5. Run `StudentManagementApplication.java`.
6. Open Swagger UI to test the API.

## Example Student JSON

```json
{
  "name": "Rahul Sharma",
  "email": "rahul@example.com",
  "course": "BTech CSE",
  "phone": "9876543210"
}