import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.okcoinkr.util.dbconnector;

public class JsonPaserforDatabase {

	// private Logger logger = Logger.getLogger(JsonPaserforDatabase.class);

	private static Logger logger = Logger.getLogger(JsonPaserforDatabase.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = dbconnector.dbcon();
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		URL url;
		try {
			url = new URL("https://s3static.okcoinkr.com/json/currency_pair.json");
			BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

			StringBuilder str = new StringBuilder();
			String line;
			while ((line = in.readLine()) != null)
				str.append(line);
			in.close();

			/*** Write ***/
			JSONObject jsonobj = new JSONObject(str.toString());
			JSONArray arr = (JSONArray) jsonobj.get("data");

			ArrayList<HashMap<String, String>> myArrList = new ArrayList<HashMap<String, String>>();

			for (int i = 0; i < arr.length(); i++) {
				JSONObject temp = arr.getJSONObject(i);
				HashMap<String, String> map = new HashMap<String, String>();
				map.put("symbol", temp.optString("symbol"));
				map.put("currency_id", temp.optString("currency_id"));
				map.put("symbol", temp.optString("symbol"));
				map.put("min_trade_size", temp.optString("min_trade_size"));
				map.put("max_price_digit", temp.optString("max_price_digit"));
				map.put("quote_increment", temp.optString("quote_increment"));
				map.put("sort", temp.optString("sort"));
				map.put("name", temp.optString("name"));
				map.put("max_size_digit", temp.optString("max_size_digit"));
				map.put("depth", temp.optString("depth"));
				map.put("connect", temp.optString("connect"));
				myArrList.add(map);
			}

			logger.info(myArrList);

			/*** Write Outout ***/

			for (int a = 0; a < myArrList.size(); a++) {
				String currency_id = myArrList.get(a).get("currency_id");
				String symbol = myArrList.get(a).get("symbol");
				String min_trade_size = myArrList.get(a).get("min_trade_size");
				String max_price_digit = myArrList.get(a).get("max_price_digit");
				String quote_increment = myArrList.get(a).get("quote_increment");
				String sort = myArrList.get(a).get("sort");
				String name = myArrList.get(a).get("name");
				String max_size_digit = myArrList.get(a).get("max_size_digit");
				String depth = myArrList.get(a).get("depth");
				String connect = myArrList.get(a).get("connect");

				String query = " insert into currency_pair (currency_id" + ", symbol, min_trade_size"
						+ ", max_price_digit" + ", quote_increment" + ",sort" + ",name" + ",max_size_digit" + ",depth"
						+ ",connect" + ") values (?, ?, ?, ?, ?, ?, ?, ?, ?,?)"
						+ "ON DUPLICATE KEY UPDATE currency_id = VALUES(currency_id);";

				pstmt = (PreparedStatement) con.prepareStatement(query);

				pstmt.setString(1, currency_id);
				pstmt.setString(2, symbol);
				pstmt.setString(3, min_trade_size);
				pstmt.setString(4, max_price_digit);
				pstmt.setString(5, quote_increment);
				pstmt.setString(6, sort);
				pstmt.setString(7, name);
				pstmt.setString(8, max_size_digit);
				pstmt.setString(9, depth);
				pstmt.setString(10, connect);

				logger.info("================" + a + 1 + "번째 데이터================");

				pstmt.executeUpdate();
				logger.info("currency_id = " + currency_id);
				logger.info("symbol = " + symbol);
				logger.info("min_trade_size = " + min_trade_size);
				logger.info("max_price_digit = " + max_price_digit);
				logger.info("quote_increment = " + quote_increment);
				logger.info("sort = " + sort);
				logger.info("name = " + name);
				logger.info("max_size_digit = " + max_size_digit);
				logger.info("depth = " + depth);
				logger.info("connect = " + connect);

			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (rs != null)
				try {
					pstmt.close();
				} catch (SQLException sqle) {
					sqle.printStackTrace();
				}
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException sqle) {
					sqle.printStackTrace();
				}
			if (con != null)
				try {
					con.close();
				} catch (SQLException sqle) {
					sqle.printStackTrace();
				}
		}

	}
}
