import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Класс, который реализует 2 метода краша памяти
 */
public class CrashMemory {

    private final long longNumber = 1000000000L;
    private final double doubleNumber = 1000000000.250;
    private final double doubleNumber1 = 1000000000.250;
    private final double doubleNumber2 = 1000000000.250;
    private final double doubleNumber3 = 1000000000.250;
    private final double doubleNumber4 = 1000000000.250;
    private final double doubleNumber5 = 1000000000.250;
    private final double doubleNumber6 = 1000000000.250;
    private final double doubleNumber7 = 1000000000.250;
    private final List<CrashMemory> listOfNumbers = new ArrayList<CrashMemory>();

    public CrashMemory() {
    }

    /**
     * метод обрушивает программу создавая бесконенчное множество объектов
     * пока памыть не будет заполнена
     */
    public void grabAllMemory() {
        while (true) {
            listOfNumbers.add(new CrashMemory());
        }
    }

    /**
     * метод обрушивает программу заполняя permanent generation
     */
    public void grabPerpGen() {
        int i = 0;
        StringBuilder sb = new StringBuilder("a");
        for (i = 0; i < 20; i++) {
            sb.append(sb.toString());
        }
        System.err.println(sb.length());
        i = 0;
        Set<String> strings = new HashSet<String>();
        while (true) {
            strings.add(sb.append(i++).toString().intern());
            System.err.println(i);
        }
    }
}
