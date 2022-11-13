import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass{

    @Test //Test1
    public void testGetLocalNumber() {
        int localNumber = getLocalNumber();
        Assert.assertTrue("метод getLocalNumber() вернул не 14", localNumber == 14);
    }

    @Test //Test2
    public void testGetClassNumber() {
        int classNumber = getClassNumber();
        Assert.assertTrue("метод getClassNumber() возвращает результат не больше 45", classNumber > 45);
    }

    @Test //Test3
    public void testGetClassString() {
        String result = getClassString();
        Assert.assertTrue("Приветствие в ожидаемом формате отсутствует",result.contains("hello") || result.contains("Hello"));
    }
}
