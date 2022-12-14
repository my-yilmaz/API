package utils;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

public class JsonUtil {
    private static ObjectMapper mapper;

    static {
        mapper = new ObjectMapper();
    }
    public static <T> T convertJsonToJavaObject(String json, Class<T> cls){
            T JavaResult=null;
        try {
            JavaResult= mapper.readValue(json,cls);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  JavaResult;
    }
    public static String convertJavaObjectToJson(Object obj){
        String JavaResult=null;
        try {
            JavaResult= mapper.writeValueAsString(obj);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return JavaResult;
    }
}
