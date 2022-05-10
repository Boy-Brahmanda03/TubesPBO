/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DashboardFrame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javaswingdev.GoogleMaterialDesignIcon;
import javaswingdev.GoogleMaterialIcon;
import javaswingdev.GradientType;
import javax.swing.JLayeredPane;
import net.miginfocom.swing.MigLayout;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTargetAdapter;


/**
 *
 * @author mac
 */
public class LayerForm extends JLayeredPane {

    private boolean showing;
    private float animate;
    
    public LayerForm() {
        setBackground(new Color(242, 242, 242));
        layout = new MigLayout("fill,inset 3", "[fill]", "[fill]");
        setLayout(layout);
        //Init menu
        menu = new PanelMenu();
        menu.addEvent(new EventMenu() {
            @Override
            public void menuSelected(int index) {
                
            }
        });
        add(menu, "pos 1al 0al, w 0!, h 0!");
        //Init form
        formPanel = new FormPanel();
        add(formPanel);
      
        //  Init button menu
        buttonMenu = new Button();
        buttonMenu.setIcon(new GoogleMaterialIcon(GoogleMaterialDesignIcon.DEHAZE, GradientType.VERTICAL, new Color(12, 12, 12), new Color(12, 12, 12), 25).toIcon());
        setLayer(buttonMenu, JLayeredPane.POPUP_LAYER);
        buttonMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                setVisibleMenu(!showing);
            }
        });
        add(buttonMenu, "pos 1al 0al, h 40, w 40", 0);
        // Init Animator
        animator = new Animator(350, new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                animate = showing ? fraction : 1f - fraction;
                int w = (int) (animate * 100);
                int h = (int) (animate * 100);
                layout.setComponentConstraints(menu, "pos 1al 0al, w " + w + "%-6!, h " + h + "%-6!");
                revalidate();
                menu.setAnimate(animate);
            }
        });
        animator.setResolution(0);
        animator.setAcceleration(.5f);
        animator.setDeceleration(.5f);
       
    }
    
    private FormPanel formPanel;
    private Animator animator;
    private PanelMenu menu;
    private MigLayout layout;
    private Button buttonMenu;
    
    private void startAnimator(boolean showing) {
        if (animator.isRunning()) {
            animator.stop();
            float f = animator.getTimingFraction();
            animator.setStartFraction(1f - f);
        } else {
            animator.setStartFraction(0f);
        }
        this.showing = showing;
        animator.start();
    }
    
    public void setVisibleMenu(boolean show) {
        if (show != showing) {
            startAnimator(show);
            if (showing) {
                buttonMenu.setIcon(new GoogleMaterialIcon(GoogleMaterialDesignIcon.CLEAR, GradientType.VERTICAL, new Color(0,0,0), new Color(0,0,0), 25).toIcon());
            } else {
                buttonMenu.setIcon(new GoogleMaterialIcon(GoogleMaterialDesignIcon.DEHAZE, GradientType.VERTICAL, new Color(0,0,0), new Color(0,0,0), 25).toIcon());
            }
        }
    }
        
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setColor(getBackground());
        g2.fillRect(0, 0, getWidth(), getHeight());
        g2.dispose();
        super.paintComponent(g);
    }
      
}
