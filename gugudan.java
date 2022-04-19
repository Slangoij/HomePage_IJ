import java.util.*;

public class gugudan {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = {};
        
        List<String> lst = Arrays.asList(report);
        Set<String> set = new HashSet<String>(lst);
        List<String> newList = new ArrayList<String>(set);
        HashMap<String, List<String>> map = new HashMap<>();
        for (String str: report) {
        	String[] splitstr = str.split(" ");
        	if (map.get(splitstr[1]) != null) {
        		List<String> tmplst = Arrays.asList(splitstr[0]);
        		map.put(splitstr[1], tmplst);
        	}
        	else {
        		List<String> tmplst = map.getOrDefault(splitstr[1], Arrays.asList(splitstr[0])).add(splitstr[0]);
        		map.put(splitstr[1], );
        	}
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
    	
    }
}