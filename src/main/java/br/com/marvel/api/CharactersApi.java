/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.21).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package br.com.marvel.api;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.marvel.model.Results;
import br.com.marvel.model.ResultsComicsByCharacterId;
import br.com.marvel.model.ResultsEventsByCharacterId;
import br.com.marvel.model.ResultsSeriesByCharacterId;
import br.com.marvel.model.ResultsStoriesByCharacterId;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
@javax.annotation.Generated(value = "br.com.marvel.codegen.languages.SpringCodegen", date = "2021-07-20T00:05:39.997Z")

@Validated
@Api(value = "characters teste", description = "the characters API")
public interface CharactersApi {

    @ApiOperation(value = "Retrieve all Characters.", nickname = "searchCharacter", notes = "", response = Results.class, tags={ "characters", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Results.class),
        @ApiResponse(code = 400, message = "Bad Request"),
        @ApiResponse(code = 404, message = "Not Found."),
        @ApiResponse(code = 405, message = "Method Not Allowed."),
        @ApiResponse(code = 408, message = "Request Timeout"),
        @ApiResponse(code = 500, message = "Internal Server Error.") })
    @RequestMapping(value = "/characters", 
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET) 
    ResponseEntity<Results> searchCharacter();


    @ApiOperation(value = "Retrieve all Characters by ID.", nickname = "searchCharacterById", notes = "Numeric ID of the user to get", response = Results.class, tags={ "characters", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Results.class),
        @ApiResponse(code = 400, message = "Bad Request"),
        @ApiResponse(code = 404, message = "Not Found."),
        @ApiResponse(code = 405, message = "Method Not Allowed."),
        @ApiResponse(code = 408, message = "Request Timeout"),
        @ApiResponse(code = 500, message = "Internal Server Error.") })
    @RequestMapping(value = "/characters/{characterId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<Results> searchCharacterById(@ApiParam(value = "",required=true) @PathVariable("characterId") Long characterId);


    @ApiOperation(value = "Retrieve all comics of a specific character by his ID.", nickname = "searchComicsByCharacterId", notes = "Numeric ID of the user to get", response = ResultsComicsByCharacterId.class, tags={ "characters", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ResultsComicsByCharacterId.class),
        @ApiResponse(code = 400, message = "Bad Request"),
        @ApiResponse(code = 404, message = "Not Found."),
        @ApiResponse(code = 405, message = "Method Not Allowed."),
        @ApiResponse(code = 408, message = "Request Timeout"),
        @ApiResponse(code = 500, message = "Internal Server Error.") })
    @RequestMapping(value = "/characters/{characterId}/comics",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<ResultsComicsByCharacterId> searchComicsByCharacterId(@ApiParam(value = "",required=true) @PathVariable("characterId") Long characterId);


    @ApiOperation(value = "Retrieve all events of a specific character by his ID.", nickname = "searchEventsByCharacterId", notes = "Numeric ID of the user to get", response = ResultsEventsByCharacterId.class, tags={ "characters", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ResultsEventsByCharacterId.class),
        @ApiResponse(code = 400, message = "Bad Request"),
        @ApiResponse(code = 404, message = "Not Found."),
        @ApiResponse(code = 405, message = "Method Not Allowed."),
        @ApiResponse(code = 408, message = "Request Timeout"),
        @ApiResponse(code = 500, message = "Internal Server Error.") })
    @RequestMapping(value = "/characters/{characterId}/events",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<ResultsEventsByCharacterId> searchEventsByCharacterId(@ApiParam(value = "",required=true) @PathVariable("characterId") Long characterId);


    @ApiOperation(value = "Retrieve all series of a specific character by his ID.", nickname = "searchSeriesByCharacterId", notes = "Numeric ID of the user to get", response = ResultsSeriesByCharacterId.class, tags={ "characters", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ResultsSeriesByCharacterId.class),
        @ApiResponse(code = 400, message = "Bad Request"),
        @ApiResponse(code = 404, message = "Not Found."),
        @ApiResponse(code = 405, message = "Method Not Allowed."),
        @ApiResponse(code = 408, message = "Request Timeout"),
        @ApiResponse(code = 500, message = "Internal Server Error.") })
    @RequestMapping(value = "/characters/{characterId}/series",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<ResultsSeriesByCharacterId> searchSeriesByCharacterId(@ApiParam(value = "",required=true) @PathVariable("characterId") Long characterId);


    @ApiOperation(value = "Retrieve all stories of a specific character by his ID.", nickname = "searchStoriesByCharacterId", notes = "Numeric ID of the user to get", response = ResultsStoriesByCharacterId.class, tags={ "characters", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ResultsStoriesByCharacterId.class),
        @ApiResponse(code = 400, message = "Bad Request"),
        @ApiResponse(code = 404, message = "Not Found."),
        @ApiResponse(code = 405, message = "Method Not Allowed."),
        @ApiResponse(code = 408, message = "Request Timeout"),
        @ApiResponse(code = 500, message = "Internal Server Error.") })
    @RequestMapping(value = "/characters/{characterId}/stories",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<ResultsStoriesByCharacterId> searchStoriesByCharacterId(@ApiParam(value = "",required=true) @PathVariable("characterId") Long characterId);

}