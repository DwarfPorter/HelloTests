package ru.geekbrains.hellotests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(MockitoJUnitRunner.class)
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void calculationTest(){
        Operation mock = mock(Operation.class);
        Calculation underTest = new Calculation(mock).setArg1(1).setArg2(1);
        underTest.calculate();

        verify(mock).doOperation(1,1);
    }

    @Test
    public void inegrationTest(){
        Operation add = new Addition();
        Calculation underTest = new Calculation(add).setArg1(1).setArg2(1);
        int actual = underTest.calculate();
        assertEquals(2, actual);
    }

    public class stubOperation implements Operation{

        @Override
        public int doOperation(int arg1, int arg2) {
            return 0;
        }
    }
}