package MemberManagement;

public class Client {

    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.insertMember();
        manager.selectMember();
    }
}
