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
public class ControleViagemModelo implements Serializable{
    
    private MotoristaModelo motorista;
    private VeiculoModelo veiculo;
    Date dataSaida, dataEntrada;
    int kmSaida, kmEntrada, codControle;
    
    

    

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public int getKmSaida() {
        return kmSaida;
    }

    public void setKmSaida(int kmSaida) {
        this.kmSaida = kmSaida;
    }

    public int getKmEntrada() {
        return kmEntrada;
    }

    public void setKmEntrada(int kmEntrada) {
        this.kmEntrada = kmEntrada;
    }

    public int getCodControle() {
        return codControle;
    }

    public void setCodControle(int codControle) {
        this.codControle = codControle;
    }

    /**
     * @return the motorista
     */
    public MotoristaModelo getMotorista() {
        return motorista;
    }

    /**
     * @param motorista the motorista to set
     */
    public void setMotorista(MotoristaModelo motorista) {
        this.motorista = motorista;
    }

    /**
     * @return the veiculo
     */
    public VeiculoModelo getVeiculo() {
        return veiculo;
    }

    /**
     * @param veiculo the veiculo to set
     */
    public void setVeiculo(VeiculoModelo veiculo) {
        this.veiculo = veiculo;
    }
    
}
