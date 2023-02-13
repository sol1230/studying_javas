import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class ApiExploresWithDatagokr {

  public static void main(String[] args) throws UnsupportedEncodingException {
    /* 
      외교부 국가/지역별 최신 안전소식(코로나 관련) - 중국
     https://apis.data.go.kr/1262000/CountryCovid19SafetyServiceNew/getCountrySafetyNewsListNew
     ?serviceKey=W%2FZMz%2Bz83t0ninZbUUGxbDsiREoFZ9vNDVbo1MlPN%2FPsohMdpPpDirY9vcEXARRfsvZq8oPnmT%2FxPYo5swfcRg%3D%3D
     &returnType=JSON
     &numOfRows=10
     &pageNo=1
     &cond[country_nm::EQ]=중국
      */

    StringBuilder urlBuilder = new StringBuilder(
      "http://apis.data.go.kr/1262000/CountryCovid19SafetyServiceNew/getCountrySafetyNewsListNew"
    );/*URL*/
    // 2. 오픈 API의요청 규격에 맞는 파라미터 생성, 발급받은 인증키.
    urlBuilder
      .append("?" + URLEncoder.encode("ServiceKey", "UTF-8") + "=")
      .append(
        "W%2FZMz%2Bz83t0ninZbUUGxbDsiREoFZ9vNDVbo1MlPN%2FPsohMdpPpDirY9vcEXARRfsvZq8oPnmT%2FxPYo5swfcRg%3D%3D"
      );
    urlBuilder.append(
      "&" +
      URLEncoder.encode("returnType", "UTF-8") +
      "=" +
      URLEncoder.encode("JSON", "UTF-8")
    );/*XML 또는 JSON*/
    urlBuilder.append(
      "&" +
      URLEncoder.encode("numOfRows", "UTF-8") +
      "=" +
      URLEncoder.encode("10", "UTF-8")
    );/*한 페이지 결과 수*/
    urlBuilder.append(
      "&" +
      URLEncoder.encode("pageNo", "UTF-8") +
      "=" +
      URLEncoder.encode("1", "UTF-8")
    );/*페이지 번호*/
    urlBuilder.append(
      "&" +
      URLEncoder.encode("cond[country_nm::EQ]", "UTF-8") +
      "=" +
      URLEncoder.encode("중국", "UTF-8")
    );/*ISO 2자리코드*/

    URL url;
    HttpURLConnection connection = null;
    try {
      url = new URL(urlBuilder.toString());
      connection = (HttpURLConnection) url.openConnection();
      connection.setRequestMethod("GET");
      // connection.setRequestProperty(null, null);
      System.out.println("Response code : " + connection.getResponseCode());

      BufferedReader reader;
      if (
        connection.getResponseCode() >= 200 &&
        connection.getResponseCode() <= 300
      ) { // 정상
        reader =
          new BufferedReader(
            new InputStreamReader(connection.getInputStream())
          );
      } else { // 비정상
        reader =
          new BufferedReader(
            new InputStreamReader(connection.getErrorStream())
          );
      }

      StringBuffer stringBuffer = new StringBuffer();
      String line = "";
      while ((line = reader.readLine()) != null) {
        stringBuffer.append(line);
      }
      int i = 1;
      reader.close();
    } catch (MalformedURLException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      connection.disconnect();
    }
  }
}
