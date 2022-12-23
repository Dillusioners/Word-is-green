/*
 * Author - Tommy Shelby#6605
 * word - human
 * Team - Dillusioners
 * Level - 2
 */
import java.util.*;

public class Human {
    //display() method for user to understand the program
    public static void display()
    {
        System.out.println("###############################################");
        System.out.println("          Welcome to the Human searcher        ");
        System.out.println("###############################################");
    }
    //The solve(int n) method, the most important method in the program
    public static void solve(int n)
    {
        //Initialising a hashmap
        HashMap<Integer,String> nameMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        try{
        //Putting human name and age in the hashmap after running loops
        for(int i=1;i<=n;i++){
            System.out.println(">> Enter the name of the person "+i+": ");
            String g = sc.next();
            System.out.println(">> Enter the age of "+g+" :");
            int humans = sc.nextInt();
            nameMap.put(humans,g);
        }
        //After that is done we ask for the age it is trying to find
        System.out.println(">> To find the human you are looking for enter the age of that human :");
        int choice_human = sc.nextInt();
        //If key exists we print the name of the human
        if(nameMap.containsKey(choice_human)){
            System.out.println(" Name : "+nameMap.get(choice_human));
        }
        //Else we say such a person does not exist
        else{
            System.out.println("Such a human does not exist in your region :(");
        }
        sc.close();
        }
        //Catching some minor exceptions
        catch(Exception e)
        {
            System.out.println(">> Something went wrong :( ");
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        //Invoking display method
        display();
        try{
        //Taking inputs
        Scanner sc = new Scanner(System.in);
        System.out.println(">> Enter the name of your country : ");
        String area = sc.next();
        System.out.println(">> Enter the number of humans nearly in "+area);
        int humans = sc.nextInt();
        //Solving program
        solve(humans);
        sc.close();
        }
        catch(Exception e){
            System.out.println(">> Something went wrong :( ");
            e.printStackTrace();
        }

    }
}
// Program ends
