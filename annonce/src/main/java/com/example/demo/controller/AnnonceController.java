package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Annonce;
import com.example.demo.service.AnnonceService;



@RestController
@RequestMapping("/annonces")
public class AnnonceController {
	@Autowired
	private AnnonceService annonceService;
	
	@GetMapping("/hello")
	public String getHello(){
		return "Hello Ok";
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Annonce>> getAnnonces(){
		List<Annonce> annonces=annonceService.getAnnonces();
		return new ResponseEntity<>(annonces,HttpStatus.OK);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Annonce> getAnnonce(@PathVariable("id") Long id){
		Annonce annonce=annonceService.getAnnonce(id);
		return new ResponseEntity<>(annonce,HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Annonce> addAnnonce(@RequestBody Annonce a){
		Annonce annonce=annonceService.createAnnonce(a);
		return new ResponseEntity<>(annonce,HttpStatus.CREATED);
	}

	
	@PutMapping("/update")
	public ResponseEntity<Annonce> updateAnnonce(@RequestBody Annonce a){
		Annonce annonce=annonceService.updateAnnonce(a);
		return new ResponseEntity<>(annonce,HttpStatus.OK );
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteAnnonce(@PathVariable("id") Long id){
		annonceService.deleteAnnonce(id);
		return new ResponseEntity<>(HttpStatus.OK );
	}
	

}
