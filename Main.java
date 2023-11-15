/* 100% Financial Advisor
  This program finds the stocks that the user has and outputs it's financial wisdom to the user

  Programmer: A K
  Last Programmed by: A K
  Last Edit: 05/07/2023
*/

import java.util.*;

class Main {
  public static void main(String[] args) {
    
    boolean again = true;
    do{
      String volatility = userVolatility();//get volatility of stock market
      
      String company = userCompany();//get type of company
  
      int amount = userAmount();//get amount of shares
  
      double price = userPrice();//get price per share   
  
      userInfo(company, volatility, amount, price);//print out info

      again = runAgain();//ask if user wants to run the program again
    }while(again);
    
  }//end main method

  /**
  * Method to ask for volatility
  * @return volatility as a String
  */
  public static String userVolatility(){
    Scanner keyboard = new Scanner(System.in);
    
    String u, volatility;
    
    do{
      clearScreen();
      
      System.out.print("Please select the volatility of today's market\nMenu:\n1) Very Volatile\n2) Not Very Volatile \nYour choice: ");
      u = keyboard.nextLine();

      if(!(u.equals("1")||u.equals("2"))){
        System.out.println("Please input a number 1-2. Press enter to continue");
        keyboard.nextLine();
      }
    }while(!(u.equals("1")||u.equals("2")));

    if(u.equals("1")){
      volatility = "very";
    }else{
      volatility = "not very";
    }
    return volatility;
  }//end userVolatility

  /**
  * Method to ask for the name of the company
  * @return company as a string
  */
  public static String userCompany(){
    Scanner keyboard = new Scanner(System.in);

    String u;
    String company;
    
    do{
      clearScreen();
      
      System.out.print("Please select the company you own a share of\nMenu:\n1) AAPL\n2) TSLA\n3) DJI\n4) SP500\nYour choice: ");
      u = keyboard.nextLine();

      if(!(u.equals("1")||u.equals("2")||u.equals("3")||u.equals("4"))){
        System.out.println("Please enter a number 1-4. Press enter to continue.");
        keyboard.nextLine();
      }
    }while(!(u.equals("1")||u.equals("2")||u.equals("3")||u.equals("4")));

    if(u.equals("1")){
      company = "AAPL";
    }else if(u.equals("2")){
      company = "TSLA";
    }else if(u.equals("3")){
      company = "DJI";
    }else if(u.equals("4")){
      company = "SP500";
    }else{
      company = null;
      System.out.println("Error.");
      System.exit(0);
    }
      
    return company;
  }//end userCompany

  /**
  * Method to ask for the amount of shares
  * @return amount as an int
  */
  public static int userAmount(){
    Scanner keyboard = new Scanner(System.in);
  
    clearScreen();
    int amount;
    String tester;

    do{
      System.out.print("Number of shares owned: ");
      tester = keyboard.nextLine();

      try{
        Integer.parseInt(tester);
      }catch(NumberFormatException e){
        tester = "failed";
        System.out.println("Invalid number format, must be 'Integer'");
      }
      
    }while(tester.equals("failed"));

    amount = Integer.parseInt(tester);
    
    return amount;
  }//end userAmount

  /**
  * Method to ask for the price per share
  * @return price as a double
  */
  public static double userPrice(){
    Scanner keyboard = new Scanner(System.in);
    
    clearScreen();
    double price;
    String tester;

    do{
    System.out.print("Price per share: $");
    tester = keyboard.nextLine();

    try{
      Double.parseDouble(tester);
    }catch(NumberFormatException e){
      tester = "failed";
      System.out.println("Invalid number format, must enter a 'Double'");
    }
    }while(tester.equals("failed"));

    price = Double.parseDouble(tester);
    return price;
  }//end userPrice

  /**
  * Method that creates the objects and prints out what is needed
  * @param c the share company
  * @param v the volatility of the stock market
  * @param a the amount of shares
  * @param p the price of the share
  */
  public static void userInfo(String c, String v, int a, double p){
    clearScreen();

    miniStockMarket(v);
    
    if(c.equalsIgnoreCase("TSLA")){

      TSLA share = new TSLA(v,a,p);
      share.setNetworth();
      share.setEstNet();
      System.out.println(share);
      
      StockMarket sharePoly = new TSLA(v,a,p);
      System.out.println(sharePoly.getComic() + "\n_____");
      
    }else if(c.equalsIgnoreCase("AAPL")){

      AAPL share = new AAPL(v,a,p);
      share.setNetworth();
      share.setEstNet();
      System.out.println(share);
      
      StockMarket sharePoly = new AAPL(v,a,p);
      System.out.println(sharePoly.getComic() + "\n_____");
      
    }else if(c.equalsIgnoreCase("DJI")){
      
      DJI share = new DJI(v,a,p);
      share.setNetworth();
      share.setEstNet();
      System.out.println(share);
      
      StockMarket sharePoly = new DJI(v,a,p);
      System.out.println(sharePoly.getComic() + "\n_____");
      
    }else if(c.equalsIgnoreCase("SP500")){
      
      SP500 share = new SP500(v,a,p);
      share.setNetworth();
      share.setEstNet();
      System.out.println(share);
      
      StockMarket sharePoly = new SP500(v,a,p);
      System.out.println(sharePoly.getComic() + "\n_____");
      
    }else{
      System.out.println("Error 2.");
      System.exit(0);
    }
    
  }//end userInfo
  
  /**
  *  Clear Screen method
  */
  public static void clearScreen(){
    System.out.print("\033[H\033[2J");//Clear screen
    System.out.println("Welcome to the '100% Financial Advisor! Give us your info and we will give sound financial advice!'");
  }//end clearScreen

  /**
  * Method that returns a boolean to see if user wants to run the program again
  * @return again 
  */
  public static boolean runAgain(){
    Scanner keyboard = new Scanner(System.in);
    boolean again;
    String userChoice;

    do{
      System.out.print("Would you like to run the program again?\n1) Yes\n2) No\nYour choice: ");
      userChoice = keyboard.nextLine();
    }while(!(userChoice.equalsIgnoreCase("1")||(userChoice.equalsIgnoreCase("2"))||(userChoice.equalsIgnoreCase("no"))||(userChoice.equalsIgnoreCase("yes"))));
    
    if(userChoice.equalsIgnoreCase("1")||userChoice.equalsIgnoreCase("yes")){
      again = true;
    }else{
      again = false;
      endProgram();
    }

    return again;
  }//end runAgain

  /**
  * Printing out the volatility
  */
  public static void miniStockMarket(String v){
    StockMarket vol = new StockMarket(v);
    System.out.println(vol.getComic());
  }//end miniStockMarket

  /**
  * Goodbye method
  */
  public static void endProgram(){
    System.out.println("Thank you for the using the '100% Financial Advisor!', goodbye.");
    System.exit(0);
  }

}//end class main