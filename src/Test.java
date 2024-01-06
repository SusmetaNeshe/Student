import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        Student student1 = Student.builder()
                            .name("John Doe")
                            .id(1)
                            .dob(LocalDate.of(1999, 2, 15))
                            .department(Department.CSCI)
                            .email("johndoe@gmail.com")
                            .address("1 Main St. Queens, NY")
                            .mobilePhone("718-111-2233")
                            .homePhone("212-444-5566")
                            .build();

        System.out.println("student1.name: " + student1.getName());                                    
        System.out.println("student1.id: " + student1.getId());                                    
        System.out.println("student1.dob: " + student1.getDob());                                    
        System.out.println("student1.department: " + student1.getDepartment().getName());                                    
        System.out.println("student1.email: " + student1.getEmail());                                    
        System.out.println("student1.address: " + student1.getAddress());                                    
        System.out.println("student1.mobilePhone: " + student1.getMobilePhone());                                    
        System.out.println("student1.homePhone: " + student1.getHomePhone());                                    

        student1.print();                          
        System.out.println();
        
        System.out.println("Changing student1's information");
        student1.setName("Alex Short")
                .setId(2)
                .setDob(LocalDate.of(2000, 5, 11))
                .setDepartment(Department.BIO)
                .setEmail("alexshort@hotmail.com")
                .setAddress("5 Kissena Blvd. Queens, NY")
                .setMobilePhone("216-888-9999")
                .setHomePhone("777-888-0000");
        student1.print();                          
        System.out.println();

        Student student2 = Student.builder()                                
                            .name("Janet Doe")
                            .id(3)
                            .dob(LocalDate.of(2000, 5, 25))
                            .department(Department.CHEM)
                            .build();
        System.out.println("student2.name: " + student2.getName());                                    
        System.out.println("student2.id: " + student2.getId());                                    
        System.out.println("student2.dob: " + student2.getDob());                                    
        System.out.println("student2.department: " + student2.getDepartment().getName());                                    

        student2.print();                          
        System.out.println();   
        
        System.out.println("Adding an email, address & mobile phone to student2");
        student2.setEmail("janetdoe@qc.cuny.edu")
                .setAddress("3456 102 st. Queens, NY")
                .setMobilePhone("718-555-44444");

        student2.print();                          
        System.out.println();   
                
        // No object creation due to missing required fields
        Student student3 = Student.builder()
                            .name("Sarit Kumar")
                            .email("saritkumar@gmail.com")
                            .build();
        if (student3 == null)
            System.out.println("OK, you passed the test! student3 is null.");
        else
            System.out.println("Bumber, you failed the test. student3 must have been null!");

        // Trigger exception
        student2.setId(0);            
    } //end-main
} //end-Test