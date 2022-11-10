package Cohesion;

import java.util.Scanner;

public class CommunicationalCohesion {
    int[] arr = new int[5];

    public void InsertData() {
        for (int i = 0; i <= 4; i++) {
            arr[i] = i;

        }
    }

    public void ShowData() {
        for (int i = 0; i <= 4; i++) {
            System.out.println(arr[i] + " ");

        }

    }

    public void UpdateData() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position for new data");
        int a = sc.nextInt();
        arr[a] = sc.nextInt();
        System.out.println("Data updated");
        sc.close();
    }

    public static void main(String[] args) {
        CommunicationalCohesion cc = new CommunicationalCohesion();
        cc.InsertData();
        cc.ShowData();
        cc.UpdateData();
        cc.ShowData();
    }

}
