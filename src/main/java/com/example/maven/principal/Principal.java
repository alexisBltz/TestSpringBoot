package com.example.maven.principal;

import com.example.maven.model.DatosSerie;
import com.example.maven.model.DatosTemporadas;
import com.example.maven.service.ConsumirAPI;
import com.example.maven.service.ConvierteDatos;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    private Scanner scanner = new Scanner(System.in);
    private ConsumirAPI consumir = new ConsumirAPI();
    private String URL_BASE = "http://www.omdbapi.com/?t=";
    private String API_KEY = "&apikey=4fc7c187";
    private ConvierteDatos conversor = new ConvierteDatos();

    public void muestraElMenu(){
        System.out.println("Escribe el nombre de la serie que deseas buscar");
        var nombreSerie = scanner.nextLine();

        //busca los datos generales de la serie
        var json = consumir.obtenerDatos(URL_BASE + nombreSerie.replace(" ", "+") + API_KEY);
        var datos = conversor.obtenerDatos(json, DatosSerie.class);

        //busca los datos de todas las temporadas
        List<DatosTemporadas> temporadas = new ArrayList<>();
        for (int i = 0; i < datos.totalDeTemporadas(); i++) {
            json = consumir.obtenerDatos(URL_BASE+nombreSerie.replace(" ","+")+"&Season=" +i+API_KEY);
            var datosTemporadas = conversor.obtenerDatos(json, DatosTemporadas.class);
            temporadas.add(datosTemporadas);
        }
        temporadas.forEach(System.out::println);
    }
}
