public class Account {
    private String name;
    private int no;
    private int balance;

    public Account(){}
    public Account(String name, int no){
        this.name = name;
        this.no = no;
    }
    public Account(String name, int no, int balance){
        this.name = name;
        this.no = no;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getNo() {
        return no;
    }
    public void setNo(int no) {
        this.no = no;
    }

    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
}
