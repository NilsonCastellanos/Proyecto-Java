/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cliente;

import Empleado.DPersona;

/**
 *
 * @author Carolina
 */

    
   
   public class DCliente extends DPersona{
       
       
    private String codigo_cliente;

    public DCliente() {
    }

    public DCliente(String codigo_cliente) {
        this.codigo_cliente = codigo_cliente;
    }

    public String getCodigo_cliente() {
        return codigo_cliente;
    }

    public void setCodigo_cliente(String codigo_cliente) {
        this.codigo_cliente = codigo_cliente;
    }
    
}

