import java.util.*;

public class ManagerStudent {
    private Map<Integer, Student> map = new HashMap<>();

    void add(int id, Student student) {
        map.put(id, student);
    }

    void print() {
//        for (Map.Entry<Integer, Student> studentEntry : map.entrySet()) {
//            System.out.println(studentEntry);
//        {
        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            System.out.println(key + " :" + map.get(key));
        }
        System.out.println("------------------");
    }


    public boolean check(int id) {
        if (map.containsKey(id)) {
            return true;
        }
        return false;
    }

    public Student seach(int id) {
        return map.get(id);
    }
    public void searchName(String name){
        Set<Integer> key = map.keySet();
        for (Integer key1 : key){
            if (name.equals(map.get(key1).getName())){
                System.out.println(map.get(key1));
                break;
            }else {
                System.out.println("không có tên này");
                break;
            }
        }
    }

    public void delete(int id) {
        map.remove(id);
    }

    public Student edit(int id, Student student) {
        return map.put(id, student);
    }

    public void sort() {
        List<Map.Entry<Integer, Student>> list = new LinkedList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Student>>() {
            @Override
            public int compare(Map.Entry<Integer, Student> o1, Map.Entry<Integer, Student> o2) {
                return o1.getValue().getAge() - o2.getValue().getAge();
            }
        });
        Map<Integer, Student> map1 = new LinkedHashMap<>();
        for (Map.Entry<Integer, Student> entry : list) {
            map1.put(entry.getKey(), entry.getValue());
        }
        this.map = map1;
    }

    String gender() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập giới tính");
            String gender = sc.nextLine();
            switch (gender) {
                case "1": {
                    return "Nam";
                }
                case "2": {
                    return "Nữ";
                }
            }
        }
    }
}
