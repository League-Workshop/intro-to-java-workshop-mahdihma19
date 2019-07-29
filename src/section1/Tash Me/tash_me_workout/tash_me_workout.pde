PImage mustache;
PImage friend;
void setup(){
size(800, 600);
friend = loadImage("friend.jpg");
friend.resize(width,height);
mustache = loadImage("facial hair.png");
}
void draw(){
background(friend);

if(mousePressed){
background(friend);
image(mustache, mouseX, mouseY);
}
}
