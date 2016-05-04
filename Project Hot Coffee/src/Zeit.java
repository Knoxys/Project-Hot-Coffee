import java.sql.Date;
import java.text.SimpleDateFormat;

public class Zeit {

	public void setZeitStempel() {
		long yourmilliseconds = System.currentTimeMillis();
		SimpleDateFormat sdf = new SimpleDateFormat("MMM dd,yyyy HH:mm");
		Date resultdate = new Date(yourmilliseconds);
		System.out.println(sdf.format(resultdate));
	}

}
