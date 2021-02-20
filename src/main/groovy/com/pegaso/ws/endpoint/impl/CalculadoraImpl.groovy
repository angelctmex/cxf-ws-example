package com.pegaso.ws.endpoint.impl

import com.pegaso.ws.endpoint.Calculadora
import org.springframework.stereotype.Service

import javax.jws.WebService

@Service("calculadoraEndpoint")
@WebService(endpointInterface='com.pegaso.ws.endpoint.Calculadora')
class CalculadoraImpl implements Calculadora {

    public double suma(double a, double b) {
        return a + b
    }

}
