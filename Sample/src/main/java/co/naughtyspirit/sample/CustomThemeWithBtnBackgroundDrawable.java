package co.naughtyspirit.sample;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import co.naughtyspirit.showcaseview.ShowcaseView;
import co.naughtyspirit.showcaseview.targets.TargetView;
import co.naughtyspirit.showcaseview.utils.PositionsUtil;

/**
 * Created by kevintanhongann on 5/21/15.
 */
public class CustomThemeWithBtnBackgroundDrawable extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_btn_background);

        Button button = (Button) findViewById(R.id.button);

        TargetView targetView = new TargetView(button, TargetView.ShowcaseType.CIRCLE);

        ShowcaseView showcaseView = new ShowcaseView.Builder(this, "showcaseView")
                .setDescription(" ", PositionsUtil.ItemPosition.CENTER)
                .setTarget(targetView)
                .setButton("Okay", PositionsUtil.ItemPosition.BOTTOM_CENTER).setCustomTheme(R.style.CustomShowcaseBackgroundDrawable).build();
    }
}
