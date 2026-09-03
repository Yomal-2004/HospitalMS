# 🏥 SmartCare Hospital Management System

A **Hospital Management System** developed using **Java Spring Boot, Spring Data JPA, and MySQL** to manage hospital operations such as patients, doctors, departments, admissions, appointments, laboratory tests, treatments, rooms, billing, and users.

## 📌 Project Overview

The **SmartCare Hospital Management System** is a web-based backend application designed to simplify and organize hospital management activities.

The system provides RESTful APIs that allow hospital staff to manage patient information, doctor details, appointments, admissions, billing, laboratory tests, treatments, rooms, and departments efficiently.

The project uses **Spring Boot** for backend development and **MySQL** for database management.

---

## 🚀 Features

* 👤 Patient Management
* 👨‍⚕️ Doctor Management
* 🏥 Department Management
* 🛏️ Room Management
* 📋 Patient Admission Management
* 📅 Appointment Management
* 💳 Billing Management
* 🧪 Laboratory Test Management
* 💊 Treatment Management
* 👥 User Management
* 🎓 Doctor Qualification Management
* 🔗 RESTful API integration
* 🗄️ MySQL database integration
* 📖 API documentation using OpenAPI/Swagger

---

## 🛠️ Technologies Used

| Technology        | Purpose                   |
| ----------------- | ------------------------- |
| Java 21           | Programming Language      |
| Spring Boot       | Backend Framework         |
| Spring Data JPA   | Database Access           |
| Hibernate         | ORM                       |
| MySQL             | Database                  |
| Maven             | Dependency Management     |
| Lombok            | Reducing Boilerplate Code |
| ModelMapper       | DTO Mapping               |
| Swagger / OpenAPI | API Documentation         |
| HTML / JavaScript | Frontend                  |

---

## 📂 Project Structure

```text
SmartCare Hospital Management System
│
├── src
│   └── main
│       └── java
│           └── com.example.demo
│               ├── controller
│               ├── dto
│               ├── entity
│               ├── repository
│               ├── service
│               └── DemoApplication.java
│
├── FrontEnd
│   ├── index.html
│   ├── patient.html
│   ├── doctor.html
│   └── js
│
├── pom.xml
└── SmartCare_Hospital.sql
```

---

## 🗄️ Database

The project uses **MySQL** as the relational database management system.

The database is named:

```sql
SmartCare_Hospital
```

The database contains tables for:

* Patient
* Patient Contact
* Doctor
* Doctor Qualification
* Department
* Room
* Admission
* Appointment
* Bill
* Laboratory
* Treatment
* User

The complete database creation script is available in:

```text
SmartCare_Hospital.sql
```

---

## ⚙️ Installation & Setup

### 1. Clone the Repository

```bash
git clone <https://github.com/Yomal-2004/HospitalMS>
```

Navigate to the project directory:

```bash
cd HospitalMS-main
```

### 2. Create the Database

Open **MySQL Workbench** or MySQL Command Line.

Run the SQL script:

```text
SmartCare_Hospital.sql
```

This will create the required database and tables.

### 3. Configure Database Connection

Open:

```text
src/main/resources/application.properties
```

Update the MySQL configuration according to your system.

Example:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/SmartCare_Hospital
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

Replace:

```text
YOUR_PASSWORD
```

with your MySQL password.

### 4. Run the Application

Using Maven:

```bash
mvn spring-boot:run
```

Or run the main class:

```text
DemoApplication.java
```

The application will normally start at:

```text
http://localhost:8080
```

---

## 📖 API Documentation

Once the application is running, Swagger/OpenAPI can be used to view and test the REST APIs.

Swagger UI:

```text
http://localhost:8080/swagger-ui/index.html
```

---

## 🔑 Main API Modules

The system provides REST APIs for:

```text
Patients
Doctors
Departments
Appointments
Admissions
Billing
Laboratory
Treatments
Rooms
Users
```

Each module contains appropriate endpoints for performing operations such as **Create, Read, Update, and Delete (CRUD)**.

---

## 🎯 Objectives

The main objectives of the SmartCare Hospital Management System are:

* Reduce manual hospital record keeping.
* Improve data accuracy and consistency.
* Reduce data redundancy.
* Provide faster access to hospital information.
* Improve hospital management and reporting.
* Centralize patient and hospital-related information.
* Provide a structured and secure database system.

---

## 👥 Team Project

This project was developed as an academic group project to demonstrate practical knowledge of:

* Object-Oriented Programming
* Java
* Spring Boot
* REST APIs
* Database Management Systems
* MySQL
* Software Development
* Git & GitHub

---

## 📌 Future Improvements

Possible future enhancements include:

* 🔐 User authentication and role-based authorization
* 📱 Responsive mobile interface
* 📊 Hospital management dashboard
* 📈 Advanced reporting and analytics
* 🔔 Appointment notifications
* 🧾 PDF invoice generation
* ☁️ Cloud deployment

---

## 👨‍💻 Developers

* **Yomal Daluwatte**
* **Vinod Ranasinghe**
* **Vishwa Randeepa**
* **Theekshana** 

Data Science Undergraduate 
**(SLTC)**

---

## 📄 License

This project was developed for **academic and educational purposes**.
