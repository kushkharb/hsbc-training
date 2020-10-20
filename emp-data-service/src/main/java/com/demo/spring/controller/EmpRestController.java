package com.demo.spring.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.spring.data.EmpDb;
import com.hsbc.tr.app.entity.Emp;


@RestController
@CrossOrigin
public class EmpRestController {

	@Autowired
	private EmpDb datastore;
	
//	@GetMapping(path="/emp/find/{id}",produces =MediaType.APPLICATION_JSON_VALUE)
	@RequestMapping(path="/emp/find/{id}",method = RequestMethod.GET,produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity getEmpDetails(@PathVariable("id") int id,HttpServletRequest request) {
		System.out.println("Request Served By"+request.getLocalAddr()+":"+request.getLocalPort());
		if(datastore.getDb().containsKey(id)) {
			return  ResponseEntity.ok(datastore.getDb().get(id)) ;
		}else {
			return ResponseEntity.ok("emp not found");
		}
	}
	
	@GetMapping(path="/emp",produces =MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Emp>> listAll() {
		ArrayList<Emp> empList=new ArrayList<>(datastore.getDb().values());
			return  ResponseEntity.ok(empList) ;
	}
	
	@PostMapping(path = "/emp/save",produces = MediaType.TEXT_PLAIN_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> saveEmp(@RequestBody Emp e){
		if(EmpDb.getDb().containsKey(e.getEmpId())) {
			return ResponseEntity.ok("emp already exist");
		}else {
			EmpDb.getDb().put(e.getEmpId(),e);
			return ResponseEntity.ok("emp saved successfully");
		}
	}
	@PutMapping(path = "/emp/update",produces = MediaType.TEXT_PLAIN_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> updateEmp(@RequestBody Emp e){
		if(EmpDb.getDb().containsKey(e.getEmpId())) {
			EmpDb.getDb().put(e.getEmpId(),e);
			return ResponseEntity.ok("emp updated...");
		}else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("emp not found");
		}
	}
	@DeleteMapping(path = "/emp/delete",produces = MediaType.TEXT_PLAIN_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> deleteEmp(@RequestParam("empid") int id){
		if(EmpDb.getDb().containsKey(id)) {
			EmpDb.getDb().remove(id);
			return ResponseEntity.ok("emp deleted");
		}else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("emp not found");
		}
	}
	
}