/**Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из 5
  элементов).Создайте массив из 10 элементов такого типа. Добавьте возможность вывода фамилий и номеров групп студентов,
  имеющие оценки равные только 9 или 10.*/
public class Student {//Создайте класс с именем Student,
    private String lastName;//фамилия и инициалы, номер группы,
    private String initials;
    private int groupNumber;
    private int[] achievement = new int[5];//успеваемость (массив из 5 элементов)

    public Student(String lastName, String initials, int groupNumber, int[] achievement) {
    this.lastName = lastName;
    this.initials = initials;
    this.groupNumber = groupNumber;
    this.achievement = achievement;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int[] getAchievement() {
        return achievement;
    }

    public void setAchievement(int[] achievement) {
        this.achievement = achievement;
    }

    public String toString() {
        return lastName + ", " + groupNumber;
    }

    public static void studentExellent(Student[] students) {
        for (Student student : students) {
            boolean isStudentExellent = true;
            for (int mark : student.getAchievement()) {
                if (mark < 9) {
                    isStudentExellent = false;
                    break;
                }
            }
            if (isStudentExellent == true) {
            System.out.println(student.toString());
            }
        }
    }
}
