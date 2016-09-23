package base;

public class MyInteger {

	private int iValue;
	
	public MyInteger(int Value){
		iValue = Value;
	}
	
	public int getiValue(){
		return iValue;
	}
	
	public boolean isEven(){
		if (iValue%2==0){
			return true;
		}
			else{
				return false;
			}
	}
	
	public boolean isOdd(){
		if (iValue%2==1){
			return true;
		}
			else{
				return false;
				}
	}
	
	public boolean isPrime(){
		
		int inc,x=777; 
		boolean prime = false;
		x=iValue/2;    
		for(inc=2;inc<=x;inc++){    
		   if(iValue%inc==0){        
		   prime=true;    
		   break;    
		  }    
		  }    
		if(prime==false){
			return true;
		}
			else{
				return false;
			} 
		}  
	
	public static boolean isEven(int iValue){
		if (iValue%2==0){
			return true;
		}
			else{
				return false;
			}
	}
	
	public static boolean isOdd(int iValue){
		if (iValue%2==1){
			return true;
		}
			else{
				return false;
				}
	}
	
	public static boolean isPrime(int iValue){

		int inc,x=777; 
		boolean prime = false;
		x=iValue/2;    
		for(inc=2;inc<=x;inc++){    
		   if(iValue%inc==0){        
		   prime=true;    
		   break;    
		  }    
		  }    
		if(prime==false){
			return true;
		}
			else{
				return false;
			} 
		}
	
	public static boolean isEven(MyInteger Integer){
		if (Integer.iValue%2==0){
			return true;
		}
			else{
				return false;
			}
	}
	
	public static boolean isOdd(MyInteger Integer){
		if (Integer.iValue%2==1){
			return true;
		}
			else{
				return false;
				}
	}
	
	public static boolean isPrime(MyInteger Integer){
		int y=Integer.iValue;

		int inc,x=777; 
		boolean prime = false;
		x=y/2;    
		for(inc=2;inc<=x;inc++){    
		   if(y%inc==0){        
		   prime=true;    
		   break;    
		  }    
		  }    
		if(prime==false){
			return true;
		}
			else{
				return false;
			} 
		}  
}
