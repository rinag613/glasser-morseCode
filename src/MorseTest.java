import static org.junit.jupiter.api.Assertions.*;

class MorseTest {

    @org.junit.jupiter.api.Test
    void toMorseCode() {
        //given
        Morse code = new Morse("hi how are you");
        //when
        String message = code.toMorseCode();
        //then
       assertEquals("**** ** **** --- *-- *- *-* * -*-- --- **- ", message);
    }
}