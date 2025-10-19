package Logico;

public class Parada {
    private String idParada;
    private String nombreParada;
    private String direccionParada;
    private String tipoTransporte;
    private String estadoParada; //Visitada o no visitada

    public Parada(String estadoParada, String direccionParada, String tipoTransporte, String nombreParada, String idParada) {
        this.estadoParada = estadoParada;
        this.direccionParada = direccionParada;
        this.tipoTransporte = tipoTransporte;
        this.nombreParada = nombreParada;
        this.idParada = idParada;
    }

    public String getIdParada() {
        return idParada;
    }

    public void setIdParada(String idParada) {
        this.idParada = idParada;
    }

    public String getNombreParada() {
        return nombreParada;
    }

    public void setNombreParada(String nombreParada) {
        this.nombreParada = nombreParada;
    }

    public String getDireccionParada() {
        return direccionParada;
    }

    public void setDireccionParada(String direccionParada) {
        this.direccionParada = direccionParada;
    }

    public String getTipoTransporte() {
        return tipoTransporte;
    }

    public void setTipoTransporte(String tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

    public String getEstadoParada() {
        return estadoParada;
    }

    public void setEstadoParada(String estadoParada) {
        this.estadoParada = estadoParada;
    }
}