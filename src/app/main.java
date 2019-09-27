package app;
import app.AES;


public class main {

	public static void main(String[] args) {
		AES obj = new AES();
		String p1=obj.keyp1;//la primera parte de las llaves
		String p2=obj.keyp2;//la segunda parte de las llaves
		String p3=obj.keyp3;//la tercera parte de las llaves
		String letras[]=obj.letras;//las letras posibles
		String num[]=obj.num;//los numeros posibles
		String newKey;
		String message;
		
		for(int i=0; i<letras.length; i++) {
			for(int j=0;j<(num.length);j++) {
				newKey=p1+letras[i]+p2+num[j]+p3;
				
				message=obj.decrypt(newKey);
				if(message!=null) {
					System.out.println(newKey);
					System.out.println(message);
					
				}
				
				
			}
		}
		
		

			
			
			
			
//		String decryptedString = AES.decrypt(,secretKey);
//		System.out.println(decryptedString);
		//System.out.println(obj.letras.length);

	}

}
