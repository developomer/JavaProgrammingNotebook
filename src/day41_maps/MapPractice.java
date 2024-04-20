package day41_maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {

        Map<String, Object> person = new LinkedHashMap<>();
        person.put("name", "Arthur");
        person.put("gender", 'M');
        person.put("age", 32);
        person.put("job_title", "Developer");
        person.put("salary", 10000.5);
        person.put("married", true);

        System.out.println(person);

        System.out.println(person.get("name"));
        System.out.println(person.get("salary"));
        System.out.println(person.get("job_title"));

    }


}
