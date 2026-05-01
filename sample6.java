import java.util.*;
class sample5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your task: ");
        String string = sc.nextLine();
        samp o = new samp();
        o.todo(string);
        
    }
}
class samp{
    void todo(String s){
        if(s.isEmpty() || s.isBlank()){
            System.out.println("You haven't entered any message");
        }
        else{
            System.out.println("You have entered: " + s);
        }
    }
}