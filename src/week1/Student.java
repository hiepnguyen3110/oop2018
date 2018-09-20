package week1;

public class Student {

    // TODO: khai báo các thuộc tính cho Student
    String name;
    String Id;
    String group;
    String email;
    // TODO: khai báo các phương thức getter, setter cho Student
    public String getName(){
        return name;
    }
    public String setName(String name){
        this.name = name;
    }
    public String getId(){
        return Id;
    }
    public String setId( String Id ){
        this.Id = Id;
    }
    public String getGroup(){
        return group;
    }
    public String setGroup(String group){
        this.group = group;
    }
    public String getEmail(){
        return email;
    }
    public String setEmail( String email ){
        this.email = email;
    }
    
    /**
     * Constructor 1
     */
    Student() {
        // TODO:
    }

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    Student(String n, String sid, String em) {
        // TODO:
    }

    /**
     * Constructor 3
     * @param s
     */
    Student(Student s) {
        // TODO:
    }

    String getInfo() {
        // TODO:
        System.out.println("Name: " + this.name);
        System.out.println("Id: " + this.Id);
        System.out.println("Group: " + this.group);
        System.out.println("Email: " + this.email);
        return null; // xóa dòng này sau khi cài đặt
    }
}
