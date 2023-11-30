package DOM_1;

public class D1 {
    class Answer {
        public int countNTriangle(int n){
          // Введите свое решение ниже
          if (n < 0){
            return n = 0;
          }
          else{
            return (n * (n + 1)) / 2;
          }
        }
    }
    
    // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
    public class Printer{ 
        public static void main(String[] args) { 
          int n = 0;
          
          if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            n = 4;
          }
          else{
            n = Integer.parseInt(args[0]);
          }     
          
            // Вывод результата на экран
          Answer ans = new Answer(); 
          int itresume_res = ans.countNTriangle(n);     
          System.out.println(itresume_res);
        }
    }
}



// ЭТАНОЛ
/**
class Answer {
    public int countNTriangle(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        return sum;
    }
}

public class Printer{ 
    public static void main(String[] args) { 
      int n = 0;

      if (args.length == 0) {
        n = 4;
      }
      else{
        n = Integer.parseInt(args[0]);
      }     

      Answer ans = new Answer(); 
      int itresume_res = ans.countNTriangle(n);     
      System.out.println(itresume_res);
    }
}
*/