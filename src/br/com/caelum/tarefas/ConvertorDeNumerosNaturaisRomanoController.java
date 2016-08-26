package br.com.caelum.tarefas;



import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@WebServlet( "/adiciona")
public class ConvertorDeNumerosNaturaisRomanoController extends HttpServlet {

	 
	 @Override
	 protected void service(HttpServletRequest	request, HttpServletResponse	response) {
		
		 String  numero = request.getParameter("natural");
		 
      
       
			//System.out.println("    NUMERO :"+numero);
			int vlr = Integer.parseInt(numero);
			 
			
			
		    //int sobra = 0;
			String roma ="";
		
		
			
			if(vlr < 4000){
				
				while(vlr >= 1000){
					roma +="M";
					vlr -= 1000;
				}
				
				while(vlr >= 900){
					roma += "CM";
					vlr -= 900;
				}
				while(vlr >= 500){
					roma +="D";
					vlr -= 500;
				}
				while(vlr >= 400){
					roma += "CD";
					vlr -= 400;
				}
				while(vlr >= 100){
					roma +="C";
					vlr -=100;
				}
				while(vlr >= 90){
					roma +="XC";
					vlr -= 90;
				}
				while(vlr >= 50){
					roma +="L";
					vlr -= 50;
				}
				while(vlr >= 40){
					roma +="XL";
					vlr -= 40;
				}
				while(vlr >= 10){
					roma += "X";
					vlr -= 10;
				}
				 while (vlr >= 9) {
		                roma += "IX";
		                vlr -= 9;
		            }
		            
		            while (vlr >= 5) {
		                roma += "V";
		                vlr -= 5;
		            }
		           
		            while (vlr >= 4) {
		                roma += "IV";
		                vlr -= 4;
		            }
		   
		            while (vlr >= 1) {
		                roma += "I";
		                vlr -= 1;
		            }
		            System.out.println("O Algarismo Romano correspondente a" + roma);
		        } else {
		            System.out.print("Valor Inválido!");
				
			}
    System.out.println(vlr);
	
	 
	 }
	
	/*@RequestMapping("abrirurl")
	public String executa(){
		
		System.out.println("vai buscar o formulario-numeros");
		
		return "tarefas/formulario-numeros";
		
	}
	*/
	/*public String converter(){

		System.out.println("    NUMERO :"+numero);
		Integer vlr = Integer.parseInt(numero);
		 
		
		Integer n;
	    //int sobra = 0;
		String roma ="";
	
		n= vlr;
		
		if(vlr < 4000){
			
			while(vlr >= 1000){
				roma +="M";
				vlr -= 1000;
			}
			
			while(vlr >= 900){
				roma += "CM";
				vlr -= 900;
			}
			while(vlr >= 500){
				roma +="D";
				vlr -= 500;
			}
			while(vlr >= 400){
				roma += "CD";
				vlr -= 400;
			}
			while(vlr >= 100){
				roma +="C";
				vlr -=100;
			}
			while(vlr >= 90){
				roma +="XC";
				vlr -= 90;
			}
			while(vlr >= 50){
				roma +="L";
				vlr -= 50;
			}
			while(vlr >= 40){
				roma +="XL";
				vlr -= 40;
			}
			while(vlr >= 10){
				roma += "X";
				vlr -= 10;
			}
			 while (vlr >= 9) {
	                roma += "IX";
	                vlr -= 9;
	            }
	            
	            while (vlr >= 5) {
	                roma += "V";
	                vlr -= 5;
	            }
	           
	            while (vlr >= 4) {
	                roma += "IV";
	                vlr -= 4;
	            }
	   
	            while (vlr >= 1) {
	                roma += "I";
	                vlr -= 1;
	            }
	            System.out.println("O Algarismo Romano correspondente a " +n+ " é " + roma);
	        } else {
	            System.out.print("Valor Inválido!");
			
		}


		return "tarefas/formulario-numeros";
		
	}*/

}
