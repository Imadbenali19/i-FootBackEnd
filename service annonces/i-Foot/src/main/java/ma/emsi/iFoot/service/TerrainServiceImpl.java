package ma.emsi.iFoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.emsi.iFoot.model.Annonce;
import ma.emsi.iFoot.model.Terrain;
import ma.emsi.iFoot.repository.TerrainRepository;

@Service
public class TerrainServiceImpl implements TerrainService {

	@Autowired
	private TerrainRepository terrainRepository;
	
	@Autowired
	private SequenceGeneratorService sequenceGeneratorService;
	
	@Override
	public Terrain addTerrain(Terrain t) {
		t.setId(sequenceGeneratorService.getSequenceNumber(Terrain.SEQUENCE_NAME));
		return terrainRepository.save(t);
	}

	@Override
	public Terrain updateTerrain(Terrain t) {
		Terrain a=terrainRepository.findById(t.getId()).get();;
		if(a!=null) {
			a.setAdresse(t.getAdresse());
			a.setCapacity(t.getCapacity());
			a.setNom(t.getNom());
		
			
			return terrainRepository.save(a);
		}
		return null;
	}

	@Override
	public void deleteTerrain(int id) {
		terrainRepository.delete(terrainRepository.findById(id).get());
		
	}

	@Override
	public List<Terrain> getTerrains() {
		return terrainRepository.findAll();
	}

	@Override
	public Terrain getTerrain(int id) {
		return terrainRepository.findById(id).get();
	}

}
