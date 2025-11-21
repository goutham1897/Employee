package com.employee.empDao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.employee.empEntity.Employee;
import com.employee.empRepository.EmpRepository;

@Repository
public class EmpDao {
	
	@Autowired
	EmpRepository er;
	
	public String postData(List<Employee> e) {
		er.saveAll(e);
		return "Save Successful";
	}
	public String postData1(Employee e) {
		er.save(e);
		return "Save Successful";
	}
	public Employee getData(int a) {
		Employee e=er.findById(a).get();
				return e;
				}
	public List<Employee>getData1(){
		return er.findAll();
		
	}
	public String updateDetail(Employee e,Integer a) {
		Employee x=er.findById(a).get();
		x.setName(e.getName());
		x.setSalary(e.getSalary());
		x.setExperience(e.getExperience());
		x.setGender(e.getGender());
		er.save(x);
		return "Update successfully";
	}
	public String patchUpdate(Employee e,Integer a) {
		Employee x=er.findById(a).get();
		x.setName(e.getName());
		return "Update Successfully";
	}
	public String deleteName(Integer a) {
		er.deleteById(a);
		return "Delete Successfully";
	}
	public Integer getMax() {
		return er.getMax();
	}
	public Employee getMax1() {
		return er.getMax1();
	}
	public List<Employee>getMax2(){
		return er.getMax2();
	}
	public List<Employee> getMax3(int a){
		
		return er.getMax3(a);
	}
	public List<Employee> getMax4(int a,int b){
		return er.getMax4(a,b);
	}
	public List<Employee> getAllvalue(){
		return er.getAllValue();
	}
	public List<String> getAllValue1(){
		return er.getAllValue1();
	}
	public Integer getValue2() {
		return er.getValue2();
	}
	public Employee getValue3() {
		return er.getValue3();
	}
	public Integer get21() {
		return er.get21();
	}
	public Integer get22() {
		return er.get22();
	}
	public List<Employee> get23() {
		return er.get23();
	}
	public List<Employee> getSalRange(Integer a,Integer b){
		return er.getSalRange(a, b);
	}
	public List<Employee>getMax5(Integer a,Integer b){
		return er.getMax5(a,b);
	}
	
	
	public List<Employee>getNameDetails(String a){
		return er.getNameDetails(a);
	}
	public List<Employee>getSalaryDetails(int a){
		return er.getSalaryDetails(a);
	}
	public List<Employee>getGenderDetails(String a){
		return er.getGenderDetails(a);
	}
	public List<Employee>getExperienceDetails(float a){
		return er.getexperienceDetails(a);
	}
	public List<Employee>getidDetails(int a){
		return er.getidDetails(a);
	}
	public Employee getDatas(int a) {
		Employee e=er.findById(a).get();
				return e;
	}

}



