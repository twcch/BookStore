# Book Store Project

## Introduction

This is a simple shopping cart application built using Spring Boot. It provides basic functionality for adding products to a cart, removing them, and viewing the cart's contents. This project serves as a starting point for building more complex e-commerce applications.

## Features

- Register new users
- Login for existing users
- Add products to the cart
- Remove products from the cart
- View the contents of the cart

## Technologies Used

- Spring Boot
- Spring JDBC
- Spring Security (coming soon)
- Maven (for dependency management)
- MySQL

## Getting Started

### Prerequisites

- Java 17 or higher
- Maven 3.9.5 or higher

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/twcch/BookStore.git
   cd BookStore

2. Build the project:
   ```angular2html
   mvn clean install
   ```

3. Run the application:
   ```angular2html
   mvn spring-boot:run
   ```

4. Open your browser and navigate to http://localhost:8080.

## Usage (coming soon)

### Add Products to the Cart
To add a product to Book Store, send a POST request to:
```angular2html
http://localhost:8080/products
```

with a JSON body containing the product details, for example:
```json
{
  "productName": "Java tutorial",
  "category": "CHINESE_BOOK",
  "imageUrl": "http://localhost:8080/",
  "price": "10",
  "stock": "5"
}
```

## Project Structure

1. src/main/java/tw/cchs/bookstore - Main application package
2. src/main/resources/application.properties - Application configuration file

## Contributing

Contributions are welcome! Please fork the repository and create a pull request with your changes. Make sure to follow the project’s coding standards and write tests for any new features or bug fixes.

## License

N/A

## Acknowledgements

1. Spring Boot - for providing the framework 
2. Spring Security - for user authentication (coming soon)

## Contact

If you have any questions or suggestions, feel free to reach out to me at [twcch1218@gmail.com](twcch1218@gmail.com).

Happy coding!