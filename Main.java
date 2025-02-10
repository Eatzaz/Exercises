import java.util.Scanner;
import java.util.SortedMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       //1-Develop a program that takes the weight (in kilograms) and height (in meters)
        //as input and calculates the BMI, then prints it.
        Scanner data =new Scanner(System.in);
       System.out.println("enter weight:");
        int weight = data.nextInt();
        System.out.println("enter heiht:");
        double height = Double.parseDouble(data.next());
        double BMI=(weight/(height*height));
        System.out.println("the calculates "+weight+"kg and"+height+"m ="+BMI);
        //2-Write a program that takes the obtained marks and total marks as input and
        //calculates the percentage, then prints it.
        System.out.println("enter obtained:");
        double obtained=data.nextDouble();
        System.out.println("enter total marks:");
        double total_marks =data.nextDouble();
        double percentage=((obtained/total_marks)*100);
        System.out.println("the calculates "+obtained+"/"+total_marks+"*100 ="+percentage);


        //3- Create a program that takes an amount in one currency and an exchange rate
        //as input, then converts and prints the amount in another currency.
        System.out.println("enter total Amount in USD:");
        double USD=data.nextDouble();
        System.out.println("enter total Amount in EUR:");
        double EUR= Double.parseDouble(data.next());
        double converts=EUR*USD;
        System.out.println(converts);
//4. Create a program that takes a string as input, calculates its length, and then
//reverses the string using the StringBuilder class, finally printing both the length and
//reversed string.

        String user_string="Hello, World!" ;
        StringBuilder dat=new StringBuilder();
        dat.append(user_string);
        System.out.println("Length of the string:"+dat.length() +" And Reversed string:"+dat.reverse());
//5- Develop a program that takes a sentence as input and extracts a substring from
//it, then prints the extracted substring.

        String sentence="The quick brown fox jumps over the lazy dog";
        System.out.println(sentence.substring(10 ,20));
        // 6.Write a program that takes a sentence and a keyword as input, then check if
        //the keyword is present in the sentence and prints the result.
        String sentence2= "The quick brown fox jumps over the lazy dog";
        String keyword="jumps";
        System.out.println(" Keyword \"jumps\" is present in the sentence? "+sentence2.contains(keyword));
//7-Develop a program that takes a sentence and a word to replace as input, then
//replace all occurrences of the word with another word and prints the modified
//sentence.
        String sentence3= "The quick brown fox jumps over the lazy dog";
        sentence3.replace("fox","cat");
        System.out.println("\"The quick brown cat jumps over the lazy dog\" ");

        //8-Write a program that takes two strings as input and check if they are equal,
        //ignoring the case, then prints whether they are equal or not.
        String String1="Hello";
        String String2="hello";
        System.out.printf(String.valueOf(String1.equals(String2)));

    }
        }
