package app;
import java.math.*;
import java.util.HashSet;
import java.util.Set;

import app.AES;


public class main {

	public static void main(String[] args) {
		Set<String> Keys1 = new HashSet<String>();
		Set<String> Keys2 = new HashSet<String>();
		AES obj = new AES();
		String p1=obj.keyp1;//la primera parte de las llaves
		String p2=obj.keyp2;//la segunda parte de las llaves
		String p3=obj.keyp3;//la tercera parte de las llaves
		String letras[]=obj.letras;//las letras posibles
		String num[]=obj.num;//los numeros posibles
		String newKey;
		String message;
	
		
		int cont=0;
		boolean create=true;
		while(create) {
			
			if(cont==(260*0.25)) {
				break;
			}
			else {
				int ranLetras= (int) (Math.random() * ( 25 - 0 ));
				int ranNumeros= (int) (Math.random() * ( 9 - 0 ));
				String letra=letras[ranLetras];
				String numero=num[ranNumeros];
				if(!Keys1.contains(letra+numero)) {
					Keys1.add(letra+numero);
//					System.out.println(cont);
					cont++;
				}
			}
		}
		
		int cont2=0;
		boolean create2=true;
		while(create2) {
			
			if(cont2==(260*0.25)) {
				break;
			}
			else {
				int ranLetras= (int) (Math.random() * ( 25 - 0 ));
				int ranNumeros= (int) (Math.random() * ( 9 - 0 ));
				String letra=letras[ranLetras];
				String numero=num[ranNumeros];
				if(!Keys1.contains(letra+numero) && !Keys2.contains(letra+numero)) {
					Keys2.add(letra+numero);
					System.out.println(cont2);
					cont2++;
				}
			}
		}
		
		
//		for(int i=0; i<60; i++) {
//				Keys.add(letras[ranLetras]+num[ranNumeros]);
//		}
	
		
		int a=1;
		for (String key : Keys1) {
			  System.out.println(key);
			  a++;
			}
		
		System.out.println("Key2");

		
		for (String key : Keys2) {
			  System.out.println(key);
			  a++;
			}
//		for(int i=0; i<letras.length; i++) {
//			for(int j=0;j<(num.length);j++) {
//				newKey=p1+letras[i]+p2+num[j]+p3;
//				
//				message=obj.decrypt(newKey);
//				if(message!=null) {
//					System.out.println(newKey);
//					System.out.println(message);
//					
//				}
//				
//				
//			}
//		}

	}

}
