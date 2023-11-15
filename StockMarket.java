/* StockMarket.java
  Holds a "comic" representation of the Stock Market user
  
  Programmer: A K
  Last Modified by: A K
  Last Edit: 05/07/2023
*/

public class StockMarket {

  private String volatility;

  /**
  * Constructor that sets the fields.
  * @param v the volatility of the stock market
  */
  public StockMarket(String v) {
    volatility = v;
  }//end StockMarket

  /**
  * Returns the volatility
  * @return value stored in price field
  */
  public String getVolatility() {
    return volatility;
  }//end getVolatility
  
  /**
  * Returns a representation of the customer based on the price
  * @return comic 
  */
  public String getComic() {
    String comic;

    if(volatility.equalsIgnoreCase("very")){
      comic = "Very volatile market, watch out.";
    }else if(volatility.equalsIgnoreCase("not very")){
      comic = "Not a very volatile market, you are all knowning!";
    }else{
      comic = null;
    }
      
    return comic;
  }//end getComic

}//end StockMarket