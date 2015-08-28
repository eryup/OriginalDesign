void setup()
{
	size(1000,800);
}
int startX = 1000;
int startY = 800;
int multiplierInt = 2;
int orth = 300;
int colorX = 25;
int colorY = 139;
int colorZ = 2;
float multiplier1 = multiplierInt/4;
void draw()
{
design();
}
void mousePressed ()
{
	colorSwap ();
}
void design ()
{
  fill(colorX,colorY,colorZ);
  bezier(0, 0, multiplier1*(mouseX), mouseY, multiplierInt*(mouseX), mouseY, startX, startY);
  bezier(startX, 0, multiplier1*mouseX, mouseY, multiplierInt*mouseX, mouseY, 0, startY);
  bezier ((startX/2), 0, (mouseX-orth),startY/4,mouseX+orth,3*startY/4,startX/2,startY);
  bezier(0, startY/2, startX/4, mouseY+orth, 3*startX/4, mouseY-orth, startX, startY/2);
  fill(0,130,130,30);
  rect(0, 0, startX, startY);
}
void colorSwap ()
{
 colorX=(int)(Math.random()*255);
 colorY=(int)(Math.random()*255);
 colorZ=(int)(Math.random()*255);
}
