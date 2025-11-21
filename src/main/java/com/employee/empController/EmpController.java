package com.employee.empController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.employee.GlobalExceptionHandler.ExperienceNotFoundException;
import com.employee.GlobalExceptionHandler.GenderNotFoundException;
import com.employee.GlobalExceptionHandler.IdNotFoundException;
import com.employee.GlobalExceptionHandler.NameNotFoundException;
import com.employee.GlobalExceptionHandler.SalaryNotFoundException;
import com.employee.empEntity.Employee;
import com.employee.empService.EmpService;

@RestController
//@RequestMapping(value="details")
public class EmpController {
	@Autowired
	EmpService es;
	@PostMapping (value="postData")
	public String postData(@RequestBody List<Employee> e) {
		return es.postData(e);
	}
	@PostMapping (value="postData1")
	public String postData1(@RequestBody Employee e){
		return es.postData1(e);}
	
@GetMapping(value="getData/{a}")
public Employee getData(@PathVariable int a) {
	return es.getData(a);
}
@GetMapping(value="getData1")
public List<Employee>getData1(){
	return es.getData1();
}
@PutMapping(value="updateName/{a}")
public String updateDetail(@RequestBody Employee e,@PathVariable Integer a) {
	return es.updateDetail(e,a);
}
@PatchMapping(value="patchUpdate/{a}")
public String patchUpdate(@RequestBody Employee e,@PathVariable Integer a) {
	return es.patchUpdate(e,a);
}
@DeleteMapping("deleteName/{a}")
public String deleteName(@PathVariable Integer a) {
	return es.deleteName(a);
}
@GetMapping(value="maxSalary")
public int maxSalary() {
	
	return es.maxSalary();
}
@GetMapping(value="maxSalary1")

public Employee maxSalary1() {
	return es.maxSalary1();}
public List<Employee> secondmax(){
	return es.secondmax();
}
@GetMapping(value="get1/{a}")

public List<Employee> get1(@PathVariable String a){
	return es.get1(a);
}
@GetMapping(value="get2/{a}/{b}")
public List<Employee>get2(@PathVariable int a,@PathVariable int b){
	return es.get2(a,b);
}
//@GetMapping(value="get3/{a}/{b}")
//public Long get3(@PathVariable char a,@PathVariable char b) {
//	return es.get3(a,b);
//}
@GetMapping(value="get3/{a}/{b}")
public Long get3(@PathVariable String a,@PathVariable String b) {
	return es.get3(a, b);
}
@GetMapping(value="getMax")
public Integer getMax() {
	return es.getMax();
}
@GetMapping(value="getMax1")
public Employee getMax1() {
	return es.getMax1();
}
@GetMapping(value="getMax2")
public List<Employee> getMax2(){
	return es.getMax2();
}
@GetMapping(value="getMax3/{a}")
public List<Employee> getMax3(@PathVariable int a){
	return es.getMax3(a);
}
@GetMapping(value="getMax4/{a}/{b}")
public List<Employee> getMax4(@PathVariable int a,@PathVariable int b){
	return es.getMax4(a,b);

}
@GetMapping(value="getAll1")
public List<String> getAllValue1(){
	return es.getAllValue1();
}
@GetMapping(value="getmaxsalary")
public Integer getValue2() {
	return es.getValue2();
}
@GetMapping(value="getValuemax")
public Employee getValue3() {
	return es.getValue3();
}
@GetMapping(value="get21")
public Integer get21() {
	return es.get21();
}
@GetMapping(value="get22")
public Integer get22() {
	return es.get22();
}
@GetMapping (value="get23")
public List<Employee> get23() {
	return es.get23();
}
@GetMapping (value="getSalary")
public List<Employee> getSalRange(@RequestParam Integer a,@RequestParam Integer b){
	return es.getSalRange(a, b);
}
@GetMapping(value="getMax5")
public List<Employee> getMax5(@RequestParam Integer a,@RequestParam Integer b){
	
	return es.getMax5(a,b);}
@GetMapping(value="getNameDetails/{a}")
public List<Employee>getNameDetails(@PathVariable String a)throws NameNotFoundException {
	return es.getNameDetails(a);
}
@GetMapping(value="getSalaryDetails/{a}")
public List<Employee>getSalaryDetails(@PathVariable int a)throws SalaryNotFoundException{
	return es.getSalaryDetails(a);
}
@GetMapping(value="getGenderDetails/{a}")
public List<Employee>getGenderDetails(@PathVariable String a)throws GenderNotFoundException{
	return es.getGenderDetails(a);
}
@GetMapping(value="getexperienceDetails/{a}")
public List<Employee>getexperienceDetails(@PathVariable float a) throws ExperienceNotFoundException{
	return es.getexperienceDetails(a);
}
@GetMapping(value="getidDetails/{a}")
public List<Employee>getidDetails(@PathVariable int a) throws IdNotFoundException {
	return es.getidDetails(a);
}
@GetMapping(value="getMax")
public List<Employee> getSecMax(){
	return es.getSecMax();
}


}