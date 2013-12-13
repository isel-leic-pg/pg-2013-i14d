class CharOccurrences{
	private int occurrences; 
	private char lineChar;
	
	public CharOccurrences(char c){
		lineChar = c;
	}
	
	public void print(){
		System.out.print(lineChar + " ");
		for(int j = 0; j < occurrences; j++){
			System.out.print('*');
		}
		System.out.println();
	}
	
	public void inc(){
		occurrences++;
	}
	
	public char getChar(){
		return lineChar;
	}
}
