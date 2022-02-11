public class grootImplement implements IAmGroot {
    // private int anumber;
    // private String astring;

    // public grootImplement() {
    //     anumber = 10;
    //     astring = "hola";
    // }

    public int standardNum() {
        return 7;
    }
    public Shoe creator(Heel a) {
        Shoe x = new Shoe(7, a.getColor());
        return x;
    }
    public boolean[] meanTeacher(String[] x) {
        boolean[] teacherarr = {true, false, true};
        return teacherarr;
    }
}
