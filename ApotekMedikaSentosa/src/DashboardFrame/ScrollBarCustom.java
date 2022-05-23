/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DashboardFrame;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JScrollBar;

/**
 *
 * @author mac
 */
public class ScrollBarCustom extends JScrollBar{
    public ScrollBarCustom(){
        setUI(new ModernScrollBar());
        setPreferredSize(new Dimension(8,8));
        setForeground(new  Color(3,166,44));
        setBackground(Color.WHITE);
    }
}
