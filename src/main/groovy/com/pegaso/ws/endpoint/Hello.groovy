package com.pegaso.ws.endpoint

import com.pegaso.ws.dto.BalanceQueryDto

import javax.jws.WebMethod
import javax.jws.WebService

@WebService
interface Hello {

    @WebMethod
    String saluda ()

    @WebMethod
    BalanceQueryDto getBalanceQuery(String pan )

}
