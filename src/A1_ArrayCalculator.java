
//import class random มาใช้สุ่มเลข
import java.util.Random;

//สร้าง class ชื่อว่า ArrayCalculator แบบ public
public class A1_ArrayCalculator {
    //  สร้าง method แบบ static เป็น void ชื่อว่า main เพราะไม่มี return ค่า และ
    // รับค่า parameter string array ชื่อ args
    public static void main(String[] args) {
        // ประกาศตัวแปรชื่อ n ชนิด int ไว้เก็บความยาวของ array
        int n = 5;

        // ประกาศตัวแปรชื่อ arr1 ชนิด double แล้วกำหนดค่าให้ array
        double[] arr1 = new double[n];

        // ประกาศตัวแปรชื่อ arr2 ชนิด double แล้วกำหนดค่าให้ array
        double[] arr2 = new double[n];

        // ประกาศตัวแปรชื่อ plus_result ชนิด double แล้วกำหนดค่าให้ array
        double[] plus_result = new double[n];

        // ประกาศตัวแปรชื่อ minus_result ชนิด double แล้วกำหนดค่าให้ array
        double[] minus_result = new double[n];

        // ประกาศตัวแปรชื่อ div_result ชนิด double แล้วกำหนดค่าให้ array
        double[] div_result = new double[n];

        // ประกาศตัวแปรชื่อ mod_result ชนิด double แล้วกำหนดค่าให้ array
        double[] mod_result = new double[n];

        // ลูปจำนวน n ครั้ง
        for (int i = 0; i < n; i++) {
            // กำหนดค่าให้ arr1 ด้วย index i เท่ากับ สุ่มเลข 1-100 ด้วย method randomInt
            arr1[i] = randomInt();

            // กำหนดค่าให้ arr2 ด้วย index i เท่ากับ สุ่มเลข 1-100 ด้วย method randomInt
            arr2[i] = randomInt();

            // กำหนดค่าให้ plus_result ด้วย index i เท่ากับ ผลลัพธ์ จาก method
            // plus ด้วย parameter arr1 ด้วย index i กับ arr2 ด้วย index i
            plus_result[i] = plus(arr1[i], arr2[i]);

            // กำหนดค่าให้ minus_result ด้วย index i เท่ากับ ผลลัพธ์ จาก method
            // plus ด้วย parameter arr1 ด้วย index i กับ arr2 ด้วย index i
            minus_result[i] = minus(arr1[i], arr2[i]);

            // กำหนดค่าให้ div_result ด้วย index i เท่ากับ ผลลัพธ์ จาก method
            // plus ด้วย parameter arr1 ด้วย index i กับ arr2 ด้วย index i
            div_result[i] = div(arr1[i], arr2[i]);

            // กำหนดค่าให้ mod_result ด้วย index i เท่ากับ ผลลัพธ์ จาก method
            // plus ด้วย parameter arr1 ด้วย index i กับ arr2 ด้วย index i
            mod_result[i] = mod(arr1[i], arr2[i]);
        }

        // ลูปตามความยาวของ array plus_result
        for (int i = 0; i < plus_result.length; i++) {

            // แสดงข้อความบนบรรทัดเดิม ของตัวแปร plus_result index i
            System.out.print(plus_result[i] + " ");
        }

        // ขึ้นบรรทัดใหม่
        System.out.println();

        // ลูปตามความยาวของ array minus_result
        for (int i = 0; i < minus_result.length; i++) {

            // แสดงข้อความบนบรรทัดเดิม ของตัวแปร minus_result index i
            System.out.print(minus_result[i] + " ");
        }

        // ขึ้นบรรทัดใหม่
        System.out.println();

        // ลูปตามความยาวของ array div_result
        for (int i = 0; i < div_result.length; i++) {

            // แสดงข้อความบนบรรทัดเดิม ของตัวแปร div_result index i
            System.out.print(div_result[i] + " ");
        }

        // ขึ้นบรรทัดใหม่
        System.out.println();

        // ลูปตามความยาวของ array mod_result
        for (int i = 0; i < mod_result.length; i++) {

            // แสดงข้อความบนบรรทัดเดิม ของตัวแปร mod_result index i
            System.out.print(mod_result[i] + " ");
        }

    }

    // สร้าง method ประเภท public แบบ static คืนค่าชนิด int ชื่อว่า randomInt
    public static int randomInt() {
        // ประกาศตัวแปร rn ชนิด Random แล้วกำหนดค่าเท่ากับ สร้าง object class Random
        Random rn = new Random();
        // คืนค่า สุ่มเลขจาก 1-100
        return rn.nextInt(100) + 1;
    }

    // สร้าง method ประเภท public แบบ static คืนค่าชนิด double ชื่อว่า plus
    // รับค่า parameter ชนิด double ชื่อ x กับ ชนิด double ชื่อ y
    public static double plus(double x, double y) {
        // คืนค่า x บวก y
        return x + y;
    }

    // สร้าง method ประเภท public แบบ static คืนค่าชนิด double ชื่อว่า minus
    // รับค่า parameter ชนิด double ชื่อ x กับ ชนิด double ชื่อ y
    public static double minus(double x, double y) {
        // คืนค่า x ลบ y
        return x - y;
    }

    // สร้าง method ประเภท public แบบ static คืนค่าชนิด double ชื่อว่า div
    // รับค่า parameter ชนิด double ชื่อ x กับ ชนิด double ชื่อ y
    public static double div(double x, double y) {
        // คืนค่า x หาร y
        return x / y;
    }

    // สร้าง method ประเภท public แบบ static คืนค่าชนิด double ชื่อว่า mod
    // รับค่า parameter ชนิด double ชื่อ x กับ ชนิด double ชื่อ y
    public static double mod(double x, double y) {
        // คืนค่า x มอด y
        return x % y;
    }
}
