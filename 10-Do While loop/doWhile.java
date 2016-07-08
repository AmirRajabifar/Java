class doWhile{
	public static void main(String[] args) {
		int topNumber = 15;
		int bottomNumber = 1;
		do {
			System.out.print ("This is a do while loop\n");
			bottomNumber++;
		} while (bottomNumber < topNumber);		
	}
}

/*
	The difference between while and do-while:
	in while the condition is tested first.
	in do-while the condition is tested last.

	If the condition tests false there will be no output for the while loop
	but there will be one output for the do-while loop.
*/
