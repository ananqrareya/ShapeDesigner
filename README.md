 
---

# ShapeDesigner

## Overview

**ShapeDesigner** is a Java-based project that demonstrates the implementation of several design patterns, including the Abstract Factory, Singleton, Decorator, and Command patterns. This project allows users to create and customize shapes (Square and Circle) specifically for two different operating systems: Windows and Linux. Each shape can be extended with additional properties like color fill, border color, and double border size. Additionally, commands are automatically executed based on the type of shape created.

## Features

- **Platform-Specific Shape Creation**: Supports the creation of shapes tailored for Windows and Linux environments.
- **Singleton Pattern**: Ensures only one instance of each shape (Square, Circle) is created.
- **Decorator Pattern**: Allows for extending shapes with additional properties such as color fill, border color, and double border size.
- **Command Pattern**: Automatically executes specific commands (motion for Circle, border light for Square) upon shape creation.

## Design Patterns Used

- **Abstract Factory**: Facilitates the creation of families of related shapes without specifying their concrete classes.
- **Singleton**: Restricts the instantiation of a class to one object.
- **Decorator**: Adds additional responsibilities to an object dynamically.
- **Command**: Encapsulates a request as an object, thereby allowing for parameterization of clients with queues, requests, and operations.

## Project Structure

- **`AbstractShapeFactory` Interface**: Defines methods for creating platform-specific shapes.
- **Concrete Factory Classes**: Implement the `AbstractShapeFactory` interface to create specific shapes for Windows and Linux.
- **`Shape` Abstract Class**: Serves as the base class for all shapes, defining core methods such as `draw()` and `getDescription()`.
- **Concrete Shape Classes**: Extend the `Shape` class and provide specific implementations for Windows and Linux shapes.
- **Shape Decorators**: Extend shapes with additional properties like color fill and double border size.
- **Command Classes**: Implement specific actions that are executed automatically based on the shape type.
  - **`MotionCommand`**: Executes a motion command when a `Circle` is created.
  - **`BorderLightCommand`**: Executes a border light command when a `Square` is created.
- **ShapeCommandExecutor**: Determines the type of shape and executes the appropriate command using the Command pattern.

## How to Run

1. **Clone the Repository**:
    ```bash
    git clone <repository-url>
    ```
   
2. **Navigate to the Project Directory**:
    ```bash
    cd ShapeDesigner
    ```

3. **Compile the Java Files**:
    ```bash
    javac -d bin src/entity/*.java src/*.java
    ```

4. **Run the Test Driver**:
    ```bash
    java -cp bin TestDriver
    ```

   **Note**: `TestDriver` is the main class used to run the application. It demonstrates the creation of platform-specific shapes, their customization using decorators, and the execution of associated commands.

## Example Usage

The following examples demonstrate how to use **ShapeDesigner**:

1. **Create a Windows Square**:
    - Filled with color and has double border size.
    - Automatically executes the border light command.

2. **Create a Linux Circle**:
    - With border color and double border size.
    - Automatically executes the motion command.

 

---

 
