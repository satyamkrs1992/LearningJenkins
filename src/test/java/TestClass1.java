import org.testng.annotations.*;

public class TestClass1 {

    @BeforeClass
    public void beforeClass(){
        System.out.println("Inside Before Class");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("Inside Before Test");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Inside Before Method");
    }

    @Test
    public void test(){
        System.out.println("Inside Test");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("Inside After Class");
    }
}
