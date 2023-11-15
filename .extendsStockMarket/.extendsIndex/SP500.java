/* SP500.java
  This class extends Index.java

  Programmer: A K
  Last Modified by: A K
  Last Edit: 05/07/2023
*/

public class SP500 extends Individual {

  private double price;
  private double networth;
  private double estNet;
  private double estGrowth = 1.5;

  /**
  * Constructor that sets the info
  * @param v the volatility of the company
  * @param a the amount of shares
  * @param p the price per share
  */
  public SP500(String v, int a, double p){
    super(v,a);
    price = p;
  }//end SP500

  /**
  * Returns the price of the company
  * @return value stored in price
  */
  public double getPrice(){
    return price;
  }//end getPrice

  /**
  * Calculates the networth of the user
  */
  public void setNetworth(){
    networth = this.getAmount()*price;
  }//end getNetworth

  /**
  * Method that returns the networth as a field
  * @return networth of user
  */
  public double getNetworth(){
    return networth;
  }//end getNetworth

  /**
  * Overriden method that returns a String
  * @return comic a string about user
  */
  public String getComic() {
    String comic;
    comic = "You should invest into TSLA";
    return comic;
  }//end getComic
  
  /**
  * Calculates future networth of user
  */
  public void setEstNet(){
    estNet = networth*estGrowth;
  }//end setEstNet
  
  /**
  * Method that returns estNet as a field
  * @return estimated future networth of user
  */
  public double getEstNet(){
    return estNet;
  }//end getEstNet

  /**
  * toString method
  * @return a string containing the stock information
  */
  public String toString(){
    return "\nSP500 Stock Summary:\nThe S&P 500 is an index composed of 500 of the largest companies by market capitalization in the U.S.\n_____\nAmount of shares: " + this.getAmount() + "\nPrice per share: $" + this.getPrice() + "\nNetworth: $" + this.getNetworth() + "\nNetworth in 10 years: $" + this.getEstNet();
  }//end to String  
  
}//end SP500