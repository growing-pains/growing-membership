package com.excel.kgh;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class KghApplicationTests {

	@Test
	void contextLoads() {
		String number = "123456-11111 111";
		number = number.replaceAll("[\\s-,.]", "").substring(0,6);

		System.out.println("number => " + number);



		String a = "1010.00";
		System.out.println(a.split("\\.")[0]);


		String[] arrList = a.split("\\.");
		System.out.println(Long.parseLong(arrList[0]));
		// System.out.println(Long.parseLong(a.split(".")));

		String firstCellValue = "지급/공제항목계산방법";
		firstCellValue = firstCellValue.replaceAll("/", "");
		System.out.println(firstCellValue);
		if("지급/공제항목계산방법".equals(firstCellValue)){
			System.out.print("Aaaa");
		}

		String b = " ";
		System.out.println("b=> " + b.trim());

	}



}
