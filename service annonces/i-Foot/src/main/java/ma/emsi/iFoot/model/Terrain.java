package ma.emsi.iFoot.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document("terrains")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Terrain {
	@Transient
	public static final String SEQUENCE_NAME="terrain_sequence";
	
	@Id
	private int id;
	private String nom;
	private String adresse;
	private int capacity;
	
	private List<String> photos;

}
