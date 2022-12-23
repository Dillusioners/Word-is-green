/**
 * Team - Dillusioners
 * Word - Green
 * Info - This program enables you to find a forest by the number of trees it has
 */

//Importing util package
import java.util.*;

public class Green {
    //display() method for user to understand the program
    public static void display()
    {
        System.out.println("###############################################");
        System.out.println("      Welcome to the forest tree searcher      ");
        System.out.println("###############################################");
    }
    //The solve(int n) method, the most important method in the program
    public static void solve(int n)
    {
        //Initialising a hashmap
        HashMap<Integer,String> forestMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        try{
        //Putting forest name and number of trees in it in the hashmap after running loops
        for(int i=1;i<=n;i++){
            System.out.println(">> Enter the name of forest number "+i+": ");
            String f = sc.next();
            System.out.println(">> Enter the number of trees in the forest :");
            int tree = sc.nextInt();
            forestMap.put(tree,f);
        }
        //After that is done we ask for the number of trees in the forest user is trying to find
        System.out.println(">> To find the forest you are looking for enter the number of trees in it :");
        int choice_tree = sc.nextInt();
        //If key exists we print the name of forest
        if(forestMap.containsKey(choice_tree)){
            System.out.println(choice_tree +" Trees exist in forest : "+forestMap.get(choice_tree));
        }
        //Else we say such a forest doesn't exist
        else{
            System.out.println("Such a forest doesn't exist in your region :(");
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
        System.out.println(">> Enter the name of your area : ");
        String area = sc.nextLine();
        System.out.println(">> Enter the number of forests in "+area);
        int forests = sc.nextInt();
        //Solving program
        solve(forests);
        sc.close();
        }
        catch(Exception e){
            System.out.println(">> Something went wrong :( ");
            e.printStackTrace();
        }
        
    }
}
// Program ends
