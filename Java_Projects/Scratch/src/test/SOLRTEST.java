package test;

import java.net.HttpURLConnection;
import java.net.URL;

public class SOLRTEST {
	public static void main(String[] args){
		String wholeUrl = "http://96.127.49.17:8764/api/apollo/query-pipelines/p3-search-pipeline/collections/p3coll/select?q=\\*\\:\\*&wt=json&rows=0&fq=DATE\:\[2013\-05\-06T18\:10\:14.000Z\ TO\ 2016\-05\-07T18\:25\:14.000Z\]&facet=true&facet.field=MANUFACTURER_NAME&facet.limit=5&facet.missing=true";
		URL obj = new URL(wholeUrl);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

	}
}
