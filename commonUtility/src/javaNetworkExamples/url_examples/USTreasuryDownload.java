package javaNetworkExamples.url_examples;

import java.net.URL;

public class USTreasuryDownload {

	private URL url = null;

	public void downloadFiles() throws Exception{

		new URL("https://www.treasury.gov/resource-center/data-chart-center/"
				+"interest-rates/Pages/TextView.aspx?data=yield");

	}

}
