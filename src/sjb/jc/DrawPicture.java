package sjb.jc;


public class DrawPicture {

    public DrawPicture() {

    }

    public void drawPic(String urlLocation, String save) {
        Circles.img = urlLocation;
        Circles.saveName = save;
        processing.core.PApplet sketch = new Circles();
        sketch.init();
        while (!sketch.finished) {

        }
        sketch.exit();
    }
}

