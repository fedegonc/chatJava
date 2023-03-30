import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IInterface extends Remote{
	public int Subtrair() throws RemoteException;
}