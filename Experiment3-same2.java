// package jp.tcs.expt.junit;

public class Experiment3 {

    public String fizzBuzz(int i) {
		if(i <= 0){
			throw new RuntimeException();
		}
		if (i % 15 == 0) {
			return "FizzBuzz";
		} else if (i % 5 == 0) {
			return "Buzz";
		} else if (i % 3 == 0) {
			return "Fizz";
		} else {
		    return String.valueOf(i);
        }
	}
}

