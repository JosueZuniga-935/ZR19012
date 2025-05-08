package ejerciciovector;

import javax.swing.JOptionPane;

public class EjercicioVector {

    public static void main(String[] args) {

        //Declaracion de variables
        int tamanio, tamanio2, i, numero;
        float division, suma = 0, suma2 = 0, residuo, residuo2, sumaTotal, Resta, Multi;
        int vector1[];
        int vector2[];

        //Dimensionando el vector 1
        tamanio = Integer.parseInt(JOptionPane.showInputDialog("ingrese el tamaño el vector"));
        vector1 = new int[tamanio];

        //LLenando el vector 1
        for (i = 0; i < vector1.length; i++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del vector en la posicion: " + (i + 1)));
            vector1[i] = numero;

        }

        //Mostrar por consola el contenido del vector 1
        System.out.println("Vector 1");
        for (i = 0; i < vector1.length; i++) {
            System.out.print(vector1[i] + ", ");

        }
        //Sumando el contenido del vector 1
        for (i = 0; i < vector1.length; i++) {
            suma = suma + vector1[i];
        }

        //Resultado de la suma del vector 1
        System.out.println("suma del vector 1: " + suma);

        //Dimensionando el vector 2
        tamanio2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el tamaño el vector"));
        vector2 = new int[tamanio2];

        //LLenando el vector 2
        for (i = 0; i < vector2.length; i++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del vector en la posicion: " + (i + 1)));
            vector2[i] = numero;

        }

        //Mostrar por consola el vector 2
        System.out.println("Vector 2");
        for (i = 0; i < vector2.length; i++) {
            System.out.print(vector2[i] + ", ");

        }

        //Sumando el contenido del vector 2
        for (i = 0; i < vector2.length; i++) {
            suma2 = suma2 + vector2[i];
        }

        //Resultado de la suma del vector 2
        System.out.println("suma del vector 2: " + suma2);

        //Operaciones aritmeticas de cada respuesta de la suma de los vectores
        sumaTotal = suma + suma2;
        Resta = suma2 - suma;
        Multi = suma * suma2;

        //Operacion para saber si las sumas son par o impar de cada vector 
        residuo = suma % 2;
        residuo2 = suma2 % 2;

        //Si vector 1 es mayor a Vector 2 se suma
        if (suma > suma2) {
            JOptionPane.showMessageDialog(null, "Suma es igual a: " + sumaTotal);
            //Si los dos vectores son pares se multiplican
            if (residuo == 0 && residuo2 == 0) {
                JOptionPane.showMessageDialog(null, "Multi es igual a: " + Multi);
            } else {
                
                //si alguno de los vectores son impares se dividen
                division = suma / suma2;
                JOptionPane.showMessageDialog(null, "Division es igual a: " + (division));

            }
            //Si vector 2 es menor a Vector 1 se resta
        } else {
            JOptionPane.showMessageDialog(null, "Resta es igual a: " + Resta);
            //Si los dos vectores son pares se multiplican
            if (residuo == 0 && residuo2 == 0) {
                JOptionPane.showMessageDialog(null, "Multi es igual a: " + Multi);
            } else {
                //si alguno de los vectores son impares se dividen
                division = suma2 / suma;
                JOptionPane.showMessageDialog(null, "Division es igual a: " + (division));

            }
        }

    }

}
