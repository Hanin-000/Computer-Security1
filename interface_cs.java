/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.cs_project;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.util.*;

public class interface_cs extends javax.swing.JFrame {

    /**
     * Creates new form interface_cs
     */
    public interface_cs() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     * @param a
     * @param b
     * @return 
     */
    @SuppressWarnings("unchecked")
    
    
    public static boolean isCoprime(int a, int b) {
       return gcd(a, b) == 1;
   }
   public static int gcd(int a, int b) {
       while (b != 0) {
           int temp = b;
           b = a % b;
           a = temp;
       }
       return a;
   }
    
    // Function to convert a list of characters to a string
   public static String convertToString(List<Character> characters) {
       StringBuilder sb = new StringBuilder();
       for (char ch : characters) {
           sb.append(ch);
       }
       return sb.toString();
   }
    
    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        textArea1 = new java.awt.TextArea();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        textArea2 = new java.awt.TextArea();
        jButton6 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CS project");
        setBackground(new java.awt.Color(235, 60, 104));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(182, 209, 209));
        jPanel1.setPreferredSize(new java.awt.Dimension(580, 385));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setBackground(new java.awt.Color(0, 204, 204));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("Welcome to DefenseCyber Secure Communications");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 440, 60));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 51));
        jLabel12.setText("<html>Welcome to DefenseCyber! We prioritize data security and privacy. With the Affine cipher and Playfair cipher, our information is protected. Explore our secure solutions now.<html>");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 550, 190));

        jTabbedPane1.addTab("________________________", jPanel1);

        jPanel3.setPreferredSize(new java.awt.Dimension(550, 355));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Enter the Text:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 117, -1));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 306, 41));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 87, 37, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Key A :");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, -1, -1));

        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        jPanel3.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 70, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Key B :");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, -1, -1));

        jTextField4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });
        jPanel3.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 80, 30));

        jButton4.setBackground(new java.awt.Color(0, 153, 153));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(51, 0, 51));
        jButton4.setText("Encrypt");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, -1, 30));

        jButton5.setBackground(new java.awt.Color(0, 153, 153));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setText("Decrypt");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, -1, 30));

        textArea1.setEditable(false);
        textArea1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jPanel3.add(textArea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 320, 180));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("Affine Cipher Encryption and Decryption Program");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 450, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("output Text:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 140, -1));

        jTabbedPane1.addTab("_________________________", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Enter the Text :");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 120, 40));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });
        jPanel4.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 345, 60));

        jLabel7.setBackground(new java.awt.Color(0, 204, 204));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Enter the key:");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, 30));

        jTextField5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5KeyTyped(evt);
            }
        });
        jPanel4.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 240, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Output Text : ");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 150, 30));

        textArea2.setEditable(false);
        jPanel4.add(textArea2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 360, 160));

        jButton6.setBackground(new java.awt.Color(0, 153, 153));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton6.setText("Encrypt");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 102));
        jLabel11.setText("Playfair Cipher Encryption and Decryption Program");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        jButton7.setBackground(new java.awt.Color(0, 153, 153));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton7.setText("Decrypt");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 110, -1));

        jTabbedPane1.addTab("_____________________________", jPanel4);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, -40, 680, 540));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("welcome");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 92, 115, 39));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Affine Cipher ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 149, 115, 35));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("Playfair Cipher ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 202, -1, 33));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    
    public static String removeSpaces(String text) {
       return text.replace(" ", "");
   } 
     
     
   
  public static List<String> generateDiagraphs(String message) {
       List<String> diagraphs = new ArrayList<>();
       int i = 0;
       while (i < message.length()) {
           if (i == message.length() - 1) {
               diagraphs.add(message.charAt(i) + "x");
               break;
           }
           if (message.charAt(i) == message.charAt(i + 1)) {
               diagraphs.add(message.charAt(i) + "x");
               i += 1;
           } else {
               diagraphs.add(message.charAt(i) + "" + message.charAt(i + 1));
               i += 2;
           }
       }
       return diagraphs;
   }
  

     
     
     
    // Function to generate the key table
   public static char[][] generateKeyTable(String key) {
       key = key.replace(" ", "").toUpperCase();
       key += "ABCDEFGHIKLMNOPQRSTUVWXYZ";
       key = new String(key.chars().distinct().toArray(), 0, 25);
       char[][] matrix = new char[5][5];
       int index = 0;
       for (int i = 0; i < 5; i++) {
           for (int j = 0; j < 5; j++) {
               matrix[i][j] = key.charAt(index);
               index++;
           }
       }
       return matrix;
   }
   
   // Function to search for an element in the key table
   public static int[] search(char[][] matrix, char ele) {
       for (int i = 0; i < 5; i++) {
           for (int j = 0; j < 5; j++) {
               if (matrix[i][j] == ele) {
                   return new int[]{i, j};
               }
           }
       }
       return new int[]{-1, -1};
   }
   
   
     // Function to encrypt the message using the Playfair cipher
   public static List<Character> encryptByPlayfairCipher(char[][] matrix, List<String> diagraphs) {
       List<Character> encryptedText = new ArrayList<>();
       for (String pair : diagraphs) {
           char ele1 = Character.toUpperCase(pair.charAt(0));
           char ele2 = Character.toUpperCase(pair.charAt(1));
           int[] ele1Pos = search(matrix, ele1);
           int[] ele2Pos = search(matrix, ele2);
           if (ele1Pos[0] != -1 && ele2Pos[0] != -1) {
               if (ele1Pos[0] == ele2Pos[0]) {  // Same row
                   encryptedText.add(matrix[ele1Pos[0]][(ele1Pos[1] + 1) % 5]);
                   encryptedText.add(matrix[ele2Pos[0]][(ele2Pos[1] + 1) % 5]);
               } else if (ele1Pos[1] == ele2Pos[1]) {  // Same column
                   encryptedText.add(matrix[(ele1Pos[0] + 1) % 5][ele1Pos[1]]);
                   encryptedText.add(matrix[(ele2Pos[0] + 1) % 5][ele2Pos[1]]);
               } else {  // Form a rectangle
                   encryptedText.add(matrix[ele1Pos[0]][ele2Pos[1]]);
                   encryptedText.add(matrix[ele2Pos[0]][ele1Pos[1]]);
               }
           }
       }
       return encryptedText;
   }
   // Function to decrypt the message using the Playfair cipher
   public static List<Character> decryptByPlayfairCipher(char[][] matrix, List<String> diagraphs) {
       List<Character> decryptedText = new ArrayList<>();
       for (String pair : diagraphs) {
           char ele1 = Character.toUpperCase(pair.charAt(0));
           char ele2 = Character.toUpperCase(pair.charAt(1));
           int[] ele1Pos = search(matrix, ele1);
           int[] ele2Pos = search(matrix, ele2);
           if (ele1Pos[0] != -1 && ele2Pos[0] != -1) {
               if (ele1Pos[0] == ele2Pos[0]) {  // Same row
                   decryptedText.add(matrix[ele1Pos[0]][(ele1Pos[1] + 4) % 5]);
                   decryptedText.add(matrix[ele2Pos[0]][(ele2Pos[1] + 4) % 5]);
               } else if (ele1Pos[1] == ele2Pos[1]) {  // Same column
                   decryptedText.add(matrix[(ele1Pos[0] + 4) % 5][ele1Pos[1]]);
                   decryptedText.add(matrix[(ele2Pos[0] + 4) % 5][ele2Pos[1]]);
               } else {  // Form a rectangle
                   decryptedText.add(matrix[ele1Pos[0]][ele2Pos[1]]);
                   decryptedText.add(matrix[ele2Pos[0]][ele1Pos[1]]);
               }
           }
       }
       return decryptedText;
   }
     
     
     
     
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       jTabbedPane1.setSelectedIndex(0);
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_jButton3ActionPerformed
     
    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed
  
    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
          
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your  code here:
        
    }//GEN-LAST:event_jTextField4ActionPerformed

