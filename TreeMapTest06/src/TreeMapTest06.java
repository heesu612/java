import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

class Member {
   private String no;
   private String name;
   private int age;
   
   public Member(String no, String name, int age) {
      this.no = no;
      this.name = name;
      this.age = age;
   }
   
   public String getNo() {
      return no;
   }
   public String getName() {
      return name;
   }
   public int getAge() {
      return age;
   }
   
   public void setNo(String no) {
      this.no = no;
   }
   public void setName(String name) {
      this.name = name;
   }
   public void setAge(int age) {
      this.age = age;
   }
   
   @Override
   public String toString() {
      return no + ":" + name + "(" + age + ")";
   }
   
   
   
}

/*
문제3) 아래의 조건에 부합하는 TreeMap인 map을 생성하고, 활용하시오.
1. 맵에서 활용할 수 있도록 Member 클래스를 완성하시오.
2. 키는 전화번호, 값을 Member를 저장하는 map을 생성하시오.
3. 맵에 데이터 5개를 추가하고, 확인하시오.
4. 맵에서 키와 값의 중복에 대해서 검증하시오.
5. 지정한 키에 대해서 이름과 나이를 변경하시오.
6. 지정한 키의 데이터를 삭제하시오.
7. 맵의 데이터를 3가지 방법으로 출력하시오.

*/
public class TreeMapTest06 {
   public static void main(String[] args) {
      // 1. 맵 생성, 키: 전화번호, 값: Member
      TreeMap<String, Member> map = new TreeMap<String, Member>();
      
      // 2. 데이터 추가 
      map.put("010-1111-1111", new Member("123456", "이익준", 31));
      map.put("010-2222-2222", new Member("123457", "김준완", 32));      
      map.put("010-3333-3333", new Member("123458", "채송화", 33));
      map.put("010-4444-4444", new Member("123459", "양석형", 34));
      map.put("010-5555-5555", new Member("123460", "안정원", 35));
      
      System.out.println(map);
      // 3. 키 중복 확인 - 허용안됨 -> 덮어쓰기
      map.put("010-4444-4444", new Member("998877", "장겨울", 30));
      System.out.println(map);
      System.out.println("크기: " + map.size());
      
      // 4. 값 중복 확인 - 허용.
      map.put("010-6666-6666", new Member("123457", "김준완", 32));
      System.out.println(map);
      System.out.println("크기: " + map.size());
      
      // 5. 010-1111-1111 사원에 대한 이름과 나이 변경
      /*
      map.get("010-1111-1111").setName("정지웅");
      map.get("010-1111-1111").setAge(33);
      System.out.println(map);
      System.out.println("크기: " + map.size());
      */
      Set<String> keySet = map.keySet();
      Iterator<String> it = keySet.iterator();
      while(it.hasNext()) {
         String tel = it.next();
         if(tel.equals("010-1111-1111")) {
            Member m = map.get(tel);
            m.setName("추민하");
            m.setAge(28);
         }
      }
      System.out.println(map);
      System.out.println("크기: " + map.size());
      
      // 6. 010-3333-3333 사원의 데이터 삭제
      /*
      map.remove("010-3333-3333");
      System.out.println(map);
      System.out.println("크기: " + map.size());
      */
      if(map.remove("010-3333-3333") == null) {
         System.out.println("010-3333-3333" + "의 데이터는 존재하지 않습니다.");
      } else {
         System.out.println("010-3333-3333" + "의 데이터가 삭제되었습니다.");
      }
      System.out.println(map);
      System.out.println("크기: " + map.size());
      
      // 7-1. keySet, Iterator
      it = keySet.iterator();
      while(it.hasNext()) {
         String tel = it.next();
         Member m = map.get(tel);
         System.out.println(tel + " : " + m);
      }
      
      // 7-2. EntrySet, Iterator
      Set<Entry<String, Member>> entrySet = map.entrySet();
      Iterator<Entry<String, Member>> it2 = entrySet.iterator();
      while(it2.hasNext()) {
         Entry<String, Member> e = it2.next();
         String tel = e.getKey();
         Member m = e.getValue();
         System.out.println(tel + " : " + m);
      }
      
      // 7-3. 
      for(Entry<String, Member> e: entrySet) {
    	  String tel = e.getKey();
    	  Member m = e.getValue();
    	  System.out.println(tel + " : " + m);
      }
      System.out.println("------------");
      
   }

}