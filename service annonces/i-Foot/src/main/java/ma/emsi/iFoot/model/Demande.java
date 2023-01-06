package ma.emsi.iFoot.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document("demandes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Demande {
	
	@Transient
	public static final String SEQUENCE_NAME="demande_sequence";
	
	@Id
	private int id;
	private String etat;
	private Date date;
	
	
	private Annonce annonce;
	private User user;

}
