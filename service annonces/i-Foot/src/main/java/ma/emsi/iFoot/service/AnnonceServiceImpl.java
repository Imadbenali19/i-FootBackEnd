package ma.emsi.iFoot.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.emsi.iFoot.model.Annonce;
import ma.emsi.iFoot.model.Demande;
import ma.emsi.iFoot.model.User;
import ma.emsi.iFoot.repository.AnnonceRepository;
import ma.emsi.iFoot.repository.DemandeRepository;

@Service
public class AnnonceServiceImpl implements AnnonceService {

	@Autowired
	private AnnonceRepository annonceRepository;
	@Autowired
	private DemandeRepository demandeRepository;
	
	@Override
	public Annonce createAnnonce(Annonce annonce) {
		return annonceRepository.save(annonce);
	}

	@Override
	public Annonce updateAnnonce(Annonce annonce) {
		Annonce a=annonceRepository.findById(annonce.getId()).get();;
		if(a!=null) {
			a.setDescription(annonce.getDescription());
			a.setVille(annonce.getVille());
			a.setZone(annonce.getZone());
			a.setDate(annonce.getDate());
			a.setTitre(annonce.getTitre());
			return annonceRepository.save(a);
		}
		return null;
	}

	@Override
	public void deleteAnnonce(Long id) {
		annonceRepository.deleteById(id);
	}

	@Override
	public Annonce getAnnonce(Long id) {
		return annonceRepository.findById(id).get();
	}

	@Override
	public List<Annonce> getAnnonces() {
		return annonceRepository.findAll();
	}

	@Override
	public boolean requestJoinAnnonce(User user, Annonce annonce) {
		Demande demande=new Demande();
		demande.setAnnonce(annonce);
		demande.setUser(user);
		demande.setEtat("Traitée");
		demande.setDate(new Date());
		try {
			demandeRepository.save(demande);
			return true;
		}catch(Exception e){
			System.out.println("Impossible de créer la demande!");
			System.out.println(e.getMessage());
			e.printStackTrace();
			return false;
		}
		
	}

	

	

}
