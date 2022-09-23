package model;


import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;


import java.util.HashMap;
import java.util.Map;

@Getter
public class UtilDataParser {

    private Map<String,String> map = new HashMap<>();

    public Map<String, String> getMap(MyData myData) {
        ObjectMapper oMapper = new ObjectMapper();
        return oMapper.convertValue(myData, Map.class);
    }



}
