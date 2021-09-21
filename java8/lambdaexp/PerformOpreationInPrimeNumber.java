package java8.lambdaexp;

interface primenumbercheck{
	int checkprimenumber(int primenumber);
}

public class PerformOpreationInPrimeNumber {

	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		primenumbercheck primenumber1 =(int primenumber)->
		{
		int i , m=0,flag=0;
		m=primenumber/2;
	  if(primenumber==0||primenumber==1){  
			   System.out.println(primenumber+" is not prime number");      
			  }else{  
			   for(i=2;i<=m;i++){      
			    if(primenumber%i==0){      
			     System.out.println(primenumber+" is not prime number");      
			     flag=1;      
			     break;      
			    }      
			   }      
			   if(flag==0)  { System.out.println(primenumber+" is prime number"); }  
			  }//end of else  
	return primenumber;
		};
		primenumber1.checkprimenumber(0);
		primenumber1.checkprimenumber(1);
		primenumber1.checkprimenumber(2);
		primenumber1.checkprimenumber(3);
		primenumber1.checkprimenumber(4);
		primenumber1.checkprimenumber(5);
		primenumber1.checkprimenumber(6);
		primenumber1.checkprimenumber(7);
		primenumber1.checkprimenumber(8);
		primenumber1.checkprimenumber(9);
		
	}

}
