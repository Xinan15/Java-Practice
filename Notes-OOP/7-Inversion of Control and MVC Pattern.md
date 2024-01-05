## MVC
Week 7 Inversion of Control and MVC Pattern
Describe the architecture of the MVC pattern
What are inner classes? What kinds are there?


The MVC (Model-View-Controller) pattern is a software architectural design for implementing user interfaces. It divides an application into three interconnected components. This separation helps manage complexity, particularly in web applications, by enabling efficient code reuse and parallel development. Here's an overview of each component:

1. **Model**: 
   - The Model represents the data and the business logic of the application. It's responsible for retrieving data from the database, manipulating it, and updating it. The Model is independent of the user interface and doesn't concern itself with how data is displayed or interacted with.
   - In essence, it encapsulates the core functionality and data of the application.

2. **View**: 
   - The View is responsible for presenting data to the user. It renders the Model into a form that is suitable for interaction, typically a user interface element such as HTML/CSS in web applications.
   - Views are often designed as templates, which are filled in with data from the Model and then rendered to the user.
   - The View also sends user commands to the Controller to act upon.

3. **Controller**:
   - The Controller acts as an intermediary between the Model and the View. It listens to user input, typically through UI actions, and calls upon Model classes to retrieve data or perform operations.
   - The Controller also decides which View to present based on the user interactions and outcomes of Model operations.
   - It is responsible for translating user inputs, such as clicks and keystrokes, into actions to be performed by the Model.

In the MVC pattern, these three components work together seamlessly:
- User interactions are handled by the View, which delegates user commands to the Controller.
- The Controller manipulates the Model as necessary and selects an appropriate View.
- The View gets the data it needs from the Model to display to the user.

This pattern promotes a clean separation of concerns, making an application easier to maintain and extend. The Model's independence from View and Controller makes it possible to change the application's interface without altering the underlying business logic, and vice versa. This modular approach also facilitates more straightforward testing and development within teams.


Inversion of Control (IoC) is a fundamental concept in software engineering, extensively used in Java and other programming languages. It's a principle by which the control of objects or portions of a program is transferred to a container or framework. In simpler terms, IoC is about moving the control of creating and managing objects from your application code to a framework or container.

In traditional programming, your code typically controls the flow of an application and makes decisions about what and when to execute. In the case of IoC, this control is inverted: a framework or container makes these decisions for you.

There are several ways to implement IoC in Java, with the most common being:

Dependency Injection (DI): This is the most common form of IoC. DI allows for the automatic injection of dependencies into objects rather than having the objects create the dependencies themselves. This can be done via constructor injection, setter injection, or interface injection.

Service Locator Pattern: This pattern is used to look up services or components in a central registry. The application will ask the service locator for instances of the required service instead of creating them.

Template Method Pattern: This pattern defines the program skeleton of an algorithm in a method, deferring some steps to subclasses. The overall structure and sequence of the algorithm is preserved by the parent class.

Factory Pattern: This involves using a factory class to create objects, which gives the factory the control over which instances or types of classes to instantiate.

IoC in Java is widely used in frameworks like Spring and Java EE, which provide their own implementation and tools for IoC, primarily through Dependency Injection. The use of IoC makes applications more modular, easier to test, and better structured. It leads to a design where components are loosely coupled and thus more maintainable and scalable.

