/*
 * By Tiffin Filion
 * CSCI142 6915 - F21 - Obj-Orent Prog I with Java
 * Art Contest Submission
 * Mountain with clouds and starry night sky
 */

 /** TODO */
 /* add comments where necessary
  * use for loops for repeating items like the circles for the swirl clouds
  */

import java.awt.Color;
import java.awt.Graphics;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) {

    // Setup canvas and paintbrush
    DrawingPanel panel = new DrawingPanel(1288, 728);
    Graphics g = panel.getGraphics();
    panel.setBackground(Color.BLACK);

    // Color variables
    Color white = new Color(255, 255, 255);
    Color darkBlue = new Color(48, 43, 145);
    Color medBlue = new Color(90, 176, 255);
    Color lightBlue = new Color(162, 211, 241);
    Color teal = new Color(92, 214, 214);
    Color medLavender = new Color(145, 165, 218);
    Color lightLavender = new Color(236, 239, 249);

    // Draw layers
    drawStars(g, white);
    drawStripedCloud(g, lightLavender, white);
    drawDottedClouds(g, white, teal);
    drawLineClouds(g, lightBlue, medBlue);
    drawSwirlClouds(g, medLavender, white);
    drawPatterns(g, medLavender, white);
    drawMountain(g, darkBlue, medBlue);
    drawTrees(g, medBlue);

    /** end of main method **/
  }

  public static void drawStars(Graphics g, Color main) {
    // set color & starting coordinate arrays
    g.setColor(main);
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
    
    /** end of drawStars method **/
  }

  public static void drawStripedCloud(Graphics g, Color background, Color lines) {
    // starting coordinates and size    
    int x = 849;
    int y = 37;
    int width = 217;
    int height = width;

    // draws 7 stripes
    for (int i = 0; i < 7; i++) {
      g.setColor(lines);
      g.fillOval(x, y, width, height);
      x += 5;
      y += 5;
      width -= 10;
      height = width;
      g.setColor(background);
      g.fillOval(x, y, width, height);
      x += 10;
      y += 10;
      width -= 20;
      height = width;
    }
    
    /** end of drawStripedClouds method **/
  }

  public static void drawDottedClouds(Graphics g, Color background, Color lines) {
    // set coordinates and sizes for each cloud
    
    // cloud 1
    int x = 1180;
    int y = 138;
    int width = 144;
    int height = width;
    drawDotCloud(g, x, y, width, height, background, lines);

    // cloud 2
    x = 1033;
    y = 98;
    width = 198;
    height = width;
    drawDotCloud(g, x, y, width, height, background, lines);

    // cloud 3
    x = 775;
    y = 53;
    width = 214;
    height = width;
    drawDotCloud(g, x, y, width, height, background, lines);

    // cloud 4
    x = 687;
    y = 107;
    width = 137;
    height = width;

    drawDotCloud(g, x, y, width, height, background, lines);
    
    /** end of drawDottedClouds method **/
  }

  public static void drawDotCloud(Graphics g, int x, int y, int width, int height, Color background,
      Color lines) {
    /* draws single cloud for the dotted clouds
     * goes with drawDottedClouds method
     */
    for (int i = 0; i < 5; i++) {
      g.setColor(lines);
      g.fillOval(x, y, width, height);

      x += 10;
      y += 10;
      width -= 10;
      height = width;
      g.setColor(background);
      g.fillOval(x, y, width, height);

      x -= 15;
      y += 20;
      width -= 15;
      height = width;
    }
    
    /** end of drawDotCloud method **/
  }

  public static void drawLineClouds(Graphics g, Color background, Color lines) {
    // set coordinates and sizes for each cloud
    // cloud 1
    int x = 909;
    int y = 115;
    int width = 250;
    int height = width;
    drawLCloud(g, x, y, width, height, background, lines);

    // cloud 2
    x = 750;
    y = 130;
    width = 210;
    height = width;
    drawLCloud(g, x, y, width, height, background, lines);

    // cloud 3
    x = 599;
    y = 169;
    width = 179;
    height = width;
    drawLCloud(g, x, y, width, height, background, lines);

    // rectangle 1
    int a = 601;
    int b = 210;
    int w = 560;
    int l = 140;
    int arcWidth = 30;
    int arcHeight = 30;
    drawRectangle(g, a, b, w, l, arcWidth, arcHeight, background, lines);

    // cloud 4
    x = 91;
    y = 166;
    width = 250;
    height = width;
    drawLCloud(g, x, y, width, height, background, lines);

    // cloud 5
    x = 280;
    y = 205;
    width = 151;
    height = width;
    drawLCloud(g, x, y, width, height, background, lines);

    // cloud 6
    x = -79;
    y = 67;
    width = 259;
    height = width;
    drawLCloud(g, x, y, width, height, background, lines);

    // rectangle 2
    a = -5;
    b = 240;
    w = 435;
    l = 186;
    arcWidth = 30;
    arcHeight = 30;
    drawRectangle(g, a, b, w, l, arcWidth, arcHeight, background, lines);
    
    /** end of drawLineClouds method **/
  }

  public static void drawLCloud(Graphics g, int x, int y, int width, int height, Color background,
      Color lines) {
    /* creates 5 stripes for the cloud
     * goes with drawLineClouds method
     */
    for (int i = 0; i < 5; i++) {
      // draws outlines
      g.setColor(lines);
      g.fillOval(x, y, width, height);

      // adjust coordinates and sizes and draw main color
      x += 5;
      y += 5;
      width -= 10;
      height = width;
      g.setColor(background);
      g.fillOval(x, y, width, height);

      // reset for next loop by changing coordinates and sizes
      x += 20;
      y += 20;
      width -= 40;
      height = width;
    }
    /** end of drawCloud method **/
  }

  public static void drawRectangle(Graphics g, int x, int y, int width, int height, int arcWidth,
      int arcHeight, Color background, Color lines) {
    /* create base rectangle with rounded edges that all other rectangles will sit within
     * goes with drawLineClouds method
     */
    g.setColor(lines);
    g.fillRoundRect(x, y, width, height, arcWidth, arcHeight);

    y += 5;
    x += 5;
    width -= 10;
    height -= 10;
    g.setColor(background);
    g.fillRoundRect(x, y, width, height, arcWidth, arcHeight);

    // creates 6 more stripes for the rectangle
    for (int i = 0; i < 6; i++) {
      y += 10;
      g.setColor(lines);
      g.fillRoundRect(x, y, width, height, arcWidth, arcHeight);

      y += 5;
      height -= 10;
      g.setColor(background);
      g.fillRoundRect(x, y, width, height, arcWidth, arcHeight);

      y += 5;
      height -= 10;
    }
    /** end of drawRectangle method **/
  }

  public static void drawSwirlClouds(Graphics g, Color background, Color lines) {

    // cloud 1
    g.setColor(lines);
    int x = 44;
    int y = 380;
    int width = 177;
    int height = 169;
    g.fillOval(x, y, width, height);
    x += 5;
    y += 5;
    width -= 10;
    height -= 10;
    g.setColor(background);
    g.fillOval(x, y, width, height);

    // cloud 2
    g.setColor(lines);
    x = -80;
    y = 357;
    width = 194;
    height = 220;
    g.fillOval(x, y, width, height);
    x += 5;
    y += 5;
    width -= 10;
    height -= 10;
    g.setColor(background);
    g.fillOval(x, y, width, height);

    // cloud 3
    g.setColor(lines);
    x = 717;
    y = 260;
    width = 272;
    height = 250;
    g.fillOval(x, y, width, height);
    x += 5;
    y += 5;
    width -= 10;
    height -= 10;
    g.setColor(background);
    g.fillOval(x, y, width, height);

    // cloud 4
    g.setColor(lines);
    x = 1091;
    y = 190;
    width = 286;
    height = 404;
    g.fillOval(x, y, width, height);
    x += 5;
    y += 5;
    width -= 10;
    height -= 10;
    g.setColor(background);
    g.fillOval(x, y, width, height);

    // cloud 5
    g.setColor(lines);
    x = 928;
    y = 228;
    width = 272;
    height = 250;
    g.fillOval(x, y, width, height);
    x += 5;
    y += 5;
    width -= 10;
    height -= 10;
    g.setColor(background);
    g.fillOval(x, y, width, height);

  }

  public static void drawPatterns(Graphics g, Color background, Color lines) {
    /* draws various sized circles to go 
     * with drawSwirlClouds method
     */
    
    // large multiple stripes - 96 pixels
    int[] xPoints = {-18, 86, 735, 754, 840, 874, 955, 969, 1060, 1084, 1150, 1177, 1190};
    int[] yPoints = {380, 405, 385, 281, 395, 300, 350, 242, 375, 280, 475, 212, 360};
    int width = 96;
    int repeat = 4;
    // draw 13 concentric circles
    for (int i = 0; i < xPoints.length; i++) {
      int x = xPoints[i];
      int y = yPoints[i];     
      drawSwirlPattern(g, background, lines, x, y, width, repeat);
    }

    // medium multiple stripes - 50 pixels
    xPoints = new int[]{0, 50, 120, 720, 850, 1040, 1050, 1110, 1150, 1170, 1220, 1230, 1250};
    yPoints = new int[]{505, 475, 500, 350, 270, 335, 230, 470, 430, 330, 305, 455, 505};
    width = 50;
    repeat = 2;
    // draw 13 concentric circles
    for (int i = 0; i < xPoints.length; i++) {
      int x = xPoints[i];
      int y = yPoints[i];
      drawSwirlPattern(g, background, lines, x, y, width, repeat);
    }
    
    // 30 pixel - single circle  
    xPoints = new int[]{175, 822, 830, 850, 1031, 1152, 1239};
    yPoints = new int[]{486, 375, 480, 350, 438, 376, 554};
    width = 30;
    repeat = 1;
    // draw 7 circles
    for (int i = 0; i < xPoints.length; i++) {
      int x = xPoints[i];
      int y = yPoints[i];
      drawSwirlPattern(g, background, lines, x, y, width, repeat);
    }
    
    // 25 pixel - single circle
    xPoints = new int[]{76, 183, 927, 1151, 1155, 1262};
    yPoints = new int[]{395, 451, 399, 240, 272, 205};
    width = 25;
    // draw 6 circles
    for (int i = 0; i < xPoints.length; i++) {
      int x = xPoints[i];
      int y = yPoints[i];
      drawSwirlPattern(g, background, lines, x, y, width, repeat);
    }
    
    // 20 pixel - single circle
    xPoints = new int[] {0, 2, 110, 175, 803, 825, 830, 850, 939, 942, 971, 1071, 1104, 1170, 1206, 1215, 1234, 1267, 1271};
    yPoints = new int[] {476, 364, 390, 416, 480, 460, 270, 325, 433, 290, 332, 286, 248, 217, 455, 572, 196, 351, 244};
    width = 20;
    // draw 19 circles
    for (int i = 0; i < xPoints.length; i++) {
      int x = xPoints[i];
      int y = yPoints[i];
      drawSwirlPattern(g, background, lines, x, y, width, repeat);
    }
    
    // 15 pixel - single circle
    xPoints = new int[] {153, 855, 863, 900, 1010, 1022, 1062, 1097, 1129, 1168, 1195, 1198, 1268};
    yPoints = new int[] {391, 383, 488, 280, 448, 340, 315, 272, 259, 410, 205, 307, 286};
    width = 15;
    // draw 13 circles
    for (int i = 0; i < xPoints.length; i++) {
      int x = xPoints[i];
      int y = yPoints[i];
      drawSwirlPattern(g, background, lines, x, y, width, repeat);
    }

    /** end of drawPatterns method **/
  }

  public static void drawSwirlPattern(Graphics g, Color background, Color lines, int x, int y,
      int width, int repeat) {
    /* draws concentric circles
     * part of drawPatterns method
     */

    int height = width;

    for (int i = 0; i < repeat; i++) {
      g.setColor(lines);
      g.fillOval(x, y, width, height);
      x += 5;
      y += 5;
      width -= 10;
      height -= 10;
      g.setColor(background);
      g.fillOval(x, y, width, height);
      x += 10;
      y += 10;
      width -= 20;
      height -= 20;
    }
    /** end of drawSwirlPattern method **/
  }

  public static void drawMountain(Graphics g, Color background, Color lines) {
    // draw mountain outline
    int[] xPoints = new int[] {-2, 133, 284, 393, 598, 696, 775, 958, 1083};
    int[] yPoints = new int[] {516, 425, 328, 214, 297, 406, 388, 455, 540};
    int[] width = new int[] {213, 239, 187, 272, 170, 118, 234, 187, 223};
    int[] height = new int[] {125, 152, 195, 213, 213, 106, 197, 195, 152};
    g.setColor(lines);
    for (int i = 0; i < xPoints.length; i++) {
      int x = xPoints[i];
      int y = yPoints[i];
      int w = width[i];
      int h = height[i];
      g.fillOval(x, y, w, h);
    }
    
    // draw mountain main color
    xPoints = new int[] {3, 138, 289, 398, 603, 701, 780, 963, 1088};
    yPoints = new int[] {521, 430, 333, 219, 302, 411, 393, 460, 545};
    width = new int[] {203, 229, 177, 262, 160, 108, 224, 177, 213};
    height = new int[] {115, 142, 185, 203, 203, 96, 187, 185, 142};
    g.setColor(background);
    for (int i = 0; i < xPoints.length; i++) {
      int x = xPoints[i];
      int y = yPoints[i];
      int w = width[i];
      int h = height[i];
      g.fillOval(x, y, w, h);
    }

    // fill in what circles did not cover
    xPoints = new int[] {0, 448, 631, 1288, 1288, 0};
    yPoints = new int[] {579, 384, 361, 628, 828, 828};
    g.fillPolygon(xPoints, yPoints, 6);
    
    /** end of drawMountain method **/
  }

  public static void drawTrees(Graphics g, Color main) {
    g.setColor(main);
    int x = 525;
    int y = 285;
    int[][] Points = calculateNextTreePlacement(x, y);
    System.out.println(Arrays.deepToString(Points));
    int[] x1Points = Points[0];
    int[] y1Points = Points[1];
    int[] x2Points = Points[2];
    int[] y2Points = Points[3];
    
    for (int i = 0; i < x1Points.length; i++) {
      int x1 = x1Points[i];
      int y1 = y1Points[i];
      int x2 = x2Points[i];
      int y2 = y2Points[i];
      g.drawLine(x1, y1, x2, y2);
    }

    /*
     {525, 525, 525, 525, 525, 525, 525}; // tree trunk
     {285, 285, 285, 295, 295, 305, 305}; // starting point of branches
     {525, 515, 535, 515, 535, 515, 535}; // x-axis end of branches
     {325, 295, 295, 305, 305, 315, 315}; // y-axis end of branches    */

    
    // coordinate starting point for next tree
    /*x = 0;
    y = 580;
    
    calculateNextTreePlacement(x, y);
    for (int i = 0; i < Points[0].length; i++) {
      int x1 = x1Points[i];
      int y1 = y1Points[i];
      int x2 = x2Points[i];
      int y2 = y2Points[i];
      g.drawLine(x1, y1, x2, y2);
    }*/
    /** end of drawTrees method **/
  }
  
  public static int[][] calculateNextTreePlacement(int x, int y) {
    int[][] Points = new int[4][7];

    for (int i = 0; i < Points.length; i++) {
      // fills values for x1Points
      if (Points[i] = [0]) {
        for (int j = 0; j < Points[0].length; j++) {
          Points[0][j] = x;
        }  
      }
      
      // fills values for y1Points
      if (i == 1) {
        for (int j = 0; j < Points[i].length; j++) {
          if (Points[i][j] == 0 || Points[i][j] == 1 || Points[i][j] == 2) {
            Points[i][j] = y;
          }
          else if (Points[i][j] == 3 ||Points[i][j] == 4) {
            Points[i][j] = y + 10;
          }
          else if (Points[i][j] == 5 || Points[i][j] == 6) {
            Points[i][j] = y + 20;
          }
        }
      }

      // fills values for x2Points
      if (i == 2) {
        for (int j = 0; j < Points[2].length; j++) {
          if (Points[2][j] == 0) {
            Points[2][j] = x;
          }
          else if (Points[2][j] % 2 != 0) {
            Points[2][j] = x -10;
          }
          else if (Points[2][j] % 2 == 0) {
            Points[2][j] = x + 10;
          }
        }
      }

      // fills values for y2Points
      if (i == 3) {
        for (int j = 0; j < Points[3].length; j++) {
          if (Points[3][j] == 0) {
            Points[3][j] = y + 40;
          }
          else
            Points[3][j] = y + 10;
          }
        }
    }

    return Points;
    
    /** end of calculateNextTreePlacement method **/
  }
}


