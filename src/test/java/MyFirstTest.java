import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MyFirstTest {

    // tests are void bec they don't return anything, and they are package protected

    @Test
    void hello(){

        // given
        int numberOne =4;
        int numberTwo =4;
        // when
        int result = numberOne + numberTwo;
        // then assertion
        assertThat(result).isEqualTo(8);

    }

    @Test
    void hello1(){

    }

}
