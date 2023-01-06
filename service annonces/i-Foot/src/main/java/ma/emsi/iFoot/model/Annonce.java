package ma.emsi.iFoot.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document("annonces")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Annonce {
	
	@Transient
	public static final String SEQUENCE_NAME="annonce_sequence";
	
	@Id
	private int id;
	private String titre;
	private String description;
	private String ville;
	private String zone;
	private Date date;
	
	private Terrain terrain;

}
