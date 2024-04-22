/**
 * This program uses two overloaded methods to count English letters within a sentence inputted by the user. The first method tests to see how many English letters 
 * are in a sentence inputted by the user. The second method determines how many times a specified character occurs in the sentence. If there are no occurences, a 
 * zero is returned, and if the character is not an English letter, -1 is returned. 
 *
 * Kylie Heiland
 * 
 * Project06
 * 
 * 3/10/22
 * 
 * 
 */
import java.util.Scanner; 
public class KylieHeilandProject06
{
    public static void main(String[] args) 
    {
        char ans;
        do{
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String sentence = input.nextLine();
        
        System.out.print("Enter a char: ");
        char letter = input.next().charAt(0);
        
        System.out.println("The result of calling function int countLetters(String s) is: " + countLetters(sentence));
     
        System.out.println("The result of calling function int countLetters(String s, char c) is: " + countLetters(sentence, letter));
        
        System.out.print("Do you want to do another test? Y/N: ");
        ans = input.next().charAt(0);
        
        if((!Character.isLetter(ans)) || (ans != 'Y' && ans != 'y' && ans != 'n' && ans != 'N')){
            System.out.print("Incorrect character. Please choose Y or N: ");
            ans = input.next().charAt(0);
        }
    }while(ans == 'Y' || ans == 'y');
    System.out.println("Goodbye!");
    }
    
    public static int countLetters(String s)
    {
        int count = 0;
        for(int i = 0; i <= s.length() - 1; i++)
        { //Loops through the sentence, counting all English letters
            if(Character.isLetter(s.charAt(i)))
            { //Checks on whether a char is an English letter.
                count++; //If a char is a letter, it is counted.
                //System.out.println(s.charAt(i)); //Prints out what exactly char is being outputted. Used for testing purposes! 
            }
        }
        return count; //Returns the total amount of letters found in a sentence.
    }
    
   
    public static int countLetters(String s, char c)
    {
        int count = 0;
        int compare = 0;
        char test;
        
        //Checks on whether the character entered is an English letter.
        if(!Character.isLetter(c))
        { //If the character the user inputted is not an English letter, -1 is returned
            return -1;
        }
        else
        { //If the character is an English letter, it is changed to uppercase. This program is not case sensitive and it is easier if all characters are the
             //same case (this could easily be changed to lower case as long as both the string chars and this char match cases).
           c = Character.toUpperCase(c); 
        }
        
        for(int i = 0; i <= s.length() - 1; i++)
        { //Loops through the sentence, checking if c matches any particular chars.
            if(Character.isLetter(s.charAt(i)))
            { //If the character in the sentence is a letter, then this body will be executed, else the loop will iterate.
                test = Character.toUpperCase(s.charAt(i)); //Changes the English letter to uppercase so that it matches the same case as the char the user inputted.
                compare = Character.compare(c, test); //Compares both uppercase chars. 
                if(compare == 0) //If both uppercase chars equal one another, then count is updated.
                {
                    count++;
                }
                

        }
    }
    return count; //Returns the total number of times the inputted character is in the inputted sentence.
}
}

/* OUTPUT:
 * 
 * Enter a string: The last city I wanted to visit was Boston.
Enter a char: t
The result of calling function int countLetters(String s) is: 34
The result of calling function int countLetters(String s, char c) is: 7
Do you want to do another test? Y/N: y

Enter a string: The findings of a new study that looked at the heart of a swimmer vs the heart of a runner underscored how sensitive our bodies are to different types of exercise.
Enter a char: 
L
The result of calling function int countLetters(String s) is: 132
The result of calling function int countLetters(String s, char c) is: 1
Do you want to do another test? Y/N: @
Incorrect character. Please choose Y or N: Y

Enter a string: R3sp3ct f1nd 0ut wh@t it means 2 me!
Enter a char: t
The result of calling function int countLetters(String s) is: 22
The result of calling function int countLetters(String s, char c) is: 4
Do you want to do another test? Y/N: 0
Incorrect character. Please choose Y or N: Y

Enter a string: r3d d3@d r3d3mpti0n is the best g@me!
Enter a char: d
The result of calling function int countLetters(String s) is: 23
The result of calling function int countLetters(String s, char c) is: 4
Do you want to do another test? Y/N: Y

Enter a string: no
Enter a char: o
The result of calling function int countLetters(String s) is: 2
The result of calling function int countLetters(String s, char c) is: 1
Do you want to do another test? Y/N: y

Enter a string: hey there
Enter a char: w
The result of calling function int countLetters(String s) is: 8
The result of calling function int countLetters(String s, char c) is: 0
Do you want to do another test? Y/N: y

Enter a string: howdy partner!
Enter a char: 0
The result of calling function int countLetters(String s) is: 12
The result of calling function int countLetters(String s, char c) is: -1
Do you want to do another test? Y/N: n
Goodbye!
 */
