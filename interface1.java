public class interface1 implements MSJstuff {
    public void displaylhospitalRule() {
        System.out.println("lim x->a f(x)/g(x) = lim x->a f'(x)/g'(x)");
    }
    
    public boolean isLiu(String x) {
        if (x.equals("Liu")) {
            return true;
        }
        return false;
    }

    public int round(double a) {
        double z = a * 10;
        int b = z%10;

        if (b >= 5) {
            return (int)a+1;
        }
        else {
            return (int)a;
        }
    }
}
