/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lanchatapplication;

import groupChat.GroupChat;
import javax.swing.SwingWorker;

/**
 *
 * @author Saransh Gupta
 */
public class HandleGroupChat extends SwingWorker<Void, Void> {

    @Override
    protected Void doInBackground() throws Exception {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        new GroupChat().showOptionsCreateServerJoinServer();
        return null;
    }
    
}
