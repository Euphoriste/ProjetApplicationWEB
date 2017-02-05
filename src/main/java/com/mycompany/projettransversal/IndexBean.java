
package com.mycompany.projettransversal;

import javax.annotation.ManagedBean;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author HeloiseR
 */
@ManagedBean
@RequestScoped
public class IndexBean {
    
    private String message = "Hello World";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
}
