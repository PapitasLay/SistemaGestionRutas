package Logico;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//Implementación del CRUD de PARADA y RUTA (Agregar, modificar y eliminar)
public class Crud {
    private List<Parada> parada; //Nodos
    private List<List<Ruta>> ruta; //Aristas

    private static Crud instancia = null;

    public Crud() {
        parada = new LinkedList<>();
        ruta = new LinkedList<>();
    }

    public List<Parada> getParada() {
        return parada;
    }

    public List<List<Ruta>> getRuta() {
        return ruta;
    }

    public static Crud getInstancia() {
        if (instancia == null) {
            instancia = new Crud();
        }
        return instancia;
    }

    //Métodos de Parada
    public boolean agregarParada(Parada p){
        int index = buscarIndexParada(p.getIdParada());
        if(index != -1) {
            parada.add(p);
            ruta.add(new LinkedList<>());
            return true;
        }
        return false;
    }

    //Para verificar si ya existe la Parada, para eliminarla o modificarla
    public int buscarIndexParada(String idParada){
        for(int i = 0; i < parada.size(); i++) {
            if(parada.get(i).getIdParada().equals(idParada)) {
                return i;
            }
        }
        return -1;
    }

    public boolean eliminarParada(String idParada){
        int index = buscarIndexParada(idParada);
        if(index != -1){
            //Eliminar parada y su lista de rutas salientes (Que la tenían como origen)
            parada.remove(index);
            ruta.remove(index);

            //Eliminar rutas que tenían a esta parada como destino
            for(List<Ruta> lista : ruta) {
                lista.removeIf(r -> r.getDestinoRuta().equals(idParada));
            }
            return true;
        }
        return false;
    }

    public boolean modificarParada(String idParada, Parada nuevaParada){
        int index = buscarIndexParada(idParada);
        if(index != -1){
            parada.set(index, nuevaParada);
            return true;
        }
        return false;
    }

    //Métodos de Ruta
    public boolean agregarRuta(Ruta r){
        //Verificar antes si existen las Paradas antes de agregar/crear una Ruta
        int origen = buscarIndexParada(r.getOrigenRuta());
        int destino = buscarIndexParada(r.getDestinoRuta());

        if(origen != -1 && destino != -1) {
            List<Ruta> listaRutas = ruta.get(origen);
            if(buscarIndexRuta(listaRutas, r.getDestinoRuta()) == -1) {
                listaRutas.add(r);
                return true;
            }
        }
        return false; //Por si no existen las paradas
    }

    //Para verificar si ya existe la Ruta y para modificarla
    public int buscarIndexRuta(List<Ruta> listaRutas, String idDestinoRuta){
        for(int i = 0; i < listaRutas.size(); i++) {
            if(listaRutas.get(i).getDestinoRuta().equals(idDestinoRuta)) {
                return i;
            }
        }
        return -1;
    }

    public boolean eliminarRuta(String idOrigenParada, String idDestinoParada){
        int index = buscarIndexParada(idOrigenParada);
        if(index != -1){
            return ruta.get(index).removeIf(r -> r.getDestinoRuta().equals(idDestinoParada));
        }
        return false;
    }

    public boolean modificarRuta(String idOrigenParada, String idDestinoParada, Ruta nuevaRuta){
        int index = buscarIndexParada(idOrigenParada);
        if(index != -1){
            List<Ruta> listaRutas = ruta.get(index);
            for(int i = 0; i < listaRutas.size(); i++) {
                if(listaRutas.get(i).getDestinoRuta().equals(idDestinoParada)) {
                    listaRutas.set(i, nuevaRuta);
                    return true;
                }
            }
        }
        return false;
    }
}




