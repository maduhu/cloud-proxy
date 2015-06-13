/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rinxor.utils;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.logging.Level;

/**
 *
 * @author TJ
 */
public class SshUtils {
    public static String remoteCommandOneshot(String host, int port, String user, String password, String command) {
        String res = null;
        try {
            final String CRLF = "\r\n";
            final String endLineSharpStr = "# ";
            final String endLineDollarStr = "$ ";

            java.util.Properties config = new java.util.Properties();
            config.put("StrictHostKeyChecking", "no");
            JSch jsch = new JSch();
            Session session = jsch.getSession(user, host, port);
            session.setPassword(password);
            session.setConfig(config);
            session.connect();
            System.out.println("Connected");

            Channel channel = session.openChannel("shell");
            channel.connect();

            DataInputStream dataIn = new DataInputStream(channel.getInputStream());
            DataOutputStream dataOut = new DataOutputStream(channel.getOutputStream());

            dataOut.writeBytes(command + CRLF);
            dataOut.flush();

            String line = dataIn.readLine();
            res = line;
            System.out.println(line);
            while (!line.endsWith(endLineSharpStr) && !line.endsWith(endLineDollarStr)) {
                
                line = dataIn.readLine();
                res += line;
                System.out.println(line);

                if (channel.isClosed()) {
                    System.out.println("exit status: " + channel.getExitStatus());
                    break;
                }
            }

            dataIn.close();
            dataOut.close();
            channel.disconnect();
            session.disconnect();

        } catch (JSchException ex) {
            java.util.logging.Logger.getLogger(SshUtils.class.getName()).log(Level.SEVERE, "SSH error", ex);
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(SshUtils.class.getName()).log(Level.SEVERE, "I/O error", ex);
        }
        return res;
    }
}
