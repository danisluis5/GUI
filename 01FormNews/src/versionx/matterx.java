/** move jframe without title bar **/
package versionx;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;

public class matterx
{
    static Point mouseDownCompCoords;

    public static void main(String[] args)
    {
        final JFrame f = new JFrame("Hello");

        mouseDownCompCoords = null;
        f.setUndecorated(true);
        f.setVisible(true);
        f.setBounds(0, 0, 400, 400);

        f.addMouseListener(new MouseListener(){
            public void mouseReleased(MouseEvent e) {
                mouseDownCompCoords = null;
            }
            public void mousePressed(MouseEvent e) {
                mouseDownCompCoords = e.getPoint();
            }
            public void mouseExited(MouseEvent e) {
            }
            public void mouseEntered(MouseEvent e) {
            }
            public void mouseClicked(MouseEvent e) {
            }
        });

        f.addMouseMotionListener(new MouseMotionListener(){
            public void mouseMoved(MouseEvent e) {
            }

            public void mouseDragged(MouseEvent e) {
                Point currCoords = e.getLocationOnScreen();
                f.setLocation(currCoords.x - mouseDownCompCoords.x, currCoords.y - mouseDownCompCoords.y);
            }
        });
    }
}