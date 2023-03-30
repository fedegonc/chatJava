import java.rmi.Naming;

public class Client{
	public static void main(String args[]){
		try{
			IInterface objetoRemoto = (IInterface) Naming.lookup("rmi://127.0.0.1/RefObjetoRemoto");
			for(int i=0;i<10;i++){
				System.out.println("Resultado: "+objetoRemoto.Subtrair());
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}