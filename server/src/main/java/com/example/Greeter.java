package com.example;



/**
* this is a Class
*/

public class Greeter {
 
  /**
  * this in contructor
  */
 
  public Greeter() {
   // rien a faire
  }

 /**
 * @param someone name of a person
 * @return greeting string
 */
  public final String greet(final String someone) {
    return String.format("Hello babacar, %s!", someone);
   
 }
}
