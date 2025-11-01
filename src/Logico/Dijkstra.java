package Logico;

import Modelo.Grafo;
import Modelo.Parada;
import Modelo.Ruta;

import java.util.List;

//Algoritmo para encontrar la ruta más corta de un origen y destino especificados en términos de distancia
public class Dijkstra {
    public List<Ruta> calcularRutaCorta(Grafo grafo, String idOrigen, String idDestino) {
        List<Parada> paradas = grafo.getParada();
        List<List<Ruta>> rutas = grafo.getRuta();

        return List.of();
    }
}
