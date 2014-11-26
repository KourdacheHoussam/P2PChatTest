/**
 * null
 * null
 * 
 * 
 * 
 * 
 * 
 * 
 * null
 * null
 * null
 * null
 * null
 **/
package test;

import inria.smarttools.core.util.*;

/**
 **/
public class VoisinsEvent extends StEventImpl {
   //
   // Fields 
   //

   /**
    **/
   protected java.util.ArrayList voisins;

   /**
    **/
   public void setVoisins(java.util.ArrayList v){
      this.voisins = v;
   }

   public java.util.ArrayList getVoisins(){
      return voisins;
   }

   //
   // Constructors 
   //

   /**
    * Constructor
    **/
   public   VoisinsEvent(java.util.ArrayList voisins){
      setVoisins(voisins);
   }

   /**
    * Constructor
    **/
   public   VoisinsEvent(String adressee, java.util.ArrayList voisins){
      super(adressee);
      setVoisins(voisins);
   }


   //
   // Methods 
   //

   /**
    * Return a short description of the VoisinsEvent object.
    * @return a value of the type 'String' : a string representation of this VoisinsEvent
    **/
   public  String toString(){
      String res = "VoisinsEvent";
      return res;
   }


}
