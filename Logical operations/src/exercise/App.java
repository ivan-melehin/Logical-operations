package exercise;


public class App {
    public static String rev(String s){//named method rev and type String
        return new StringBuilder(s).reverse().toString();// used method StringBuilder to s that reverse and toString()
    }

    public static boolean isPalindrome(String word){//method checks equal word itself after reverse or not
        var reWord= rev(word);//make a variable that flips the main word
        return word.equalsIgnoreCase(reWord);//return function that compare main word with reWord,ignore case
    }

    public static void main(String[] args){//check github
        var result = App.isPalindrome("Fuf");//input word
        System.out.println(result); // output result ture or false
    }

}

