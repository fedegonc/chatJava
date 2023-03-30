import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Test extends UnicastRemoteObject implements IInterface{
	private int x = 100;
	public Test() throws RemoteException{
	
	}
	public int Subtrair() throws RemoteException{
		x--;
		return x;
	}
}