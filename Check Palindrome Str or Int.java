import java.util.Scanner;

class palindromeOrNot{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("* Check Palindrome *");
        System.out.print("Enter Num/Str: ");
        String numList=sc.next();

        int startIndex=0;
        int endIndex=numList.length()-1;
        int count=numList.length();
        boolean palindrome=true;

        while(true){
            if (count==0){
                break;
            }
            else if (numList.charAt(startIndex)==numList.charAt(endIndex)){

            }
            else {
                palindrome=false;
            }
            startIndex++;
            endIndex--;
            count--;
        }
        if (palindrome){
            System.out.println("Yes Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
