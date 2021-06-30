package com.company;

public class Main {

    public static void main(String[] args) {
        // Write a program that can count the number of vowels in a string and return
        // an interactive response.

        // { a, e, i, o, u }
        char[] vowels = {'a', 'e', 'i', 'o', 'u'}; // initialized an array variable to hold vowels.
        String apple = "watermelon";  // created a string variable to evaluate.
        // 1. change apple to char array.
        // 2. loop through apple.

        //1. change apple to char array
        char[] appleArray = apple.toCharArray(); // {'a', 'p', 'p', 'l', 'e'}
        int vowelCounter = 0; // counter to count how many vowels are in the string
//        for(int i = 0; i < appleArray.length; i++) { // loops through apple array
//            for (int j = 0; j < vowels.length; j++) {
//                if (appleArray[i] == vowels[j]) { // if the current value of appleArray is a vowel then
//                    // increase counter by and break loop in order not to count a vowel twice.
//                    vowelCounter++;
//                    break;
//                }
//            }
//        }

        // in arrays, .length is a field. but in strings, .length() is a
        // method, so you have to add parentheses after is like .length()
//        for (int i = 0; i < apple.length(); i++) {
//            for(int j = 0; j < vowels.length; j++) {
//                if (apple.charAt(i) == vowels[j]) {
//                    vowelCounter++;
//                    break;
//                }
//            }
//        }

        // switch
        // 1. Loop through the string
        // 2. use a switch to evaluate the current value of the string/ the current character
        // 3. increase vowel counter by one for each vowel we encounter.
        // 4. output my result
        for(int i = 0; i < apple.length(); i++) {
            switch (apple.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowelCounter++;
                    break;
            }
        }

//        System.out.println("The number of vowels in " + apple + " is " + vowelCounter);


        String seven = "7";
        String eight = "8";

        System.out.println(Integer.parseInt(seven) + Integer.parseInt(eight));




    }
}