package com.example.demo.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collation = "terrains")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Terrain {
	
	private Long id;
	private String nom;
	private String adresse;
	private int capacity;

}
