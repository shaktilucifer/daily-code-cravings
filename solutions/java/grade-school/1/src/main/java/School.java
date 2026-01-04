import java.util.*;

class School {

   
    Map<Integer, TreeSet<String>> schoolMap =  new TreeMap<>();
    Set<String> rosterSet = new HashSet<>();
    boolean add(String student, int grade) {
        if (schoolMap.get(grade) == null) {
            schoolMap.put(grade, new TreeSet<>());
        }
        if (rosterSet.contains(student)) {
            return false;
        }
        schoolMap.get(grade).add(student);
        rosterSet.add(student);
        return true;
    }

    List<String> roster() {
        List<String> roster = new LinkedList<>();
        for(Map.Entry<Integer, TreeSet<String>> entry: schoolMap.entrySet()) {
            roster.addAll(entry.getValue());
        }
        return roster;
    }

    List<String> grade(int grade) {
        if(!schoolMap.containsKey(grade)) return Collections.emptyList();
        return schoolMap.get(grade).stream().toList();
    }

}
