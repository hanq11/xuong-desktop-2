/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package md19304buoi13;

import java.net.InetAddress;

/**
 *
 * @author syn
 */
public class DemoIP2 {
    public static void main(String[] args) throws Exception {
        InetAddress[] addresses = InetAddress.getAllByName("google.com");
        for(int i = 0; i < addresses.length; i++) {
            System.out.println(addresses[i].getHostName());
            System.out.println(addresses[i].getHostAddress());   
        }
    }
}
