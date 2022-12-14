package com.example.demo.model;

import java.util.List;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;


import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;

@Document(collation = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	
	@Id
	private Long id;
	private String fullname;
	private String username;
	private String password;
	private String email;
	
	

}
