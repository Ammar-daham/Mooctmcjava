
import fi.helsinki.cs.tmc.edutestutils.MockStdio;
import fi.helsinki.cs.tmc.edutestutils.Points;
import fi.helsinki.cs.tmc.edutestutils.ReflectionUtils;
import java.lang.reflect.Method;
import org.junit.*;
import static org.junit.Assert.*;

@Points("02-09")
public class YkkostenOsuusTest {

    @Rule
    public MockStdio io = new MockStdio();

    @Test(timeout = 1000)
    public void test1() {
        testaa("0\n", "ei", "0", "1", "-1");
    }

    @Test(timeout = 1000)
    public void test2() {
        testaa("1\n2\n0\n", "0.5", "1", "0.25");
    }

    @Test(timeout = 1000)
    public void test3() {
        testaa("5\n4\n3\n1\n0\n", "0.25", "1");
    }

    @Test(timeout = 1000)
    public void test4() {
        testaa("5\n4\n1\n0\n", "0.33", "0.5", "1");
    }

    public void testaa(String syote, String odotettu, String... eiOdotetut) {

        int oldOut = io.getSysOut().length();
        io.setSysIn(syote);
        callMain(YkkostenOsuus.class);
        String out = io.getSysOut().substring(oldOut);

        assertTrue("Kun syöte oli:\n" + syote + ", odotettiin tulostusta:\n" + odotettu + "\nmutta sitä ei löytynyt.", out.contains(odotettu));
        for (String eiOdotettu : eiOdotetut) {
            assertFalse("Kun syöte oli:\n" + syote + ", tulostuksessa ei pitäisi olla:\n" + eiOdotettu + "", out.contains(eiOdotettu));
        }
    }

    private void callMain(Class kl) {
        try {
            kl = ReflectionUtils.newInstanceOfClass(kl);
            String[] t = null;
            String x[] = new String[0];
            Method m = ReflectionUtils.requireMethod(kl, "main", x.getClass());
            ReflectionUtils.invokeMethod(Void.TYPE, m, null, (Object) x);
        } catch (Throwable e) {
            fail("Jotain kummallista tapahtui. Saattaa olla että " + kl + "-luokan public static void main(String[] args) -metodi on hävinnyt\n"
                    + "tai ohjelmasi kaatui poikkeukseen. Lisätietoja " + e);
        }
    }

}
