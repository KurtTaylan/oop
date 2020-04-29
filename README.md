#Documentation 

Note-1: You can find answers on section 6) Q&A

Note-2: Each Git Commit corresponds to particular Q&A  

1. Dependencies
2. Package Structure
3. Testing
4. Technology
5. Domain Map
6. Q&A

##1.Dependencies

- Maven (Optional), if you do not have maven installed, there is one downloaded runnable for you `./mvnw`


##2.Package Structure

###2.1.Run the Application

To Run Application, you only need to have a terminal,
and you need to run 2 command in series:

    ./mvnw clean install 
    
    ./mvnw spring-boot:run

    
##3.Test the Application

To Test Application, you only need to have a terminal,
and you need to run following command in series:

    ./mvnw test    

For testing purposes there are 2 types of testing approaches have been used:
- End to End Test: Used for `Happy Path` scenarios
- Unit Test: Used for rules, constraints and edge cases. Mostly used on Business heavily components. 
 
##4.Technology

- Java 11
- Spring Boot, Apache Tomcat -> IoC and Web Server 
- Swagger -> API Documentation
- Lombok -> Boilerplate Code Library


##5.Domain Map
Domain Map for oop application is like following;


##6.Q&A
##Question Section: A, 

##Answer: 1, Can you implement the sing() method for the bird?

Image: ./documents/answer-1-class-diagram.png

###Answer 1.a) How did you unit test it?
I would test either what input I would give or side effect - outcome. 
In this case System out stream would have the side effect of SUT (Software Under Test) so I would test what the output will be.

###Answer 1.b) How did you optimize the code for maintainability?
For this stage not much to optimize, only things verifying output stream seems much effort, I would find a way easier output channel
maybe instead of printing out stream I would modiyf methods to return results of the action so I could test the result of the SUT
easily by checking returned value.

##Answer 2) Now, we have 2 special kinds of birds: the Duck and the Chicken... Can you implement them to make their own special sound?

Image: ./documents/answer-2-class-diagram.png

To change the behaviour of the class we `override` the methods of super class. Also, to prevent some behavior to happen, we are throwing customized runtime error.   

