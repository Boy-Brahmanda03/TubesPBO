/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DashboardFrame;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;



/**
 *
 * @author mac
 */
public class PanelMenu extends JComponent {

    private final JPanel panelMenu;
    private float animate;
    
    private final List<EventMenu> events = new ArrayList<>();
    
    public float getAnimate() {
        return animate;
    }

    public void setAnimate(float animate) {
        this.animate = animate;
        repaint();
    }
    
    public PanelMenu(){
        setLayout(new MigLayout("fill", "[center]", "center"));
        panelMenu = new JPanel();
        panelMenu.setOpaque(false);
        panelMenu.setLayout(new MigLayout("wrap", "[fill]", "0[]0"));
        add(panelMenu);
        addMenu("Dashboard");
        addMenu("Email");
        addMenu("Calendar");
        addMenu("UI Kit");
        addMenu("Advanced UI");
        addMenu("Forms");
        addMenu("Icons");
    }

    private void addMenu(String menuName) {
        panelMenu.add(getMenu(menuName), "w 100, h 35");
    }
    
    private JButton getMenu(String text) {
        Button menu = new Button();
        menu.initMouseOver();
        menu.setIndex(panelMenu.getComponentCount());
        menu.setText(text);
        menu.setRound(10);
        menu.setForeground(new Color(0, 0, 0));
        menu.setBorder(new EmptyBorder(5, 50, 5, 50));
        menu.setEffectColor(new Color(255, 255, 255, 150));
        menu.setFont(menu.getFont().deriveFont(Font.BOLD, 14));
        
        menu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                //  Run event menu
                runEvent(menu.getIndex());
            }
        });
        return menu;
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int width = getWidth();
        int height = getHeight();
        g2.setPaint(new GradientPaint(0, 0, Color.decode("#ccffcc"), width, 0, Color.decode("#ccffcc")));
        g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, getAnimate()));
        g2.fillRect(0, 0, width, height);
        g2.dispose();
        super.paintComponent(g);
    }

    public void addEvent(EventMenu event) {
        events.add(event);
    }
    
    public void runEvent(int index) {
        for (EventMenu event : events) {
            event.menuSelected(index);
        }
    }
   
}
