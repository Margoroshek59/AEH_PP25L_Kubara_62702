package rejestracjahotelowa;

import java.util.List;

public class premium extends Pokoje {
    private boolean  maJacuzzi;

    public premium( int numer, int liczbaLozek, double cenaZaNoc, boolean maJacuzzi ) {
       super(numer, liczbaLozek, cenaZaNoc);
       this.maJacuzzi = maJacuzzi;
    }

    @Override
    public String typPokoju(){
        return "Premium" + (maJacuzzi ? " z jacuzzi " : "");
    }
}
