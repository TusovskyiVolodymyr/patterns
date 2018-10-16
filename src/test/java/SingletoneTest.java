import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import singletone.UniquePerson;
import singletone.doubleCheck.DoubleCheckSingleton;
import singletone.firstImpl.SingletoneFirst;
import singletone.secondImpl.SingletoneEnum;

public class SingletoneTest {

    private UniquePerson uniquePersonFirst;
    private UniquePerson uniquePersonSecond;

    private UniquePerson uniquePersonThird;

    private UniquePerson uniquePersonEnumFirst;
    private UniquePerson uniquePersonEnumSecond;

    private UniquePerson doubleCheckedFirst;
    private UniquePerson doubleCheckedSecond;

    @BeforeMethod
    public void init() {
        uniquePersonFirst = SingletoneFirst.getPerson();
        uniquePersonSecond = SingletoneFirst.getPerson();
        uniquePersonThird = new UniquePerson();
        uniquePersonEnumFirst = SingletoneEnum.INSTANSE.getUniquePerson();
        uniquePersonEnumSecond = SingletoneEnum.INSTANSE.getUniquePerson();
        doubleCheckedFirst = DoubleCheckSingleton.getUniquePerson();
        doubleCheckedSecond = DoubleCheckSingleton.getUniquePerson();
    }

    @Test
    public void test() {
        Assert.assertSame(uniquePersonFirst, uniquePersonSecond, "Objects are same");
        Assert.assertEquals(uniquePersonFirst, uniquePersonSecond);
        Assert.assertNotSame(uniquePersonFirst, uniquePersonThird);
    }

    @Test
    public void testEnum() {
        Assert.assertSame(uniquePersonEnumFirst, uniquePersonEnumSecond, "Objects are same");
        Assert.assertEquals(uniquePersonEnumFirst, uniquePersonEnumSecond);
        Assert.assertNotSame(uniquePersonEnumFirst, uniquePersonThird);
    }

    @Test
    public void doubleCheckedTest() {
        Assert.assertSame(doubleCheckedFirst, doubleCheckedSecond, "Objects are same");
        Assert.assertEquals(doubleCheckedFirst, doubleCheckedSecond);
        Assert.assertNotSame(doubleCheckedFirst, uniquePersonThird);
    }
}
