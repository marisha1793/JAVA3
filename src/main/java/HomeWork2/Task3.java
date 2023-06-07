/**package HomeWork2;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Task3 {
    public static void main(String[] args) {
        String json = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        parseStringWithSimpleJson(json);
    }
    private static void parseStringWithSimpleJson(String json) throws ParseException {
        Object obj = new JSONParser().parse(json);
        JSONArray array = (JSONArray) obj;
        for (Object o : array) {
            JSONObject jsonObject = (JSONObject) o;
            StringBuilder builder = new StringBuilder("Студент");
            builder.append(jsonObject.get("фамилия"))
                    .append(" получил оценку ")
                    .append(jsonObject.get("оценка"))
                    .append(" по предмету ")
                    .append(jsonObject.get("предмет"));
            System.out.println(builder);

        }
    }
}
 */
