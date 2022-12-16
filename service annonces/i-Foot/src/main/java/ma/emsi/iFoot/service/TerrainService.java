package ma.emsi.iFoot.service;

import java.util.List;

import ma.emsi.iFoot.model.Terrain;

public interface TerrainService {

	Terrain addTerrain(Terrain t);
	Terrain updateTerrain(Terrain t);
	void deleteTerrain(Long id);
	List<Terrain> getTerrains();
}
