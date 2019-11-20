package exercicios;
import java.util.*;
public class exer1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int i,n;
		
		fato();
		
	}
	public static void fato() {
		Scanner in = new Scanner(System.in);
		int i,r=1,n ;
		System.out.println("Insira um número");
		n = in.nextInt();
		
			for(i =1;i>=0 && i<=n; i++) {
				r = n*i*n ;	 
		System.out.println(r);		
				
			}
			

	}
	
	
	
	
		public static void tabuada() {
			Scanner in = new Scanner(System.in);
			int i,r,n,v;
			System.out.println("numero da tabuada");
			n = in.nextInt();
			System.out.println("Até onde vai");
			v = in.nextInt();
			for(i=1; i<=v;i++) {
				r = n*i;
				System.out.println(n+"x"+i+"="+r);
				
			}		
	}
		public static void sexoIdade() {
			Scanner in = new Scanner(System.in);
			int  sexo, idade, a;
			
			System.out.println("Insira seu sexo \n 1 = Masculino \n 2 = feminino");
			sexo = in.nextInt();
			System.out.println("Insira sua idade");
			idade= in.nextInt();
			
			if(sexo == 1) {
				if(idade >= 65) {
					System.out.println("Você já pode se aposentar");
				}else {
					a = 65 - idade;
					System.out.println("Falta "+a+" Anos para você se aposentar");
				}
			}else  {
				if(idade >= 60) {
					System.out.println("Você já pode se aposentar");
				}else {
					a = 60 - idade;
					System.out.println("Falta "+a+" Anos para você se aposentar");
				}
			}
		}

			public static void potencia() {
				Scanner in = new Scanner(System.in);
				int n, r;
					System.out.println("Digite um número");
					n = in.nextInt();
					
					r = n*n;
					System.out.println("A potência de "+n+" é: " +r);
				
			}
			
			
	

}
