import static org.junit.jupiter.api.Assertions.*;

class MorseTest {

    @org.junit.jupiter.api.Test
    void toMorseCode() {
        //given
        Morse code = new Morse();
        //when
        String message = code.toMorseCode("hi how are you");
        //then
       assertEquals("**** ** **** --- *-- *- *-* * -*-- --- **- ", "hi how are you");
    }
}