/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread;

/**
 *
 * @author nguye
 */
public class ClassExtendThread extends Thread{

    public ClassExtendThread(String name) {
        super(name);
    }
    

    @Override
    public void run() {
        super.run(); //To change body of generated methods, choose Tools | Templates.
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " - " + this.getName());
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println(this.getName() + " - " + "successfully");
        
    }
    public static void main(String[] args) {
        ClassExtendThread thread1 = new ClassExtendThread("Sulley Nguyen");
        ClassExtendThread thread2 = new ClassExtendThread("Bubu Nguyen");
        
        thread1.start();
        thread2.start();
        
    }
    
}
