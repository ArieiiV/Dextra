package br.com.marvel.resource;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.marvel.model.entity.Character;
import br.com.marvel.model.entity.Comic;
import br.com.marvel.model.entity.Event;
import br.com.marvel.model.entity.Serie;
import br.com.marvel.model.entity.Story;
import br.com.marvel.repository.CharactersRepository;

@RestController
@RequestMapping("/characters")
public class CharacterResource {

	@PersistenceContext
	EntityManager entityManager;

	@Autowired
	private CharactersRepository charactersRepository;

	@GetMapping
	public List<Character> retrieveCharacters() {
		return charactersRepository.findAll();
	}

	@RequestMapping(value = "/{characterId}", method = RequestMethod.GET)
	public Character retrieveCharactersById(@PathVariable Long characterId) {
		Character findById = charactersRepository.findById(characterId);

		return findById;
	}

	@RequestMapping(value = "/{characterId}/comics", method = RequestMethod.GET)
	public ResponseEntity<ArrayList<Comic>> retrieveComics(@PathVariable Long characterId) {
		ArrayList<Comic> comic = charactersRepository.findComicsByCharacterId(characterId);
		if (comic.isEmpty()) {
			return ResponseEntity.ok(new ArrayList<Comic>());
		}
		return ResponseEntity.ok(comic);
	}

	@RequestMapping(value = "/{characterId}/events", method = RequestMethod.GET)
	public ResponseEntity<ArrayList<Event>> retrieveEvents(@PathVariable Long characterId) {
		ArrayList<Event> event = charactersRepository.findEventsByCharacterId(characterId);
		if (event.isEmpty()) {
			return ResponseEntity.ok(new ArrayList<Event>());
		}
		return ResponseEntity.ok(event);
	}

	@RequestMapping(value = "/{characterId}/series", method = RequestMethod.GET)
	public ResponseEntity<ArrayList<Serie>> retrieveSeries(@PathVariable Long characterId) {
		ArrayList<Serie> serie = charactersRepository.findSeriesByCharacterId(characterId);
		if (serie.isEmpty()) {
			return ResponseEntity.ok(new ArrayList<Serie>());
		}
		return ResponseEntity.ok(serie);
	}

	@RequestMapping(value = "/{characterId}/stories", method = RequestMethod.GET)
	public ResponseEntity<ArrayList<Story>> retrieveStories(@PathVariable Long characterId) {
		ArrayList<Story> story = charactersRepository.findStoriesByCharacterId(characterId);
		if (story.isEmpty()) {
			return ResponseEntity.ok(new ArrayList<Story>());
		}
		return ResponseEntity.ok(story);
	}

}
