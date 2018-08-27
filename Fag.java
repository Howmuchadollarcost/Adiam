class Fag{
    public String fagNavn;

    Fag(String n){
        fagNavn = n;
    }

    public String hentFagNavn(){
        return fagNavn;
    }

    @Override
    public String toString(){
        return "Fag: " + fagNavn;
    }

}
