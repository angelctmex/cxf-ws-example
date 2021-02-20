package com.pegaso.ws.endpoint

import javax.jws.WebMethod
import javax.jws.WebParam
import javax.jws.WebService

@WebService
interface Calculadora {

    @WebMethod
    public double suma(double a, double b) 

}