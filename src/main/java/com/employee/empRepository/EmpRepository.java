package com.employee.empRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.employee.empEntity.Employee;

public interface EmpRepository extends JpaRepository<Employee,Integer>{
	
	@Query(value="SELECT max(salary) from employee.employee_details",nativeQuery=true )
	public Integer getMax();
	
	@Query(value="select * from employee.employee_details where salary=(select max(salary) from employee.employee_details)",nativeQuery=true)
    public Employee getMax1();
	
    @Query(value="select * from employee.employee_details where salary>20000",nativeQuery=true)
    public List<Employee> getMax2();

    @Query(value="select* from employee.employee_details where salary=?1",nativeQuery=true)
    public List<Employee> getMax3(int a);

    @Query(value="select * from employee.employee_details where salary between ?1 and ?2",nativeQuery=true)
    public List<Employee> getMax4(int a,int b);

    @Query(value="select e from Employee e")
    public List<Employee>getAllValue();

    @Query(value="select e.name from Employee e")
    public List<String>getAllValue1();

    @Query(value="select max(e.salary) from Employee e")
    public Integer getValue2();

//TO GET THE EMPLOYEE DETAILS
    @Query(value="select e from Employee e where e.salary=(select max(e.salary) from Employee e)")
    public Employee getValue3();

//TO GET THE SALARY TO GET SEPARATE IN INTEGER AND OBJECT
    @Query(value="select max(e.salary) from Employee e where e.salary < (select max(e2.salary) from Employee e2) where e2.salary<"
    		+ "(select max(e3.salary) from Employee e3")
    public Integer get21();

    @Query(value="select min(e.salary) from Employee e where e.salary > (select min(e2.salary) from Employee e2)")
    public Integer get22();

    @Query(value="select e from Employee e where salary = (select max(e.salary) from Employee e where e.salary < (select max(e2.salary) from Employee e2))")
    public List<Employee> get23();
    
    
//TO GET LIST OF EMPLOYEES SALARY BETWEEN A AND B INPUT FROM THE USER
    @Query(value="select e from Employee e where e.salary between ?1 and ?2")
    public List<Employee>getSalRange(Integer a,Integer b);

    @Query(value="select * from Employee_details e where salary between :a and :b",nativeQuery=true)
    public List<Employee>getMax5(@Param("a") Integer a,@Param("b") Integer b);
    
    @Query(value="select * from employee.employee_details where name=?1",nativeQuery=true)
    public List<Employee>getNameDetails(String a);
    @Query(value="select * from employee.employee_details where salary=?1",nativeQuery=true)
    public List<Employee>getSalaryDetails(int a);
    @Query(value="select * from employee.employee_details where gender=?1",nativeQuery=true)
    public List<Employee>getGenderDetails(String a);
    @Query(value="select * from employee.employee_details where experience=?1",nativeQuery=true)
    public List<Employee>getexperienceDetails(float a);
    @Query(value="select * from employee.employee_details where id=?",nativeQuery=true)
    public List<Employee>getidDetails(int a);
    
   }
