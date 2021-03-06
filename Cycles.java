package models;

public class ProgramEvalueChain{

	private boolean binary;

	public int searchCharacter(String frase, char simbolo){ 
		int totalCharacter = 0;
		for(int i = 0; i < frase.length(); i++){
			if(frase.charAt(i) == simbolo){
				totalCharacter++;
			}
		}
		return totalCharacter;
	}

	public boolean checkBinary(String number){
		for(int n = 0; n < number.length(); n++){
			if(number.charAt(n) == '1' || number.charAt(n) == '0'){
				binary = true;
			}else{
				binary = false;
			}
		}
		return binary;
	}

	public int countWords(String frase){
		int totalWords = 0;
		for(int n = 0; n < frase.length(); n++){
			if(frase.charAt(n) == ' ' || frase.charAt(n) == '.' || frase.charAt(n) == ':' || frase.charAt(n) == ',' || frase.charAt(n) == ';'){
				totalWords++;	
			}
		}
		return totalWords;
	}

	public int countPacMans(String frase){
		int totalPacMan = 0;
		for(int n = 0; n < frase.length(); n++){
			if(frase.charAt(n) == ':' && frase.charAt(n+1) == 'v'){
				totalPacMan++;	
			}
		}
		return totalPacMan;
	}

	public int testOne(String frase){
		int totalAdd = 0;
		for(int n = 0; n < frase.length(); n++){
			if(frase.charAt(n) >= '49' && frase.charAt(n) <= '57'){
				return totalAdd += (frase.charAt(n) - 47);
			}
		}
		return totalAdd;
	}



	public static void main (String [] args){
		ProgramEvalueChain op = new ProgramEvalueChain();
		System.out.println(op.searchCharacter("Dentro de poco", 'o'));
		System.out.println(op.checkBinary("1010110"));
		System.out.println(op.countWords("Leroy Jenkins se abalanzó de forma heroíca en la mazmorra, con su épico grito de batalla."));
		System.out.println(op.countPacMans(":v :v :v"));
		System.out.println(op.testOne("43312"));
	}
}
