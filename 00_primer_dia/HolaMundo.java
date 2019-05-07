class HolaMundo{
	public static void main(String args[]){
		
		System.out.println("Hola mundo \n");
		for(String p: args){
			
			System.out.println("Arg "+ p.valueOfIndex() +"= "+p);
		}
		
	}
}