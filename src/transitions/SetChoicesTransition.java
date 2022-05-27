package transitions;

import javafx.animation.Transition;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

import Main.RPG;

public class SetChoicesTransition extends Transition{

    private int mode;
    private ImageView imageView;
    private int timer;

    public SetChoicesTransition(Duration duration, int mode, ImageView imageView) {
        setCycleDuration(duration);
        this.mode = mode;
        this.imageView = imageView;
    }

    @Override
    protected void interpolate(double arg0) {
        this.timer++;
        if(this.timer >= 25)
            if(this.mode == 0)
                imageView.setImage(RPG.player.getplayerImageStandByLeft());
            if(this.mode == 1)
                imageView.setImage(RPG.player.getplayerImageStandByRight());
    }
}