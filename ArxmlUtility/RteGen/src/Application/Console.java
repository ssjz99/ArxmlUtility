/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

import java.io.IOException;
import java.io.PipedInputStream;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

/**
 *
 * @author ssjz99
 */
public class Console implements Runnable {

    private final PipedInputStream pis = new PipedInputStream();
    //private final BufferedInputStream bis = new BufferedInputStream(pis);
    private final Document doc;

    public PipedInputStream getPis() {
        return pis;
    }

    public Console(Document d) {
        doc = d;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1);
                int len = pis.available();
                while (len > 0) {
                    byte buffer[] = new byte[len];
                    pis.read(buffer);
                    String s = new String(buffer);
                    doc.insertString(doc.getLength(),s,null);
                }
            } catch (IOException | BadLocationException e) {
                System.err.print(e);
            } catch (InterruptedException e) {
            }
        }
    }
}
