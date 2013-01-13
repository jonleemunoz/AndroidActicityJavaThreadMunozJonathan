/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package thread;

/**
 *
 * @author student
 */
public class MyStack {
 protected int size;
 protected int last;
 protected String[] arrString;


 public MyStack(int size){
     this.size=size;
     arrString= new String[size];
     last=-1;
     
 }

 public synchronized void pop(){
  if(last!=-1){
  System.out.println(arrString[last]+ " is popped");
  last--;
  }
 }

 public synchronized void push(String val){
    if(last<size){
     arrString[++last]=val;
  System.out.println(val+ " is pushed");
    }
 }

 public void display(){

     for(int i=last; i!=0; i--)
         System.out.println(arrString[i]);
 
 }

}
