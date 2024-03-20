public class Main {
    public static void main(String[] args) {
        Student[] students = {new Student("Калиновский", "К.Б.", 22, new int[]{9, 8, 8, 6, 7}),
                              new Student("Скорина", "Ф.Р.", 16, new int[]{9, 9, 10, 10, 9}),
                              new Student("Гайдучик", "И.Ю.", 45, new int[]{9, 8, 9, 8, 7}),
                              new Student("Костюшко", "Т.Ю.", 45, new int[]{9, 10, 10, 9, 9}),
                              new Student("Быков", "В.В.", 32, new int[]{9, 8, 8, 10, 7}),
                              new Student("Алексиевич", "С.А.", 48, new int[]{9, 8, 5, 6, 7}),
                              new Student("Тихановская", "С.А.", 78, new int[]{9, 10, 10, 9, 10}),
                              new Student("Сапега", "Л.Ю.", 45, new int[]{9, 8, 7, 10, 7}),
                              new Student("Полоцкая", "Е.Ю.", 22, new int[]{9, 6, 5, 6, 7}),
                              new Student("Шагал", "М.Ю.", 11, new int[]{9, 8, 5, 9, 7})};
        System.out.println(students);
    }
}