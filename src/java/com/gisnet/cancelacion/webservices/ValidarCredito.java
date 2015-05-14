/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gisnet.cancelacion.webservices;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author leonel
 */
@WebService(serviceName = "ValidarCredito")
public class ValidarCredito {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "validarCredito")
    public String validarCredito(@WebParam(name = "numeroDeCaso") int numeroDeCaso) {
        String si="";
        if (numeroDeCaso > 0 && numeroDeCaso <= 555555555)
        {
            si = "procedente";
        }
        else{
            if(numeroDeCaso > 555555555 && numeroDeCaso <= 999999999)
            {
                si = "no procedente";
            }    
        }
        
        
        return si;
    }
}
