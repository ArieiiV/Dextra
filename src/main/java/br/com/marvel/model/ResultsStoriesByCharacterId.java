package br.com.marvel.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ResultsStoriesByCharacterId
 */
@Validated
@javax.annotation.Generated(value = "br.com.marvel.codegen.languages.SpringCodegen", date = "2021-07-20T00:05:39.997Z")


public class ResultsStoriesByCharacterId   {
  @JsonProperty("results")
  @Valid
  private List<CharactersIdStroiesResponse> results = null;

  public ResultsStoriesByCharacterId results(List<CharactersIdStroiesResponse> results) {
    this.results = results;
    return this;
  }

  public ResultsStoriesByCharacterId addResultsItem(CharactersIdStroiesResponse resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<CharactersIdStroiesResponse>();
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

  public List<CharactersIdStroiesResponse> getResults() {
    return results;
  }

  public void setResults(List<CharactersIdStroiesResponse> results) {
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
    ResultsStoriesByCharacterId resultsStoriesByCharacterId = (ResultsStoriesByCharacterId) o;
    return Objects.equals(this.results, resultsStoriesByCharacterId.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultsStoriesByCharacterId {\n");
    
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

