/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package thread;

/**
 *
 * @author student
 */
public class Pusher extends Thread{
String value;
MyStack stack;

public Pusher(MyStack stack, String obj, String name){
    this.stack= stack;
    value=obj;
  
    this.setName(name);
}
    public void run() {
        System.out.println(this.getName()+ " is called");
        if(stack.last<stack.size){
        for(int i=0; i<10; i++){
        stack.push(value+i);
        }
        }
 
    }

}
