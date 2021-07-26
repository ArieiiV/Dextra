package br.com.marvel.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.marvel.model.entity.Character;
import br.com.marvel.model.entity.Comic;
import br.com.marvel.model.entity.Event;
import br.com.marvel.model.entity.Serie;
import br.com.marvel.model.entity.Story;

public interface CharactersRepository extends JpaRepository<Character, Long> {
	
	public Character findById(Long id);
	
	@Query("SELECT ce FROM Character c INNER JOIN c.comics ce WHERE c.id = ?")
	public ArrayList<Comic> findComicsByCharacterId(Long characterId);
	
	
	@Query("SELECT evt FROM Character c INNER JOIN c.events evt WHERE c.id = ?1")
	public ArrayList<Event> findEventsByCharacterId(Long characterId);

	@Query("SELECT se FROM Character c INNER JOIN c.series se WHERE c.id = ?1")
	public ArrayList<Serie> findSeriesByCharacterId(Long characterId);
	
	@Query("SELECT st FROM Character c INNER JOIN c.stories st WHERE c.id = ?1")
	public ArrayList<Story> findStoriesByCharacterId(Long characterId);
} 
