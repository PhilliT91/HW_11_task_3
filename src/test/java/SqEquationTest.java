import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.*;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;


@RunWith(JUnitParamsRunner.class)
public class SqEquationTest {

    SqEquation eq = new SqEquation();


    public static final Object[] getCoefitients(){
    return new Object[]{
            new Object[]{1.00,3.00,4.00},
            new Object[]{1.00,-6.00,9.00},
            new Object[]{5.00,2.00,3.00}
    };


}


    @Test

    public void sqEquationConstructorTest(){

Assert.assertEquals("testing constructor coef A",0.00,eq.getA(),0.00);
Assert.assertEquals("testing constructor coef B",0.00,eq.getB(),0.00);
Assert.assertEquals("testing constructor coef C",0.00,eq.getC(),0.00);

    }


    @Test
    @Parameters(method ="getCoefitients")
    public void discriminantTest(double a, double b, double c){
     double discValue=0;
       discValue= eq.discriminant(a,b,c);
     Assert.assertEquals((b*b-(4*a*c)),discValue,0.00);


    }

    @Test
    public void rootsTest2Roots(){
        double[]roots=eq.roots(1,-3,-4);
        Assert.assertEquals(4,roots[0],0.00);
        Assert.assertEquals(-1,roots[1],0.00);

    }

    @Test
    public void rootsTest1Root(){
        double[]roots=eq.roots(1,-6,9);
        Assert.assertEquals(3,roots[0],0.00);


    }

    @Test
    public void rootsTestNoRoot(){
        double[]roots=eq.roots(5,2,3);
        Assert.assertNull("equation has no roots",roots);


    }

}
