/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package md19304buoi13;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 *
 * @author syn
 */
public class DemoClient {
    public static void main(String[] args) throws Exception {
        String cauNoi;
        
        System.out.println("Vui long nhap cau noi: ");
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        cauNoi = input.readLine();
        Socket connectServer = new Socket("localhost", 6789);
        
        DataOutputStream outToServer = 
                new DataOutputStream(connectServer.getOutputStream());
        outToServer.writeBytes(cauNoi + "\n");
        
        BufferedReader inputFromServer = 
                new BufferedReader(
                        new InputStreamReader(connectServer.getInputStream()
                        )
                );
        System.out.println(inputFromServer.readLine());
    }
}
