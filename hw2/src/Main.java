import java.util.*;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Random random = new Random();

    protected static ArrayList<Student> studentList = new ArrayList<>();

    public static void createStudents() {
        for (int i = 0; i < random.nextInt(20) + 5; i++) {
            studentList.add(new Student("Иван " + i, "Иванович " + i, 0, true));
        }
    }

    public static void main(String[] args) {
        createStudents();
        System.out.println("/r - Выбор случайного студента \n/l - Вывод списка студентов \n/end - Завершить программу" );
        System.out.print(">");
        String input = scanner.next();
        while (true) {
            if (Objects.equals(input, "/r")){
                int rndStudent = random.nextInt(studentList.size());
                if (studentList.get(rndStudent).getMark() == 0) {
                    System.out.println("Student " + studentList.get(rndStudent).getSurname() + " is answering:");
                    System.out.println("Студент присутствует? да/нет");
                    String answer = scanner.next();
                    if (answer.equals("да")) {
                        studentList.get(rndStudent).setAbsence(false);
                        System.out.println("Введите оценку: ");
                        int grade = scanner.nextInt();
                        studentList.get(rndStudent).setMark(grade);
                    } else if (answer.equals("нет")) {
                        studentList.get(rndStudent).setAbsence(true);
                        System.out.println("Студент " + studentList.get(rndStudent).getSurname() + " отсутствует!");
                        studentList.get(rndStudent).setMark(0);
                    } else {
                        System.out.println("Некорректный ввод!");
                    }
                } else {
                    System.out.println("Студента " + studentList.get(rndStudent).getSurname() + " уже спрашивали!");
                    System.out.println("Выбор случайного студена: /r.");
                }
            }
            else if (Objects.equals(input, "/l")){
                for (Student student : studentList) {
                    System.out.println(student);
                }
            }
            else if (Objects.equals(input, "end")){
                return;
            }
            else{
                System.out.print("Некорректный ввод!\n");
            }
            System.out.print(">");
            input = scanner.next();
        }
    }
}