
import java.util.*;
import java.lang.Math.*;
/** import java.util.* permite solucionar el problema del conductor del colectivo 3 del taller 2 franja indivudual. 
 * 
 * 
 */
public class datos 
{
    
 public static void main(String[] args)
    {
        //
        Scanner teclado = new Scanner(System.in);
        
        int impuesto;
        int preciobruto;
        int tipodecarro;
        int precioneto;
        
        System.out.print("el valor bruto del carro");
        preciobruto=teclado.nextInt();
        System.out.print("conteste 1 si es una camioneta o 0 si no lo es");
        tipodecarro=teclado.nextInt();
       
        if (tipodecarro==1& preciobruto<80)
        {
        System.out.println("el carro es caminioneta y no paga impuesto");}
        
        if (tipodecarro==1& preciobruto>=80)
        {
            impuesto=preciobruto/2;
        System.out.println("el carro es caminioneta el impuesto es de "+impuesto);}
        
        if (tipodecarro==0&preciobruto<20){
        System.out.println("el carro es automovil y su impuesto es 5");}
        
         if (tipodecarro==0& preciobruto>=20 & preciobruto<40){
             impuesto=preciobruto/5;
        System.out.println("el carro es automovil y su impuesto es 5");}
        
        if (tipodecarro==0& preciobruto>=40){
             
        System.out.println("el carro es automovil y su impuesto es 9");}
    }
}