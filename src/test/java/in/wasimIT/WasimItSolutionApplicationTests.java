package in.wasimIT;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WasimItSolutionApplicationTests {
	private Calculator c = new Calculator();
	@Test
	void contextLoads() {
	}
	@Test
	void doSum() {
		int expectedResult = 30;
		//actual result 
		int result = c.doSum(10,10,10);
		
		assertThat(result).isEqualTo(expectedResult);
	}
}
