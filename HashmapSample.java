import java.util.Hashtable;

public class HashmapSample{
    public static void main(String[] args){
      System.out.println("Hello World!!");

      Hashtable<Integer,String> members = new Hashtable<Integer,String>();

      members.put(1, "Kazuya");
      members.put(2, "Haru");
      members.put(3, "Hogehoge");

      String member = members.get(1);
      System.out.println(member);

      // containsKey containsValue でチェック
      System.out.println(members.containsKey(1));
      System.out.println(members.containsValue("Kazuya"));

      members.remove(1);

      for (Integer key : members.keySet()) {
          System.out.println(members.get(key));
      }

    }
 }