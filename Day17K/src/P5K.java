
import java.util.*;


public class P5K extends Exception{
	P5K(int x){
        System.out.print(Math.abs(15-x)+" kg : ");
    }
}
	class Main {
	    void validWeight(int weight) throws P5K {
	        if(weight>15)
	            throw new P5K(weight);
	        else
	            System.out.println("You are ready to fly!");
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Main ob=new Main();
	        Scanner in=new Scanner(System.in);
	        for(int i=0;i<2;i++){
	            try{
	                ob.validWeight(in.nextInt());
	            }catch(P5K e){
	                System.out.println(e);
	            }
	        }
	}
	}


