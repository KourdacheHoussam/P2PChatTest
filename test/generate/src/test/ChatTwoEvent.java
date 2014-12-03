/**
 * null
 * null
 * 
 * 
 * 
 * 
 * null
 * null
 * null
 * null
 * 
 * 
 * null
 * null
 * 
 * 
 * 
 * 
 * 
 * 
 * null
 **/
package test;

import inria.smarttools.core.util.*;

/**
 **/
public class ChatTwoEvent extends StEventImpl {
   //
   // Fields 
   //

   /**
    **/
   protected java.lang.String imageparameter;

   /**
    **/
   public void setImageparameter(java.lang.String v){
      this.imageparameter = v;
   }

   public java.lang.String getImageparameter(){
      return imageparameter;
   }

   //
   // Constructors 
   //

   /**
    * Constructor
    **/
   public   ChatTwoEvent(java.lang.String imageparameter){
      setImageparameter(imageparameter);
   }

   /**
    * Constructor
    **/
   public   ChatTwoEvent(String adressee, java.lang.String imageparameter){
      super(adressee);
      setImageparameter(imageparameter);
   }


   //
   // Methods 
   //

   /**
    * Return a short description of the ChatTwoEvent object.
    * @return a value of the type 'String' : a string representation of this ChatTwoEvent
    **/
   public  String toString(){
      String res = "ChatTwoEvent";
      return res;
   }


}
