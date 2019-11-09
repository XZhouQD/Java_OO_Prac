package prac22;

public class GermanToUKPlugAdapter implements UKPlugConnector {

	private GermanPlugConnector plug;

    public GermanToUKPlugAdapter(GermanPlugConnector plug) {
        this.plug = plug;
    }

    @Override
    public void provideElectricity() {
        plug.giveElectricity();
    }

}
