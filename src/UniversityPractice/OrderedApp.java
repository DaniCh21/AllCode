package UniversityPractice;

public class OrderedApp {
    public static void main(String[] args) {
        int maxSize = 100;
        OrdArray arr;
        arr = new OrdArray(maxSize);
        arr.insert(55);
        arr.insert(33);
        arr.insert(11);
        arr.insert(99);
        arr.insert(22);
        arr.insert(66);
        arr.insert(55);
        arr.insert(44);
        arr.insert(88);
        arr.insert(00);
        int searchKey = 22;
        if( arr.find(searchKey) != arr.size() )
            System.out.println("Found " + searchKey);
        else
            System.out.println("Can't find " + searchKey);
        arr.display();
        arr.delete(11);
        arr.delete(66);
        arr.delete(88);
        arr.display();
    }
}

class OrdArray{
    private long[] x;
    private int nElems;
    public OrdArray(int max) {
        x = new long[max];
        nElems = 0;
    }
    public int size() {
        return nElems;
    }
    public int find(long searchKey)  {
        int lowerBound = 0;
        int upperBound = nElems-1;
        int curIn;
        while(true)    {
            curIn = (lowerBound + upperBound ) / 2;
            if(x[curIn]==searchKey)
                return curIn;
            else if(lowerBound > upperBound)
                return nElems;
            else
            {
                if(x[curIn] < searchKey)
                    lowerBound = curIn + 1;
                else
                    upperBound = curIn - 1;
            }
        }
    }
    public void insert(long value)   {
        int i;
        for(i = 0; i < nElems; i++)
            if(x[i] > value)
                break;
        for(int k = nElems; k > i; k--)
            x[k] = x[k-1];
        x[i] = value;
        nElems++;
    }
    public boolean delete(long value)    {
        int i = find(value);
        if(i == nElems)
            return false;
        else                          {
            for(int k = i; k < nElems; k++)
                x[k] = x[k+1];
            nElems--;
            return true;
        }
    }
    public void display() {
        for(int i = 0; i < nElems; i++)
            System.out.print(x[i] + " ");
        System.out.println("");
    }
}

