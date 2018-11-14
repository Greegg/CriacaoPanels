/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.senac.uteis;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author Alunos
 */
public class RelogioThread {
    private static JLabel lblRelogio;

    public RelogioThread(JLabel label) {
        this.lblRelogio = label;
    }   

    public void iniciarRelogio(){
        Thread t1 = new Thread(){
            @Override
            public void run() {
                while(true){
                    lblRelogio.setText(Relogio.getDataAtual());   
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(RelogioThread.class.getName()).log(Level.SEVERE, null, ex);
                    }
                   
                }
            }
        };
        t1.start();
    }
    
}
