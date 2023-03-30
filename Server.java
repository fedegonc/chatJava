import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
	final static String HOST_URL = "rmi://127.0.0.1/RefObjetoRemoto";
	public static void main(String args[]){
		try{
			System.setProperty("java.rmi.server.hostname","127.0.0.1");
			LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
			
			Test objeto = new Test();
			Naming.bind(HOST_URL, objeto);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}