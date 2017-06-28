package Modelo;

import java.io.Serializable;
import java.sql.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andre
 */
public class MotoristaModelo implements Serializable {
    
    int codMotorista, numeroCNH;
    String categoriaCNH, nomeMotorista;
    Date vencimentoCNH;
   
    
    

    public int getCodMotorista() {
        return codMotorista;
    }

    public void setCodMotorista(int codMotorista) {
        this.codMotorista = codMotorista;
    }

    public int getNumeroCNH() {
        return numeroCNH;
    }

    public void setNumeroCNH(int numeroCNH) {
        this.numeroCNH = numeroCNH;
    }

    public String getCategoriaCNH() {
        return categoriaCNH;
    }

    public void setCategoriaCNH(String categoriaCNH) {
        this.categoriaCNH = categoriaCNH;
    }

    public String getNomeMotorista() {
        return nomeMotorista;
    }

    public void setNomeMotorista(String nomeMotorista) {
        this.nomeMotorista = nomeMotorista;
    }

    public Date getVencimentoCNH() {
        return vencimentoCNH;
    }

    public void setVencimentoCNH(Date vencimentoCNH) {
        this.vencimentoCNH = vencimentoCNH;
    }
   

}