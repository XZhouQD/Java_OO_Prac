package prac22;

public class Main {

	public static void main (String[] args) {
		GermanPlugConnector plugConnector = new GermanPlug();
		UKElectricalSocket electricalSocket = new UKElectricalSocket();
		UKPlugConnector ukAdapter = new GermanToUKPlugAdapter(plugConnector);
		electricalSocket.plugIn(ukAdapter);
	}

}
