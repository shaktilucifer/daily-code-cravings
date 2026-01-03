import java.util.*;

public class DialingCodes {
    Map<Integer, String> dialingCodeMap = new HashMap<>();
    public Map<Integer, String> getCodes() {
        return dialingCodeMap;
    }

    public void setDialingCode(Integer code, String country) {
        dialingCodeMap.put(code, country);
    }

    public String getCountry(Integer code) {
        return dialingCodeMap.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if(getCountry(code) != null) return;
        for(String cc: dialingCodeMap.values()) {
            if(cc.equals(country)) {
                return;
            }
        }
        setDialingCode(code, country);
    }

    public Integer findDialingCode(String country) {
        for(Map.Entry<Integer, String> entry: dialingCodeMap.entrySet()) {
            if(entry.getValue().equals(country)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public void updateCountryDialingCode(Integer code, String country) {
        for(Map.Entry<Integer, String> entry: dialingCodeMap.entrySet()) {
            if(entry.getValue().equals(country)) {
                dialingCodeMap.remove(entry.getKey());
            }
        }
        addNewDialingCode(code, country);
    }
}
