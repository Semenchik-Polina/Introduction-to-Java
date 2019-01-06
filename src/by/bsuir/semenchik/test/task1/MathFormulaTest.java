package by.bsuir.semenchik.test.task1;

import by.bsuir.semenchik.fundamental.task1.util.MathFormula;
import junit.framework.TestCase;

public class MathFormulaTest extends TestCase {

    public void testCalculate() {
        double expected = 2.354398947256138;
        double actual = MathFormula.calculate(2,5);
        assertEquals(expected, actual, 0.000001);
    }
}