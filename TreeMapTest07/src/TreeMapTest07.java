import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;



class Member implements Comparable<Member>{
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
   
   
   // no기준 오름차순
   /*
   @Override
   public int compareTo(Member m) {
      if(this.no.compareTo(m.no) > 0) {
         return 1;
      } else if(this.no.compareTo(m.no) < 0) {
         return -1;
      } else {
         return 0;
      }
   }
   */
   
   // name기준 오름차순
   @Override
   public int compareTo(Member m) {
      if(this.name.compareTo(m.name) > 0) {
         return 1;
      } else if(this.name.compareTo(m.name) < 0) {
         return -1;
      } else {
         return 0;
      }
   }
   
   
   // hashCode(), equals() 메소드 오버라이딩 - key 중복 확인을 위함
   @Override
   public int hashCode() {
      return (no+name+age).hashCode();
   }
   
   @Override
   public boolean equals(Object obj) {
      if(obj instanceof Member) {
         Member m = (Member)obj;
         return this.no.equals(m.no) && this.name.equals(m.name) && this.age == m.age; 
      }
      return false;
   }
   
}

/*   
문제4) 아래의 조건에 부합하는 TreeMap인  map을 생성하고, 활용하시오.
1. 키를 Member, 값을 전화번호로 하는 map을 생성하시오.
2. 맵에 데이터를 5개 추가하시오.
3. 키와 값에 대한 중복을 검증하시오.
4. 123456 회원의 이름을 이장현으로 수정하시오.
5. 123457 회원의 나이를 45로 수정하시오.
6. 채송화 회원의 전화번호를 010-1004-1004로 수정하시오.
7. 123460 회원의 정보를 삭제하시오.
8. 전화번호가 010-4444-4444인 회원의 정보를 삭제하시오.
9. 3가지 방법으로 출력하시오.

*/
public class TreeMapTest07_hq {
   public static void main(String[] args) {
//      TreeMap<Member, String> map = new TreeMap<Member, String>();
//      
//      // 2. 데이터 추가 
//      // 에러 발생: Exception in thread "main" java.lang.ClassCastException: Member cannot be cast to java.lang.Comparable
//      map.put(new Member("123456", "이익준", 35), "010-1111-1111");
//      map.put(new Member("123457", "김준완", 36), "010-2222-2222");
//      map.put(new Member("123458", "채송화", 37), "010-3333-3333");
//      map.put(new Member("123459", "양석형", 38), "010-4444-4444");
//      map.put(new Member("123460", "안정원", 39), "010-5555-5555");
//      System.out.println(map);
//      System.out.println("크기: " + map.size());
//      
//      // 3-1. 키 중복 확인 -> hashCode(), equals() 를 Override 해도 key가 중복이 된다?
//      // 어떻게 해야할까?
//      map.put(new Member("123460", "안정원", 39), "010-6666-6666");
//      System.out.println(map);
//      System.out.println("크기: " + map.size());
//      
//      /*
//      // 모든값이 완전히 동일해도 중복으로 추가가 된다. hashCode로 값을 비교하는게 잘못된건가?
//      map.put(new Member("123460", "안정원", 39), "010-5555-5555");
//      System.out.println(map);
//      System.out.println("크기: " + map.size());
//      */
//      
//      
//      // 3-2. 값 중복 확인
//      map.put(new Member("112233", "장겨울", 32), "010-2222-2222");
//      System.out.println(map);
//      System.out.println("크기: " + map.size());
//      System.out.println("--------");
//      // 4. 123456 회원의 이름을 이장현으로 수정
//      Set<Member> keySet = map.keySet();
//      Iterator<Member> it = keySet.iterator();
//      while(it.hasNext()) {
//         Member m = it.next();
//         if(m.getNo().equals("123456")) {
//            m.setName("이장현");            
//         }
//      }
//      System.out.println(map);
//      System.out.println("크기: " + map.size());
//      
//      // 5. 123457 회원의 나이를 45로 수정
//      it = keySet.iterator();
//      while(it.hasNext()) {
//         Member m = it.next();
//         if(m.getNo().equals("123457")) {
//            m.setAge(45);
//         }
//      }
//      System.out.println(map);
//      System.out.println("크기: " + map.size());
//      
//      // 6. 채송화 회원의 전화번호를 010-1004-1004로 수정
//      /*
//      it = keySet.iterator();
//      while(it.hasNext()) {
//         Member m = it.next();
//         String tel = map.get(m);
//         if(m.getName().equals("채송화")) {
//            map.get(m).replace("010-3333-3333", "010-1004-1004");
//            
//         }
//      }
//      System.out.println(map);
//      System.out.println("크기: " + map.size());
//      */
//      
//      // 7. 123460 회원의 정보를 삭제
////      if(map.remove("123460") != null) {
////         System.out.println("123460" + "의 데이터는 삭제되었습니다.");
////      } else {
////         System.out.println("123460" + "의 데이터는 존재하지 않습니다.");
////      }
////      System.out.println(map);
////      System.out.println("크기: " + map.size());
//      // 8. 전화번호가 010-4444-4444인 회원의 정보를 삭제
//      
//      // 9-1. 출력 1. keySet, Iterator
//      it = keySet.iterator();
//      while(it.hasNext()) {
//         Member m = it.next();
//         String tel = map.get(m);
//         System.out.println("정보: " + m + ", 전화번호: " + tel);
//      }
//      System.out.println("---------");
//      // 9-2. 출력 2. EntrySet, Iterator
//      Set<Entry<Member, String>> entrySet = map.entrySet();
//      Iterator<Entry<Member, String>> it2 = entrySet.iterator();
//      while(it2.hasNext()) {
//         Entry<Member, String> e = it2.next();
//         Member m = e.getKey();
//         String tel = e.getValue();
//         System.out.println("정보: " + m + ", 전화번호: " + tel);
//      }
//      System.out.println("---------");
//      // 9-3. 출력 3. EntrySet, 확장 for문
//      for(Entry<Member, String> e : entrySet) {
//         Member m = e.getKey();
//         String tel = e.getValue();
//         System.out.println("정보: " + m + ", 전화번호: " + tel);
//      }
//      System.out.println("---------");
//      
//      
      
      // 맵 생성, 키: Member, 값: String
      TreeMap<Member, String> map = new TreeMap<Member, String>();
      
      // 데이터 추가
      
      map.put(new Member("123460", "안정원", 39), "010-5555-5555");
      map.put(new Member("123458", "채송화", 37), "010-3333-3333");
      map.put(new Member("123459", "양석형", 38), "010-4444-4444");
      map.put(new Member("123456", "이익준", 35), "010-1111-1111");
      map.put(new Member("123457", "김준완", 36), "010-2222-2222");
      System.out.println(map);
      System.out.println("크기: " + map.size());
      
      // 3. 중복 키 확인 - 허영 불가, 나중에 넣은 값으로 덮어 씀.
      map.put(new Member("123458", "채송화", 37), "010-6666-6666");
      System.out.println(map);
      System.out.println("크기: " + map.size());
      
      // 4. 중복 값 확인 - 허용함
      map.put(new Member("998877", "도재학", 25), "010-1111-1111");
      System.out.println(map);
      System.out.println("크기: " + map.size());
      
      // 5. 123456 회원의 이림을 이장현으로 수정
      Set<Member> keySet = map.keySet();
      Iterator<Member> it = keySet.iterator();
      while(it.hasNext()) {
         Member m = it.next();
         if(m.getNo().equals("123456")) {
            m.setName("이장현");
         }
      }
      System.out.println(map);
      System.out.println("크기: " + map.size());
      
      // 6. 123457 회원의 나이를 45로 수정
      it = keySet.iterator();
      while(it.hasNext()) {
         Member m = it.next();
         if(m.getNo().equals("123457")) {
            m.setAge(45);
         }
      }
      System.out.println(map);
      System.out.println("크기: " + map.size());
      
      // 7. 채송화 회원의 전화번호를 010-1004-1004로 수정
      it = keySet.iterator();
      while(it.hasNext()) {
         Member m = it.next();
         if(m.getName().equals("채송화")) {
            map.put(m, "010-1004-1004");
         }
      }
      System.out.println(map);
      System.out.println("크기: " + map.size());
      
      
      // 8. 123460 회원의 정보를 삭제
      // 에러 : Exception in thread "main" java.util.ConcurrentModificationException
      // 검색과 동시에 삭제 불가
      /*
      it = keySet.iterator();
      while(it.hasNext()) {
         Member m = it.next();
         if(m.getNo().equals("123460")) {
            map.remove(m);
         }
      }
      */
      /*
      // 성공1 - map 자체에서 삭제
      Member dm = null;
      it = keySet.iterator();
      while(it.hasNext()) {
         Member m = it.next();
         if(m.getNo().equals("123460")) {
            dm = m;
            
         }
      }   
      map.remove(dm);
      System.out.println(map);
      System.out.println("크기: " + map.size());
      */
      
      // 성공2 - Iterator 통해 삭제
      it = keySet.iterator();
      while(it.hasNext()) {
    	  Member m = it.next();
    	  if(m.getNo().equals("123460")) {
    		  it.remove();
    	  }
      }
      System.out.println(map);
      System.out.println("크기: " + map.size());
      
      // 9. 전화번호가 010-4444-4444인 회원의 정보를 삭제
      /*
      // 성공1
      Member dm2 = null;
      it = keySet.iterator();
      while(it.hasNext()) {
         Member m = it.next();
         String tel = map.get(m);
         if(tel.equals("010-4444-4444")) {
            dm2 = m;
         }
      }
      map.remove(dm2);
      */
      
      // 성공2
      it = keySet.iterator();
      while(it.hasNext()) {
    	  Member m = it.next();
    	  String tel = map.get(m);
    	  if(tel.equals("010-4444-4444")) {
    		  it.remove();
    	  }
      }
      System.out.println(map);
      System.out.println("크기: " + map.size());
      
      // 10-1. 출력1
      it = keySet.iterator();
      while(it.hasNext()) {
         Member m = it.next();
         String tel = map.get(m);
         System.out.println("회원정보: " + m + ", 전화번호: " + tel);
         
      }
      System.out.println("-------");
      
      // 10-2. 출력2
      Set<Entry<Member, String>> entrySet = map.entrySet();
      Iterator<Entry<Member, String>> it2 = entrySet.iterator();
      while(it2.hasNext()) {
         Entry<Member, String> e = it2.next();
         Member m = e.getKey();
         String tel = e.getValue();
         System.out.println("회원정보: " + m + ", 전화번호: " + tel);
      }
      System.out.println("---------");
      
      // 10-3. 출력3
      for(Entry<Member, String> e : entrySet) {
         Member m = e.getKey();
         String tel = e.getValue();
         System.out.println("회원정보: " + m + ", 전화번호: " + tel);
      }
      System.out.println("---------");
      
      
      
   }

}
