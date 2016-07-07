class Switch {
	public static void main(String[] args){
		int fieldgoal = 10;
		
		switch (fieldgoal){
			case 6:
				System.out.print("This is a touchdown\n");
				break;
			case 2:
				System.out.print("This is a safety\n");
				break;
			case 3:
				System.out.print("This is a field goal\n");
				break;
			default:
				System.out.print("Nothing matches at all\n");
		}
	}	
}
