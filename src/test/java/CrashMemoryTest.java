import static org.junit.Assert.*;

public class CrashMemoryTest {

    @org.junit.Test(expected = OutOfMemoryError.class)
    public void grabAllMemory() {
        CrashMemory crashMemory = new CrashMemory();
        crashMemory.grabAllMemory();
    }

    @org.junit.Test(expected = OutOfMemoryError.class)
    public void grabPermGen() {
        CrashMemory crashMemory = new CrashMemory();
        crashMemory.grabPerpGen();
    }

}