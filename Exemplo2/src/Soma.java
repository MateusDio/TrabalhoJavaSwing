
public class Soma {
    int a,b;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public Soma(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Soma{" + "a=" + a + ", b=" + b + '}';
    }
    public int Somar(){
        return (a+b);
        
    }
    
     public int Subtrair(){
        return (a-b);
        
    }
     
      public int Dividir(){
        return (a/b);
        
    }
      
      public int Multiplicar(){
        return (a*b);
        
    }
}
