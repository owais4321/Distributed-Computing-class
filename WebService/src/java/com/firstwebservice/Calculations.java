/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.firstwebservice;

import javax.jws.WebMethod;
import javax.jws.WebService;
import static javax.swing.text.html.FormSubmitEvent.MethodType.GET;
import javax.websocket.server.PathParam;

/**
 *
 * @author Owais
 */
@WebService
public class Calculations {
    
    @WebMethod
    public int add(@PathParam("name") int a ,@PathParam("name1") int b){
        return a+b;
    }
    
    @WebMethod
    public String test(){
        return "helloooo";
    }
}
