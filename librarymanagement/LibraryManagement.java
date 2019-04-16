/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagement;

import Interface.Login;


/**
 *
 * @author User
 */
public class LibraryManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Splash splash = new Splash();
        splash.setVisible(true);        
        Login login = new Login();

        try {
            for(int i=1; i<=100; i++){
                Thread.sleep(40);
                splash.lblprog.setText(Integer.toString(i) + "%");
                splash.jProgressBar.setValue(i);
                
                if(i == 100){
                    splash.setVisible(false);
                    login.setVisible(true);
                }
            }
        } catch (Exception e) {
            
        }
        
        
        
    }
    
}
