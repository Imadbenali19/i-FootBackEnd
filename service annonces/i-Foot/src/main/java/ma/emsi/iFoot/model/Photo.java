package ma.emsi.iFoot.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document("photos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Photo {
	@Id
	private Long id;
	private String url;
}
