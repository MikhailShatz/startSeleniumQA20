package oop2;

public interface Vehicle {

   public int doors();

   public default String voice(){
      return "I am vehicle";
   }
}
