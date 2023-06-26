package Main;

import Builder.PCBuilder;
import Components.Components;

public class Director {
         private PCBuilder pcBuilder;

         public Director(PCBuilder pcBuilder){
             this.pcBuilder = pcBuilder;
             pcBuilder.BuildBase();
             pcBuilder.InsertProcessor();
             pcBuilder.Add_cooler();
             pcBuilder.GetOrder();
         }

         public Order getOrder(){
             return pcBuilder.GetOrder();
         }

         public void AddOns(Components components){
             pcBuilder.AddComponents(components);
         }
}
