/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest3;

/**
 *
 * @author Laboratorio
 */
public class Pedido {
    
    private Integer codigo;
    private String garcom;
    private String mesa;
    private Integer consumacao;

    /**
     * @return the codigo
     */
    public Integer getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the garcom
     */
    public String getGarcom() {
        return garcom;
    }

    /**
     * @param garcom the garcom to set
     */
    public void setGarcom(String garcom) {
        this.garcom = garcom;
    }

    /**
     * @return the mesa
     */
    public String getMesa() {
        return mesa;
    }

    /**
     * @param mesa the mesa to set
     */
    public void setMesa(String mesa) {
        this.mesa = mesa;
    }

    /**
     * @return the consumacao
     */
    public Integer getConsumacao() {
        return consumacao;
    }

    /**
     * @param consumacao the consumacao to set
     */
    public void setConsumacao(Integer consumacao) {
        this.consumacao = consumacao;
    }
    
    
}
