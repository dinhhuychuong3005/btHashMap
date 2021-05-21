import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ManagerStudent managerStudent = new ManagerStudent();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1: Thêm Học sinh");
            System.out.println("2: Hiển thị danh sách Học sinh");
            System.out.println("3. Tìm kiếm học sinh");
            System.out.println("4: Xóa học sinh theo  id");
            System.out.println("5.Sửa thông tin học sinh");
            System.out.println("6:  Sắp xếp học sinh theo tên");
            System.out.println("7:  Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("nhập key");
                    int id = sc.nextInt();
                    System.out.println("Nhập tuổi");
                    int age = sc.nextInt();
                    System.out.println("Nhập địa chỉ:");
                    String address = sc.next();
//                    managerStudent.gender();
                    String gender1 = managerStudent.gender();
                    System.out.println("Nhập tên");
                    String name = sc.next();
                    managerStudent.add(id, new Student(age, address,gender1 , name));
                    break;
                }
                case 2: {
                    managerStudent.print();
                    break;
                }
                case 3: {
                    System.out.println("Nhập vào ID cần tìm");
                    int id = sc.nextInt();
                    if (managerStudent.check(id)) {
                        System.out.println(managerStudent.seach(id));
                    } else {
                        System.out.println("không có ID này");
                    }
                    break;
                }
                case 4: {
                    System.out.println("Nhập vào ID cần xóa");
                    int id = sc.nextInt();
                    if (managerStudent.check(id)) {
                        managerStudent.delete(id);
                        managerStudent.print();
                    } else {
                        System.out.println("không có ID này");
                    }
                    break;
                }
                case 5: {
                    System.out.println("Nhập vào ID cần sửa");
                    int id = sc.nextInt();
                    if (managerStudent.check(id)) {
                        System.out.println("Nhập tuổi");
                        int age = sc.nextInt();
                        System.out.println("Nhập địa chỉ:");
                        String address = sc.next();
                        String gender1 = managerStudent.gender();
                        System.out.println("Nhập tên");
                        String name = sc.next();
                        managerStudent.edit(id, new Student(age, address, gender1, name));
                        managerStudent.print();

                    }
                    break;
                }
                case 6: {
                    managerStudent.sort();
                    managerStudent.print();
                    break;
                }
                case 7:{
                    System.exit(0);
                    break;
                }
                default:
                    System.out.println("Mời nhập lại");
            }
        }
    }
}

