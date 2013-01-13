/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package thread;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author student
 */
public class mainStack {

    public static void main(String args[]){
       MyStack stack= new MyStack(100);


      Pusher push1=new Pusher(stack, "valA","PUSHER A");
      push1.start();
      Pusher push2=new Pusher(stack, "valB", "PUSHER B");
      push2.start();
      Popper pop= new Popper(stack, "POPPER");
      pop.start();

    
    }
}
