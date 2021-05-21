package palindromo;

public class Palindromo {

	public static void main(String[] args) {
		
		String teste = "ovo";
		boolean eigual = false;
		
		for(int j = 1 ; j<=teste.length()/2;j++) {
			
			if(teste.charAt(j-1)==teste.charAt(teste.length()-j)) {
				eigual = true;
			}else {
				eigual = false;
				break;
			}
		}
		
		System.out.print(eigual == true ? "É palindromo" : "Não é Palindromo");

	}

}
