package ma.emsi.iFoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.emsi.iFoot.model.Annonce;
import ma.emsi.iFoot.model.Terrain;
import ma.emsi.iFoot.model.User;
import ma.emsi.iFoot.service.AnnonceService;
import ma.emsi.iFoot.service.TerrainService;

@RestController
@RequestMapping("/terrains")
public class TerrainController {

	@Autowired
	private TerrainService terrainService;
	
	@GetMapping("/all")
	public ResponseEntity<List<Terrain>> getTerrains(){
		List<Terrain> terrains=terrainService.getTerrains();
		return new ResponseEntity<>(terrains,HttpStatus.OK);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Terrain> getTerrain(@PathVariable("id") int id){
		Terrain terrain=terrainService.getTerrain(id);
		return new ResponseEntity<>(terrain,HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Terrain> addTerrain(@RequestBody Terrain a){
		Terrain terrain=terrainService.addTerrain(a);
		return new ResponseEntity<>(terrain,HttpStatus.CREATED);
	}

	
	@PutMapping("/update")
	public ResponseEntity<Terrain> updateTerrain(@RequestBody Terrain a){
		Terrain terrain=terrainService.updateTerrain(a);
		return new ResponseEntity<>(terrain,HttpStatus.OK );
	}
	
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteTerrain(@PathVariable("id") int id){
		terrainService.deleteTerrain(id);
		return new ResponseEntity<>(HttpStatus.OK );
	}
}
