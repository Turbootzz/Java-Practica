package practicum2a;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class ZwembadTest {

    @Test
    void test_ZwembadInhoud_VerwachtteInhoud() {
        Zwembad z1 = new Zwembad(2.0, 5.5, 1.5);

        assertEquals(16.5, z1.inhoud(), 0);
    }
}