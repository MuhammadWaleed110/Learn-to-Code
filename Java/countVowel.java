import java.util.Scanner;
public class countVowel {
    public static void main(String[]args){
        Scanner sin = new Scanner(System.in);
        System.out.print("Text: ");
        String str = sin.nextLine();
        boolean inLowerCase, inUpperCase;
        int vowelC = 0;
        int consonantC = 0;
        int whiteSpaces=0;
        int alphabets=0;
        for(int a = 0; a < str.length(); a++ ){
            char c = str.charAt(a);
            inLowerCase = ( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
            inUpperCase = ( c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
            if(c==' '){
                whiteSpaces++;
            }
            else if(inLowerCase||inUpperCase){
                vowelC++;
                alphabets++;
            }
            else{
                consonantC++;
                alphabets++;
            }
        }
        System.out.println("Vowels: "+vowelC);
        System.out.println("Consonants: "+consonantC);
        System.out.println("Total Alphabets: "+alphabets);
        System.out.println("WhiteSpae: "+whiteSpaces);
        System.out.println("Total Characters: "+str.length());
    }
}
