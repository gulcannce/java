package day21_varargs_stringBuilder;

import java.time.LocalDate;
import java.time.Period;

public class C01_TimePeriod {
    public static void main(String[] args) {


        LocalDate dogumTarihi = LocalDate.of(1992,12,29);
        LocalDate bugun = LocalDate.now();

        Period yasım =Period.between(dogumTarihi,bugun);

        System.out.println(yasım); //P31Y9M19D

        System.out.println(yasım.getYears());//31
    }
}
