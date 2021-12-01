/*
 * By Tiffin Filion CSCI142 6915 - F21 - Obj-Orent Prog I with Java Art Contest Submission Mountain
 * with clouds and starry night sky
 */

import java.awt.Color;
import java.awt.Graphics;

public class Main {

  public static void main(String[] args) {

    // Setup canvas and paintbrush
    DrawingPanel panel = new DrawingPanel(1288, 728);
    Graphics g = panel.getGraphics();

    // Set canvas main background color
    panel.setBackground(Color.BLACK);

    // color variables
    Color white = new Color(255, 255, 255);
    Color darkBlue = new Color(48, 43, 145);
    Color medBlue = new Color(90, 176, 255);
    Color lightBlue = new Color(162, 211, 241);
    Color teal = new Color(92, 214, 214);
    Color medLavender = new Color(145, 165, 218);
    Color lightLavender = new Color(236, 239, 249);

    // Draw stars
    drawStars(g, white);
    // Draw striped cloud
    drawStripedCloud(g, lightLavender, white);
    // Draw four dotted clouds
    drawDottedClouds(g, white, teal);
    // Draw six lined clouds plus water rectangles
    drawLineClouds(g, lightBlue, medBlue);
    // Draw two swirl clouds
    drawSwirlClouds(g, medLavender, white);
    // Draw swirl patterns
    drawPatterns(g, medLavender, white);
    // Draw mountain
    drawMountain(g, darkBlue, medBlue);
    // Draw trees
    drawTrees(g, medBlue);

    /** end of main method **/
  }

  public static void drawStars(Graphics g, Color main) {

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
  }

  public static void drawStripedCloud(Graphics g, Color background, Color lines) {
    int x = 849;
    int y = 37;
    int width = 217;
    int height = width;

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
  }

  public static void drawDottedClouds(Graphics g, Color background, Color lines) {

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
  }

  public static void drawDotCloud(Graphics g, int x, int y, int width, int height, Color background,
      Color lines) {
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
  }

  public static void drawLineClouds(Graphics g, Color background, Color lines) {

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
  }

  public static void drawLCloud(Graphics g, int x, int y, int width, int height, Color background,
      Color lines) {
    for (int i = 0; i < 5; i++) {
      // lines 5 pixels wide
      g.setColor(lines);
      g.fillOval(x, y, width, height);

      x += 5;
      y += 5;
      width -= 10;
      height = width;

      // background 30 pixels wide
      g.setColor(background);
      g.fillOval(x, y, width, height);

      x += 20;
      y += 20;
      width -= 40;
      height = width;
    }
  }

  public static void drawRectangle(Graphics g, int x, int y, int width, int height, int arcWidth,
      int arcHeight, Color background, Color lines) {
    g.setColor(lines);
    g.fillRoundRect(x, y, width, height, arcWidth, arcHeight);

    y += 5;
    x += 5;
    width -= 10;
    height -= 10;
    g.setColor(background);
    g.fillRoundRect(x, y, width, height, arcWidth, arcHeight);

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
    // full-size pattern sets
    drawSwirlPattern(g, background, lines, -18, 380, 96, 4);
    drawSwirlPattern(g, background, lines, 86, 405, 96, 4);

    drawSwirlPattern(g, background, lines, 735, 385, 96, 4);
    drawSwirlPattern(g, background, lines, 840, 395, 96, 4);

    drawSwirlPattern(g, background, lines, 754, 281, 96, 4);
    drawSwirlPattern(g, background, lines, 874, 300, 96, 4);

    drawSwirlPattern(g, background, lines, 969, 242, 96, 4);
    drawSwirlPattern(g, background, lines, 1084, 280, 96, 4);

    drawSwirlPattern(g, background, lines, 955, 350, 96, 4);
    drawSwirlPattern(g, background, lines, 1060, 375, 96, 4);

    // full-size singles
    drawSwirlPattern(g, background, lines, 1150, 475, 96, 4);
    drawSwirlPattern(g, background, lines, 1190, 360, 96, 4);
    drawSwirlPattern(g, background, lines, 1177, 212, 96, 4);

    // half-size pattern sets
    drawSwirlPattern(g, background, lines, 0, 505, 50, 2);
    drawSwirlPattern(g, background, lines, 50, 475, 50, 2);

    drawSwirlPattern(g, background, lines, 1110, 470, 50, 2);
    drawSwirlPattern(g, background, lines, 1150, 430, 50, 2);

    drawSwirlPattern(g, background, lines, 1170, 330, 50, 2);
    drawSwirlPattern(g, background, lines, 1220, 305, 50, 2);

    drawSwirlPattern(g, background, lines, 1250, 505, 50, 2);
    drawSwirlPattern(g, background, lines, 1230, 455, 50, 2);

    // half-size singles
    drawSwirlPattern(g, background, lines, 120, 500, 50, 2);
    drawSwirlPattern(g, background, lines, 720, 350, 50, 2);
    drawSwirlPattern(g, background, lines, 850, 270, 50, 2);
    drawSwirlPattern(g, background, lines, 1050, 230, 50, 2);
    drawSwirlPattern(g, background, lines, 1040, 335, 50, 2);

    // small circles
    drawSwirlPattern(g, background, lines, 76, 395, 25, 1);
    drawSwirlPattern(g, background, lines, 175, 486, 30, 1);
    drawSwirlPattern(g, background, lines, 183, 451, 25, 1);
    drawSwirlPattern(g, background, lines, 175, 416, 20, 1);
    drawSwirlPattern(g, background, lines, 153, 391, 15, 1);
    drawSwirlPattern(g, background, lines, 0, 476, 20, 1);
    drawSwirlPattern(g, background, lines, 822, 375, 30, 1);
    drawSwirlPattern(g, background, lines, 850, 350, 30, 1);
    drawSwirlPattern(g, background, lines, 830, 480, 30, 1);
    drawSwirlPattern(g, background, lines, 850, 325, 20, 1);
    drawSwirlPattern(g, background, lines, 830, 270, 20, 1);
    drawSwirlPattern(g, background, lines, 2, 364, 20, 1);
    drawSwirlPattern(g, background, lines, 110, 390, 20, 1);
    drawSwirlPattern(g, background, lines, 942, 290, 20, 1);
    drawSwirlPattern(g, background, lines, 1104, 248, 20, 1);
    drawSwirlPattern(g, background, lines, 1071, 286, 20, 1);
    drawSwirlPattern(g, background, lines, 971, 332, 20, 1);
    drawSwirlPattern(g, background, lines, 825, 460, 20, 1);
    drawSwirlPattern(g, background, lines, 1031, 438, 30, 1);
    drawSwirlPattern(g, background, lines, 1152, 376, 30, 1);
    drawSwirlPattern(g, background, lines, 1239, 554, 30, 1);
    drawSwirlPattern(g, background, lines, 1151, 240, 25, 1);
    drawSwirlPattern(g, background, lines, 1262, 205, 25, 1);
    drawSwirlPattern(g, background, lines, 1271, 244, 20, 1);
    drawSwirlPattern(g, background, lines, 1268, 286, 15, 1);
    drawSwirlPattern(g, background, lines, 1198, 307, 15, 1);
    drawSwirlPattern(g, background, lines, 900, 280, 15, 1);
    drawSwirlPattern(g, background, lines, 1129, 259, 15, 1);
    drawSwirlPattern(g, background, lines, 1022, 340, 15, 1);
    drawSwirlPattern(g, background, lines, 1062, 315, 15, 1);
    drawSwirlPattern(g, background, lines, 939, 433, 20, 1);
    drawSwirlPattern(g, background, lines, 1195, 205, 15, 1);
    drawSwirlPattern(g, background, lines, 1170, 217, 20, 1);
    drawSwirlPattern(g, background, lines, 1234, 196, 20, 1);
    drawSwirlPattern(g, background, lines, 1267, 351, 20, 1);
    drawSwirlPattern(g, background, lines, 1206, 455, 20, 1);
    drawSwirlPattern(g, background, lines, 1097, 272, 15, 1);
    drawSwirlPattern(g, background, lines, 1010, 448, 15, 1);
    drawSwirlPattern(g, background, lines, 803, 480, 20, 1);
    drawSwirlPattern(g, background, lines, 863, 488, 15, 1);
    drawSwirlPattern(g, background, lines, 855, 383, 15, 1);
    drawSwirlPattern(g, background, lines, 1215, 572, 20, 1);
    drawSwirlPattern(g, background, lines, 1168, 410, 15, 1);
    drawSwirlPattern(g, background, lines, 927, 399, 25, 1);
    drawSwirlPattern(g, background, lines, 1155, 272, 25, 1);
  }

