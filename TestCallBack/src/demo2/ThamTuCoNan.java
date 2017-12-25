/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo2;

/**
 *
 * @author nguye
 */
public class ThamTuCoNan implements ThamTu {

    private Event event = new Event(1);

    public ThamTuCoNan() {
        moniter();
        somethingHappend(event);
    }

    @Override
    public void phoneToHusband() {
        //check evetn
        if(event.getTrangthai() == 1){
            System.out.println("Da vao hotel");
        }
    }

    private void moniter() {
        System.out.println("hello");
    }

    private void somethingHappend(Event event) {
        this.event = event;
        System.out.println("Status " + event.getTrangthai()); 
    }

}
