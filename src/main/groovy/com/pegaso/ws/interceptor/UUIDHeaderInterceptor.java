package com.pegaso.ws.interceptor;

import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class UUIDHeaderInterceptor extends AbstractPhaseInterceptor {


    private static final Logger logger = LoggerFactory.getLogger(UUIDHeaderInterceptor.class);



    public UUIDHeaderInterceptor() {
        super(Phase.PRE_STREAM);

    }

    @Override
    public void handleMessage(Message message) throws Fault {

        Map<String, List<String>> headers = (Map<String, List<String>>) message.get(Message.PROTOCOL_HEADERS);
        if (headers == null) {
            headers = new TreeMap<String, List<String>>(
                    String.CASE_INSENSITIVE_ORDER);
            message.put(Message.PROTOCOL_HEADERS, headers);
        }

        //String method = (String)message.get(Message.REQUEST_URL).toString();
        //System.out.println("Method: " + method);


        if( true ){

            String serviceName = (String)message.get(Message.WSDL_OPERATION).toString();

            String endpoint = (String)message.get(Message.ENCODING);
            System.out.println("Endpoint: " + endpoint);
            if( serviceName != null  ){
                String[] serviceList = serviceName.split("}");
                if( serviceList != null && serviceList.length >= 2 ){
                    headers.put("service_name", Arrays.asList(serviceList[1]));
                }

            }
        }




    }

    @Override
    public void handleFault(Message message) {
        handleMessage(message);
    }
}