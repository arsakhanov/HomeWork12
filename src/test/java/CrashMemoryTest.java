import static org.junit.Assert.*;

public class CrashMemoryTest {

    //Убедимся, что grabAllMemory действительно выбрасывает исключение
    @org.junit.Test(expected = OutOfMemoryError.class)
    public void testGrabAllMemory() {
        CrashMemory crashMemory = new CrashMemory();
        crashMemory.grabAllMemory();
    }

    //Удостоверимся, что gramPermGen действительно выбрасывает исключение
    @org.junit.Test(expected = OutOfMemoryError.class)
    public void testGrabPermGen() {
        CrashMemory crashMemory = new CrashMemory();
        crashMemory.grabPerpGen();
    }

}