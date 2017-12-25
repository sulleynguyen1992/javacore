/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcallback;

/**
 *
 * @author nguye
 */
public class Caller {

    public void register(CallBack callBack){
        callBack.methodToCallBack();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caller caller = new Caller();
        CallBack callBack1 = new CallBackImpl();
        CallBack callBack2 = new CallBackImpl2();
        caller.register(callBack1);
        caller.register(callBack2);
        
    }
    
}
