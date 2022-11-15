public class Student {
    private final String name;
    private final String surname;
    private int mark;
    private boolean isAbsent;

    public Student(String name, String surname, int mark, boolean isAbsent) {
        this.name = name;
        this.surname = surname;
        this.mark = mark;
        this.isAbsent = isAbsent;
    }
    public int getMark() {
        return mark;
    }
    public void setMark(int mark){
        this.mark = mark;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public void setAbsence(boolean status){
        isAbsent = status;
    }
    public String getAbsence(){
        if (isAbsent){
            return " отсутствует.";
        }
        return " присутствует.";
    }
    @Override
    public String toString(){
        return "Студент " + name + " " +  surname + " с оценкой " + mark + getAbsence();
    }
}
