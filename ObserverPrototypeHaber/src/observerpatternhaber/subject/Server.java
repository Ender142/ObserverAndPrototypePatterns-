
package observerpatternhaber.subject;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import observerpatternhaber.observer.Client;

/**
 *
 * @author Ender
 */
public class Server extends javax.swing.JFrame  {

    private ArrayList<ClientListener> kullanicilar = new ArrayList<>();
    
    public Server() {
        initComponents();
        setTitle("Server");
        setLocationRelativeTo(null);
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        kullaniciSayisi = new javax.swing.JTextField();
        ekleBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        yollananHaber = new javax.swing.JTextArea();
        yollaBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ekleBtn.setText("Kullanıcı Ekle");
        ekleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ekleBtnActionPerformed(evt);
            }
        });

        yollananHaber.setColumns(20);
        yollananHaber.setRows(5);
        jScrollPane1.setViewportView(yollananHaber);

        yollaBtn.setText("Yolla");
        yollaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yollaBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Yollanacak Haber:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(yollaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(yollaBtn)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(kullaniciSayisi, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addComponent(ekleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kullaniciSayisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ekleBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ekleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ekleBtnActionPerformed
        
        //Server'da ekle butonuna bastığımızda Unsubscribed Client'a ek olarak
        //girdiğimiz sayı kadar Client'ı kullanicilar(clients) ArrayList'ine
        //ekliyor ve çalıştırıyor. Yani Subscribe ederek oluşturuyor direk 
        //Client'ları.
        int kullanici_sayisi = 0;
        try {
           kullanici_sayisi = Integer.parseInt(kullaniciSayisi.getText()); 
        } catch (NumberFormatException e) {
            }
        for(int i = 0; i<kullanici_sayisi;i++){
                Client client = new Client();
                client.setVisible(true);
                client.setTitle("Subscribed Client " + (i+1));
                //onSubscribe()
                kullanicilar.add(client);
            }
    }//GEN-LAST:event_ekleBtnActionPerformed

    private void yollaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yollaBtnActionPerformed
        String haber = yollananHaber.getText();
        if(haber.isEmpty()){
            JOptionPane.showMessageDialog(null, "Merkezden içeriği olmayan bir haber yollandı.");
            return;
        }
        //onNotify()
        for(ClientListener clientListener:kullanicilar){
            clientListener.onMessage(haber);
        }
        
    }//GEN-LAST:event_yollaBtnActionPerformed
    //Server mesaj almadığı için ClientListener Interface'ini 
    //Server Class'ına kurduk.
    public interface ClientListener  {
        //onUpdate()
        void onMessage(String message);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ekleBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kullaniciSayisi;
    private javax.swing.JButton yollaBtn;
    private javax.swing.JTextArea yollananHaber;
    // End of variables declaration//GEN-END:variables
}
