package com.pattern.demo.implementacion;

import java.util.HashMap;
import java.util.Map;

public class FabricaArtistas {
    private static final Map<String, Artista> ARTISTAS = new HashMap<>();
    private static Long Secuencia = 0L;

    public static Artista obtenerArtista(String nombre) {
        if (ARTISTAS.containsKey(nombre)) {
            return ARTISTAS.get(nombre);
        } else {
            Artista artista = new Artista(++Secuencia, nombre);
            ARTISTAS.put(nombre, artista);
            return artista;
        }
    }
}
