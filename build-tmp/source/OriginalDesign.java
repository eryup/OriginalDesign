import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {

public void setup()
{
	size(startX,startY);
}
int startX = 1000;
int startY = 800;
int multiplierInt = 2;
int orth = 300;
int colorX = 25;
int colorY = 139;
int colorZ = 2;
//boolean swap = false;
//float square = sq(multiplierInt);
float multiplier1 = multiplierInt/4;
//float multiplier1 = multiplierInt/4;
public void draw()
{
design();
}
public void mousePressed ()
{
	colorSwap ();
	//swap=true;
}

public void design ()
{
	//background(0,30,30);
	//fill(180,121,239);
  //ellipse(mouseX,mouseY,50,50);
  fill(colorX,colorY,colorZ);
  bezier(0, 0, multiplier1*(mouseX), mouseY, multiplierInt*(mouseX), mouseY, startX, startY);
  bezier(startX, 0, multiplier1*mouseX, mouseY, multiplierInt*mouseX, mouseY, 0, startY);
  bezier ((startX/2), 0, (mouseX-orth),startY/4,mouseX+orth,3*startY/4,startX/2,startY);
  bezier(0, startY/2, startX/4, mouseY+orth, 3*startX/4, mouseY-orth, startX, startY/2);
  fill(0,30,30,30);
  rect(0, 0, startX, startY);
  //bezier(0, 0, 100, 100, -600, -800, 600, 800);
}
public void colorSwap ()
{
 colorX=(int)(Math.random()*255);
 colorY=(int)(Math.random()*255);
 colorZ=(int)(Math.random()*255);
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
