package class44_fluentWait;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CaptureDate2 {

	public static void main(String[] args) {

		System.out.println(new SimpleDateFormat("HH_mm_ss_dd_MM_yyyy").format(new Date()));

	}

}
