import org.w3c.dom.ls.LSOutput;

public class SqEquation {
double a=0;
double b=0;
double c=0;

    public SqEquation() {

    }

    public double getA() {

        return a;
    }

    public double getB() {

        return b;
    }

    public double getC() {

        return c;
    }

    public double discriminant(double a, double b, double c) {

        return (b*b-4*a*c);
    }

    public double[] roots(double a, double b, double c){
        double d=discriminant(a,b,c);
        double [] roots;
       try{


        if(d<0){
            throw new ArithmeticException();
        }
        else if(d==0){
            roots= new double[1];
            roots[0]=-b/(2*a);
            return  roots;
        }
        else{
            roots= new double[2];
            roots[0]=((-b+Math.sqrt(d))/2*a);
            roots[1]=((-b-Math.sqrt(d))/2*a);
            return roots;

        }
       }catch (ArithmeticException e){
           System.out.println("equation has no roots");
            roots=new double[0];
           return null;

       }



    }

}
