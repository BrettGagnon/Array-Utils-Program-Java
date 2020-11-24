/*
Brett Gagnon
Into to Java Programming
Assignment 7
10/27/2018
 */
package arrayutilsdemo;


public class BadArrayException extends Exception {

   //default constructor with no arguments
    public BadArrayException() {
    }
   //constructor taking a string parameter
    public BadArrayException(String msg) {
        super(msg);
    }
}
