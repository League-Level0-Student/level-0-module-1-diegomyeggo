void setup() {
 PImage face = loadImage("hypebeast21.jpeg");
size(300,300);
image(face, 0, 0);} 
void draw() {
fill(mouseX,mouseY,mouseY);
ellipse(123,70,15,15);
ellipse(157,68,15,15);
fill(0,0,0);
ellipse(123,70,10,10);
ellipse(157,68,10,10);
}