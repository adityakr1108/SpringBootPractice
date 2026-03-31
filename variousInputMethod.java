import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner; 
class variousInputMethod {
    public static void main(String args[]) throws IOException {
        System.out.println("This is the various input method class.");
        // scanner class is used to take input from the user. It is a part of java.util package. It provides various methods to take input of different data types. It also provides methods to read a line of text, a word, or a character.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num1 = sc.nextInt();
        System.out.println("You entered: " + num1);
        sc.nextLine(); // consume the newline character left by nextInt()
        // System.in.read() method is used to read a single byte of data from the input stream. It returns the ASCII value of the character entered by the user. It throws IOException if an I/O error occurs.
        try {
            System.out.print("Enter a character: ");
            int num = System.in.read();
            sc.nextLine(); // consume the newline character left by System.in.read()
            System.out.println("You entered: " + (char)num);  // gives the character representation of the ascii value ( actual number will be printed if we do not cast it to char)
            System.out.println("You entered: " + num); // gives ascii value of the character
        } catch (Exception e) {
            e.printStackTrace();
        }

        // BufferedReader class is used to read text from a character-input stream. It is a part of java.io package. It provides methods to read a line of text, a word, or a character. It also provides methods to read a line of text, a word, or a character.
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a line of text: ");
        String line = bf.readLine();
        System.out.println("You entered: " + line);
        System.out.print("Enter an integer: ");
        int num = Integer.parseInt(bf.readLine()); // to read an integer using BufferedReader, we need to parse the string input to an integer using Integer.parseInt() method.
        System.out.println("You entered: " + num);
        bf.close();
    }
}