package com.pegaso.ws.endpoint.impl

import com.pegaso.ws.dto.BalanceQueryDto
import com.pegaso.ws.endpoint.Hello
import org.springframework.stereotype.Service

import javax.jws.WebService


@Service("helloEndpoint")
@WebService(endpointInterface="com.pegaso.ws.endpoint.Hello")
class HelloImpl implements Hello {


    String saluda (){
         "Ya quedo el ws...."
    }

    BalanceQueryDto getBalanceQuery( String pan ){
        return new BalanceQueryDto( code: 1, description: "Consulta realizada con éxito", availableAmount: 22.50 )


    }


}
