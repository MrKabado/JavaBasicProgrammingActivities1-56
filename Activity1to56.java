import java.util.*;

public class Activity1to56 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		chooseActivity();
	}

	public static void chooseActivity() {
		boolean runLoop = true;

		while (runLoop) {
			System.out.printf("\nChoose activity from 1 to 56 and 0 to stop: ");
			if (scan.hasNextInt()) {
				int input = scan.nextInt();
				if (input < 0 || input > 56) {
					System.out.println("Input must range between 1 to 56");
					continue;
				}

				switch (input) {
					case 0: System.out.println("Execution ended."); return;
				    case 1: System.out.println("=== Print Personal Info ==="); activity1(); break;
				    case 2: System.out.println("=== Rectangle Perimeter & Area ==="); activity2(); break;
				    case 3: System.out.println("=== Employee Salary by Hours ==="); activity3(); break;
				    case 4: System.out.println("=== Max of Three Integers ==="); activity4(); break;
				    case 5: System.out.println("=== Distance Between Two Points ==="); activity5(); break;
				    case 6: System.out.println("=== Break Amount into Bank Notes ==="); activity6(); break;
				    case 7: System.out.println("=== Convert Seconds to H:M:S ==="); activity7(); break;
				    case 8: System.out.println("=== Month Name by Number ==="); activity8(); break;
				    case 9: System.out.println("=== Count Positive & Negative Numbers ==="); activity9(); break;
				    case 10: System.out.println("=== Password Validator ==="); activity10(); break;
				    case 11: System.out.println("=== Find Quadrant of Coordinate ==="); activity11(); break;
				    case 12: System.out.println("=== Divide Two Numbers ==="); activity12(); break;
				    case 13: System.out.println("=== Print Numbers 1–n in 3 Columns ==="); activity13(); break;
				    case 14: System.out.println("=== Average of Math Marks (until 0) ==="); activity14(); break;
				    case 15: System.out.println("=== Smallest Element in Array ==="); activity15(); break;
				    case 16: System.out.println("=== Convert cm to inches ==="); activity16(); break;
				    case 17: System.out.println("=== Reverse a Number ==="); activity17(); break;
				    case 18: System.out.println("=== Remove Negative Sign (Absolute Value) ==="); activity18(); break;
				    case 19: System.out.println("=== Check Multiplicity ==="); activity19(); break;
				    case 20: System.out.println("=== Print Words on New Lines ==="); activity20(); break;
				    case 21: System.out.println("=== Break Currency into Notes & Coins ==="); activity21(); break;
				    case 22: System.out.println("=== Third Angle of Triangle ==="); activity22(); break;
				    case 23: System.out.println("=== Vowel or Consonant ==="); activity23(); break;
				    case 24: System.out.println("=== Digit to Word ==="); activity24(); break;
				    case 25: System.out.println("=== Number Guessing Game (1–20) ==="); activity25(); break;
				    case 26: System.out.println("=== Username Validator (min 8 chars) ==="); activity26(); break;
				    case 27: System.out.println("=== Factorial using While Loop ==="); activity27(); break;
				    case 28: System.out.println("=== Multiplication Table up to 10 ==="); activity28(); break;
				    case 29: System.out.println("=== FizzBuzz 1–100 ==="); activity29(); break;
				    case 30: System.out.println("=== Find Longest Word in Sentence ==="); activity30(); break;
				    case 31: System.out.println("=== Max & Min in Array ==="); activity31(); break;
				    case 32: System.out.println("=== Separate Odd & Even into Arrays ==="); activity32(); break;
				    case 33: System.out.println("=== Sort Array Ascending ==="); activity33(); break;
				    case 34: System.out.println("=== Sort Array Descending ==="); activity34(); break;
				    case 35: System.out.println("=== Second Largest in Array ==="); activity35(); break;
				    case 36: System.out.println("=== Even or Odd (with function) ==="); activity36(); break;
				    case 37: System.out.println("=== Decimal to Binary (with function) ==="); activity37(); break;
				    case 38: System.out.println("=== Leap Year Validator (with length check) ==="); activity38(); break;
				    case 39: System.out.println("=== Area of Circle (with getArea function) ==="); activity39(); break;
				    case 40: System.out.println("=== Area of Square (with getArea function) ==="); activity40(); break;
				    case 41: System.out.println("=== Area of Rectangle (with getArea function) ==="); activity41(); break;
				    case 42: System.out.println("=== Palindrome (5 digits) ==="); activity42(); break;
				    case 43: System.out.println("=== Spaced Digits (4 digits) ==="); activity43(); break;
				    case 44: System.out.println("=== Compute Tax from Salary ==="); activity44(); break;
				    case 45: System.out.println("=== Number to Words (up to 10 digits) ==="); activity45(); break;
				    case 46: System.out.println("=== Reverse Input Lines until \"tiuq\" ==="); activity46(); break;
				    case 47: System.out.println("=== Print Fibonacci N Terms ==="); activity47(); break;
				    case 48: System.out.println("=== Compound Interest (10% yearly) ==="); activity48(); break;
				    case 49: System.out.println("=== Stats from 10 Integers ==="); activity49(); break;
				    case 50: System.out.println("=== Long Distance Call Cost ==="); activity50(); break;
				    case 51: System.out.println("=== Taxi Fare by Distance ==="); activity51(); break;
				    case 52: System.out.println("=== Validate Custom Code Rules ==="); activity52(); break;
				    case 53: System.out.println("=== Competition Score (drop min & max) ==="); activity53(); break;
				    case 54: System.out.println("=== Power (Base^Exponent) ==="); activity54(); break;
				    case 55: System.out.println("=== Pattern Printing 1 to n ==="); activity55(); break;
				    case 56: System.out.println("=== Bombs Count by Digits ==="); activity56(); break;
				    default: System.out.println("Invalid option");
				}

			} else System.out.println("Input must be a number");
		}
	}

	public static void activity56() {
		System.out.print("input number: ");
		if (scan.hasNextInt()) {
			int input = scan.nextInt();
			int bomb = 0;
			if (input < 0 || input > 9999999) {
				System.out.println("Input must be ranging between 0 to 9999999");
				return;
			}
			String inputStr = Integer.toString(input);
			for (int i = 0; i < inputStr.length(); i++) {
				if (inputStr.charAt(i) == '0') bomb++;
				if (inputStr.charAt(i) == '6') bomb++;
				if (inputStr.charAt(i) == '7') bomb++;
				if (inputStr.charAt(i) == '5') bomb++;
				if (inputStr.charAt(i) == '2') bomb += 2;
				if (inputStr.charAt(i) == '1') bomb += 2;
			}
			System.out.println("output: " + bomb + " bombs");
		} else System.out.println("Input must be inetger");
	}

	public static void activity55() {
		System.out.print("Input num 1 or 2 digits: ");
		if (scan.hasNextInt()) {
			int input = scan.nextInt();
			if (input <= 0 || input > 99) {
				System.out.println("Input must be 1 to 2 digits");
				return;
			}

			int num = 1;
			for (int i = 0; i < input; i++) {
				for (int j = 0; j < i + 1; j++) {
					System.out.print(num);
				}
				num++;
				System.out.println();
			}

		} else System.out.println("Input must be integer");
	}

	public static void activity54() {
		System.out.print("Input base: ");
		if (scan.hasNextInt()) {
			int base = scan.nextInt();
			System.out.print("Input exponent: ");
			if (scan.hasNextInt()) {
				int expo = scan.nextInt();
				int result = 1;
				for (int i = 0; i < expo; i++) {
					result = result * base;
				}
				System.out.println("Output: " + result);
			}
		} else System.out.println("Input must be an integer");
	}

	public static void activity53() {
		System.out.print("Input 10 scores: ");
		float[] scores = new float[10];
		if (scan.hasNextFloat()) {
			for (int i = 0; i < 10; i++) {
				scores[i] = scan.nextFloat();
			}

			float temp = 0;
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10 - 1; j 	++) {
					if (scores[j] > scores[j + 1]) {
						temp = scores[j];
						scores[j] = scores[j + 1];
						scores[j + 1] = temp;
					}
				}
			}

			scores[0] = 0;
			scores[9] = 0;

			float sum = 0;
			for (int i = 0; i < 10; i++) {
				sum += scores[i];
			}

			float total = sum / 8;
			System.out.printf("The final score is : %.2f \n", total);

		} else System.out.println("Input must be a number");
	}

	public static void activity52() {
		System.out.print("Enter a code: ");
		String code = scan.nextLine();
		boolean containDigit = false;

		if (code.length() != 5) {
			System.out.println("invalid code");
			return;
		}
		if (code.charAt(0) != '*') {
			System.out.println("invalid code");
			return;
		}
		for (int i = 0; i < code.length(); i++) {
			char ch = code.charAt(i);

			if (Character.isDigit(ch)) {
				containDigit = true;
			}
		}

		if (containDigit == false) {
			System.out.println("invalid code");
			return;
		}

		char ch = code.charAt(4);
		if (!Character.isLetter(ch)) {
			System.out.println("invalid code");
			return;
		}

		System.out.println("valid code");
	}

	public static void activity51() {
		System.out.print("Input distance in meters(m): ");
		if (scan.hasNextInt()) {
			int meters = scan.nextInt();
			if (meters <= 0) {
				System.out.println("Input must be greater than zero");
				return;
			}

			int totalFee = 20;
			int extra = 0;
			if (meters > 300) {
				extra = meters - 300;
			}

			while (extra > 200) {
				totalFee += 2;
				extra = extra - 200;
			}

			if (extra > 0) totalFee += 2;
			System.out.println("Total Fee: " + totalFee);
		} else System.out.println("Input must be integer");
	}

	public static void activity50() {
		System.out.println("							DAYTIME CALLS				NIGHTIME CALLS	");
		System.out.println("1. American Region		P 50 every 3 minutes		P 45 every 3 minutes");
		System.out.println("2. Asian Region			P 30 every 2 minutes		P 27 every 2 minutes");
		System.out.println("3. African Region		P 40 every 3 minutes		P 36 every 3 minutes");
		System.out.println("4. European Region		P 35 every 2 minutes		P 30 every 2 minutes");

		System.out.print("Choose region (1-4): ");
		if (scan.hasNextInt()) {
			int input = scan.nextInt();
			if (input <= 0 || input > 4) {
				System.out.println("Only 1-4");
				return;
			}
			switch(input) {
				case 1:
					System.out.println("1. DAYTIME 2. NIGHTTIME");
					if (scan.hasNextInt()) {
						int input2 = scan.nextInt();
						if (input2 < 1 || input2 > 2) {
							System.out.println("1-2");
							break;
						}
						switch (input2) {
							case 1:
								System.out.println("Enter duration of call (by minutes ex. 2)");
								if (scan.hasNextInt()) {
									int duration = scan.nextInt();
									if (duration <= 0) {
										System.out.println("Input must be greater than zero");
										return;
									}
									if (duration > 3) {
										System.out.println("TOTAL CHARGES: " + (duration / 3) * 50);
									} else {
										System.out.println("TOTAL CHARGES: " + 50);
									}
								} else System.out.println("Input must be integer");
							break;

							case 2:
								System.out.println("Enter duration of call (by minutes ex. 2)");
								if (scan.hasNextInt()) {
									int duration = scan.nextInt();
									if (duration <= 0) {
										System.out.println("Input must be greater than zero");
										return;
									}
									if (duration > 3) {
										System.out.println("TOTAL CHARGES: " + (duration / 3) * 45);
									} else {
										System.out.println("TOTAL CHARGES: " + 45);
									}
								} else System.out.println("Input must be integer");
							break;
						}
					} else System.out.println("input must be integer");
				break;

				case 2:
					System.out.println("1. DAYTIME 2. NIGHTTIME");
					if (scan.hasNextInt()) {
						int input2 = scan.nextInt();
						if (input2 < 1 || input2 > 2) {
							System.out.println("1-2");
							break;
						}
						switch (input2) {
							case 1:
								System.out.println("Enter duration of call (by minutes ex. 2)");
								if (scan.hasNextInt()) {
									int duration = scan.nextInt();
									if (duration <= 0) {
										System.out.println("Input must be greater than zero");
										return;
									}
									if (duration > 3) {
										System.out.println("TOTAL CHARGES: " + (duration / 3) * 30);
									} else {
										System.out.println("TOTAL CHARGES: " + 30);
									}
								} else System.out.println("Input must be integer");
							break;

							case 2:
								System.out.println("Enter duration of call (by minutes ex. 2)");
								if (scan.hasNextInt()) {
									int duration = scan.nextInt();
									if (duration <= 0) {
										System.out.println("Input must be greater than zero");
										return;
									}
									if (duration > 3) {
										System.out.println("TOTAL CHARGES: " + (duration / 3) * 27);
									} else {
										System.out.println("TOTAL CHARGES: " + 27);
									}
								} else System.out.println("Input must be integer");
							break;
						}
					} else System.out.println("input must be integer");
				break;

				case 3:
					System.out.println("1. DAYTIME 2. NIGHTTIME");
					if (scan.hasNextInt()) {
						int input2 = scan.nextInt();
						if (input2 < 1 || input2 > 2) {
							System.out.println("1-2");
							break;
						}
						switch (input2) {
							case 1:
								System.out.println("Enter duration of call (by minutes ex. 2)");
								if (scan.hasNextInt()) {
									int duration = scan.nextInt();
									if (duration <= 0) {
										System.out.println("Input must be greater than zero");
										return;
									}
									if (duration > 3) {
										System.out.println("TOTAL CHARGES: " + (duration / 3) * 40);
									} else {
										System.out.println("TOTAL CHARGES: " + 40);
									}
								} else System.out.println("Input must be integer");
							break;

							case 2:
								System.out.println("Enter duration of call (by minutes ex. 2)");
								if (scan.hasNextInt()) {
									int duration = scan.nextInt();
									if (duration <= 0) {
										System.out.println("Input must be greater than zero");
										return;
									}
									if (duration > 3) {
										System.out.println("TOTAL CHARGES: " + (duration / 3) * 36);
									} else {
										System.out.println("TOTAL CHARGES: " + 36);
									}
								} else System.out.println("Input must be integer");
							break;
						}
					} else System.out.println("input must be integer");
				break;

				case 4:
					System.out.println("1. DAYTIME 2. NIGHTTIME");
					if (scan.hasNextInt()) {
						int input2 = scan.nextInt();
						if (input2 < 1 || input2 > 2) {
							System.out.println("1-2");
							break;
						}
						switch (input2) {
							case 1:
								System.out.println("Enter duration of call (by minutes ex. 2)");
								if (scan.hasNextInt()) {
									int duration = scan.nextInt();
									if (duration <= 0) {
										System.out.println("Input must be greater than zero");
										return;
									}
									if (duration > 3) {
										System.out.println("TOTAL CHARGES: " + (duration / 3) * 35);
									} else {
										System.out.println("TOTAL CHARGES: " + 35);
									}
								} else System.out.println("Input must be integer");
							break;

							case 2:
								System.out.println("Enter duration of call (by minutes ex. 2)");
								if (scan.hasNextInt()) {
									int duration = scan.nextInt();
									if (duration <= 0) {
										System.out.println("Input must be greater than zero");
										return;
									}
									if (duration > 3) {
										System.out.println("TOTAL CHARGES: " + (duration / 3) * 30);
									} else {
										System.out.println("TOTAL CHARGES: " + 30);
									}
								} else System.out.println("Input must be integer");
							break;
						}
					} else System.out.println("input must be integer");
				break;
			}
		} else System.out.println("input must be integer");
	}

	public static void activity49() {
		int[] inputs = new int[10];
		System.out.println("Input 10 integers");
		for (int i = 0; i < 10; i++) {
			System.out.print("Input " + (i + 1) + " : ");
			if (scan.hasNextInt()) {
				inputs[i] = scan.nextInt();
				if (inputs[i] == 0) {
					System.out.println("Input must not be zero");
					return;
				}
			} else {
				System.out.println("Input must be an ineteger");
				return;
			}
		}

		int total = 0;
		int largest = inputs[0];
		int smallest = inputs[0];
		int totalNega = 0;
		int totalPosi = 0;
		int negas = 0;
		int num50to100 = 0;

		for (int i = 0; i < 10; i++) {
			total += inputs[i];
			if (inputs[i] < 0) {
				totalNega += inputs[i];
				negas++;
			}

			if (inputs[i] > 0) totalPosi += inputs[i];
			if (inputs[i] > 50 && inputs[i] < 100) num50to100++;
		}

		for (int i = 0; i < 10 - 1; i++) {
			if (largest < inputs[i + 1]) largest = inputs[i + 1];
			if (smallest > inputs[i + 1]) smallest = inputs[i + 1];
		}

		System.out.println("a.	Their total : " + total);
		System.out.println("b.	The largest : " + largest);
		System.out.println("c.	The smallest : " + smallest);
		System.out.println("d.	The total of all positive numbers : " + totalPosi);
		System.out.println("e.	The total of all negative numbers : " + totalNega);
		System.out.println("f.	How many negative numbers were entered : " + negas);
		System.out.println("g.	How many numbers between 50 and 100 were entered : " + num50to100);
	}

	public static void activity48() {
		System.out.print("Input the amount: ");
		if (scan.hasNextInt()) {
			int amount = scan.nextInt();
			if (amount <= 0) {
				System.out.println("Input must be greater than zero");
				return;
			}
			System.out.print("Input the years: ");
			if (scan.hasNextInt()) {
				int years = scan.nextInt();
				if (years <= 0) {
					System.out.println("Input must be greater than zero");
					return;
				}

				System.out.println("Original amount: " + amount);
				double interest = .10;
				double totalAmount = amount;
				for (int i = 1; i <= years; i++) {
					totalAmount = totalAmount * (1 + interest);
					System.out.println("The original amount after " + i + " : " + totalAmount);
				}

			} else System.out.println("Input must be an integer");
		} else System.out.println("Input must be an integer");
	}

	public static void activity47() {
		System.out.println("FIBONACCI");
		System.out.print("Input number: ");
		if (scan.hasNextInt()) {
			int input = scan.nextInt();
			if (input <= 0) {
				System.out.println("Input must be greater than zero");
				return;
			}

			int[] arr = new int[input];
			arr[0] = 1;
			arr[1] = 1;
			System.out.print(arr[0] + ", " + arr[1] + ", ");
			for (int i = 2; i < input; i++) {
				arr[i] = arr[i - 2] + arr[i - 1];
				System.out.print(arr[i] + ", ");
			}
		} else System.out.println("Input must be an integer");
	}

	public static void activity46() {
		System.out.print("Enter some words: ");
		while (true) {
			String input = scan.nextLine();
			if (input.equals("tiuq")) {
				System.out.println("exited...");
				return;
			}
			for (int i = input.length() - 1; i >= 0; i--) {
				System.out.print(input.charAt(i));
			}
			System.out.printf("\nEnter another: ");
		}
	}

	public static String[] belowTwenty = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
			            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
	public static String[] tens = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };
	public static String[] thousands = { "", " thousand", " million", " billion" };

	public static void activity45() {
		System.out.print("Input digit: ");
		if (scan.hasNextInt()) {
			int input = scan.nextInt();
			if (input < 0) {
				System.out.println("Input must be greater than zero");
				return;
			}

			String digitWords = act45NumberToWords(input);
			System.out.println(digitWords);

		} else System.out.println("Input must be digit");
	}

	public static String act45NumberToWords(int digit) {
		if (digit == 0) return "Zero";

		String words = "";
		int i = 0;

		while (digit > 0) {
			if (digit % 1000 != 0) {
				words = act45Helper((int)(digit % 1000)) + thousands[i] + (words.isEmpty() ? "" : " " + words);
			}

			digit /= 1000;
			i++;
		}
		return words.substring(0,1).toUpperCase() + words.substring(1);
	}

	public static String act45Helper(int num) {
		if (num == 0) return "";
		if (num < 20) return belowTwenty[num];
		else if (num < 100) return tens[num/10] + (num%10 != 0 ? " " + act45Helper(num%10) : "");
		else return belowTwenty[num/100] + " hundred" + (num%100 != 0 ? " " + act45Helper(num%100) : "");
	}

	public static void activity44() {
		System.out.print("Input gross salary: ");
		if (scan.hasNextDouble()) {
			double salary = scan.nextDouble();
			double tax = 0;
			if (salary <= 0) {
				System.out.println("Salary must be greater than zero");
				return;
			}

			if (salary <= 50000) {
				tax = salary * .10;
				System.out.printf("Your Tax: %.2f \n", tax);
				return;
			}

			if (salary > 50000 && salary <= 100000) {
				tax = 5000 + ((salary - 50000) * .15);
				System.out.printf("Your Tax: %.2f \n", tax);
				return;
			}

			if (salary > 100000 && salary <= 200000) {
				tax = 15000 + ((salary - 100000) * .20);
				System.out.printf("Your Tax: %.2f \n", tax);
				return;
			}

			if (salary > 200000) {
				tax = salary * .25;
				System.out.printf("Your Tax: %.2f \n", tax);
				return;
			}


		} else System.out.println("Input must be a number");
	}

	public static void activity43() {
		System.out.println("INPUT FOUR DIGIT INTEGER: ");
		if (scan.hasNextInt()) {
			int input = scan.nextInt();
			if (input < 1000 || input > 9999) {
				System.out.println("ONLY FOUR DIGIT");
				return;
			}
			String inputStr = Integer.toString(input);
			for(int i = 0; i < inputStr.length(); i++) {
				System.out.print(inputStr.charAt(i) + " ");
			}
		} else System.out.println("Input must be an integer");
	}

	public static void activity42() {
		System.out.println("INPUT FIVE DIGIT INTEGER: ");
		if (scan.hasNextInt()) {
			int input = scan.nextInt();
			if (input < 10000 || input > 99999) {
				System.out.println("ONLY FIVE DIGIT");
				return;
			}
			String inputStr = Integer.toString(input);
			if (inputStr.charAt(0) == inputStr.charAt(4) && inputStr.charAt(1) == inputStr.charAt(3)) {
				System.out.println("PALINDROME");
			} else System.out.println("NOT PALINDROME");
		} else System.out.println("Input must be an integer");
	}

	public static void activity41() {
		System.out.println("“WELCOME TO NICO’S COMPUTING AREA OF THE CIRCLE PROGRAM”");
		System.out.println();
		System.out.print("Input length: ");
		if (scan.hasNextFloat()) {
			float length = scan.nextFloat();
			System.out.print("Input width: ");
			if (scan.hasNextFloat()) {
				float width = scan.nextFloat();
				if (length <= 0 || width <= 0) {
					System.out.println("length and width must be greater than zero");
					return;
				}
				double result = act41GetArea(length, width);
				System.out.printf("The area is : %.0f \n", result);
			} else System.out.println("Input must be a number");
		} else System.out.println("Input must be a number");
	}

	public static double act41GetArea(float length, float width) {
		return length * width;
	}

	public static void activity40() {
		System.out.print("Input side: ");
		if (scan.hasNextFloat()) {
			float input = scan.nextFloat();
			if (input <= 0) {
				System.out.println("Input must be greater than zero");
				return;
			}
			double result = act40GetArea(input);
			System.out.printf("The area is : %.0f \n", result);
		} else System.out.println("Input must be a number");
	}

	public static double act40GetArea(float side) {
		return side * side;
	}

	public static void activity39() {
		System.out.print("Input radius: ");
		if (scan.hasNextFloat()) {
			float input = scan.nextFloat();
			if (input <= 0) {
				System.out.println("Input must be greater than zero");
				return;
			}
			double result = act39GetArea(input);
			System.out.printf("The area is : %.2f \n", result);
		} else System.out.println("Input must be a number");
	}

	public static double act39GetArea(float radius) {
		return (double) 3.1415926535 * (Math.pow(radius, 2));
	}

	public static void activity38() {
		System.out.print("Input year: ");
		if (scan.hasNextInt()) {
			int year = scan.nextInt();
			if (year < 1000) {
				System.out.println("Invalid Year");
				return;
			}

			if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
				System.out.println("Leap Year");
			} else System.out.println("Not a Leap Year");
		} else System.out.println("Input must be an integer");
	}

	public static void activity37() {
		System.out.print("Input any decimal number: ");
			if(scan.hasNextInt()) {
				int input = scan.nextInt();
				if (input <= 0) {
					System.out.println("Input must be greater than zero");
					return;
				}

				System.out.println("The binary value is : " + act37DecimalToBinary(input));
		} else System.out.println("Input must be a number");
	}

	public static String act37DecimalToBinary(int num) {
		String binary = "";
		while (num != 0 || num > 0) {
			if (num % 2 == 0) {
				binary += "0";
				num = num / 2;
			} else {
				binary += "1";
				num = num / 2;
			}
		}

		return binary;
	}

	public static void activity36() {
		System.out.print("Input any number: ");
		if(scan.hasNextInt()) {
			int input = scan.nextInt();
			if (input <= 0) {
				System.out.println("Input must be greater than zero");
				return;
			}
			System.out.println("The entered number is " + act36EvenChecker(input));

		} else System.out.println("Input must be a number");
	}

	public static String act36EvenChecker(int num) {
		if (num % 2 == 0) return "Even";
		else return "Odd";
	}

	public static void activity35() {
		System.out.print("Input the number of elements to be stored in the array : ");
		if (scan.hasNextInt()) {
			int num = scan.nextInt();
			int[] nums = new int[num];

			if (num < 0) {
				System.out.println("Input must be positive");
				return;
			}

			for (int i = 0; i < num; i++) {
				System.out.print("element - " + i + " : " );
				nums[i] = scan.nextInt();
			}

			int temp = 0;
			for(int i = 0; i < num; i++) {
				for (int j = 0; j < num - 1; j++) {
					if (nums[j] > nums[j + 1]) {
						temp = nums[j];
						nums[j] = nums[j + 1];
						nums[j + 1] = temp;
					}
				}
			}
			System.out.println("The Second largest element in the array is : " + nums[num - 2]);


		} else System.out.println("Input must be a number");
	}

	public static void activity34() {
		System.out.print("Input the number of elements to be stored in the array : ");
		if (scan.hasNextInt()) {
			int num = scan.nextInt();
			int[] nums = new int[num];

			if (num < 0) {
				System.out.println("Input must be positive");
				return;
			}

			for (int i = 0; i < num; i++) {
				System.out.print("element - " + i + " : " );
				nums[i] = scan.nextInt();
			}

			int temp = 0;
			for(int i = 0; i < num; i++) {
				for (int j = 0; j < num - 1; j++) {
					if (nums[j] < nums[j + 1]) {
						temp = nums[j];
						nums[j] = nums[j + 1];
						nums[j + 1] = temp;
					}
				}
			}
			System.out.println("Elements of array in sorted descending order: ");
			for (int i = 0; i < num; i++) {
				System.out.print(nums[i] + " ");
			}


		} else System.out.println("Input must be a number");
	}

	public static void activity33() {
		System.out.print("Input the number of elements to be stored in the array : ");
		if (scan.hasNextInt()) {
			int num = scan.nextInt();
			int[] nums = new int[num];

			if (num < 0) {
				System.out.println("Input must be positive");
				return;
			}

			for (int i = 0; i < num; i++) {
				System.out.print("element - " + i + " : " );
				nums[i] = scan.nextInt();
			}

			int temp = 0;
			for(int i = 0; i < num; i++) {
				for (int j = 0; j < num - 1; j++) {
					if (nums[j] > nums[j + 1]) {
						temp = nums[j];
						nums[j] = nums[j + 1];
						nums[j + 1] = temp;
					}
				}
			}
			System.out.println("Elements of array in sorted ascending order: ");
			for (int i = 0; i < num; i++) {
				System.out.print(nums[i] + " ");
			}


		} else System.out.println("Input must be a number");
	}

	public static void activity32() {
		System.out.print("Input the number of elements to be stored in the array : ");
		if (scan.hasNextInt()) {
			int num = scan.nextInt();
			int[] nums = new int[num];

			if (num < 0) {
				System.out.println("Input must be positive");
				return;
			}

			for (int i = 0; i < num; i++) {
				System.out.print("element - " + i + " : " );
				nums[i] = scan.nextInt();
			}

			System.out.println("The Even elements are : ");
			for (int i = 0; i < num; i++) {
				if (nums[i] % 2 == 0) System.out.print(nums[i] + " ");
			}

			System.out.println();

			System.out.println("The Odd elements are : ");
			for (int i = 0; i < num; i++) {
				if (nums[i] % 2 != 0) System.out.print(nums[i] + " ");
			}


		} else System.out.println("Input must be a number");
	}

	public static void activity31() {
		System.out.print("Input the number of elements to be stored in the array : ");
		if (scan.hasNextInt()) {
			int num = scan.nextInt();
			int[] nums = new int[num];

			if (num < 0) {
				System.out.println("Input must be positive");
				return;
			}

			for (int i = 0; i < num; i++) {
				System.out.print("element - " + i + " : " );
				nums[i] = scan.nextInt();
			}
			int max = nums[0];
			int min = nums[0];
			for (int i = 0; i < num - 1; i++) {
				if (max < nums[i + 1]) max = nums[i + 1];
				if (min > nums[i + 1]) min = nums[i + 1];
			}

			System.out.println("Maximum element is - " + max);
			System.out.println("Minimum element is - " + min);


		} else System.out.println("Input must be a number");
	}

	public static void activity30() {
		System.out.print("Enter some text: ");
		String input = scan.nextLine();
		String[] inputs = input.split(" ");
		String longest = inputs[0];

		for (int i = 0; i < inputs.length - 1; i++) {
			if (longest.length() < inputs[i + 1].length()) {
				longest = inputs[i + 1];
			}
		}

		System.out.println("`" + longest + "`" + " and it has " + longest.length() + " letters");
	}

	public static void activity29() {
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				 System.out.println("FizzBuzz");
				 continue;
			}
			if (i % 3 == 0) {
				 System.out.println("Fizz");
				 continue;
			}
			if (i % 5 == 0) {
				System.out.println("Buzz");
				continue;
			}

			System.out.println(i);
		}
	}

	public static void activity28() {
			System.out.print("Enter a positive integer: ");
			if (scan.hasNextInt()) {
				int num = scan.nextInt();

				if (num < 0) {
					System.out.println("Input must be positive");
					return;
				}

				for (int i = 1; i <= 10; i++) {
					System.out.println(i + " x " + num + " = " + (i * num));
				}

			} else System.out.println("input must be an integer");
	}

	public static void activity27() {
		System.out.print("Enter a positive integer: ");
		if (scan.hasNextInt()) {
			int num = scan.nextInt();
			int factorial = num;

			if (num < 0) {
				System.out.println("Input must be positive");
				return;
			}

			for (int i = num - 1; i > 0; i--) {
				factorial = factorial * i;
			}

			System.out.println("factorial of " + num + " is = " + factorial);

		} else System.out.println("input must be an integer");
	}

	public static void activity26() {
		System.out.println("Enter username atleast 8 characters:");
		while (true) {
			String username = scan.nextLine();

			if (username.length() > 8) {
				System.out.println("Success!");
				break;
			} else {
				System.out.println("Invalid username, Try again");
			}
		}
	}

	public static void activity25() {
		System.out.println("Guess the number!!");
		if (scan.hasNextInt()) {
			int correctNum = (int)(Math.random() * 20) + 1;
			while (true) {
				int guessNum = scan.nextInt();

				if (guessNum < 1 || guessNum > 20) {
					 System.out.println("Input must be 1 to 20");
				} else {
					if (guessNum == correctNum) {
						System.out.println("Congratualations!, You guessed it!");
						break;
					} else {
						System.out.println("Wrong number, Try again");
					}

				}
			}


		} else System.out.println("Input must be a number (1 - 20)");
	}

	public static void activity24() {
		System.out.print("Input a single digit: ");
		if (scan.hasNextInt()) {
			String[] numbers = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
			int input = scan.nextInt();

			if (input < 0 || input > 9) {
				System.out.println("Input must be 0 to 9");
				return;
			}

			System.out.println(numbers[input]);

		} else System.out.println("Input must be a number 0-9");
	}

	public static void activity23() {
		System.out.print("Input a letter: ");
		if (scan.hasNextLine()) {
			char[] letters = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};
			char letter = scan.nextLine().charAt(0);

			if ((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z')) {
				boolean isVowel = false;
				for (int i = 0; i < letters.length; i++) {
					if (letter == letters[i]) {
						isVowel = true;
						break;
					}
				}

				if (isVowel) System.out.println("The alphabet is a vowel");
				else System.out.println("The alphabet is a consonant");

			} else System.out.println("Input must be a letter");

		} else System.out.println("Input must be character");
	}

	public static void activity22() {
		System.out.print("Input two angles of triangle separated by comma (ex. 70,50) : ");
		String nums = scan.nextLine();
		String[] parts = nums.split(",");

		int angle1 = Integer.parseInt(parts[0].trim());
		int angle2 = Integer.parseInt(parts[1].trim());
		int angle3 = 180 - (angle1 + angle2);

		System.out.println("Third angle of the triangle : " + angle3);
	}

	public static void activity21() {
		System.out.println("Input the currency value (floating point with two decimal places): ");
		if (scan.hasNextFloat()) {
			float num = scan.nextFloat();
			float decimalPoint = num - (int) num;

			float decimalValue = decimalPoint * 100;
			int wholeNum = (int) num;

			System.out.println("Currency Notes:");
			System.out.println("100 number of Note(s): " + wholeNum / 100);
			wholeNum %= 100;
			System.out.println("50 number of Note(s): " + wholeNum / 50);
			wholeNum %= 50;
			System.out.println("5 number of Note(s): " + wholeNum / 5);
			wholeNum %= 5;
			System.out.println("2 number of Note(s): " + wholeNum / 2);
			wholeNum %= 2;

			System.out.println("Currency Coins:");
			System.out.println(".50 number of Coin(s): " + (int) decimalValue / 50);
			decimalValue %= 50;
			System.out.println(".25 number of Coin(s): " + (int) decimalValue / 25);
			decimalValue %= 25;

		} else System.out.println("Input must be number");
	}

	public static void activity20() {
		System.out.println("Input some text: ");
		String input = scan.nextLine();

		String[] splitted = input.split(" ");
		for (int i = 0; i < splitted.length; i++) {
			System.out.println(splitted[i]);
		}
	}

	public static void activity19() {
		System.out.print("Input the first integer: ");
		if (scan.hasNextInt()) {
			int num1 = scan.nextInt();

			System.out.print("Input the second integer: ");
			if (scan.hasNextInt()) {
				int num2 = scan.nextInt();

				if (num1 % num2 == 0) {
					System.out.println(num1 + " is a multiple of " + num2);
				} else {
					System.out.println(num1 + " is not multiple of " + num2);
				}
			} else System.out.println("Input must be integer");
		} else System.out.println("Input must be integer.");
	}

	public static void activity18() {
		System.out.print("Input the original value = ");
		if (scan.hasNextInt()) {
			int value = scan.nextInt();

			System.out.println("Absolute value = " + value * -1);
		} else System.out.println("Input must be an integer");
	}

	public static void activity17() {
		System.out.print("Input a number: ");
		if (scan.hasNextInt()) {
			int input = scan.nextInt();
			int reverse = 0;

			while (input != 0) {
				int digit = input % 10;
				reverse = reverse * 10 + digit;
				input = input / 10;
			}

			System.out.println("The reverse of the said number = " + reverse);

		} else System.out.println("Input must be integer");
	}

	public static void activity16() {
		System.out.print("Input the distance in cm: ");
		if (scan.hasNextInt()) {
			int cm = scan.nextInt();

			System.out.println("Distance of " + cm + "cms is = " + (double)(cm * 0.3937) + " inches");

		} else System.out.println("Input must be integer");
	}

	public static void activity15() {
		System.out.print("Input the length of an array: ");
		if (scan.hasNextInt()) {
			int lengthArr = scan.nextInt();
			int[] arr = new int[lengthArr];

			System.out.println("Input the array elements: ");
			for (int i = 0; i < lengthArr; i++) {
				if (scan.hasNextInt()) {
					arr[i] = scan.nextInt();
				} else {
					System.out.println("Input must be an integer");
					break;
				}
			}

			int smallest = 0;
			int position = 0;
			for (int i = 0; i < lengthArr - 1; i++) {
				if (arr[i] < arr[i + 1]) smallest = arr[i];
			}

			for (int i = 0; i < lengthArr; i++) {
				if (smallest == arr[i]) break;
				position++;
			}

			System.out.println("Smallest Value: " + smallest);
			System.out.println("Position of the element: " + position);

		} else System.out.println("input must be integer");
	}

	public static void activity14() {
		int[] grades = new int[5];

		int count = 0;
		int zeroCount = 0;
		int sum = 0;


		System.out.println("Input mathematics marks (0 to terminate)");
		for (int i = 0; i < grades.length; i++) {
			if (scan.hasNextInt()) {
				grades[i] = scan.nextInt();

				if (grades[i] <= 0) zeroCount++;
				count++;
				sum += grades[i];

			} else {
				System.out.println("Input must be whole number");
			}
		}

		float average = (float) sum / (count - zeroCount);
		System.out.printf("Average marks of mathematics: %.2f \n", average);
	}

	public static void activity13() {
		System.out.print("Input number of lines: ");
		if (scan.hasNextInt()) {
			int lines = scan.nextInt();
			int num = 1;

			for (int i = 1; i <= lines; i++) {
				for (int j = 1; j <= 3; j++) {
					System.out.print(num + " ");
					num++;
				}
				System.out.println();
			}
		} else System.out.println("Input must be Integer");
	}

	public static void activity12() {
		System.out.println("Input two numbers");

		System.out.print("x: ");
		if (scan.hasNextInt()) {
			int x = scan.nextInt();

			System.out.print("y: ");
			if (scan.hasNextInt()) {
				int y = scan.nextInt();

				if (x == 0 && y == 0) System.out.println("Undefined (not possible)");
				else if (y == 0) System.out.println("Division is not possible");
				else {
					float result = x / y;
					System.out.println("Results: " + result);
				}
			} else System.out.println("Input must be an Integer");
		} else System.out.println("Input must be an Integer");
	}

	public static void activity11() {
		System.out.println("Input the Coordinate(x,y)");

		System.out.print("x: ");
		if (scan.hasNextInt()) {
			int x = scan.nextInt();

			System.out.print("y: ");
			if (scan.hasNextInt()) {
				int y = scan.nextInt();

				if (x > 0 && y > 0) System.out.println("Quadrant-I(+,+)");
				if (x < 0 && y > 0) System.out.println("Quadrant-II(-,+)");
				if (x < 0 && y < 0) System.out.println("Quadrant-III(-,-)");
				if (x > 0 && y < 0) System.out.println("Quadrant-IV(+,-)");
				if (x == 0 || y == 0) System.out.println("No Quadrant because x or y is 0");

			} else System.out.println("Input must be an Integer");

		} else System.out.println("Input must be an Integer");

	}

	public static void activity10() {
		while(true) {
			System.out.print("Input password: ");
			if (scan.hasNextLine()) {
				String password = scan.nextLine();

				if (password.equals("1234")) {
					System.out.println("Correct Password");
					break;
				} else {
					System.out.println("Incorrect Password");
				}
			} else {

			}
		}
	}

	public static void activity9() {

		int[] nums = new int[5];
		String[] text = {"first", "second", "third", "fourth", "fifth"};
		int posiNum = 0;
		int negaNum = 0;

		for (int i = 0; i < text.length; i++) {
			System.out.print("Input the " + text[i] + " number: ");
			nums[i] = scan.nextInt();

			if (nums[i] > 0) posiNum++;

			if (nums[i] < 0) negaNum++;

		}

		System.out.println("Number of positive numbers: " + posiNum);
		System.out.println("Number of negative numbers: " + negaNum);
	}

	public static void activity8() {
		String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

		System.out.print("Input 1-12 for months: ");
		if (scan.hasNextInt()) {
			int input = scan.nextInt();

			System.out.println(months[input - 1]);
		} else {
			System.out.println("Input must be whole number");
		}

	}

	public static void activity7() {

		System.out.print("Input seconds: ");
		if (scan.hasNextInt()) {
			int input = scan.nextInt();
			int hours = input / 3600;
			int minutes = (input % 3600) / 60;
			int seconds = input % 60;

			System.out.println("H:M:S - " + hours + ":" + minutes + ":" + seconds);

		} else {
			System.out.println("Input must be whole number");
		}
	}

	public static void activity6() {

		System.out.print("Input the amount: ");
		if (scan.hasNextInt()) {
			int input = scan.nextInt();

			System.out.println(input/100 + " Note(s) of 100.00");
			input = input % 100;

			System.out.println(input/50 + " Note(s) of 50.00");
			input = input % 50;

			System.out.println(input/20 + " Note(s) of 20.00");
			input = input % 20;

			System.out.println(input/10 + " Note(s) of 10.00");
			input = input % 10;

			System.out.println(input/5 + " Note(s) of 5.00");
			input = input % 5;

			System.out.println(input/2 + " Note(s) of 2.00");
			input = input % 2;

			System.out.println(input/1 + " Note(s) of 1.00");
			input = input % 1;

		} else {
			System.out.println("Input must be whole number");
		}
	}

	public static void activity5() {

		System.out.print("Input x1: ");
		int x1 = scan.nextInt();
		System.out.print("Input y1: ");
		int y1 = scan.nextInt();
		System.out.print("Input x2: ");
		int x2 = scan.nextInt();
		System.out.print("Input y2: ");
		int y2 = scan.nextInt();

		double result = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
		System.out.printf("Distance between the said two points: %.4f \n", result);
	}

	public static void activity4() {

		System.out.print("Input the first integer: ");
		int num1 = scan.nextInt();
		System.out.print("Input the second integer: ");
		int num2 = scan.nextInt();
		System.out.print("Input the third integer: ");
		int num3 = scan.nextInt();

		int max = num1;
		if (num1 < num2) max = num2;
		if (max < num3) max = num3;

		System.out.println("Maximum value of three integeres: " + max);
	}

	public static void activity3() {

		System.out.print("Enter your ID number: ");
		String id = scan.nextLine();

		System.out.print("Input your working hours: ");
		if (scan.hasNextInt()) {
			int hours = scan.nextInt();

			System.out.print("Input Salary amount/hr: ");
			if (scan.hasNextInt()) {
				int salaryPerHr = scan.nextInt();

				float salary = salaryPerHr * hours;
				System.out.println("Employees ID = " + id);
				System.out.printf("Salary U$ %.2f \n", salary);
			}
		} else {
			System.out.println("The working hours must be a number");
		}
	}

	public static void activity2() {

		System.out.print("Enter height: ");

		if (scan.hasNextFloat()) {
			float height = scan.nextFloat();

			System.out.print("Enter width: ");
			if (scan.hasNextFloat()) {
				float width = scan.nextFloat();

				float perimeter = (height + width) * 2;
				float area = height * width;

				System.out.println("Perimeter of the rectangle: " + perimeter);
				System.out.println("Area of the rectangle: " + area);

			} else {
			System.out.println("Input must be a number");
			}


		} else {
			System.out.println("Input must be a number");
		}
	}

	public static void activity1() {
		String name = "Jerson Jay C. Bonghanoy";
		String semester = "1st";
		String sy = "2025 - 2026";
		String degree = "Bachelor of Science in Information Technology";

		System.out.println("Name: " + name);
		System.out.println("Semester: " + semester);
		System.out.println("School year: " + sy);
		System.out.println("Degree Program: " + degree);
	}
}