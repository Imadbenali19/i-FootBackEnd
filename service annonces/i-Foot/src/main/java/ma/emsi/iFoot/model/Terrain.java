package ma.emsi.iFoot.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document("terrains")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Terrain {
	@Id
	private Long id;
	private String nom;
	private String adresse;
	private int capacity;
	
	private List<Photo> photos;

}
