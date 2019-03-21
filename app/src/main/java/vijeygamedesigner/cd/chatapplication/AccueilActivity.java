package vijeygamedesigner.cd.chatapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class AccueilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*** Creation d'une icone dans ActionBAr ***/
        ActionBar actionBar = getSupportActionBar();
        actionBar.setLogo(R.mipmap.ic_oiseau);
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);

        /*** Creation d'un bouton retour " <- " dans ActionBAr ***/
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        /*** Action sur le bouton fab ***/
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Successfully operation", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                startActivity(new Intent(AccueilActivity.this, MainActivity.class));
            }
        });
    }

}
