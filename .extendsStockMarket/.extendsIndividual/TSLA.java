/* TSLA.java
  This class extends Individual.java

  Programmer: A K
  Last Modified by: A K
  Last Edit: 05/07/2023
*/

public class TSLA extends Individual {

  private double price;
  private double networth;
  private double estNet;
  private double estGrowth = 10;

  /**
  * Constructor that sets the info
  * @param v the volatility of the company
  * @param a the amount of shares
  * @param p the price per share
  */
  public TSLA(String v, int a, double p){
    super(v,a);
    price = p;
  }//end TSLA

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
    comic = "You should invest into the SP500";
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
    return "\nTSLA Stock Summary:\nTesla is considered by some to be a facade. They have gained lots of popularity from what their company has accomplished.\n_____\nAmount of shares: " + this.getAmount() + "\nPrice per share: $" + this.getPrice() + "\nNetworth: $" + this.getNetworth() + "\nNetworth is 10 years: $" + this.getEstNet();
  }//end to String  
  
}//end TSLA