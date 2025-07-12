What is REST—Representation State Transfer
 Front End
 BackEnd   ---API—URL---POSTMAN
Java code –backend—java Object
Angular/React/ Ajax---javascript/  PostMan—client(JSON)
Request	(Front End—>Back end(Logical Operation)---Database)		
Response(Database ---BackendFrontEnd)	

@RequestBody--Convert Javascript object(JSON) to java Object and bind with the Entity as well
@ResponseBody—Convert java Object into javascipt object(JSON)
What are the Endpoints
/getdata—it is used to call specific method—we do define it in controller class
CRUD
C-Create—insert---@PostMapping(‘/getdata’)-- it is method level annotation
R –Read-Fetch/get/ select--@GetMapping(getdata)-it is method level annotation
U-Update--@PutMapping(getdata)-- fully update record- it is method level annotation
Partiallly update--@PatchMapping- it is method level annotation
D-Delete-@DeleteMapping- it is method level annotation

@RequestMapping(“)-- it is method level annotation as well as class level

Server Status Code
200- ok with Content
204—ok with Nobody
404-Resource Not Found
401-bad Request
403- forbidden
405—method Mishmatch
500—internal server error
stereotype
1.	@Component
2.	@Controller
3.	@Service
4.	@Respository
@Controller
Class A{
}
Aa1=new A();
Spring boot--@Controller
Spring boot + REST --@RestContoller
@RestController---@Controller +@ResponseBody

@Configuration
@Bean


What JPA –Framework 

JPA allows you to map Java classes to database tables, and Java objects to rows in those tables, so you can work with data in your application using standard Java objects — instead of SQL queries

Class Emp{// create table emp(id int(), namevarchar)
Id
name
}
It essentially acts as a bridge between object-oriented Java code and relational databases
It is used for DB Operation with Spring Boot
Java + MySQL
The difference between CrudRepository and JpaRepository lies in the functionality they provide within Spring Data JPA. Both are interfaces that simplify data access layers(DAO)
name,salary
Some Popular method of JpaRepository
1.	save()—insert query 
2.	findById(id)—Select * from emp where id=101
3.	findAll-- Select * from emp;
4.	delete- delete
5.	findByName(name)

Complex Data retrieve 
            JPQL—query that will in Object oriented programming form which look similar to SQL
@Entity
@Table(name=”myemp”);
Class Emp{
@Id
@GeneratedValue
@column(name=”eid”)
Id
@column(name=”esalry”)
Name
Salary
address
}
    JPQL-Select id,name,salary,address from emp;--entity class
  SQL- Select id,name,salary,address from emp;--database table
  Native--

Feature	CrudRepository	JpaRepository
Basic CRUD methods	✅	✅
Pagination and sorting	❌	✅
Batch operations	❌	✅
JPA-specific methods	❌	✅
Suitable for simple use-cases	✅	✅
Suitable for complex queries	❌	✅


JPA Annotation
@Entity
@Table 
@Id
@GeneratedValue
@Column

Mapping ORM(Object Relational Mapping)—join—foreign key 
One to One--@OnetoOne--   employee,  laptop, 
One to Many--@OnetoMany -- emp , address
Many to one--@ManytoOne
Many to Many--@ManytoMany--emp-- hobbies –emp, hobies- emp-hobbies






Feature	JPA	Hibernate
Type	Specification	Implementation
Part of	Java EE / Jakarta EE	Independent framework
Annotations	@Entity, @Id, @Table, etc. (standardized)	Supports JPA + additional annotations like @GenericGenerator, @Cascade, etc.
Portability	Portable across providers	Tied to Hibernate-specific features if used outside JPA
API	Defines standard methods like EntityManager, EntityTransaction	Provides Session, Transaction, and other native APIs
Caching	Specifies basic support	Provides robust first- and second-level caching
Query Language	JPQL	JPQL + HQL (Hibernate Query Language, more powerful)

spring.datasource.url=jdbc:mysql://localhost:3306/mydb
spring.datasource.username=root
spring.datasource.password=root
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

application.property—configuration

MYSQL --- userid and Password
MYSQL--- database—tables

Spring boot – Advance version spring
1.	Auto configuration
@SpringbootApplication
@Configuration @ComponentScan  @AuoEnable Configuration
2.	Spring boot have its on in built server
3.	Spring boot having its own local DB –H2

@ResponseBody—convert java object to JSON Object

ResponseEntity-- convert java object to JSON Object

ResponseEntity—ResponseBody+header

Header—content type, content length, server status code
CRUD
C-Create--done
R-Read—read all data, read according to primary key, read according to any variable like by name, by salary, by address
U-Update---existing data—first it will check data present in DB then only it will update
D—Delete

Update—I have data need to update
{
    "name":"Black",
    "salary":"2345",
    "address":"USA"
}
