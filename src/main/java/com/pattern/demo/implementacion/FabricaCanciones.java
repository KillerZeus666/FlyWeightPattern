/*
 * Asignatura: Patrones de Diseño de Software 
 * Patrón Estructural - > Flyweight
 * Tipo de Clase: Java
 */
package com.pattern.demo.implementacion;

import java.util.HashMap;
import java.util.Map;


/**
 *
 * @author Fabrizio Bolaño
 */
public class FabricaCanciones {
    
    public static boolean HabilitarFlyweight = true;
    private static final Map<String,Cancion> PLAY_CANCION = new HashMap<>();
    private static Long Secuencia = 0L;
    
    public static Cancion CrearItem(String nombreCancion, String nombreArtista) {
    if (HabilitarFlyweight && PLAY_CANCION.containsKey(nombreCancion)) {
        return PLAY_CANCION.get(nombreCancion);
    } else {
        Artista artista = FabricaArtistas.obtenerArtista(nombreArtista);
        Cancion cancion = new Cancion(++Secuencia, nombreCancion, artista);
        PLAY_CANCION.put(nombreCancion, cancion);
        return cancion;
    }
}

  
}
