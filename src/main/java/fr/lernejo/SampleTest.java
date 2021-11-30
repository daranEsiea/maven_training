package fr.lernejo;
import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

class SampleTest {

    @Test
    void operation_add() {
        Sample sample = new Sample();
        Assertions.assertThat(sample.op(Sample.Operation.ADD, 1, 1)).as("1+1").isEqualTo(2);
    }

    @Test
    void operation_mult() {
        Sample sample = new Sample();
        Assertions.assertThat(sample.op(Sample.Operation.MULT, 2, 2)).as("2*2").isEqualTo(4);
    }

    @Test
    void fact_with_positive_number(){
        int n = 5;
        Sample sample = new Sample();
        Assertions.assertThat(sample.fact(n)).as("!5").isEqualTo(120);
    }

    @Test
    void fact_with_exception(){
        int n = -5;
        Sample sample = new Sample();
        Assertions.assertThatIllegalArgumentException().isThrownBy(() -> sample.fact(n));
    }
 
}
