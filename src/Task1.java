import java.util.Random;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random gerador = new Random();
		
		int Bits = 0;
		
		int Num = gerador.nextInt(9999999);
		
		System.out.println(Num);
		
		String NumTratado = Integer.toBinaryString(Num);
		
		System.out.println(NumTratado);
		

        String[] Digitos = NumTratado.split("(?<=.)");
        
		int Len = Digitos.length;
		
		System.out.println(Len);
		
		int [] Lista = new int [Len];
		
		for(int x = 0; x < Len; x++) {
			Lista[x]= Integer.parseInt(Digitos[x]);
		}
		
		for(int i = 0; i < Len; i++) {
			Bits += Lista[i];
		}
		
		System.out.println(Bits);
		

	}

}
