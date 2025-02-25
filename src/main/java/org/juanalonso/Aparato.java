package org.juanalonso;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Aparato {
    String codigo;
    String tipo;
    String aula;
    Boolean estado = true;  
    ArrayList<Incidencia> LIncidencias = new ArrayList<>();
    //tendria que tener tambien incidencias
    public Aparato(String codigo, String tipo, String aula) {
       setcodigo(codigo);
       setestado(estado);
        settipo(tipo);
    }
    public void setcodigo (String codigo){
        this.codigo = codigo;
    }
    public String getcodigo(){
        return this.codigo;
    }
    public void settipo (String tipo){
        this.tipo = tipo;
    }
    public String gettipo(){
        return this.tipo;
    }
    public void setaula (String aula){
        this.aula = aula;
    }
    public String getaula(){
        return this.aula;
    }
    public void setestado (Boolean estado){
        this.estado = estado;
    }
    public Boolean getestado(){
        return this.estado;
    }

}
