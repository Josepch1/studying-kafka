# Kafka Project

Welcome to the Kafka Project! This repository contains two main components: the **Producer** and the **Customer** applications. Both are built using Spring Boot and are designed to demonstrate the capabilities of Apache Kafka.

## 📂 Project Structure

- **Producer**: Responsible for sending messages to Kafka topics.
- **Customer**: Responsible for consuming messages from Kafka topics.

## 🚀 Getting Started

### Prerequisites

- Java 23 or higher
- Maven 3.6.5 or higher
- Apache Kafka

### Installation

1. **Clone the repository**:
  ```bash
  git clone https://github.com/Josepch1/studying-kafka.git
  cd studying-kafka
  ```

### Running the Applications

1. **Start Kafka**:
  Ensure that your Kafka server is running.

2. **Run the Producer**:
  ```bash
  cd producer

  mvn clean package

  java -jar target/producer-0.0.1-SNAPSHOT.jar
  ```

3. **Run the Customer**:
  ```bash
  cd customer
  
  mvn clean package

  java -jar target/customer-0.0.1-SNAPSHOT.jar
  ```

## 📄 Configuration

Both applications can be configured using the `application.properties` file located in the `src/main/resources` directory of each module.


## 🛠️ Built With

- [Spring Boot](https://spring.io/projects/spring-boot) - Framework for building Java applications
- [Apache Kafka](https://kafka.apache.org/) - Distributed streaming platform

Feel free to contribute to this project by submitting issues or pull requests. Happy coding! 🎉