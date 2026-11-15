class customStack{
    private int size;
    private int[] array;
   private int top;
public customStack(int value){
this.size=value;
array=new int[size];
top=-1;
}
public boolean isEmpty(){
return (top==-1);
}
public boolean isFull(){
return(top==size-1);
}
public void push(int v){
if(isFull()){
System.out.println("full stack!!");
return;
}
array[++top]=v;
}
public int pop(){
if(isEmpty()){
System.out.println("Empty stack!!");
return -1;
}
return array[top--];
}
public void display(){
if(isEmpty()){
System.out.println("Empty stack!!");
return;
}
for(int i=top;i>=0;i--){
    System.out.println(array[i]);
}
}
}
public class Main{
public static void main(String[]args){
customStack s =new customStack(5);
s.push(23);
s.push(43);
s.push(56);
s.push(67);
s.pop();
s.push(45);
s.push(87);
s.display();
}
}


