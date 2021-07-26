package br.com.marvel.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ResultsEventsByCharacterId
 */
@Validated
@javax.annotation.Generated(value = "br.com.marvel.codegen.languages.SpringCodegen", date = "2021-07-20T00:05:39.997Z")


public class ResultsEventsByCharacterId   {
  @JsonProperty("results")
  @Valid
  private List<CharactersIdEventsResponse> results = null;

  public ResultsEventsByCharacterId results(List<CharactersIdEventsResponse> results) {
    this.results = results;
    return this;
  }

  public ResultsEventsByCharacterId addResultsItem(CharactersIdEventsResponse resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<CharactersIdEventsResponse>();
    }
    this.results.add(resultsItem);
    return this;
  }

  /**
   * Get results
   * @return results
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<CharactersIdEventsResponse> getResults() {
    return results;
  }

  public void setResults(List<CharactersIdEventsResponse> results) {
    this.results = results;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResultsEventsByCharacterId resultsEventsByCharacterId = (ResultsEventsByCharacterId) o;
    return Objects.equals(this.results, resultsEventsByCharacterId.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultsEventsByCharacterId {\n");
    
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

