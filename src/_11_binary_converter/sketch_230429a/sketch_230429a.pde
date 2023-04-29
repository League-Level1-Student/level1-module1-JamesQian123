  int x = 200;
  int y = 400;
    int birdYVelocity = -10;
    int gravity = 1;
    int pipeX = 800;
    int pipeHeight = (int) random(100, 400);
    int pipeGap = 100;
    int lowerY = pipeHeight + pipeGap;
    int lowerPipeHeight = 600 - lowerY;
    
    public void settings() {
        size(800, 600);
    }

  
    public void setup() {
        size(800,600);
        
    }

    
    public void draw() {
      
      background(44, 171, 245);
      fill(245, 222, 44);
      stroke(0,0,0);
      ellipse(x, y, 50, 50);
      birdYVelocity += gravity;
      y += birdYVelocity;
      fill(46, 140, 27);
      rect(pipeX,0, 100,pipeHeight);
      pipeX -= 10;
      teleportPipe();
      fill(46, 140, 27);
      rect(pipeX,lowerY, 100,lowerPipeHeight);
      teleportPipe();
      if(intersectsPipes()) {
        System.exit(0);
      }
    }
    public void mousePressed() {
      birdYVelocity = -10;
    }
    public void teleportPipe() {
      if(pipeX <= -100) {
        pipeX = 800;
         pipeHeight = (int) random(100, 400);
         lowerY = pipeHeight + pipeGap;
         lowerPipeHeight = 600 - lowerY;

      }
      
    }
    boolean intersectsPipes() { 
        if (y < pipeHeight && x > pipeX && x < (pipeX+100)){
           return true; }
       else if (y>lowerPipeHeight && x > pipeX && x < (pipeX+100)) {
           return true; }
       else { return false; }
}
