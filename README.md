Title: Secure Library Management System API
Problem Overview
The goal of this assignment is to secure a simple Library Management RESTful API using Spring Security. You will implement HTTP Basic Authentication for user login and Role-Based Access Control (RBAC) to restrict certain operations based on the user's assigned role.

You will build a system to manage a collection of books where access is strictly controlled by user roles:

·   Librarians (ADMIN) must be able to perform all book management operations (Add, Remove, Update, View).

·   Patrons (USER) must only be able to view the book catalog.

Scenario: Library Inventory and Lending Access
A public library needs to secure its digital book catalog.

1. A Librarian has full administrative access to the book inventory.

2. A Patron can only browse the available books.

3. The system uses basic username and password login for authentication.

Task
Build a Spring Boot application that secures a simple Library Management API with the following security features.

Task 1: Project Setup and Entity
1. Start a new Spring Boot project and add the necessary dependencies, including Spring Security.

2. Define a simple Book Entity with fields such as:

id (Long, Primary Key)

title (String)

author (String)

availableCopies (Integer)

3. Implement a basic BookRepository and BookService for the CRUD operations. You may use an H2 in-memory database.

Task 2: Spring Security Configuration
1. Configure Spring Security to use HTTP Basic Authentication.

2. Ensure that all user passwords are encoded (e.g., using BCryptPasswordEncoder) during the security configuration.

Task 3: Role-Based Access Control (RBAC) in the Controller
Implement a BookController with the following endpoints, applying role-based authorization using Spring Security (hasRole(...') or hasAnyRole(ROLE1, ROLE2,...)):

1. POST /api/books: Create a new book entry (e.g., Librarian adds new stock).

Required Role: ADMIN

2. GET /api/books: Get a list of all books in the catalog.

Required Role: ADMIN or USER

3. GET /api/books/{id}: Get a specific book's details by ID.

Required Role: ADMIN or USER

4. PUT /api/books/{id}: Update an existing book's information.

Required Role: ADMIN

5. DELETE /api/books/{id}: Remove a book from the library.

Required Role: ADMIN
