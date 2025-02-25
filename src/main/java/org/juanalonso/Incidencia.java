package org.juanalonso;

public class Incidencia {
    int codigo;
    String titulo;
    Aparato aparato;
    Profesor profesor;
    String prioridad = "media";
    String estado; //Esta pediente podria estar iniciada como Pendiente pero el texto indica que empiece sin incializar
    Double precio;
    String resolucion;
    
    //Aqui voy a hacer 3 constructores 1 resolucion otro con el estado otro sin el estado.
    public Incidencia(int codigo, String titulo, Aparato aparato, Profesor profesor) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.aparato = aparato;
        this.profesor = profesor;
    }
    public Incidencia(String estado, double precio){
        this.estado = estado;
        this.precio = precio;
        this.resolucion = estado;//Ahora mismo pongo para que la resolucion sea el estado ya que contienen lo mismo
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public int getCodigo(){
        return this.codigo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public void setAparato(Aparato aparato){
        this.aparato = aparato;
    }
    public Aparato getAparato(){
        return this.aparato;
    }
    public void setProfesor(Profesor profesor){
        this.profesor = profesor;
    }
    public Profesor getProfesor(){
        return this.profesor;
    }
    public void setPrioridad(String prioridad){
        this.prioridad = prioridad;
    }
    public String getPrioridad(){
        return this.prioridad;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }
    public String getEstado(){
        return this.estado;
    }
    public void setPrecio(Double precio){
        this.precio = precio;
    }
    public Double getPrecio(){
        return this.precio;
    }
    public void setResolucion(String resolucion){
        this.resolucion = resolucion;
    }
    public String getResolucion(){
        return this.resolucion;
    }
    public void info(){
        System.out.println("Codigo: " +" "+ this.codigo +" "+ "Titulo: " + this.titulo +" "+ "Aparato: " + this.aparato.getcodigo() + "Profesor: " + this.profesor.getNombre() +" "+ "Prioridad: " + this.prioridad +" "+ "Estado: " + this.estado +" "+ "Precio: " + this.precio +" "+ "Resolucion: " + this.resolucion);
    }
    }


