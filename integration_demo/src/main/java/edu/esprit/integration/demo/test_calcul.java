package edu.esprit.integration.demo;

public class test_calcul {
	
	
		public test_calcul() {
			// TODO Auto-generated constructor stub
		}

		public int calc(int x  , int b ,String c) {
			int d=0;
			if (c =="add") 
				d=x+b;
			
			
			else if (c=="soustraire")
				d=x-b;
			
			else if (c=="deviser")
				d=x/b;
			else if (c=="multiplication")
				d=x*b;
			
			return d;
				
			
			
		}

	}


