void setup()
{
	size(1000,800);
}
void draw()
{
	background(0,30);
  ellipse(mouseX,mouseY,50,50);
  bezier(0, 0, .75*mouseX, .75*mouseY, 1.5*mouseX, 1.5*mouseY, 1000, 800);
}

