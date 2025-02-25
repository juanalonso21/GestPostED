package org.juanalonso;

import java.util.ArrayList;

public class Profesor {
    String nif;
    String nombre;
    String departamento;
    ArrayList<Incidencia> LIncidencias = new ArrayList<>();
    //Aqui tambien tendria que tener las incidencias que ha relizado
public Profesor(String nif, String nombre, String departamento) {
    setDepartamento(departamento);
    setNif(nif);
    setNombre(nombre);
    }
    public void setNif(String nif){
        this.nif = nif;
    }
    public String getNif(){
        return this.nif;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }
    public String getDepartamento(){
        return this.departamento;
    }
    public void info(){
        System.out.println("Nif: " + this.getNif());
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Departamento: " + this.getDepartamento());
    }
}