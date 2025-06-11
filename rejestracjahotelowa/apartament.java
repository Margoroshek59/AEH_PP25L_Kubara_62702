package rejestracjahotelowa;

public class apartament extends Pokoje{
    private boolean maBalkon;
    private boolean maKuchnie;

    public apartament(int numer, int liczbaLozek, double cenaZaNoc, boolean maBalkon, boolean maKuchnie){
        super(numer, liczbaLozek, cenaZaNoc);
        this.maBalkon = maBalkon;
        this.maKuchnie = maKuchnie;
    }
    @Override
    public String typPokoju(){
        return "Apartament" + (maBalkon ? " z balkonem" : "") + (maKuchnie ? " i kuchnia" : "");
    }
}
