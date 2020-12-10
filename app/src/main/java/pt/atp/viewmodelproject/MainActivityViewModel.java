package pt.atp.viewmodelproject;

import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {

    private int score = 0;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score += 1;
    }


}
