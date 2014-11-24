/**
 * Draws a house
 * 
 * @author (Josh Ross) 
 * @version (2014-10-10)
 */
public class House
{
    public House()
    {
       Square back = new Square();
       back.changeColor("black");
       back.moveVertical(-50);
       back.moveHorizontal(-100);
       back.changeSize(10000);
       back.makeVisible();
       
       Square main_house = new Square(); 
       main_house.changeColor("blue");
       main_house.moveHorizontal(50);
       main_house.moveVertical(65);
       main_house.changeSize(100);
       main_house.makeVisible();
       
       Triangle roof = new Triangle();
       roof.moveHorizontal(110);
       roof.moveVertical(50);
       roof.changeColor("red");
       roof.changeSize(50,100);
       roof.makeVisible();
       
       Square door = new Square();
       door.changeColor("magenta");
       door.moveHorizontal(80);
       door.moveVertical(130);
       door.changeSize(35);
       door.makeVisible();
       
       Circle knob = new Circle();
       knob.changeColor("black");
       knob.moveHorizontal(123);
       knob.moveVertical(133);
       knob.changeSize(9);
       knob.makeVisible();
       
       Square pane = new Square();
       pane.changeColor("green");
       pane.moveHorizontal(60);
       pane.moveVertical(80);
       pane.makeVisible();
       
       Square window_tl = new Square();
       window_tl.changeColor("black");
       window_tl.moveHorizontal(60);
       window_tl.moveVertical(80);
       window_tl.changeSize(11);
       window_tl.makeVisible();
       
       Square window_tr = new Square();
       window_tr.changeColor("black");
       window_tr.moveHorizontal(79);
       window_tr.moveVertical(80);
       window_tr.changeSize(11);
       window_tr.makeVisible();
       
       Square window_bl = new Square();
       window_bl.changeColor("black");
       window_bl.moveHorizontal(60);
       window_bl.moveVertical(99);
       window_bl.changeSize(11);
       window_bl.makeVisible();
       
       Square window_br = new Square();
       window_br.changeColor("black");
       window_br.moveHorizontal(79);
       window_br.moveVertical(99);
       window_br.changeSize(11);
       window_br.makeVisible();
       
       Circle sun = new Circle();
       sun.changeColor("yellow");
       sun.moveVertical(-40);
       sun.makeVisible();
       
       Circle moon = new Circle();
       moon.changeColor("white");
       moon.moveVertical(-40);
       moon.moveHorizontal(50);
       moon.makeVisible();
       
       Circle moon_cover = new Circle();
       moon_cover.changeColor("black");
       moon_cover.moveVertical(-40);
       moon_cover.moveHorizontal(57);
       moon_cover.makeVisible();
    }
}

