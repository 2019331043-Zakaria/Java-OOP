class Stack{
	
	    int top;
		
		int array[]=new int[10];
		
		void push(int item){
	     
         if(top==9)
		 {
			 System.out.println("Stack pverflow");
			 
		 }	
         else
		 {
             array[++top]=item;
             
		 }			 
		
		}
		
	   int pop(){
	          if(top<0){
				  System.out.println("Stack Empty\n");
				  return -1;
			  }
			  else{
				  return array[top--];
			  }
			 

			  
	   }
	   
	   Stack(){
		   
		   top=-1;
	   }
}