public static String affineEncrypt(String text, int a, int b) {
       StringBuilder result = new StringBuilder();
       for (char character : text.toCharArray()) {
           if (Character.isUpperCase(character)) {
               char encryptedChar = (char) (((a * (character - 'A') + b) % 26) + 'A');
               result.append(encryptedChar);
           } else {
               result.append(character);
           }
       }
       return result.toString();
   }
       public static int modInverse(int a, int m) {
       a = a % m;
       for (int x = 1; x < m; x++) {
           if ((a * x) % m == 1) {
               return x;
           }
       }
       return 1; // Should never reach here if 'a' and 'm' are coprime
   }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = jTextField1.getText().toUpperCase();
                
                 
                try {
                    int keyA = Integer.parseInt(jTextField3.getText());
                    int keyB = Integer.parseInt(jTextField4.getText());
                    if (isCoprime(keyA, 26) && 0 <= keyB && keyB < 26) {
                        String encryptedText = affineEncrypt(input, keyA, keyB);
                        textArea1.setText(encryptedText);
                    } else {
                        
                        var messageLabel = new JLabel("Invalid values of a and b. 'a' should be coprime with 26 and 'b' should be between 0 and 25.");
                        messageLabel.setForeground(Color.RED); // Optional: Set error message color for better visibility
                        JOptionPane.showMessageDialog(null, messageLabel, "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }catch (NumberFormatException E) {
                    
                    
                }
            }
        });
    }//GEN-LAST:event_jButton4ActionPerformed
     public static String affineDecrypt(String cipher, int a, int b) {
       StringBuilder result = new StringBuilder();
       int modInverse = modInverse(a, 26);
       for (char character : cipher.toCharArray()) {
           if (Character.isUpperCase(character)) {
               char decryptedChar = (char) (((modInverse * (character - 'A' - b + 26)) % 26) + 'A');
               result.append(decryptedChar);
           } else {
               result.append(character);
           }
       }
       return result.toString();
   }
     
   
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jButton5.addActionListener((ActionEvent e) -> {
            String input = jTextField1.getText();
            int keyA = Integer.parseInt(jTextField3.getText());
            int keyB = Integer.parseInt(jTextField4.getText());
            String decryptedText = affineDecrypt(input, keyA, keyB);
            textArea1.setText(decryptedText);
        });
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         jButton6.addActionListener((ActionEvent e) -> {
            String input = jTextField2.getText();
            String key=jTextField5.getText();
             String message1 = removeSpaces(input);
       List<String> diagraphs = generateDiagraphs(message1);
       char[][] matrix = generateKeyTable(key);
       List<Character> result;
       result = encryptByPlayfairCipher(matrix, diagraphs);
        textArea2.setText(convertToString(result).toUpperCase());
        });
                   
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
       if(!Character.isDigit(evt.getKeyChar()))
       {
           evt.consume();
       }
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
        if(!Character.isDigit(evt.getKeyChar()))
       {
           evt.consume();
       }
    }//GEN-LAST:event_jTextField4KeyTyped

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        if(!(Character.isAlphabetic(evt.getKeyChar()) ||  Character.isWhitespace(evt.getKeyChar())))
            evt.consume();
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
 
            jButton7.addActionListener((ActionEvent e) -> {
                String input = jTextField2.getText();
                String key=jTextField5.getText();
                String message = removeSpaces(input);
                List<String> diagraphs = generateDiagraphs(message);
                char[][] matrix = generateKeyTable(key);
                List<Character> result;
                result = decryptByPlayfairCipher(matrix, diagraphs);
                textArea2.setText(convertToString(result).toUpperCase());
        });

          
         
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        if(!(Character.isAlphabetic(evt.getKeyChar()) ||  Character.isWhitespace(evt.getKeyChar())))
            evt.consume();
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyTyped
         if(!(Character.isAlphabetic(evt.getKeyChar()) ||  Character.isWhitespace(evt.getKeyChar())))
            evt.consume();
    }//GEN-LAST:event_jTextField5KeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(interface_cs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interface_cs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interface_cs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interface_cs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interface_cs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private java.awt.TextArea textArea1;
    private java.awt.TextArea textArea2;
    // End of variables declaration//GEN-END:variables
}
