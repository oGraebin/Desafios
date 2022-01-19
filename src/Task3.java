import java.lang.reflect.Array;
import java.util.*;

class Solution {

	public static void main(final String[] args) {
		// TODO Auto-generated method stub
		Random gerador = new Random();
		
		int Num = gerador.nextInt(9999999);
		
		System.out.println(Num);
		
		
		Boolean valida = Num < 0 ? true : false;   
		
		int NumTratado = valida == true ? Num*-1 : Num;
		

		
        String NumString = String.valueOf(NumTratado);

        String[] Digitos = NumString.split("(?<=.)");
        
		int Len = Digitos.length;
		System.out.println(Len);
		
		int [] Lista = new int [Len];
		
		int [] NumValidador = new int[Len];
		
		for(int x = 0; x < Len; x++) {
			Lista[x]= Integer.parseInt(Digitos[x]);
		}
		
		for(int i = 0; i < Len; i++) {
			Lista[i] += 50;
			for (int y = 0; y<Len; y++) {
				NumValidador[i] = Integer.parseInt(String.valueOf(NumValidador[i]) + String.valueOf(Lista[y]));
			}
			Lista[i]-=50;
		}
		
		Arrays.sort(NumValidador);
		
		int MaiorNumero = valida == true ? NumValidador[Len-1]*-1 : NumValidador[Len-1];
		System.out.println(MaiorNumero);
	}

}
