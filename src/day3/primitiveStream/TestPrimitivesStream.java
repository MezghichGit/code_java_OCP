package day3.primitiveStream;

import java.util.stream.IntStream;

public class TestPrimitivesStream {

	public static void main(String[] args) {
		IntStream numbers = IntStream.of(10,2,4);
		System.out.println(numbers.sum());
		System.out.println(Long.MAX_VALUE);
		float x = 12.5F;
		         //9223372036854775807
		long y = 123456789122L;

	}

}
