package com.pegaso.ws.secure;

import java.io.IOException;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;
import org.apache.ws.security.WSPasswordCallback;

public class ServerPasswordCallback implements CallbackHandler {

    public void handle(Callback[] callbacks) throws IOException,
            UnsupportedCallbackException {

        for (int i = 0; i < callbacks.length; i++) {

            WSPasswordCallback pc = (WSPasswordCallback) callbacks[i];
    
            if (pc.getUsage() == WSPasswordCallback.SIGNATURE
                    || pc.getUsage() == WSPasswordCallback.DECRYPT) {
                
                System.out.println( "El usuario proporcionado es: {}" + pc.getIdentifier());
                if (pc.getIdentifier().equals("syc")) {
                    System.out.println("Password para server");
                    pc.setPassword("12345678");
                }
                if (pc.getIdentifier().equals("bam")) {
                    System.out.println("Password para BAM");
                    println(
                        """ 
                        ***************************************************************
                        ***************************************************************
                        ***************************************************************
                         ===== user para BAM =====
                        """)

                    pc.setPassword("12345678");
                }

            }

        }

    }
}