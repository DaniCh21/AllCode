package UniversityPractice;

public class PACD {

    public static void main(String[] args) {
        Controller a = new Controller();
        a.add(12,8);
        a.add(14,7);
        a.add(2,4);
        a.add(5,5);
        a.add(1,9);
        a.add(0,7);
        a.display();
        System.out.println("//////////////////////////");
        a.del(15);
        a.del(2);
        a.display();
        a.swipe(5,0);
        }
}

class Controller{
    int n = 100;
    int[] a = new int[n];
    int summ = 0;
    int[] addedIndexs = new int[n];
    int s = 0;

    void add(int index, int number){
        a[index] = number;
        summ++;
        System.out.println("Element with index[" + index + "] has a number: " + number);
        addedIndexs[s] = index;
        s++;
        System.out.println("S = " + s);
    }

    void del(int index){
        int ind = 0;
        while(addedIndexs[ind] != index && ind < s){
            ind++;
        }
        if(ind != s){
            a[index] = 0;
            summ--;
            System.out.println("Element with index[" + index + "] was deleted");
        }else {
            System.out.println("Can't delete element with index[" + index + "], because it does not exist");
        }

    }

    /*void del(int index){
        for(int pointer = 0; pointer < s; pointer++){
            if(addedIndexs[pointer] == index && pointer < s - 1){
                a[index] = 0;
                summ--;
                System.out.println("Element with index[" + index +"] was deleted");
                break;
            }
            else if(pointer == s - 1){
                System.out.println("Can't delete element with index[" + index + "], because it does not exist");
            }
        }

    }*/

    void display(){
        System.out.println("The average summ is: " + summ);
    }

    void swipe(int index1, int index2){
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
        System.out.println(a[index1] + " and second " + a[index2]);

    }
}


//        int n = 100;
//        int[] a = new int[n];
//        a[0] = 4;
//        a[1] = 15;
//        a[2] = 88;
//        a[3] = 35;
//        a[4] = 90;
//        a[5] = 255;
//        a[6] = 64;
//        a[7] = 25;
//        a[8] = 46;
//        int summ = 9;
//        for (int i = 0; i < summ; i++){
//            System.out.print(a[i] + " ");