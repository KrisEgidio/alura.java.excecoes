
public class Fluxo {
	public static void main(String[] args) {
        System.out.println("Ini do main");
         try {
        	 metodo1();	 
         //}catch(MinhaExcecao ex){
         }catch(Exception ex){ //forma genérica de chamar qualquer exceção
        	 
        	 System.out.println(ex.getMessage());
         }
        
        
        System.out.println("Fim do main");
    }

    private static void metodo1() throws MinhaExcecao {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MinhaExcecao {
        System.out.println("Ini do metodo2");
       /*for(int i = 1; i <= 5; i++) {
            
        	System.out.println(i);
            
           try {
            	int a = i / 0;            	
            }catch(ArithmeticException | NullPointerException ex){
            	System.out.println(ex.getMessage());
            	ex.printStackTrace();
            }
            
        }*/
        
        //criação de uma exceção e jogando na pilha
       	throw new MinhaExcecao("deu errado");
        
        //System.out.println("Fim do metodo2");
    }
}
