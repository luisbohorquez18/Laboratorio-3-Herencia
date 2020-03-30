/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Dell
 */

import javax.swing.JOptionPane;

public class Estudiante extends Persona{
    private double promedioNotas;
    private String carnet;
    private int numeroMaterias;
    
    public Estudiante() {
    }

    public Estudiante(double promedioNotas, String carnet, int numeroMaterias, String nombre, String apellido, int edad, double peso) {
        super(nombre, apellido, edad, peso);
        this.promedioNotas = promedioNotas;
        this.carnet = carnet;
        this.numeroMaterias = numeroMaterias;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public double getPromedioNotas() {
        return promedioNotas;
    }

    public void setPromedioNotas(double promedioNotas) {
        this.promedioNotas = promedioNotas;
    }

    public int getNumeroMaterias() {
        return numeroMaterias;
    }

    public void setNumeroMaterias(int numeroMaterias) {
        this.numeroMaterias = numeroMaterias;
    }
    
    public void leerNotas(int cantidadM){
        int nota=0;
        int numeroMaterias=cantidadM;
        for (int i = 0; i < numeroMaterias; i++) {
            nota=leerDatoTipoEntero("Digite la nota No. "+(i+1));
            promedioNotas+=nota;
        }
    }
    public double calcularPromedio(int cantidadM){
        return promedioNotas/cantidadM;
    }
    public Estudiante ingresarDatosEstudiante(){
        Estudiante nuevoEstudiante = new Estudiante();
        String nombre = "";
        String apellido = "";
        int edad = 0;
        double peso = 0.0;
        String carnet="";
        int numeroMaterias;
           
        carnet = leerDatoTipoCadena("Ingrese el carnet");
        nombre = leerDatoTipoCadena("Ingrese el nombre: ");
        apellido= leerDatoTipoCadena("Ingrese el apellido: ");
        edad = leerDatoTipoEntero("Digite la edad: ");
        peso = leerDatoTipoReal("Digite el peso: ");
        numeroMaterias = leerDatoTipoEntero("Ingrese el numero de materias: ");
        
        leerNotas(numeroMaterias);
        
        nuevoEstudiante.setNombre(nombre);
        nuevoEstudiante.setApellido(apellido);
        nuevoEstudiante.setEdad(edad);
        nuevoEstudiante.setPeso(peso);
        nuevoEstudiante.setCarnet(carnet);
        nuevoEstudiante.setNumeroMaterias(numeroMaterias);
        nuevoEstudiante.setPromedioNotas(calcularPromedio(numeroMaterias));
        
        return nuevoEstudiante;
    }
    
    public void imprimirReporteNotasEstudiante(){
        JOptionPane.showMessageDialog(null, "El numero del carnet es: "+getCarnet());
        imprimirDatosPersona();
        JOptionPane.showMessageDialog(null, "Numero de materias: "+getNumeroMaterias()+
                "\nPromedio de notas: "+getPromedioNotas());
    }
}
