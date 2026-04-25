# 🛒 E-Commerce Backend

A robust, production-ready RESTful API backend for an e-commerce platform, built with **Spring Boot 4.0.5** and **Java 21**.

---

##  Tech Stack

| Layer | Technology |
|---|---|
| Language | Java 21 |
| Framework | Spring Boot 4.0.5 |
| Security | Spring Security + JWT (JJWT 0.11.5) |
| Persistence | Spring Data JPA + Hibernate |
| Database | PostgreSQL (production) / H2 (development) |
| Validation | Spring Boot Validation (Bean Validation) |
| Build Tool | Maven (with Maven Wrapper) |
| Utilities | Lombok |
| Dev Tools | Spring Boot DevTools |

---

##  Project Structure

```
ecommerce/
├── src/
│   ├── main/
│   │   ├── java/com/example/ecommerce/
│   │   │   ├── controller/       # REST API controllers
│   │   │   ├── service/          # Business logic layer
│   │   │   ├── repository/       # Data access layer (JPA repos)
│   │   │   ├── model/            # JPA entity classes
│   │   │   ├── dto/              # Data Transfer Objects
│   │   │   ├── security/         # JWT & Spring Security config
│   │   │   └── EcommerceApplication.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/com/example/ecommerce/
├── .gitignore
├── .gitattributes
├── E-Commerce-Backend.postman_collection.json
├── mvnw
├── mvnw.cmd
└── pom.xml
```

---

## ⚙️ Getting Started

### Prerequisites

- Java 21+
- Maven 3.8+ (or use the included `mvnw` wrapper)
- PostgreSQL (for production) or use the built-in H2 for development

### 1. Clone the Repository

```bash
git clone https://github.com/SachinSharma3345/Ecommerce-backend.git
cd Ecommerce-backend
```

### 2. Configure Application Properties

Edit `src/main/resources/application.properties`:

```properties
# PostgreSQL (Production)
spring.datasource.url=jdbc:postgresql://localhost:5432/ecommerce_db
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update

# JWT
jwt.secret=your_jwt_secret_key
jwt.expiration=86400000

# H2 Console (Development only)
spring.h2.console.enabled=true
spring.datasource.url=jdbc:h2:mem:testdb
```

### 3. Build & Run

```bash
# Using Maven wrapper (recommended)
./mvnw spring-boot:run

# Or with Maven directly
mvn spring-boot:run
```

The server starts at `http://localhost:8080`

---

##  Authentication

This API uses **JWT (JSON Web Tokens)** for stateless authentication.

1. Register or login via the auth endpoints to receive a JWT token.
2. Include the token in the `Authorization` header for all protected routes:

```
Authorization: Bearer <your_token_here>
```

---

##  API Endpoints

A full Postman collection is included in the root of the project:

> 📄 `E-Commerce-Backend.postman_collection.json`

Import it into [Postman](https://www.postman.com/) to explore and test all available endpoints.

---

##  Running Tests

```bash
./mvnw test
```

Test dependencies include Spring Security Test, Validation Test, and Web MVC Test.

---

## 🛠️ Development

**H2 Console** is available in development mode at:

```
http://localhost:8080/h2-console
```

Use JDBC URL `jdbc:h2:mem:testdb` with no password to access the in-memory database.

**Spring Boot DevTools** is enabled for automatic restarts on file changes during development.

---

## 📦 Key Dependencies

| Dependency | Purpose |
|---|---|
| `spring-boot-starter-security` | Authentication & Authorization |
| `spring-boot-starter-data-jpa` | ORM & database access |
| `spring-boot-starter-validation` | Request validation |
| `spring-boot-starter-webmvc` | REST API layer |
| `jjwt-api / jjwt-impl / jjwt-jackson` | JWT token creation & parsing |
| `postgresql` | Production database driver |
| `h2` | In-memory DB for development/testing |
| `lombok` | Reduces boilerplate code |

---

## 🤝 Contributing

1. Fork the repository
2. Create your feature branch: `git checkout -b feature/your-feature`
3. Commit your changes: `git commit -m 'Add some feature'`
4. Push to the branch: `git push origin feature/your-feature`
5. Open a Pull Request

---

## 👤 Author

**Sachin Sharma** — [@SachinSharma3345](https://github.com/SachinSharma3345)

---

## 📄 License

This project is open source and available under the [MIT License](LICENSE).
