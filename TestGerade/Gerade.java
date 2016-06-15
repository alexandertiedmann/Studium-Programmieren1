public class Gerade {
    private double m;
    private double t;

    public Gerade(double m_new, double t_new){
        this.setT(t_new);
        this.setM(m_new);
    }
    public void setM(double m_new){
        m = m_new;
    }
    public void setT(double t_new){
        t = t_new;
    }
    public double getM(){
        return m;
    }
    public double getT(){
        return t;
    }

    public String getGleichung(){
        String gleichung = new String("y=("+this.getM()+")x+("+this.getT()+")");
        return gleichung;
    }
    public void verschiebeGerade(Punkt punkt){
        double temp = this.getM() * punkt.getX() + this.getT();
        double deltat = punkt.getY() - temp;
        this.t = this.getT() + deltat;
    }
    public void spiegelAnX(Gerade g){
        g.setM((g.getM() * -1 ));
        g.setT((g.getT() * -1 ));
    }
    public boolean checkPunkt(Punkt punkt){
        if ( (this.m*punkt.getX()+this.t) == punkt.getY() ) {
            return true;
        }else{
            return false;
        }
    }
}
