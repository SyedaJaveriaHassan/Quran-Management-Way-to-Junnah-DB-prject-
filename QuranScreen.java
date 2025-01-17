/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quran_management;

//import static quran_management.Juzz1.selected;

//import com.sun.jdi.connect.spi.Connection;
//import javax.swing.JOptionPane;
//import java.sql.*;

/**
 *
 * @author Javeria
 */
public class QuranScreen extends javax.swing.JFrame {

    /**
     * Creates new form QuranScreen
     */
    public QuranScreen() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jTextField2.setBackground(new java.awt.Color(153, 102, 0));
        jTextField2.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(204, 204, 204));
        jTextField2.setText("Al-Quran");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(310, 70, 200, 40);

        jTextField3.setBackground(new java.awt.Color(153, 102, 0));
        jTextField3.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(204, 204, 204));
        jTextField3.setText("WAY TO JUNNAH");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3);
        jTextField3.setBounds(260, 20, 300, 40);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Al-Fatihah(The Opening)", "Al-Baqarah(The Cow)", "Al-‘Imran(The Family of Amran)", "An-Nisa’(The Women)", "Al-Ma’idah(The Food)", "Al-An’am(The Cattle)", "Al-A’raf(The Elevated Places)", "Al-Anfal(Voluntary Gifts)", "Al-Bara’at / At-Taubah(The Immunity)", "Yunus(Jonah)", "Hud(Hud)", "Yusuf(Joseph)", "Ar-Ra’d(The Thunder)", "Ibrahim(Abraham)", "Al-Hijr(The Rock)", "An-Nahl(The Bee)", "Bani Isra’il(The Israelites)", "Al-Kahf(The Cave)", "Maryam(Mary)", "Ta Ha(Ta Ha)", "Al-Anbiya’(The Prophets)", "Al-Hajj(The Pilgrimage)", "Al-Mu’minun(The Believers)", "An-Nur(The Light)", "Al-Furqan(The Discrimination)", "Ash-Shu’ara’(The Poets)", "An-Naml(The Naml)", "Al-Qasas(The Narrative)", "Al-‘Ankabut(The Spider)", "Ar-Rum(The Romans)", "Luqman(Luqman)", "As-Sajdah(The Adoration)", "Al-Ahzab(The Allies)", "Al-Saba’(The Saba’)", "Al-Fatir(The Originator)", "Ya Sin(Ya Sin)", "As-Saffat(Those Ranging in Ranks)", "Sad(Sad)", "Az-Zumar(The Companies)", "Al-Mu’min(The Believer)", "Ha Mim(Ha Mim)", "Ash-Shura(Counsel)", "Az-Zukhruf(Gold)", "Ad-Dukhan(The Drought)", "Al-Jathiyah(The Kneeling)", "Al-Ahqaf(The Sandhills)", "Muhammad(Muhammad)", "Al-Fath(The Victory)", "Al-Hujurat(The Apartments)", "Qaf(Qaf)", "Ad-Dhariyat(The Scatterers)", "At-Tur(The Mountain)", "An-Najm(The Star)", "Al-Qamar(The Moon)", "Ar-Rahman(The Beneficent)", "Al-Waqi’ah(The Event)", "Al-Hadid(Iron)", "Al-Mujadilah(The Pleading Woman)", "Al-Hashr(The Banishment)", "Al-Mumtahanah(The Woman who is Examined)", "As-Saff(The Ranks)", "Al-Jumu’ah(The Congregation)", "Al-Munafiqun(The Hypocrites)", "At-Taghabun(The Manifestation of Losses)", "At-Talaq(Divorce)", "At-Tahrim(The Prohibition)", "Al-Mulk(The Kingdom)", "Al-Qalam(The Pen)", "Al-Haqqah(The Sure Truth)", "Al-Ma’arij(The Ways of Ascent)", "Nuh(Noah)", "Al-Jinn(The Jinn)", "Al-Muzzammil(The One Covering Himself)", "Al-Muddaththir(The One Wrapping Himself Up)", "Al-Qiyamah(The Resurrection)", "Al-Insan(The Man)", "Al-Mursalat(Those Sent Forth)", "An-Naba’(The Announcement)", "An-Nazi’at(Those Who Yearn)", "‘Abasa(He Frowned)", "At-Takwir(The Folding Up)", "Al-Infitar(The Cleaving)", "At-Tatfif(Default in Duty)", "Al-Inshiqaq(The Bursting Asunder)", "Al-Buruj(The Stars)", "At-Tariq(The Comer by Night)", "Al-A’la(The Most High)", "Al-Ghashiyah(The Overwhelming Event)", "Al-Fajr(The Daybreak)", "Al-Balad(The City)", "Ash-Shams(The Sun)", "Al-Lail(The Night)", "Ad-Duha(The Brightness of the Day)", "Al-Inshirah(The Expansion)", "At-Tin(The Fig)", "Al-‘Alaq(The Clot)", "Al-Qadr(The Majesty)", "Al-Bayyinah(The Clear Evidence)", "Al-Zilzal(The Shaking)", "Al-‘Adiyat(The Assaulters)", "Al-Qari’ah(The Calamity)", "At-Takathur(The Abundance of Wealth)", "Al-‘Asr(The Time)", "Al-Humazah(The Slanderer)", "Al-Fil(The Elephant)", "Al-Quraish(The Quraish)", "Al-Ma’un(Acts of Kindness)", "Al-Kauthar(The Abundance of Good)", "Al-Kafirun(The Disbelievers)", "An-Nasr(The Help)", "Al-Lahab(The Flame)", "Al-Ikhlas(The Unity)", "Al-Falaq(The Dawn)", "An-Nas(The Men)" }));
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(290, 280, 320, 30);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "آلآلم", "سيقول السفهاء", "تلك الرسل", "لن تنالوا", "والمحصنات", "لا يحب الله", "وإذا سمعوا", "ولو أننا", "قال الملأ", "واعلموا", "يعتذرون", "ومامن دابة", "وما أبرئ", "ربما", "سبحٰن الذیٓ", "قال ألم", "اقترب للناس", "قد أفلح", "وقال الذين", "امن خلق", "اتل مآ اوحی", "ومن يقنت", "ومالی", "فمن أظلم", "إليه يرد", "حـم", "قال فما خطبكم", "قد سمع اللہ", "تبٰرک الذی", "عمّ", "سيقول السفهاء", "تلك الرسل", "لن تنالوا  ", "والمحصنات", "لا يحب الله", "وإذا سمعوا", "ولو أننا", "قال الملأ", "واعلموا", "يعتذرون", "ومامن داب", "وما أبرئ ", "ربما", "سبحٰن الذیٓ", "قال ألم", "اقترب للناس", "قد أفلح", "وقال الذين", "امن خلق", "اتل مآ اوحی", "ومن يقنت", "ومالی", "فمن أظلم", "إليه يرد", "حـم", "قال فما خطبكم", "قد سمع اللہ", "تبٰرک الذی", "عمّ", " " }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(290, 190, 310, 30);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Al-Fatihah(The Opening)", "Al-Baqarah(The Cow)", "Al-‘Imran(The Family of Amran)", "Al-Quraish(The Quraish)", "Al-Kafirun(The Disbelievers)", "An-Nasr(The Help)", "Al-Lahab(The Flame)", "Al-Ikhlas(The Unity)", "Al-Falaq(The Dawn)", "An-Nas(The Men)" }));
        jComboBox3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox3MouseClicked(evt);
            }
        });
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox3);
        jComboBox3.setBounds(290, 380, 320, 30);

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton4.setText("Ok");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(670, 280, 60, 30);

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setText("Ok");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(670, 380, 60, 30);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(40, 460, 90, 29);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Ok");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(670, 200, 60, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Search by Ayah");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 390, 210, 29);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Search By Surrah");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 280, 210, 29);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Search By Juzz");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 180, 210, 29);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Javeria\\Pictures\\Camera Roll\\QuranScreen.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 810, 510);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 811, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
    
        Surah.selected5=  (String)jComboBox1.getSelectedItem();    
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
      //System.out.print("OK");
      Para.selected=  (String)jComboBox2.getSelectedItem();
//      
//        Para p1 = new Juzz1();
//        p1.show();
//        dispose();
 
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        AllFuctionScreen afs = new AllFuctionScreen();
        afs.show();
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
  Ayah.selected6= (String)jComboBox3.getSelectedItem();
//        Ayah afs= new Ayah();
//        afs.show();
//        dispose();
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       
        Para p1= new Para();
        p1.show();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Ayah a1 = new Ayah();
        a1.show();
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Surah s1 = new Surah();
        s1.show();
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked
        // TODO add your handling code here:
      Surah.selected5= (String)jComboBox3.getSelectedItem();
//        Surah s= new Surah();
//        s.show();
//        dispose();  
    }//GEN-LAST:event_jComboBox1MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseClicked

    private void jComboBox3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox3MouseClicked
        // TODO add your handling code here  
        Ayah.selected6= (String)jComboBox3.getSelectedItem();
//        Ayah a= new Ayah();
//        s.show();
//        dispose();  
    }//GEN-LAST:event_jComboBox3MouseClicked

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
            java.util.logging.Logger.getLogger(QuranScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuranScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuranScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuranScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuranScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
