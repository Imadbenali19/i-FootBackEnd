package ma.emsi.iFoot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ma.emsi.iFoot.model.Annonce;
import ma.emsi.iFoot.model.User;
@Service
public interface AnnonceService {

	Annonce createAnnonce(Annonce annonce);
	Annonce updateAnnonce(Annonce annonce);
	void deleteAnnonce(int id);
	Annonce getAnnonce(int id);
	List<Annonce> getAnnonces();
	
	boolean requestJoinAnnonce(User user, Annonce annonce);
}
