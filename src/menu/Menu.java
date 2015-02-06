/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package menu;

/**
 *
 * @author Dan
 */
public class Menu {
    
    private String[] menuHeader;    //optional
    private String[] menuFooter;    //optional
    private String[] menuItems;

    public Menu() { 
    }
    
    public Menu(String[] menuItems) {
        this.menuItems = menuItems;
    }
    
    public Menu(String[] menuHeader, String[] menuItems, String[] menuFooter) {
        this.menuHeader = menuHeader;
        this.menuItems = menuItems;
        this.menuFooter = menuFooter;
    }
    
    public void setMenuItems(String[] menuItems) {
        this.menuItems = menuItems;
    }

    public void setMenuHeader(String[] menuHeader) {
        this.menuHeader = menuHeader;
    }

    public void setMenuFooter(String[] menuFooter) {
        this.menuFooter = menuFooter;
    }

    public void printMenu(){
        //Print menu header if supplied
        if(menuHeader!=null){
            for(int i = 0;i<menuHeader.length;i++) {
                System.out.printf("%s\n",i,menuHeader[i]);
            }
        }
                
        for(int i = 0;i<menuItems.length;i++) {
            System.out.printf("%d. %s\n",(i+1),menuItems[i]);
        }
        //Print menu footer if supplied
        if(menuFooter!=null){
            for(int i = 0;i<menuFooter.length;i++) {
                System.out.printf("%s\n",i,menuFooter[i]);
            }
        }
    }
}
