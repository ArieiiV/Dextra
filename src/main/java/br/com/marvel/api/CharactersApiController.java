package br.com.marvel.api;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.marvel.model.Results;
import br.com.marvel.model.ResultsComicsByCharacterId;
import br.com.marvel.model.ResultsEventsByCharacterId;
import br.com.marvel.model.ResultsSeriesByCharacterId;
import br.com.marvel.model.ResultsStoriesByCharacterId;
import io.swagger.annotations.ApiParam;
@javax.annotation.Generated(value = "br.com.marvel.codegen.languages.SpringCodegen", date = "2021-07-20T00:05:39.997Z")

@Controller
public class CharactersApiController implements CharactersApi {

    private static final Logger log = LoggerFactory.getLogger(CharactersApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;
    
    @org.springframework.beans.factory.annotation.Autowired
    public CharactersApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Results> searchCharacter() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Results>(objectMapper.readValue("{\"empty\": false}", Results.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Results>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Results>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Results> searchCharacterById(@ApiParam(value = "",required=true) @PathVariable("characterId") Long characterId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Results>(objectMapper.readValue("{\"empty\": false}", Results.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Results>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Results>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ResultsComicsByCharacterId> searchComicsByCharacterId(@ApiParam(value = "",required=true) @PathVariable("characterId") Long characterId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ResultsComicsByCharacterId>(objectMapper.readValue("{\"empty\": false}", ResultsComicsByCharacterId.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ResultsComicsByCharacterId>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ResultsComicsByCharacterId>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ResultsEventsByCharacterId> searchEventsByCharacterId(@ApiParam(value = "",required=true) @PathVariable("characterId") Long characterId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ResultsEventsByCharacterId>(objectMapper.readValue("{\"empty\": false}", ResultsEventsByCharacterId.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ResultsEventsByCharacterId>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ResultsEventsByCharacterId>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ResultsSeriesByCharacterId> searchSeriesByCharacterId(@ApiParam(value = "",required=true) @PathVariable("characterId") Long characterId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ResultsSeriesByCharacterId>(objectMapper.readValue("{\"empty\": false}", ResultsSeriesByCharacterId.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ResultsSeriesByCharacterId>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ResultsSeriesByCharacterId>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ResultsStoriesByCharacterId> searchStoriesByCharacterId(@ApiParam(value = "",required=true) @PathVariable("characterId") Long characterId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ResultsStoriesByCharacterId>(objectMapper.readValue("{\"empty\": false}", ResultsStoriesByCharacterId.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ResultsStoriesByCharacterId>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ResultsStoriesByCharacterId>(HttpStatus.NOT_IMPLEMENTED);
    }

}
