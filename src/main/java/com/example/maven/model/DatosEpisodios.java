package com.example.maven.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosEpisodios(
        @JsonAlias("Title") String titulo,
        @JsonAlias("Episode") Integer episodio,
        @JsonAlias("imdbRating") String evaluacion,
        @JsonAlias("Relesead") String fechaDeLanzamiento
) {

}
