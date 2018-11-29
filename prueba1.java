import java.util.Scanner;
class prueba1
{
    public static void main (String [] args)
    {
        double pi;
        double rad, op,lon;
        Scanner leerDato= new Scanner (System.in);
        System.out.println('\u000C');
        System.out.println("Ingresa el valor del radio de un círculo");
        rad=leerDato.nextInt();
        pi=3.1416;
        lon= rad + rad;
        op= pi * ( rad * rad );
        System.out.println("La longitud es : " + lon);
        System.out.println("El área del círculo es: " + op);
	System.ou.println("Hola!");
    }
}
