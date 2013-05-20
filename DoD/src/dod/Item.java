/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dod;

import java.util.ArrayList;

public class Item {

    Location location;
    String desc;

    Item(Location start, String _desc){
        location = start;
        desc = _desc;
    }

    public void setLocation(Item _Item, Location _location) {
        location = _location;
    }

    public String getLocation() {
        return location.desc;
    }
    public String getDesc() {
        return desc;
    }
    public Item getItems(ArrayList<Item> ItemsIn, Location LocIn){
        Item ItemOut = new Item(LocIn,"");
        for (Item i : ItemsIn) {
            if (i.location.equals(LocIn)) {
                    ItemOut =  i;
                }           
            }
            return ItemOut;
        }
    public String Take(ArrayList<Item> ItemsIn, Location LocIn){
        String Out = "";
        Location player = World.pl;
        Item AnyHere = getItems(ItemsIn, LocIn);
        String desc = AnyHere.getDesc();
        if ("".equals(desc)){
            Out = "Nothing to Take !";
        }
            else {
            AnyHere.setLocation(AnyHere, player);
            Out = "Taken : " + AnyHere.getDesc();
            }               
       
        return Out;
      }
        public String Drop(ArrayList<Item> ItemsIn, Location LocIn){
        String Out = "";
        Location player = World.pl;
        Item AnyHere = getItems(ItemsIn, player);
        String desc = AnyHere.getDesc();
        if ("".equals(desc)){
            Out = "You have no Items !";
        }
            else {
            AnyHere.setLocation(AnyHere, LocIn);
            Out = "Dropped " + AnyHere.getDesc() + " at " + LocIn.desc;
            }               
        return Out;
      }
        
       public String Kill(ArrayList<Item> ItemsIn, Location LocIn){
        String Out = "";
        Location player = World.pl;
        Item AnyHere = getItems(ItemsIn, player);
        String desc = AnyHere.getDesc();
        if (!"sword".equals(desc)){
            Out = "Sorry - no sword mate !";
        }
            else {
                if("in the cave of Gwent the dragon".equals(LocIn.desc)){
                  Out = "Wll Done you slayed the dragon !! "; 
                }
                else {
                   Out = "Sorry no Dragon Here !! ";                   
                }
            }               
        return Out;
      }
    }
