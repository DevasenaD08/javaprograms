package Sample_1;

public class Browser {

	public static void main(String[] args) {

		Browser obj = new Browser();
		obj.launchBrowser();
		obj.loadUrl();
	}

	public void launchBrowser() {
		System.out.println("Browser Launched successfully");
	}

	public void loadUrl() {
		System.out.println("Application url loaded successfully");
	}
}
