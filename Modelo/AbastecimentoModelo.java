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
public class AbastecimentoModelo implements Serializable {
    
    VeiculoModelo veiculo;
    
    int quilometroAbastecido, quilometroAbastecidoAnterior, codAbastecimento;
    float quantidadeAbastecida;
    Date dataAbastecimento;
    

    //public String getPlacaVeiculo(){
    
    //    return veiculo.placaVeiculo;
    
    //}
    
    //public void setPlacaVeiculo(VeiculoModelo veiculo){
    //this.veiculo.placaVeiculo=veiculo.placaVeiculo;
    //}
    
    public int getQuilometroAbastecido() {
        return quilometroAbastecido;
    }

    public void setQuilometroAbastecido(int quilometroAbastecido) {
        this.quilometroAbastecido = quilometroAbastecido;
    }

    public int getQuilometroAbastecidoAnterior() {
        return quilometroAbastecidoAnterior;
    }

    public void setQuilometroAbastecidoAnterior(int quilometroAbastecidoAnterior) {
        this.quilometroAbastecidoAnterior = quilometroAbastecidoAnterior;
    }

    public int getCodVeiculo() {
        return codVeiculo;
    }

    public void setCodVeiculo(int codVeiculo) {
        this.codVeiculo = codVeiculo;
    }

    public int getCodAbastecimento() {
        return codAbastecimento;
    }

    public void setCodAbastecimento(int codAbastecimento) {
        this.codAbastecimento = codAbastecimento;
    }

    public float getQuantidadeAbastecida() {
        return quantidadeAbastecida;
    }

    public void setQuantidadeAbastecida(float quantidadeAbastecida) {
        this.quantidadeAbastecida = quantidadeAbastecida;
    }

    public Date getDataAbastecimento() {
        return dataAbastecimento;
    }

    public void setDataAbastecimento(Date dataAbastecimento) {
        this.dataAbastecimento = dataAbastecimento;
    }
    
    
    
}
