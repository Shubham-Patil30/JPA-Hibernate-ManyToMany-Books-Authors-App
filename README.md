# Book-Author Many-to-Many Relationship Project

## Description
This project demonstrates a Many-to-Many bidirectional relationship in Hibernate JPA between `Book` and `Author` entities, where a book can have multiple authors and an author can have multiple books, with full CRUD operations on both entities.

## Features
- Many-to-Many relationship between Book and Author entities.
- Bidirectional relationship, allowing access to associated entities from both sides.
- CRUD operations on both `Book` and `Author` entities, maintaining synchronized relationships.

## Technologies Used
- Java
- JPA (Java Persistence API)
- Hibernate ORM
- MySQL (or any other relational database)
- Maven for dependency management

## Project Structure
- **Entity Classes**: Contains `Book` and `Author` entities, both annotated with `@ManyToMany` to establish the relationship.
- **Join Table**: Configured with `@JoinTable` to manage the relationship and ensure a proper many-to-many linkage between books and authors.
- **DAO Classes**: Provides methods to perform CRUD operations on both `Book` and `Author`, with automatic management of the relationship.

## Annotations Used
- `@ManyToMany`: Establishes a many-to-many relationship between `Book` and `Author` entities.
- `@JoinTable`: Specifies the join table used to manage the many-to-many relationship.

## Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/Shubham-Patil30/JPA-Hibernate-ManyToMany-Books-Authors-App.git
