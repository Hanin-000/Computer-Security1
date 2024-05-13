
package com.mycompany.cs_project;

import javax.swing.SwingUtilities;

public class main {
    
      public static void main (String[] args) {
       SwingUtilities.invokeLater(() -> {
           interface_cs gui;
           gui = new interface_cs();
           gui.setVisible(true);
       });
   }
    
}

    

