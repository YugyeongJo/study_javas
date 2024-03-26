package quests;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class problemsWithoutDB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> questionlist = new ArrayList<String>();
        ArrayList<String> optionlist = new ArrayList<String>();
        HashMap<String, String> hashMap = new HashMap<>();

        // question
        questionlist.add("1. 문제 : Python에서 변수를 선언하는 방법은? (점수: 10점)");
        questionlist.add("2. 문제 : Python에서 리스트(List)의 특징은 무엇인가요? (점수: 15점)");
        questionlist.add("3. 문제 : Python에서 조건문을 작성하는 방법은? (점수: 10점)");
        questionlist.add("4. 문제 : Python에서 함수를 정의하는 방법은? (점수: 5점)");
        
        // option
        optionlist.add("1) var name, 2) name = value, 3) set name, 4) name == value");
        optionlist.add("1) 순서가 있고 변경 가능하다, 2) 중복된 값을 가질 수 없다, 3) 원소를 추가하거나 삭제할 수 없다, 4) 정렬된 상태로 유지된다");
        optionlist.add("1) if-else, 2) for-in, 3) while, 4) def");
        optionlist.add("1) class, 2) def, 3) import, 4) return");
        
        // question & option
        hashMap.put(questionlist, optionlist);

        // 문제 출제

        for(String key:hashMap.keySet()) {
            System.out.println(key + hashMap.get(key));
            System.out.print("정답 : ");
            int answer = scanner.nextInt();
         }
    }
}
