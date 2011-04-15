package com.tieto.academy.accountbrowser.gui.swing;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import com.tieto.academy.accountbrowser.gui.swing.accountdetail.AccountDetailFrame;

/**
 * Used to run the account browser.
 * 
 * @author Ondrej Kvasnovsky
 */
public class AccountBrowser {

    /**
     * 
     * @param args
     */
    public static void main(final String[] args) {
        // start up the account browser
        SwingUtilities.invokeLater(new Runnable() {

            public void run() {
                System.setProperty("dao", "hashmap");
                final AccountDetailFrame accountFrame = new AccountDetailFrame();
                accountFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                accountFrame.setLocationRelativeTo(null);
                accountFrame.setVisible(true);
            }
        });
        // set look and feel
        // try {
        // UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        // } catch (final UnsupportedLookAndFeelException e) {
        // e.printStackTrace();
        // } catch (final ClassNotFoundException e) {
        // e.printStackTrace();
        // } catch (final InstantiationException e) {
        // e.printStackTrace();
        // } catch (final IllegalAccessException e) {
        // e.printStackTrace();
        // }
    }
}
