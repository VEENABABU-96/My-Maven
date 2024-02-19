package excelRead;

import java.io.IOException;

public class Excel_Main {

	public static void main(String[] args) throws IOException {
		String data1 =Excel_code.readIntegerData(0, 0);
		System.out.println(data1);
		String data2 =Excel_code.readStringData(1, 0);
		System.out.println(data2);

	}

}
