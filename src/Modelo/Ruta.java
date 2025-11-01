package Modelo;

public class Ruta {
    private String idRuta;
    private String nombreRuta;
    private int distanciaRuta;
    private float costoRuta;
    private int cantidadTransbordo;
    private int tiempoViaje;
    private String origenRuta;
    private String destinoRuta;

    public Ruta(String idRuta, String nombreRuta, int distanciaRuta, float costoRuta, int cantidadTransbordo, int tiempoViaje, String origenRuta, String destinoRuta) {
        this.idRuta = idRuta;
        this.nombreRuta = nombreRuta;
        this.distanciaRuta = distanciaRuta;
        this.costoRuta = costoRuta;
        this.cantidadTransbordo = cantidadTransbordo;
        this.tiempoViaje = tiempoViaje;
        this.origenRuta = origenRuta;
        this.destinoRuta = destinoRuta;
    }

    public String getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(String idRuta) {
        this.idRuta = idRuta;
    }

    public String getNombreRuta() {
        return nombreRuta;
    }

    public void setNombreRuta(String nombreRuta) {
        this.nombreRuta = nombreRuta;
    }

    public int getDistanciaRuta() {
        return distanciaRuta;
    }

    public void setDistanciaRuta(int distanciaRuta) {
        this.distanciaRuta = distanciaRuta;
    }

    public float getCostoRuta() {
        return costoRuta;
    }

    public void setCostoRuta(float costoRuta) {
        this.costoRuta = costoRuta;
    }

    public int getCantidadTransbordo() {
        return cantidadTransbordo;
    }

    public void setCantidadTransbordo(int cantidadTransbordo) {
        this.cantidadTransbordo = cantidadTransbordo;
    }

    public int getTiempoViaje() {
        return tiempoViaje;
    }

    public void setTiempoViaje(int tiempoViaje) {
        this.tiempoViaje = tiempoViaje;
    }

    public String getOrigenRuta() {
        return origenRuta;
    }

    public void setOrigenRuta(String origenRuta) {
        this.origenRuta = origenRuta;
    }

    public String getDestinoRuta() {
        return destinoRuta;
    }

    public void setDestinoRuta(String destinoRuta) {
        this.destinoRuta = destinoRuta;
    }
}