package com.pegaso.ws.endpoint

import com.pegaso.ws.dto.BalanceQueryDto

import javax.jws.WebMethod
import javax.jws.WebParam
import javax.jws.WebService

@WebService
interface Hello {

    @WebMethod
    String saluda( @WebParam(name = "name") String name )

    //@WebMethod
    //BalanceQueryDto getBalanceQuery(@WebParam(name = "pan") String pan )

}
