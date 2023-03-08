import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MorseTest {

    @Test
    void toMorseCode() {
        //given
        Morse code = new Morse();
        //when
        String message = code.toMorseCode("hi how are you");
        //then
       assertEquals("**** ** **** --- *-- *- *-* * -*-- --- **- ", message);
    }

    @Test
    void toEnglish() {
        //given
        Morse code = new Morse();
        //when
        String message = code.morseToEnglish("*- -*** -*-*");
        //then
        assertEquals("abc", message);
    }
}