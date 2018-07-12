import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class CarClient {
	public static void main(String[] args) throws RemoteException {
		try {
			CarInterface c = (CarInterface) Naming.lookup("rmi://localhost:7002/Server");
			System.out.println("Client Started!");
			Car  car = new Car("Chevrolet", "Grey", 8000.90);
			System.out.println("\nCar Detail Before Registration\n=============================\n" + car);
			car.setPlate(c.register(car));
			System.out.println("\nCar Detail After Registration\n============================\n" + car);
		} catch (MalformedURLException murle) {
			System.out.println("MalformedURLException");
			System.out.println(murle);
		} catch (RemoteException re) {
			System.out.println("RemoteException");
			System.out.println(re);
		} catch (NotBoundException nbe) {
			System.out.println("NotBoundException");
			System.out.println(nbe);
		} catch (java.lang.ArithmeticException ae) {
			System.out.println("java.lang.ArithmeticException");
			System.out.println(ae);
		}
	}
}
