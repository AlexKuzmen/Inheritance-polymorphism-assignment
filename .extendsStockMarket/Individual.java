/* Individual.java
  This class inherents from StockMarket.java.

  Programmer: A K
  Last Modified by: A K
  Last Edit: 05/07/2023
*/

public class Individual extends StockMarket {

  private int amount;

  /**
  * Constructor that sets the fields
  * @param v The volatility of the stock market
  * @param a The number of shares
  */
  public Individual(String v, int a){
    super(v);
    amount = a;
  }//end Individual

  /**
  * Returns the amount of shares
  * @return integer stores in amount
  */
  public int getAmount(){
    return amount;
  }//end getAmount

  /**
  * Overriden method that returns a String
  * @return comic 
  */
  public String getComic() {
    String comic;

    comic = "This is an individual.";
    
    return comic;
  }//end getComic

}//end Individual