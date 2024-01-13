/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author hanie
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu trong mang: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int input = sc.nextInt();
            list.add(input);
        }

        // cau a
        System.out.println("Cau a. Nhap vao 1 so dac biet: ");
        int key = sc.nextInt();
        System.out.println("Cau a: " + removeFirst(list, key));

        // cau b
        System.out.println("Nhap vao so muon them: ");
        int num = sc.nextInt();
        System.out.println("Nhap vi tri muon them: ");
        int index = sc.nextInt();
        System.out.println("Cau b: " + insertAt(list, num, index));

        // cau c
        System.out.println("Cau c: " + findDuplicate(list));

        // cau d
        System.out.println("Cau d: " + removeDuplicate(list));
    }
    // cau a

    /*
     * Xoa phan tu cu the dau tien trong mang
     * cho nguoi dung nhap vao 1 so muon xoa
     * ham kiem tra xem so do co ton tai khong
     * co thi xoa roi tra ve true
     * khong ton tai thi tra ve false
     */
    static boolean removeFirst(ArrayList<Integer> list, int key) {

        if (list.contains(key)) {
            list.remove(list.indexOf(key));

            return true;
        }

        return false;
    }

    // cau b
    /*
     * insert 1 so key vao vi tri chỉ định
     * dùng hàm add(number,index) có sẵn
     * sau đó xóa số cuối của mảng
     * vị trí -1 là vị trí của số cuối cùng
     */
    static ArrayList<Integer> insertAt(ArrayList<Integer> list, int key, int position) {
        list.add(position, key);
        list.remove(list.size() - 1);
        return list;
    }

    // câu c
    /*
     * tìm phần tử trùng nhau trong mảng
     * tạo 1 vòng lặp duyệt từng phần tử trong mảng
     * vòng lặp bên trong chạy từ vị trí tiếp theo của phần tử đang duyệt của vòng
     * lặp ngoài
     * nếu tìm thấy có số trùng bằng cách list.get(i) == list.get(j)
     * thì mình add nó vô list tên là dupList
     * nhưng theo đề bài nếu số 1 trùng 3 lần thì chỉ add 1 số 1 vô duplist thôi
     * nên check thêm số đó đã có trong duplist chưa r mới add
     */
    static ArrayList<Integer> findDuplicate(ArrayList<Integer> list) {
        ArrayList<Integer> dupList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (!dupList.contains(list.get(i)) && list.get(i) == list.get(j)) {
                    dupList.add(list.get(i));
                    break;
                }
            }
        }
        return dupList;
    }

    // cau d
    /*
     * xóa đi phần tử trùng nhau
     * tạo 1 mảng mới add từng số vào nếu trong mảng mới có số đó thì k add nữa
     */

    static ArrayList<Integer> removeDuplicate(ArrayList<Integer> list) {
        ArrayList<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (!resultList.contains(list.get(i))) {
                resultList.add(list.get(i));
            }
        }
        return resultList;
    }
}
