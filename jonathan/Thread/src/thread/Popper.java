/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package thread;

/**
 *
 * @author student
 */
public class Popper extends Thread{
MyStack stack;
    public Popper(MyStack stack, String name){
        this.stack=stack;
        this.setName(name);
    }

    public void run() {
         System.out.println(this.getName()+" is called");

        if(stack.last!=-1){
     for(int i=0; i<10; i++){
         stack.pop();
     }
     }
      
    }


}
