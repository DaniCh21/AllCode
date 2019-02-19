package UniversityPractice;

public class For {

    public static void main(String[] args) {
        int sum = 0 ;
        int nums [][]= new int [3] [5];
        //присваивать значения элемента фор ич для массива
            for (int i = 0 ; i <3 ;i++ ) {
            for (int j = 0; j < 5; j++) {
                nums[i][j] = (i + 1) * (j + 1);
                //использовать цикл фор в стиле фор ич для вывода
            }
            for (int x[] : nums) {
                for (int y : x) {
                    System.out.println("значение равно " + y);
                    sum += y;
                }
            }
            System.out.println("сумма " + sum);
        }
    }
}




