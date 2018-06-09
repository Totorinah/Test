import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        <kieu du lieu> ten bien;
        //<kieu du lieu> ten_bien = <giatri>;
//        int a;//-2^31 -> ^31-1
//        long a; //-2^63 -> 2^63-1
//        float a; //-1.7 * 10^38 -> 1.7 *10^38
//        double a; //-3.4*10^308 -> 3.4*10^308
        //double a=0.0;
        //float b=0 or float b = 1.2f
        /*int x = -3;
        * long y =2 or long y= 2l
     ---KY TU:
        char a = 'a';//unicode
        boolean a = true; //false
        String string = "Hello world"';
        System.out.println("string");//dung print thi khong xuong dong
     ---PHEP TOAN:
        int a = 2;
        long b=3;
        long c =(long)a+b; or long c = a+b;%: lay phan du
        double = Math.pow(2,3.4);
        double =Math.sqrt(2);
        String s1 = "Hello";
        String s2 = "world";
        int a = 2;
        String s = s1 + s2 + a;
        System.out.println(s);
     ----RẼ NHÁNH:
        if else
        if(<dieu kien>){
        }else if() {}

        int a=2;
        boolean x = true;
        if(x){}

        boolean y!=x;//phu dinh
        if( (a= 2) && x) {}// OR: ||

        String s = "Hello";
        if(s.equals("Hello")){}

        int a = 2;
      boolean x =true;
      y.equals()

        //switch - case
        int a = 3;
        switch (a) {
          case 1://code
              break;
          case 2:
              break;
          default:
              //code

      //loop
        for
        for (int i= 5; i<= 6 ; i-= 1){}


        while
        int = 0 ;
        while(i<6){
        System.out.println(i);
        i+= 1;
        break;//dung vong lap
        (hoac) continue;//dung mot phan vong lap (code o phi duoi)
        //code
        (hoac) return;//tat ca cau lenh dung het
        }


        do-while
        i= 0;
        do{
        i++
        }
        while (i<6);
    ----KHAI BÁO MẢNG
    //CACH 1: mang <kieu phan tu> [] ten_bien = new <kieu phan tu> [[so luong phan tu>];

    int [] array = new int [10];
    array[0] = 2;//gan gia tri o vi tri 0
    int a = array[0] ; //phep lay phan tu ra
    for (int i = 0 ; i< array.length; i ++) {
        array[i] = i;}

        for (int element: array){
        System.out.println(element);
        }

        //CACH 2:
        String[] list = {
        "A", "B", "C", "D", "F"
        };

        ArrayList<String> arrayList = new ArrayList<>[]();//mang dong co the thay doi duoc
        arrayList.add("abc");
        arrayList.add("def");
        arrayList.add(2, "def");
        arrayList.remove(0);//xoa phan tu o vi tri 0
        String element = arrayList.get(2);//lay ra phan tu o vi tri nao
         //duyet mang
         for (int i= 0; i < arrayList.get(i));
         }
         for (String element: arrayList) {
         System.out.println(element);}

          ---






         */
//        Scanner scanner = new Scanner(System.in);
//        String a = scanner.next();//int x= scanner.nextInt();...
//        String map[][] = {
//                {"*", "*", "*", "*"},
//                {"*", "*", "*", "*"},
//                {"*", "P", "*", "*"},
//                {"*", "*", "*", "*"}
//
//
//
//        };
        String[][] map = new String[4][4];


        Random random = new Random();


        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = "*";
            }
        }

        map[random.nextInt(4)][random.nextInt(4)] = "P";


        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                String element = map[i][j];
                System.out.print(element);
            }
            System.out.println();
        }
        System.out.println("Nhap vao tu ban phim");
        Scanner key = new Scanner(System.in);
        String k = key.next();
        int x = 3;
        int y = 3;
while(true){
            if (k.equals("w")) {
                x--;
                System.out.println();
            }
            if (k.equals("a")) {
                y--;
            }
            if (k.equals("d")) {
                y++;
            }
            if (k.equals("s")) {
                x++;
            }


    for (int i = 0; i < map.length; i++) {
        for (int j = 0; j < map[i].length; j++) {
            String element = map[i][j];
            System.out.print(element);
        }
        System.out.println();



    }
    break;

}} }
