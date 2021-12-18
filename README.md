# Spring-Boot-h2-database

***Spring Boot project*** made on **Spring Tool Suite 4** (STS 4)

**Run using - http://localhost:8014/h2**

## Specifications
Created **Spring Starter Project** with **dependencies** auto-generated on *pom.xml* for the following:
1) Spring Web Services
2) Spring Data JPA
3) ***H2 Database***

**localhost** server from **PostgreSQL & pgAdmin4**

***Apache Tomcat*** - **Port 8014** - Configuration on application.properties = server.port=8014;

***Postman API*** tool used for **GET PUT POST DELETE** by using **@GetMapping, @PutMapping, @PostMapping, @DeleteMapping** etc

## Java Packages: 
1) Controller – Mycontroller.java - class with annotation **@RestController** - calls methods based on Strings written on the address bar
2) dto (Entities)  – Movie Class - Data members - @Column(nullable=false)
3) Repository - MovieRepository extends JpaRepository<Movie,Integer>
4) Services – ServiceClass & ServiceClassInterface to perform *methods* - **@Autowired in MovieServiceImpl interface**

**Methods are *simpler* since *H2 DATABASE CONSOLE* provides functionality**

### Code Snippet from MovieServiceImpl.java

@Autowired

MovieRepository mr;

@Override

public List<Movie> getmovie() {

return mr.findAll();
  
 }
