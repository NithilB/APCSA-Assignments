public class Phrase{
	private String currentPhrase;

	public Phrase(String p){
		currentPhrase = p;
	}


	public void replaceNthOccurrence(String str, int n, String repl){
		int d = findNthOccurrence(str, n);
		if (d >= 0){
			currentPhrase = currentPhrase.substring(0, d) + repl + currentPhrase.substring(d + str.length());
		}
	}

	public int findLastOccurrence(String str){
	int d = 0;
	int c = 0;
	while(currentPhrase.indexOf(str, c) >= 0){
		if (c == -1){
			break;
		}
		c = currentPhrase.indexOf(str, c) + 1;
		d++;
	}
	//System.out.println(d);
	int a = findNthOccurrence(str, d);
	if (a >= 0){
		return a;
	}
		return -1;

	}


	public int findNthOccurrence(String str, int n){
		int ix = -1, cnt = 0;

		do{
			ix++;
			ix = currentPhrase.indexOf(str,ix);
			cnt++;
			if (cnt == n && ix != -1)
				return ix;
		} while(ix != -1 && ix < currentPhrase.length());

		return -1;
	}

	public String toString(){
		return currentPhrase;
	}
}