package com.example.maven;

import com.example.maven.model.DatosEpisodios;
import com.example.maven.model.DatosSerie;
import com.example.maven.model.DatosTemporadas;
import com.example.maven.principal.Principal;
import com.example.maven.service.ConsumirAPI;
import com.example.maven.service.ConvierteDatos;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class MavenApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MavenApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		var consumirApi = new ConsumirAPI();
//		var json = consumirApi.obtenerDatos("http://www.omdbapi.com/?t=game+of+thrones&apikey=4fc7c187");
//		System.out.println(json);
//		ConvierteDatos conversor = new ConvierteDatos();
//		var datos = conversor.obtenerDatos(json, DatosSerie.class);
//		System.out.println(datos);
//		var json2 = consumirApi.obtenerDatos("https://www.omdbapi.com/?t=game+of+thrones&Season=1&episode=1&apikey=4fc7c187");
//		System.out.println(json2);
//		var datosEpisodios = conversor.obtenerDatos(json2, DatosEpisodios.class);
//		System.out.println(datosEpisodios);
//
//		List<DatosTemporadas> temporadas = new ArrayList<>();
//		for (int i = 0; i < datos.totalDeTemporadas(); i++) {
//			json = consumirApi.obtenerDatos("https://www.omdbapi.com/?t=game+of+thrones&Season="+i+"&apikey=4fc7c187");
//			var datosTemporadas = conversor.obtenerDatos(json, DatosTemporadas.class);
//			temporadas.add(datosTemporadas);
//		}
//		temporadas.forEach(System.out::println);

		Principal principal = new Principal();
		principal.muestraElMenu();
	}
}
