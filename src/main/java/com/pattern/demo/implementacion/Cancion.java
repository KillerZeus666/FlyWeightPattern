package com.pattern.demo.implementacion;

public class Cancion {
    private Long id;
    private String NombreCancion;
    private Artista artista;
    private byte[] Cancion = new byte[1000000];

    public Cancion(Long id, String NombreCancion, Artista artista) {
        this.id = id;
        this.NombreCancion = NombreCancion;
        this.artista = artista;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        return "Canción{" + "id=" + id + ", Tema=" + NombreCancion + ", Artista=" + artista.getNombre() + '}';
    }
}
