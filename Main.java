/**
 * 
 */

/**
 * @author tiffin filion
 *
 */

import java.awt.*;
import java.util.Arrays;

public class Main {

  /**
   * @param args
   */
  public static void main(String[] args) {
    
// Setup canvas and paintbrush
    DrawingPanel panel = new DrawingPanel(1280, 640);
    Graphics g = panel.getGraphics();
    
// Set canvas main background color
    panel.setBackground(Color.BLACK);

 // color variables
    Color darkBlue = new Color(48, 43, 145);
    Color medBlue = new Color(90, 176, 255);
    Color lightBlue = new Color(162, 211, 241);
    Color teal = new Color(92, 214, 214);
    Color medLavender = new Color(145, 165, 218);
    Color lightLavender = new Color(236, 239, 249);

// Draw stars    
    g.setColor(Color.WHITE);
    drawStars(g);
// Draw lined cloud
    drawLineCloud(g, lightLavender, Color.WHITE);
// Draw four dotted clouds
    drawDottedClouds(g, Color.WHITE, teal);
  }
  
  public static void drawStars(Graphics g) {
    
    int[] xCoordinates = {33, 37, 40, 31, 42, 33};
    int[] yCoordinates = {21, 10, 21, 14, 14, 21};   

    // print 6 lines of stars
    for (int s = 0; s < 7; s++) {
      
      // even lines
      for (int stars = 0; stars < 24; stars++) {
      // draw 23 stars
        
        // draw a single star
        g.drawPolyline(xCoordinates, yCoordinates, 6);
        for (int x = 0; x < xCoordinates.length; x++) {
          xCoordinates[x] += 53;
        }
      }
      
      // reset for next line
      for (int x = 0; x < xCoordinates.length; x++) {
        xCoordinates[x] -= 1345;
      }
      for (int y = 0; y < yCoordinates.length; y++) {
        yCoordinates[y] += 40;
      }
      
      // odd lines
      for (int stars = 0; stars < 25; stars++) {
        // draw 24 stars
          
          // draw a single star
          g.drawPolyline(xCoordinates, yCoordinates, 6);
          for (int x = 0; x < xCoordinates.length; x++) {
            xCoordinates[x] += 53;
          }
        }
      // reset for next line
      for (int x = 0; x < xCoordinates.length; x++) {
        xCoordinates[x] -= 1250;
      }
      for (int y = 0; y < yCoordinates.length; y++) {
        yCoordinates[y] += 40;
      }
    }
  }

  public static void drawLineCloud(Graphics g, Color lavender, Color white) {
    int x = 850;
    int y = 40;
    int width = 220;
    int height = 220;
    
    for (int i = 0; i < 7; i++) {
      g.setColor(white);
      g.fillOval(x, y, width, height);
      x += 5;
      y += 5;
      width -= 10;
      height -= 10;
      g.setColor(lavender);
      g.fillOval(x, y, width, height);
      x += 20;
      y += 20;
      width -= 40;
      height -= 40;
    }
  }
  
  public static void drawDottedClouds(Graphics g, Color white, Color teal) {
    
    // outlines
    g.setColor(teal);
    int x = 1175;
    int y = 140;
    int width = 165;
    int height = width;
    g.fillOval(x, y, width, height);

    x -= 130;
    y -= 45;
    width += 25;
    height = width;
    g.fillOval(x, y, width, height);
    
    x -= 260;
    y -= 45;
    width += 15;
    height = width;
    g.fillOval(x, y, width, height);
    
    x -= 90;
    y += 60;
    width -= 75;
    height = width;
    g.fillOval(x, y, width, height);
    
    // fill
    g.setColor(white);
    x = 1175;
    y = 140;
    width = 160;
    height = width;
    g.fillOval(x, y, width, height);

    x -= 130;
    y -= 45;
    width += 25;
    height = width;
    g.fillOval(x, y, width, height);
    
    x -= 260;
    y -= 45;
    width += 15;
    height = width;
    g.fillOval(x, y, width, height);
    
    x -= 90;
    y += 60;
    width -= 75;
    height = width;
    g.fillOval(x, y, width, height);

    // outlines
    g.setColor(teal);
    x = 1165;
    y = 150;
    width = 150;
    height = width;
    g.fillOval(x, y, width, height);

    x -= 130;
    y -= 45;
    width += 25;
    height = width;
    g.fillOval(x, y, width, height);
    
    x -= 260;
    y -= 45;
    width += 15;
    height = width;
    g.fillOval(x, y, width, height);
    
    x -= 90;
    y += 60;
    width -= 75;
    height = width;
    g.fillOval(x, y, width, height);
    
    // fill
    g.setColor(white);
    x = 1165;
    y = 150;
    width = 145;
    height = width;
    g.fillOval(x, y, width, height);

    x -= 130;
    y -= 45;
    width += 25;
    height = width;
    g.fillOval(x, y, width, height);
    
    x -= 260;
    y -= 45;
    width += 15;
    height = width;
    g.fillOval(x, y, width, height);
    
    x -= 90;
    y += 60;
    width -= 75;
    height = width;
    g.fillOval(x, y, width, height);
  }

  // line clouds circles
  // line clouds rectangles
  
  // swirl clouds
  
  // mountain
  
  // trees?
}

