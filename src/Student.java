import java.time.LocalDate;
public class Student {

   
   // attributes
   private String name, email, address, mobilePhone, homePhone;
   private int id;
   private LocalDate dob;
   private Department dept;
   
   // constructor
   private Student() {
      id=0;
      name=null;
      dept= Department.NONE;
   }
   
   // getters for attributes 
   public String getName() { return name; }
   //TODO the rest getters
   public String getEmail() { return email; }
   public String getAddress() { return address; }
   public String getMobilePhone() { return mobilePhone; }
   public String getHomePhone() { return homePhone; }
   public int getId() { return id; }
   public LocalDate getDob() { return dob; }
   public Department getDepartment() { return dept; }
   
   // setters
   public Student setName(String name) {
      
      this.name = name;
      return this;
   }
   // TODO the rest of the setters same format
   public Student setEmail(String email) {
      this.email = email;
      return this;
   }
   public Student setAddress(String address) {
      this.address = address;
      return this;
   }
   public Student setMobilePhone(String mobilePhone) {
      this.mobilePhone = mobilePhone;
      return this;
   }
   public Student setHomePhone(String homePhone) {
      this.homePhone = homePhone;
      return this;
   }  
   public Student setId(int id) {
      this.id = id;
      return this;
   }
   public Student setDob(LocalDate dob) {
      this.dob = dob;
      return this;
   }
   public Student setDepartment(Department dept) {
      this.dept = dept;
      return this;
   }
   // Print mathod - TODO
   public void print() {
      System.out.println("+------------------------------+-----------------------------+");
      System.out.printf("| %-28s | %-27s |%n", "Name", name);
      System.out.printf("| %-28s | %-27s |%n", "ID", id);
      System.out.printf("| %-28s | %-27s |%n", "DOB", dob);
      System.out.printf("| %-28s | %-27s |%n", "Email", email);
      System.out.printf("| %-28s | %-27s |%n", "Address", address);
      System.out.printf("| %-28s | %-27s |%n", "Mobile Phone", mobilePhone);
      System.out.printf("| %-28s | %-27s |%n", "Home Phone", homePhone);
      System.out.printf("| %-28s | %-27s |%n", "Department", dept.getName());
      System.out.println("+------------------------------+-----------------------------+");
  }
   
   
   public static Student.Builder builder () {
      return new Student.Builder();
   }
   public static class Builder{
      private Student student = new Student();
   
    public Student.Builder name (String name){
      if (name == null || name.length()< 2)
         throw new IllegalArgumentException("name invalid");
      student.setName(name);
      return this;
   }
   
   public Student.Builder id(int id){
      if (id<1)
         throw new IllegalArgumentException("ID invalid"); 
      student.setId(id);
      return this;

   }
   // all other builder method except buil TODO
   public Student.Builder email(String email) {
      student.email = email;
      return this;
  }

  public Student.Builder address(String address) {
      student.address = address;
      return this;
  }
  public Student.Builder mobilePhone(String mobilePhone) {
     student.mobilePhone = mobilePhone;
     return this;
 }

 public Student.Builder homePhone(String homePhone) {
     student.homePhone = homePhone;
     return this;
 }
 public Student.Builder dob(LocalDate dob) {
    student.dob = dob;
    return this;
}

public Student.Builder department(Department dept) {
    student.dept = dept;
    return this;
} 
   public Student build() {
      if (student.getName() == null || student.getId() < 1 || student.getDepartment() == null) 
         return null;
      return student;
      
   }
}
}