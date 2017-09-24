package com.joker.paint;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Adam on 2017/9/18.
 */
public class DrawingImage extends DrawingItem {
    private Image _image;
    private JFrame _imgObserver;
    private Rectangle _pos;
    public DrawingImage(Image image,Rectangle pos,JFrame imgObserver){
       super(Type.IMAGE);
       _image=image;
       _pos=pos;
       _imgObserver=imgObserver;
    }
    public void draw(Graphics g){
        Graphics2D graphics2D=(Graphics2D)g;
        graphics2D.drawImage(_image,_pos.x,_pos.y,_pos.width,_pos.height,_imgObserver);
    }
}
