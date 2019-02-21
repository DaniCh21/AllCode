package UniversityPractice;

public class FindMinMax {
    public static void main(String[] args) {
        int array[]= new int[50];                                       //creating array with 50 elements
        int min = 100;
        int max = 0;

        for (int i = 0; i<array.length; i++){                           //initializing array with random elements
            array[i] = (int)(Math.random()*101);
        }
        for(int i = 0; i<array.length; i++){                            //searching for min && max values
            if(array[i]<min){
                min=array[i];
            }
            if(array[i]>max){
                max=array[i];
            }
        }
        System.out.print("Source array: ");                             //output of source array
        for(int i: array){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("MIN = " + min);
        System.out.println("MAX = " + max);
        for(int i: array){                                              //output of array with highlighted min && max
            if(i!=min && i!=max) System.out.print(i + " ");
            else System.out.print("{" + i + "} ");                      //captures min && max values into braces
        }
    }
}