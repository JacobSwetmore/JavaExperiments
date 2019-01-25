
public class Queue {

    private String[] name;
    private int[] age;
    private int rear;

    public void createArray() {
        name = new String[10];
        age = new int[10];
        rear = 0;
    }

    public boolean isEmpty() {
        return rear == 0;
    }

    public String removeFromQ() {
        String Val = name[0];
        rear = rear - 1;
        for (int i = 0; i < rear; i++) {
            name[i] = name[i + 1];
            age[i] = age[i + 1];
        }
        return Val;
    }

    public int isOfAge(int AgeOfFilm) {
        int Val2 = age[0];
        if (Val2 >= AgeOfFilm) {
            return 0;
        } else {
            return 1;
        }
    }

    public void add(String Val, int Val2) //add String element
    {
        if (rear == name.length) {
            resize();
        }
        name[rear] = Val;
        age[rear] = Val2;
        rear++;
    }

    private void resize() {
        String[] temp = new String[name.length * 2];
        int[] temp2 = new int[age.length * 2]; //resize String array
        for (int i = 0; i < name.length; i++) {
            temp[i] = name[i];
            temp2[i] = age[i];
        }
        name = temp;
        age = temp2;
    }
}

//public class Queue {
//
//    private String[] a;	//declare String array
//    private int[] age;
//    private int rear;
//
//    public Queue() {
//        a = new String[10];
//        age = new int[10];        
//        rear = 0;
//    }
//
//    public boolean isEmpty() {
//
//        return rear == 0;
//    }
//
//    public String remove() //remove String element
//    {
//        String result = a[0];		//shuffle String elements
//
//        for (int i = 0; i < rear; i++) {
//            a[i] = a[i + 1];
//        }
//        return result;
//    }
//
//    public int removeAge() //remove String element
//    {
//        int resultAge = age[0];
//        rear--;
//        for (int i = 0; i < rear; i++) {
//            age[i] = age[i + 1];
//        }
//        return resultAge;
//    }
//
//    public void add(String x, int y) //add String element
//    {
//    {
//        if (rear == a.length)
//        {
//            resize();
//        }
//        a[rear] = x;
//        age[rear] = y;
//        rear++;
//    }
//    }
//
//    private void resize() {
//        String[] temp = new String[a.length * 2];
//        int[] tempInt = new int[age.length * 2]; //resize String array
//        for (int i = 0; i < a.length; i++) {
//            temp[i] = a[i];
//            tempInt[i] = age[i];
//        }
//        a = temp;
//        age = tempInt;
//    }
//}
