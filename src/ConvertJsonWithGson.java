import beans.MemberBean;
import com.google.gson.Gson;
import java.util.Map;

public class ConvertJsonWithGson {

  public static void main(String[] args) {
    // 문자열 Json -> Map
    Gson gson = new Gson();
    String jsonStr = "{id:1, name:sol}";
    Map jsonMap = gson.fromJson(jsonStr, Map.class);

    // Map -> 문자열
    String mapStr = gson.toJson(jsonMap);

    // 문자열 -> Object(bean or model or vo)
    String jsonStrBean = "{firstName:eun, secondName:sol, handleName:lee}";
    MemberBean memberBean = gson.fromJson(jsonStrBean, MemberBean.class);
    int i = 0;
  }
}
