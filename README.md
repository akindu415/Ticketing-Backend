**Here's how everything works in your Spring Boot application:**

1.Controller Receives Request:
    The client sends an HTTP request (e.g., to create a ticket).
    The controller's endpoint method is invoked.

2.Controller Calls Service Method:
    The controller uses the TicketService interface to call the appropriate method (e.g., createTicket).

3.Service Performs Business Logic:
    The service implementation (TicketServiceImpl) executes the method.
    It can include business logic like validation, processing, or calculations.

4.Service Interacts with Repository:
    The service calls repository methods to interact with the database.

5.Repository Accesses Database:
    The repository performs CRUD operations on the database.

6.Response is Returned:
    The service returns the result to the controller.
    The controller sends the response back to the client.

**model package**
used to define the core data structures of the application
These classes are annotated to map database using JPA annotations

**repository package**
acts as the interface between service layer and database.
It handles the data access logic enabling to perform CRUD operations