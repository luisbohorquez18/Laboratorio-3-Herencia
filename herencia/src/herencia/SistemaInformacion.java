/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import javax.swing.JOptionPane;
/**
* Clase Java para implementar un cliente
* que emplea la jerarquía de herencia de la persona,
* el empleado y el estudiante para mostrar los cálculos
* de cada uno de los respectivos procesos implementados
* por cada clase
*/
public class SistemaInformacion{

public static void main(String[] args)
{
int opcion = 0;
Persona sistemaInformacion = new Persona();
try{
//Usamos la herencia de la superclase para acceder a los
//métodos de lectura de datos
do{
opcion = sistemaInformacion.leerDatoTipoEntero("Ingrese la opción: \n* 1) Desea ingresar datos de un empleado \n* 2) Desea ingresar datos de un estudiante  \n* 3) Salir ");
if (opcion == 1){
    JOptionPane.showMessageDialog(null,"Ingresando datos del empleado");
    Empleado manejadorEmpleado = new Empleado();
    //Leemos los datos
    manejadorEmpleado =manejadorEmpleado.ingresarDatosEmpleado();
    //Mostramos el reporte de datos
    manejadorEmpleado.imprimirReporteEstadoEmpleado();
}
else if(opcion == 2){
    JOptionPane.showMessageDialog(null, "Ingresando datos del estudiante");
    Estudiante manejadorEstudiante = new Estudiante();
    
    manejadorEstudiante = manejadorEstudiante.ingresarDatosEstudiante();
    
    manejadorEstudiante.imprimirReporteNotasEstudiante();
}
else if (opcion == 3){
    JOptionPane.showMessageDialog(null,"Saliendo del Sistema");
    break;
}
else
{
    JOptionPane.showMessageDialog(null,"Error, Debe ser opcion 1, 2 o 3");
}
}while (opcion < 1 || opcion > 3);//fin del do-while
}//Fin del try
catch (Exception errorMain){
JOptionPane.showMessageDialog(null,"Error en la digitación: ");
errorMain.printStackTrace();
}
}
}
