/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.senac.uteis;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Alunos
 */
public class Relogio {
    
    public static String getDataAtual(){
        //Mostra para o sistema como a data de ser reconhecida
        SimpleDateFormat formatador;
        formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
   
        //Resgata a data do sistema com precisão de milisegundos
        Date dataAtual = new Date();
        return formatador.format(dataAtual);
    }
    
}
