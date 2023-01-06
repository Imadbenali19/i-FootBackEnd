package ma.emsi.iFoot.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document("roles")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role {

	@Transient
	public static final String SEQUENCE_NAME="role_sequence";
	
	@jakarta.persistence.Id
	private int id;
	private String nom;
}
