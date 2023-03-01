package calcularaltura;

import javax.swing.JOptionPane;

public class CalcularAltura
{
    public static void imprimir(String mensaje)
    {
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
    public static int leerInt(String mensaje)
    {
        return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
    }
    
    public static char leerChar(String mensaje)
    {
        return JOptionPane.showInputDialog(mensaje).toUpperCase().charAt(0);
    }
    
    public static double leerDouble(String mensaje)
    {
        return Double.parseDouble(JOptionPane.showInputDialog(mensaje));
    }
    
    public static double calcularAltura(char g, char h, double l)
    {
        double altura=0;
        
        switch (g)
        {
            case 'M':
                if ('F'==h) altura=(1.88*l)+81.31;
                else if (h=='H') altura=(2.84*l)+70.64;
                else imprimir("El hueso ingresado no es valido");
                break;
            
            case 'F':
                if ('F'==h) altura=(1.94*l)+72.84;
                else if (h=='H') {altura=(2.75*l)+71.48;}
                else imprimir("El hueso ingresado no es valido");
                break;
                
            default:
                if ('H'!=h ||'F'!=h) imprimir("El hueso ingresado no es valido");
                imprimir("El genero ingresado no es valido");
                break;
        }
        return altura;
    }
    
    public static void main(String[] args)
    {
        double longitud, altura;
        char hueso, genero;
        
        genero=leerChar("Ingrese el genero de la persona (Masculino/Femenino): ");
        hueso=leerChar("Ingrese el hueso a medir (Humero, Femur): ");
        longitud=leerDouble("Ingrese la longitud del hueso: ");
        
        altura=calcularAltura(genero, hueso, longitud);
        
        imprimir("La altura es: "+altura +" cm");
    }
}