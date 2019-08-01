PImage catPic;
void setup(){
size(500, 500);
catPic = loadImage("image1.png");
                catPic.resize(500, 500);
}
void draw(){

background(catPic);
   if(mousePressed){
println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");}

}
