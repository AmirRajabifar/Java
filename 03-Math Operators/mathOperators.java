class mathOperators {
	public static void main(String[] args) {
		int score = 40;
		score = score + 10; // add 10 to the existing value of "score" variable

		System.out.println (score);
		System.out.println (score++); //Value will stay the same
		System.out.println (++score); //value will increment by 2 because of last line

		System.out.println (score);
		System.out.println (score--); //Value will stay the same
		System.out.println (--score); //value will decrement by 2 because of last line
	}
}

/*
Arithmatic operators:
	+ ==> addition	
	- ==> subtract
	/ ==> division
	* ==> multiplication

increment/decrement 
	==> add 1
	var++ 
	++var  
	var += [number]
	var = var + 1

	==> subtract 1
	var-- 
	--var
	var -= [number]
	var = var - 1

var++; 	post-fixing:
	the value of variable will not change untill after the expression has ben evaluated

++var;	pre-fixing:
	the value of variable will change before the expression evaluates

order of operator precedence
1. ++ --
2. multiplicaton and division	
3. addition and subtraction
4. comparisons
5. equal sign
*/