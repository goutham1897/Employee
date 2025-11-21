package com.employee.empService;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.GlobalExceptionHandler.ExperienceNotFoundException;
import com.employee.GlobalExceptionHandler.GenderNotFoundException;
import com.employee.GlobalExceptionHandler.IdNotFoundException;
import com.employee.GlobalExceptionHandler.NameNotFoundException;
import com.employee.GlobalExceptionHandler.SalaryNotFoundException;
import com.employee.empDao.EmpDao;
import com.employee.empEntity.Employee;
import com.employee.empRepository.EmpRepository;

@Service
public class EmpService {
	@Autowired
	EmpDao ed;
	@Autowired
	EmpRepository er;
	
	
	//TO POST THE VALUES USING POSTMAN
	public String postData(List<Employee> e) {                            
		return ed.postData(e);                           
	}
	public String postData1(Employee e) {
		return ed.postData1(e);
	}
	
	//TO GET THE VALUES USING POSTMAN
	public Employee getData(int a) {
		return ed.getData(a);
	}
	public List<Employee> getData1(){
		return ed.getData1();
	}
	
	//TO PUT THE VALUES USING POSTMAN
	public String updateDetail(Employee e,Integer a) {
		return ed.updateDetail(e,a);
	}
	public String patchUpdate(Employee e,Integer a) {
		return ed.patchUpdate(e,a);
	}
	
	//TO DELETE THE VALUES USING POSTMAN
	public String deleteName(Integer a) {
		return ed.deleteName(a);
	}
	
	//TO GET ALL MAXIMUM SALARY LIST OF EMPLOYEES
	public int maxSalary() {
		List<Employee>aa=er.findAll();
		int c=aa.stream().map(x->x.getSalary()).max(Comparable::compareTo).get();
		return c;
	}
	
	//TO GET THE MAXIMUM EMPLOYEE WITH ALL THE FIELDS
	public Employee maxSalary1() {
		List<Employee>b=er.findAll();
		Employee ca=b.stream().max(Comparator.comparing(Employee::getSalary)).get();
		return ca;
	}
	
	//TO GET THE LIST OF EMPLOYEE DETAILS IN ASCENDING ORDER
	public List<Employee>secondmax(){
		List<Employee>b=er.findAll();
		List<Employee>ca=b.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
		return ca;
	}
	
	//TO GET THE NAME OF EMPLOYEE DETAILS OF EMPLOYEE NAME HAVE "G"
	public List<Employee>get1(String a){
		List<Employee>b=er.findAll();
		List<Employee>bb=b.stream().filter(x->x.getName().equalsIgnoreCase(a)).collect(Collectors.toList());
		return bb;
	}
	public List<Employee>get2(int a,int b){
		List<Employee>ba=er.findAll();
		List<Employee>bb=ba.stream().filter(x->x.getSalary()<=a&&x.getSalary()>=b).collect(Collectors.toList());
		return bb;
	}
	
    //TO GET THE COUNT OF EMPLOYEE NAME STARTS WITH A AND B
	public Long get3(String a,String b) {
		List<Employee>ba=er.findAll();
		Long ab=ba.stream().filter(x->x.getName().startsWith("a")&&x.getName().endsWith("b")).count();
		return ab;
	}
	
	//TO GET MAXIMUM SALARY
	public Integer getMax() {
		return ed.getMax();
	}
	public Employee getMax1() {
		return ed.getMax1();
	}
	
	//TO GET THE LIST OF EMPLOYEE HAVING MAXIMUM SALARY
	public List<Employee> getMax2(){
		
		return ed.getMax2();
	}
	
	//TO GET THE SALARY OF LIST OF EMPLOYEE
	public List<Employee> getMax3(int a){
		
		return ed.getMax3(a);
	}
	
	//TO GET THE SALARY BETWEEN TWO ENDPOINTS 
	public List<Employee> getMax4(int a,int b){
		
		return ed.getMax4(a,b);
	}
	
	
	//TO GET THE NAME OF EMPLOYEES
	public List<String> getAllValue1(){
		return ed.getAllValue1();
	}
	
	//TO GET THE SALARY OF THE EMPLOYEES
	public Integer getValue2() {
		return ed.getValue2();
	}
	
	//TO GET THE EMPLOYEE DETAILS
	public Employee getValue3() {
		return er.getValue3();
	}
	
	//TO GET THE SALARY TO GET SEPARATE IN INTEGER AND OBJECT
	public Integer get21() {
		return ed.get21();
	}
	public Integer get22() {
		return ed.get22();
	}
	public List<Employee> get23() {
		return ed.get23();
	}
	
	//TO GET LIST OF EMPLOYEES SALARY BETWEEN A AND B INPUT FROM THE USER
	public List<Employee> getSalRange(Integer a,Integer b){
		return ed.getSalRange(a, b);
	}
	public List<Employee> getMax5(Integer a, Integer b){
		return ed.getMax5(a,b);
	}
	//Exception handling
	public List<Employee> getNameDetails(String a) throws NameNotFoundException {
		List<Employee> x=ed.getNameDetails(a);
		if(x.isEmpty()) {
			throw new NameNotFoundException("Name Not Found");
		}
		else {
			return ed.getNameDetails(a);
		}
	}
	public List<Employee>getSalaryDetails(int a) throws SalaryNotFoundException{
		List<Employee>x=ed.getSalaryDetails(a);
		if(x.isEmpty()) {
			throw new SalaryNotFoundException("Salary Not Found");
		}else {
			return ed.getSalaryDetails(a);
		}
	}


public List<Employee>getGenderDetails(String a) throws GenderNotFoundException{
List<Employee>x=ed.getGenderDetails(a);
if(x.isEmpty()) {
	throw new GenderNotFoundException("Gender Not Found");
}else {
	return ed.getGenderDetails(a);
}
}

public List<Employee>getexperienceDetails(float a) throws ExperienceNotFoundException {
List<Employee>x=ed.getExperienceDetails(a);
if(x.isEmpty()) {
	throw new ExperienceNotFoundException("Experience Not Found");
}else {
	return ed.getExperienceDetails(a);
}
}
public List<Employee>getidDetails(int a) throws IdNotFoundException {
List<Employee>x=ed.getidDetails(a);
if(x.isEmpty()) {
	throw new IdNotFoundException("ID Not Found");
}else {
	return ed.getidDetails(a);
}
}
public List<Employee> getSecMax()
{
	List<Employee> c=er.findAll();
	
	return c.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).limit(1).collect(Collectors.toList());

}

}
