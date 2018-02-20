package main;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

public class TimeService extends UnicastRemoteObject implements TimeServiceInterface {

	protected TimeService() throws RemoteException {
	}

	public Date getDateAndTime() throws RemoteException {

		System.out.println("success");

		Date date = new Date();

		return date;

	}

}