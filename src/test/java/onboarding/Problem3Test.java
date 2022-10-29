package onboarding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class Problem3Test {
    @Test
    @DisplayName("숫자가 포함하는 특정 문자의 개수를 반환하는지")
    void countTargetNumberInNumberTest() {
        Problem3 problem3 = new Problem3();
        char targetCharacter = '3';

        int numberCase1 = 31;
        int result1 = 1;
        assertThat(problem3.countTargetCharacterInNumber(targetCharacter, numberCase1)).isEqualTo(result1);

        int numberCase2 = 35636833;
        int result2 = 4;
        assertThat(problem3.countTargetCharacterInNumber(targetCharacter, numberCase2)).isEqualTo(result2);

        int numberCase3 = 999987;
        int result3 = 0;
        assertThat(problem3.countTargetCharacterInNumber(targetCharacter, numberCase3)).isEqualTo(result3);
    }

    @Test
    void play369GameTest() {
        Problem3 problem3 = new Problem3();
        int numberCase1 = 33;
        int result1 = 14;
        assertThat(problem3.play369Game(numberCase1)).isEqualTo(result1);
    }
}