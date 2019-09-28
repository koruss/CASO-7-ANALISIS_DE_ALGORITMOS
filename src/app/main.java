package app;
import java.math.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import app.AES;


public class main {

	public static void main(String[] args) {
		Set<String> Keys1 = new HashSet<String>();
		AES obj = new AES();
		String p1=obj.keyp1;//la primera parte de las llaves
		String p2=obj.keyp2;//la segunda parte de las llaves
		String p3=obj.keyp3;//la tercera parte de las llaves
		String letras[]=obj.letras;//las letras posibles
		String num[]=obj.num;//los numeros posibles
		String newKey;
		String message=null;
		String entradaTeclado="";
	
		int cont=0;
		boolean create=true;
		
		System.out.println ("Por favor introduzca el porcentaje de revisión (Ingresar dato 0.%, ejemplo: 0.6): ");
		Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner

        entradaTeclado = entradaEscaner.nextLine (); //Invocamos un método sobre un objeto Scanner
		
        float porcentaje = Float.parseFloat(entradaTeclado);

		System.out.println(porcentaje);
		while(create) {
			
			if(cont==260*porcentaje) {
				break;
			}
			else {
				int ranLetras= (int) (Math.random() * ( 25 - 0 ));
				int ranNumeros= (int) (Math.random() * ( 9 - 0 ));
				String letra=letras[ranLetras];
				String numero=num[ranNumeros];
				if(!Keys1.contains(letra+numero)){
					Keys1.add(letra+numero);
//					System.out.println(cont);
					cont++;
				}
			}
		}  

	
		

		for (String key : Keys1) {
				newKey=p1+key.substring(0,1)+p2+key.substring(1)+p3;
//				System.out.println(newKey);
				message=obj.decrypt(newKey);
				if(message!=null) {
					System.out.println("Key desifrada: "+newKey);
					System.out.println("Mensaje cifrado: "+message);
					System.out.println("Con un porcentaje de "+porcentaje+"% de probabilidad, se logra desifrar la llave.");
					break;
				}
				
			}
		if(message==null) {
			System.out.println("Con un porcentaje de "+porcentaje+"% de probabilidad, no se logra desifrar la llave.");
		}
		
	}
};
