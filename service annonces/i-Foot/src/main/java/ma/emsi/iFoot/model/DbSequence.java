package ma.emsi.iFoot.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection="db_sequences")
@Data
public class DbSequence {

	@jakarta.persistence.Id
	private String id;
	
	private int seq;
	
	
	
	
	
}
