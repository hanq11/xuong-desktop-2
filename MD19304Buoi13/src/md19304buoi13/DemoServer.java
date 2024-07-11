/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package md19304buoi13;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author syn
 */
public class DemoServer {
    public static void main(String[] args) throws Exception {
        String chuThuong;
        
        ServerSocket server = new ServerSocket(6789);
        
        while(true) {
            Socket client = server.accept();
            BufferedReader clientInput = 
                    new BufferedReader(new InputStreamReader(client.getInputStream()));
            chuThuong = clientInput.readLine();
            
            DataOutputStream outToClient = 
                    new DataOutputStream(client.getOutputStream());
            outToClient.writeBytes(chuThuong.toUpperCase() + "\n");
        }
    }
}
