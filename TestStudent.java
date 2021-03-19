public class TestStudent
{
   public static void print(Student [] student)
   {
      for(int i = 0; i < student.length; i++){
        if (student[i].getMark() >= 40 && student[i].getMark() <= 49){
          System.out.println(student[i].getMark() + " (" + student[i].getName() + ")");
        }
      }
   }

   public static int numberPasses(Student [] student){
     int count = 0;
     for(int i = 0; i < student.length; i++){
       if (student[i].getMark() >= 40){
         count ++;
       }
     }
     return count;
   }

   public static Student getBestStudent(Student [] student){
     int bestMark = 0;
     int bestStudent = 0;
     for (int i = 0; i < student.length; i++){
       if (student[i].getMark() > bestMark){
         bestMark = student[i].getMark();
         bestStudent = i;
       }
     }

     return student[bestStudent];
   }

   public static double getPassingAverage(Student [] student){
     double passers = 0;
     for(int i = 0; i < student.length; i++){
       if (student[i].getMark() >= 40){
         passers += student[i].getMark();
       }
     }
     int count = 0;
     for(int i = 0; i < student.length; i++){
       if (student[i].getMark() >= 40){
         count ++;
       }
     }
     double avg = passers / count;
     return avg;
   }
}
