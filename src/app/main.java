package app;
import java.util.HashSet;
import java.util.Set;

import app.AES;


public class main {

	public static void main(String[] args) {
		Set<String> Keys = new HashSet<String>();
		AES obj = new AES();
		String p1=obj.keyp1;//la primera parte de las llaves
		String p2=obj.keyp2;//la segunda parte de las llaves
		String p3=obj.keyp3;//la tercera parte de las llaves
		String letras[]=obj.letras;//las letras posibles
		String num[]=obj.num;//los numeros posibles
		String newKey;
		String message;
		
		for(int i=0; i<letras.length; i++) {
			for(int j=0; j<num.length; j++) {
				Keys.add(letras[i]+num[j]);
			}
		}
		
		int a=1;
		for (String key : Keys) {
			  System.out.println(a+" "+key);
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
		
		

			
			
			
			
//		String decryptedString = AES.decrypt(,secretKey);
//		System.out.println(decryptedString);
		//System.out.println(obj.letras.length);

	}

}
