package workers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class Employee {
    private String name;
    private String surname;
    private String position;
    private int experience;
    private String education;
    private int salaryLevel;
    private int year1, month1, day1;



    // Метод для сравнения двух дат
    public int compareDates(int  year2,int month2,int day2) {

       int date1 = this.year1 * 10000 + this.month1 * 100 + this.day1;
       int date2 = year2 * 10000 + month2 * 100 + day2;

        return Integer.compare(date1, date2);
    }
        @Override
        public String toString() {
            return "Имя: " + name +
                    " Должность: " + position +
                    " Стаж: " + experience + " года(лет)" +
                    " Образование: " + education +
                    " Уровень зарплаты: " + salaryLevel;
    }

}