  public static void drawSwirlPattern(Graphics g, Color background, Color lines, int x, int y,
      int width, int repeat) {

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
  }

  public static void drawMountain(Graphics g, Color background, Color lines) {
    g.setColor(lines);
    mountainOvals(g, -2, 516, 213, 125);
    mountainOvals(g, 1083, 540, 223, 152);
    mountainOvals(g, 133, 425, 239, 152);
    mountainOvals(g, 958, 455, 187, 195);
    mountainOvals(g, 284, 328, 187, 195);
    mountainOvals(g, 696, 406, 118, 106);
    mountainOvals(g, 775, 388, 234, 197);
    mountainOvals(g, 598, 297, 170, 213);
    mountainOvals(g, 393, 214, 272, 213);

    g.setColor(background);
    mountainOvals(g, 398, 219, 262, 203);
    mountainOvals(g, 603, 302, 160, 203);
    mountainOvals(g, 780, 393, 224, 187);
    mountainOvals(g, 701, 411, 108, 96);
    mountainOvals(g, 289, 333, 177, 185);
    mountainOvals(g, 963, 460, 177, 185);
    mountainOvals(g, 138, 430, 229, 142);
    mountainOvals(g, 1088, 545, 213, 142);
    mountainOvals(g, 3, 521, 203, 115);

    int[] xPoints = {0, 448, 631, 1288, 1288, 0};
    int[] yPoints = {579, 384, 361, 628, 828, 828};
    g.fillPolygon(xPoints, yPoints, 6);
  }

  public static void mountainOvals(Graphics g, int x, int y, int width, int height) {
    g.fillOval(x, y, width, height);
  }

  public static void drawTrees(Graphics g, Color main) {
    g.setColor(main);
    tree(g);


  }

  public static void tree(Graphics g) {
    int x1 = 525;
    int y1 = 285;
    int x2 = 525;
    int y2 = 325;
    g.drawLine(x1, y1, x2, y2); // trunk

    x2 -= 10;
    y2 -= 30;
    g.drawLine(x1, y1, x2, y2); // top left

    x2 += 20;
    g.drawLine(x1, y1, x2, y2); // top right

    y1 += 10;
    x2 -= 20;
    y2 += 10;
    g.drawLine(x1, y1, x2, y2); // middle left

    x2 += 20;
    g.drawLine(x1, y1, x2, y2); // middle right

    y1 += 10;
    x2 -= 20;
    y2 += 10;
    g.drawLine(x1, y1, x2, y2); // bottom left

    x2 += 20;
    g.drawLine(x1, y1, x2, y2); // bottom right
  }
}

