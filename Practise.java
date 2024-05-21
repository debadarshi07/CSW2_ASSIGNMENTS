// import java.util.*;
import java.io.*;
public class Practise1 extends Thread{ 
    static int i=0;
    @Override
    public void run(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        writeToFile("file.txt");   
    }

    public void writeToFile(String fileName){
        File file=new File(fileName);
        try{
            if(file.exists()) System.out.println("File exists.");
            else file.createNewFile();
        }catch(IOException e){
            System.out.println("Error creating file.");
        }
        try {
            // FileWriter writer=new FileWriter(file,true);
            for( i=0;i<10000;i++){
                try {
                    Thread.sleep(500);
                    String toPrint=i+" printed by: "+Thread.currentThread().getName();
                    FileWriter writer=new FileWriter(file,true);
                    writer.write(toPrint+"\n");
                    writer.close();
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
            // writer.close();
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        } 
        
    }
    public static void main(String[] args) {

        Practise1 thread1=new Practise1();
        Practise1 thread2=new Practise1();
        Practise1 thread3=new Practise1();
        Practise1 thread4=new Practise1();
        Practise1 thread5=new Practise1();
        
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
