package com.pegaso.ws.endpoint.impl

import com.pegaso.ws.endpoint.Hello
import org.apache.xpath.operations.String
import org.springframework.stereotype.Service

import javax.jws.WebService


@Service("helloEndpoint")
@WebService(endpointInterface = "HelloEndpoint")
public class HelloImpl implements Hello {


    String saluda (){
         "Ya quedo el ws...."
    }


}
