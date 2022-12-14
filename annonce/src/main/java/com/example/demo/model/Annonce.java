package com.example.demo.model;

import java.util.Date;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collation = "annonces")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Annonce {
	@Id
	private Long id;
	private String titre;
	private String description;
	private String ville;
	private String zone;
	private Date date;

}
