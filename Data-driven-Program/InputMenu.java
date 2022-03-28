import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

public class InputMenu {
    public static void main(String[] args){
        int choice ;
        Scanner s = new Scanner(System.in);

            System.out.println("1.Add a user");
            System.out.println("2.Delete a user");
            System.out.println("3.Update a user");
            System.out.println("4.List users");
            System.out.println("Enter your Options: ");
            choice = s.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Add a user selected");
                Scanner input = new Scanner(System.in);
                boolean isValid;
                String name;
                while (true) {
                    System.out.print("What is your name: ");
                    name = input.next();
                    isValid = true;
                    for (int i = 0; i < name.length(); i++) {
                        char ch = name.charAt(i);
                        if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                            continue;
                        } else {
                            isValid = false;
                            break;
                        }
                    }
                    if (isValid) {
                        break;
                    } else {
                        System.out.println("Invalid name");
                        //return;
                    }
                }

                while (true) {
                    System.out.print("What is your surname: ");
                    String surname = input.next();
                    isValid = true;
                    for (int i = 0; i < name.length(); i++) {
                        char ch = surname.charAt(i);
                        if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                            continue;
                        } else if (surname.isEmpty()) {
                            isValid = false;
                            break;
                        } else {
                            isValid = false;
                            break;
                        }
                    }
                    if (isValid) {
                        break;
                    } else {
                        System.out.println("Invalid surname");

                    }
                }

                System.out.print("Please Enter Your Email To Validate: ");
                Scanner input = new Scanner (System.in);
                String email  = input.nextLine();
                boolean flag=false;
                int countr=0,countd=0;
                loop:for (int i=0; i < email.length();i++) {                 //Better to iterate loop till end of the String "email"
                    if(email.charAt(i)=='@'){
                        countr++;
                        if(countr>1){
                            flag=false;
                            break loop;
                        }
                        if(i>=1)
                            flag=true;
                        else{
                            flag=false;
                            break loop;
                        }
                    }
                    if(email.charAt(i)=='.'){
                        countd++;
                        if(countd>1){
                            flag=false;
                            break loop;}
                        if(i>=3)
                            flag=true;
                        else{
                            flag=false;
                            break loop;}
                        if(email.length()>=i+3)
                            flag=true;
                        else{
                            flag=false;
                            break loop;}
                    }
                    if((email.indexOf(".")-email.indexOf("@"))>=2)
                    {
                        flag=true;}
                    else {
                        flag=false;
                        break loop;}
                    if(((int)email.charAt(i))>=65 && ((int)email.charAt(i))<=90)
                        flag=true;
                    else if(((int)email.charAt(i))>=97 && ((int)email.charAt(i))<=122)
                        flag=true;
                    else if(((int)email.charAt(i))>=48 && ((int)email.charAt(i))<=57)
                        flag=true;
                    else if(((int)email.charAt(i))==64 || ((int)email.charAt(i))==46)
                        flag=true;
                    else
                        flag=false;
                    //@ must at least have a char before itself and also there must be a character between '@' and '.'--So mininmum index of '@' >=1 and for '.' >=3.
                    if(flag==false)
                        break loop;
                }
                if(flag==true && email.length()>=5)    // The minimum length of the String must be equal to minimum index of '.' +2, i.e., >=5.
                    System.out.println("Validated");
                else
                    System.out.println("Invalid Email");
        }

            case 2:
                System.out.println("Option 2 selected");
                break;
            case 3:
                System.out.println("Exit selected");
                break;
            default:
                System.out.println("Invalid selection");
                break; // This break is not really necessary
        }
    }
}