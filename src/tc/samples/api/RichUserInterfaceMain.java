package tc.samples.api;
import totalcross.TotalCrossApplication;

public class RichUserInterfaceMain {
	public static void main(String[] args) {
		TotalCrossApplication.run(RichUserInterfaceSample.class, "/scr",
				"android", "/scale", "1", "/fontsize", "20", "/fingertouch");
	}
}
