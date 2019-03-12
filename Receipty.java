/*
 Idehen Emmanuel
 1/18/2018
 CS221-Java Programming
 
 Program: This program prompts a User for a store name, username, date and shows the user a list or a menu of items 
 present at the store and asks the users gender. This program takes the user name,store name,date and store them in 
 different variables. It asks the user what they wish to buy, once determined, the program checks if there is a 
 discount,it calculates the discount from the item price, it calculates the tax, and total amount after item price,
 discount and tax of 7% and checks the users gender for promotion and outputs the users receipt.
 
 
 ***Design (Pseudo/Algorithm)***
 Declare class, Create Scanner object, Declare global Variable, prompt User for store name, input store name, prompt user for name,
 input name, prompt user to enter date, print store items, prompt user to choose an item, check which item the user selects.
 prompt the user to input gender selection. calculate the receipt of the User based on the gender, choice of item and prints details.
 
 *******************************
 */

import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;


public class Receipty
{
    
    public static void main(String[] args) throws Exception 
    
    {
        
        //....................................
        Scanner scan = new Scanner(System.in);
        //...................................
         DecimalFormat money = new DecimalFormat("0.00"); // Decimal Formatter 
        //...................................
        DecimalFormat pricePattern = new DecimalFormat("0.00"); // Decimal Formatter
        //...................................
        
        // Global Variable declaration
        String Name,Gender;
      
        String storeName;
        int Date;
        String storeItem;
        //.......................//
        double Total;
        double Discount;
        double Amount;
        String Promotion;
        double Tax;
        //String printer;
        double salesTax, percent;
        salesTax = 0.07; // giving saletax
        percent = 100; //set percent to 100.
        
        
        
        // store name
        System.out.println("what is the store name?");
        String storeName1 = scan.nextLine();
        
        // users name
        System.out.println("what is your name?");
        String Name1 = scan.nextLine();
        
        // date format
        System.out.print("Enter todays date in format: January 12,2018");
        System.out.println("\nEnter month");
        String month1 = scan.nextLine();
        System.out.println("enter day");
        int day = scan.nextInt();
        System.out.println("enter year");
        int year = scan.nextInt();
        // welcome the user  and show the the list of available items in the store and prompt them to choose item number
        System.out.println("Hello"+" " + Name1 +" " +"welcome to"+" " + storeName1 +"\n"+month1+ " "+ day+","+ " "+year);
        //............................................//
        System.out.println("\nStore Items");
        System.out.println("\n ............................................");
        System.out.println("\n(1) Printer: $23.99   (20% off discount)"+ "\n(2) flash drive: $10.35"+ "\n(3) mouse: $6.75"+ "\n(4) Notebook: $399.53 (15% off discount)");
        System.out.println("...............................................");
        System.out.println("\nEnter the item number you wish to buy");
        String itemSelected = scan.next();
        
      
        //Calculate itemSelected by user.
        switch (itemSelected)
        {
                //printer
            case"1":
            		// Local Variable definition 
                double newamount, discount1, amount, amount1, originalamount1;
                originalamount1 = 23.99;
                discount1 = 20;
                amount = (discount1 / percent) * originalamount1;
                newamount = amount;
                amount1 = discount1 - newamount;
                Tax = amount1 * salesTax;
                Total = salesTax + amount;
                
                
                // Gender
                // prompt user to select their gender 
                System.out.println("what Gender do you classify yourself?");
                // users output
                String Gender1 = scan.next();
                System.out.println("...............................");
                System.out.println(storeName1);
                System.out.println(Name1 + "-" + month1 +" "+ day + "," + year);
                System.out.println("...............................");
                System.out.printf("%-15s %3s %5s %n","Printer","$", money.format(originalamount1));
                System.out.printf("%-15s %9s %n","Discount", discount1+("%"));
                System.out.printf("%-15s %9s %n","SubTotal",money.format(amount1));
                System.out.printf("%-15s %3s %5s %n","Tax" ,"$", money.format(Tax));
                System.out.printf("%-15s %3s %5s %n","Total" ,"$", money.format(Total));
                System.out.println("...............................");
                // Gender 
                switch(Gender1)
                {
	                 // male    
	                case"male":
	                case"m":
	                case"M":
	                case"Male":
	                    
	                    System.out.printf("Promotion"+ ("     ")+ "Free Bracelet");
	                    break;
	                case"f": // female 
	                case"F":
	                case"Female":
	                case"female":
	                    System.out.println("Promotion"+ ("     ")+ "Free Bracelet");
	                    break;
	                    
	                default:
	                    
                }
                
                
                System.out.println("\n...............................");
                
                break;
                
                //flash drive
            case"2":
           
          //  case"Flash drive":
            		//local variable definition.
                double amount2, newamount2, Total2;
                amount2 = 10.35;
                newamount2 = amount2 * salesTax;
                Total2 = salesTax + amount2;
                
                // Gender
                // prompt user to select their gender 
                System.out.println("what Gender do you classify yourself?");
                //Takes user gender 
                String Gender2 = scan.next();
                System.out.println("...............................");
                System.out.println(storeName1);
                System.out.println(Name1 + "-" + month1 + day + "," + year);
                System.out.println("...............................");
                //User Receipt for selected Item(Flash Drive)
                System.out.printf("%-15s %3s %5s %n", "Flash Drive","$", money.format(amount2));
                System.out.printf("%-15s %9s %n", "Subtotal", money.format(amount2));
                System.out.printf("%-15s %3s %5s %n","Tax","$", money.format(newamount2));
                System.out.printf("%-15s %3s %5s %n","Total","$", money.format(Total2));
                
                System.out.println("...............................");
                switch(Gender2)
                {
	                //Male   
	                case"male":
	                case"m":
	                case"M":
	                case"Male":
	                    //Outputs Free Watch for male
	                    System.out.println("Promotion"+ ("     ")+ "Free Watch");
	                    break;
	                //Female    
	                case"f":
	                case"F":
	                case"Female":
	                case"female":
	                		//Outputs Free Bracelet for female
	                    System.out.println("Promotion"+ ("     ")+ "Free Bracelet");
	                    break;
	                 //optional default   
	                default:
                    
                }
                
                
                System.out.println("...............................");
                
                break;
                
                //MOUSE
            case"3":
            
            	    //Local Variable Declaration
                double amount3, newamount3, Total3;
                amount3 = 6.75;
                //calculates Total and Tax
                newamount3 = amount3 * salesTax;
                Total3 = salesTax + amount3;
                
                // Gender
                // prompt user to select their gender 
                System.out.println("what Gender do you classify yourself?");
                //Takes Users gender
                String Gender3 = scan.next();
                System.out.println("...............................");
                System.out.println(storeName1);
                System.out.println(Name1 + "-" + month1 + day + "," + year);
                System.out.println("...............................");
                // Outputs Receipt for selected Item(Mouse)
                System.out.printf("%-15s %3s %5s %n","Mouse","$" ,money.format (amount3));
                System.out.printf("%-15s %9s %n","Subtotal" ,money.format (amount3));
                System.out.printf("%-15s %3s %5s %n","Tax","$" ,money.format (newamount3));
                System.out.printf("%-15s %3s %5s %n","Total","$" ,money.format (Total3));
               // Sytem.out.printf()
                System.out.println("...............................");
                switch(Gender3)
                {
                    //Male
	                case"male":
	                case"m":
	                case"M":
	                case"Male":
	                    //Output Free Watch for male
	                    System.out.println("Promotion"+ ("     ")+ "Free Watch");
	                    break;
	                 //Female 
	                case"f":
	                case"F":
	                case"Female":
	                case"female":
	                		//Output Free Bracelet for Female
	                    System.out.println("Promotion"+ ("     ")+ "Free Bracelet");
	                    break;
	                 //optional default   
	                default:
                    
                }
                
                
                System.out.println("...............................");
                
                break;
                
                //NOTEBOOK
            case"4":
            
            		//Local Variable declaration 
                double amount4, newamount4,discount4, Total4, originalamount4,amountint;
                discount4 = 15;
                originalamount4 = 399.53;
                //calculate subtotal, tax, total 
                amount4 = ( discount4 / percent);
                amount4 = amount4 * originalamount4;
                newamount4 = amount4;
                amountint = discount4 - newamount4;
                Tax = amountint * salesTax;
                Total4 = Tax + amountint;
                
                
                
                // Gender
                // prompt user to select their gender 
                System.out.println("what Gender do you classify yourself?");
                // Takes Users gender 
                String Gender4 = scan.next();
                System.out.println("...............................");
                System.out.println(storeName1);
                System.out.println(Name1 + "-" + month1+" " + day + "," + year);
                System.out.println("...............................");
                //outputs Receipt for selected item(Notebook)
                System.out.printf("%-15s %3s %5s %n","Notebook","$", money.format(originalamount4));
                System.out.printf("%-15s %9s %n","Discount", discount4 +("%"));
                System.out.printf("%-15s %9s %n","SubTotal",money.format(amountint) );
                System.out.printf("%-15s %3s %5s %n","Tax","$", money.format(Tax));
                System.out.printf("%-15s %3s %5s %n","Total","$", money.format(Total4));
                System.out.println("...............................");
                switch(Gender4)
                {
                    // Male
	                case"male":
	                case"m":
	                case"M":
	                case"Male":
	                    //output Free Watch for male
	                    System.out.println("Promotion"+ ("     ")+ "Free Watch");
	                    break;
	                //Female   
	                case"f":
	                case"F":
	                case"Female":
	                case"female":
	                	    //Outputs Free Bracelet for female
	                    System.out.println("Promotion"+ ("     ")+ "Free Bracelet");
	                    break;
	                 //optional default 
	                default:
                    
                }
                
                
                System.out.println("...............................");
                
                
                break;
            //optional default   
            default:
                
        }
        
        
        //Output Thank you for shopping with us 
        //....................................
        //....................................
        System.out.print("\nThank you for shopping with us!");
    }
    
    
    
}
/*
 * Test cases 
 * 
what is the store name?
Java Programming & Stuff
what is your name?
Marcus Golden
Enter todays date in format: January 12,2018
Enter month
October
enter day
30
enter year
2013
Hello Marcus Golden welcome to Java Programming & Stuff
October 30, 2013

Store Items

 ...................................

(1) Printer: $23.99   (20% off discount)
(2) flash drive: $10.35
(3) mouse: $6.75
(4) Notebook: $399.53 (15% off discount)
...............................................

Enter the item nunber you wish to buy
1
what Gender do you classify yourself?
male
...............................
Java Programming & Stuff
Marcus Golden-October 30,2013
...............................
Printer           $ 23.99 
Discount            20.0% 
SubTotal            15.20 
Tax               $  1.06 
Total             $  4.87 
...............................
Promotion     Free Bracelet
...............................

Thank you for shopping with us!
......................................
what is the store name?
Walgreens store
what is your name?
Emmauel Osagumwenro
Enter todays date in format: January 12,2018
Enter month
January
enter day
28
enter year
1991
Hello Emmauel Osagumwenro welcome to Walgreens store
January 28, 1991

Store Items

 ...................................

(1) Printer: $23.99   (20% off discount)
(2) flash drive: $10.35
(3) mouse: $6.75
(4) Notebook: $399.53 (15% off discount)
...............................................

Enter the item nunber you wish to buy
3
what Gender do you classify yourself?
male
...............................
Walgreens store
Emmauel Osagumwenro-January28,1991
...............................
Mouse             $  6.75 
Subtotal             6.75 
Tax               $  0.47 
Total             $  6.82 
...............................
Promotion     Free Watch
...............................

Thank you for shopping with us!
 ............................................
 what is the store name?
Computer scince and Mathematics
what is your name?
Precious Idehen
Enter todays date in format: January 12,2018
Enter month
November 
enter day
29
enter year
2017
Hello Precious Idehen welcome to Computer scince and Mathematics
November  29, 2017

Store Items

 ............................................

(1) Printer: $23.99   (20% off discount)
(2) flash drive: $10.35
(3) mouse: $6.75
(4) Notebook: $399.53 (15% off discount)
...............................................

Enter the item number you wish to buy
3
what Gender do you classify yourself?
f
...............................
Computer scince and Mathematics
Precious Idehen-November 29,2017
...............................
Mouse             $  6.75 
Subtotal             6.75 
Tax               $  0.47 
Total             $  6.82 
...............................
Promotion     Free Bracelet
...............................

Thank you for shopping with us!
 
 
 
 
 */
