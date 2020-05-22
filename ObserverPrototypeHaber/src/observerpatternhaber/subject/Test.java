
package observerpatternhaber.subject;

import observerpatternhaber.observer.ClientUnsubscribed;
import prototypehaber.pattern.Haber;
import prototypehaber.pattern.HaberCache;

public class Test {

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
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        
        /* Create and display the form */
        HaberCache.loadCache();
        Haber clonedHaber = (Haber) HaberCache.getHaber("1");
        System.out.println("Haber : " + clonedHaber.getIcerik());
        Haber clonedHaber2 = (Haber) HaberCache.getHaber("2");
        System.out.println("Haber : " + clonedHaber2.getIcerik());
        //Server JFrame'ini direkt olarak Test Class'ında çalıştırıyoruz.
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Server().setVisible(true);
            }
        });
        //Unsubscribed Client'ımızı direkt olarak Test Class'ında çalıştırıyoruz.
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientUnsubscribed().setVisible(true);
            }
        });
    
    }
    
}
