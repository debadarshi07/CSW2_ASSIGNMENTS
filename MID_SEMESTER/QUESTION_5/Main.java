package Q5;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public boolean isPrime(int number){
		if(number==1) return false;
		for(int i=2;i<number/2+1;i++){
			if(number%i==0) return false;
		}
		return true;
	}

	public int[] primeArr(int arr[]){
		int answer[]=new int[arr.length];
		int index=0;
		for(int i=0;i<arr.length;i++){
			if(isPrime(arr[i])){
				answer[index++]=arr[i];
			}
		}
		return answer;
	}

	public static void writeFile(String fileName,int arr[]){
		try{
			File file=new File(fileName);
			FileWriter writer=new FileWriter(file,true);
			for(int i=0;i<arr.length;i++){
				writer.write(arr[i]+" ");
			}
			writer.close();
		}catch(IOException e){
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		
	}
}
