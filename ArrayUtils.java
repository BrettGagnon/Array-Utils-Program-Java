/*
Brett Gagnon
Into to Java Programming
Assignment 7
10/27/2018
 */
package arrayutilsdemo;


public class ArrayUtils {
    
    //This static method searches its parameter array to locate the minimum
    //value, and returns it.
    
    public static int minValue(int[] list)
        throws BadArrayException
    {
       //if the array is null
       if (list == null)
       {
              throw new BadArrayException("Array is null");
       }
       
       //if the array is empty
       if (list.length == 0)
       {  
              throw new BadArrayException("Array is empty");
       }
       
       int min = list[0];
       //search through the array once
          for (int n=0; n< list.length; ++n)
          {
              //if the current array value is less than min, set min to that value
              if (list[n] < min)
                  min = list[n];       
          }
        
       
      return min;
    }
    
    public static int[] copyRange(int[] list, int startIndex)
             throws BadArrayException
    {
        //if the array is null 
        if (list == null)
        {
              throw new BadArrayException("Array is null");
        }
        
        //if the start index is less than 0 or greater than the list length
        if (startIndex < 0 || startIndex > list.length)
        {
            throw new ArrayIndexOutOfBoundsException(startIndex);
        }
        
        //copy parameter array into new array
        int[] list2 = new int[list.length-startIndex];
        int x=0;
        
        for(int n=startIndex; n < list.length; ++n)
        {
            
            list2[x] = list[n];
            ++x;
            
        }
        //return the new array
        return list2;
    
    }
    
    public static int indexOf(int[] list, int searchValue)
             throws BadArrayException
    {
        //if the array is null 
        if (list == null)
        {
              throw new BadArrayException("Array is null");
        }
        
        //if the array parameter is length 0, return -1
        if (list.length == 0)
        {
        return -1;
        }
        
        for (int n=0; n < list.length; ++n)
        {
            //if the current array value matches the search value, return the index
            if (list[n] == searchValue)
            {
            return n;
            }
              
        }
            
        return -1; 
    }
    
    public static int lastIndexOf(int[] list, int searchValue)
             throws BadArrayException
    {
        //if the array is null 
        if (list == null)
        {
              throw new BadArrayException("Array is null");
        }
        
        //if the array parameter is length 0, return -1
        if (list.length == 0)
        {
        return -1;
        }
        
        // int to hold the last value with a default value of -1 incase the
        //searchValue is never found
        int lastvalue = -1;
        for (int n=0; n<list.length; ++n)
        {
            //if the current array value matches the search value
            if (list[n] == searchValue)
            {
            lastvalue = n;
            }  
        }
        
        //after for loop, if the search value ever matched, it's index value will have been
        //stored into lastvalue, which is then returned.
        return lastvalue; 
    }
    
    
}
