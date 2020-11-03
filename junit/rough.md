```java
 Employee e100 = new Employee(100);
 Employee e101 = new Employee(100);
 assertEquals(e100, e101);
```
```java
// upcasting : derived class instance stored in base class reference
Object objecte101 = e101;
e100.equals(objecte101)
equals : e101 not null
Employee != Employee false

Employee emp = (Employee) objecte101;
Objects.equals(100, 100)

assertEquals(e100, e101); = true.
```

:newspaper: **mocking** ..  
```java
EmployeeDAO is mocked 
@Mocked final EmployeeDAO daoReference

EmployeeFactory needs the DAO
Mockup<EmployeeFactory>

dao1 is the method.
@Mock
EmployeeDAO dao1(){
   return daoReference;
}

// The mocked object is ready.

// EXPECTED OUTPUT / ACTUAL OUTPUT.

    new Expectations() {
      {
         //invoke the list
        daoReference.list();
        //the of the list method.
        result = new ArrayList<Employee>();
      }
    };
```

