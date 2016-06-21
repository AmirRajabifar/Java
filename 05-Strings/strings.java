class strings {
	public static void main(String[] args) {
		char letter = 'H';
		String sentence = "This is a sentence you should read";
		String country = "united states";

		String sUpperCase = country.toUpperCase();
		int index = country.indexOf("s");
		//print char and string variables
		System.out.println (letter);
		System.out.println (sentence);
		//print inline
		System.out.print("one");
		System.out.print("line");
		System.out.println(); // to seprate the line (make more visible)
		//print new line
		System.out.println("different");
		System.out.println("line");
		//to print double quate
		System.out.println("Henry said \"he was angry\"");
		//paste strings 
		System.out.println("Henry is going to marry" + " Alice");
		System.out.println(country);
		System.out.println(sUpperCase);
		System.out.println("possition = " + index);
	}
}

/*
System.out.print:
	no new line.
	print everuthing on the same line

System.out.println:
	"ln" = new line

To print special chars:
	\"
	\'
	\n
	\t
paste strings together:
	"Henry is going to marry" + " Alice"

pre-defined method
	toUpperCase() ==>  change to upper case
	indexOf() ==> return the possition	(first occurrence)
	if -1 returned, the string does not exist
*/
