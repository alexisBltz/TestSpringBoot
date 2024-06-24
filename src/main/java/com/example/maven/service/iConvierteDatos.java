package com.example.maven.service;

public interface iConvierteDatos {
    <T> T obtenerDatos(String json, Class<T> clase);
}
