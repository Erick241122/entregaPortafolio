/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package portafolio;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Portafolio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String lectura;
        double salarioBruto;
        double sem;
        double ivm;
        double asociacion;
        double caja;
        double deducciones;
        //Con esto se le pide la entrada del valor para hacer los calculos
        lectura = JOptionPane.showInputDialog("Digite salario");
        
        // con esto se transforma de string a double
        salarioBruto = Double.parseDouble(lectura);

        //calculo para el Seguro de Enfermedad y Maternidad
        sem = (salarioBruto * 0.0925);

        //calculo para el seguro de Invalidez, Vejez y Muerte
        ivm = (salarioBruto * 0.0508);
        
        //calculo para el total a pagar a la caja
        caja = sem + ivm;
        
        //calculo para el salario con las deducciones
        deducciones = salarioBruto - caja;

        //calculo para sacar el monto para la asocioacion
        asociacion = (2.5 / 100) * deducciones;

        JOptionPane.showMessageDialog(null, "La empresa deberá abonar a la CCSS el monto de: " + caja + " por concepto de SEM y IVM" + "\n"
                + "Para la asociación de la empresa se le asigna un valor de :" + asociacion);

    }

}
