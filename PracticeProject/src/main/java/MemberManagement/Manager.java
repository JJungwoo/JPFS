package MemberManagement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Manager {

    Scanner scanner = new Scanner(System.in);
    ArrayList<MemberDTO> members = new ArrayList<>();

    public void selectMember() {
        Iterator<MemberDTO> it = members.iterator();

        while(it.hasNext()) {
            System.out.println(it.next() + " ");
        }
    }

    public void insertMember() {
        //scanner.nextLine();
        String id = getStrInput("Id: ");
        String pwd = getStrInput("Pwd: ");
        String name = getStrInput("Name: ");
        String phone = getStrInput("Phone: ");

        if(id.equals("")){
            System.out.println("ID를 입력해주세요");
        }else if(pwd.equals("")){
            System.out.println("PWD를 입력해주세요");
        }
        else {
            members.add(new MemberDTO(id, pwd, name, phone));
        }
    }

    private String getStrInput(String msg) {
        System.out.println(msg);
        return scanner.nextLine();
    }
}
