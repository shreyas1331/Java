package HardPatterns;

public class pattern_magic {

	public static void main(String[] args) {
		int n=4;
		for(int i=0;i<n;i++){
		    for(int j=i;j<n;j++){
		        System.out.print('*');
		    }
		    for(int k=1;k<=(2*i)-1;k++){
		    	System.out.print(' ');
		    }
		    if(i==0){
		        for(int j=i;j<n-1;j++){ 
		        	System.out.print('*');
		        }
		    }
		    else{
		        for(int j=i;j<n;j++){   
		        	System.out.print('*');
		        }
		    }
		    System.out.println();
		}
		for(int i=n-2;i>=0;i--){
		    for(int j=i;j<n;j++){
		    	System.out.print('*');
		    }
		    for(int k=1;k<=(2*i)-1;k++){
		    	System.out.print(' ');
		    }
		    if(i==0){
		        for(int j=i;j<n-1;j++){ 
		        	System.out.print('*');
		        }
		    }
		    else{
		        for(int j=i;j<n;j++){   
		        	System.out.print('*');
		        }
		    }
		    System.out.println();
		}
	}

}
