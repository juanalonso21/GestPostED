package org.juanalonso;

import java.util.ArrayList;
import java.util.Scanner;

public class GesTic {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Profesor> LProfesores = new ArrayList<Profesor>();
    static ArrayList<Aparato> LAparatos = new ArrayList<Aparato>();
    static ArrayList<Incidencia> LIncidencias = new ArrayList<Incidencia>();
    
        public static void main(String[] args) {
            while (true) {
                menu();
            }
        }
    
        public static void menu() {
            System.out.println("1. Cargar datos");
            System.out.println("2. Nueva incidencia");
            System.out.println("3. Resolver incidencia");
            System.out.println("4. Listar incidencias");
            System.out.println("5. Listar incidencias Aparato");
            System.out.println("6. Salir");
            System.out.println("Introduce:");
            int opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    loadData();
                    break;
                case 2:
                    nuevaIncidencia();
                    break;
                 case 3:
                 resolverIncidencia();
                 break;
                 case 4:
                 listarIncidencias();
                 break;
                 case 5:
                 listarIncidenciasAparato();
                 break;
                case 6:
                    System.exit(0);
                    break;
                 default:
                    System.out.println("Opcion no valida");
                     break;
            }
        }
    
        public static void loadData() {
            LProfesores.add(new Profesor("123A", "Ana", "MAT"));
            LProfesores.add(new Profesor("123B", "Antonio", "TEC"));
            LProfesores.add(new Profesor("123C", "Maria", "EFI"));
            LProfesores.add(new Profesor("123D", "Juan", "MAT"));
            LProfesores.add(new Profesor("123E", "Claudia", "TIC"));
            // ahora hago el load de aparatos
            LAparatos.add(new Aparato("PRA7", "Proyector", "A7"));
            LAparatos.add(new Aparato("PIZA7", "Pizarra Digital", "A7"));
            LAparatos.add(new Aparato("ORA7", "Ordenador", "A7"));
            LAparatos.add(new Aparato("ORA8", "Ordenador", "A8"));
            LAparatos.add(new Aparato("PRA8", "Proyector", "A8"));
            LAparatos.add(new Aparato("PRA9", "Proyector", "A9"));
            LAparatos.add(new Aparato("PIZA9", "Pizarra Digital", "A9"));
            LAparatos.add(new Aparato("ORA9", "Ordenador", "A9"));
            System.out.println("Carga realizada correctamente");
            imprimirProfesores();
        }
    
        public static void nuevaIncidencia() {
            // Falta ver el tema de profesores y objetos
            System.out.println("Introduce el codigo de la incidencia");
            int codigo = sc.nextInt();
            sc.nextLine();  
            System.out.println("Introduce el titulo de la incidencia");
            String titulo = sc.nextLine();
            System.out.println("Introduce el codigo del aparato de la incidencia");
            Aparato aparato = getAparato(sc.nextLine());
            if (aparato == null) {
                System.out.println("No existe el aparato");
                return;
            }
            System.out.println("Introduce el nif del profesor de la incidencia");
            Profesor profesor = getProfesor(sc.nextLine());
            if (profesor == null) {
                System.out.println("No existe el profesor");
                return;
            }
            aparato.setestado(false);
            Incidencia incidencia = new Incidencia(codigo, titulo, aparato, profesor);
            profesor.LIncidencias.add(incidencia);
            aparato.LIncidencias.add(incidencia);
            LIncidencias.add(incidencia);
            System.out.println("Incidencia creada correctamente");
        }
    
        public static Aparato getAparato(String codigo) {
            Aparato aparatoTemporal = new Aparato(null, null, null);
            for (Aparato aparato : GesTic.LAparatos) {
                if (aparato.getcodigo().equals(codigo)) {
                    aparatoTemporal = aparato;
                }
            }
            if(aparatoTemporal.codigo ==null){
                return null;
            }
            else{
                return aparatoTemporal;
            }
    
        }
    
        public static Profesor getProfesor(String nif) {
            Profesor profesorTemporal = new Profesor(null, null, null);
            for (Profesor profesor : GesTic.LProfesores) {
                if (profesor.getNif().equals(nif)) {
                    return profesor;
                }
            }
            if(profesorTemporal ==null){
                return null;
            }
            else{
                return profesorTemporal;
            }
        }
        public static void resolverIncidencia(){
            System.out.println("Introduce el codigo de la incidencia");
            int codigo = sc.nextInt();
            sc.nextLine();
            System.out.println("Introduce el precio:");
            Double precio = sc.nextDouble();
            for (Incidencia incidencia : LIncidencias) {
            if (incidencia.getCodigo() == codigo) {
               incidencia.setEstado("Resuelta");
               incidencia.setResolucion("Resuelta");
               incidencia.setPrecio(precio);
            }
            else{
                System.out.println("No existe la incidencia");
            }
        }
    }
    public static void listarIncidencias(){
        for (Incidencia incidencia : LIncidencias) {
            incidencia.info();
        }
    }

    public static void imprimirProfesores(){
        for (Profesor profesor : LProfesores) {
            profesor.info();
        }
    }
    public static void listarIncidenciasAparato(){
        System.out.println("Introduce el codigo del aparato");
        String codigo = sc.nextLine();
        for (Aparato aparato : LAparatos) {
            if (aparato.getcodigo().equals(codigo)) {
                for(Incidencia incidencia : aparato.LIncidencias){
                    incidencia.info();
                }
            }

        }
    }
    // public static void listarIncidenciasProfesor(){
    //     System.out.println("Introduce el nif del profesor");
    //     String codigo = sc.nextLine();
    //     for (Aparato aparato : LAparatos) {
    //         if (aparato.getcodigo().equals(codigo)) {
    //             for(Incidencia incidencia : aparato.LIncidencias){
    //                 incidencia.info();
    //             }
    //         }

    //     }
    // }

}