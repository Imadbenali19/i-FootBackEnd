package com.example.demo.model;

import java.util.Date;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collation = "demandes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Demande {
	
	@Id
	private Long id;
	private String etat;
	private Date date;
	
	private User user;
	private Annonce annonce;

}
