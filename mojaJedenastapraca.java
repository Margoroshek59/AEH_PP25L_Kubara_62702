package pp.pl;
import java.util.*;

public class mojaJedenastapraca {
   public static void main(String[] args) {
     List<Students> students = Arrays.asList(
      new Students("12345", "Jan" , "Kowalski", Arrays.asList(3,2,3,5)),
      new Students("73510", "Ana", "Nowak", Arrays.asList(5, 4, 5, 4)),
      new Students("83580" , "Pawel", "Wisniewski", Arrays.asList(2, 2, 3, 4)),
      new Students("47659", "Katarzyna", "Kowalczyk", Arrays.asList(5, 4, 4, 5))
    );

     Students najlepszy = students.stream()
             .max(Comparator.comparingDouble(pp.pl.Students::getSrednia))
             .orElse(null);

     if (najlepszy != null) {
         System.out.printf("Student z najwyzszą srednią: %s - Average: %.2f\n", najlepszy.toString(), najlepszy.getSrednia());
     }

     System.out.println("\nStudenci posortowani wedlug srednich ocen: ");
     students.stream()
             .sorted(Comparator.comparingDouble(Students::getSrednia).reversed())
             .forEach(s-> System.out.printf("%s: %.2f\n", s.toString(), s.toString(), s.getSrednia()));

   }
 }
